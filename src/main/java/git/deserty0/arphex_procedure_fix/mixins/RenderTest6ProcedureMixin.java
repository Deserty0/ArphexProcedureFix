package git.deserty0.arphex_procedure_fix.mixins;

import net.arphex.procedures.RenderTest6Procedure;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.neoforge.client.event.RenderLevelStageEvent;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;

@Mixin(RenderTest6Procedure.class)
public abstract class RenderTest6ProcedureMixin {

    /**
     * @author des
     * @reason shit lags
     */
    @SubscribeEvent
    @Overwrite
    public static void renderLevel(RenderLevelStageEvent event){
        return;
   }
}
