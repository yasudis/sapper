package ru.yasudis.sapper.controller;

import ru.yasudis.sapper.model.Model;
import ru.yasudis.sapper.view.ButtonType;
import ru.yasudis.sapper.view.CellEventListener;
import ru.yasudis.sapper.view.GameType;
import ru.yasudis.sapper.view.GameTypeListener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public interface ControllerListener extends CellEventListener, GameTypeListener, ActionListener {
    void updateModel(GameType gameType);

    void onMouseClick(int x, int y, ButtonType buttonType);

    void onGameTypeChanged(GameType gameType);

    void actionPerformed(ActionEvent e);

    void setModel(Model model);
}
