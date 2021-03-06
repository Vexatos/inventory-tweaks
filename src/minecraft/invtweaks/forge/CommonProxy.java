package invtweaks.forge;

import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import invtweaks.api.IItemTreeListener;
import invtweaks.api.InvTweaksAPI;
import net.minecraft.client.multiplayer.PlayerControllerMP;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;

public class CommonProxy implements InvTweaksAPI {
    public void preInit(FMLPreInitializationEvent e) {
    }

    public void init(FMLInitializationEvent e) {
    }

    public void postInit(FMLPostInitializationEvent e) {
    }

    public void setServerAssistEnabled(boolean enabled) {
    }

    public void setServerHasInvTweaks(boolean hasInvTweaks) {
    }

    /* Action values:
     * 0: Standard Click
     * 1: Shift-Click
     * 2: Move item to/from hotbar slot (Depends on current slot and hotbar slot being full or empty)
     * 3: Duplciate item (only while in creative)
     * 4: Drop item
     * 5: Spread items (Drag behavior)
     * 6: Merge all valid items with held item
     */
    public void slotClick(PlayerControllerMP playerController, int windowId, int slot, int data, int action,
                          EntityPlayer player) {
    }

    public void sortComplete() {

    }

    @Override
    public void addOnLoadListener(IItemTreeListener listener) {

    }

    @Override
    public boolean removeOnLoadListener(IItemTreeListener listener) {
        return false;
    }

    @Override
    public void setSortKeyEnabled(boolean enabled) {
    }

    @Override
    public void setTextboxMode(boolean enabled) {
    }

    @Override
    public int compareItems(ItemStack i, ItemStack j) {
        return 0;
    }

}
