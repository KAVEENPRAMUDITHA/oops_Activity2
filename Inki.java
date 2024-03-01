public class Inki{
public Inki(String pinki){
	System.out.println(pinki);
	
}
public Inki(String pinki,String blinki,String rinki){

 System.out.println(blinki+ "" +pinki);
 System.out.println(pinki+""+rinki);
 System.out.println(blinki+""+rinki+""+ rinki);
 
 }
public static void main(String args[] ){
String pinki="Donkey";
Inki ponki=new Inki(pinki);

String blinki= "pinki";
String rinki="monkey";

Inki ponki2= new Inki(pinki,blinki,rinki);

}

}