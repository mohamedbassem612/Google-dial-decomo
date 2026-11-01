package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class apfd extends defpackage.alad implements defpackage.albi {
    public static final defpackage.apfd a;
    public defpackage.alat b;
    public defpackage.alat c;
    private byte d = 2;

    static {
        defpackage.apfd apfdVar = new defpackage.apfd();
        a = apfdVar;
        defpackage.alad.Q(defpackage.apfd.class, apfdVar);
    }

    private apfd() {
        defpackage.albq albqVar = defpackage.albq.a;
        this.b = albqVar;
        this.c = albqVar;
    }

    @Override // defpackage.alad
    protected final java.lang.Object a(int i, java.lang.Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return java.lang.Byte.valueOf(this.d);
        }
        if (i2 == 2) {
            return new defpackage.albr(a, "\u0001\u0002\u0000\u0000\u0001\u0003\u0002\u0000\u0002\u0001\u0001Л\u0003\u001b", new java.lang.Object[]{"b", apfc.class, "c", apff.class});
        }
        if (i2 == 3) {
            return new defpackage.apfd();
        }
        if (i2 == 4) {
            return new defpackage.akzx((boolean[][][]) null, (byte[]) null);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return defpackage.alad.M(defpackage.apfd.class);
        }
        this.d = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }

    public final void b() {
        defpackage.alat alatVar = this.b;
        if (alatVar.c()) {
            return;
        }
        this.b = defpackage.alad.J(alatVar);
    }
}
