package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class akru extends defpackage.alad implements defpackage.albi {
    public static final defpackage.akru a;
    public int b;
    public java.lang.String c = "";
    public int d;

    static {
        defpackage.akru akruVar = new defpackage.akru();
        a = akruVar;
        defpackage.alad.Q(defpackage.akru.class, akruVar);
    }

    private akru() {
    }

    @Override // defpackage.alad
    protected final java.lang.Object a(int i, java.lang.Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new defpackage.albr(a, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002᠌\u0001", new java.lang.Object[]{"b", "c", "d", akqn.g});
        }
        if (i2 == 3) {
            return new defpackage.akru();
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
        return defpackage.alad.M(defpackage.akru.class);
    }
}
