package chacter1;

public interface APInterface {
    default void attack(){
        System.out.print("AP attacks");
    }
}
