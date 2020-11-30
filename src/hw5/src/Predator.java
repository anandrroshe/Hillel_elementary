public class Predator extends WildAnimal{

    public Predator(int id, byte age, double weight, String color) {
        super(id, age, weight, color);
        voice("I'm hungry!!!");
    }

    @Override
    public int getId() {
        return super.getId();
    }
}
