package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class amsc extends alad implements albi {
    public static final defpackage.amsc a;
    public int b;
    public int c;
    public int d;

    static {
        defpackage.amsc amscVar = new defpackage.amsc();
        a = amscVar;
        alad.Q(defpackage.amsc.class, amscVar);
    }

    private amsc() {
    }

    protected final java.lang.Object a(int i, java.lang.Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new albr(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဋ\u0000\u0002ဋ\u0001", new java.lang.Object[]{"b", "c", "d"});
        }
        if (i2 == 3) {
            return new defpackage.amsc();
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
        return alad.M(defpackage.amsc.class);
    }
}
