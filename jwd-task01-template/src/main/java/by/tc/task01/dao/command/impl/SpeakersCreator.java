package by.tc.task01.dao.command.impl;

import by.tc.task01.dao.command.Command;
import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.Speakers;

/**
 * Created by DNAPC on 09.10.2017.
 */
public class SpeakersCreator implements Command {
    public Appliance execute(String applianceLine) {
        return new Speakers();
    }
}