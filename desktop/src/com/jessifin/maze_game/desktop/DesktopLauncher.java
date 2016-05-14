package com.jessifin.maze_game.desktop;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.jessifin.maze_game.MazeGame;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		new LwjglApplication(new MazeGame(), config);
		config.width = Gdx.graphics.getWidth();
		config.height = Gdx.graphics.getHeight();
		//config.fullscreen = true;
		config.title = "Maze Game";
	}
}
