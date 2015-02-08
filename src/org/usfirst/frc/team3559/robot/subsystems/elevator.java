package org.usfirst.frc.team3559.robot.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.Talon;
import org.usfirst.frc.team3559.robot.RobotMap;

/**
 *
 */
public class elevator extends Subsystem {
	
	private static Talon winch;
	
	public static void init() {
		winch = new Talon(RobotMap.WINCH_MOTOR);
	}
    
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        setDefaultCommand(new ElevatorWait());
    }
    
    public static void wait() {
    	winch.set(0.0);
    }
}

