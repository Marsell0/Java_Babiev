import javax.xml.crypto.Data;
import java.util.Date;
public class Animal {
    String name;
    Date dateB;
    Env env;
    Food food;
    public String getName(){
        return this.name;
    }
    public void setName(String name){
        if (name.length() > 3){
            this.name = name;
        }
    }
    public Date getDate(){
        return this.dateB;
    }
    public void setDate(Date date){
        this.dateB = date;
    }
    public Env getEnv(){
        return this.env;
    }
    public void setEnv(Env env){
        this.env = env;
    }
    public Food getFood(){
        return this.food;
    }
    public void setFood(Food food){
        this.food = food;
    }
    public Animal(){
        this.name = "good boy";
        this.dateB = new Date(2022, 1, 12);
        this.env = Env.GROUND;
        this.food = Food.MEAT;
    }
    public Animal(String name, Date date, Env env, Food food){
        this.name = name;
        this.dateB = date;
        this.env = env;
        this.food = food;
    }

    public void move(){}
    public void eat(){}
}
