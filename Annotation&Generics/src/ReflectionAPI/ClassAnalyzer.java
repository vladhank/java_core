/*
Создать класс-анализатор ClassAnalyzer. Класс имеет перегруженный метод analyze(),
принимающий объект типа Class или объект, отличный от него.
Реализовать методы, которые анализируют структуру класса на предмет полей, методов,
конструкторов и аннотаций всех типов для класса. Отчет выводится в консоль.
*/

package ReflectionAPI;

import java.lang.annotation.Annotation;
import java.lang.reflect.*;

class ClassAnalyzer {

    public void analyze(Object instanceOfClass) {
        Class clazz = instanceOfClass.getClass();
        Package pack = clazz.getPackage();
        Method[] methods = clazz.getDeclaredMethods();
        Type[] interfaces = clazz.getInterfaces();
        Field[] fields = clazz.getDeclaredFields();
        Constructor[] constructors = clazz.getConstructors();
        int mods = clazz.getModifiers();

        System.out.println("Имя класса: " + clazz.getSimpleName());
        System.out.print("Мофификаторы класса: ");
        if (Modifier.isPublic(mods)) {
            System.out.println("public");
        }
        if (Modifier.isAbstract(mods)) {
            System.out.println("abstract");
        }
        if (Modifier.isFinal(mods)) {
            System.out.println("final");
        }
        if (Modifier.isStatic(mods)) {
            System.out.println("static");
        }

        if (pack.getName() != null) {
            System.out.println("Имя пакета: " + pack.getName());
        }
        if (interfaces.length > 0) {
            for (Type intf : interfaces)
                System.out.println("Имплементирует: " + intf + "\n");
        }


        System.out.println("Класс имеет " + constructors.length + " конструктора");
        for (Constructor constructor : constructors) {
            Class[] paramTypes = constructor.getParameterTypes();
            if (paramTypes.length == 0) {
                System.out.println("Конструктор по умолчанию");
            }
            for (Class paramType : paramTypes) {
                System.out.println("Параметризовынный конструктор принимает параметр(ы) типа: "+paramType.getSimpleName());

            }
        }


        System.out.println("\n");
        for (Field field : fields) {
            Class fieldType = field.getType();
            System.out.println("Поле класса - " + field.getName() + " || Тип " + fieldType.getName());
        }

        for (Method method : methods) {
            System.out.println("\n" + "--------- Имя метода " + method.getName() + "---------");
            if (method.getReturnType().getName().equals("void")) {
                System.out.println("Ничего не возвращает");
            } else {
                System.out.println("Возврашает параметр типа " + method.getReturnType().getName());
            }
            Class[] paramTypes = method.getParameterTypes();
            for (Class paramType : paramTypes) {
                System.out.println("Принимает  параметр(ы) типа - " + paramType.getName());
            }
            Annotation[] annotations = method.getAnnotations();
            {
                for (Annotation annotation : annotations)
                    // System.out.println("Аннотация: " + annotation.annotationType().getSimpleName() + "\n");
                    System.out.println(annotation.toString());
            }
        }


    }


}
