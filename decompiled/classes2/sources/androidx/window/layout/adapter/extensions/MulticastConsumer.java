package androidx.window.layout.adapter.extensions;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class MulticastConsumer implements dxw {
    public final java.util.concurrent.locks.ReentrantLock a;
    public final java.util.Set b;
    private final android.content.Context c;
    private defpackage.gqd d;

    public MulticastConsumer(android.content.Context context) {
        aooh.f(context, "context");
        this.c = context;
        this.a = new java.util.concurrent.locks.ReentrantLock();
        this.b = new java.util.LinkedHashSet();
    }

    public final void a(dxw dxwVar) {
        java.util.concurrent.locks.ReentrantLock reentrantLock = this.a;
        reentrantLock.lock();
        try {
            defpackage.gqd gqdVar = this.d;
            if (gqdVar != null) {
                dxwVar.accept(gqdVar);
            }
            this.b.add(dxwVar);
        } finally {
            reentrantLock.unlock();
        }
    }

    public void accept(androidx.window.extensions.layout.WindowLayoutInfo windowLayoutInfo) {
        aooh.f(windowLayoutInfo, "value");
        java.util.concurrent.locks.ReentrantLock reentrantLock = this.a;
        reentrantLock.lock();
        try {
            defpackage.gqd gqdVarA = defpackage.fsu.A(this.c, windowLayoutInfo);
            this.d = gqdVarA;
            java.util.Iterator it = this.b.iterator();
            while (it.hasNext()) {
                ((dxw) it.next()).accept(gqdVarA);
            }
            reentrantLock.unlock();
        } catch (java.lang.Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }
}
