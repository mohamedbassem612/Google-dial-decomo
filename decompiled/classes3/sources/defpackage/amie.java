package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class amie extends alad implements albi {
    public static final defpackage.amie a;
    public int b;
    public int c;
    public java.lang.String d = "";

    static {
        defpackage.amie amieVar = new defpackage.amie();
        a = amieVar;
        alad.Q(defpackage.amie.class, amieVar);
    }

    private amie() {
    }

    protected final java.lang.Object a(int i, java.lang.Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new albr(a, "\u0004\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\f\u0002\u000b\u0003Ȉ", new java.lang.Object[]{"b", "c", "d"});
        }
        if (i2 == 3) {
            return new defpackage.amie();
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
        return alad.M(defpackage.amie.class);
    }
}
