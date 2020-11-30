public class WildAnimal extends Animal implements Cloneable {

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public WildAnimal(int id, byte age, double weight, String color) {
        super(id, age, weight, color);
        voice("I am a wild animal.");
    }

    @Override
    public int getId() {
        return super.getId();
    }
}

