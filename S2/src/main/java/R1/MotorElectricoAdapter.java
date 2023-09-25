package R1;

public class MotorElectricoAdapter extends Motor{

    private MotorElectrico motorElectrico;

    public MotorElectricoAdapter() {
        super();
        this.motorElectrico = new MotorElectrico();
        System.out.println("Creando motor Electrico adapter");
    }
    @Override
    public void encender() {

        System.out.println("Encenciando el motor");
        this.motorElectrico.conectar();
        this.motorElectrico.activar();

    }

    @Override
    public void acelerar() {
        System.out.println("Acelerando el moto");
        this.motorElectrico.moverMasRapido();

    }

    @Override
    public void apagar() {
        System.out.println("Apagando el motor ");
        this.motorElectrico.detener();
        this.motorElectrico.desconectar();

    }
}
