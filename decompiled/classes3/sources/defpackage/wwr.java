package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class wwr extends alad implements albi {
    public static final defpackage.wwr a;
    public java.lang.Object c;
    public int b = 0;
    private byte d = 2;

    static {
        defpackage.wwr wwrVar = new defpackage.wwr();
        a = wwrVar;
        alad.Q(defpackage.wwr.class, wwrVar);
    }

    private wwr() {
    }

    protected final java.lang.Object a(int i, java.lang.Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return java.lang.Byte.valueOf(this.d);
        }
        if (i2 == 2) {
            return new albr(a, "\u0001\u0007\u0001\u0000\u0001\t\u0007\u0000\u0000\u0001\u0001<\u0000\u0002<\u0000\u0003м\u0000\u0004<\u0000\u0007<\u0000\b<\u0000\t<\u0000", new java.lang.Object[]{"c", "b", defpackage.wwt.class, defpackage.wws.class, defpackage.wwq.class, defpackage.wwo.class, defpackage.wwu.class, defpackage.wwl.class, defpackage.wwp.class});
        }
        if (i2 == 3) {
            return new defpackage.wwr();
        }
        if (i2 == 4) {
            return new akzx(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return alad.M(defpackage.wwr.class);
        }
        this.d = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
