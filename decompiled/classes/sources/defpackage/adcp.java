package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class adcp extends defpackage.alad implements defpackage.albi {
    public static final defpackage.adcp a;
    public defpackage.albe b = defpackage.albe.a;

    static {
        defpackage.adcp adcpVar = new defpackage.adcp();
        a = adcpVar;
        defpackage.alad.Q(defpackage.adcp.class, adcpVar);
    }

    private adcp() {
    }

    @Override // defpackage.alad
    protected final java.lang.Object a(int i, java.lang.Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new defpackage.albr(a, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new java.lang.Object[]{"b", new defpackage.ajyk(defpackage.alcr.STRING, "", defpackage.alcr.MESSAGE, adco.a)});
        }
        if (i2 == 3) {
            return new defpackage.adcp();
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
        return defpackage.alad.M(defpackage.adcp.class);
    }
}
