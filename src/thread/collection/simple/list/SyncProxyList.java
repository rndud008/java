package thread.collection.simple.list;

import java.util.Arrays;

import static util.ThreadUtils.sleep;

public class SyncProxyList implements SimpleList {
    private SimpleList target;
    private Object[] elementData;
    private int size = 0;

    public SyncProxyList(SimpleList target) {
        this.target = target;
    }

    // java 디자인 패턴중 proxyPattern

    @Override
    // 1.  lock 획득
    public synchronized int size() {
        // 2.  원본 메소드 호출
        return target.size();
        // 3. 원본 메소드 반납
        // 4. lock 반납
    }

    @Override
    public synchronized  void add(Object e) {
target.add(e);
    }

    @Override
    public synchronized Object get(int index) {
        return target.get(index);
    }

    @Override
    public synchronized String toString() {
        return target.toString() + " by " + this.getClass().getSimpleName();
    }
}
