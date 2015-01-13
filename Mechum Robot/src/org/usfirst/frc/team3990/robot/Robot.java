
package org.usfirst.frc.team3990.robot;

import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.Joystick;
import org.usfirst.frc.team3990.lib.GamePad;

/**
 * The VM is configured to automatically run this class, and to call the
 * functions corresponding to each mode, as described in the IterativeRobot
 * documentation. If you change the name of this class or the package after
 * creating this project, you must also update the manifest file in the resource
 * directory.
 */
public class Robot extends IterativeRobot {
	
	
	Joystick driverControlLeft = new Joystick(Ports.DRIVER_JOYSTICK_LEFT);
    Joystick driverControlRight = new Joystick(Ports.DRIVER_JOYSTICK_RIGHT);
    GamePad operatorControl = new GamePad(Ports.OPERATOR_GAMEPAD);
	
	Systems systems;
	
	
    /**
     * This function is run when the robot is first started up and should be
     * used for any initialization code.
     */
    public void robotInit() {
    	
    systems = new Systems(); 	
    	
    }

    /**
     * This function is called periodically during autonomous
     */
    public void autonomousPeriodic() {

    }

    /**
     * This function is called periodically during operator control
     */
    public void teleopPeriodic() {
    	
    systems.drivetrain.mecanumDrive(driverControlLeft.getRawAxis(0), driverControlLeft.getRawAxis(1), driverControlRight.getRawAxis(2), /*systems.drivetrain.Gyro.getAngle(),*/0, 4, 1);
    System.out.println(systems.drivetrain.Gyro.getAngle());
    
   
   
    }
    
    /**
     * This function is called periodically during test mode
     */
    public void testPeriodic() {
    
    }
    
}
