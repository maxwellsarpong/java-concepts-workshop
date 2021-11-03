public class Main {

    /*
     * Welcome to your method overriding workshop!
     * You should make your changes in the Football class, and call those changes here.
     * Use function overriding to get the Football class to print out the name and number of players.
     */

    public static void main(String[] args) {
        Sports sports = new Sports();
        sports.getNumberOfTeamMembers();


        Sports football = new Football();
        // Call your members here
        football.getName();
        football.getNumberOfTeamMembers();


        Sports aside = new FiveASide();
        // Call your members here
        aside.getName();
        aside.getNumberOfTeamMembers();

    }
}
