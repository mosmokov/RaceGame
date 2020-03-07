package com.fogok.racegame.view;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.fogok.racegame.model.Car;

public class GameScreen implements Screen {

    private Texture carTexture;
    private SpriteBatch batch;
    private Car car;

    @Override
    public void show() {
        batch = new SpriteBatch();
        carTexture = new Texture(Gdx.files.internal("Car.png"));
        car = new Car(carTexture, 0 ,0, 89, 183);
    }

    private float positionY = 0f;

    @Override
    public void render(float delta) {
        Gdx.gl.glClearColor(0,0,0,1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);


        batch.begin();
        car.draw(batch);
        batch.end();

    }

    @Override
    public void resize(int width, int height) {


    }

    @Override
    public void pause() {


    }

    @Override
    public void resume() {


    }

    @Override
    public void hide() {


    }

    @Override
    public void dispose() {

    }
}
