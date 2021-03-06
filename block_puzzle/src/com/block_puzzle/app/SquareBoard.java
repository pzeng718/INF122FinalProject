package com.block_puzzle.app;

import com.tmge.app.AbstractBoard;
import com.tmge.app.tile.DefaultTile;
import lombok.Getter;

@Getter
public class SquareBoard extends AbstractBoard<DefaultTile> {
    private final Level level;

    public SquareBoard(Level level) {
        super();
        this.level = level;
    }

    public void init() {
        ((SquareTilesCollection) getTilesCollection()).init(getLevel());
    }

    @Override
    protected SquareTilesCollection createTilesCollection() {
        return new SquareTilesCollection();
    }
}
