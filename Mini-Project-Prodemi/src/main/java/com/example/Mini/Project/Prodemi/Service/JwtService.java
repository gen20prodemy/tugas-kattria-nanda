package com.example.Mini.Project.Prodemi.Service;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.security.Keys;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;

import javax.crypto.SecretKey;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

@Service
public class JwtService {
    private static final SecretKey key = Keys.secretKeyFor(SignatureAlgorithm.HS256);

    private Claims extractedAllClaims (String token){
        return Jwts.parserBuilder()
                .setSigningKey(key)
                .build()
                .parseClaimsJws(token)
                .getBody();
    }

    public <T> T extractClaim (String token, Function<Claims, T> claimsResolver){
        final Claims claims = extractedAllClaims (token);
        return claimsResolver.apply(claims);
    }
    public String extractUserName (String token) {
        return extractClaim (token, Claims::getSubject);
    }

    public String generateToken (UserDetails userDetails){
        return generateToken(new HashMap<>(), userDetails);
    }

    public String generateToken(
            Map<String, Object> extraClaims,
            UserDetails userDetails
    ) {
        return Jwts
                .builder()
                .setClaims(extraClaims)
                .setSubject(userDetails.getUsername())
                .setIssuedAt(new Date(System.currentTimeMillis()))
                .setExpiration(new Date(System.currentTimeMillis()+1000*60*24))
                .signWith(key)
                .compact();
    }
    private Date extractExpiration (String token){
        return extractClaim(token, Claims::getExpiration);
    }

    public  boolean isTokenValid (String token, UserDetails userDetails){
        final  String userName = extractUserName(token);
        return (userName.equals(userDetails.getUsername()))&& !isTokenExpired(token);
    }
    private boolean isTokenExpired (String token){
        return  extractExpiration (token).before(new Date());
    }
}
