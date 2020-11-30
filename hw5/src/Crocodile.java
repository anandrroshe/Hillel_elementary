public class Crocodile extends Predator implements Cloneable{

    public Crocodile(int id, byte age, double weight, String color) {
        super(id, age, weight, color);
    }



    public static void main(String[] args) {
        Crocodile newCrocodile = new Crocodile(214671, (byte) 8, 400.3, "Green");
    }

    @Override
    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }


}