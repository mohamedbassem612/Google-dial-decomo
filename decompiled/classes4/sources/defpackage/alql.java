package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class alql extends alad implements albi {
    public static final defpackage.alql a;
    public static final apdi c;
    public alat b = albq.a;

    static {
        defpackage.alql alqlVar = new defpackage.alql();
        a = alqlVar;
        alad.Q(defpackage.alql.class, alqlVar);
        c = alad.W(defpackage.alsi.a, alqlVar, alqlVar, 109, alcr.k);
    }

    private alql() {
    }

    protected final java.lang.Object a(int i, java.lang.Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new albr(a, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new java.lang.Object[]{"b", defpackage.alqw.class});
        }
        if (i2 == 3) {
            return new defpackage.alql();
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
        return alad.M(defpackage.alql.class);
    }
}
