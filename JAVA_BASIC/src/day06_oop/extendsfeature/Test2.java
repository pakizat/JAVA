package day06_oop.extendsfeature;

/**
 * 目标 理解 掌握 子类的 就近原则
 */
public class Test2 {
    public static void main(String[] args) {

        Zi z =new Zi();
        z.show();

    }
}

class Fu{
     String name;

    public String getName(){
        return name;

    }
    public void show(){
        System.out.println("Fu 的 show ");
        System.out.println(getName());


    }
}


class Zi extends Fu{
    private String name;

    public void show(){
        String name = "Zi 的 name ";
        System.out.println("Zi 的 show ");
        System.out.println(name);
        System.out.println(this.name);
        System.out.println(super.name);


    }
}