package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class jsq extends defpackage.alad implements defpackage.albi {
    public static final defpackage.jsq a;
    public int b;
    public boolean c;

    static {
        defpackage.jsq jsqVar = new defpackage.jsq();
        a = jsqVar;
        defpackage.alad.Q(defpackage.jsq.class, jsqVar);
    }

    private jsq() {
    }

    @Override // defpackage.alad
    protected final java.lang.Object a(int i, java.lang.Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new defpackage.albr(a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဇ\u0000", new java.lang.Object[]{"b", "c"});
        }
        if (i2 == 3) {
            return new defpackage.jsq();
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
        return defpackage.alad.M(defpackage.jsq.class);
    }
}
