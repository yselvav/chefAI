package adris.altoclef.commands;

import adris.altoclef.AltoClef;
import adris.altoclef.commandsystem.ArgParser;
import adris.altoclef.commandsystem.Command;
import adris.altoclef.tasksystem.Task;

public class PauseCommand extends Command {
    public PauseCommand() {
        super("pause", "Pauses the bot after the task thats running (Still in development!)");
    }

    @Override
    protected void call(AltoClef mod, ArgParser parser)
    {
        mod.setStoragedTask(mod.getUserTaskChain().getCurrentTask());
        mod.setIsPaused(true);
        mod.getUserTaskChain().stop(mod);
        mod.log("Pausing Bot");
        finish();
    }
}