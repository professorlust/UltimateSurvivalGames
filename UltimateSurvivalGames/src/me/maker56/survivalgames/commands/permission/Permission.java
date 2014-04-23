package me.maker56.survivalgames.commands.permission;

public enum Permission {
	
	ARENA("sg.arena"),
	
	CONFIG("sg.config"),
	
	GAME("sg.game"),
	LOBBY("sg.lobby"),
	
	LIST("sg.list"),
	
	JOIN("sg.join");
	
	private final String permission;
	
	private Permission(String permission) {
		this.permission = permission;
	}
	
	public String getPermission() {
		return permission;
	}

}