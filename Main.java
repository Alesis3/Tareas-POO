public class Main {
    public static void main(String[] args) {
        {
            String s = "Hola";
            int x = s.length(); //retorna:4
            System.out.println(x);
        }

        {
            //1.3.1.2
            String s1 = "Hola";
            boolean b1 = s1.isEmpty(); //retorna:Falso
            String s2 = "";
            boolean b2 = s2.isEmpty(); //retorna:verdadero

        }

        {
            //1.3.1.3
            String t = "Hola";
            for (int i = 0; i < t.length(); i++) {

                char c = t.charAt(i);
                System.out.println(c); //Salida: H o l a


            }
        }

        {
            //1.3.1.4
            String z = "Hola";
            String y = "Hola";
            if (z.equals(y)) //compara sus contenidos, retorna true!
            {
                System.out.println("Si pasa por aqui");
            }
        }

        {
            //1.3.1.5
            String s3 = "Hola, como estas?";
            int p1 = s3.indexOf('a'); // retorna: 3
            int p2 = s3.lastIndexOf('a'); // retorna: 14
            System.out.println(p1);
            System.out.println(p2);
        }

        {
            //1.3.1.6
            String s4 = "Holla, como estas? Estas como querias? ";
            int p3 = s4.indexOf("como"); //retorna: 6
            int p4 = s4.indexOf("estas"); //retorna:11
            int p5 = s4.lastIndexOf("como"); //retorna24
            System.out.println(p3);
            System.out.println(p4);
            System.out.println(p5);

        }

        {
            //1.3.1.7
            String s5 = "Hola, como estas??";
            String may = s5.toUpperCase(); //retorna:HOLA, COMO ESTAS?
            String main = s5.toLowerCase(); //retorna:hola, como estas?
            System.out.println(may);
            System.out.println(main);
        }

        {
            //1.3.1.8
            String s6 = "Hola, como estas???";
            String s7 = s6.substring(0, 4); //retorna:Hola
            String s8 = s6.substring(6, 10); //retorna:como
            String s9 = s6.substring(11); //retorna: estas?
            System.out.println(s7);
            System.out.println(s8);
            System.out.println(s9);
        }

        {
            //1.3.1.9
            //enteros
            String s10 = "1234";
            int i2 = Integer.parseInt(s10); //retorna 1234
            String t1 = Integer.toString(i2); //retorna "1234"
            System.out.println(i2);
            System.out.println(t1);
            //flotantes
            String s11 = "1234.56";
            double d = Double.parseDouble(s11);  //retorna: 1234.56
            String t2 = Double.toString(d); //retorna:"1234.56"
            System.out.println(d);
            System.out.println(t2);
        }

        {
            //1.3.1.10
            String s12 = "Hola, ";
            String t3 = "que tal?";
            String u = s12 + t3; //retorna"Hola, que tal?"
            System.out.println(u);
        }

        {
            //1.3.2
            String s13 = "Hola";
            s13 += ", chau";
            System.out.println(s13); //Salida: chau
        }

        {
            //1.3.3.1
            StringBuilder sb = new StringBuilder();
            sb.append("Hola, ");
            sb.append("Chau");
            System.out.println(sb); //salida: Hola, chau
        }

        {
            //1.3.3.2
            StringBuilder sb1 = new StringBuilder("hola");
            sb1.setCharAt(2, 'X');
            System.out.println(sb1); //Salida: HoXa
        }


    }
}