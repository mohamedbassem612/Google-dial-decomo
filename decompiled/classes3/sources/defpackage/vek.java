package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class vek extends alad implements albi {
    public static final defpackage.vek a;
    public java.lang.Object c;
    public int b = 0;
    public java.lang.String d = "";
    public java.lang.String e = "";

    static {
        defpackage.vek vekVar = new defpackage.vek();
        a = vekVar;
        alad.Q(defpackage.vek.class, vekVar);
    }

    private vek() {
    }

    protected final java.lang.Object a(int i, java.lang.Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new albr(a, "\u0000\u0004\u0001\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003Ȉ\u0004Ȉ", new java.lang.Object[]{"c", "b", defpackage.veo.class, defpackage.vep.class, "d", "e"});
        }
        if (i2 == 3) {
            return new defpackage.vek();
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
        return alad.M(defpackage.vek.class);
    }
}
