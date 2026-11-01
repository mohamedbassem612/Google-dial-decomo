package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class wwn extends alad implements albi {
    public static final defpackage.wwn a;
    public int b;
    public long c;
    public long d;
    public int e;
    public alat f = albq.a;

    static {
        defpackage.wwn wwnVar = new defpackage.wwn();
        a = wwnVar;
        alad.Q(defpackage.wwn.class, wwnVar);
    }

    private wwn() {
    }

    protected final java.lang.Object a(int i, java.lang.Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new albr(a, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0001\u0000\u0001ဃ\u0000\u0002ဃ\u0001\u0004᠌\u0002\u0005\u001b", new java.lang.Object[]{"b", "c", "d", "e", defpackage.wrd.d, "f", defpackage.wwm.class});
        }
        if (i2 == 3) {
            return new defpackage.wwn();
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
        return alad.M(defpackage.wwn.class);
    }
}
