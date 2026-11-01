package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aeoy extends java.lang.ThreadLocal {
    final /* synthetic */ defpackage.adai a;

    public aeoy(defpackage.adai adaiVar) {
        j$.util.Objects.requireNonNull(adaiVar);
        this.a = adaiVar;
    }

    @Override // java.lang.ThreadLocal
    protected final /* bridge */ /* synthetic */ java.lang.Object initialValue() {
        defpackage.aeoz aeozVar = new defpackage.aeoz();
        java.lang.Thread threadCurrentThread = java.lang.Thread.currentThread();
        java.lang.Object obj = this.a.a;
        synchronized (obj) {
            ((java.util.WeakHashMap) obj).put(threadCurrentThread, aeozVar);
        }
        return aeozVar;
    }
}
