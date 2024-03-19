package Interface;

import Pojo.PojoData;

import java.util.Map;

public interface InterfaceCrud {
    void addData(Map<String, PojoData> mapData);
    void delData(Map<String, PojoData>mapData);
    void printData(Map<String, PojoData>mapData);
    void updateData(Map<String, PojoData>mapData);

}
