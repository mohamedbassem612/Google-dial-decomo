package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class abzg {
    private static final java.util.concurrent.atomic.AtomicBoolean a = new java.util.concurrent.atomic.AtomicBoolean(false);

    public static void a() {
        if (a.compareAndSet(false, true)) {
            defpackage.akzq akzqVarA = defpackage.akzq.a();
            defpackage.akzq akzqVar = defpackage.aohd.a;
            if (akzqVarA == null) {
                throw new java.lang.NullPointerException("newRegistry");
            }
            defpackage.aohd.a = akzqVarA;
        }
    }
}
