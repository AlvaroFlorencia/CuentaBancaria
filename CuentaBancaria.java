
package miprimerproyecto;


public class CuentaBancaria {
    private int numDeCuenta;
    private int numDeSucursal;
    private String banco;
    private double saldo;
    private int nip;
    private String cambiar;
    
   
   public CuentaBancaria ()
   {
    numDeCuenta=574568;
    numDeSucursal=3332;
    banco="Bancomer";
    saldo=3323.59;
    nip=3456;
    cambiar="";
   }
     public CuentaBancaria (int numDeCuenta, int numDeSucursal, String banco, int saldo,int nip,String cambiar) {
        this.numDeCuenta=numDeCuenta;
        this.numDeSucursal=numDeSucursal;
        this.banco=banco;
        this.saldo=saldo;
        this.nip=nip;  
        this.cambiar=cambiar;
        
        
    }
      public int recibeNumdeCuenta(){
        return numDeCuenta;
    }
        public boolean introduceCuenta (int numDeCuenta)
        {
             this.cambiar= Integer.toString(this.numDeCuenta=numDeCuenta);
            int b =cambiar.length();
         if(b != 7)
        {
            return false;
            
        }
         else{
             this.numDeCuenta=numDeCuenta;
             return true;
         }
    }
        public int recibenumDeSucursal(){
        return numDeSucursal;
    }
        public boolean introduceSucursal (int numDeSucursal)
        {
            this.cambiar= Integer.toString(this.numDeSucursal=numDeSucursal);
            int c =cambiar.length();
         if(c != 4)
        {
            return false;
            
        }
         else{
             this.numDeSucursal=numDeSucursal;
             return true;
         }
    }
    public String recibeBanco(){
    return banco;
    }
    public void introduceBanco (String banco)
    {
    if(banco == null || banco == "")
    {
    this.banco="Tu banco no está establecido";
    }
    else
    {
    this.banco=banco;
    }
}
     public double recibeSaldo(){
        return saldo;
    }
        public boolean introduceSaldo (double saldo)
        {
           
         if(saldo == 0)
        {
            return false;
            
        }
         else{
             this.saldo=saldo;
             return true;
         }
    }
 public int recibeNip(){
        return nip;
    }
        public boolean introduceNip (int nip)
        {
             
            this.cambiar= Integer.toString(this.nip=nip);
            int a =cambiar.length();
         if( a!=4)
        {
            return false;
            
        }
         else{
             this.nip=nip;
             return true;
         }
    }           
}
