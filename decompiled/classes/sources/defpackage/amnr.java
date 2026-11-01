package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class amnr extends defpackage.alad implements defpackage.albi {
    public static final defpackage.amnr a;
    public int b;
    public int c;

    static {
        defpackage.amnr amnrVar = new defpackage.amnr();
        a = amnrVar;
        defpackage.alad.Q(defpackage.amnr.class, amnrVar);
    }

    private amnr() {
    }

    @Override // defpackage.alad
    protected final java.lang.Object a(int i, java.lang.Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new defpackage.albr(a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001᠌\u0000", new java.lang.Object[]{"b", "c", defpackage.akqx.j});
        }
        if (i2 == 3) {
            return new defpackage.amnr();
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
        return defpackage.alad.M(defpackage.amnr.class);
    }
}
