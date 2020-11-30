public abstract class Animal implements Cloneable {
    private int id;
    private byte age;
    private double weight;
    private String color;


    public Animal(int id, byte age, double weight, String color) {
        this.id = id;
        this.age = age;
        this.weight = weight;
        this.color = color;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public byte getAge() {
        return age;
    }

    public void setAge(byte age) {
        this.age = age;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void voice(String voice) {
        System.out.println(voice);
    }
    @Override
    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }

}

