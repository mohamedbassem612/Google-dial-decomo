package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class kis extends alad implements albi {
    public static final defpackage.kis a;
    public alan b;
    public alat c;
    public alan d;

    static {
        defpackage.kis kisVar = new defpackage.kis();
        a = kisVar;
        alad.Q(defpackage.kis.class, kisVar);
    }

    private kis() {
        albd albdVar = albd.a;
        this.b = albdVar;
        this.c = albq.a;
        this.d = albdVar;
    }

    protected final java.lang.Object a(int i, java.lang.Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new albr(a, "\u0001\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0003\u0000\u0001\u0014\u0002\u001a\u0003\u0014", new java.lang.Object[]{"b", "c", "d"});
        }
        if (i2 == 3) {
            return new defpackage.kis();
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
        return alad.M(defpackage.kis.class);
    }

    public final void b() {
        alat alatVar = this.c;
        if (alatVar.c()) {
            return;
        }
        this.c = alad.J(alatVar);
    }

    public final void c() {
        alan alanVar = this.b;
        if (alanVar.c()) {
            return;
        }
        this.b = alad.I(alanVar);
    }

    public final void d() {
        alan alanVar = this.d;
        if (alanVar.c()) {
            return;
        }
        this.d = alad.I(alanVar);
    }
}
