/*
Создать метод случайным образом выбрасывающий одно из 3-х видов исключений.

Вызвать этот метод в блоке try-catch, отлавливающем любое из 3-х.
*/

package MethodsException;

import java.util.Random;

public class MethodsExceptions {

    Random random = new Random();


    public void generateException() throws ClassNotFoundException {

        int randomException = random.nextInt(2);
        switch (randomException) {
            case 0:
                throw new ClassCastException("Неправильно типы привел");
            case 1:
                throw new ClassNotFoundException("Нету такого класса");
            case 2:
                throw new NullPointerException("Пустая ссылка");
        }
    }

    public void Exception50percent() {

        int randomChance = random.nextInt(1);
        switch (randomChance){
            case 0:
                throw new RuntimeException("Минус премия");
            case 1:
                System.out.println("В этот раз повезло");
        }
    }
}
