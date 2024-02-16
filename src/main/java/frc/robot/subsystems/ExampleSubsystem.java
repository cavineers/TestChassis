package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import com.revrobotics.CANSparkMax;
import frc.robot.Constants.Testing;

public class ExampleSubsystem extends SubsystemBase {
  
  private CANSparkMax motor;

  public ExampleSubsystem() {
    motor = new CANSparkMax(Testing.CANIDB, CANSparkMax.MotorType.kBrushless);
  }

  public void setMotor(double speed) {
    motor.set(speed);
  }

  public void stopMotor() {
    motor.set(0);
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
 
  }

