package com.daemon.main;

import com.daemon.app.GameWindow;
import com.daemon.var.__Int;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.Color;

public class SnakeObject extends TileObject implements KeyListener {
    public SnakeObject(int __xLocation, int __yLocation, int __width, int __height, Color color) {
        super(__xLocation, __yLocation, __width, __height, color);
        super.addKeyListener(this);
        super.setFocusable(true);
        super.requestFocusInWindow();
    }

    public class Direction {
        public static final int UP = __Int.SNAKE_DIRECTION_KEYCODE__UP;
        public static final int DOWN = __Int.SNAKE_DIRECTION_KEYCODE__DOWN;
        public static final int LEFT = __Int.SNAKE_DIRECTION_KEYCODE__LEFT;
        public static final int RIGHT = __Int.SNAKE_DIRECTION_KEYCODE__RIGHT;
    }

    @Override
    public void keyPressed(KeyEvent e) {
        move(e.getKeyCode());
    }

    @Override
    public void keyReleased(KeyEvent e) {}

    @Override
    public void keyTyped(KeyEvent e) {}

    public void move(int direction) {
        if(direction == Direction.UP) {
            this.yLocation += __Int.TILE_SIZE;
        } else if(direction == Direction.DOWN) {
            this.yLocation -= __Int.TILE_SIZE;
        } else if(direction == Direction.LEFT) {
            this.xLocation -= __Int.TILE_SIZE;
        } else if(direction == Direction.RIGHT) {
            this.xLocation += __Int.TILE_SIZE;
        } else {}
        GameWindow.update();
    }

    public void feed() {
        
    }
}
