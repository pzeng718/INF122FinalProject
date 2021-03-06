package com.matchington.app.tile;

import com.tmge.app.tile.TileTypeInfo;
import lombok.Getter;
import lombok.extern.java.Log;

/**
 * @author vladshaternik on 2/27/21
 */
@Getter
@Log
public enum TileType implements TileTypeInfo {

    DIAMOND("diamond-pictures/diamond2.png", "Diamond"),
    CRYSTAL("crystal-pictures/crystal2.png", "Crystal"),
    COIN("coin-pictures/coin5.png", "Coin"),
    CANDY("candy.png", "Candy")
    ;

    private final String src;
    private final String name;

    TileType(String src, String name) {
        this.src = src;
        this.name = name;
    }
}
