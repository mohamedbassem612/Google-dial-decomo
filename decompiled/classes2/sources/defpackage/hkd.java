package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class hkd extends alad implements albi {
    public static final defpackage.hkd a;
    public int b;
    public boolean e;
    public boolean g;
    public java.lang.String c = "";
    public java.lang.String d = "";
    public java.lang.String f = "";
    public java.lang.String h = "";

    static {
        defpackage.hkd hkdVar = new defpackage.hkd();
        a = hkdVar;
        alad.Q(defpackage.hkd.class, hkdVar);
    }

    private hkd() {
    }

    protected final java.lang.Object a(int i, java.lang.Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new albr(a, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဇ\u0002\u0004ဈ\u0003\u0005ဇ\u0004\u0006ဈ\u0005", new java.lang.Object[]{"b", "c", "d", "e", "f", "g", "h"});
        }
        if (i2 == 3) {
            return new defpackage.hkd();
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
        return alad.M(defpackage.hkd.class);
    }
}
