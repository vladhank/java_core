/*
Создать класс Pair, параметризованный двумя параметрами K и V.
Класс должен хранить две переменные типов K и V соответственно.
У класса должен быть конструктор,
принимающий 2 параметра типов K и V, а также набор соответствующих геттеров/сеттеров.
*/

        package Generics;

public class Pair<K,V> {
    private K kVariable;
    private V vVariable;

    public Pair(K kVariable, V vVariable) {
        this.kVariable = kVariable;
        this.vVariable = vVariable;
    }

    public K getkVariable() {
        return kVariable;
    }

    public V getvVariable() {
        return vVariable;
    }

    public void setkVariable(K kVariable) {
        this.kVariable = kVariable;
    }

    public void setvVariable(V vVariable) {
        this.vVariable = vVariable;
    }
}

