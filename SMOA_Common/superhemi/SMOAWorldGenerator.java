package superhemi;

import java.util.Random;

import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import cpw.mods.fml.common.IWorldGenerator;

public class SMOAWorldGenerator implements IWorldGenerator { 

    @Override
    public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {
    	 world.setBlock(chunkX*16 + random.nextInt(16), 10, chunkZ*16 + random.nextInt(16), 500);
    }

}