package fruitstack.dyerevoker;

import net.minecraft.core.block.Block;
import net.minecraft.core.data.DataLoader;
import net.minecraft.core.data.registry.Registries;
import net.minecraft.core.data.registry.recipe.RecipeGroup;
import net.minecraft.core.data.registry.recipe.RecipeNamespace;
import net.minecraft.core.data.registry.recipe.RecipeSymbol;
import net.minecraft.core.data.registry.recipe.entry.RecipeEntryCrafting;
import net.minecraft.core.item.ItemStack;
import turniplabs.halplibe.util.RecipeEntrypoint;

public class DyeRevokerRecipes implements RecipeEntrypoint {
	public static final RecipeNamespace DYEREVOKER = new RecipeNamespace();
	//public static final RecipeGroup<RecipeEntryCrafting<?, ?>> WORKBENCH = new RecipeGroup<>(new RecipeSymbol(new ItemStack(Block.workbench)));
	public static final RecipeGroup<RecipeEntryCrafting<?, ?>> TROMMELACTIVE = new RecipeGroup<>(new RecipeSymbol(new ItemStack(Block.trommelActive)));
	@Override
	public void onRecipesReady() {
		//DYEREVOKER.register("workbench", WORKBENCH);
		//Registries.RECIPES.register("dyerevoker", DYEREVOKER);
		//DataLoader.loadRecipes("/assets/dyerevoker/recipes/workbench.json");

		DYEREVOKER.register("trommel", TROMMELACTIVE);
		Registries.RECIPES.register("dyerevoker", DYEREVOKER);
		DataLoader.loadRecipes("/assets/dyerevoker/recipes/trommel.json");
	}

	/*JSON EXAMPLE FOR CRAFTING TABLE
	[
  {
    "name": "minecraft:workbench/stone",
    "type": "minecraft:crafting/shaped",
    "pattern": [
      "AAA",
      "ABA",
      "AAA"
    ],
    "symbols": [
      {
        "symbol": "A",
        "stack": {
          "key": "item.ingot.iron",
          "amount": 1,
          "meta": 0
        }
      },
      {
        "symbol": "B",
        "stack": {
          "key": "tile.furnace.stone.idle",
          "amount": 1,
          "meta": 0
        }
      }
    ],
    "result": {
      "key": "tile.stone",
      "amount": 1,
      "meta": 0
    },
    "consumeContainers": true
  }
]
	 */
}
