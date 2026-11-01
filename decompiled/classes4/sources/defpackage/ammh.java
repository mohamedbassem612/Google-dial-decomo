package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class ammh extends alad implements albi {
    public static final defpackage.ammh a;
    public long b;
    public java.lang.String c = "";
    public java.lang.String d = "";
    public java.lang.String e = "";

    static {
        defpackage.ammh ammhVar = new defpackage.ammh();
        a = ammhVar;
        alad.Q(defpackage.ammh.class, ammhVar);
    }

    private ammh() {
    }

    protected final java.lang.Object a(int i, java.lang.Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new albr(a, "\u0000\u0004\u0000\u0000\u0001\b\u0004\u0000\u0000\u0000\u0001\u0003\u0004Ȉ\u0006Ȉ\bȈ", new java.lang.Object[]{"b", "c", "d", "e"});
        }
        if (i2 == 3) {
            return new defpackage.ammh();
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
        return alad.M(defpackage.ammh.class);
    }
}
