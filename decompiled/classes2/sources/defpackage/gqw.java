package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class gqw implements defpackage.gqt {
    public final java.util.concurrent.locks.ReentrantLock a = new java.util.concurrent.locks.ReentrantLock();
    public final java.util.WeakHashMap b = new java.util.WeakHashMap();
    private final defpackage.gqt c;

    public gqw(defpackage.gqt gqtVar) {
        this.c = gqtVar;
    }

    public final void a(android.app.Activity activity, defpackage.gqd gqdVar) {
        aooh.f(activity, "activity");
        java.util.concurrent.locks.ReentrantLock reentrantLock = this.a;
        reentrantLock.lock();
        try {
            java.util.WeakHashMap weakHashMap = this.b;
            if (aooh.n(gqdVar, (defpackage.gqd) weakHashMap.get(activity))) {
                reentrantLock.unlock();
                return;
            }
            reentrantLock.unlock();
            defpackage.gqt gqtVar = this.c;
            aooh.f(activity, "activity");
            java.util.Iterator it = ((defpackage.gqz) gqtVar).a.c.iterator();
            aooh.e(it, "iterator(...)");
            while (it.hasNext()) {
                defpackage.hiv hivVar = (defpackage.hiv) it.next();
                if (aooh.n(hivVar.b, activity)) {
                    hivVar.c(gqdVar);
                }
            }
        } catch (java.lang.Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }
}
