package FindMyTrain;

import java.time.LocalDateTime;

public class Schedule {
    private Train train;
    private Station srcstation;
    private Station endstation;
    private String arivalTime;
    private String departureTime;
    private Platform platform;

    public Schedule(Train train, Station srcstation, Station endstation, String arivalTime, String departureTime, Platform platform) {
        this.train = train;
        this.srcstation = srcstation;
        this.endstation = endstation;
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

    public Station getSrcstation() {
        return srcstation;
    }

    public void setSrcstation(Station srcstation) {
        this.srcstation = srcstation;
    }

    public Station getEndstation() {
        return endstation;
    }

    public void setEndstation(Station endstation) {
        this.endstation = endstation;
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
                ", srcstation=" + srcstation +
                ", endstation=" + endstation +
                ", arivalTime='" + arivalTime + '\'' +
                ", departureTime='" + departureTime + '\'' +
                ", platform=" + platform +
                '}';
    }
}
