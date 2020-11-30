

public class CatClone {
    public static void main(String[] args) {
        Cat newCat = new Cat(45667, "Jinx", (byte) 4, 4.5,"Black", false);
        makeCloneCat(newCat);

    }


    public static void makeCloneCat(Cat catClone){
        try {
            Cat ctClone = (Cat) catClone.clone();
        }catch (CloneNotSupportedException e){
            e.getStackTrace();
        }
    }

}
