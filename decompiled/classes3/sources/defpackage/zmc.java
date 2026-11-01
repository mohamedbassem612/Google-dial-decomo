package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class zmc extends alad implements albi {
    public static final defpackage.zmc a;
    public int b = 0;
    public java.lang.Object c;

    static {
        defpackage.zmc zmcVar = new defpackage.zmc();
        a = zmcVar;
        alad.Q(defpackage.zmc.class, zmcVar);
    }

    private zmc() {
    }

    protected final java.lang.Object a(int i, java.lang.Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new albr(a, "\u0000\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000", new java.lang.Object[]{"c", "b", defpackage.zmf.class, defpackage.zmh.class});
        }
        if (i2 == 3) {
            return new defpackage.zmc();
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
        return alad.M(defpackage.zmc.class);
    }
}
