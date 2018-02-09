package chacter1;

public class Hero {
    public String name = "some hero";
    public Hero(){
        name = "one hero";
    }
    {
        name = "the hero";
    }
    public static void main(String args[]){
        Hero h = new ADHero();
        ADHero adHero = new ADHero();
        h.battleWin();

    }
    public void battleWin(){
        System.out.println("Hero battle win!");
    }
}