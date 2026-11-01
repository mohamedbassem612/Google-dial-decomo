package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public abstract class aiez extends aiev implements java.util.Queue {
    protected aiez() {
    }

    protected /* bridge */ /* synthetic */ java.util.Collection c() {
        throw null;
    }

    protected abstract java.util.Queue d();

    @Override // java.util.Queue
    public final java.lang.Object element() {
        return d().element();
    }

    public boolean offer(java.lang.Object obj) {
        return d().offer(obj);
    }

    @Override // java.util.Queue
    public final java.lang.Object peek() {
        return d().peek();
    }

    @Override // java.util.Queue
    public final java.lang.Object poll() {
        return d().poll();
    }

    @Override // java.util.Queue
    public final java.lang.Object remove() {
        return d().remove();
    }
}
