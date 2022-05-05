// Kode hentet fra :
// https://github.com/cbudtz/IT2Lektion08MVCapp

package Data;

import Buisnes.EKGObserver;

public interface EKGDataRecorder {
    void record();

    void setObserver(EKGObserver observer);
}
