package ru.yasudis.sapper.model.cell;

public class BombGameCell implements Cell {

    @Override
    public String toString() {
        return " *";
    }

    @Override
    public CellType getType() {
        return CellType.BOMB_TYPE;
    }
}
