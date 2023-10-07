package dk.manaxi.unikpay.labymod;

import net.labymod.api.LabyModAddon;
import net.labymod.settings.elements.SettingsElement;

import java.util.List;

public class Main extends LabyModAddon {
    public String token;

    /**
     * Called when the addon gets enabled
     */
    @Override
    public void onEnable() {

    }

    /**
     * Called when the addon gets disabled
     */
    @Override
    public void loadConfig() {
        this.token = getConfig().has( "token" ) ? getConfig().get( "token" ).getAsString() : "";
    }

    /**
     * Called when the addon gets disabled
     *
     * @param list List of settings
     */
    @Override
    protected void fillSettings(List<SettingsElement> list) {

    }
}
