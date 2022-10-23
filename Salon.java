package HW3_Company5;

import HW3_Company5.CarProperties.Color;
import HW3_Company5.CarProperties.WheelSize;

import java.util.List;

public class Salon {

    private final Factory factory;
    private final List<Car> storehouseList;

    public Salon(Factory factory) {
        this.factory = factory;
        this.storehouseList = factory.getStorehouseCars();
    }

    public void orderNewCar(Car newCar){
        factory.createCar(newCar);
    }

    public void changeCarColor (int carNumber, Color newColor){
        System.out.println("Изменение цвета для автомобиля No. " + carNumber);
        factory.getService().changeColor(storehouseList.get(carNumber-1), Color.valueOf(String.valueOf(newColor)));
    }

    public void changeCarWheels (int carNumber, WheelSize newWheelSize){
        System.out.println("Замена колес на машину No. " + carNumber);
        factory.getService().changeWheelSize(storehouseList.get(carNumber-1), String.valueOf(newWheelSize));
    }
}
