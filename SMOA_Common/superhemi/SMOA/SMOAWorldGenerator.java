package superhemi.SMOA;

import java.util.Random;

import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import cpw.mods.fml.common.IWorldGenerator;

/**
 * SMOA
 * 
 * SMOAWorldGenerator
 * 
 * @author superhemi
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 * 
 */

public class SMOAWorldGenerator implements IWorldGenerator { 

    @Override
    public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {
    	 world.setBlock(chunkX*16 + random.nextInt(16), 10, chunkZ*16 + random.nextInt(16), 500);
    }

}