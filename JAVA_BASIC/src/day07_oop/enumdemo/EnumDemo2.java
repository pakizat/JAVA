package day07_oop.enumdemo;

/**
 * 枚举类型应用场景  做信息的分类和标志
 */
public class EnumDemo2 {
    public static void main(String[] args) {
        //需求 模拟上向左右移动图片

        //1.使用 常量 的方法
        move1(Constant.LEFT);

        //但是会导致 可以传入 任何 int 类型 的值
        move1(5);

        //2.使用枚举的方法  仅仅可以传入枚举对象 进行判断 无法传入其他
        move2(Directions.LEFT);
        move2(Directions.RIGHT);
        move2(Directions.UP);
        move2(Directions.DOWN);

    }

//    //定义以一个方法 接受 方向数据 并对应做出响应
//    public void move(方向){
//        根据传入的方向做出响应
//    }



    //1. 使用常量传入 创建常量类 并定义常量 静态变量传入的方法也得是静态的
    public static void move1(int driction) {
        switch (driction) {
            case 0:
                System.out.println("向左移动");
                break;
            case 1:
                System.out.println("向右移动");
                break;
            case 2:
                System.out.println("向上移动");
                break;
            case 3:
                System.out.println("向下移动");
                break;
            default:
                System.out.println("输入错误");
                break;
        }
    }

    //2. 使用枚举传入
    public static void move2(Directions driction) {
        switch (driction) {
            case LEFT:
                System.out.println("向左移动");
                break;
            case RIGHT:
                System.out.println("向右移动");
                break;
            case UP:
                System.out.println("向上移动");
                break;
            case DOWN:
                System.out.println("向下移动");
                break;
            default:
                System.out.println("输入错误");
                break;
        }
    }
}
