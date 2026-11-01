package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class asa implements arn {
    public final ark a;
    public defpackage.aty c;
    public defpackage.rq d;
    private defpackage.arw e;
    private defpackage.arz f;
    private defpackage.ary g;
    private defpackage.arx h;
    private defpackage.oq j;
    public long b = 0;
    private long i = 9205357640488583168L;

    public asa(ark arkVar) {
        this.a = arkVar;
    }

    static /* synthetic */ void j(defpackage.asa asaVar, defpackage.cuf cufVar, long j, long j2, int i) {
        defpackage.ary aryVar = asaVar.g;
        if (aryVar == null) {
            aryVar = new defpackage.ary(null);
            asaVar.g = aryVar;
        }
        aryVar.a = cufVar;
        aryVar.b = j;
        defpackage.aty atyVar = asaVar.c;
        if (atyVar == null) {
            asaVar.c = new defpackage.aty(asaVar.a.e, 0L);
        } else {
            if ((i & 4) != 0) {
                j2 = 0;
            }
            atyVar.a = asaVar.a.e;
            atyVar.b = j2;
        }
        aryVar.c = false;
        asaVar.d = aryVar;
    }

    public final defpackage.arw a() {
        defpackage.arw arwVar = this.e;
        if (arwVar != null) {
            return arwVar;
        }
        defpackage.arw arwVar2 = new defpackage.arw(null);
        this.e = arwVar2;
        return arwVar2;
    }

    public final java.lang.String b() {
        defpackage.rq rqVar = this.d;
        if (rqVar instanceof defpackage.arw) {
            if (!((defpackage.arw) rqVar).b) {
                return "idle";
            }
        } else if (!(rqVar instanceof defpackage.ary) && !(rqVar instanceof defpackage.arx)) {
            return rqVar instanceof defpackage.arz ? "recognized" : "idle";
        }
        return "waiting";
    }

    public final void c() {
        defpackage.arw arwVarA = a();
        arwVarA.c = 3;
        arwVarA.a = false;
        arwVarA.b = false;
        this.d = arwVarA;
    }

    public final void d(defpackage.cuf cufVar, long j, defpackage.aty atyVar) {
        defpackage.arx arxVar = this.h;
        if (arxVar == null) {
            arxVar = new defpackage.arx(null);
            this.h = arxVar;
        }
        arxVar.a = cufVar;
        arxVar.b = j;
        atyVar.b = 0L;
        this.d = arxVar;
    }

    public final void e(long j) {
        defpackage.arz arzVar = this.f;
        if (arzVar == null) {
            arzVar = new defpackage.arz(null);
            this.f = arzVar;
        }
        arzVar.a = j;
        this.d = arzVar;
    }

    public final void f() {
        c();
        if (this.a.i) {
            g();
        }
        this.j = null;
    }

    public final void g() {
        this.a.I(defpackage.aqt.a);
    }

    public final void h(defpackage.cuf cufVar, cue cueVar, long j) {
        ark arkVar = this.a;
        long jL = den.G(cfo.y(arkVar)).l(0L);
        long j2 = this.i;
        if (j2 != 9205357640488583168L && jL != j2) {
            this.b = mni.bl(this.b, mni.aM(jL, j2));
        }
        this.i = jL;
        aso asoVar = arkVar.e;
        if (asoVar == null) {
            aooh.g();
        }
        if (java.lang.Math.abs(defpackage.arp.a(j, asoVar)) > 2.0f) {
            defpackage.oq oqVarK = k();
            aso asoVar2 = arkVar.e;
            long j3 = this.b;
            oqVarK.e(cufVar.b, mni.bl(defpackage.rq.g(cufVar, asoVar2, cueVar), j3));
            arkVar.I(new defpackage.aqu(j, true));
        }
    }

    public final void i(defpackage.cuf cufVar, defpackage.cuf cufVar2, cue cueVar, long j) {
        if (this.j == null) {
            this.j = new defpackage.oq((char[]) null);
        }
        this.b = 0L;
        defpackage.oq oqVarK = k();
        ark arkVar = this.a;
        aso asoVar = arkVar.e;
        long j2 = this.b;
        oqVarK.e(cufVar.b, mni.bl(defpackage.rq.g(cufVar, asoVar, cueVar), j2));
        long jAM = mni.aM(defpackage.rq.g(cufVar2, arkVar.e, cueVar), j);
        if (((java.lang.Boolean) arkVar.f.a(new defpackage.cvu(1))).booleanValue()) {
            this.i = den.G(cfo.y(arkVar)).l(0L);
            arkVar.I(new defpackage.aqv(jAM));
        }
    }

    public final defpackage.oq k() {
        defpackage.oq oqVar = this.j;
        if (oqVar != null) {
            return oqVar;
        }
        throw new java.lang.IllegalArgumentException("Velocity Tracker not initialized.");
    }

    public final aso m() {
        return this.a.e;
    }
}
