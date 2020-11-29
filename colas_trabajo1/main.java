package colas_trabajo1;

import java.util.Scanner;


    public class main {
        
    public static colas Cola;
    
    public static void main(String[] args) {  
        Scanner leer=new Scanner (System.in);
        
        int MAX;
        System.out.println("Ingrese el tamaño de la cola");
        MAX = leer.nextInt();
        Cola = new colas(MAX);
         MenuCola();
       }
        public static void MenuCola()
    {
        Scanner leer=new Scanner (System.in);
        int Opcion;
        
        do
        {
            System.out.println("*********MENÚ**********");
            System.out.println("1. Ingresar datos");
            System.out.println("2. Eliminar datos");
            System.out.println("3. Mostrar datos");
            System.out.println("4. Vaciar cola");
            System.out.println("5. Salir");
            System.out.println("ingrese alguna de las opciones");  
           
            Opcion=leer.nextInt();
            switch(Opcion)
            
            {
                case 1: 
                    Cola.InsertarCola();
                    break;
                case 2: 
                    Cola.EliminarCola();
                    break;
                case 3: 
                    Cola.MostrarCola();
                    break;
                case 4: 
                    Cola.VaciarCola();
                    break;
                case 5: 
                    
                    System.exit(0);
                    break;
                default: 
                    
                    System.out.println("Ingrese una opción valida");
                    break;
            }
        }
        while(true); 
    }
}

    

     
