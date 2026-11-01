package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class agml extends defpackage.alad implements defpackage.albi {
    public static final defpackage.agml a;
    public defpackage.alat b;
    public defpackage.alat c;
    public defpackage.alat d;
    public defpackage.alat e;
    private byte f = 2;

    static {
        defpackage.agml agmlVar = new defpackage.agml();
        a = agmlVar;
        defpackage.alad.Q(defpackage.agml.class, agmlVar);
    }

    private agml() {
        defpackage.albq albqVar = defpackage.albq.a;
        this.b = albqVar;
        this.c = albqVar;
        this.d = albqVar;
        this.e = albqVar;
    }

    @Override // defpackage.alad
    protected final java.lang.Object a(int i, java.lang.Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return java.lang.Byte.valueOf(this.f);
        }
        if (i2 == 2) {
            return new defpackage.albr(a, "\u0004\u0004\u0000\u0000\u00032\u0004\u0000\u0004\u0000\u0003\u001b\u0004\u001b0\u001b2\u001b", new java.lang.Object[]{"c", defpackage.agmk.class, "d", defpackage.agmo.class, "b", defpackage.agmp.class, "e", defpackage.agmj.class});
        }
        if (i2 == 3) {
            return new defpackage.agml();
        }
        if (i2 == 4) {
            return new defpackage.akzx(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return defpackage.alad.M(defpackage.agml.class);
        }
        this.f = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
