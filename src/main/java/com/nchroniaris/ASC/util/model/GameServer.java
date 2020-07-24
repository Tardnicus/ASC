package com.nchroniaris.ASC.util.model;

/**
 * This is a class that represents a GameServer. All variables are final so this can be by some accounts regarded as a data class. Apparently they are regarded as "evil" or "not useful" but at least in the way that I use it it provides some programmatical way of representing a database object. Many of its parameters are accessed multiple times over the course of many Event objects.
 */
public class GameServer {

    private final int sid;

    private final String description;
    private final String game;
    private final String moniker;

    private final String stopCommand;
    private final String warnCommand;

    private final int port;

    private final boolean enabled;
    private final boolean autostart;

    public GameServer(int sid, String description, String game, String moniker, String stopCommand, String warnCommand, int port, boolean enabled, boolean autostart) {

        this.sid = sid;

        if (description == null)
            throw new IllegalArgumentException("Description field cannot be null!");

        this.description = description;

        if (game == null)
            throw new IllegalArgumentException("Game field cannot be null!");

        this.game = game;

        if (moniker == null)
            throw new IllegalArgumentException("Moniker field cannot be null!");

        this.moniker = moniker;

        if (stopCommand == null)
            throw new IllegalArgumentException("Stop Command field cannot be null!");

        this.stopCommand = stopCommand;

        if (warnCommand == null)
            throw new IllegalArgumentException("Warn Text field cannot be null!");

        this.warnCommand = warnCommand;

        if (port < 0 || port > 65535)
            throw new IllegalArgumentException("Port cannot be outside of the range [0, 65535]");

        this.port = port;

        this.enabled = enabled;
        this.autostart = autostart;
    }

    public int getSid() {
        return sid;
    }

    public String getDescription() {
        return description;
    }

    public String getGame() {
        return game;
    }

    public String getMoniker() {
        return moniker;
    }

    public String getStopCommand() {
        return stopCommand;
    }

    public String getWarnCommand() {
        return warnCommand;
    }

    public int getPort() {
        return port;
    }

    public boolean isEnabled() {
        return enabled;
    }

    public boolean isAutostart() {
        return autostart;
    }

}
