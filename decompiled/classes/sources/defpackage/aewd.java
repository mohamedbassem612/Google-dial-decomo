package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aewd extends defpackage.alad implements defpackage.albi {
    public static final defpackage.aewd a;
    public int b;
    public defpackage.aper c;
    public long d;
    public long e;
    public long f;
    public long g;
    public int h;
    public defpackage.apev j;
    public int k;
    private byte l = 2;
    public java.lang.String i = "";

    static {
        defpackage.aewd aewdVar = new defpackage.aewd();
        a = aewdVar;
        defpackage.alad.Q(defpackage.aewd.class, aewdVar);
    }

    private aewd() {
    }

    @Override // defpackage.alad
    protected final java.lang.Object a(int i, java.lang.Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return java.lang.Byte.valueOf(this.l);
        }
        if (i2 == 2) {
            return new defpackage.albr(a, "\u0004\t\u0000\u0001\u0001\n\t\u0000\u0000\u0001\u0001ဉ\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005စ\u0004\u0006င\u0005\u0007ဈ\u0006\tᐉ\b\nင\t", new java.lang.Object[]{"b", "c", "d", "e", "f", "g", "h", "i", "j", "k"});
        }
        if (i2 == 3) {
            return new defpackage.aewd();
        }
        if (i2 == 4) {
            return new defpackage.akzx(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return defpackage.alad.M(defpackage.aewd.class);
        }
        this.l = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
