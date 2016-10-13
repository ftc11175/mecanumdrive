package com.qualcomm.ftcrobotcontroller.opmodes;

import com.qualcomm.robotcore.hardware.DcMotor;

/**
 * Created by Will on 10/13/2016.
 */
public class MecMethods {

    public static void forward(DcMotor leftFront, DcMotor rightFront, DcMotor leftBack, DcMotor rightBack, double rightStickY){
        leftFront.setPower(rightStickY);
        rightFront.setPower(rightStickY);
        leftBack.setPower(rightStickY);
        rightBack.setPower(rightStickY);
    }
    public static void backward(DcMotor leftFront, DcMotor rightFront, DcMotor leftBack, DcMotor rightBack, double rightStickY){
        leftFront.setPower(rightStickY);
        rightFront.setPower(rightStickY);
        leftBack.setPower(rightStickY);
        rightBack.setPower(rightStickY);
    }
    public static void turnleft(DcMotor leftFront, DcMotor rightFront, DcMotor leftBack, DcMotor rightBack, double rightStickY, double leftStickY){
        leftFront.setPower(rightStickY);
        rightFront.setPower(leftStickY);
        leftBack.setPower(rightStickY);
        rightBack.setPower(leftStickY);
    }
    public static void turnright(DcMotor leftFront, DcMotor rightFront, DcMotor leftBack, DcMotor rightBack, double rightStickY, double leftStickY){
        leftFront.setPower(leftStickY);
        rightFront.setPower(rightStickY);
        leftBack.setPower(leftStickY);
        rightBack.setPower(rightStickY);
    }
    public static void strafeleft(DcMotor leftFront, DcMotor rightFront, DcMotor leftBack, DcMotor rightBack, double leftStickX){
        leftFront.setPower(-leftStickX);
        rightFront.setPower(leftStickX);
        leftBack.setPower(leftStickX);
        rightBack.setPower(-leftStickX);
    }
    public static void straferight(DcMotor leftFront, DcMotor rightFront, DcMotor leftBack, DcMotor rightBack, double rightStickX){
        leftFront.setPower(rightStickX);
        rightFront.setPower(-rightStickX);
        leftBack.setPower(-rightStickX);
        rightBack.setPower(rightStickX);
    }
}
