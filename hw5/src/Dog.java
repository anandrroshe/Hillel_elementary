public class Dog extends Pet implements Cloneable {

    public void bringHome (){
        System.out.println("I can take you home.");
    }

    public Dog(int id, String name, byte age, double weight, String color, boolean isVaccinated, boolean isTrained) {
        super(id, name, age, weight, color, isVaccinated);
        if (isTrained == true){
            bringHome();
        }else {
            System.out.println("I can't bring you home");
        }
    }

    public static void main(String[] args) {
        Dog newDog = new Dog(455678, "Colin", (byte) 2, 45.6, "Black", true, true);

    }

    @Override
    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }



}
