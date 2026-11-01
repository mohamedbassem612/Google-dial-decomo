package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class apgj extends defpackage.alad implements defpackage.albi {
    public static final defpackage.apgj a;
    public defpackage.alan b;
    public defpackage.alan c;
    public defpackage.alak d;
    public defpackage.alak e;
    public defpackage.alak f;
    public defpackage.alat g;

    static {
        defpackage.apgj apgjVar = new defpackage.apgj();
        a = apgjVar;
        defpackage.alad.Q(defpackage.apgj.class, apgjVar);
    }

    private apgj() {
        defpackage.albd albdVar = defpackage.albd.a;
        this.b = albdVar;
        this.c = albdVar;
        defpackage.alae alaeVar = defpackage.alae.a;
        this.d = alaeVar;
        this.e = alaeVar;
        this.f = alaeVar;
        this.g = defpackage.albq.a;
    }

    @Override // defpackage.alad
    protected final java.lang.Object a(int i, java.lang.Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new defpackage.albr(a, "\u0001\u0006\u0000\u0000\u0001\u0006\u0006\u0000\u0006\u0000\u0001%\u0002%\u0003'\u0004'\u0005'\u0006\u001a", new java.lang.Object[]{"b", "c", "d", "e", "f", "g"});
        }
        if (i2 == 3) {
            return new defpackage.apgj();
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
        return defpackage.alad.M(defpackage.apgj.class);
    }
}
