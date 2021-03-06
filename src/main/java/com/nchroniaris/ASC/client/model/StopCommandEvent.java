package com.nchroniaris.ASC.client.model;

import com.nchroniaris.ASC.client.multiplexer.TerminalMultiplexer;
import com.nchroniaris.ASC.util.model.GameServer;

import java.time.LocalTime;

/**
 * Concrete subclass of RunCommandEvent. Specifically, this class handles the stopping of a server by providing the right stop command to the superclass. Evidently, this is a class that utilizes the Template design pattern in order to dynamically inject the right command to run.
 */
public class StopCommandEvent extends RunCommandEvent {

    /**
     * Since the stop command is known ahead of time, there is no need to specify a command to run during instantiation
     *
     * @param multiplexer    A TerminalMultiplexer object offered as dependency injection. This can be any one of the classes that implements this interface.
     * @param gameServer A GameServer object that describes the particular details of the game server that the event belongs to.
     * @param time       A LocalTime object that describes the exact time of day that the event should run.
     */
    public StopCommandEvent(TerminalMultiplexer multiplexer, GameServer gameServer, LocalTime time) {

        super(multiplexer, gameServer, time);

    }

    /**
     * Returns the stop command that is defined in the particular GameServer instance that is associated with the event.
     *
     * @return A stop command as a string specific to the game server
     */
    @Override
    protected String assembleCommand() {

        return super.gameServer.getStopCommand();

    }

    @Override
    protected String eventString() {
        return "Stop Command";
    }

}
