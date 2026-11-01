package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class fgp extends defpackage.few {
    private final defpackage.evq e;
    private final defpackage.fcx f;
    private final boolean g;
    private final defpackage.eqg h;
    private boolean i = true;
    private long j = -9223372036854775807L;
    private boolean k;
    private boolean l;
    private boolean m;
    private defpackage.ewm n;
    private defpackage.eqt o;
    private final rai p;

    public fgp(defpackage.eqt eqtVar, defpackage.evq evqVar, rai raiVar, defpackage.fcx fcxVar, boolean z, defpackage.eqg eqgVar) {
        this.o = eqtVar;
        this.e = evqVar;
        this.p = raiVar;
        this.f = fcxVar;
        this.g = z;
        this.h = eqgVar;
    }

    private final void v() {
        long j = this.j;
        defpackage.erm fhaVar = new defpackage.fha(j, j, this.k, this.l, F());
        if (this.i) {
            fhaVar = new defpackage.fgn(this, fhaVar);
        }
        j(fhaVar);
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [flm, java.lang.Object] */
    @Override // defpackage.ffw
    public final defpackage.ffs A(defpackage.ffu ffuVar, defpackage.fio fioVar, long j) {
        defpackage.evw evwVar = (defpackage.evw) this.e;
        defpackage.evx evxVar = new defpackage.evx(evwVar.a, ((defpackage.evy) evwVar.b).a());
        defpackage.ewm ewmVar = this.n;
        if (ewmVar != null) {
            evxVar.f(ewmVar);
        }
        defpackage.eqq eqqVar = F().b;
        ahvr.ci(eqqVar);
        rai raiVar = this.p;
        a();
        return new defpackage.fgm(eqqVar.a, evxVar, new defpackage.fey(raiVar.a), this.f, s(ffuVar), r(ffuVar), this, fioVar, this.g, this.h, eum.w(eqqVar.i));
    }

    @Override // defpackage.ffw
    public final void E(defpackage.ffs ffsVar) {
        defpackage.fgm fgmVar = (defpackage.fgm) ffsVar;
        if (fgmVar.k) {
            for (defpackage.fgu fguVar : fgmVar.j) {
                fguVar.o();
                fguVar.q();
            }
        }
        defpackage.fix fixVar = fgmVar.c;
        defpackage.fit fitVar = fixVar.a;
        if (fitVar != null) {
            fitVar.a(true);
        }
        defpackage.fjb fjbVar = fixVar.c;
        fjbVar.execute(new defpackage.fiv(fgmVar));
        aa$.ExternalSyntheticApiModelOutline1.m(fjbVar.b, fjbVar.a);
        fgmVar.f.removeCallbacksAndMessages(null);
        fgmVar.h = null;
        fgmVar.r = true;
    }

    @Override // defpackage.ffw
    public final synchronized defpackage.eqt F() {
        return this.o;
    }

    @Override // defpackage.few
    protected final void i(defpackage.ewm ewmVar) {
        this.n = ewmVar;
        android.os.Looper looperMyLooper = android.os.Looper.myLooper();
        ahvr.ci(looperMyLooper);
        defpackage.fag fagVarA = a();
        defpackage.fcx fcxVar = this.f;
        fcxVar.e(looperMyLooper, fagVarA);
        fcxVar.c();
        v();
    }

    @Override // defpackage.few
    protected final void l() {
        this.f.d();
    }

    @Override // defpackage.few, defpackage.ffw
    public final synchronized void o(defpackage.eqt eqtVar) {
        this.o = eqtVar;
    }

    public final void t(long j, defpackage.fma fmaVar, boolean z) {
        if (this.m && fmaVar.c()) {
            return;
        }
        this.m = !fmaVar.c();
        if (j == -9223372036854775807L) {
            j = this.j;
        }
        boolean zD = fmaVar.d();
        if (!this.i && this.j == j && this.k == zD && this.l == z) {
            return;
        }
        this.j = j;
        this.k = zD;
        this.l = z;
        this.i = false;
        v();
    }

    @Override // defpackage.ffw
    public final void u() {
    }
}
