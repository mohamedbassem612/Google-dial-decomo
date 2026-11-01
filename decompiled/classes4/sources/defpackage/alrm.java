package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class alrm extends alad implements albi {
    public static final defpackage.alrm a;
    public static final apdi d;
    public int b = 0;
    public java.lang.Object c;

    static {
        defpackage.alrm alrmVar = new defpackage.alrm();
        a = alrmVar;
        alad.Q(defpackage.alrm.class, alrmVar);
        d = alad.W(defpackage.alsi.a, alrmVar, alrmVar, 119, alcr.k);
    }

    private alrm() {
    }

    protected final java.lang.Object a(int i, java.lang.Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new albr(a, "\u0001\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000", new java.lang.Object[]{"c", "b", defpackage.alrn.class, defpackage.alrk.class});
        }
        if (i2 == 3) {
            return new defpackage.alrm();
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
        return alad.M(defpackage.alrm.class);
    }
}
