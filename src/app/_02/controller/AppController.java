package app._02.controller;

import app._02.model.AppModel;
import app._02.viev.AppView;

public class AppController {

    public void runApp() {
        AppView view = new AppView();
        AppModel model = new AppModel();
        String choice = view.getChoice();
        switch (choice) {
            case "1" -> view.getOutput(model.writeFile(view.getWriteData()));
            case "2" -> view.getOutput(model.readFile(view.getReadData()));
            case "0" -> {
                view.getOutput("App closed.");
                System.exit(0);
            }
            default -> view.getOutput("Wrong value " + choice);
        }
    }
}
