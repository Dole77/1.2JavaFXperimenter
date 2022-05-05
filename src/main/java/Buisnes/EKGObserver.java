// Kode hentet fra :
// https://github.com/cbudtz/IT2Lektion08MVCapp

package Buisnes;

import Data.EKGData;

public interface EKGObserver {
    void handle(EKGData ekgData);
}
