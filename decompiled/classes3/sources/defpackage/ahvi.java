package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class ahvi extends alad implements albi {
    public static final defpackage.ahvi a;
    public int b;
    public defpackage.ahvm c;

    static {
        defpackage.ahvi ahviVar = new defpackage.ahvi();
        a = ahviVar;
        alad.Q(defpackage.ahvi.class, ahviVar);
    }

    private ahvi() {
    }

    protected final java.lang.Object a(int i, java.lang.Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new albr(a, "\u0000\u0001\u0000\u0001\u0006\u0006\u0001\u0000\u0000\u0000\u0006ဉ\u0004", new java.lang.Object[]{"b", "c"});
        }
        if (i2 == 3) {
            return new defpackage.ahvi();
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
        return alad.M(defpackage.ahvi.class);
    }
}
