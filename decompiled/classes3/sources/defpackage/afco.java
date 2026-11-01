package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class afco extends alaa implements alab {
    public static final defpackage.afco a;
    public alat b;
    public alat c;
    public alat d;
    private byte e = 2;

    static {
        defpackage.afco afcoVar = new defpackage.afco();
        a = afcoVar;
        alad.Q(defpackage.afco.class, afcoVar);
    }

    private afco() {
        albq albqVar = albq.a;
        this.b = albqVar;
        this.c = albqVar;
        this.d = albqVar;
    }

    protected final java.lang.Object a(int i, java.lang.Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return java.lang.Byte.valueOf(this.e);
        }
        if (i2 == 2) {
            return new albr(a, "\u0004\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0003\u0000\u0001\u001b\u0002\u001b\u0003\u001b", new java.lang.Object[]{"b", defpackage.afcn.class, "c", defpackage.afcn.class, "d", defpackage.afcn.class});
        }
        if (i2 == 3) {
            return new defpackage.afco();
        }
        if (i2 == 4) {
            return new akzz(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return alad.M(defpackage.afco.class);
        }
        this.e = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
