public class Fish extends Animal implements Cloneable{
    public Fish(int id, byte age, double weight, String color) {
        super(id, age, weight, color);
    }

    public static void main(String[] args) {
        Fish newFish = new Fish(4567821, (byte) 1, 0.3, "Blue");
        newFish.voice("......");

    }

    @Override
    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }
}
