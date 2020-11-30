public class LionClone {
    public static void main(String[] args) {
        Lion newLion = new Lion(214671, (byte) 8, 400.3, "Orange");
        makeCloneLion(newLion);

    }


    public static void makeCloneLion(Lion lionClone){
        try {
            Lion lnClone = (Lion)lionClone.clone();
        }catch (CloneNotSupportedException e){
            e.getStackTrace();
        }
    }
}
