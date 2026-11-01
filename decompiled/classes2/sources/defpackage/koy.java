package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class koy extends alad implements albi {
    public static final defpackage.koy a;
    public alat b;
    public alat c;
    private byte d = 2;

    static {
        defpackage.koy koyVar = new defpackage.koy();
        a = koyVar;
        alad.Q(defpackage.koy.class, koyVar);
    }

    private koy() {
        albq albqVar = albq.a;
        this.b = albqVar;
        this.c = albqVar;
    }

    protected final java.lang.Object a(int i, java.lang.Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return java.lang.Byte.valueOf(this.d);
        }
        if (i2 == 2) {
            return new albr(a, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0002\u0001\u0001Л\u0002\u001b", new java.lang.Object[]{"b", defpackage.kow.class, "c", defpackage.kox.class});
        }
        if (i2 == 3) {
            return new defpackage.koy();
        }
        if (i2 == 4) {
            return new akzx(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return alad.M(defpackage.koy.class);
        }
        this.d = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
