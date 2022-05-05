package Data;

import Buisnes.EKGObserver;

public interface EKGDataRecorder {
    void record();

    void setObserver(EKGObserver observer);
}
