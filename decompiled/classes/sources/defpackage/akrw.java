package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class akrw extends defpackage.alad implements defpackage.albi {
    public static final defpackage.akrw a;
    public int b;
    public java.lang.String c = "";
    public java.lang.String d = "";
    public java.lang.String e = "";
    public defpackage.akrv f;
    public defpackage.akyp g;

    static {
        defpackage.akrw akrwVar = new defpackage.akrw();
        a = akrwVar;
        defpackage.alad.Q(defpackage.akrw.class, akrwVar);
    }

    private akrw() {
    }

    @Override // defpackage.alad
    protected final java.lang.Object a(int i, java.lang.Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new defpackage.albr(a, "\u0004\u0005\u0000\u0001\u0001\u001e\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0003ဉ\u0005\u0004ဈ\u0003\u0005ဈ\u0002\u001eဉ\u0006", new java.lang.Object[]{"b", "c", "f", "e", "d", "g"});
        }
        if (i2 == 3) {
            return new defpackage.akrw();
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
        return defpackage.alad.M(defpackage.akrw.class);
    }
}
