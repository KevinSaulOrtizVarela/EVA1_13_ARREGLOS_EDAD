
import java.util.Scanner;
/**
 * @author 16550549
 */
public class Principal {
    public static void main(String[] args) {
        //CUANTAS EDADES SE VA A CAPTURAR
        Scanner sCaptu = new Scanner(System.in);
        System.out.println("¿Cuantas edades se van a capturar?");
        int iCant = sCaptu.nextInt();
        //INICIALIZAR EL ARREGLO
        int aiEdades[] = new int[iCant];
        //CAPTURAR
        for (int i = 0; i < iCant; i++) {
            System.out.println("Introduce tu edad: ");
            aiEdades[i] = sCaptu.nextInt();
        }
        //CALCULAR EL PROMEDIO DE EDADES
        int iAcum = 0;
        for (int aiEdade : aiEdades) {
            iAcum = iAcum + aiEdade; // iAcum += ival ; EQUIVALENTES
        }
        double dProm = iAcum/iCant;
        System.out.println("El promedio es: " + (dProm));
    }

}
