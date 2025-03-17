package src.day03.loop;

/**
 *  认识与理解 break 和 continue
 */
public class BreakAndContinue6 {
    public static void main(String[] args) {
            breakDemo();
            System.out.println();
            continueDemo();
    }

    //1. break
    public static void breakDemo() {
        for(int i = 1; i < 10; i++){
            if(i == 5){
                break;
            }
            System.out.print(i+"\t");
        }
    }

    //2. continue
    public static void continueDemo() {
        for(int i = 1; i < 10; i++){
            if(i == 5){
                continue;
            }
            System.out.print(i+"\t");
        }
    }
}
