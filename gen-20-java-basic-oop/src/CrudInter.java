import Tugas.Pojo.PojoData;
import java.util.Map;
import java.util.Scanner;

public interface CrudInter {
    void tamabahData (Scanner scanner, Map<String, PojoData> dataMap);

    void deleteData (Scanner scanner, Map<String, PojoData> dataMap) ;

    void tampilanData(Map<String, PojoData> dataMap);
    void updateData(Scanner scanner, Map<String, PojoData> dataMap);


}
