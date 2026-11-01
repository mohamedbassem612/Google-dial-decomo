package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class amkw extends alaa implements alab {
    public static final defpackage.amkw a;
    public int b;
    public alat c;
    public alat d;
    public amlg e;
    public defpackage.amkt f;
    private amky g;
    private amlf h;
    private byte i = 2;

    static {
        defpackage.amkw amkwVar = new defpackage.amkw();
        a = amkwVar;
        alad.Q(defpackage.amkw.class, amkwVar);
    }

    private amkw() {
        albq albqVar = albq.a;
        this.c = albqVar;
        this.d = albqVar;
    }

    protected final java.lang.Object a(int i, java.lang.Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return java.lang.Byte.valueOf(this.i);
        }
        if (i2 == 2) {
            return new albr(a, "\u0001\u0006\u0000\u0001\u0001\u0014\u0006\u0000\u0002\u0001\u0001\u001a\u0004ဉ\u0005\u0007ဉ\u0007\nЛ\rဉ\u0004\u0014ဉ\u000f", new java.lang.Object[]{"b", "c", "h", "e", "d", defpackage.amkz.class, "g", "f"});
        }
        if (i2 == 3) {
            return new defpackage.amkw();
        }
        if (i2 == 4) {
            return new akzz(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return alad.M(defpackage.amkw.class);
        }
        this.i = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
