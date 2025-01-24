package adris.altoclef.commands;

import adris.altoclef.AltoClef;
import adris.altoclef.commandsystem.ArgParser;
import adris.altoclef.commandsystem.Command;
import adris.altoclef.tasks.speedrun.beatgame.BeatMinecraftTask;

public class MarvionCommand extends Command {

    public MarvionCommand() {
        super("marvion", "Same as the @gamer command");
    }

    @Override
    protected void call(AltoClef mod, ArgParser parser)
    {
        mod.runUserTask(new BeatMinecraftTask(mod), this::finish);
    }

}
