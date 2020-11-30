public class VolfClone {
    public static void main(String[] args) {
        Volf newVolf = new Volf(21456671, (byte) 7, 130.3, "Grey");
        makeCloneVolf(newVolf);

    }


    public static void makeCloneVolf(Volf volfClone) {
        try {
            Volf vlfClone = (Volf) volfClone.clone();
        } catch (CloneNotSupportedException e) {
            e.getStackTrace();
        }
    }
}
