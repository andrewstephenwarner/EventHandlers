package com.andrewstephenwarner.eventhandlers;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.entity.Creeper;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Firework;
import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.Player;
import org.bukkit.event.Event;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.event.entity.EntityDamageEvent.DamageCause;
import org.bukkit.event.entity.EntityDeathEvent;
import org.bukkit.event.player.PlayerEggThrowEvent;
import org.bukkit.inventory.meta.FireworkMeta;

public class PlayerListener implements Listener {
	
	public PlayerListener(EventHandlers plugin) {
		plugin.getServer().getPluginManager().registerEvents(this, plugin);
	}
	
	@SuppressWarnings("deprecation")
	@EventHandler
	public void onEntityDeath(EntityDeathEvent event) {
			
	if (event.getEntity() instanceof Creeper){
		 
        Creeper c = (Creeper) event.getEntity();
        c.setPowered(true);
        Location location = c.getLocation();
        c.getWorld().spawnCreature(location, EntityType.CREEPER);
        c.getWorld().spawnCreature(location, EntityType.CREEPER);
        c.getWorld().spawnCreature(location, EntityType.CREEPER);
        c.getWorld().spawnCreature(location, EntityType.CREEPER);
	}
	}

}
