package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class olv extends defpackage.alad implements defpackage.albi {
    public static final defpackage.olv a;
    public int b;
    public defpackage.albe c = defpackage.albe.a;
    public defpackage.alcf d;

    static {
        defpackage.olv olvVar = new defpackage.olv();
        a = olvVar;
        defpackage.alad.Q(defpackage.olv.class, olvVar);
    }

    private olv() {
    }

    @Override // defpackage.alad
    protected final java.lang.Object a(int i, java.lang.Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            defpackage.alcr alcrVar = defpackage.alcr.STRING;
            return new defpackage.albr(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0001\u0000\u0000\u00012\u0002ဉ\u0000", new java.lang.Object[]{"b", "c", new defpackage.ajyk(alcrVar, "", alcrVar, ""), "d"});
        }
        if (i2 == 3) {
            return new defpackage.olv();
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
        return defpackage.alad.M(defpackage.olv.class);
    }
}
