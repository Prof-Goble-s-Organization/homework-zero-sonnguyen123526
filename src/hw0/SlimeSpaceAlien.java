package hw0;

public class SlimeSpaceAlien extends SpaceAlien implements ZapsWithSlime{
    
    private int age;

    public SlimeSpaceAlien(String homePlanet, double distanceFromEarth, int age) {
        super(homePlanet, distanceFromEarth);
        this.age = age;
        //TODO Auto-generated constructor stub
    }

    @Override
    public String doSlimeZap(int numHumans) {
        //TODO Auto-generated method stub
        if (numHumans == 0){
            return "hu hu hu";
        }
        else{
            return "yay yay yay";
        }

    }

    @Override
    public String slimeWholeEarth() {
        //TODO Auto-generated method stub
        return "shi shi shi";
    }

    @Override
    public void doGreeting(){
        System.out.println("Hello form planet " + gethomePlanet() + ", "
                + getdistanceFromEarth() + " light years away with the age of" + " "+ age);
    }

    public static void main(String[] args){
        SlimeSpaceAlien s1 = new SlimeSpaceAlien("Earth", 1000, 10000);
        s1.doGreeting();
        System.out.println(s1.slimeWholeEarth());
    }
}