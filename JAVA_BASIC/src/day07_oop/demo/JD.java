package day07_oop.demo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//家电类
@Data
@NoArgsConstructor
@AllArgsConstructor
public class JD {
    private String name;
    private boolean status;

    public void Switcher(){
        status = !status;
    }
}
