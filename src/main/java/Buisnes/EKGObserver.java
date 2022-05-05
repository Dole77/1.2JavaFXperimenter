package Buisnes;

import Data.EKGData;

public interface EKGObserver {
    void handle(EKGData ekgData);
}
