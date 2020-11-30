public class FishClone {

    public static void main(String[] args) {
        Fish newFish = new Fish(467890, (byte) 2,0.2, "white");
        newFish.voice(".......");
        makeCloneFish(newFish);


    }


    public static void makeCloneFish(Fish fishClone){
        try {
            Fish fshClone = (Fish) fishClone.clone();
        }catch (CloneNotSupportedException e){
            e.getStackTrace();
        }
    }
}
