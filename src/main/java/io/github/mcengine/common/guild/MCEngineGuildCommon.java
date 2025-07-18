package io.github.mcengine.common.guild;

import org.bukkit.plugin.Plugin;

/**
 * Common logic handler for the MCEngine Guild plugin.
 * Handles database backend initialization and provides access to guild data methods.
 */
public class MCEngineGuildCommon {

    /**
     * Singleton instance of the Guild Common manager.
     */
    private static MCEngineGuildCommon instance;

    /**
     * The Bukkit plugin instance.
     */
    private final Plugin plugin;

    /**
     * Constructs a new Guild Common handler.
     * Initializes the appropriate database backend based on plugin config.
     *
     * Supported database types (config key: {@code database.type}):
     * <ul>
     *     <li>{@code sqlite}</li>
     *     <li>{@code mysql}</li>
     * </ul>
     *
     * @param plugin the Bukkit plugin instance
     */
    public MCEngineGuildCommon(Plugin plugin) {
        instance = this;
        this.plugin = plugin;
    }

    /**
     * Returns the singleton instance of the guild common handler.
     *
     * @return {@link MCEngineGuildCommon} global instance
     */
    public static MCEngineGuildCommon getApi() {
        return instance;
    }

    /**
     * Gets the associated plugin instance.
     *
     * @return Bukkit plugin instance
     */
    public Plugin getPlugin() {
        return plugin;
    }
}
