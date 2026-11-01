package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class acbc extends defpackage.alad implements defpackage.albi {
    public static final defpackage.acbc a;
    public int b;
    public defpackage.alat c = defpackage.albq.a;
    private int d;

    static {
        defpackage.acbc acbcVar = new defpackage.acbc();
        a = acbcVar;
        defpackage.alad.Q(defpackage.acbc.class, acbcVar);
    }

    private acbc() {
    }

    @Override // defpackage.alad
    protected final java.lang.Object a(int i, java.lang.Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new defpackage.albr(a, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001᠌\u0000\u0002\u001b", new java.lang.Object[]{"d", "b", akja.s, "c", acbb.class});
        }
        if (i2 == 3) {
            return new defpackage.acbc();
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
        return defpackage.alad.M(defpackage.acbc.class);
    }
}
