public class Main {

    public static void main(String[] args) {

        MissionDirector director = new MissionDirector();

        SpaceMission marsMission = director.buildMarsMission();
        SpaceMission moonMission = director.buildMoonMission();

        System.out.println("=== MARS MISSION ===");
        marsMission.showMission();

        System.out.println();

        System.out.println("=== MOON MISSION ===");
        moonMission.showMission();
    }
}