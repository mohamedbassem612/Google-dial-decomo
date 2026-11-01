package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class alvm extends alad implements albi {
    public static final defpackage.alvm a;
    public static final apdi f;
    public int b;
    public java.lang.String c = "";
    public boolean d;
    public long e;

    static {
        defpackage.alvm alvmVar = new defpackage.alvm();
        a = alvmVar;
        alad.Q(defpackage.alvm.class, alvmVar);
        f = alad.W(defpackage.almz.a, alvmVar, alvmVar, 143, alcr.k);
    }

    private alvm() {
    }

    protected final java.lang.Object a(int i, java.lang.Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new albr(a, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ለ\u0000\u0002ဇ\u0001\u0003ဂ\u0002", new java.lang.Object[]{"b", "c", "d", "e"});
        }
        if (i2 == 3) {
            return new defpackage.alvm();
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
        return alad.M(defpackage.alvm.class);
    }
}
