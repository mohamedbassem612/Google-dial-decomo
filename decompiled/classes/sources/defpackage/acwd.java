package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class acwd extends defpackage.alad implements defpackage.albi {
    public static final defpackage.acwd a;
    public int b;
    public defpackage.alcf c;
    public boolean e;
    public acwf f;
    public defpackage.albe g = defpackage.albe.a;
    public defpackage.alat d = defpackage.albq.a;

    static {
        defpackage.acwd acwdVar = new defpackage.acwd();
        a = acwdVar;
        defpackage.alad.Q(defpackage.acwd.class, acwdVar);
    }

    private acwd() {
    }

    @Override // defpackage.alad
    protected final java.lang.Object a(int i, java.lang.Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new defpackage.albr(a, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0001\u0001\u0000\u0001ဉ\u0000\u0002\u001b\u0003ဇ\u0001\u0004ဉ\u0002\u00052", new java.lang.Object[]{"b", "c", "d", acvy.class, "e", "f", "g", new defpackage.ajyk(defpackage.alcr.STRING, "", defpackage.alcr.MESSAGE, defpackage.alcf.a)});
        }
        if (i2 == 3) {
            return new defpackage.acwd();
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
        return defpackage.alad.M(defpackage.acwd.class);
    }

    public final void b() {
        defpackage.alat alatVar = this.d;
        if (alatVar.c()) {
            return;
        }
        this.d = defpackage.alad.J(alatVar);
    }
}
