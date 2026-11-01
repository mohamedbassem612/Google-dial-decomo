package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class amrq extends defpackage.alad implements defpackage.albi {
    public static final defpackage.amrq a;
    public int b;
    public int c;
    public int d;

    static {
        defpackage.amrq amrqVar = new defpackage.amrq();
        a = amrqVar;
        defpackage.alad.Q(defpackage.amrq.class, amrqVar);
    }

    private amrq() {
    }

    @Override // defpackage.alad
    protected final java.lang.Object a(int i, java.lang.Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new defpackage.albr(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001", new java.lang.Object[]{"b", "c", amos.s, "d", yrl.f});
        }
        if (i2 == 3) {
            return new defpackage.amrq();
        }
        if (i2 == 4) {
            return new defpackage.akzx(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            return null;
        }
        return defpackage.alad.M(defpackage.amrq.class);
    }
}
