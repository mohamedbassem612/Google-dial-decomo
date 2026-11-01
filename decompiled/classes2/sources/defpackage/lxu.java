package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class lxu extends alad implements albi {
    public static final defpackage.lxu a;
    public int b;
    public long c;
    public alat d;
    public alat e;

    static {
        defpackage.lxu lxuVar = new defpackage.lxu();
        a = lxuVar;
        alad.Q(defpackage.lxu.class, lxuVar);
    }

    private lxu() {
        albq albqVar = albq.a;
        this.d = albqVar;
        this.e = albqVar;
    }

    protected final java.lang.Object a(int i, java.lang.Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new albr(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0002\u0000\u0001ဂ\u0000\u0002\u001a\u0003\u001a", new java.lang.Object[]{"b", "c", "d", "e"});
        }
        if (i2 == 3) {
            return new defpackage.lxu();
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
        return alad.M(defpackage.lxu.class);
    }
}
