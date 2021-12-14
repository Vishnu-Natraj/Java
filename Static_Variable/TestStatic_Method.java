
public class TestStatic_Method{  
    //private static String college;

    public static void main(String args[]){  
    Static_Method.change();//calling change method  
    
    //creating objects  
    Static_Method s1 = new Static_Method(111,"Karan");  
    Static_Method s2 = new Static_Method(222,"Aryan");  
    Static_Method s3 = new Static_Method(333,"Sonoo");  

    //calling display method  
    s1.display();  
    s2.display();  
    s3.display();  
    }

    //static method to change the value of static variable  
    

   
}  
 
