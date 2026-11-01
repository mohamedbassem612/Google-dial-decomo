package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class ejk {
    private static final java.lang.ThreadLocal i = new java.lang.ThreadLocal();
    public defpackage.fje f;
    public final vx g;
    public final aec a = new aec(0);
    public final java.util.ArrayList b = new java.util.ArrayList();
    public final rai h = new rai(this, (byte[]) null);
    public final java.lang.Runnable c = new defpackage.drn(this, 5);
    public boolean d = false;
    public float e = 1.0f;

    public ejk(vx vxVar) {
        this.g = vxVar;
    }

    static defpackage.ejk a() {
        java.lang.ThreadLocal threadLocal = i;
        if (threadLocal.get() == null) {
            threadLocal.set(new defpackage.ejk(new vx((short[]) null)));
        }
        return (defpackage.ejk) threadLocal.get();
    }

    final boolean b() {
        return java.lang.Thread.currentThread() == ((android.os.Looper) this.g.a).getThread();
    }
}
