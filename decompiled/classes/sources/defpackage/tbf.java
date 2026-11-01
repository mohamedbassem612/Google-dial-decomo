package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class tbf extends defpackage.alad implements defpackage.albi {
    public static final defpackage.tbf a;
    public int b;
    public int c;
    public boolean d;
    public int e;
    public int f;
    public int g;
    public int h;
    public boolean i;

    static {
        defpackage.tbf tbfVar = new defpackage.tbf();
        a = tbfVar;
        defpackage.alad.Q(defpackage.tbf.class, tbfVar);
    }

    private tbf() {
    }

    @Override // defpackage.alad
    protected final java.lang.Object a(int i, java.lang.Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            defpackage.alai alaiVar = rmr.j;
            return new defpackage.albr(a, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001᠌\u0000\u0002ဇ\u0001\u0003᠌\u0002\u0004᠌\u0003\u0005᠌\u0004\u0006᠌\u0005\u0007ဇ\u0006", new java.lang.Object[]{"b", "c", rmr.k, "d", "e", alaiVar, "f", alaiVar, "g", alaiVar, "h", alaiVar, "i"});
        }
        if (i2 == 3) {
            return new defpackage.tbf();
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
        return defpackage.alad.M(defpackage.tbf.class);
    }
}
