package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class alqr extends alad implements albi {
    public static final defpackage.alqr a;
    public alat b = albq.a;

    static {
        defpackage.alqr alqrVar = new defpackage.alqr();
        a = alqrVar;
        alad.Q(defpackage.alqr.class, alqrVar);
    }

    private alqr() {
    }

    protected final java.lang.Object a(int i, java.lang.Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new albr(a, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new java.lang.Object[]{"b", defpackage.alqq.class});
        }
        if (i2 == 3) {
            return new defpackage.alqr();
        }
        if (i2 == 4) {
            return new akzx((int[]) null);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return alad.M(defpackage.alqr.class);
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
