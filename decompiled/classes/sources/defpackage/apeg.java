package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class apeg extends defpackage.alad implements defpackage.albi {
    public static final defpackage.apeg a;
    public int b;
    public defpackage.apeh d;
    public int e;
    private byte f = 2;
    public defpackage.alat c = defpackage.albq.a;

    static {
        defpackage.apeg apegVar = new defpackage.apeg();
        a = apegVar;
        defpackage.alad.Q(defpackage.apeg.class, apegVar);
    }

    private apeg() {
    }

    @Override // defpackage.alad
    protected final java.lang.Object a(int i, java.lang.Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return java.lang.Byte.valueOf(this.f);
        }
        if (i2 == 2) {
            return new defpackage.albr(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0001\u0001Л\u0002ဉ\u0000\u0003င\u0001", new java.lang.Object[]{"b", "c", defpackage.apef.class, "d", "e"});
        }
        if (i2 == 3) {
            return new defpackage.apeg();
        }
        if (i2 == 4) {
            return new defpackage.akzx(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return defpackage.alad.M(defpackage.apeg.class);
        }
        this.f = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
