package chacter1;

public abstract class Animal {
    protected int legs;
    protected Animal(int legs){
        this.legs = legs;
    }
    abstract void eat();
    public void walk(){
        System.out.print("legs:"+this.legs+"用走的");
    }
}
