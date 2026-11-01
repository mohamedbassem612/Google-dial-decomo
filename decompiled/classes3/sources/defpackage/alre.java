package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class alre extends alad implements albi {
    public static final defpackage.alre a;
    public static final apdi e;
    public int b;
    public boolean c;
    public java.lang.String d = "";

    static {
        defpackage.alre alreVar = new defpackage.alre();
        a = alreVar;
        alad.Q(defpackage.alre.class, alreVar);
        e = alad.W(alro.a, alreVar, alreVar, 100, alcr.k);
    }

    private alre() {
    }

    protected final java.lang.Object a(int i, java.lang.Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new albr(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဈ\u0001", new java.lang.Object[]{"b", "c", "d"});
        }
        if (i2 == 3) {
            return new defpackage.alre();
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
        return alad.M(defpackage.alre.class);
    }
}
