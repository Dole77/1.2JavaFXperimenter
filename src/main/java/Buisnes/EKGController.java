// Kode hentet fra :
// https://github.com/cbudtz/IT2Lektion08MVCapp

package Buisnes;


public interface EKGController {
    void startrecording();

    void registerObserver(EKGObserver ekgObserver);
}