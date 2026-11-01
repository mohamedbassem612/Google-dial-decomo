package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class szs implements defpackage.zni {
    public static final aimz a = aimz.i("com/android/dialer/revelio/impl/tidepods/impl/service/RevelioController");
    public boolean A;
    public final defpackage.qbe D;
    public final zpz E;
    public final defpackage.pqm F;
    public final defpackage.ptx G;
    public final tvn H;
    public final defpackage.afpl I;
    private final tbo K;
    private final swn L;
    private final java.lang.String M;
    private final ldn N;
    private final ipc O;
    public final android.content.Context b;
    public final agsm c;
    public final defpackage.tcl d;
    public final ajcu e;
    public final ajcu f;
    public final java.util.concurrent.Executor g;
    public final lev h;
    public final tbm i;
    public final defpackage.swx j;
    public final long k;
    public final lgv l;
    public final lgi m;
    public final syd n;
    public final defpackage.tbj o;
    public final lha p;
    public final aoin q;
    public final aoin r;
    public final aoin s;
    public final aoin t;
    public final defpackage.aprf J = new defpackage.aprf(this);
    public final defpackage.znj u = new nbx(this, 3);
    public final defpackage.znp v = new ler(this, 12);
    public boolean w = false;
    public j$.util.Optional x = j$.util.Optional.empty();
    public j$.util.Optional y = j$.util.Optional.empty();
    public boolean z = false;
    public boolean B = false;
    public boolean C = true;

    public szs(android.content.Context context, agsm agsmVar, defpackage.qbe qbeVar, defpackage.tcl tclVar, ajcu ajcuVar, ajcu ajcuVar2, ipc ipcVar, zpz zpzVar, defpackage.pqm pqmVar, lev levVar, tbm tbmVar, defpackage.swx swxVar, long j, lgv lgvVar, tbo tboVar, lgi lgiVar, defpackage.afpl afplVar, syd sydVar, defpackage.tbj tbjVar, swn swnVar, lha lhaVar, defpackage.ptx ptxVar, java.lang.String str, aoin aoinVar, aoin aoinVar2, aoin aoinVar3, aoin aoinVar4, ldn ldnVar, tvn tvnVar) {
        this.b = context;
        this.c = agsmVar;
        this.D = qbeVar;
        this.d = tclVar;
        this.e = ajcuVar;
        this.f = ajcuVar2;
        this.g = new ajdc(ajcuVar);
        this.O = ipcVar;
        this.E = zpzVar;
        this.F = pqmVar;
        this.h = levVar;
        this.i = tbmVar;
        this.j = swxVar;
        this.k = j;
        this.l = lgvVar;
        this.K = tboVar;
        this.m = lgiVar;
        this.I = afplVar;
        this.n = sydVar;
        this.o = tbjVar;
        this.L = swnVar;
        this.p = lhaVar;
        this.G = ptxVar;
        this.M = str;
        this.q = aoinVar;
        this.r = aoinVar2;
        this.s = aoinVar3;
        this.t = aoinVar4;
        this.N = ldnVar;
        this.H = tvnVar;
    }

    public final ajcq a() {
        l(5);
        this.d.a();
        a.b().l("com/android/dialer/revelio/impl/tidepods/impl/service/RevelioController", "acceptCall", 536, "RevelioController.java").v("enter");
        this.j.a();
        ahda ahdaVarAk = ahvr.ak(new ajcq[]{h(defpackage.amrc.CALL_ACCEPTED_BY_USER), this.K.a(this.k, 1)});
        defpackage.plx plxVar = new defpackage.plx(this, 9);
        ajcu ajcuVar = this.e;
        return ahvr.H(ahdaVarAk.p(plxVar, ajcuVar), new defpackage.soi(this, 14), ajcuVar);
    }

    final ajcq b() {
        ajcq ajcqVarF = ahvr.F(new defpackage.sws(this, 2), this.g);
        defpackage.szq szqVar = new defpackage.szq(this, 6);
        ajcu ajcuVar = this.e;
        return ahvr.I(ahvr.I(ajcqVarF, szqVar, ajcuVar), new defpackage.srq(this, 19), ajcuVar);
    }

    public final ajcq c() {
        return ahvr.F(new defpackage.sws(this, 4), this.g);
    }

    @Override // defpackage.zni
    public final ajcq d() {
        return !this.L.a() ? ajcm.a : ahvr.I(((defpackage.szr) aooc.ar(this.I.Y(), defpackage.szr.class)).aw(), new defpackage.szq(this, 9), this.e);
    }

    public final ajcq e() {
        return ahvr.F(new defpackage.sws(this, 7), this.g);
    }

    public final ajcq f(boolean z) {
        a.b().l("com/android/dialer/revelio/impl/tidepods/impl/service/RevelioController", "rejectCall", 560, "RevelioController.java").y("Rejecting call; disconnectAsMissedCall: %b", java.lang.Boolean.valueOf(z));
        return ahvr.ak(new ajcq[]{this.h.b(lgj.f), this.K.a(this.k, 5)}).p(new iaw(this, z, 5), this.g);
    }

    public final ajcq g() {
        l(6);
        this.d.a();
        return ahvr.I(h(defpackage.amrc.CALL_REJECTED_BY_USER), new defpackage.szq(this, 8), this.e);
    }

    public final ajcq h(defpackage.amrc amrcVar) {
        return ahvr.G(new qat(this, amrcVar, 11, (byte[]) null), this.g);
    }

    public final ajcq i(defpackage.tan tanVar) {
        return ahvr.E(new defpackage.rqy(this, tanVar, 6, null), this.g);
    }

    public final void j() {
        defpackage.otc otcVarAo = pez.ao();
        otcVarAo.e(false);
        otcVarAo.d(false);
        otcVarAo.b(false);
        ahqx.l(this.b, this.O.bk(otcVarAo.a()));
    }

    public final boolean k() {
        tbm tbmVar = this.i;
        return tbmVar.e().isPresent() && ((java.lang.String) tbmVar.e().orElseThrow()).equals(this.M);
    }

    public final void l(int i) {
        akzx akzxVarM = ljw.a.m();
        akzx akzxVarM2 = lko.a.m();
        long jElapsedRealtime = android.os.SystemClock.elapsedRealtime();
        akzxVarM2.u();
        lko lkoVar = akzxVarM2.b;
        lkoVar.b |= 1;
        lkoVar.c = jElapsedRealtime;
        akzxVarM2.u();
        lko lkoVar2 = akzxVarM2.b;
        lkoVar2.d = i - 1;
        lkoVar2.b |= 2;
        akzxVarM.u();
        ljw ljwVar = akzxVarM.b;
        lko lkoVarP = akzxVarM2.p();
        j$.util.Objects.requireNonNull(lkoVarP);
        ljwVar.c = lkoVarP;
        ljwVar.b = 4;
        agsm.i(854, this.N.a(akzxVarM.p()), "failed to log Call Screen Event for Revelio", new java.lang.Object[0]);
    }
}
