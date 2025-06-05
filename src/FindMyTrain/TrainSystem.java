package FindMyTrain;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TrainSystem {
    private Map<String,Station> stations = new HashMap<>();
    private Map<String, Train> trains = new HashMap<>();
    private List<Schedule> schedules = new ArrayList<>();


    public void addStations(Station station){
        stations.put(station.getStationId(), station);

    }public void addTrains(Train train){
        trains.put(train.getTrainID(), train);

    }
    public void addSchedule(Schedule schedule){
        schedules.add(schedule);
    }
    public List<Schedule> findMyTrains(String startstationId, String endstationId){
        List<Schedule> res = new ArrayList<>();
        for(Schedule schedule : schedules){
            if (schedule.getSrcstation().getStationId().equals(startstationId)
                    && schedule.getEndstation().getStationId().equals(endstationId))
            {
                res.add(schedule);
            }
        }
        return res;
    }
}
