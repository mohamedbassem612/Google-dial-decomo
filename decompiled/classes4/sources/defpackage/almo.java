package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class almo extends alad implements albi {
    public static final defpackage.almo a;
    public static final apdi d;
    public int b;
    public akzm c;

    static {
        defpackage.almo almoVar = new defpackage.almo();
        a = almoVar;
        alad.Q(defpackage.almo.class, almoVar);
        d = alad.W(defpackage.almz.a, almoVar, almoVar, 124, alcr.k);
    }

    private almo() {
    }

    protected final java.lang.Object a(int i, java.lang.Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new albr(a, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new java.lang.Object[]{"b", "c"});
        }
        if (i2 == 3) {
            return new defpackage.almo();
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
        return alad.M(defpackage.almo.class);
    }
}
