public class HumsterClone {
    public static void main(String[] args) {
        Humster newHumster = new Humster(3569797, "Dick", (byte) 1, 0.1, "Tricolor", false);
        makeCloneHumster(newHumster);

    }


    public static void makeCloneHumster(Humster humsterClone){
        try {
            Humster hmstrClone = (Humster)humsterClone.clone();
        }catch (CloneNotSupportedException e){
            e.getStackTrace();
        }
    }
}
