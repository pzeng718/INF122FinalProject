package com.candycrush.ui.views.game.dialog;

import com.tmge.app.player.DefaultPlayer;
import com.tmge.ui.components.AbstractDialog;
import com.tmge.ui.components.UIComponents;
import javafx.scene.Node;
import javafx.stage.Window;
import lombok.Getter;

import java.util.Optional;

/**
 * @author vladshaternik on 3/2/21
 */
@Getter
public class WinDialog extends AbstractDialog<Boolean> {

    private final DefaultPlayer player;

    public WinDialog(DefaultPlayer player, Window window) {
        super(window);
        this.player = player;
    }

    @Override
    protected Optional<Boolean> buildResult() {
        return Optional.of(true);
    }

    @Override
    protected String getButtonOkString() {
        return "";
    }

    @Override
    protected String getButtonCancelString() {
        return "Back";
    }

    @Override
    protected Node buildContent() {
        return createVBoxForNodes(UIComponents.createTitleLabel(getPlayer().getUsername() + " Wins!"));
    }

    @Override
    protected String getTitleString() {
        return getPlayer().getUsername() + " Wins!";
    }
}
