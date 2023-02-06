package first_lesson;
import java.util.Date;

public class Mouse extends Animal {
    public Mouse(){
        this.name = "Рэмми";
        this.dateB = new Date(2022, 1, 12);
        this.env = Env.GROUND;
        this.food = Food.GRASS;
    }

    public Mouse(String name, Date date, Env env, Food food){
        super(name, date, env, food);
    }
    @Override
    public void move(){
        System.out.println(this.name + " кр0дется");
    }
    @Override
    public void eat(){
        System.out.println(this.name + " грызёт провод");
    }
}
