package day06_oop.polymorphsm2;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Animal {
    String name = "动物";

    public void run(){
        System.out.println("动物正在跑~~~~~");
    }


}
