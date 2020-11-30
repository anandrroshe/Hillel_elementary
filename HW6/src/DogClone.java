public class DogClone {
    public static void main(String[] args) {
        Dog newDog = new Dog(45667, "Joe", (byte) 4, 4.5,"Black", false, true);
        makeCloneDog(newDog);

    }


    public static void makeCloneDog(Dog dogClone){
        try {
            Dog dgClone = (Dog)dogClone.clone();
        }catch (CloneNotSupportedException e){
            e.getStackTrace();
        }
    }
}
