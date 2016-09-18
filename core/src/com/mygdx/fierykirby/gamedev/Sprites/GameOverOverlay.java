package com.mygdx.fierykirby.gamedev.Sprites;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.math.Vector2;
import com.mygdx.fierykirby.gamedev.Level;
import com.mygdx.fierykirby.gamedev.Utility.Assets;
import com.mygdx.fierykirby.gamedev.Utility.Utils;

import static com.mygdx.fierykirby.gamedev.Utility.Constants.INITIAL_OVERLAY_POS;
import static com.mygdx.fierykirby.gamedev.Utility.Constants.OVERLAY_SCALE;
import static com.mygdx.fierykirby.gamedev.Utility.Constants.OVERLAY_SPEED;

/**
 * Created by galaxywizkid on 9/13/16.
 */
public class GameOverOverlay {

    Level level;
    Vector2 position;

    public GameOverOverlay(Level level) {
        this.level = level;
        position = INITIAL_OVERLAY_POS;
    }

    public void update(float delta) {

        if (level.getGameOver() && position.x > level.getViewport().getWorldWidth() / 2 - 50) {
            position.x -= delta * OVERLAY_SPEED;
        }
    }

    public void render(SpriteBatch batch) {
        TextureRegion region = Assets.instance.kirbyAssets.gameOver;
        Utils.drawTextureRegion(batch, region, position.x, position.y, OVERLAY_SCALE);
    }
}
