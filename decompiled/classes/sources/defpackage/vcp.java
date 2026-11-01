package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class vcp extends defpackage.alad implements defpackage.albi {
    public static final defpackage.vcp a;
    public int b = 0;
    public java.lang.Object c;
    public boolean d;

    static {
        defpackage.vcp vcpVar = new defpackage.vcp();
        a = vcpVar;
        defpackage.alad.Q(defpackage.vcp.class, vcpVar);
    }

    private vcp() {
    }

    @Override // defpackage.alad
    protected final java.lang.Object a(int i, java.lang.Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new defpackage.albr(a, "\u0000\u0004\u0001\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001?\u0000\u0002?\u0000\u0003?\u0000\u0004\u0007", new java.lang.Object[]{"c", "b", "d"});
        }
        if (i2 == 3) {
            return new defpackage.vcp();
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
        return defpackage.alad.M(defpackage.vcp.class);
    }
}
