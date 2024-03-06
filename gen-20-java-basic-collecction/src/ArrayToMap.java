import java.util.*;

public class ArrayToMap {
    public static void main(String[] args) {
        // Membuat ArrayList untuk menyimpan input dari penguna
        List<String> daftarInput = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        // Meminta pengguna untuk memasukkan data (misalnya: nama dan id)
        System.out.println("Masukkan data (misalnya: nama id), ketik selesai untuk mengakhiri:");
        String inputData = scanner.nextLine();
        while (!inputData.equalsIgnoreCase("selesai")) {
            daftarInput.add(inputData);
            inputData = scanner.nextLine();
        }


        try {
            // Mengonversi ArrayList ke Map
            Map<String, String> hasilMap = convertToMap(daftarInput);

            // Menampilkan hasil konversi
            System.out.println("\nHasil konversi ke Map:");
            for (Map.Entry<String, String> entry : hasilMap.entrySet()) {
                System.out.println("Nama Pengguna: " + entry.getKey() + ", id: " + entry.getValue());
            }
        } catch (IllegalArgumentException e) {
            System.err.println("Terjadi kesalahan: " + e.getMessage());
        }
    }

    //  ArrayList ke Map
    private static Map<String, String> convertToMap(List<String> inputList) throws IllegalArgumentException {
        Map<String, String> hasilMap = new HashMap<>();

        for (String input : inputList) {
            String[] parts = input.split(" ");
            //jika format tidak sesuai
            if (parts.length != 2) {
                throw new IllegalArgumentException("Format input tidak sesuai: " + input);
            }
            // Menyimpan dalam Map (nama sebagai key, id sebagai value)
            hasilMap.put(parts[0], parts[1]);
        }
        return hasilMap;
    }
}
