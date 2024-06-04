package week4;

public interface PackageState {
    void next(Package pkg);
    void prev(Package pkg);
    void checkStatus();
}
