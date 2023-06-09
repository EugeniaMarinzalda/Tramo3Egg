
package g12_ejer2y3;

import g12_ejer2y3.entidades.Electrodomestico;
import g12_ejer2y3.entidades.Lavadora;
import g12_ejer2y3.entidades.Televisor;
import java.util.ArrayList;
import service.ServiceLavadora;
import service.ServiceTele;

public class G12_ejer2y3 {
 
    public static void main(String[] args) {
        /*
        EJERCICIO 2  ------------------------
        Finalmente, en el main debemos realizar lo siguiente:
        Vamos a crear una Lavadora y un Televisor y llamar a los métodos necesarios para mostrar
        el precio final de los dos electrodomésticos.
                
        ServiceLavadora sl = new ServiceLavadora();
        Lavadora l = sl.crearLavadora();
        sl.precioFinal(l);
        System.out.println(l.toString());
        System.out.println("------------------");
        ServiceTele st = new ServiceTele();
        Televisor t = st.crearTelevisor();
        st.precioFinal(t);
        System.out.println(t.toString());
        */
        /*
        EJERCICIO 3  ------------------------
        Siguiendo el ejercicio anterior, en el main vamos a crear un ArrayList de Electrodomésticos
para guardar 4 electrodomésticos, ya sean lavadoras o televisores, con valores ya asignados.

        */
        ArrayList <Electrodomestico> Electros = new ArrayList();
        ServiceLavadora sl = new ServiceLavadora();
        ServiceTele st = new ServiceTele();

        Lavadora l1 = new Lavadora (40, 0, 54, "GRIS ", 'A'); 
        Electros.add(l1);
        
        Lavadora l2 = new Lavadora(10, 0, 10 , "ROJA ", 'E'); 
        Electros.add(l2);
        
        Televisor t1 =new Televisor( 45,  true ,  0 ,  20, "AZUL" , 'B'); // 
        Electros.add(t1);
        
        Televisor t2 =new Televisor(20,  false ,  0 ,  82, "NEGRA" , 'F');
        Electros.add(t2);
        
        /*
        Luego, recorrer este array y ejecutar el método precioFinal() en cada electrodoméstico. Se
deberá también mostrar el precio de cada tipo de objeto, es decir, el precio de todos los
televisores y el de las lavadoras. Una vez hecho eso, también deberemos mostrar, la suma del
precio de todos los Electrodomésticos. Por ejemplo, si tenemos una lavadora con un precio de
2000 y un televisor de 5000, el resultado final será de 7000 (2000+5000) para
electrodomésticos, 2000 para lavadora y 5000 para televisor.
        */
        double totalLava=0 , totalTele= 0, total = 0; 
        for (Electrodomestico aux : Electros) {
            System.out.println(aux);
            
            if (aux instanceof Lavadora) {
                Lavadora lavadora = (Lavadora) aux;
                sl.precioFinal(lavadora);
                System.out.println("El precio de la Lavadora " + "es " + lavadora.getPrecio());
                totalLava+= lavadora.getPrecio();
                total+=lavadora.getPrecio();
            } else if (aux instanceof Televisor){
                Televisor tele = (Televisor) aux;
                st.precioFinal(tele);
                System.out.println("El precio del Televisor es " + tele.getPrecio());
                totalTele+= tele.getPrecio();
                total+= tele.getPrecio();
            }
        }
        System.out.println("Total Lavadoras= " + totalLava);
        System.out.println("Total Televisores= " + totalTele);
        System.out.println("Total Electro= " + total);
    }
    
}

