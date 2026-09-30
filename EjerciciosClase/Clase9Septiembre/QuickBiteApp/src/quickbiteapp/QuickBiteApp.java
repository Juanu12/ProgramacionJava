/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package quickbiteapp;

import quickbite.modelo.Cliente;
import quickbite.modelo.Pedido;
import quickbite.modelo.Plato;

/**
 *
 * @author Juan Umaña
 */
public class QuickBiteApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        // Crear 3 Paltos
        Plato p1 = new Plato("Bandeja Paisa", 28000, 20);
        Plato p2 = new Plato("Ajiaco Santafereño", 24000, 6);
        Plato p3 = new Plato("Arroz con Pollo", 25000, 9);

        // Crea 2 cliente
        Cliente c1 = new Cliente("Sofia Sanchez", "sofia@unab.edu.com.co", 80000);
        Cliente c2 = new Cliente("Juan  Gomez", "juan@unab.edu.com.co", 70000);

        // Crear pedidio
        // Pedido que se puede completar
        Pedido ped1 = new Pedido(c1, p1, 2);

        // Pedido con saldo insuficiente
        Pedido ped2 = new Pedido(c2, p1, 1);

        // Pedido con porciones insuficientes
        Pedido ped3 = new Pedido(c1, p2, 4);

        // Mostar informacion de platos
        
        System.out.println("================= MENÚ QUICKBITE =================");
        p1.mostrarInformacion();
        p2.mostrarInformacion();
        p3.mostrarInformacion();
        System.out.println("==================================================\n");

        //Info Clientes
        System.out.println("================= Clientes =======================");
        c1.mostrarInformacion();
        c2.mostrarInformacion();
        System.out.println("==================================================\n");
        
        //Pedidos
        //Pedido 1
        System.out.println("=================== Pedido 1 ===================");
        ped1.mostrarResumen();
        System.out.println("================================================\n");
        //Pedido 2
        System.out.println("=================== Pedido 2 ===================");
        ped2.mostrarResumen();
        System.out.println("================================================\n");
        //Pedido 2
        System.out.println("=================== Pedido 3 ===================");
        ped3.mostrarResumen();
        System.out.println("================================================\n");
        
        //Info Platos
        System.out.println("================= MENÚ QUICKBITE =================");
        p1.mostrarInformacion();
        p2.mostrarInformacion();
        p3.mostrarInformacion();
        System.out.println("==================================================\n");

    }

}