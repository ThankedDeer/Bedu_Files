package R2;

public class MultiplyBy2Command implements  Comand{
    @Override
    public int execute(int counter) {
        counter = counter * 2;
        return counter;
    }

    @Override
    public int unexecute(int counter) {
        counter = counter / 2;
        return counter;
    }
}
