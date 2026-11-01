package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aexh extends defpackage.alad implements defpackage.albi {
    public static final defpackage.aexh a;
    public int b;
    public java.lang.Object d;
    public int c = 0;
    public java.lang.String e = "";

    static {
        defpackage.aexh aexhVar = new defpackage.aexh();
        a = aexhVar;
        defpackage.alad.Q(defpackage.aexh.class, aexhVar);
    }

    private aexh() {
    }

    @Override // defpackage.alad
    protected final java.lang.Object a(int i, java.lang.Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new defpackage.albr(a, "\u0004\u0006\u0001\u0001\u0001\n\u0006\u0000\u0000\u0000\u00018\u0000\u0002:\u0000\u00033\u0000\u0004;\u0000\u0005=\u0000\nဈ\u0000", new java.lang.Object[]{"d", "c", "b", "e"});
        }
        if (i2 == 3) {
            return new defpackage.aexh();
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
        return defpackage.alad.M(defpackage.aexh.class);
    }
}
