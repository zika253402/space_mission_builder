public class SpaceMission {

    private String missionName;
    private String destination;
    private String rocket;
    private int crewSize;

    public SpaceMission(String missionName, String destination,
                        String rocket, int crewSize) {
        this.missionName = missionName;
        this.destination = destination;
        this.rocket = rocket;
        this.crewSize = crewSize;
    }

    public void showMission() {
        System.out.println("Mission: " + missionName);
        System.out.println("Destination: " + destination);
        System.out.println("Rocket: " + rocket);
        System.out.println("Crew: " + crewSize);
    }
}