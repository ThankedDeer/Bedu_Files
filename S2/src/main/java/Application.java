import java.util.EmptyStackException;
import java.util.Scanner;
import java.util.Stack;

import PostWork.*;
import R1.Motor;
import R1.MotorElectricoAdapter;
import R2.AddOne;
import R2.Comand;
import R2.MultiplyBy2Command;
import R2.addTend;
import e1.Singleton;
import e2.AnalysisLibrary;
import e2.StockMarketAdapter;
import e2.StockMarketReport;
import e3.Command;
import e3.TextEditor;

public class Application {
    public static void main(String[] args) throws Exception {


        System.out.println("--------------------------E1--------------------------");
        Singleton singleton = Singleton.getInstance("Bedu");
        Singleton singleton2 = Singleton.getInstance("Beto");

        System.out.println(singleton.value);
        System.out.println(singleton2.value);

        System.out.println("  ");
        System.out.println("--------------------------E2--------------------------");

        StockMarketReport report = new StockMarketAdapter();
        String json = report.dowload();

        AnalysisLibrary library = new AnalysisLibrary();

        library.AnalysisInformation(json);

        System.out.println("  ");
        System.out.println("--------------------------R1--------------------------");

        Motor motor = new MotorElectricoAdapter();
        motor.encender();
        motor.acelerar();
        motor.apagar();


        System.out.println("  ");
        System.out.println("--------------------------e3--------------------------");

        TextEditor aditor = new TextEditor();

        aditor.onPressSaveButton();
        aditor.onShortCut();
        aditor.onPressMenu();


        System.out.println("--------------------------R2--------------------------");


        Scanner sc = new Scanner(System.in);
        // lista para guardar los comandos
        Stack<Comand> stack = new Stack<>();

        //Instanciamos los comandos

        Comand command1 = new AddOne();
        Comand command2 = new MultiplyBy2Command();
        Comand command3 = new addTend();

        int counter = 0;

        int option = 0;

        while (option != 5) {
            System.out.println("\nValor actual: " + counter);
            System.out.println("Elige alguna opción:");
            System.out.println("1. Incrementa en uno el contador");
            System.out.println("2. Multiplica por 2 el contador");
            System.out.println("3. Añade 10 al contador");
            System.out.println("4. Deshacer último cambio");
            System.out.println("5. Salir");

            option = sc.nextInt();

            switch (option) {
                case 1:
                    counter = command1.execute(counter);
                    stack.add(command1);
                    break;
                case 2:
                    counter = command2.execute(counter);
                    stack.add(command2);
                    break;
                case 3:
                    counter = command3.execute(counter);
                    stack.add(command3);
                    break;
                case 4:
                    try {
                        Comand lastCOmmand = stack.pop();
                        if (lastCOmmand != null) {
                            counter = lastCOmmand.unexecute(counter);
                        }
                    } catch (EmptyStackException e) {
                        System.out.println("No hay más operaciones por deshacer");
                    }
                    break;

            }
        }


        System.out.println("--------------------------Post Work--------------------------");


        Helado suave = new HeladoSuave();


        suave = new CoberturaDecorator(suave);
        suave = new GranolaDecorator(suave);
        suave = new ToppingDecorator(suave);
        suave = new MermeladaDecorator(suave);
        suave = new GalletaDecorator(suave);

        System.out.println("[Ticket de compra]");
        System.out.println(suave.getDescription());
        System.out.println("$" + suave.getPrice());



    }
}
