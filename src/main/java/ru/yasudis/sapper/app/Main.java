package ru.yasudis.sapper.app;

import ru.yasudis.sapper.controller.Controller;
import ru.yasudis.sapper.controller.timer.GameTimer;
import ru.yasudis.sapper.controller.updateview.ViewUpdater;
import ru.yasudis.sapper.model.Model;
import ru.yasudis.sapper.view.MainWindow;

public class Main {
    public static void main(String[] args) {
        Application.builder()
                .model(new Model())
                .mainWindow(new MainWindow())
                .controller(new Controller())
                .viewUpdate(new ViewUpdater())
                .gameTimer(new GameTimer())
                .build();
    }
}
