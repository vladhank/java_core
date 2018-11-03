/*
Создать класс Notebook - наследник Computer. В этом классе должно быть поле типа Touchpad - также созданного класса со своими полями.
Добавить в класс Notebook transient-поле. Создать объект класса Notebook, сериализовать в файл.
Десериализовать объект из файла, продемонстрировать, что transient-поля не сериализуются.
*/

package Computer;

public class Laptop extends Computer {
    private  String brandName;

    public String getBrandName() {
        return brandName;
    }

    private int batteryCapacity;
    private transient String windowsKey;
    Touchpad touchpad = new Touchpad("Logitech", 2, true);

    public int getBatteryCapacity() {
        return batteryCapacity;
    }

    public String getWindowsKey() {
        return windowsKey;
    }

    public Touchpad getTouchpad() {
        return touchpad;
    }

    public Laptop(int memory, int storage, String processor, String graphics, String brandName, int batteryCapacity, String windowsKey) {
        super(memory, storage, processor, graphics);
        this.brandName = brandName;
        this.batteryCapacity = batteryCapacity;
        this.windowsKey = windowsKey;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "brandName='" + brandName + '\'' +
                ", batteryCapacity=" + batteryCapacity +
                ", windowsKey='" + windowsKey + '\'' +
                ", touchpad=" + touchpad +
                '}';
    }
}
