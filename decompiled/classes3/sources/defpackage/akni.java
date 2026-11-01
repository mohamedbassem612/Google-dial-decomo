package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class akni extends alad implements albi {
    public static final defpackage.akni a;
    public java.lang.String b = "";
    public int c;
    public alat d;
    public alat e;
    public alat f;
    public java.lang.String g;
    public boolean h;

    static {
        defpackage.akni akniVar = new defpackage.akni();
        a = akniVar;
        alad.Q(defpackage.akni.class, akniVar);
    }

    private akni() {
        albq albqVar = albq.a;
        this.d = albqVar;
        this.e = albqVar;
        this.f = albqVar;
        this.g = "";
    }

    protected final java.lang.Object a(int i, java.lang.Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new albr(a, "\u0000\u0007\u0000\u0000\u0001\b\u0007\u0000\u0003\u0000\u0001Ȉ\u0002\f\u0003\u001b\u0004\u001b\u0005\u001b\u0006Ȉ\b\u0007", new java.lang.Object[]{"b", "c", "d", defpackage.aknh.class, "e", defpackage.akmi.class, "f", defpackage.aknr.class, "g", "h"});
        }
        if (i2 == 3) {
            return new defpackage.akni();
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
        return alad.M(defpackage.akni.class);
    }
}
