package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class amgx extends alad implements albi {
    public static final defpackage.amgx a;
    public int b;
    public java.lang.String c = "";
    public alat d;
    public boolean e;
    public alat f;

    static {
        defpackage.amgx amgxVar = new defpackage.amgx();
        a = amgxVar;
        alad.Q(defpackage.amgx.class, amgxVar);
    }

    private amgx() {
        albq albqVar = albq.a;
        this.d = albqVar;
        this.e = true;
        this.f = albqVar;
    }

    protected final java.lang.Object a(int i, java.lang.Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new albr(a, "\u0004\u0004\u0000\u0001\u0002\u000f\u0004\u0000\u0002\u0000\u0002\u001b\u0007ဈ\u0000\rဇ\u0007\u000f\u001a", new java.lang.Object[]{"b", "d", defpackage.amgw.class, "c", "e", "f"});
        }
        if (i2 == 3) {
            return new defpackage.amgx();
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
        return alad.M(defpackage.amgx.class);
    }
}
