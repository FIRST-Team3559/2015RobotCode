package org.usfirst.frc.team3559.robot.subsystems;

import org.usfirst.frc.team3559.robot.RobotMap;
import org.usfirst.frc.team3559.robot.commands.driveWithJoysticks;

import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.RobotDrive;

/**
 *
 */
public class driveTrain extends Subsystem {
    
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
	RobotDrive drive = new RobotDrive(RobotMap.LEFT_MOTOR,RobotMap.RIGHT_MOTOR);

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        setDefaultCommand(new driveWithJoysticks());
    }
    
    public void tankDrive(double left, double right) {
    	drive.tankDrive(left, right);
    }
}

