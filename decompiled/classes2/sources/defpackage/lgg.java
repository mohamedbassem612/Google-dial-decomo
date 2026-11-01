package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class lgg {
    public static final aimz a = aimz.i("com/android/dialer/callscreen/impl/service/CallScreenSession");
    public final ajct b;
    public final ajct c;
    public final java.util.concurrent.Executor d;
    public final java.util.concurrent.Executor e;
    public final defpackage.lha f;
    public final agtc g;
    public final long h;
    public boolean i;
    public final qbe j;
    public final zpz k;
    public final defpackage.oq l;
    public final afpl m;
    private final agtc n;
    private final defpackage.ldn o;

    public lgg(ljf ljfVar, j$.util.Optional optional, ajct ajctVar, ajct ajctVar2, ajct ajctVar3, defpackage.lha lhaVar, afpl afplVar, qbe qbeVar, zpz zpzVar, defpackage.oq oqVar, aoin aoinVar, defpackage.ldn ldnVar, oju ojuVar) {
        this.d = new ajdc(ajctVar3);
        this.b = ajctVar2;
        this.c = ajctVar;
        this.e = ajctVar3;
        this.f = lhaVar;
        this.m = afplVar;
        this.j = qbeVar;
        this.k = zpzVar;
        this.l = oqVar;
        this.h = ((java.lang.Long) aoinVar.a()).longValue();
        this.o = ldnVar;
        this.g = new agtc(new defpackage.jsr(this, ljfVar, ajctVar3, 7), ajctVar3);
        this.n = new agtc(new defpackage.kff(this, ajctVar3, ojuVar, optional, 4), ajctVar3);
    }

    final ajcq a() {
        return ahvr.I(b(), new defpackage.ibe(13), this.d);
    }

    public final ajcq b() {
        return this.n.a();
    }

    public final ajcq c() {
        return ahvr.H(b(), new defpackage.lef(8), this.d);
    }

    public final ajcq d(java.io.File file, java.lang.String str) {
        return ahvr.I(b(), new defpackage.kwa(file, str, 8), this.d);
    }

    public final ajcq e(boolean z) {
        return ahvr.I(b(), new defpackage.iav(z, 3), this.d);
    }

    public final void f(int i) {
        akzx akzxVarM = defpackage.ljw.a.m();
        akzx akzxVarM2 = defpackage.lkn.a.m();
        long jElapsedRealtime = android.os.SystemClock.elapsedRealtime();
        akzxVarM2.u();
        defpackage.lkn lknVar = (defpackage.lkn) akzxVarM2.b;
        lknVar.b |= 1;
        lknVar.c = jElapsedRealtime;
        akzxVarM2.u();
        defpackage.lkn lknVar2 = (defpackage.lkn) akzxVarM2.b;
        int i2 = i - 1;
        lknVar2.d = i2;
        lknVar2.b |= 2;
        akzxVarM.u();
        defpackage.ljw ljwVar = (defpackage.ljw) akzxVarM.b;
        defpackage.lkn lknVar3 = (defpackage.lkn) akzxVarM2.p();
        j$.util.Objects.requireNonNull(lknVar3);
        ljwVar.c = lknVar3;
        ljwVar.b = 2;
        agsm.i(285, this.o.a((defpackage.ljw) akzxVarM.p()), "failed to log speech recognition event: %d", new java.lang.Object[]{java.lang.Integer.valueOf(i2)});
    }
}
