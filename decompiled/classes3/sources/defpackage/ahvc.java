package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class ahvc extends alad implements albi {
    public static final defpackage.ahvc a;
    public long b;

    static {
        defpackage.ahvc ahvcVar = new defpackage.ahvc();
        a = ahvcVar;
        alad.Q(defpackage.ahvc.class, ahvcVar);
    }

    private ahvc() {
    }

    protected final java.lang.Object a(int i, java.lang.Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new albr(a, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0002", new java.lang.Object[]{"b"});
        }
        if (i2 == 3) {
            return new defpackage.ahvc();
        }
        if (i2 == 4) {
            return new akzx(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            return null;
        }
        return alad.M(defpackage.ahvc.class);
    }
}
