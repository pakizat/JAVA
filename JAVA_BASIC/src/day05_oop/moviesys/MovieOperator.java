package src.day05_oop.moviesys;

/**
 * 电影操作类
 */
public class MovieOperator {
    private Movie[] movies ;


    public MovieOperator() {}

    public MovieOperator (Movie[] movies) {
        this.movies = movies;
    }

    public void showALLMovieInfo() {
        for (int i = 0; i < movies.length; i++) {
            Movie m = movies[i];
            System.out.println("电影编号：" + m.getId());
            System.out.println("电影名称：" + m.getFilmName());
            System.out.println(" 演员：" + m.getActor());
            System.out.println(" 价格：" + m.getPrice());
            System.out.println("============================================");
        }

    }

    public void getMovie( int id) {
        boolean flag1 = false;
        for (int i = 0; i < movies.length; i++) {
            if (movies[i].getId() == id  ){
                Movie m = movies[i];
                System.out.println("==============================================");
                System.out.println("电影编号：" + m.getId());
                System.out.println("电影名称：" + m.getFilmName());
                System.out.println(" 演员：" + m.getActor());
                System.out.println(" 价格：" + m.getPrice());
                System.out.println("==============================================");
                flag1 = true;
            }
        }
        if (!flag1) {
            System.out.println("没有找到该电影编号");
        }
    }

}
