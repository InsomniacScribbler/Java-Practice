package FindMyTrain;

import java.time.LocalDateTime;

public class Schedule {
    private Train train;
    private Station station;
    private String arivalTime;
    private String departureTime;
    private Platform platform;

    public Schedule(Train train, Station station, String arivalTime, String departureTime, Platform platform) {
        this.train = train;
        this.station = station;
        this.arivalTime = arivalTime;
        this.departureTime = departureTime;
        this.platform = platform;
    }

    public Train getTrain() {
        return train;
    }

    public void setTrain(Train train) {
        this.train = train;
    }

    public Station getStation() {
        return station;
    }

    public void setStation(Station station) {
        this.station = station;
    }

    public String getArivalTime() {
        return arivalTime;
    }

    public void setArivalTime(String arivalTime) {
        this.arivalTime = arivalTime;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(String departureTime) {
        this.departureTime = departureTime;
    }

    public Platform getPlatform() {
        return platform;
    }

    public void setPlatform(Platform platform) {
        this.platform = platform;
    }

    @Override
    public String toString() {
        return "Schedule{" +
                "train=" + train +
                ", station=" + station +
                ", arivalTime=" + arivalTime +
                ", departureTime=" + departureTime +
                ", platform=" + platform +
                '}';
    }
}
