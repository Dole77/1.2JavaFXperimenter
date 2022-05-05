// Kode hentet fra :
// https://github.com/cbudtz/IT2Lektion08MVCapp

package Data;

public interface EKGData {
    void setVoltage(double voltage);

    double getVoltage();

    void setTime(double time);

    double getTime();
}
