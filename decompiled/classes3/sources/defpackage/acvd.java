package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class acvd extends alad implements albi {
    public static final defpackage.acvd a;
    public int b;
    public defpackage.acvc d;
    private albe e = albe.a;
    private byte f = 2;
    public alat c = albq.a;

    static {
        defpackage.acvd acvdVar = new defpackage.acvd();
        a = acvdVar;
        alad.Q(defpackage.acvd.class, acvdVar);
    }

    private acvd() {
    }

    protected final java.lang.Object a(int i, java.lang.Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return java.lang.Byte.valueOf(this.f);
        }
        if (i2 == 2) {
            return new albr(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0001\u0001\u0002\u0001Л\u0002ဉ\u0000\u0003в", new java.lang.Object[]{"b", "c", acvb.class, "d", "e", new ajyk(alcr.i, "", alcr.k, acuw.a)});
        }
        if (i2 == 3) {
            return new defpackage.acvd();
        }
        if (i2 == 4) {
            return new akzx(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return alad.M(defpackage.acvd.class);
        }
        this.f = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
