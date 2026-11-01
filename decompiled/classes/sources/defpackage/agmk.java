package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class agmk extends defpackage.alad implements defpackage.albi {
    public static final defpackage.agmk a;
    public int b;
    public java.lang.String c = "";
    public java.lang.String d = "";
    public java.lang.String e = "";

    static {
        defpackage.agmk agmkVar = new defpackage.agmk();
        a = agmkVar;
        defpackage.alad.Q(defpackage.agmk.class, agmkVar);
    }

    private agmk() {
    }

    @Override // defpackage.alad
    protected final java.lang.Object a(int i, java.lang.Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new defpackage.albr(a, "\u0004\u0003\u0000\u0001\u0002\u0005\u0003\u0000\u0000\u0000\u0002ဈ\u0001\u0004ဈ\u0006\u0005ဈ\u0007", new java.lang.Object[]{"b", "c", "d", "e"});
        }
        if (i2 == 3) {
            return new defpackage.agmk();
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
        return defpackage.alad.M(defpackage.agmk.class);
    }
}
