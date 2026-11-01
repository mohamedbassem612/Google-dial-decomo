package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class lev {
    public static final aimz a = aimz.i("com/android/dialer/callscreen/impl/service/CallScreenController");
    public final afpl A;
    private final ajct B;
    private final defpackage.heq C;
    public final ajcu b;
    public final ajct c;
    public final tcl d;
    public final rlv e;
    public final defpackage.lgi f;
    public final defpackage.lgn g;
    public final defpackage.lgz h;
    public final defpackage.lgv i;
    public final defpackage.lgg j;
    public final aoin k;
    public final aoin l;
    public final java.lang.String m;
    public final defpackage.ldn n;
    public final zni o;
    public final znp q;
    public final zog r;
    public final pqm t;
    public final pqo u;
    public final zpm v;
    public final qbe w;
    public final defpackage.ifb x;
    public final pgi y;
    public final znw p = new tno(this, 1);
    public final rai z = new rai(this);
    public final zoi s = new defpackage.jwb(this, 2);

    public lev(ajct ajctVar, ajcu ajcuVar, ajct ajctVar2, pqm pqmVar, tcl tclVar, rlv rlvVar, defpackage.lgi lgiVar, defpackage.lgn lgnVar, defpackage.lgz lgzVar, defpackage.ifb ifbVar, defpackage.lgv lgvVar, defpackage.lgg lggVar, pqo pqoVar, aoin aoinVar, aoin aoinVar2, afpl afplVar, zpm zpmVar, java.lang.String str, pgi pgiVar, defpackage.ldn ldnVar, qbe qbeVar, defpackage.heq heqVar) {
        int i = 0;
        this.o = new defpackage.leq(this, i);
        this.q = new defpackage.ler(this, i);
        this.r = new defpackage.les(this, i);
        this.B = ajctVar;
        this.b = ajcuVar;
        this.c = ajctVar2;
        this.t = pqmVar;
        this.d = tclVar;
        this.e = rlvVar;
        this.f = lgiVar;
        this.g = lgnVar;
        this.h = lgzVar;
        this.x = ifbVar;
        this.i = lgvVar;
        this.j = lggVar;
        this.u = pqoVar;
        this.k = aoinVar;
        this.l = aoinVar2;
        this.A = afplVar;
        this.v = zpmVar;
        this.m = str;
        this.y = pgiVar;
        this.n = ldnVar;
        this.w = qbeVar;
        this.C = heqVar;
    }

    public final ajcq a() {
        ajcq ajcqVarI;
        zpm zpmVar = this.v;
        if (zpmVar.a().size() != 3) {
            ajcqVarI = ajcm.a;
        } else {
            defpackage.iry iryVar = new defpackage.iry(3);
            aify aifyVarG = zpmVar.a().g();
            aca acaVar = new aca();
            int size = aifyVarG.size();
            for (int i = 0; i < size; i++) {
                apqr apqrVar = (apqr) aifyVarG.get(i);
                acaVar.put(apqrVar.b, zpmVar.k(apqrVar, defpackage.leu.class, iryVar));
            }
            ajcqVarI = ahvr.I(ahvr.aj(acaVar.values()).o(new zpk(acaVar, 0), zpmVar.f), new defpackage.ldp(this, 4), this.c);
        }
        ahrv ahrvVarG = ahrv.g(ajcqVarI);
        defpackage.ldp ldpVar = new defpackage.ldp(this, 7);
        ajct ajctVar = this.c;
        return ahrvVarG.i(ldpVar, ajctVar).i(new defpackage.ldp(this, 8), ajctVar);
    }

    public final ajcq b(defpackage.lgj lgjVar) {
        return this.f.d(lgjVar);
    }

    public final ajcq c(defpackage.lhd lhdVar) {
        defpackage.lgi lgiVar = this.f;
        return ahvr.E(new defpackage.lge(lgiVar, lhdVar, 4), lgiVar.c);
    }

    public final void d() {
        a.b().l("com/android/dialer/callscreen/impl/service/CallScreenController", "startCallScreen", 173, "CallScreenController.java").v("enter");
        this.w.a(qbc.t);
        agsm.i(261, this.C.R(defpackage.oqt.DIALER_HATS_CALL_SCREEN_ACTIVATED), "failed to log Call Screen HaTS event", new java.lang.Object[0]);
        akzx akzxVarM = defpackage.ljw.a.m();
        akzx akzxVarM2 = defpackage.lko.a.m();
        akzxVarM2.u();
        defpackage.lko lkoVar = (defpackage.lko) akzxVarM2.b;
        lkoVar.d = 1;
        lkoVar.b |= 2;
        long jElapsedRealtime = android.os.SystemClock.elapsedRealtime();
        akzxVarM2.u();
        defpackage.lko lkoVar2 = (defpackage.lko) akzxVarM2.b;
        lkoVar2.b |= 1;
        lkoVar2.c = jElapsedRealtime;
        akzxVarM.u();
        defpackage.ljw ljwVar = (defpackage.ljw) akzxVarM.b;
        defpackage.lko lkoVar3 = (defpackage.lko) akzxVarM2.p();
        j$.util.Objects.requireNonNull(lkoVar3);
        ljwVar.c = lkoVar3;
        ljwVar.b = 4;
        agsm.i(262, this.n.a((defpackage.ljw) akzxVarM.p()), "failed to log start call screen event for Call Screen session metrics", new java.lang.Object[0]);
        ahrv ahrvVarG = ahrv.g(ahvr.E(new defpackage.ldf(this, 8), this.B));
        defpackage.ldp ldpVar = new defpackage.ldp(this, 9);
        ajct ajctVar = this.c;
        agsm.i(271, ahrvVarG.i(ldpVar, ajctVar).i(new defpackage.ldp(this, 10), ajctVar).i(new defpackage.ldp(this, 11), ajctVar).i(new defpackage.ldp(this, 12), ajctVar).i(new defpackage.ldp(this, 13), ajctVar).i(new defpackage.ldp(this, 14), ajctVar), "Error activating CallScreen", new java.lang.Object[0]);
    }

    public final ajcq e(j$.util.Optional optional, int i) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        ailj ailjVarK = this.v.a().k();
        while (ailjVarK.hasNext()) {
            apqr apqrVar = (apqr) ailjVarK.next();
            if (!optional.isPresent() || !apqrVar.equals(optional.orElseThrow())) {
                arrayList.add(((defpackage.let) apqrVar.a(defpackage.let.class)).kN().k(i));
            }
        }
        return ahvr.aj(arrayList).o(new defpackage.jse(12), this.c);
    }
}
