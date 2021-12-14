/**
 * Method
 */
public class Method {
int id;
String name;

public void method(int i, String n){
    id = i;
    name = n;

}
void display(){System.out.println(id+" "+name);}

public static void main(String[] args) {
    
    Method m = new Method();
    m.method(1, "vishnu");
    m.display();
}
    

}