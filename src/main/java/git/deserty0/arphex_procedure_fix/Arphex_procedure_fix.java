package git.deserty0.arphex_procedure_fix;

import com.mojang.logging.LogUtils;
import net.neoforged.fml.common.Mod;
import org.slf4j.Logger;

// The value here should match an entry in the META-INF/neoforge.mods.toml file
@Mod(Arphex_procedure_fix.MODID)
public class Arphex_procedure_fix {
    // Define mod id in a common place for everything to reference
    public static final String MODID = "arphex_procedure_fix";
    // Directly reference a slf4j logger
    private static final Logger LOGGER = LogUtils.getLogger();
}
