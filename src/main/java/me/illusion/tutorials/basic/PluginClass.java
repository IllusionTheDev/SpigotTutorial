package me.illusion.tutorials.basic;

import me.illusion.tutorials.basic.listener.InteractionListener;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

/*
    This will be the base class to your plugin,
    this class will be responsible for loading
    all your files, store some global settings,
    potentially hook into other plugins in the
    future.

    Please check the plugin.yml file to learn
    how to hook this class as your main class.
    
    It is important that your main class
    extends JavaPlugin
 */
public class PluginClass extends JavaPlugin {

    /*
        This method will be executed every time
        your plugin loads, this can be when
        the server starts, someone runs /reload
        or uses a plugin such as PlugMan to
        reload your plugin.

        As of right now, the plugin will print
        "Plugin Loaded." into the console and
        register the InteractionListener upon
        loading, you can do anything you want
        here but keep in mind that any exception
        thrown will cause your plugin to disable.
     */
    @Override
    public void onEnable() {
        getLogger().info("Plugin Loaded.");

        /*
            The following line of code registers a
            listener, the first parameter will be
            a new instance of your listener class
            and the second parameter will be your
            plugin, which in this case is "this",
            since this class extends JavaPlugin
         */
        Bukkit.getPluginManager().registerEvents(new InteractionListener(), this);
    }

    /*
        This method is similar to onEnable,
        it executes when the plugin is disabled,
        this can be because the server is being
        stopped, someone ran /reload or a plugin
        like PlugMan is disabling or reloading it.

        As of right now, the plugin will print
        "Plugin Unloaded." into the console upon
        unloading, you can do anything you want
        here but keep in mind that any exception
        thrown will cause your plugin to disable.
     */
    @Override
    public void onDisable() {
        getLogger().info("Plugin Unloaded.");
    }

    /*
        This method is similar to onEnable,
        it executes when the server has finished
        loading, this can be useful if you require
        any sort of world action, caching unloaded
        worlds or talking to other plugins that do
        not allow actions before the server is
        loaded.

        As of right now, the plugin will not do
        anything upon loading.
     */
    @Override
    public void onLoad() {

    }
}
