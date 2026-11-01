package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aegw extends defpackage.alad implements defpackage.albi {
    public static final defpackage.aegw a;
    public int b;
    public long d;
    public boolean e;
    public int f;
    public int i;
    public boolean l;
    public java.lang.String c = "";
    public java.lang.String g = "";
    public java.lang.String h = "";
    public java.lang.String j = "";
    public java.lang.String k = "";

    static {
        defpackage.aegw aegwVar = new defpackage.aegw();
        a = aegwVar;
        defpackage.alad.Q(defpackage.aegw.class, aegwVar);
    }

    private aegw() {
    }

    @Override // defpackage.alad
    protected final java.lang.Object a(int i, java.lang.Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new defpackage.albr(a, "\u0004\u000b\u0000\u0000\u0001\u000b\u000b\u0000\u0000\u0000\u0001\u0004\u0002Ȉ\u0003\u0002\u0004\u0007\u0005\f\u0006Ȉ\u0007Ȉ\b\f\tȈ\nȈ\u000b\u0007", new java.lang.Object[]{"b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l"});
        }
        if (i2 == 3) {
            return new defpackage.aegw();
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
        return defpackage.alad.M(defpackage.aegw.class);
    }
}
