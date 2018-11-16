package org.usfirst.frc.team948.robot.subsystems;

import org.usfirst.frc.team948.robot.RobotMap;
import org.usfirst.frc.team948.robot.commands.ManualDrive;

import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class DriveteamSubsystem extends Subsystem {
	private Talon leftTalon = new Talon(0);
	private Talon rightTalon = new Talon(1);
	 
	
	private RobotDrive drive = new RobotDrive(leftTalon, rightTalon);	
	
	public void initDefaultCommand() {
		setDefaultCommand(new ManualDrive());
	}
	
	public void drive(double x, double y) {
		drive.tankDrive(x, y);
	}
	public void stop() {
		RobotMap.frontleft.disable();
		RobotMap.frontRight.disable();
		RobotMap.backLeft.disable();
		RobotMap.backRight.disable();
	}
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

   
    }


