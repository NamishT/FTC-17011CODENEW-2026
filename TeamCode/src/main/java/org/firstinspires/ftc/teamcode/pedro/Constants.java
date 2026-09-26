package org.firstinspires.ftc.teamcode.pedro;

import com.pedropathing.follower.Follower;
import com.pedropathing.localization.Localizer;
import com.pedropathing.revhub.drivetrains.Mecanum;
import com.pedropathing.revhub.drivetrains.MecanumConfig;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.HardwareMap;

public class Constants {

    public static MecanumConfig driveConfig = new MecanumConfig(
            c -> {
                c.frontLeftName.set("left_front");
                c.backLeftName.set("left_back");
                c.frontRightName.set("right_front");
                c.backRightName.set("right_back");

                c.frontLeftDirection.set(DcMotorSimple.Direction.FORWARD);
                c.backLeftDirection.set(DcMotorSimple.Direction.FORWARD);
                c.frontRightDirection.set(DcMotorSimple.Direction.REVERSE);
                c.backRightDirection.set(DcMotorSimple.Direction.REVERSE);

                c.manualBrakeMode.set(true);
            }
    );

    public static Follower create(HardwareMap hardwareMap) {
        return create(hardwareMap, null);
    }

    public static Follower create(HardwareMap hardwareMap, Localizer localizer) {
        return new Follower(localizer, new Mecanum(hardwareMap, driveConfig), null);
    }

    public static Follower create(Localizer localizer, HardwareMap hardwareMap) {
        return new Follower(localizer, new Mecanum(hardwareMap, driveConfig), null);
    }

    public static Follower create(Localizer localizer) {
        return new Follower(localizer, null, null);
    }
}
