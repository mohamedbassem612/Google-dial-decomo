package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class afcw extends alad implements albi {
    public static final defpackage.afcw a;
    public int b;
    public defpackage.afby c;
    public int d;
    public int f;
    public defpackage.afca g;
    public java.lang.String h;
    private byte i = 2;
    public java.lang.String e = "";

    static {
        defpackage.afcw afcwVar = new defpackage.afcw();
        a = afcwVar;
        alad.Q(defpackage.afcw.class, afcwVar);
    }

    private afcw() {
        albq albqVar = albq.a;
        this.h = "";
    }

    protected final java.lang.Object a(int i, java.lang.Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return java.lang.Byte.valueOf(this.i);
        }
        if (i2 == 2) {
            return new albr(a, "\u0004\u0006\u0000\u0001\u0001\b\u0006\u0000\u0000\u0001\u0001ဉ\u0000\u0002᠌\u0001\u0003ဈ\u0002\u0005᠌\u0003\u0006ᐉ\u0004\bဈ\u0006", new java.lang.Object[]{"b", "c", "d", defpackage.amjv.f, "e", "f", defpackage.acvt.m, "g", "h"});
        }
        if (i2 == 3) {
            return new defpackage.afcw();
        }
        if (i2 == 4) {
            return new akzx(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return alad.M(defpackage.afcw.class);
        }
        this.i = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
