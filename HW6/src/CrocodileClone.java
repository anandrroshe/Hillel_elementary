public class CrocodileClone {
    public static void main(String[] args) {
        Crocodile newCrocodile = new Crocodile(214671, (byte) 8, 400.3, "Green");
        makeCloneCrocodile(newCrocodile);

    }


    public static void makeCloneCrocodile(Crocodile crocodileClone){
        try {
            Crocodile crcdleClone = (Crocodile)crocodileClone.clone();
        }catch (CloneNotSupportedException e){
            e.getStackTrace();
        }
    }
}
