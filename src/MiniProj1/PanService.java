package MiniProj1;

import java.util.HashMap;
import java.util.Map;

public class PanService {
    private /*static*/ Map<String, Pan> panMap = new HashMap<>();
//    static {
//        panMap.put("QEPPS2501B",new Pan("QEPPS2501B","1234543211","HDFC","STOCK,ELSS,FD"));
//        panMap.put("QEPPS2502B",new Pan("QEPPS2502B","1234543212","SBI","STOCK,ELSS,PF"));
//    }
//    public Pan getPanByAadhaarNumber(String aadhaarNum){
//        for(Pan pan : panMap.values()){
//            if(pan.getAadhaarNum().equals(aadhaarNum)){
//                return pan;
//            }
//        }
//        return null;
//    }
    public PanService() {
        initializePanMap();
    }

    private void initializePanMap() {
        panMap.put("QEPPS2501B", new Pan("QEPPS2501B", "1234543211", "HDFC", "STOCK,ELSS,FD"));
        panMap.put("QEPPS2502B", new Pan("QEPPS2502B", "1234543212", "SBI", "STOCK,ELSS,PF"));
    }

    public Pan getPanByAadhaarNumber(String aadhaarNum) {
        for (Pan pan : panMap.values()) {
            if (pan.getAadhaarNum().equals(aadhaarNum)) {
                return pan;
            }
        }
        return null;
    }
}
