package ru.yasudis.sapper.controller.records;

import ru.yasudis.sapper.view.GameType;
import ru.yasudis.sapper.view.RecordNameListener;

public interface RecordListener extends RecordNameListener {

    void run(int timerCount, GameType gameType);

    void saveSettings();

    Boolean isHighScore();
}
