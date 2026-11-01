package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class sjz {
    public static final defpackage.sjz a;
    public static final java.util.List b;
    private static final defpackage.sjz e;
    private static final defpackage.sjz f;
    private static final defpackage.sjz g;
    private static final defpackage.sjz h;
    private static final defpackage.sjz i;
    private static final defpackage.sjz j;
    private static final defpackage.sjz k;
    private static final defpackage.sjz l;
    public final defpackage.sko c;
    public final int d;

    static {
        defpackage.ryg rygVarK = snl.k(defpackage.sko.a.m());
        rygVarK.d(0.0f);
        rygVarK.f(100.0f);
        rygVarK.e(500);
        rygVarK.g();
        rygVarK.c(0.0f);
        defpackage.sjz sjzVar = new defpackage.sjz(rygVarK.b(), 2132019726);
        e = sjzVar;
        defpackage.ryg rygVarK2 = snl.k(defpackage.sko.a.m());
        rygVarK2.d(-10.0f);
        rygVarK2.f(100.0f);
        rygVarK2.e(300);
        rygVarK2.g();
        rygVarK2.c(100.0f);
        defpackage.sjz sjzVar2 = new defpackage.sjz(rygVarK2.b(), 2132019725);
        f = sjzVar2;
        defpackage.ryg rygVarK3 = snl.k(defpackage.sko.a.m());
        rygVarK3.d(0.0f);
        rygVarK3.f(100.0f);
        rygVarK3.e(1000);
        rygVarK3.g();
        rygVarK3.c(0.0f);
        defpackage.sjz sjzVar3 = new defpackage.sjz(rygVarK3.b(), 2132019729);
        g = sjzVar3;
        defpackage.ryg rygVarK4 = snl.k(defpackage.sko.a.m());
        rygVarK4.d(0.0f);
        rygVarK4.f(50.0f);
        rygVarK4.e(150);
        rygVarK4.g();
        rygVarK4.c(0.0f);
        defpackage.sjz sjzVar4 = new defpackage.sjz(rygVarK4.b(), 2132019728);
        h = sjzVar4;
        defpackage.ryg rygVarK5 = snl.k(defpackage.sko.a.m());
        rygVarK5.d(0.0f);
        rygVarK5.f(100.0f);
        rygVarK5.e(500);
        rygVarK5.g();
        rygVarK5.c(100.0f);
        defpackage.sjz sjzVar5 = new defpackage.sjz(rygVarK5.b(), 2132019723);
        i = sjzVar5;
        defpackage.ryg rygVarK6 = snl.k(defpackage.sko.a.m());
        rygVarK6.d(-10.0f);
        rygVarK6.f(30.0f);
        rygVarK6.e(300);
        rygVarK6.g();
        rygVarK6.c(100.0f);
        defpackage.sjz sjzVar6 = new defpackage.sjz(rygVarK6.b(), 2132019724);
        j = sjzVar6;
        defpackage.ryg rygVarK7 = snl.k(defpackage.sko.a.m());
        rygVarK7.d(-7.0f);
        rygVarK7.f(140.0f);
        rygVarK7.e(700);
        rygVarK7.g();
        rygVarK7.c(100.0f);
        defpackage.sjz sjzVar7 = new defpackage.sjz(rygVarK7.b(), 2132019727);
        k = sjzVar7;
        defpackage.ryg rygVarK8 = snl.k(defpackage.sko.a.m());
        rygVarK8.d(0.0f);
        rygVarK8.f(130.0f);
        rygVarK8.e(850);
        rygVarK8.g();
        rygVarK8.c(0.0f);
        defpackage.sjz sjzVar8 = new defpackage.sjz(rygVarK8.b(), 2132019730);
        l = sjzVar8;
        defpackage.ryg rygVarK9 = snl.k(defpackage.sko.a.m());
        rygVarK9.d(0.0f);
        rygVarK9.f(100.0f);
        rygVarK9.e(400);
        rygVarK9.g();
        rygVarK9.c(50.0f);
        a = new defpackage.sjz(rygVarK9.b(), 2132019721);
        b = ajsz.bb(new defpackage.sjz[]{sjzVar, sjzVar2, sjzVar3, sjzVar4, sjzVar5, sjzVar6, sjzVar7, sjzVar8});
    }

    public sjz(defpackage.sko skoVar, int i2) {
        aooh.f(skoVar, "fontStyle");
        this.c = skoVar;
        this.d = i2;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.sjz) {
            defpackage.sjz sjzVar = (defpackage.sjz) obj;
            if (aooh.n(this.c, sjzVar.c) && this.d == sjzVar.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.c.hashCode() * 31) + this.d;
    }

    public final java.lang.String toString() {
        return "FontStyleUiData(fontStyle=" + this.c + ", contentDescription=" + this.d + ')';
    }
}
