package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class gqs implements androidx.window.reflection.Consumer2, dxw {
    private final android.content.Context a;
    private final java.util.concurrent.locks.ReentrantLock b;
    private defpackage.gqd c;
    private final java.util.Set d;

    public gqs(android.content.Context context) {
        aooh.f(context, "context");
        this.a = context;
        this.b = new java.util.concurrent.locks.ReentrantLock();
        this.d = new java.util.LinkedHashSet();
    }

    public void accept(androidx.window.extensions.layout.WindowLayoutInfo windowLayoutInfo) {
        aooh.f(windowLayoutInfo, "value");
        java.util.concurrent.locks.ReentrantLock reentrantLock = this.b;
        reentrantLock.lock();
        try {
            defpackage.gqd gqdVarA = defpackage.fsu.A(this.a, windowLayoutInfo);
            this.c = gqdVarA;
            java.util.Iterator it = this.d.iterator();
            while (it.hasNext()) {
                ((dxw) it.next()).accept(gqdVarA);
            }
            reentrantLock.unlock();
        } catch (java.lang.Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final void addListener(dxw dxwVar) {
        aooh.f(dxwVar, "listener");
        java.util.concurrent.locks.ReentrantLock reentrantLock = this.b;
        reentrantLock.lock();
        try {
            defpackage.gqd gqdVar = this.c;
            if (gqdVar != null) {
                dxwVar.accept(gqdVar);
            }
            this.d.add(dxwVar);
        } finally {
            reentrantLock.unlock();
        }
    }

    public final boolean isEmpty() {
        return this.d.isEmpty();
    }

    public final void removeListener(dxw dxwVar) {
        aooh.f(dxwVar, "listener");
        java.util.concurrent.locks.ReentrantLock reentrantLock = this.b;
        reentrantLock.lock();
        try {
            this.d.remove(dxwVar);
        } finally {
            reentrantLock.unlock();
        }
    }
}
