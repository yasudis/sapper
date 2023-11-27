package ru.yasudis.sapper.model.cell;

public class EmptyGameCell implements Cell {

    @Override
    public String toString() {
        return "  ";
    }

    @Override
    public CellType getType() {
        return CellType.EMPTY_TYPE;
    }
}
