package mezz.jei.recipes.furnace;

import mezz.jei.api.gui.IDrawable;
import mezz.jei.api.recipes.IRecipeType;
import mezz.jei.gui.resource.DrawableResource;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.StatCollector;

import javax.annotation.Nonnull;

public class RecipeTypeFurnace implements IRecipeType {

	@Nonnull
	private final IDrawable background;
	@Nonnull
	private final String localizedName;

	public RecipeTypeFurnace() {
		ResourceLocation location = new ResourceLocation("minecraft:textures/gui/container/furnace.png");
		this.background = new DrawableResource(location, 55, 16, 82, 54);
		this.localizedName = StatCollector.translateToLocal("gui.jei.furnaceRecipes");
	}

	@Nonnull
	public IDrawable getBackground() {
		return background;
	}

	@Nonnull
	@Override
	public String getLocalizedName() {
		return localizedName;
	}
}
