package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class alxd extends alad implements albi {
    public static final defpackage.alxd a;
    public alat b;
    public alat c;
    public alat d;

    static {
        defpackage.alxd alxdVar = new defpackage.alxd();
        a = alxdVar;
        alad.Q(defpackage.alxd.class, alxdVar);
    }

    private alxd() {
        albq albqVar = albq.a;
        this.b = albqVar;
        this.c = albqVar;
        this.d = albqVar;
    }

    protected final java.lang.Object a(int i, java.lang.Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new albr(a, "\u0004\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0003\u0000\u0001\u001b\u0002\u001b\u0003\u001b", new java.lang.Object[]{"b", defpackage.almm.class, "c", defpackage.almm.class, "d", defpackage.almm.class});
        }
        if (i2 == 3) {
            return new defpackage.alxd();
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
        return alad.M(defpackage.alxd.class);
    }
}
