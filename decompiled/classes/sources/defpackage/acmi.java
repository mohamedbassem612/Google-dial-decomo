package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class acmi extends defpackage.alaa implements defpackage.acmj {
    public static final defpackage.acmi a;
    public int b;
    public defpackage.aiwc d;
    public int e;
    public long f;
    public long g;
    public long h;
    private byte i = 2;
    public defpackage.alak c = defpackage.alae.a;

    static {
        defpackage.acmi acmiVar = new defpackage.acmi();
        a = acmiVar;
        defpackage.alad.Q(defpackage.acmi.class, acmiVar);
    }

    private acmi() {
    }

    @Override // defpackage.alad
    protected final java.lang.Object a(int i, java.lang.Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return java.lang.Byte.valueOf(this.i);
        }
        if (i2 == 2) {
            return new defpackage.albr(a, "\u0004\u0006\u0000\u0001\u0002\b\u0006\u0000\u0001\u0001\u0002\u0016\u0004ᐉ\u0000\u0005᠌\u0001\u0006ဂ\u0002\u0007ဂ\u0003\bဂ\u0004", new java.lang.Object[]{"b", "c", "d", "e", defpackage.udi.s, "f", "g", "h"});
        }
        if (i2 == 3) {
            return new defpackage.acmi();
        }
        if (i2 == 4) {
            return new defpackage.akzz(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return defpackage.alad.M(defpackage.acmi.class);
        }
        this.i = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
