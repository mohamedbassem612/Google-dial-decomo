package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class akrk extends alad implements albi {
    public static final defpackage.akrk a;
    public int b;
    public defpackage.akph c;
    public akry d;
    private byte i = 2;
    public java.lang.String e = "";
    public java.lang.String f = "";
    public java.lang.String g = "";
    public boolean h = true;

    static {
        defpackage.akrk akrkVar = new defpackage.akrk();
        a = akrkVar;
        alad.Q(defpackage.akrk.class, akrkVar);
    }

    private akrk() {
    }

    protected final java.lang.Object a(int i, java.lang.Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return java.lang.Byte.valueOf(this.i);
        }
        if (i2 == 2) {
            return new albr(a, "\u0004\u0006\u0000\u0001\u0001\u0007\u0006\u0000\u0000\u0001\u0001ᐉ\u0000\u0002ဉ\u0001\u0004ဈ\u0002\u0005ဈ\u0003\u0006ဈ\u0004\u0007ဇ\u0005", new java.lang.Object[]{"b", "c", "d", "e", "f", "g", "h"});
        }
        if (i2 == 3) {
            return new defpackage.akrk();
        }
        if (i2 == 4) {
            return new akzx(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return alad.M(defpackage.akrk.class);
        }
        this.i = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
