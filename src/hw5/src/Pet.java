public class Pet extends Animal implements Cloneable  {
    private String name;
    private boolean isVaccinated;


    public Pet(int id, String name, byte age, double weight, String color, boolean isVaccinated) {
        super(id, age, weight, color);
        this.name = name;
        this.isVaccinated = isVaccinated;
        voice("Hello!");
        voice("My name is " + name +")");

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isVaccinated() {
        return isVaccinated;
    }


    public void voice(String voice) {
        System.out.println(voice);
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }


}
