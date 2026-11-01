package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class amoi extends alad implements albi {
    public static final defpackage.amoi a;
    public alat b;
    public alat c;

    static {
        defpackage.amoi amoiVar = new defpackage.amoi();
        a = amoiVar;
        alad.Q(defpackage.amoi.class, amoiVar);
    }

    private amoi() {
        albq albqVar = albq.a;
        this.b = albqVar;
        this.c = albqVar;
    }

    protected final java.lang.Object a(int i, java.lang.Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new albr(a, "\u0001\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0002\u0000\u0001\u001b\u0002\u001b", new java.lang.Object[]{"b", defpackage.amog.class, "c", defpackage.amoh.class});
        }
        if (i2 == 3) {
            return new defpackage.amoi();
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
        return alad.M(defpackage.amoi.class);
    }
}
