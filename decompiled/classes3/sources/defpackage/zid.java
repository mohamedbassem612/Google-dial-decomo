package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class zid {
    private static volatile defpackage.zid a;
    private final android.content.Context b;

    private zid(android.content.Context context) {
        this.b = context;
    }

    public static defpackage.zid a() {
        defpackage.zid zidVar = a;
        if (zidVar != null) {
            return zidVar;
        }
        throw new java.lang.IllegalStateException("Not initialized!");
    }

    public static void b(android.content.Context context) {
        if (a == null) {
            synchronized (defpackage.zid.class) {
                if (a == null) {
                    a = new defpackage.zid(context);
                }
            }
        }
    }

    public final zia c() {
        return new defpackage.zic(this.b);
    }
}
