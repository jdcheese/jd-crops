package com.jdcheese.jdcrops.menu.custom;

import com.jdcheese.jdcrops.JdCrops;
import net.minecraft.client.gui.GuiGraphicsExtractor;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.renderer.RenderPipelines;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.Identifier;
import net.minecraft.world.entity.player.Inventory;

public class FermentingScreen extends AbstractContainerScreen<FermentingMenu> {
    private static final Identifier GUI_TEXTURE =
            Identifier.fromNamespaceAndPath(JdCrops.MOD_ID,"textures/gui/fermenting_block_gui.png");
    private static final Identifier ARROW_TEXTURE =
            Identifier.fromNamespaceAndPath(JdCrops.MOD_ID,"textures/gui/arrow_progress.png");

    public FermentingScreen(FermentingMenu menu, Inventory inventory, Component title) {
        super(menu, inventory, title);
        this.titleLabelX = (this.imageWidth - this.font.width(this.title)) / 2;
    }

    @Override
    public void extractBackground(GuiGraphicsExtractor graphics, int mouseX, int mouseY, float a) {
        super.extractBackground(graphics, mouseX, mouseY, a);
        int x = (width - imageWidth) / 2;
        int y = (height - imageHeight) / 2;

        graphics.blit(RenderPipelines.GUI_TEXTURED, GUI_TEXTURE, x, y, 0, 0,
                imageWidth, imageHeight, 256, 256);

        renderProgressArrow(graphics, x, y);
    }

    private void renderProgressArrow(GuiGraphicsExtractor guiGraphics, int x, int y) {
        if(menu.isCrafting()) {
            guiGraphics.blit(RenderPipelines.GUI_TEXTURED, ARROW_TEXTURE,
                    x + 73, y + 35,
                    0, 0,
                    menu.getScaledArrowProgress(), 16,
                    24, 16);
        }
    }
}
