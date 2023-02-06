package first_lesson;
public class Turtle extends Animal {
    Env env = Env.GROUND;
    Food food = Food.MEAT;
    @Override
    public void move(){
        System.out.println(this.name + " ползёт");
    }
    @Override
    public void eat(){
        System.out.println(this.name + " загрызла мышь");
    }
}
