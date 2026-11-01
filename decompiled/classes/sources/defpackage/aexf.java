package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aexf extends defpackage.alad implements defpackage.albi {
    public static final defpackage.aexf a;
    public int b;
    public defpackage.aexe d;
    public java.lang.String c = "";
    public java.lang.String e = "";

    static {
        defpackage.aexf aexfVar = new defpackage.aexf();
        a = aexfVar;
        defpackage.alad.Q(defpackage.aexf.class, aexfVar);
    }

    private aexf() {
    }

    @Override // defpackage.alad
    protected final java.lang.Object a(int i, java.lang.Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new defpackage.albr(a, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဉ\u0001\u0003ဈ\u0002", new java.lang.Object[]{"b", "c", "d", "e"});
        }
        if (i2 == 3) {
            return new defpackage.aexf();
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
        return defpackage.alad.M(defpackage.aexf.class);
    }
}
