public class Humster extends Pet implements Cloneable  {
    public Humster(int id, String name, byte age, double weight, String color, boolean isVaccinated) {
        super(id, name, age, weight, color, isVaccinated);

    }

    public static void main(String[] args) {
        Humster newHumster = new Humster(234671, "George", (byte) 1, 0.1, "grey", false);
    }

    @Override
    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }
}