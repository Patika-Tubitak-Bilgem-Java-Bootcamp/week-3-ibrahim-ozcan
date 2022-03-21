import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	String team1 = "GS";
	String team2 = "TS";
	String team3 = "BJK";
	String team4 = "FB";
	String team5 = "GB";
	String team6 = "BS";
    List<String> teams= new ArrayList<>();
    teams.add(team1);
    teams.add(team2);
    teams.add(team3);
    teams.add(team4);
    teams.add(team5);
    teams.add(team6);
    Fixture fix = new Fixture(teams);

        System.out.println(fix.createFixture());

    }
}
