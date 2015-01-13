package org.usfirst.frc.team3990.robot;

import  org.usfirst.frc.team3990.lib.EagleMath;

import  edu.wpi.first.wpilibj.Talon;
import  edu.wpi.first.wpilibj.Gyro;

public class DriveTrain {

    Talon leftA = null;
    Talon leftB = null;
    Talon rightA = null;
    Talon rightB = null;
    Gyro Gyro = null;

    public DriveTrain(int l1, int l2, int r1, int r2) {
        leftA = new Talon(l1);
        leftB = new Talon(l2);
        rightA = new Talon(r1);
        rightB = new Talon(r2);
    }

    public void setSensors(int gyroport) {
        if (Gyro == null) {
            Gyro = new Gyro(gyroport);
        }
    }

    public void mecanumDrive(double x, double y, double rotation, double gyroAngle, int kMaxNumberOfMotors, double MaxOutput) {
        double xIn = x;
        double yIn = y;
        yIn = -yIn;

        /* double rotated[] = EagleMath.rotateVector(xIn, yIn, gyroAngle);
         xIn = rotated[0];
         yIn = rotated[1]; */
        double wheelSpeeds[] = new double[kMaxNumberOfMotors];
        wheelSpeeds[0] = xIn + yIn + rotation; //FrontLeft
        wheelSpeeds[1] = -xIn + yIn - rotation; //FrontRight
        wheelSpeeds[2] = -xIn + yIn + rotation; //RearLeft
        wheelSpeeds[3] = xIn + yIn - rotation; //RearRight

        EagleMath.normalize(wheelSpeeds, kMaxNumberOfMotors);

        leftA.set(wheelSpeeds[0] * -1 * MaxOutput); // 3 
        rightA.set(wheelSpeeds[1] * MaxOutput); // 1
        leftB.set(wheelSpeeds[2] * -1 * MaxOutput); // 2 
        rightB.set(wheelSpeeds[3] * MaxOutput); // 4

       /* if (Math.abs(xIn)<.1)
        {
            xIn = 0;
        }
        
        if (Math.abs(yIn)<.1)
        {
            yIn = 0; 
        } */ 
    }

}
