package net.mcreator.darkness_unbound;

import net.minecraft.util.math.BlockPos;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

@Elementsdarkness_unbound.ModElement.Tag
public class MCreatorAetherPlayerEntersDimension extends Elementsdarkness_unbound.ModElement {
	public MCreatorAetherPlayerEntersDimension(Elementsdarkness_unbound instance) {
		super(instance, 26);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure MCreatorAetherPlayerEntersDimension!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (entity instanceof LivingEntity)
			((LivingEntity) entity).setPositionAndUpdate(0, 70, 0);
		if (entity instanceof PlayerEntity)
			((PlayerEntity) entity).setSpawnPoint(new BlockPos((int) 0, (int) 70, (int) 0), true, entity.dimension);
		if (!entity.world.isRemote && entity.world.getServer() != null) {
			entity.world.getServer().getCommandManager()
					.handleCommand(entity.getCommandSource().withFeedbackDisabled().withPermissionLevel(4), "clear");
		}
	}
}
