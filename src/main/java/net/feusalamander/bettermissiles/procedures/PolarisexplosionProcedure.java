package net.feusalamander.bettermissiles.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.BlockPos;

public class PolarisexplosionProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		int horizontalRadiusHemiBot = (int) 70 - 1;
		int verticalRadiusHemiBot = (int) 70;
		int yIterationsHemiBot = verticalRadiusHemiBot;
		for (int i = -yIterationsHemiBot; i <= 0; i++) {
			if (i == -verticalRadiusHemiBot) {
				continue;
			}
			for (int xi = -horizontalRadiusHemiBot; xi <= horizontalRadiusHemiBot; xi++) {
				for (int zi = -horizontalRadiusHemiBot; zi <= horizontalRadiusHemiBot; zi++) {
					double distanceSq = (xi * xi) / (double) (horizontalRadiusHemiBot * horizontalRadiusHemiBot) + (i * i) / (double) (verticalRadiusHemiBot * verticalRadiusHemiBot)
							+ (zi * zi) / (double) (horizontalRadiusHemiBot * horizontalRadiusHemiBot);
					if (distanceSq <= 1.0) {
						world.setBlock(BlockPos.containing(x + xi, y + i, z + zi), Blocks.AIR.defaultBlockState(), 3);
						if (Math.random() > 0.7) {
							world.setBlock(BlockPos.containing(x + xi, y + i - 15, z + zi), Blocks.FIRE.defaultBlockState(), 3);
						}
					}
				}
			}
		}
		if (world instanceof Level _level) {
			if (!_level.isClientSide()) {
				_level.playSound(null, BlockPos.containing(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.generic.explode")), SoundSource.BLOCKS, 10, 1);
			} else {
				_level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.generic.explode")), SoundSource.BLOCKS, 10, 1, false);
			}
		}
		{
			// Get the radius of the sphere
			double radius = 3; // 3 blocks
			// Set the tolerance for how close to the surface a point must be to create a particle
			double tolerance = 0.1; // 0.1 blocks
			for (double xx = -radius; xx <= radius; xx += 0.1) {
				for (double yy = -radius; yy <= radius; yy += 0.1) {
					for (double zz = -radius; zz <= radius; zz += 0.1) {
						if (Math.abs(xx * xx + yy * yy + zz * zz - radius * radius) <= tolerance) {
							// Calculate the position of the particle
							double posX = x + xx;
							double posY = y + yy;
							double posZ = z + zz;
							if (true) {
								if (world instanceof ServerLevel)
									((ServerLevel) world).sendParticles(ParticleTypes.DRIPPING_WATER, posX, posY, posZ, (int) 1, 0.01, 0.01, 0.01, 0);
							} else {
								world.addParticle(ParticleTypes.DRIPPING_WATER, posX, posY, posZ, 0, 0, 0);
							}
						}
					}
				}
			}
		}
	}
}
