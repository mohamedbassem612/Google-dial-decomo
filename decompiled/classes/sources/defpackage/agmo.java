package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class agmo extends defpackage.alad implements defpackage.albi {
    public static final defpackage.agmo a;
    public int b;
    public defpackage.agmm c;
    public java.lang.String d = "";
    public boolean e;

    static {
        defpackage.agmo agmoVar = new defpackage.agmo();
        a = agmoVar;
        defpackage.alad.Q(defpackage.agmo.class, agmoVar);
    }

    private agmo() {
        defpackage.albq albqVar = defpackage.albq.a;
    }

    @Override // defpackage.alad
    protected final java.lang.Object a(int i, java.lang.Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new defpackage.albr(a, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဈ\u0001\u0003ဇ\u0002", new java.lang.Object[]{"b", "c", "d", "e"});
        }
        if (i2 == 3) {
            return new defpackage.agmo();
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
        return defpackage.alad.M(defpackage.agmo.class);
    }
}
