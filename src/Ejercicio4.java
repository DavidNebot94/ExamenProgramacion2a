package activitat2;
import java.io.File;
import java.io.RandomAccessFile;
import java.util.Arrays;
import java.util.Scanner;
    public class Ejercicio4 {
        public static void main(String[] args) {
            // TODO code application logic here
            EquipIns programa = new EquipIns();
            programa.inici();
        }
        public void inici(){
            System.out.println("Institutos....");
            System.out.println("1-Registrar los datos de los institutos ");
            System.out.println("2-Listar todos los institutos");
            System.out.println("3- Salir");
            System.out.println("Escoje una opción");
            Scanner lector = new Scanner(System.in);
            int punts=0;
            int enterLlegit =0;
            boolean llegit = false;
            while(!llegit){
                llegit = lector.hasNextInt();
                if (llegit){
                    enterLlegit = lector.nextInt();
                    switch (enterLlegit) {
                        case 1:
                            System.out.println("Registra los datos de los institutos:");
                            System.out.println("Quantos institutos participan en el concurso?");
                            boolean leido=false;
                            int enterLlegit2 =0;
                            while(!leido){
                                leido = lector.hasNextInt();
                                if (leido){
                                    enterLlegit2 = lector.nextInt();
                                    System.out.println("Numero total de centros: "+enterLlegit2);
                                    for (int j = 0; j < enterLlegit2; j++) {
                                        int i=0;
                                        i = enterLlegit2;
                                        if(enterLlegit2>0){
                                            System.out.println("-------------------------------------");
                                            System.out.println("Introduce la info sobre el instituto:");
                                            System.out.println("-------------------------------------");
                                            System.out.println("Id?");
                                            int idInst = lector.nextInt();
                                            System.out.println("Nom Institut:");
                                            String nomInst = lector.next();
                                            System.out.println("Nom Equip:");
                                            String nomEqui = lector.next();
                                            System.out.println();

                                            System.out.println("------------------------------------------");
                                            System.out.println("::INFORMACIÓN SOBRE CENTRO INSCRITO::");
                                            System.out.println("------------------------------------------");
                                            System.out.println("Id: " +idInst);
                                            System.out.println("Nom Institut: "+nomInst);
                                            System.out.println("Equip: "+nomEqui);
                                            System.out.println("Punts: "+punts);
                                            System.out.println();
                                        }
                                    }

                                }else{
                                    System.out.println("No has escrito un entero, vuelve a intentarlo");
                                    lector.next();
                                }
                            }

                            break;
                        case 2:
                            System.out.println("has escogido listar los institutos");

                            break;
                        case 3:
                            System.out.println("Hasta la próxima!");
                            break;
                        default:
                            System.out.println("No has escrito una opción válida");
                            System.out.println("Fin del programa");
                            break;}

                }else{
                    System.out.println("No has escrito un entero, vuelve a intentarlo");
                    lector.next();
                }
            }
            lector.nextLine();


        }
    }
}
