package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class akrj extends defpackage.alad implements defpackage.albi {
    public static final defpackage.akrj a;
    public int b;
    public defpackage.akry d;
    public int e;
    public defpackage.akrc g;
    public java.lang.String c = "";
    public defpackage.alat f = defpackage.albq.a;
    public java.lang.String h = "";

    static {
        defpackage.akrj akrjVar = new defpackage.akrj();
        a = akrjVar;
        defpackage.alad.Q(defpackage.akrj.class, akrjVar);
    }

    private akrj() {
    }

    @Override // defpackage.alad
    protected final java.lang.Object a(int i, java.lang.Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new defpackage.albr(a, "\u0004\u0006\u0000\u0001\u0001\u0007\u0006\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဉ\u0001\u0003\u001b\u0005᠌\u0002\u0006ဉ\u0003\u0007ဈ\u0004", new java.lang.Object[]{"b", "c", "d", "f", defpackage.akri.class, "e", defpackage.akqx.i, "g", "h"});
        }
        if (i2 == 3) {
            return new defpackage.akrj();
        }
        if (i2 == 4) {
            return new defpackage.akzx((float[]) null, (char[]) null);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return defpackage.alad.M(defpackage.akrj.class);
        }
        return null;
    }

    public final void b() {
        defpackage.alat alatVar = this.f;
        if (alatVar.c()) {
            return;
        }
        this.f = defpackage.alad.J(alatVar);
    }
}
