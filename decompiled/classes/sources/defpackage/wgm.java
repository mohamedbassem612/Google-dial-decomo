package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class wgm extends defpackage.alad implements defpackage.albi {
    public static final defpackage.wgm a;
    public int b;
    public int c;
    public int d;
    public boolean e;

    static {
        defpackage.wgm wgmVar = new defpackage.wgm();
        a = wgmVar;
        defpackage.alad.Q(defpackage.wgm.class, wgmVar);
    }

    private wgm() {
    }

    @Override // defpackage.alad
    protected final java.lang.Object a(int i, java.lang.Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new defpackage.albr(a, "\u0000\u0004\u0000\u0000\u0002\u0005\u0004\u0000\u0000\u0000\u0002\f\u0003\f\u0004\f\u0005\u0007", new java.lang.Object[]{"b", "c", "d", "e"});
        }
        if (i2 == 3) {
            return new defpackage.wgm();
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
        return defpackage.alad.M(defpackage.wgm.class);
    }
}
