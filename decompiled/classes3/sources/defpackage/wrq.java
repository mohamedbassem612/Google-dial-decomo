package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class wrq extends alad implements albi {
    public static final defpackage.wrq a;
    public int b;
    public long c;
    public defpackage.wqv d;
    public defpackage.wqu e;
    public defpackage.whw f;
    public int h;
    private byte i = 2;
    public java.lang.String g = "";

    static {
        defpackage.wrq wrqVar = new defpackage.wrq();
        a = wrqVar;
        alad.Q(defpackage.wrq.class, wrqVar);
    }

    private wrq() {
    }

    protected final java.lang.Object a(int i, java.lang.Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return java.lang.Byte.valueOf(this.i);
        }
        if (i2 == 2) {
            return new albr(a, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0001\u0001ဃ\u0000\u0002ဉ\u0001\u0003ᐉ\u0002\u0004ဉ\u0003\u0005ဈ\u0004\u0006ဋ\u0005", new java.lang.Object[]{"b", "c", "d", "e", "f", "g", "h"});
        }
        if (i2 == 3) {
            return new defpackage.wrq();
        }
        if (i2 == 4) {
            return new akzx(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return alad.M(defpackage.wrq.class);
        }
        this.i = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
