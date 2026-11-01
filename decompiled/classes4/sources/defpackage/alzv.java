package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
final class alzv {
    alrb a = alrb.a;
    j$.time.Duration b = j$.time.Duration.ZERO;
    boolean c = false;
    boolean d = false;
    boolean e = false;
    boolean f = false;
    boolean g = false;
    boolean h = false;
    int i = 0;
    int j = 0;
    int k = 0;
    int l = 0;
    int m = 0;
    int n = 0;
    int o = 0;
    int p = 0;
    int q = 0;
    j$.util.Optional r = j$.util.Optional.empty();
    j$.util.Optional s = j$.util.Optional.empty();
    float t = 0.0f;
    j$.util.Optional u = j$.util.Optional.empty();
    j$.time.Duration v = j$.time.Duration.ZERO;
    boolean w = false;
    final int x;

    public alzv(int i) {
        this.x = i;
    }

    static /* synthetic */ defpackage.alsi b(defpackage.amag amagVar) {
        akzz akzzVarM = defpackage.alsi.a.m();
        apdi apdiVar = defpackage.amah.e;
        akzx akzxVarM = defpackage.amah.a.m();
        akzxVarM.u();
        defpackage.amah amahVar = (defpackage.amah) akzxVarM.b;
        amahVar.c = amagVar.k;
        amahVar.b |= 1;
        akzzVarM.bV(apdiVar, (defpackage.amah) akzxVarM.p());
        return akzzVarM.p();
    }

    public final boolean a() {
        return !this.b.isZero();
    }
}
