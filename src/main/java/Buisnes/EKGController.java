package Buisnes;


public interface EKGController {
    void startrecording();

    void registerObserver(EKGObserver ekgObserver);
}