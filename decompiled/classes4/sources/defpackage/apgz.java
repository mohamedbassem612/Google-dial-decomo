package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class apgz extends alad implements albi {
    public static final defpackage.apgz a;
    public int b;
    public long c;
    public apev d;
    public boolean e;
    public boolean f;
    public boolean g;
    public long h;
    private byte i = 2;

    static {
        defpackage.apgz apgzVar = new defpackage.apgz();
        a = apgzVar;
        alad.Q(defpackage.apgz.class, apgzVar);
    }

    private apgz() {
    }

    protected final java.lang.Object a(int i, java.lang.Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return java.lang.Byte.valueOf(this.i);
        }
        if (i2 == 2) {
            return new albr(a, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0001\u0001ဃ\u0000\u0002ᐉ\u0001\u0003ဇ\u0002\u0004ဇ\u0003\u0005ဇ\u0004\u0006ဃ\u0005", new java.lang.Object[]{"b", "c", "d", "e", "f", "g", "h"});
        }
        if (i2 == 3) {
            return new defpackage.apgz();
        }
        if (i2 == 4) {
            return new akzx(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return alad.M(defpackage.apgz.class);
        }
        this.i = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
