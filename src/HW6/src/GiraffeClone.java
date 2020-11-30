public class GiraffeClone {
    public static void main(String[] args) {
        Giraffe newGiraffe = new Giraffe(548030934, (byte) 2, 280, "Orange");
        makeCloneGiraffe(newGiraffe);

    }


    public static void makeCloneGiraffe(Giraffe giraffeClone){
        try {
            Giraffe grffeClone = (Giraffe)giraffeClone.clone();
        }catch (CloneNotSupportedException e){
            e.getStackTrace();
        }
    }
}
