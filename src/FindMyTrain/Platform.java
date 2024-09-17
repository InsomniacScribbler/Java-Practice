package FindMyTrain;

public class Platform {
    private int platformNumber;
    private Train train;
    //platform pr hamesha train nhi rehti

    public Platform(int platformNumber) {
        this.platformNumber = platformNumber;
    }

    public int getPlatformNumber() {
        return platformNumber;
    }

    public void setPlatformNumber(int platformNumber) {
        this.platformNumber = platformNumber;
    }

    public Train getTrain() {
        return train;
    }

    public void setTrain(Train train) {
        this.train = train;
    }

    @Override
    public String toString() {
        return "Platform{" +
                "train=" + train +
                ", platformNumber=" + platformNumber +
                '}';
    }
}
