package com.krumlauf.alchemy.tools;

import com.krumlauf.alchemy.items.ItemBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.*;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.world.Explosion;
import net.minecraft.world.World;

public class Gauntlet extends ItemBase {
    public Gauntlet(String gauntlet)
    {
        super(gauntlet);
    }

    @Override
    public ActionResult<ItemStack> onItemRightClick(World worldIn, EntityPlayer playerIn, EnumHand handIn) {

        RayTraceResult objectMouseOver = playerIn.rayTrace(20,1);
        BlockPos block = objectMouseOver.getBlockPos();
//        worldIn.createExplosion(playerIn, block.getX(), block.getY(), block.getZ(), 2, true);
        Explosion explosion = new Explosion(worldIn, playerIn, block.getX(),
                block.getY(), block.getZ(), 1, false, false);
        explosion.doExplosionA();
        explosion.doExplosionB(true);


        ItemStack item = playerIn.getHeldItem(handIn);
        // launch a fireball
//        Vec3d aim = playerIn.getLookVec();
//        EntityLargeFireball fireball = new EntityLargeFireball(worldIn, playerIn, 1,1,1);
//
//        fireball.setPosition(playerIn.posX + aim.x * 1.1D, playerIn.posY + aim.y * 1.1D,
//                playerIn.posZ + aim.z + 1.1D);
//        fireball.accelerationX = aim.x * 0.1;
//        fireball.accelerationY = aim.y * 0.1;
//        fireball.accelerationZ = aim.z * 0.1;
//        worldIn.spawnEntity(fireball);

        item.damageItem(1, playerIn);
        return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, item);
    }
}
