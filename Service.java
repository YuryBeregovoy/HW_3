package HW3_Company5;

import HW3_Company5.CarProperties.Color;
import HW3_Company5.CarProperties.WheelSize;

import java.util.Arrays;
import java.util.List;

public class Service {

    private final Factory factory;

    public Service(Factory factory) {this.factory = factory;
    }

    public void changeColor(Car car, Color newColor) {
        System.out.println("Вы выбрали цвет " + newColor);
        List<Color> availableColors = Arrays.asList(factory.getColors().clone());
        if (!availableColors.contains(newColor)) {
            System.out.println("Данный цвет недоступен!");
            factory.printColorsList();
            return;
        }
        System.out.println("Цвет автомобиля изменен на " + newColor);
        car.setColor(Color.valueOf(String.valueOf(newColor)));
    }

    public void changeWheelSize(Car car, String newWheelSize) {
        System.out.println("Вы выбрали размер колес " + newWheelSize);
        List<WheelSize> availableWheelSizes = Arrays.asList(factory.getWheelSizes().clone());
        if(!availableWheelSizes.contains(newWheelSize)){
            System.out.println("Размер колес недоступен!");
            factory.printWheelSizeList();
            return;
        }
        System.out.println("Размер колес изменен на " + newWheelSize);
        car.setWheelSize(WheelSize.valueOf(newWheelSize));
    }

    public void addOption (Car car, String optionToAdd){
        System.out.println("Опция " + optionToAdd + " добавлена в автомобиль.");
        car.getOptions().add(optionToAdd);
    }

    public void removeOption (Car car, String optionToRemove){
        System.out.println("Опция " + optionToRemove + " удалена.");
        car.getOptions().remove(optionToRemove);
    }

}
