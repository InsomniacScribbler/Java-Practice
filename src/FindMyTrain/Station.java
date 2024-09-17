package FindMyTrain;

import java.util.ArrayList;
import java.util.List;

public class Station {
    //private String stationName;
    private String stationId;
    private String stationNumber;
    private List<Platform> platformList; //platform jaruri nhi h avaialable ho

    public Station(String stationId, String stationNumber) {
        this.stationId = stationId;
        this.stationNumber = stationNumber;
        this.platformList = new ArrayList<>();
    }

    public String getStationId() {
        return stationId;
    }

    public void setStationId(String stationId) {
        this.stationId = stationId;
    }

    public String getStationNumber() {
        return stationNumber;
    }

    public void setStationNumber(String stationNumber) {
        this.stationNumber = stationNumber;
    }

    public List<Platform> getPlatformList() {
        return platformList;
    }

    public void setPlatformList(List<Platform> platformList) {
        this.platformList = platformList;
    }

    @Override
    public String toString() {
        return "Station{" +
                "stationId='" + stationId + '\'' +
                ", stationNumber='" + stationNumber + '\'' +
                ", platformList=" + platformList +
                '}';
    }
}
