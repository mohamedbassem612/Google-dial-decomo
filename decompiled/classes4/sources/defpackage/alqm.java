package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class alqm extends alad implements albi {
    public static final defpackage.alqm a;
    public alat b = albq.a;

    static {
        defpackage.alqm alqmVar = new defpackage.alqm();
        a = alqmVar;
        alad.Q(defpackage.alqm.class, alqmVar);
    }

    private alqm() {
    }

    protected final java.lang.Object a(int i, java.lang.Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new albr(a, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new java.lang.Object[]{"b", defpackage.alqq.class});
        }
        if (i2 == 3) {
            return new defpackage.alqm();
        }
        if (i2 == 4) {
            return new akzx((float[][][]) null, (byte[]) null);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return alad.M(defpackage.alqm.class);
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
