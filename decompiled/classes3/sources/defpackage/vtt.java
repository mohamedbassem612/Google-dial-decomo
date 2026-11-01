package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class vtt extends alad implements albi {
    public static final defpackage.vtt a;
    public int b;
    public defpackage.vtq d;
    public java.lang.String c = "";
    public java.lang.String e = "";

    static {
        defpackage.vtt vttVar = new defpackage.vtt();
        a = vttVar;
        alad.Q(defpackage.vtt.class, vttVar);
    }

    private vtt() {
    }

    protected final java.lang.Object a(int i, java.lang.Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new albr(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဉ\u0001\u0003ဈ\u0002", new java.lang.Object[]{"b", "c", "d", "e"});
        }
        if (i2 == 3) {
            return new defpackage.vtt();
        }
        if (i2 == 4) {
            return new akzx(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            return null;
        }
        return alad.M(defpackage.vtt.class);
    }
}
