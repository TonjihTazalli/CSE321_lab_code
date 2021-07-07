

package javaapplication3;


 class amarthread1 extends Thread {
@Override
public void run(){

for(int i=0;i<=10;i++){
System.out.println(i);

}
}

}
///////////////
class amarthread2 extends Thread {
@Override
public void run(){

for(int i=11;i<=20;i++){
System.out.println(i);
}
}

}
public class task1{
   public static void main(String[] args){
amarthread1 onetoten=new amarthread1();
amarthread2 eletotwenty=new amarthread2();
onetoten.start();
eletotwenty.start();
}
}

