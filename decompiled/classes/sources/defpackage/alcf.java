package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class alcf extends defpackage.alad implements defpackage.albi {
    public static final defpackage.alcf a;
    public long b;
    public int c;

    static {
        defpackage.alcf alcfVar = new defpackage.alcf();
        a = alcfVar;
        defpackage.alad.Q(defpackage.alcf.class, alcfVar);
    }

    private alcf() {
    }

    @Override // defpackage.alad
    protected final java.lang.Object a(int i, java.lang.Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new defpackage.albr(a, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0002\u0002\u0004", new java.lang.Object[]{"b", "c"});
        }
        if (i2 == 3) {
            return new defpackage.alcf();
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
        return defpackage.alad.M(defpackage.alcf.class);
    }
}
