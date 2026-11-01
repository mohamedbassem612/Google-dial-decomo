package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class vbr extends alad implements albi {
    public static final defpackage.vbr a;
    public int b;
    public defpackage.vcm c;
    public boolean d;

    static {
        defpackage.vbr vbrVar = new defpackage.vbr();
        a = vbrVar;
        alad.Q(defpackage.vbr.class, vbrVar);
    }

    private vbr() {
    }

    protected final java.lang.Object a(int i, java.lang.Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new albr(a, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002\u0007", new java.lang.Object[]{"b", "c", "d"});
        }
        if (i2 == 3) {
            return new defpackage.vbr();
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
        return alad.M(defpackage.vbr.class);
    }
}
