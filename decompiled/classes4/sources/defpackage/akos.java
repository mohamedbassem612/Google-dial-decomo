package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class akos extends alad implements albi {
    public static final defpackage.akos a;
    public int b;
    public int c;

    static {
        defpackage.akos akosVar = new defpackage.akos();
        a = akosVar;
        alad.Q(defpackage.akos.class, akosVar);
    }

    private akos() {
    }

    protected final java.lang.Object a(int i, java.lang.Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new albr(a, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001᠌\u0000", new java.lang.Object[]{"b", "c", defpackage.amjt.a});
        }
        if (i2 == 3) {
            return new defpackage.akos();
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
        return alad.M(defpackage.akos.class);
    }
}
