package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class apga extends defpackage.alad implements defpackage.albi {
    public static final defpackage.apga a;
    public int b;
    public int c = 0;
    public java.lang.Object d;
    public int e;

    static {
        defpackage.apga apgaVar = new defpackage.apga();
        a = apgaVar;
        defpackage.alad.Q(defpackage.apga.class, apgaVar);
    }

    private apga() {
        defpackage.albd albdVar = defpackage.albd.a;
    }

    @Override // defpackage.alad
    protected final java.lang.Object a(int i, java.lang.Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new defpackage.albr(a, "\u0001\u0003\u0001\u0001\u0002\u0004\u0003\u0000\u0000\u0000\u0002>\u0000\u0003᠌\u0001\u0004<\u0000", new java.lang.Object[]{"d", "c", "b", "e", defpackage.amub.r, defpackage.apfz.class});
        }
        if (i2 == 3) {
            return new defpackage.apga();
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
        return defpackage.alad.M(defpackage.apga.class);
    }
}
