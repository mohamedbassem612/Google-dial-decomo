package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class alsa extends alad implements albi {
    public static final defpackage.alsa a;
    public static final apdi d;
    public int b = 0;
    public java.lang.Object c;

    static {
        defpackage.alsa alsaVar = new defpackage.alsa();
        a = alsaVar;
        alad.Q(defpackage.alsa.class, alsaVar);
        d = alad.W(defpackage.alsi.a, alsaVar, alsaVar, 116, alcr.k);
    }

    private alsa() {
    }

    protected final java.lang.Object a(int i, java.lang.Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new albr(a, "\u0001\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000", new java.lang.Object[]{"c", "b", defpackage.alry.class, defpackage.alsb.class});
        }
        if (i2 == 3) {
            return new defpackage.alsa();
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
        return alad.M(defpackage.alsa.class);
    }
}
