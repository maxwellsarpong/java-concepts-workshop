public class FiveASide extends Football {
    int n = 5;
    @Override
    String getName(){
        return "Football Aside";
    }

    @Override
    void getNumberOfTeamMembers(){
        
        System.out.println( "Each team has " + n + " players aside in " + getName());
    }
    
}
