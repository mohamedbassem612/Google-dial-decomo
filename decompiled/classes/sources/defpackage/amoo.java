package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class amoo extends defpackage.alad implements defpackage.albi {
    public static final defpackage.amoo a;
    public int b;
    public int c;
    public int d;

    static {
        defpackage.amoo amooVar = new defpackage.amoo();
        a = amooVar;
        defpackage.alad.Q(defpackage.amoo.class, amooVar);
    }

    private amoo() {
    }

    @Override // defpackage.alad
    protected final java.lang.Object a(int i, java.lang.Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new defpackage.albr(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001", new java.lang.Object[]{"b", "c", amjv.s, "d", amjv.t});
        }
        if (i2 == 3) {
            return new defpackage.amoo();
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
        return defpackage.alad.M(defpackage.amoo.class);
    }
}
