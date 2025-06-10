package MiniProj1;

import java.util.HashMap;
import java.util.Map;

public class AadhaarService {
    private static Map<String, Aadhaar> aadhaarMap = new HashMap<>();
    static{
        aadhaarMap.put("1234543211",new Aadhaar("1234543211","Nikhil","Niteshwar","Cuttack"));
        aadhaarMap.put("1234543212",new Aadhaar("1234543212","Anubhav","AnubhavPapa","Jammu"));
    }
    public Aadhaar getAadhaarByNumber(String aadhaarNumber){
        return aadhaarMap.get(aadhaarNumber);
    }
}
