/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.itson.lechuga.ui;

import java.util.ArrayList;
import java.util.List;
import mx.itson.lechuga.entidades.Paso;
import mx.itson.lechuga.entidades.Solución;
import mx.itson.lechuga.entidades.Usuario;
import mx.itson.lechuga.enumerador.Dificultad;

/**
 *
 * @author Alejandra Medina
 */
public class Main {
    public static void main(String[] args) {
    
        Solución solucion = new Solución();
        //Llenamos los espacios de nombre, dificultad y la descripción de lo que se realizará
        solucion.setNombre("Ecuaciones de segundo grado: x^2 +5x − 24 = 0");
        solucion.setDificultad(Dificultad.INTERMEDIO);
        solucion.setDescripcion("A continuación vamos a explicar los pasos básicos para resolver las ecuaciones de segundo grado");
        
        //Marcamos el inicio de la lista que se ocupara
        List<Paso> paso = new ArrayList<>();
        //Damos las instrucciones a seguir
        Paso paso1= new Paso();
        paso1.setDescripcion("Tomamos la A,B y C de la ecuación : A = x^2, B = +5x, C = − 24.");
        paso.add(paso1);
        
        Paso paso2= new Paso();
        paso2.setDescripcion("Teniendo la ecuación ahora buscamos dos números que, multiplicados, den C; y sumados den B. Es decir, que cumplan:\n" +
        "\n" +
        "x1·x2 = C = − 24\n" +
        "\n" +
        "x1 + x2 = B = 5");
        paso.add(paso2);
        
        Paso paso3= new Paso();
        paso3.setDescripcion("En este caso, −8 y 3 son dos números que cumplen estas condiciones, por lo que las raíces serán:\n" +
        "\n" +
        "(x +8)·(x − 3) = 0");
        paso.add(paso3);
        
        Paso paso4 = new Paso();
        paso4.setDescripcion("...Gracias por su atención...");
        paso.add(paso4);
        //Gusrdamos los datos en la lista
        solucion.setPaso(paso);
        
        Usuario usuario= new Usuario();
        //nombramos y llenamos la infirmación del usuario
        usuario.setNombre("Kiry");
        usuario.setCorreoElrctronico("Kiry042417@email.es");
        usuario.setContraseña("Zappatos096");
        solucion.setUsuario(usuario);
        
        //Mandamos todo a imprimir
        System.out.println(solucion.getNombre());
        System.out.println("Autor: "+solucion.getUsuario().getNombre());
        System.out.println("El nivel de dificultad es: "+solucion.getDificultad());
        System.out.println(solucion.getDescripcion());
        System.out.println("Pasos");
        for(Paso p : solucion.getPaso()){
            System.out.println(p.getDescripcion());
        }
        
        
    }
}
