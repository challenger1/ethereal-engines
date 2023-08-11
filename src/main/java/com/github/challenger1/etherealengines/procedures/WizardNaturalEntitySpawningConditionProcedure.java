package com.github.challenger1.etherealengines.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;

import com.github.challenger1.etherealengines.init.EtherealEnginesModEntities;
import com.github.challenger1.etherealengines.entity.WizardEntity;

public class WizardNaturalEntitySpawningConditionProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof ServerPlayer _plr0 && _plr0.level instanceof ServerLevel && _plr0.getAdvancements().getOrStartProgress(_plr0.server.getAdvancements().getAdvancement(new ResourceLocation("ethereal_engines:enter_etheria"))).isDone()) {
			if (world instanceof ServerLevel _level) {
				Entity entityToSpawn = new WizardEntity(EtherealEnginesModEntities.WIZARD.get(), _level);
				entityToSpawn.moveTo(
						((entity instanceof ServerPlayer _player && !_player.level.isClientSide())
								? ((_player.getRespawnDimension().equals(_player.level.dimension()) && _player.getRespawnPosition() != null) ? _player.getRespawnPosition().getX() : _player.level.getLevelData().getXSpawn())
								: 0),
						((entity instanceof ServerPlayer _player && !_player.level.isClientSide())
								? ((_player.getRespawnDimension().equals(_player.level.dimension()) && _player.getRespawnPosition() != null) ? _player.getRespawnPosition().getY() : _player.level.getLevelData().getYSpawn())
								: 0),
						((entity instanceof ServerPlayer _player && !_player.level.isClientSide())
								? ((_player.getRespawnDimension().equals(_player.level.dimension()) && _player.getRespawnPosition() != null) ? _player.getRespawnPosition().getZ() : _player.level.getLevelData().getZSpawn())
								: 0),
						0, 0);
				entityToSpawn.setYBodyRot(0);
				entityToSpawn.setYHeadRot(0);
				if (entityToSpawn instanceof Mob _mobToSpawn)
					_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
				_level.addFreshEntity(entityToSpawn);
			}
		}
	}
}
