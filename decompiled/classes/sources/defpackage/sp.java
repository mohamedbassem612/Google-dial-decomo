package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class sp extends defpackage.den {
    public static final java.util.concurrent.Executor a = new defpackage.so(0);
    private static volatile defpackage.sp c;
    public final defpackage.den b;
    private final defpackage.den d;

    private sp() {
        defpackage.sq sqVar = new defpackage.sq();
        this.d = sqVar;
        this.b = sqVar;
    }

    public static defpackage.sp h() {
        if (c == null) {
            synchronized (defpackage.sp.class) {
                if (c == null) {
                    c = new defpackage.sp();
                }
            }
        }
        return c;
    }

    public final boolean i() {
        return android.os.Looper.getMainLooper().getThread() == java.lang.Thread.currentThread();
    }
}
