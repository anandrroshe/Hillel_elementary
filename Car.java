public class Car {

    private int volumeTank;
    private int leftVolume;
    private int fuelConsumption100Km;

    public Car(int volumeTank, int leftVolume, int fuelConsumption100Km) {
        this.volumeTank = volumeTank;
        this.leftVolume = leftVolume;
        this.fuelConsumption100Km = fuelConsumption100Km;

    }

    public int fillTank() {
        int filledVolume = volumeTank - leftVolume;
        leftVolume += filledVolume;
        return filledVolume;
    }

    public int fuelRemaining(int distance) {
        int fuelRemain = leftVolume - (fuelConsumption100Km * distance / 100);
        return fuelRemain;
    }

    public int fuelNeeds(int distance) {
        int volumeFuel = volumeTank - (leftVolume - (fuelConsumption100Km * distance / 100));
        return volumeFuel;
    }
}




