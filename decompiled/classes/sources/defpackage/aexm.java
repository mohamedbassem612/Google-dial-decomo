package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aexm extends defpackage.alad implements defpackage.albi {
    public static final defpackage.aexm a;
    public long e;
    private int g;
    public defpackage.albe f = defpackage.albe.a;
    public java.lang.String b = "";
    public defpackage.akzc c = defpackage.akzc.d;
    public java.lang.String d = "";

    static {
        defpackage.aexm aexmVar = new defpackage.aexm();
        a = aexmVar;
        defpackage.alad.Q(defpackage.aexm.class, aexmVar);
    }

    private aexm() {
    }

    @Override // defpackage.alad
    protected final java.lang.Object a(int i, java.lang.Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new defpackage.albr(a, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0001\u0000\u0000\u0001ဈ\u0000\u0002ည\u0001\u0003ဈ\u0002\u0004ဂ\u0003\u00052", new java.lang.Object[]{"g", "b", "c", "d", "e", "f", new defpackage.ajyk(defpackage.alcr.STRING, "", defpackage.alcr.MESSAGE, defpackage.aexh.a)});
        }
        if (i2 == 3) {
            return new defpackage.aexm();
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
        return defpackage.alad.M(defpackage.aexm.class);
    }
}
