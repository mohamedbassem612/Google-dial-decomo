package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class vco extends alad implements albi {
    public static final defpackage.vco a;
    public java.lang.String b = "";
    public java.lang.String c = "";

    static {
        defpackage.vco vcoVar = new defpackage.vco();
        a = vcoVar;
        alad.Q(defpackage.vco.class, vcoVar);
    }

    private vco() {
    }

    protected final java.lang.Object a(int i, java.lang.Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new albr(a, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ", new java.lang.Object[]{"b", "c"});
        }
        if (i2 == 3) {
            return new defpackage.vco();
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
        return alad.M(defpackage.vco.class);
    }
}
