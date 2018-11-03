/*Написать два цикла, выполняющих многократное сложение строк, один с помощью оператора сложения и String, 

        второй с помощью StringBuilder и метода append. Сравнить скорость их выполнения.
*/
        package StringBuilderTime;

public class Core {
    public static void stringAdd(String str){
    long startTime = System.currentTimeMillis();
    for (int i=0;i<20;i++){
        str+=str;
    }
    long   endTime =System.currentTimeMillis();
    long time=(endTime-startTime);
        System.out.println("Время выполенения сложения строки в цикле из 30 итераций: "+time+ " миллисекунд(а)");
    }

    public static void stringBuilder(String str){
        StringBuilder strBuild = new StringBuilder();
        long startTime2 = System.currentTimeMillis();
        for(int i=0;i<10000;i++){
           strBuild.append(str);
        }
        long   endTime2 =System.currentTimeMillis();
        long time2=(endTime2-startTime2);
        System.out.println("Время выполенения сложения строки StringBuilder'ом в цикле из 10000 итераций: "+time2+ " миллисекунд(а)");

    }
}
