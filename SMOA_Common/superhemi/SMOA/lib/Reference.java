package superhemi.SMOA.lib;

/**
 * SMOA
 * 
 * Reference
 * 
 * @author superhemi
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 * 
 */

public class Reference {

    public static final String MOD_ID = "SMOA";
    public static final String MOD_NAME = "superhemi's Mod of Awesomeness";
    public static final String VERSION_NUMBER = "@VERSION@ (build @BUILD_NUMBER@)";
    public static final String CHANNEL_NAME = MOD_ID;
    public static final String DEPENDENCIES = "required-after:Forge@[7.8.0.729,)";
    public static final String FINGERPRINT = "@FINGERPRINT@";
    public static final int SECOND_IN_TICKS = 20;
    public static final int SHIFTED_ID_RANGE_CORRECTION = 256;
    public static final String SERVER_PROXY_CLASS = "superhemi.SMOA.core.proxy.CommonProxy";
    public static final String CLIENT_PROXY_CLASS = "superhemi.SMOA.core.proxy.ClientProxy";
    public static final int VERSION_CHECK_ATTEMPTS = 3;
}