package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import com.revrobotics.CANSparkMax;

public class Subsystem extends SubsystemBase {
  
  private CANSparkMax motor;

  public Subsystem() {
    motor = new CANSparkMax(4, CANSparkMax.MotorType.kBrushless);
  }

  public void setMotor(double speed) {
    motor.set(speed);
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
 
  }

