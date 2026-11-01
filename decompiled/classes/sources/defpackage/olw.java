package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class olw extends defpackage.alad implements defpackage.albi {
    public static final defpackage.olw a;
    public defpackage.alat b = defpackage.albq.a;

    static {
        defpackage.olw olwVar = new defpackage.olw();
        a = olwVar;
        defpackage.alad.Q(defpackage.olw.class, olwVar);
    }

    private olw() {
    }

    @Override // defpackage.alad
    protected final java.lang.Object a(int i, java.lang.Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new defpackage.albr(a, "\u0001\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0001\u0000\u0002\u001b", new java.lang.Object[]{"b", defpackage.olv.class});
        }
        if (i2 == 3) {
            return new defpackage.olw();
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
        return defpackage.alad.M(defpackage.olw.class);
    }
}
