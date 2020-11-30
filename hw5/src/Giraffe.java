public class Giraffe extends WildAnimal implements Cloneable{
    public Giraffe(int id, byte age, double weight, String color) {
        super(id, age, weight, color);
    }

    public static void main(String[] args) {
        Giraffe newGiraffe = new Giraffe(59430934, (byte) 1, 200, "Orange");
    }
    @Override
    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }

}
