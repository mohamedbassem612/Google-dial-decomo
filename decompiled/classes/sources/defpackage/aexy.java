package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aexy extends defpackage.alad implements defpackage.albi {
    public static final defpackage.aexy a;
    public int b;
    public defpackage.aexv c;
    public defpackage.aexw d;

    static {
        defpackage.aexy aexyVar = new defpackage.aexy();
        a = aexyVar;
        defpackage.alad.Q(defpackage.aexy.class, aexyVar);
    }

    private aexy() {
    }

    @Override // defpackage.alad
    protected final java.lang.Object a(int i, java.lang.Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new defpackage.albr(a, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new java.lang.Object[]{"b", "c", "d"});
        }
        if (i2 == 3) {
            return new defpackage.aexy();
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
        return defpackage.alad.M(defpackage.aexy.class);
    }
}
