
package com.github.challenger1.etherealengines.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import com.github.challenger1.etherealengines.entity.WizardEntity;
import com.github.challenger1.etherealengines.client.model.ModelWizard;

public class WizardRenderer extends MobRenderer<WizardEntity, ModelWizard<WizardEntity>> {
	public WizardRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelWizard(context.bakeLayer(ModelWizard.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(WizardEntity entity) {
		return new ResourceLocation("ethereal_engines:textures/entities/wizard.png");
	}
}
