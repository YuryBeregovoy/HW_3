package HW3_Company5;

import HW3_Company5.CarProperties.Color;
import HW3_Company5.CarProperties.EngineVolume;
import HW3_Company5.CarProperties.Model;
import HW3_Company5.CarProperties.WheelSize;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Car {

    private final Model model;
    private final int manufacturingYear;
    private final EngineVolume engineVolume;
    private Color color;
    private WheelSize wheelSize;
    private final List<String> options = new ArrayList<>();

    public Car(Model model, int manufacturingYear, EngineVolume engineVolume, Color color, WheelSize wheelSize) {
        this.model = model;
        this.manufacturingYear = manufacturingYear;
        this.engineVolume = engineVolume;
        this.color = color;
        this.wheelSize = wheelSize;
    }

    public void setColor(Color color) {this.color = color;
    }

    public void setWheelSize(WheelSize wheelSize) {this.wheelSize = wheelSize;
    }

    public List<String> getOptions() {return options;
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return manufacturingYear == car.manufacturingYear && engineVolume == car.engineVolume
                && model.equals(car.model) && color.equals(car.color) && wheelSize.equals(car.wheelSize)
                && options.equals(car.options);
    }

    public int hashCode() {
        return Objects.hash(manufacturingYear, model, engineVolume, color, wheelSize, options);
    }

    public String toString() {
        return "Автомобиль: " + "модель = " + model  + ", год выпуска = " + manufacturingYear
                + ", объем двигателя = " + engineVolume + "см3, цвет = " + color + ", размер колес = "
                + wheelSize + ", опции = " + optionsAvailability();
    }

    private String optionsAvailability () {
        return options.size() == 0 ? "без опций" : options.toString();
    }
}
