package colas_trabajo1;

import java.util.Scanner;

public class colas {
    Scanner leer=new Scanner(System.in);
   int COLA[]=new int[5];
    private int MAX;
    private int FRENTE;
    private int FINAL;

    public colas()
    {
        this.MAX = 100;
        this.FRENTE = 0;
        this.FINAL = 0;
        this.COLA = new int[this.MAX+1];
    }

    public colas(int MAX)
    {
        this.MAX = MAX;
        this.FRENTE = 0;
        this.FINAL = 0;  
        this.COLA = new int[this.MAX+1];
    }  
    
    public boolean IsColaLlena()
    {
        if(this.FINAL == this.MAX)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public boolean IsColaVacia()
    {
        if(this.FRENTE == this.FINAL)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    
    public void InsertarCola()
    {
        if(this.IsColaLlena())
        {
            System.out.println("LA COLA ESTÁ LLENA");
        }
        else
        {
            int valor;
            System.out.println("Ingrese el valor a agregar");
            valor = leer.nextInt(); 
            this.FINAL++; 
            this.COLA[FINAL] = valor;
                       
        }
    }

    public void EliminarCola()
    {
       if(this.FRENTE == this.FINAL)
        {
       System.out.println("LA COLA ESTA VACIA");
        }
        else
        {            
            for(int i=FRENTE;i < FINAL;i++)
            {
                COLA[i] = COLA[i+1];
            }
            
            FINAL--;
        }
    }

    public void MostrarCola()
    {
        if(this.IsColaVacia())
        {
            System.out.println("La cola esta vacia");
            
        }
        else
        {
            String MOSTRAR = "";
            
            for(int i=FRENTE+1;i<=FINAL;i++)
            {
                MOSTRAR = MOSTRAR + COLA[i]+"\n";
            }
            
            System.out.println("LOS DATOS DE LA COLA SON :\n"+MOSTRAR);
        }
    }

    public void VaciarCola()
    {
        FRENTE = 0;
        FINAL = 0;
    }       
}

        
    
    
    
    
