package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class ahwh extends alad implements albi {
    public static final defpackage.ahwh a;
    public int b;
    public defpackage.xac d;
    public java.lang.String e;
    public defpackage.wrk f;
    public lcm g;
    public nsv h;
    private byte i = 2;
    public alat c = albq.a;

    static {
        defpackage.ahwh ahwhVar = new defpackage.ahwh();
        a = ahwhVar;
        alad.Q(defpackage.ahwh.class, ahwhVar);
    }

    private ahwh() {
        akzc akzcVar = akzc.d;
        this.e = "";
    }

    protected final java.lang.Object a(int i, java.lang.Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return java.lang.Byte.valueOf(this.i);
        }
        if (i2 == 2) {
            return new albr(a, "\u0004\u0006\u0000\u0001\u0001\b\u0006\u0000\u0001\u0003\u0001\u001b\u0003ᐉ\u0001\u0004ဈ\u0002\u0006ᐉ\u0004\u0007ဉ\u0005\bᐉ\u0006", new java.lang.Object[]{"b", "c", defpackage.ahwg.class, "d", "e", "f", "g", "h"});
        }
        if (i2 == 3) {
            return new defpackage.ahwh();
        }
        if (i2 == 4) {
            return new akzx(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return alad.M(defpackage.ahwh.class);
        }
        this.i = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
