package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class ubk extends alad implements albi {
    public static final defpackage.ubk a;
    public int b;
    public long c;

    static {
        defpackage.ubk ubkVar = new defpackage.ubk();
        a = ubkVar;
        alad.Q(defpackage.ubk.class, ubkVar);
    }

    private ubk() {
    }

    protected final java.lang.Object a(int i, java.lang.Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new albr(a, "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဂ\u0000", new java.lang.Object[]{"b", "c"});
        }
        if (i2 == 3) {
            return new defpackage.ubk();
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
        return alad.M(defpackage.ubk.class);
    }
}
