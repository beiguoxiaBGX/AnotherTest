package chacter1;

public abstract class Item {
    private String name;
    private int price;
    public abstract boolean disposable();
    Item(String name,int price){
        this.name = name;
        this.price = price;
    }
    public String toString(){
        return name+price;
    }
    public void finalize(){
        System.out.println("当前对象正在被回收");
    }
    public boolean equals(Object o){
        if(o instanceof Item){
            if(this.price==((Item) o).price)
                return true;
            else
                return  false;
        }else
            return false;
    }
    public static void main(String args[]){
        Item i = new Item("tom",20) {
            @Override
            public boolean disposable() {
                return false;
            }
        };
        System.out.print(i.disposable());
    }
}
