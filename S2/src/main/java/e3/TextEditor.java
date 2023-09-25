package e3;

public class TextEditor {
    private Command saveCommand;

    public TextEditor(){
        saveCommand = new SaveCommand();
    }
    public void onPressSaveButton(){
        System.out.println("[Saved Button");
        saveCommand.execute();
    }
    public void onPressMenu(){
        System.out.println("[Menu");
        saveCommand.execute();
    }
    public void onShortCut(){
        System.out.println("[ShortCu");
        saveCommand.execute();
    }


}
