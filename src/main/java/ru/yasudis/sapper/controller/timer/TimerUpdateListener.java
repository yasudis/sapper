package ru.yasudis.sapper.controller.timer;

import ru.yasudis.sapper.controller.updateview.ViewUpdateListener;

import java.util.TimerTask;

public abstract class TimerUpdateListener extends TimerTask {
    @Override
    public abstract void run();

    public abstract void stop();

    public abstract void reset();

    public abstract void setUpdateListener(ViewUpdateListener updateListener);

    public abstract int getTimer();

}
