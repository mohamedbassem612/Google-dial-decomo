package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class amko extends alad implements albi {
    public static final defpackage.amko a;
    public int b;
    public int d;
    public boolean f;
    private int g;
    private defpackage.amjx h;
    private byte i = 2;
    public float c = 8000.0f;
    public int e = 1;

    static {
        defpackage.amko amkoVar = new defpackage.amko();
        a = amkoVar;
        alad.Q(defpackage.amko.class, amkoVar);
    }

    private amko() {
        akzc akzcVar = akzc.d;
        albq albqVar = albq.a;
        akzu akzuVar = akzu.a;
    }

    protected final java.lang.Object a(int i, java.lang.Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return java.lang.Byte.valueOf(this.i);
        }
        if (i2 == 2) {
            return new albr(a, "\u0004\u0005\u0000\u0002\u0002 \u0005\u0000\u0000\u0001\u0002ခ\u0001\u0006င\u0005\nင\u000b\rဇ\u000e ᐉ+", new java.lang.Object[]{"b", "g", "c", "d", "e", "f", "h"});
        }
        if (i2 == 3) {
            return new defpackage.amko();
        }
        if (i2 == 4) {
            return new akzx(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return alad.M(defpackage.amko.class);
        }
        this.i = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
