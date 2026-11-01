package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class alrq extends alad implements albi {
    public static final defpackage.alrq a;
    public static final apdi d;
    public int b;
    public long c;

    static {
        defpackage.alrq alrqVar = new defpackage.alrq();
        a = alrqVar;
        alad.Q(defpackage.alrq.class, alrqVar);
        d = alad.W(alro.a, alrqVar, alrqVar, 363219485, alcr.k);
    }

    private alrq() {
    }

    protected final java.lang.Object a(int i, java.lang.Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new albr(a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဂ\u0000", new java.lang.Object[]{"b", "c"});
        }
        if (i2 == 3) {
            return new defpackage.alrq();
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
        return alad.M(defpackage.alrq.class);
    }
}
