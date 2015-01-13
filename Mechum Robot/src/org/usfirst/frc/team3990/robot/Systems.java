package org.usfirst.frc.team3990.robot;

import org.usfirst.frc.team3990.robot.DriveTrain;
import org.usfirst.frc.team3990.robot.Ports; 

public class Systems 
{
	
	public DriveTrain drivetrain;
	
		public Systems() 
			{
		
				drivetrain = new DriveTrain(Ports.LEFT_DRIVE_FRONT, Ports.LEFT_DRIVE_REAR, Ports.RIGHT_DRIVE_FRONT, Ports.RIGHT_DRIVE_REAR);
				drivetrain.setSensors(Ports.GYRO);
	
			}
}
