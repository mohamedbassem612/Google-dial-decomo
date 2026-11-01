package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class wgi extends defpackage.alad implements defpackage.albi {
    public static final defpackage.wgi a;
    public int b;
    public boolean c;
    public boolean d;

    static {
        defpackage.wgi wgiVar = new defpackage.wgi();
        a = wgiVar;
        defpackage.alad.Q(defpackage.wgi.class, wgiVar);
    }

    private wgi() {
    }

    @Override // defpackage.alad
    protected final java.lang.Object a(int i, java.lang.Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new defpackage.albr(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001", new java.lang.Object[]{"b", "c", "d"});
        }
        if (i2 == 3) {
            return new defpackage.wgi();
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
        return defpackage.alad.M(defpackage.wgi.class);
    }
}
