/*Создать статический обобщённый метод swap в final классе PairUtil.
Метод должен принимать объект класса Pair и возвращать пару, в которой элементы поменяны местами.*/

package Generics;

public final class PairUtil {

    public <K,V> Pair<V,K> swap(Pair<K,V> pair) {
//        Object temp;
//        temp = pair.getkVariable();
//        pair.setkVariable(pair.getvVariable());
//        pair.setvVariable(temp);
        return  new Pair<V,K>(pair.getvVariable(),pair.getkVariable());
    }
}

