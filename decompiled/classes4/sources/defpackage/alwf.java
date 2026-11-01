package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class alwf extends alad implements albi {
    public static final defpackage.alwf a;
    public int b;
    public java.lang.String c = "";
    public alat d = albq.a;

    static {
        defpackage.alwf alwfVar = new defpackage.alwf();
        a = alwfVar;
        alad.Q(defpackage.alwf.class, alwfVar);
    }

    private alwf() {
    }

    protected final java.lang.Object a(int i, java.lang.Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new albr(a, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b", new java.lang.Object[]{"b", "c", "d", defpackage.alwe.class});
        }
        if (i2 == 3) {
            return new defpackage.alwf();
        }
        if (i2 == 4) {
            return new akzx((boolean[][][]) null);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return alad.M(defpackage.alwf.class);
        }
        return null;
    }

    public final void b() {
        alat alatVar = this.d;
        if (alatVar.c()) {
            return;
        }
        this.d = alad.J(alatVar);
    }
}
