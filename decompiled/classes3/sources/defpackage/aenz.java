package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class aenz extends alad implements albi {
    public static final defpackage.aenz a;
    public int b;
    public long c;
    public alcf d;
    private byte f = 2;
    public alat e = albq.a;

    static {
        defpackage.aenz aenzVar = new defpackage.aenz();
        a = aenzVar;
        alad.Q(defpackage.aenz.class, aenzVar);
    }

    private aenz() {
    }

    protected final java.lang.Object a(int i, java.lang.Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return java.lang.Byte.valueOf(this.f);
        }
        if (i2 == 2) {
            return new albr(a, "\u0004\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0001\u0001\u0001ဂ\u0000\u0002ဉ\u0001\u0004Л", new java.lang.Object[]{"b", "c", "d", "e", defpackage.aenv.class});
        }
        if (i2 == 3) {
            return new defpackage.aenz();
        }
        if (i2 == 4) {
            return new akzx(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return alad.M(defpackage.aenz.class);
        }
        this.f = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }

    public final void b() {
        alat alatVar = this.e;
        if (alatVar.c()) {
            return;
        }
        this.e = alad.J(alatVar);
    }
}
