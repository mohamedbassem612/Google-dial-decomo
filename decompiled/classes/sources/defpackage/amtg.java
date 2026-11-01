package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class amtg extends defpackage.alad implements defpackage.albi {
    public static final defpackage.amtg a;
    public int b;
    public int c;
    public int d;
    public int e;
    public boolean f;

    static {
        defpackage.amtg amtgVar = new defpackage.amtg();
        a = amtgVar;
        defpackage.alad.Q(defpackage.amtg.class, amtgVar);
    }

    private amtg() {
    }

    @Override // defpackage.alad
    protected final java.lang.Object a(int i, java.lang.Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            defpackage.alai alaiVar = defpackage.akqx.p;
            return new defpackage.albr(a, "\u0001\u0004\u0000\u0001\u0002\u0005\u0004\u0000\u0000\u0000\u0002᠌\u0000\u0003᠌\u0001\u0004᠌\u0002\u0005ဇ\u0003", new java.lang.Object[]{"b", "c", defpackage.akqx.o, "d", alaiVar, "e", alaiVar, "f"});
        }
        if (i2 == 3) {
            return new defpackage.amtg();
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
        return defpackage.alad.M(defpackage.amtg.class);
    }
}
