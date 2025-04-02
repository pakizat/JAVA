package day08_oop.methodreference1;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.w3c.dom.ls.LSOutput;


/**
 * 目标 ： 理解构造器引用
 */
public class Demo4 {
    public static void main(String[] args) {
//        CarFactory cf = new CarFactory() {
//            @Override
//            public Car create(String name) {
//                return new Car(name);
//            }
//        };

        //lambda引用简化
//      CarFactory cf = name ->new Car(name);

        //构造器引用简化
        CarFactory cf = Car::new;

        Car car = cf.create("奔驰");
        System.out.println(car);
    }



}

interface CarFactory {
    Car create(String name);
}


@Data
@AllArgsConstructor
@NoArgsConstructor
class Car {
    private String name;
}
