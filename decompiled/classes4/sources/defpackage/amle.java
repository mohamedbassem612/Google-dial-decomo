package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class amle extends alaa implements alab {
    public static final defpackage.amle a;
    public int b;
    public amld c;
    public defpackage.amkv d;
    private defpackage.amky e;
    private defpackage.amlj f;
    private defpackage.amkx g;
    private defpackage.amlf h;
    private byte i = 2;

    static {
        defpackage.amle amleVar = new defpackage.amle();
        a = amleVar;
        alad.Q(defpackage.amle.class, amleVar);
    }

    private amle() {
    }

    protected final java.lang.Object a(int i, java.lang.Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return java.lang.Byte.valueOf(this.i);
        }
        if (i2 == 2) {
            return new albr(a, "\u0001\u0006\u0000\u0001\u0001\u001c\u0006\u0000\u0000\u0003\u0001ဉ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0004\u0007ᐉ\t\nဉ\u0012\u001cဉ\u001d", new java.lang.Object[]{"b", "e", "c", "d", "f", "g", "h"});
        }
        if (i2 == 3) {
            return new defpackage.amle();
        }
        if (i2 == 4) {
            return new akzz(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return alad.M(defpackage.amle.class);
        }
        this.i = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
