public class Cat extends Pet implements Cloneable{
    public Cat(int id, String name, byte age, double weight, String color, boolean isVaccinated) {
        super(id, name, age, weight, color, isVaccinated);
        voice("Meow)");
    }


    public static void main(String[] args) {
        Cat newCat = new Cat(234671, "Alice", (byte) 1, 3.2,"Tabby", true);
    }


    @Override
    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }

}

