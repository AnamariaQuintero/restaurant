package people;
import values.CustomerRoles;

public class Customer {
    CustomerRoles role;
    String id;
    String fullname;

    public Customer(CustomerRoles role, String id, String fullname) {
        this.role = role;
        this.id = id;
        this.fullname = fullname;
    }
    
    
    void sayMenu (){
    }
    
    void buyFood(){
    }
    
    void cancelBut(){
    }
    
    public void sellFood(){
        if (this.role != CustomerRoles.ADMINISTRATIVE){
            System.out.println("Usted no esta autorizado a vender!!");
            return;
        }
        System.out.println("Ya lo atiendo mijo");
        
    }
}
