package me.illusion.tutorials.basic.listener;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEvent;

/*
    This listener will be responsible
    for listening to the
    PlayerInteractionEvent, which
    occurs when a player left clicks
    the air, left clicks a block,
    right clicks a block or right
    clicks the air with an item in
    hand.

    This class needs to implement
    Listener and all listening
    methods are annotated
    with @EventHandler
 */
public class InteractionListener implements Listener {

    /*
        This method will listen to
        when a player interacts.

        This method needs to be
        annotated with @EventHandler,
        can have any name, the event
        parameter can have any name
        as long as it contains
        PlayerInteractEvent as a parameter.

        The method does not need to be private.

        As of right now, this will broadcast
        when you right click an oak door.
     */
    @EventHandler
    private void onInteract(PlayerInteractEvent event)
    {
        //If the block is null (if no block has been clicked)
        if(event.getClickedBlock() == null)
            return; //Stop executing code, good practice

        //If the block is not an oak door
        if(event.getClickedBlock().getType() != Material.OAK_DOOR)
            return; //Stop executing code, good practice

        /*
            Since we return on all bad checks,
            we can assure that from this point
            everything is correct and that this
            code will only execute if the conditions
            above are completed.
         */

        Bukkit.broadcastMessage(event.getPlayer().getName() + " right clicked a door.");
    }
}
