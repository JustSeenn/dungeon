package view;

public class JavaFXViewSingleton {
    private static boolean instance = false;
    private static JavaFXView view;

    private JavaFXViewSingleton() {
        instance = true;
        this.view = new JavaFXView();

    }

    public static JavaFXView getView(){
        if(!instance){
            new JavaFXViewSingleton();
        }
        return view;
    }
}
