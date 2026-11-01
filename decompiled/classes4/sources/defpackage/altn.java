package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class altn extends alad implements albi {
    public static final defpackage.altn a;
    public java.lang.Object c;
    public int d;
    public int e;
    public int b = 0;
    private byte f = 2;

    static {
        defpackage.altn altnVar = new defpackage.altn();
        a = altnVar;
        alad.Q(defpackage.altn.class, altnVar);
    }

    private altn() {
    }

    protected final java.lang.Object a(int i, java.lang.Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return java.lang.Byte.valueOf(this.f);
        }
        if (i2 == 2) {
            return new albr(a, "\u0004\u0013\u0001\u0000\u0001\u0016\u0013\u0000\u0000\u0004\u0001\u0004\u0002\u0004\u0004<\u0000\u0007м\u0000\bм\u0000\tм\u0000\n<\u0000\u000bȻ\u0000\f<\u0000\rȻ\u0000\u000e<\u0000\u000f<\u0000\u0010<\u0000\u0011м\u0000\u0012<\u0000\u0013<\u0000\u0014<\u0000\u0015<\u0000\u0016<\u0000", new java.lang.Object[]{"c", "b", "d", "e", defpackage.amaz.class, defpackage.alro.class, defpackage.alsi.class, defpackage.alqk.class, defpackage.amax.class, defpackage.altl.class, defpackage.alrd.class, defpackage.amas.class, defpackage.amaw.class, defpackage.almy.class, defpackage.aman.class, defpackage.aloa.class, defpackage.alrh.class, defpackage.almt.class, defpackage.altk.class});
        }
        if (i2 == 3) {
            return new defpackage.altn();
        }
        if (i2 == 4) {
            return new akzx(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return alad.M(defpackage.altn.class);
        }
        this.f = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
