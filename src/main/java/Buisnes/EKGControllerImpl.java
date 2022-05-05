package Buisnes;

import Data.EKGData;
import Data.EKGDataRecorder;
import Data.EKGRecorder;

public class EKGControllerImpl implements EKGController, EKGObserver {
    EKGDataRecorder ekgDataRecorder = (EKGDataRecorder) new EKGRecorder();
    private EKGObserver observer;

    @Override
    public void startrecording() {
        ekgDataRecorder.record();
        ekgDataRecorder.setObserver(this);
    }

    @Override
    public void registerObserver(EKGObserver ekgObserver) {
        this.observer = ekgObserver;
    }

    @Override
    public void handle(EKGData ekgData) {
        if (observer != null) {
            observer.handle(ekgData);
        }
    }
}

