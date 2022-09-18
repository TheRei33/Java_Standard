package Java_Standard_8;

public class EighttoTwentytwo {
    public static void main(String[] args) {
        try {
            startInstall();
            copyFiles();
        } catch (spaceException e) {
            System.out.println("에러 메시지 : " + e.getMessage());
            e.printStackTrace();
            System.out.println("공간을 확보한 후에 다시 설치하시기 바랍니다.");
        } catch (memoryException me) {
            System.out.println("에러 메시지 : " + me.getMessage());
            me.printStackTrace();
            System.gc();
            System.out.println("다시 설치 시도하세요.");
        } finally {
            deleteTempFiles();
        }
    }

    static void startInstall() throws spaceException, memoryException {
        if(!enoughSpace())
            throw new spaceException("설치할 공간이 부족합니다.");
        if(!enoughMemory())
            throw new memoryException("메모리가 부족합니다.");
    }

    static void copyFiles() {}
    static void deleteTempFiles() { }

    static boolean enoughSpace() {
        return false;
    }

    static boolean enoughMemory() {
        return true;
    }
}

class spaceException extends Exception {
    spaceException(String msg) {
        super(msg);
    }
}

class memoryException extends Exception {
    memoryException(String msg) {
        super(msg);
    }
}
