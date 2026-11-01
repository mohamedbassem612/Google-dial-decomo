package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class aiwa extends alad implements albi {
    public static final defpackage.aiwa a;
    public java.lang.Object c;
    public int b = 0;
    private byte d = 2;

    static {
        defpackage.aiwa aiwaVar = new defpackage.aiwa();
        a = aiwaVar;
        alad.Q(defpackage.aiwa.class, aiwaVar);
    }

    private aiwa() {
    }

    protected final java.lang.Object a(int i, java.lang.Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return java.lang.Byte.valueOf(this.d);
        }
        if (i2 == 2) {
            return new albr(a, "\u0004\u0011\u0001\u0000\b\u001a\u0011\u0000\u0000\u0001\b<\u0000\t<\u0000\n<\u0000\u000b<\u0000\f<\u0000\r<\u0000\u000e<\u0000\u000f<\u0000\u0010<\u0000\u0011<\u0000\u0012<\u0000\u0013<\u0000\u0014<\u0000\u0016<\u0000\u0017м\u0000\u0018<\u0000\u001a<\u0000", new java.lang.Object[]{"c", "b", defpackage.alej.class, defpackage.aldx.class, defpackage.alen.class, defpackage.alef.class, defpackage.alei.class, defpackage.aled.class, defpackage.alea.class, defpackage.aleg.class, defpackage.alem.class, defpackage.aldu.class, defpackage.alel.class, defpackage.aldw.class, defpackage.aldy.class, defpackage.aldv.class, defpackage.akwd.class, defpackage.aleh.class, defpackage.aiwb.class});
        }
        if (i2 == 3) {
            return new defpackage.aiwa();
        }
        if (i2 == 4) {
            return new akzx(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return alad.M(defpackage.aiwa.class);
        }
        this.d = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
