import java.util.*;

public class Fixture {
    private List<String> teams;
    private List<Boolean> isHome;

    public Fixture(List<String> teams) {
        this.teams = new ArrayList<>();
        this.isHome = new ArrayList<>();
        checkSize();
        for (int i = 0; i < teams.size(); i++)
            this.isHome.add(i % 2 == 0);
    }

    private void checkSize() {
        if (teams.size() % 2 != 0)
            teams.add("Bay");
    }

    private void toggle() {
        for (Boolean item : this.isHome) {
            item = !item;
        }
    }

    public String createFixture() {
        Map<String, List<String>> matchMap = new TreeMap<>();
        int roundSize = (this.teams.size() - 1) * 2;
        for (int i = 0; i < teams.size(); i++) {
            String currentTeam = teams.get(i);
            matchMap.put(currentTeam, teams.stream()
                    .filter(team -> !team.equals(currentTeam)).toList());

            System.out.println(matchMap.get(currentTeam));
        }
        String fixture = "";
        for (int i = 0; i < roundSize; i++) {
            fixture += "Round " + (i + 1) + "\n";
            for (int j = 0; j < this.isHome.size(); j++) {
                if(this.isHome.get(i)){
                    String homeOwner = this.teams.get(i);
                    String otherTeam = matchMap.get(homeOwner).get(0);
                        fixture += homeOwner+ " vs " +
                                otherTeam + "\n" ;
                    matchMap.get(homeOwner).remove(otherTeam);

                }
            }
            toggle();
        }
        return fixture;
    }
}
