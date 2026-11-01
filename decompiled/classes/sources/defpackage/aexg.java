package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aexg extends defpackage.alad implements defpackage.albi {
    public static final defpackage.aexg a;
    public int b;
    public java.lang.String c = "";
    public defpackage.akzc d = defpackage.akzc.d;
    public java.lang.String e = "";
    public defpackage.alat f;
    public defpackage.alat g;
    public boolean h;
    public long i;

    static {
        defpackage.aexg aexgVar = new defpackage.aexg();
        a = aexgVar;
        defpackage.alad.Q(defpackage.aexg.class, aexgVar);
    }

    private aexg() {
        defpackage.albq albqVar = defpackage.albq.a;
        this.f = albqVar;
        this.g = albqVar;
    }

    @Override // defpackage.alad
    protected final java.lang.Object a(int i, java.lang.Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new defpackage.albr(a, "\u0004\u0007\u0000\u0001\u0001\t\u0007\u0000\u0002\u0000\u0001ဈ\u0002\u0002ဈ\u0000\u0003ည\u0001\u0004\u001b\u0005\u001a\bဇ\u0003\tဂ\u0004", new java.lang.Object[]{"b", "e", "c", "d", "f", defpackage.aexh.class, "g", "h", "i"});
        }
        if (i2 == 3) {
            return new defpackage.aexg();
        }
        if (i2 == 4) {
            return new defpackage.akzx(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            return null;
        }
        return defpackage.alad.M(defpackage.aexg.class);
    }
}
