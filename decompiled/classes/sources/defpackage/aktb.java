package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aktb extends defpackage.alad implements defpackage.albi {
    public static final defpackage.aktb a;
    public defpackage.alan b = defpackage.albd.a;

    static {
        defpackage.aktb aktbVar = new defpackage.aktb();
        a = aktbVar;
        defpackage.alad.Q(defpackage.aktb.class, aktbVar);
    }

    private aktb() {
    }

    @Override // defpackage.alad
    protected final java.lang.Object a(int i, java.lang.Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new defpackage.albr(a, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0015", new java.lang.Object[]{"b"});
        }
        if (i2 == 3) {
            return new defpackage.aktb();
        }
        if (i2 == 4) {
            return new defpackage.akzx((int[]) null, (byte[]) null);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return defpackage.alad.M(defpackage.aktb.class);
        }
        return null;
    }

    public final void b() {
        defpackage.alan alanVar = this.b;
        if (alanVar.c()) {
            return;
        }
        this.b = defpackage.alad.I(alanVar);
    }
}
