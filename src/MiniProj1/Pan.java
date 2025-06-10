package MiniProj1;

public class Pan {
    private String panNum;
    private String aadhaarNum;
    private String bankDetails;
    private String investment;

    public Pan(String panNum, String aadhaarNum, String bankDetails, String investment) {
        this.panNum = panNum;
        this.aadhaarNum = aadhaarNum;
        this.bankDetails = bankDetails;
        this.investment = investment;
    }

    public String getPanNum() {
        return panNum;
    }

    public void setPanNum(String panNum) {
        this.panNum = panNum;
    }

    public String getAadhaarNum() {
        return aadhaarNum;
    }

    public void setAadhaarNum(String aadhaarNum) {
        this.aadhaarNum = aadhaarNum;
    }

    public String getBankDetails() {
        return bankDetails;
    }

    public void setBankDetails(String bankDetails) {
        this.bankDetails = bankDetails;
    }

    public String getInvestment() {
        return investment;
    }

    public void setInvestment(String investment) {
        this.investment = investment;
    }

    @Override
    public String toString() {
        return "PanDetails :{" +
                "panNum='" + panNum + '\'' +
                ", aadhaarNum='" + aadhaarNum + '\'' +
                ", bankDetails='" + bankDetails + '\'' +
                ", investment='" + investment + '\'' +
                '}';
    }
}
