public class Volf extends Predator implements Cloneable{

    public Volf(int id, byte age, double weight, String color) {
        super(id, age, weight, color);
    }

    public static void main(String[] args) {
        Volf newVolf = new Volf(234671, (byte) 5, 45.3, "Grey");
    }

    @Override
    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }
}
