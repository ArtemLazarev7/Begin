import java.util.Arrays;

public class MainLoop {
    public static void main(String[] args) {
        char[][] array = new char[6][];
        array[0] = new char[9];
        array[1] = new char[7];
        array[2] = new char[7];
        array[3] = new char[13];
        array[4] = new char[7];
        array[5] = new char[8];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = '*';
            }
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j]+" " );
                if (i == 0 & j == 4)
                    System.out.print("         ");
                else if (i == 0 & j == 5)
                    System.out.print("       ");
                else if (i == 0 & j == 6)
                    System.out.print("          ");
                else if (i == 0 & j == 7)
                    System.out.print("       ");
                else if (i == 0 & j == 8){
                    System.out.println();
                System.out.print("        ");}

                else if(i==1&j==0)
                    System.out.print("       ");
                else if(i==1&j==1)
                    System.out.print("  ");
                else if( i==1&j==2)
                    System.out.print("      ");
                else if(i==1&j==3)
                    System.out.print("        ");
                else if (i==1&j==4)
                System.out.print("      ");
                else if(i==1 & j==5)
                    System.out.print("  ");
                else if(i==1 & j==6){
                    System.out.println();
                    System.out.print("        ");
                }

                else if (i==2&j==0)
                    System.out.print("      ");
                else if (i==2&j==1)
                    System.out.print("    ");
                else if (i==2&j==2)
                    System.out.print("      ");
                else if (i==2&j==3)
                    System.out.print("      ");
                else if(i==2&j==4)
                System.out.print("      ");
                else if(i==2&j==5)
                    System.out.print("    ");
                else if(i==2&j==6){
                    System.out.println();
                    System.out.print("        ");
                }

                else if(i==3&j==0)
                    System.out.print("     ");
                else if(i==3&j==5)
                    System.out.print("      ");
                else if(i==3&j==6)
                    System.out.print("    ");
                else if(i==3&j==7)
                    System.out.print("      ");
                else if(i==3&j==12) {
                    System.out.println();
                    System.out.print("      ");
                }

                else if(i==4&j==0)
                    System.out.print("      ");
                else if(i==4&j==1)
                    System.out.print("        ");
                else if(i==4&j==2)
                    System.out.print("      ");
                else if(i==4&j==3)
                    System.out.print("  ");
                else if(i==4&j==4)
                    System.out.print("      ");
                else if(i==4&j==5)
                    System.out.print("        ");
                else if(i==4&j==6)
                    System.out.println();
                
                else if(i==5&j==2)
                    System.out.print("       ");
                else if(i==5&j==3)
                    System.out.print("          ");
                else if(i==5&j==4)
                    System.out.print("       ");
                else if(i==5&j==5)
                    System.out.print("       ");
                else if(i==5&j==6)
                    System.out.print("          ");

            }
        }

    }
}


