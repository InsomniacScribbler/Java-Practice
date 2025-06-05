package MiniProj1;

public class Aadhaar {
    private String aadhaarNum;
    private String name;
    private String FatherName;
    private String Address;

    public Aadhaar(String aadhaarNum, String name, String fatherName, String address) {
        this.aadhaarNum = aadhaarNum;
        this.name = name;
        this.FatherName = fatherName;
        this.Address = address;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getFatherName() {
        return FatherName;
    }

    public void setFatherName(String fatherName) {
        FatherName = fatherName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAadhaarNum() {
        return aadhaarNum;
    }

    public void setAadhaarNum(String aadhaarNum) {
        this.aadhaarNum = aadhaarNum;
    }

    @Override
    public String toString() {
        return "AadhaarDetails :{" +
                "aadhaarNum='" + aadhaarNum + '\'' +
                ", name='" + name + '\'' +
                ", FatherName='" + FatherName + '\'' +
                ", Address='" + Address + '\'' +
                '}';
    }
}
