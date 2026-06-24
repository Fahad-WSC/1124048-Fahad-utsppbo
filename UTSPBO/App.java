package UTSPBO;

import controllers.DevoceController;
import views.DeviceView;

public class App {
    public static void main(String[] args) {
        DeviceController controller = new DeviceController();
        DeviceView view = new DeviceView(controller);

        view.Menu();
    }
}