/*
Создать класс Computer. Добавить ему несколько полей, создать объект этого класса, сериализовать в файл.

Десериализовать объект из того же файла, вывести значения полей в консоль.
*/

package Computer;

import java.io.Serializable;

public class Computer implements Serializable {

    private int memory;
    private int storage;
    private String processor;
    private String graphics;

    public Computer(int memory, int storage, String processor, String graphics) {
        this.memory = memory;
        this.storage = storage;
        this.processor = processor;
        this.graphics = graphics;
    }

    public int getMemory() {
        return memory;
    }

    public int getStorage() {
        return storage;
    }

    public String getProcessor() {
        return processor;
    }

    public String getGraphics() {
        return graphics;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "memory=" + memory +
                ", storage=" + storage +
                ", processor='" + processor + '\'' +
                ", graphics='" + graphics + '\'' +
                '}';
    }
}
