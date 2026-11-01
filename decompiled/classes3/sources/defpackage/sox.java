package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class sox extends alad implements albi {
    public static final defpackage.sox a;
    public alat b;
    public alat c;

    static {
        defpackage.sox soxVar = new defpackage.sox();
        a = soxVar;
        alad.Q(defpackage.sox.class, soxVar);
    }

    private sox() {
        albq albqVar = albq.a;
        this.b = albqVar;
        this.c = albqVar;
    }

    protected final java.lang.Object a(int i, java.lang.Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new albr(a, "\u0001\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0002\u0000\u0001\u001a\u0002\u001a", new java.lang.Object[]{"b", "c"});
        }
        if (i2 == 3) {
            return new defpackage.sox();
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
        return alad.M(defpackage.sox.class);
    }
}
