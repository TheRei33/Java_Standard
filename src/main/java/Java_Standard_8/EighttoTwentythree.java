package Java_Standard_8;

public class EighttoTwentythree {

    public static void main(String[] args) {
        try {
            install();
        } catch (InstallException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    static void install() throws InstallException {
        try {
            startInstall();
            copyFiles();
        } catch (SpaceException02 se) {
            InstallException ie = new InstallException("설치 중 예외발생");
            ie.initCause(se);
            throw ie;
        } catch (MemoryException02 me) {
            InstallException ie = new InstallException("설치 중 예외발생");
            ie.initCause(me);
            throw ie;
        } finally {
            deleteTempFiles();
        }
    }

    static void startInstall() throws SpaceException02, MemoryException02 {
        if(!enoughSpace()) {
            throw new SpaceException02("설치힐 공간이 부족합니다.");
        }

        if(!enoughMemory()) {
            throw new MemoryException02("메모리가 부족합니다.");
//            throw new RuntimeException(new MemoryException("메모리가 부족합니다."));
        }
    }

    static void copyFiles() {}
    static void deleteTempFiles() {}

    static boolean enoughSpace() {
        return false;
    }

    static boolean enoughMemory() {
        return true;
    }
}

class InstallException extends Exception {
    InstallException(String msg) {
        super(msg);
    }
}

class SpaceException02 extends Exception {
    SpaceException02(String msg) {
        super(msg);
    }
}

class MemoryException02 extends Exception {
    MemoryException02(String msg) {
        super(msg);
    }
}
