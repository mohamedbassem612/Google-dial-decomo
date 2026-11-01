package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class nsv extends alad implements albi {
    public static final defpackage.nsv a;
    public int b;
    public defpackage.nsp d;
    public defpackage.nst e;
    public defpackage.nsn f;
    public utv h;
    private byte i = 2;
    public java.lang.String c = "";
    public java.lang.String g = "";

    static {
        defpackage.nsv nsvVar = new defpackage.nsv();
        a = nsvVar;
        alad.Q(defpackage.nsv.class, nsvVar);
    }

    private nsv() {
    }

    protected final java.lang.Object a(int i, java.lang.Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return java.lang.Byte.valueOf(this.i);
        }
        if (i2 == 2) {
            return new albr(a, "\u0000\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0001\u0001Ȉ\u0002ဉ\u0000\u0003ဉ\u0001\u0004ᐉ\u0002\u0005ለ\u0003\u0006ဉ\u0004", new java.lang.Object[]{"b", "c", "d", "e", "f", "g", "h"});
        }
        if (i2 == 3) {
            return new defpackage.nsv();
        }
        if (i2 == 4) {
            return new akzx(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return alad.M(defpackage.nsv.class);
        }
        this.i = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
