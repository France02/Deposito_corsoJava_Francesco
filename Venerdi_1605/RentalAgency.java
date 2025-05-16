package Venerdi_1605;

import java.util.ArrayList;

public class RentalAgency {
    
    ArrayList<Car> cars = new ArrayList<>();
    
    public void addCar(Car car){
        cars.add(car);
    }

    public void displayAvailableCars(){
        for (Car car : cars) {
            if(car.getIsAvailable()) car.displayCarInfo();

        }
    }

    public boolean rentCar(String plateNumber){
        for (Car car : cars) {
            if(car.getPlateNumber().equals(plateNumber) && car.getIsAvailable()){
                car.setIsAvailable(false);
                System.out.println("Auto noleggiata con successo");
                return true;
            }else{
                System.out.println("Auto con targa " + plateNumber + " non disponibile");
                return false;
            }
        }
        System.out.println("Auto non trovata");
        return false;
    }

    public boolean returnCar(String plateNumber){
        for (Car car : cars) {
            if(car.getPlateNumber().equals(plateNumber) && !(car.getIsAvailable())){
                car.setIsAvailable(true);
                System.out.println("Auto restituita con successo");
                return true;
            }else{
                System.out.println("Auto con targa " + plateNumber + " non è stata noleggiata");
                return false;
            }
        }
        System.out.println("Auto non trovata");
        return false;
    }




    
}