package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class klo {
    public static final aimz a = aimz.i("com/android/dialer/calllog/ui/CallLogFragmentPeer");
    public defpackage.lpa B;
    public defpackage.lpa C;
    public final kew F;
    public final defpackage.kgo H;
    public final cop I;
    public final zjm J;
    public final zjm K;
    public final gpd L;
    public final ajwr M;
    public final defpackage.ni N;
    public final defpackage.heq O;
    public final rsr P;
    public final rai Q;
    public final aogc R;
    private final sou S;
    private final defpackage.hsj W;
    private final ipc X;
    private final rai Y;
    public final android.content.Context b;
    public final ajct c;
    public final opx d;
    public final jys e;
    public final defpackage.kld f;
    public final rlv g;
    public final ruc h;
    public final aoin i;
    public final agtj j;
    public final tec k;
    public final ojo l;
    public final mau m;
    public final agsm n;
    public final aoin o;
    public final aoin p;
    public final aoin q;
    public final ahpz r;
    public android.support.v7.widget.RecyclerView x;
    public androidx.coordinatorlayout.widget.CoordinatorLayout y;
    public defpackage.kmf z;
    public final agtk s = new defpackage.klf(this);
    public final agtk t = new defpackage.kli(this);
    public final agye u = new defpackage.klj(this);
    public final defpackage.klm v = new defpackage.klm(this);
    public final android.content.BroadcastReceiver w = new defpackage.klk(this);
    private final java.lang.Runnable T = new defpackage.ioi(this, 18);
    public j$.util.Optional A = j$.util.Optional.empty();
    public boolean D = false;
    private boolean U = false;
    public boolean E = false;
    public j$.util.Optional G = j$.util.Optional.empty();
    private boolean V = true;

    public klo(android.content.Context context, ajct ajctVar, opx opxVar, jys jysVar, defpackage.kld kldVar, rlv rlvVar, ruc rucVar, sou souVar, aoin aoinVar, defpackage.hsj hsjVar, defpackage.kgo kgoVar, ipc ipcVar, aogc aogcVar, agtj agtjVar, rsr rsrVar, gpd gpdVar, defpackage.ni niVar, tec tecVar, ojo ojoVar, cop copVar, ajwr ajwrVar, kew kewVar, mau mauVar, agsm agsmVar, aoin aoinVar2, aoin aoinVar3, aoin aoinVar4, ahpz ahpzVar, defpackage.heq heqVar, zjm zjmVar, zjm zjmVar2, rai raiVar, rai raiVar2) {
        this.b = context;
        this.c = ajctVar;
        this.d = opxVar;
        this.e = jysVar;
        this.f = kldVar;
        this.g = rlvVar;
        this.h = rucVar;
        this.S = souVar;
        this.i = aoinVar;
        this.W = hsjVar;
        this.H = kgoVar;
        this.X = ipcVar;
        this.R = aogcVar;
        this.j = agtjVar;
        this.P = rsrVar;
        this.L = gpdVar;
        this.N = niVar;
        this.k = tecVar;
        this.l = ojoVar;
        this.I = copVar;
        this.M = ajwrVar;
        this.F = kewVar;
        this.m = mauVar;
        this.n = agsmVar;
        this.o = aoinVar2;
        this.p = aoinVar3;
        this.q = aoinVar4;
        this.r = ahpzVar;
        this.O = heqVar;
        this.J = zjmVar;
        this.K = zjmVar2;
        this.Y = raiVar;
        this.Q = raiVar2;
    }

    public final com.android.dialer.widget.emptycontentview.EmptyContentView a() {
        defpackage.kld kldVar = this.f;
        com.android.dialer.widget.emptycontentview.EmptyContentView emptyContentViewFindViewById = kldVar.N().findViewById(2131427658);
        return emptyContentViewFindViewById == null ? ((android.view.ViewStub) kldVar.N().findViewById(2131427659)).inflate() : emptyContentViewFindViewById;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, java.util.Map] */
    public final void b(defpackage.kdf kdfVar) {
        j$.util.Optional optionalG = this.J.g();
        if (true == optionalG.isPresent()) {
            optionalG = j$.util.Optional.ofNullable(((defpackage.kgp) optionalG.get()).a());
        }
        defpackage.kde kdeVar = new defpackage.kde(kdfVar);
        kdeVar.b(optionalG);
        defpackage.kdf kdfVarA = kdeVar.a();
        android.support.v7.widget.RecyclerView recyclerView = this.x;
        kh khVar = recyclerView.m;
        if (khVar != null) {
            defpackage.klc klcVar = (defpackage.klc) khVar;
            klcVar.x(kdfVarA);
            defpackage.hsj hsjVar = klcVar.m;
            gus.aI();
            hsjVar.f.clear();
            qqo qqoVar = klcVar.k;
            qqoVar.b = 0;
            qqoVar.a = 0;
            klcVar.g.clear();
            klcVar.e();
            return;
        }
        defpackage.kld kldVar = this.f;
        kldVar.z();
        recyclerView.aa(new android.support.v7.widget.LinearLayoutManager(1, false));
        az azVarG = kldVar.G();
        ahvr.ci(azVarG);
        rai raiVar = this.Y;
        defpackage.kmf kmfVar = this.z;
        defpackage.hsj hsjVar2 = this.W;
        hir hirVar = (hir) raiVar.a;
        defpackage.him himVar = hirVar.a;
        defpackage.hip hipVar = himVar.a;
        ahbv ahbvVarCw = hipVar.cw();
        defpackage.ni niVar = (defpackage.ni) hipVar.hP.a();
        his hisVar = hirVar.b;
        rai raiVar2 = (rai) hisVar.n.a();
        hkh hkhVar = hirVar.c;
        tec tecVarK = hipVar.K();
        amyz amyzVar = himVar.Fx;
        zzx zzxVarF = hkhVar.f();
        defpackage.hip.bZ();
        rlv rlvVar = (rlv) himVar.fq.a();
        nwu nwuVar = (nwu) himVar.va.a();
        ruc rucVar = (ruc) himVar.eK.a();
        zzx zzxVar = new zzx(hisVar.o);
        j$.util.Optional optionalOf = j$.util.Optional.of(new defpackage.hgt((char[]) null));
        j$.util.Optional optionalOf2 = j$.util.Optional.of(new defpackage.osa(1));
        aooh.f(optionalOf, "optionalFeature");
        aooh.f(optionalOf2, "optionalFeatureEnabledFn");
        this.x.Y(new defpackage.klc(ahbvVarCw, niVar, raiVar2, tecVarK, amyzVar, zzxVarF, rlvVar, nwuVar, rucVar, zzxVar, new zjm(optionalOf, optionalOf2), hipVar.ct(), azVarG, kldVar, kmfVar, kdfVarA, hsjVar2));
    }

    /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r9v0, types: [aoss, java.lang.Object] */
    public final void c() {
        kh khVar;
        android.support.v7.widget.RecyclerView recyclerView = this.x;
        if (recyclerView != null && (khVar = recyclerView.m) != null) {
            defpackage.hsj hsjVar = ((defpackage.klc) khVar).m;
            gus.aI();
            ?? r2 = hsjVar.h;
            java.util.HashMap mapAG = ahvr.aG(r2.size());
            for (java.util.Map.Entry entry : r2.entrySet()) {
                mapAG.put(((defpackage.hkd) entry.getKey()).c, (spn) entry.getValue());
            }
            r2.clear();
            java.lang.Object obj = hsjVar.j;
            java.lang.Object obj2 = hsjVar.c;
            aikn aiknVar = aikn.a;
            aooh.f(aiknVar, "deletes");
            rsr rsrVar = (rsr) obj2;
            ((agsm) obj).g(ahvr.H(aosv.F((aoss) rsrVar.a, 0, new rjk(rsrVar, mapAG, aiknVar, (aoln) null, 10), 3), new defpackage.jss(hsjVar, 14), (java.util.concurrent.Executor) hsjVar.i), 10L, java.util.concurrent.TimeUnit.SECONDS);
        }
        mni.cw().removeCallbacks(this.T);
        this.A = j$.util.Optional.empty();
        if (this.D) {
            agsm.i(203, this.e.a(), "Failed to clear all missed calls.", new java.lang.Object[0]);
        }
        this.S.c();
    }

    public final void d() {
        boolean zG = g();
        ruc rucVar = this.h;
        if (zG) {
            rucVar.j(ruc.bx);
        } else {
            rucVar.j(ruc.bw);
        }
        if (this.V) {
            this.V = false;
        } else {
            gus.aI();
            a.b().l("com/android/dialer/calllog/ui/CallLogFragmentPeer", "startUpdateTimer", 1066, "CallLogFragmentPeer.java").v("start update timer");
            this.A = this.h.a();
            this.F.d();
        }
        if (!this.U) {
            this.U = true;
            this.X.bm(rmu.i);
        }
        this.D = false;
        mni.cw().postDelayed(this.T, 3000L);
    }

    public final void e(kiu kiuVar) {
        az azVarG;
        defpackage.kld kldVar = this.f;
        android.view.View viewFindViewById = ((aw) kldVar).Q.findViewById(2131427867);
        if (viewFindViewById != null) {
            if (kiuVar == null || (kiuVar.b & 1) == 0 || (azVarG = kldVar.G()) == null || azVarG.isChangingConfigurations() || azVarG.isFinishing() || kldVar.I().ac()) {
                com.android.dialer.widget.emptycontentview.EmptyContentView emptyContentViewFindViewById = kldVar.N().findViewById(2131427644);
                if (emptyContentViewFindViewById != null) {
                    emptyContentViewFindViewById.g(2132018185);
                    emptyContentViewFindViewById.h();
                    emptyContentViewFindViewById.setVisibility(0);
                }
                viewFindViewById.setVisibility(8);
                return;
            }
            com.android.dialer.widget.emptycontentview.EmptyContentView emptyContentViewFindViewById2 = kldVar.N().findViewById(2131427644);
            if (emptyContentViewFindViewById2 != null) {
                emptyContentViewFindViewById2.setVisibility(8);
            }
            viewFindViewById.setVisibility(0);
            u uVar = new u(kldVar.I());
            defpackage.kgo.g(uVar, kiuVar);
            uVar.c();
        }
    }

    public final void f() {
        a().setVisibility(0);
        e(null);
    }

    public final boolean g() {
        return rhx.b(this.b);
    }
}
