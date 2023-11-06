
    public class Cuentabancaria{
  
    private int  numero;
    private int  número_de_cuenta;
    private double saldo;
    private String nombre_cliente;
    private String email;
    private Double depositar;
    private Double retirar;
    public Cuentabancaria(){
        this("No disponible", 0, "No disponible", "No disponible", "No disponible");
    }
   
    public Cuentabancaria(int numero, int  número_de_cuenta, double saldo, String nombre_cliente, String email,double depositar,double retirar){
        this.numero= numero;
        this. número_de_cuenta = número_de_cuenta;
        this.saldo = saldo;
        this.nombre_cliente = nombre_cliente;
        this.email = email;
        this.depositar = depositar;
        this.retirar=retirar;
    }
    public double getdepositar(){  
        return this.depositar;
    }
     public Double getRetirar() {
    
        return this.retirar;
    }
   
    public int getnumero(){  
        return this.numero;
    }
    public getmostrarnúmero_de_cuenta(){  
        return this. número_de_cuenta;
    }
    public double getsaldo() {
        return this.saldo;
    }    
    public String getnombreclientte() {
        return this.nombre_cliente;
    }    
    public String getemail() {
        return this.email;
    }    
      
    public void  setnumero(int numero){    
        this.numero = numero;
    }
    public void  setestablecernúmero_de_cuenta(int  número_de_cuenta){    
        if ( número_de_cuenta < 0) {
            this. número_de_cuenta = 0;
        } else {
            this. número_de_cuenta =  número_de_cuenta;
        }  
    }
    public void  setsaldo(double saldo) {
           if ( saldo < 0) {
            this. saldo = 0;
        } else {
            this. saldo =  saldo;
        }  
        this.saldo = saldo;
    }
    public void setnombre_cliente(String email) {
        this.email = email;
    }
    public void establecerCalidad(String nombre_cliente) {
        this.nombre_cliente = nombre_cliente;
    }
     public void setDepositar(Double depositar) {
        this.depositar = depositar;
        
    }
    public void setnumero(int numero){    
        this.numero = numero;
    }
}
 
