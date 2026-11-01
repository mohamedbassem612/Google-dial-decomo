package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class wrk extends alad implements albi {
    public static final defpackage.wrk a;
    public int b;
    public java.lang.String d;
    public alat e;
    private byte f = 2;
    public java.lang.String c = "";

    static {
        defpackage.wrk wrkVar = new defpackage.wrk();
        a = wrkVar;
        alad.Q(defpackage.wrk.class, wrkVar);
    }

    private wrk() {
        albq albqVar = albq.a;
        this.d = "";
        this.e = albq.a;
    }

    protected final java.lang.Object a(int i, java.lang.Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return java.lang.Byte.valueOf(this.f);
        }
        if (i2 == 2) {
            return new albr(a, "\u0001\u0003\u0000\u0001\u0001\u0007\u0003\u0000\u0001\u0001\u0001ဈ\u0000\u0004ဈ\u0001\u0007Л", new java.lang.Object[]{"b", "c", "d", "e", defpackage.wrq.class});
        }
        if (i2 == 3) {
            return new defpackage.wrk();
        }
        if (i2 == 4) {
            return new akzx(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return alad.M(defpackage.wrk.class);
        }
        this.f = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
