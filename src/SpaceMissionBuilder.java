public class SpaceMissionBuilder {

    private String missionName;
    private String destination;
    private String rocket;
    private int crewSize;

    public SpaceMissionBuilder setMissionName(String missionName) {
        this.missionName = missionName;
        return this;
    }

    public SpaceMissionBuilder setDestination(String destination) {
        this.destination = destination;
        return this;
    }

    public SpaceMissionBuilder setRocket(String rocket) {
        this.rocket = rocket;
        return this;
    }

    public SpaceMissionBuilder setCrewSize(int crewSize) {
        this.crewSize = crewSize;
        return this;
    }

    public SpaceMission build() {
        if (missionName == null || destination == null) {
            throw new IllegalArgumentException(
                    "Mission name and destination are required."
            );
        }

        if (crewSize < 0) {
            throw new IllegalArgumentException(
                    "Crew size cannot be negative."
            );
        }

        return new SpaceMission(
                missionName,
                destination,
                rocket,
                crewSize
        );
    }
}