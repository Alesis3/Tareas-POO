import java.util.Scanner;

public class JuegoGato
{

    public static void main (String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduce juego: ");
        String juego = teclado.nextLine();
        juego = juego.toUpperCase();
        Boolean correcto = juego.matches("[X,O,_]*");

        if (juego.length() == 9 && correcto == true )
        {
            String j1 = juego.substring(0,1);
            String j2 = juego.substring(1, 2);
            String j3 = juego.substring(2,3);
            String j4 = juego.substring(3,4);
            String j5 = juego.substring(4,5);
            String j6 = juego.substring(5,6);
            String j7 = juego.substring(6,7);
            String j8 = juego.substring(7,8);
            String j9 = juego.substring(8);



            String cuadro[][] = new String[5][5];
            int ilera = 0;

            cuadro[0][0] = "-";
            cuadro[1][0] = "|";
            cuadro[2][0] = "|";
            cuadro[3][0] = "|";
            cuadro[4][0] = "-";

            cuadro[0][1] = "-";
            cuadro[1][1] = j1 ;
            cuadro[2][1] = j4 ;
            cuadro[3][1] = j7 ;
            cuadro[4][1] = "-";

            cuadro[0][2] = "-";
            cuadro[1][2] = j2 ;
            cuadro[2][2] = j5 ;
            cuadro[3][2] = j8 ;
            cuadro[4][2] = "-";

            cuadro[0][3] = "-";
            cuadro[1][3] = j3 ;
            cuadro[2][3] = j6 ;
            cuadro[3][3] = j9 ;
            cuadro[4][3] = "-";

            cuadro[0][4] = "-";
            cuadro[1][4] = "|";
            cuadro[2][4] = "|";
            cuadro[3][4] = "|";
            cuadro[4][4] = "-";

            for (int i = 0; i <= 4; i++)
            {
                for (int j = 0; j <= 4; j++)
                {

                    System.out.print(cuadro[ilera][j]);

                }
                ilera++;
                System.out.print("\n");

            }


        }
        else
        {
            System.out.print("Ingrese un juego valido");
        }
    }
}