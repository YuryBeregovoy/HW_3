package HW3_Company5;

import HW3_Company5.CarProperties.Color;
import HW3_Company5.CarProperties.EngineVolume;
import HW3_Company5.CarProperties.Model;
import HW3_Company5.CarProperties.WheelSize;

import java.util.ArrayList;
import java.util.List;

public class Factory {

    private final Model[] models;
    private final EngineVolume[] engineVolumes;
    private Color[] colors;
    private WheelSize[] wheelSizes;

    private List<Car> storehouseCars = new ArrayList<>();

    private Service service = new Service(this);


    public Factory(Model[] models, EngineVolume[] engineVolumes,
                   Color[] colors, WheelSize[] wheelSizes) {
        this.models = models;
        this.engineVolumes = engineVolumes;
        this.colors = colors;
        this.wheelSizes = wheelSizes;
        storehouseCars.add(new Car(Model.FIESTA, 2021,
                EngineVolume.V1600, Color.BLACK, WheelSize.R18));
        storehouseCars.add(new Car(Model.FOCUS, 2010,
                EngineVolume.V2000, Color.RED, WheelSize.R19));
        storehouseCars.add(new Car(Model.MUSTANG, 2015,
                EngineVolume.V3000, Color.WHITE, WheelSize.R20));
    }
    public Service getService() {
        return service;
    }
    public List<Car> getStorehouseCars() {
        return storehouseCars;
    }
    public Color[] getColors() {return colors;
    }
    public WheelSize[] getWheelSizes() {return wheelSizes;
    }
    public void printModelsList() {
        System.out.println("Список доступных моделей: ");
        for (Model model : models) {
            System.out.print(model + " ");
        }
        System.out.println();
    }
    public void printEngineVolumesList() {
        System.out.println("Доступные объемы двигателя: ");
        for (EngineVolume engineVolume : engineVolumes) {
            System.out.print(engineVolume + " ");
        }
        System.out.println();
    }
    public void printColorsList() {
        System.out.println("Доступные цвета кузова: ");
        for (Color color : colors) {
            System.out.print(color + " ");
        }
        System.out.println();
    }
    public void printWheelSizeList() {
        System.out.println("Доступные размеры колес: ");
        for (WheelSize wheelSize : wheelSizes) {
            System.out.print(wheelSize + " ");
        }
        System.out.println();
    }
    public void createCar (Car orderedCar) {
        for (Car storehouseCar : storehouseCars) {
            if (storehouseCar.equals(orderedCar)){
                System.out.println("Такой автомобиль уже есть на складе!");
                return;
            }
        }
        System.out.println("Этот автомобиль изготовлен и добавлен на склад!");
        storehouseCars.add(orderedCar);
    }
    public void showStorage(){
        System.out.println("Заводской склад содержит следующие автомобили: ");
        for (int i = 0; i < storehouseCars.size(); i++) {
            System.out.println(i+1 + " " + storehouseCars.get(i));
        }
    }
}
