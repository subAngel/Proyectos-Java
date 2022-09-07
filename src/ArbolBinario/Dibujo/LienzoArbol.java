
package ArbolBinario.Dibujo;

import ArbolBinario.logica.Arbol;
import javax.swing.JFrame;

/**
 *
 * @author angel
 */
public class LienzoArbol {
    // Patron MVC
    public static void main(String[] args) {
        ArbolBinario.logica.Arbol objArbol = new Arbol(); // MODELO
        Lienzo objLienzo = new Lienzo(); // VISTA
        Controlador objControlador = new Controlador(objLienzo, objArbol);
        
        // INSERTAR Y PINTAR ARBOL
        objArbol.insertar(7);
        objArbol.insertar(2);
        objArbol.insertar(9);
        objArbol.insertar(5);
        objArbol.insertar(0);
        objArbol.insertar(10);
        objControlador.iniciar();
        
        // Mostrar el lienzo en una ventana
        JFrame ventana = new JFrame();
        ventana.getContentPane().add(objLienzo);
        ventana.setDefaultCloseOperation(3);
        ventana.setSize(600, 600);
        ventana.setLocationRelativeTo(null);
        ventana.setVisible(true);
        
    }
}
