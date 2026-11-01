package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class acuu extends defpackage.alad implements defpackage.albi {
    public static final defpackage.acuu a;
    public int b;
    public boolean c = true;
    public boolean d = true;
    public boolean e;

    static {
        defpackage.acuu acuuVar = new defpackage.acuu();
        a = acuuVar;
        defpackage.alad.Q(defpackage.acuu.class, acuuVar);
    }

    private acuu() {
    }

    @Override // defpackage.alad
    protected final java.lang.Object a(int i, java.lang.Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new defpackage.albr(a, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဇ\u0002", new java.lang.Object[]{"b", "c", "d", "e"});
        }
        if (i2 == 3) {
            return new defpackage.acuu();
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
        return defpackage.alad.M(defpackage.acuu.class);
    }
}
