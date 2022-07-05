package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;

@TeleOp(name = "Test-a-wheel")
public class testwheel extends LinearOpMode {
    DcMotor frontLeft;
    DcMotor frontRight;
    DcMotor backLeft;
    DcMotor backRight;
    boolean a;
    boolean b;
    boolean x;
    boolean y;
    boolean up;
    boolean down;
    boolean right;
    boolean left;
    public void runOpMode() throws InterruptedException{
        frontLeft = hardwareMap.dcMotor.get("frontLeft");
        frontRight = hardwareMap.dcMotor.get("frontRight");
        backLeft = hardwareMap.dcMotor.get("backLeft");
        backRight = hardwareMap.dcMotor.get("backRight");
        waitForStart();
        while(opModeIsActive()){
            a = gamepad1.a;
            b = gamepad1.b;
            x = gamepad1.x;
            y = gamepad1.y;
            up = gamepad1.dpad_up;
            down = gamepad1.dpad_down;
            right = gamepad1.dpad_right;
            left = gamepad1.dpad_left;
            if(a){
                frontLeft.setPower(1);
                frontLeft.setPower(0);
            } else if(b){
                frontLeft.setPower(-1);
                frontLeft.setPower(0);
            }else if(x){
                frontRight.setPower(1);
                frontRight.setPower(0);
            }else if(y){
                frontRight.setPower(-1);
                frontRight.setPower(0);
            }else if(up){
                backLeft.setPower(1);
                backLeft.setPower(0);
            }else if(right){
                backLeft.setPower(-1);
                backLeft.setPower(0);
            }else if(left){
                backRight.setPower(1);
                backRight.setPower(0);
            }else if(down){
                backRight.setPower(-1);
                backRight.setPower(0);
            }
        }
    }
}
