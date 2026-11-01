package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class ihf extends alad implements albi {
    public static final alal a = new defpackage.ihd(0);
    public static final defpackage.ihf b;
    public int c;
    public alqk d;
    public int f;
    private byte h = 2;
    public alat e = albq.a;
    public alak g = alae.a;

    static {
        defpackage.ihf ihfVar = new defpackage.ihf();
        b = ihfVar;
        alad.Q(defpackage.ihf.class, ihfVar);
    }

    private ihf() {
    }

    protected final java.lang.Object a(int i, java.lang.Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return java.lang.Byte.valueOf(this.h);
        }
        if (i2 == 2) {
            return new albr(b, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0002\u0002\u0001ᐉ\u0000\u0002Л\u0003\f\u0004,", new java.lang.Object[]{"c", "d", "e", acux.class, "f", "g"});
        }
        if (i2 == 3) {
            return new defpackage.ihf();
        }
        if (i2 == 4) {
            return new akzx(b);
        }
        if (i2 == 5) {
            return b;
        }
        if (i2 == 6) {
            return alad.M(defpackage.ihf.class);
        }
        this.h = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }

    public final void b() {
        alak alakVar = this.g;
        if (alakVar.c()) {
            return;
        }
        this.g = alad.H(alakVar);
    }
}
