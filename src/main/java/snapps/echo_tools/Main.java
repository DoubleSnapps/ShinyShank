package snapps.echo_tools;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import snapps.echo_tools.items.EchoAxe;
import snapps.echo_tools.items.EchoSword;

public class Main implements ModInitializer {
    public static final EchoSword ECHO_SWORD = new EchoSword(new FabricItemSettings().group(ItemGroup.COMBAT).maxCount(1));
    public static final EchoAxe ECHO_AXE = new EchoAxe(new FabricItemSettings().group(ItemGroup.COMBAT).maxCount(1));
public static final String MOD_ID = "echo_tools";
    @Override
    public void onInitialize() {
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "echo_sword"), ECHO_SWORD);
    Registry.register(Registry.ITEM, new Identifier(MOD_ID, "echo_axe"), ECHO_AXE);

    }
}
