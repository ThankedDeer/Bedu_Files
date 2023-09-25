package R2;

public class AddOne implements Comand{
    @Override
    public int execute(int counter) {
        counter = counter + 1;
        return counter;
    }

    @Override
    public int unexecute(int counter) {
        counter = counter - 1;
        return counter;
    }
}
