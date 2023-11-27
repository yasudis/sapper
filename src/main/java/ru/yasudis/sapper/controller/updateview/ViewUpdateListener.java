package ru.yasudis.sapper.controller.updateview;

import ru.yasudis.sapper.controller.records.RecordListener;
import ru.yasudis.sapper.controller.timer.TimerUpdateListener;
import ru.yasudis.sapper.model.GameState;
import ru.yasudis.sapper.model.cell.GameCell;
import ru.yasudis.sapper.view.GameType;
import ru.yasudis.sapper.view.MainWindow;

public interface ViewUpdateListener {

    void newGame(GameType gameType);

    void updateGameState(GameState gameState);

    void updateCell(GameCell gameCell, int i, int j);

    void updateGameTimer(int timer);

    void updateBombCount(int bombCount);

    ViewUpdateListener setGameTimer(TimerUpdateListener gameTimer);

    ViewUpdateListener setRecord(RecordListener records);

    ViewUpdateListener setMainWindow(MainWindow mainWindow);

}
