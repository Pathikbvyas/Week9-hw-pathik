/*10.	Write the programme that tell you which line pass through particular stations.
 Just use Zone 1 stations name.
 */

import java.util.Scanner;

public class Programme10_TubeStation {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("jubilee\n central\ndistrict\nnorthern\n Bakerloo\n metropolitan");
        System.out.println("------------------");
        System.out.println("Please enter Train Name from  above List:");
        String city=scanner.nextLine();

        Programme10_TubeStation obj=new Programme10_TubeStation();
        obj.stationName(city);
        scanner.close();
    }
    public void stationName(String city){
        switch (city){
            case "jubilee":
                System.out.println("Baker Street,Bond Street,Green Park,Westminster,Waterloo");
                break;
            case "central":
                System.out.println("Marble Arch,Bond Street,Banks,Oxfrod Circus,Picadilly circus");
                break;
            case "district":
                System.out.println("Tower Hill,Moument,Westminster,Victoria,Earls Court");
                break;
            case "northern":
                System.out.println("Euston,Warren Street,Leicester Square,Waterloo");
                break;
            case "Bakerloo":
                System.out.println("Edware road,Marlebone,Oxford Circus,Picadilly Circus");
                break;
            case "metropolitan":
                System.out.println("Baker street,Euston Square,Kings Cros,Liverpool Street");
                break;
            default:
                System.out.println("Please enter correct train name:");
        }
    }
}
