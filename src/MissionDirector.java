public class MissionDirector {

    public SpaceMission buildMarsMission() {
        return new SpaceMissionBuilder()
                .setMissionName("Mars Explorer")
                .setDestination("Mars")
                .setRocket("Heavy Rocket")
                .setCrewSize(4)
                .build();

    public SpaceMission buildMoonMission() {
        return new SpaceMissionBuilder()
                .setMissionName("Moon Explorer")
                .setDestination("Moon")
                .setRocket("Medium Rocket")
                .setCrewSize(2)
                .build();
    }
}