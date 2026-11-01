package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class akrs extends defpackage.alad implements defpackage.albi {
    public static final defpackage.akrs a;
    public int b;
    public java.lang.String c = "";
    public java.lang.String d = "";
    public int e;
    public int f;

    static {
        defpackage.akrs akrsVar = new defpackage.akrs();
        a = akrsVar;
        defpackage.alad.Q(defpackage.akrs.class, akrsVar);
    }

    private akrs() {
    }

    @Override // defpackage.alad
    protected final java.lang.Object a(int i, java.lang.Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new defpackage.albr(a, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003᠌\u0002\u0004᠌\u0003", new java.lang.Object[]{"b", "c", "d", "e", defpackage.akqx.f, "f", defpackage.akqx.e});
        }
        if (i2 == 3) {
            return new defpackage.akrs();
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
        return defpackage.alad.M(defpackage.akrs.class);
    }
}
