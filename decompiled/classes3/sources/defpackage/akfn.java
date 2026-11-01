package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class akfn extends alad implements albi {
    public static final defpackage.akfn a;
    public int b;
    public boolean g;
    private byte i = 2;
    public java.lang.String c = "";
    public java.lang.String d = "";
    public alat e = albq.a;
    public java.lang.String f = "";
    public java.lang.String h = "";

    static {
        defpackage.akfn akfnVar = new defpackage.akfn();
        a = akfnVar;
        alad.Q(defpackage.akfn.class, akfnVar);
    }

    private akfn() {
    }

    protected final java.lang.Object a(int i, java.lang.Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return java.lang.Byte.valueOf(this.i);
        }
        if (i2 == 2) {
            return new albr(a, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0002\u0001ᔈ\u0000\u0002ᔈ\u0001\u0003\u001a\u0004ဈ\u0002\u0005ဈ\u0004\u0006ဇ\u0003", new java.lang.Object[]{"b", "c", "d", "e", "f", "h", "g"});
        }
        if (i2 == 3) {
            return new defpackage.akfn();
        }
        if (i2 == 4) {
            return new akzx(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return alad.M(defpackage.akfn.class);
        }
        this.i = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
