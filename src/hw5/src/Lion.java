public class Lion extends Predator implements Cloneable{

    public Lion(int id, byte age, double weight, String color) {
        super(id, age, weight, color);
    }

    public static void main(String[] args) {
        Lion newLion = new Lion(214671, (byte) 8, 400.3, "Orange");
    }
    @Override
    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }
}