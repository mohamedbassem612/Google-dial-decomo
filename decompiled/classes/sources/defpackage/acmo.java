package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class acmo extends defpackage.alad implements defpackage.albi {
    public static final defpackage.acmo a;
    public int b;
    public java.lang.String c = "";
    public int d;

    static {
        defpackage.acmo acmoVar = new defpackage.acmo();
        a = acmoVar;
        defpackage.alad.Q(defpackage.acmo.class, acmoVar);
    }

    private acmo() {
    }

    @Override // defpackage.alad
    protected final java.lang.Object a(int i, java.lang.Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new defpackage.albr(a, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002᠌\u0001", new java.lang.Object[]{"b", "c", "d", defpackage.udi.j});
        }
        if (i2 == 3) {
            return new defpackage.acmo();
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
        return defpackage.alad.M(defpackage.acmo.class);
    }
}
