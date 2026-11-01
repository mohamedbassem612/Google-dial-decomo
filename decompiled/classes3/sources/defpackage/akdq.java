package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class akdq extends alad implements albi {
    public static final defpackage.akdq a;
    public int b;
    public int c;
    public long d;
    public apev e;
    public defpackage.akdm f;
    public aiwf g;
    public defpackage.akdn h;
    public alat i;
    public defpackage.akdp j;
    public double k;
    private byte l = 2;

    static {
        defpackage.akdq akdqVar = new defpackage.akdq();
        a = akdqVar;
        alad.Q(defpackage.akdq.class, akdqVar);
    }

    private akdq() {
        akzc akzcVar = akzc.d;
        this.i = albq.a;
        albd albdVar = albd.a;
    }

    protected final java.lang.Object a(int i, java.lang.Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return java.lang.Byte.valueOf(this.l);
        }
        if (i2 == 2) {
            return new albr(a, "\u0004\t\u0000\u0001\u0002\u0010\t\u0000\u0001\u0002\u0002ဉ\u0005\u0003ᐉ\u0006\u0007ဉ\u0007\t\u001b\u000bက\u000b\f᠌\u0000\rဂ\u0001\u000eᐉ\u0002\u0010ဉ\t", new java.lang.Object[]{"b", "f", "g", "h", "i", defpackage.akdt.class, "k", "c", akdr.b, "d", "e", "j"});
        }
        if (i2 == 3) {
            return new defpackage.akdq();
        }
        if (i2 == 4) {
            return new akzx(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return alad.M(defpackage.akdq.class);
        }
        this.l = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
