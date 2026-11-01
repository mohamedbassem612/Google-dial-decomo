package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aazi extends defpackage.alad implements defpackage.albi {
    public static final defpackage.aazi a;
    public int b;
    public defpackage.aazh c;
    public defpackage.alat d = defpackage.albq.a;

    static {
        defpackage.aazi aaziVar = new defpackage.aazi();
        a = aaziVar;
        defpackage.alad.Q(defpackage.aazi.class, aaziVar);
    }

    private aazi() {
    }

    @Override // defpackage.alad
    protected final java.lang.Object a(int i, java.lang.Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new defpackage.albr(a, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဉ\u0000\u0002\u001b", new java.lang.Object[]{"b", "c", "d", defpackage.aazj.class});
        }
        if (i2 == 3) {
            return new defpackage.aazi();
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
        return defpackage.alad.M(defpackage.aazi.class);
    }
}
