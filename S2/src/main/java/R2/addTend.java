package R2;

public class addTend implements Comand{
    @Override
    public int execute(int counter) {
        counter = counter + 10;
        return counter;
    }

    @Override
    public int unexecute(int counter) {
        counter = counter - 10;
        return counter;
    }
}
