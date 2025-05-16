package Venerdi_1605;

public class Car {
    private String model;
    private String plateNumber;
    private boolean isAvailable;

    public Car(String model, String plateNumber) {
        this.model = model;
        this.plateNumber = plateNumber;
        this.isAvailable = true;

    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getPlateNumber() {
        return plateNumber;
    }

    public void setPlateNumber(String plateNumber) {
        this.plateNumber = plateNumber;
    }

    public boolean getIsAvailable() {
        return isAvailable;
    }

    public void setIsAvailable(boolean isAvailable) {
        this.isAvailable = isAvailable;
    }

    public void displayCarInfo(){
        System.out.println("Modello: " + model + " Targa: " + plateNumber + " Disponibilità: " + isAvailable);
    }

}
