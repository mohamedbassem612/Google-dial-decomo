package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class xac extends alad implements albi {
    public static final defpackage.xac a;
    public int b;
    public alat c;
    public alat d;
    public int e;
    public defpackage.wyb f;
    public alat g;
    public java.lang.String h;
    public java.lang.String i;
    private byte j = 2;

    static {
        defpackage.xac xacVar = new defpackage.xac();
        a = xacVar;
        alad.Q(defpackage.xac.class, xacVar);
    }

    private xac() {
        albq albqVar = albq.a;
        this.c = albqVar;
        this.d = albqVar;
        this.g = albqVar;
        this.h = "";
        this.i = "";
    }

    protected final java.lang.Object a(int i, java.lang.Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return java.lang.Byte.valueOf(this.j);
        }
        if (i2 == 2) {
            return new albr(a, "\u0001\u0007\u0000\u0001\u0001\t\u0007\u0000\u0003\u0001\u0001Л\u0003\u001b\u0004᠌\u0001\u0005\u001b\u0006ဈ\u0003\u0007ဈ\u0004\tဉ\u0002", new java.lang.Object[]{"b", "c", defpackage.wvi.class, "d", defpackage.xab.class, "e", defpackage.wrd.g, "g", defpackage.amnz.class, "h", "i", "f"});
        }
        if (i2 == 3) {
            return new defpackage.xac();
        }
        if (i2 == 4) {
            return new akzx(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return alad.M(defpackage.xac.class);
        }
        this.j = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
