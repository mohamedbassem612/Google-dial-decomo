package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class kmz extends alad implements albi {
    public static final defpackage.kmz a;
    public int b;
    public float c;
    public float d;

    static {
        defpackage.kmz kmzVar = new defpackage.kmz();
        a = kmzVar;
        alad.Q(defpackage.kmz.class, kmzVar);
    }

    private kmz() {
    }

    protected final java.lang.Object a(int i, java.lang.Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new albr(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ခ\u0000\u0002ခ\u0001", new java.lang.Object[]{"b", "c", "d"});
        }
        if (i2 == 3) {
            return new defpackage.kmz();
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
        return alad.M(defpackage.kmz.class);
    }
}
