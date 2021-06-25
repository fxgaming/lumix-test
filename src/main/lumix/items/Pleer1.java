package lumix.items;
import lumix.Kernel;
import net.minecraft.client.Minecraft;
import net.minecraft.client.audio.PositionedSoundRecord;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;
import net.minecraftforge.client.event.sound.SoundEvent;
public class Pleer1 extends Item {
	public Pleer1()
	{
		super();
		this.setTextureName("lumixkernel:Pleer1");
		this.setFull3D();
	}

    public boolean onItemUse(ItemStack Is, EntityPlayer PlayerEntity, World World, int p_77648_4_, int p_77648_5_, int p_77648_6_, int p_77648_7_, float p_77648_8_, float p_77648_9_, float p_77648_10_)
    {
    	if (!World.isRemote)
    	{
    		PlayerEntity.worldObj.playSoundAtEntity(PlayerEntity, Kernel.MODID + ":" + "train.trahtar", 1.0F, 1.0F);
    	}
        return true;
    }
}
