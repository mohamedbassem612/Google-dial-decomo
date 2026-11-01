package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class aiwf extends alad implements albi {
    public static final defpackage.aiwf a;
    public int b;
    public aiwe c;
    public int e;
    public int h;
    public defpackage.aiwk k;
    private byte l = 2;
    public java.lang.String d = "";
    public java.lang.String f = "";
    public java.lang.String g = "";
    public java.lang.String i = "";
    public java.lang.String j = "";

    static {
        defpackage.aiwf aiwfVar = new defpackage.aiwf();
        a = aiwfVar;
        alad.Q(defpackage.aiwf.class, aiwfVar);
    }

    private aiwf() {
        albq albqVar = albq.a;
    }

    protected final java.lang.Object a(int i, java.lang.Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return java.lang.Byte.valueOf(this.l);
        }
        if (i2 == 2) {
            return new albr(a, "\u0001\t\u0000\u0001\u0001\u000e\t\u0000\u0000\u0004\u0001ᔉ\u0000\u0002ᔈ\u0001\u0003ᔄ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဈ\b\bᐉ\n\rင\u0005\u000eဈ\u0006", new java.lang.Object[]{"b", "c", "d", "e", "f", "g", "j", "k", "h", "i"});
        }
        if (i2 == 3) {
            return new defpackage.aiwf();
        }
        if (i2 == 4) {
            return new akzx(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return alad.M(defpackage.aiwf.class);
        }
        this.l = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
