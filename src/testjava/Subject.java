
package testjava;

 // ما اله شغل بس احتياطا

public interface Subject {

    void addObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyAllObservers();
}

