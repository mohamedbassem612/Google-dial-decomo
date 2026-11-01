package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class alsl extends alad implements albi {
    public static final defpackage.alsl a;
    public static final apdi c;
    public alat b = albq.a;

    static {
        defpackage.alsl alslVar = new defpackage.alsl();
        a = alslVar;
        alad.Q(defpackage.alsl.class, alslVar);
        c = alad.W(defpackage.alsi.a, alslVar, alslVar, 107, alcr.k);
    }

    private alsl() {
    }

    protected final java.lang.Object a(int i, java.lang.Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new albr(a, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new java.lang.Object[]{"b", defpackage.alsj.class});
        }
        if (i2 == 3) {
            return new defpackage.alsl();
        }
        if (i2 == 4) {
            return new akzx((byte[][][]) null);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return alad.M(defpackage.alsl.class);
        }
        return null;
    }

    public final void b() {
        alat alatVar = this.b;
        if (alatVar.c()) {
            return;
        }
        this.b = alad.J(alatVar);
    }
}
