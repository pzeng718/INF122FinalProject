package com.block_puzzle.ui;

import com.block_puzzle.Game;
import com.block_puzzle.ui.views.select_player.SelectPlayerView;
import com.tmge.ui.AbstractStageManager;
import javafx.scene.Parent;

/**
 * @author vladshaternik on 2/21/21
 */
public class StageManager extends AbstractStageManager {

    public StageManager() {
        super();
        Game.getInstance().setStageManager(this);
    }

    @Override
    protected Parent firstView() {
        return new SelectPlayerView(Game.getInstance().getPlayerManager().getPlayers()).init();
    }
}
