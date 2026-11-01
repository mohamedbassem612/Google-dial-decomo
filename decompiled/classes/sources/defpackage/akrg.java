package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class akrg extends defpackage.alad implements defpackage.albi {
    public static final defpackage.akrg a;
    public int b;
    public long e;
    public long g;
    public java.lang.String c = "";
    public java.lang.String d = "";
    public java.lang.String f = "";

    static {
        defpackage.akrg akrgVar = new defpackage.akrg();
        a = akrgVar;
        defpackage.alad.Q(defpackage.akrg.class, akrgVar);
    }

    private akrg() {
    }

    @Override // defpackage.alad
    protected final java.lang.Object a(int i, java.lang.Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new defpackage.albr(a, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0003\u0003ဂ\u0002\u0004ဂ\u0004\u0005ဈ\u0001", new java.lang.Object[]{"b", "c", "f", "e", "g", "d"});
        }
        if (i2 == 3) {
            return new defpackage.akrg();
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
        return defpackage.alad.M(defpackage.akrg.class);
    }
}
