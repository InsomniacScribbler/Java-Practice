package FindMyTrain;

import java.util.ArrayList;
import java.util.List;

public class Train {
    private String trainID;
    private String trainName;
    private String type;
    private List <Station> stationList = new ArrayList<>();

    public Train(String trainID, String trainName, String type ,List<Station> stationList) {
        this.trainID = trainID;
        this.trainName = trainName;
        this.type = type;
        this.stationList = stationList;
    }



    public List<Station> getStationList() {
        return stationList;
    }

    public void setStationList(List<Station> stationList) {
        this.stationList = stationList;
    }

    public String getTrainID() {
        return trainID;
    }

    public void setTrainID(String trainID) {
        this.trainID = trainID;
    }

    public String getTrainName() {
        return trainName;
    }

    public void setTrainName(String trainName) {
        this.trainName = trainName;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Train{" +
                "trainID='" + trainID + '\'' +
                ", trainName='" + trainName + '\'' +
                ", type='" + type + '\'' +
                ", stationList=" + stationList +
                '}';
    }
}
