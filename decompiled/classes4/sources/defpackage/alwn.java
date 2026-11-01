package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class alwn extends alad implements alwo {
    public static final defpackage.alwn a;
    public static final apdi r;
    public int b;
    public int c;
    public boolean d;
    public defpackage.alxj e;
    public defpackage.alyc f;
    public defpackage.alyr g;
    public defpackage.alwj h;
    public defpackage.alxe i;
    public int j;
    public int k;
    public float l;
    public boolean n;
    public defpackage.alxa o;
    public boolean p;
    public boolean q;
    private byte s = 2;
    public java.lang.String m = "";

    static {
        defpackage.alwn alwnVar = new defpackage.alwn();
        a = alwnVar;
        alad.Q(defpackage.alwn.class, alwnVar);
        r = alad.W(defpackage.alqk.a, alwnVar, alwnVar, 102, alcr.k);
    }

    private alwn() {
    }

    protected final java.lang.Object a(int i, java.lang.Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return java.lang.Byte.valueOf(this.s);
        }
        if (i2 == 2) {
            return new albr(a, "\u0004\u000f\u0000\u0001\u0002\u0013\u000f\u0000\u0000\u0000\u0002᠌\u0001\u0004ဇ\u0003\u0006ဉ\u0004\u0007᠌\t\b᠌\n\tခ\u000b\nဉ\u0005\u000bဉ\u0006\fဉ\u0007\u000eለ\f\u000fဇ\r\u0010ဉ\u000e\u0011ဇ\u000f\u0012ဇ\u0010\u0013ဉ\b", new java.lang.Object[]{"b", "c", defpackage.alwx.s, "d", "e", "j", defpackage.alwx.e, "k", defpackage.alwx.r, "l", "f", "g", "h", "m", "n", "o", "p", "q", "i"});
        }
        if (i2 == 3) {
            return new defpackage.alwn();
        }
        if (i2 == 4) {
            return new akzx((boolean[]) null, (byte[]) null);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return alad.M(defpackage.alwn.class);
        }
        this.s = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }

    public final defpackage.alxe aT() {
        defpackage.alxe alxeVar = this.i;
        return alxeVar == null ? defpackage.alxe.a : alxeVar;
    }

    public final boolean aU() {
        return (this.b & 256) != 0;
    }
}
