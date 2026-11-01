package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class pdu extends alad implements albi {
    public static final defpackage.pdu a;
    public int b;
    public float c;
    public float d;
    public float e;
    public java.lang.String f = "";
    public int g;

    static {
        defpackage.pdu pduVar = new defpackage.pdu();
        a = pduVar;
        alad.Q(defpackage.pdu.class, pduVar);
    }

    private pdu() {
    }

    protected final java.lang.Object a(int i, java.lang.Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new albr(a, "\u0000\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ခ\u0000\u0002ခ\u0001\u0003ခ\u0002\u0004ለ\u0003\u0005ဌ\u0004", new java.lang.Object[]{"b", "c", "d", "e", "f", "g"});
        }
        if (i2 == 3) {
            return new defpackage.pdu();
        }
        if (i2 == 4) {
            return new akzx(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            return null;
        }
        return alad.M(defpackage.pdu.class);
    }
}
