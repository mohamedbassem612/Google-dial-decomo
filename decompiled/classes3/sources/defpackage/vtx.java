package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class vtx extends alad implements albi {
    public static final defpackage.vtx a;
    public int b;
    public vzi c;
    public defpackage.vtw f;
    public defpackage.vtw g;
    public boolean h;
    public boolean i;
    public java.lang.String d = "";
    public java.lang.String e = "";
    public java.lang.String j = "";

    static {
        defpackage.vtx vtxVar = new defpackage.vtx();
        a = vtxVar;
        alad.Q(defpackage.vtx.class, vtxVar);
    }

    private vtx() {
    }

    protected final java.lang.Object a(int i, java.lang.Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new albr(a, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဉ\u0003\u0005ဉ\u0004\u0006ဇ\u0005\u0007ဇ\u0006\bဈ\u0007", new java.lang.Object[]{"b", "c", "d", "e", "f", "g", "h", "i", "j"});
        }
        if (i2 == 3) {
            return new defpackage.vtx();
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
        return alad.M(defpackage.vtx.class);
    }
}
