package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class oby {
    public static final aimz a = aimz.i("com/android/dialer/emergencycalling/impl/ui/EmergencyVoiceFragmentPeer");
    private final aoin A;
    private final defpackage.obw B;
    private final defpackage.nwj C;
    private final zzx D;
    private final afpl E;
    public final defpackage.obs b;
    public final pyj c;
    public final ruc d;
    public final j$.util.Optional e;
    public final java.util.Map f;
    public final pzn g;
    public final aoss h;
    public final ahpz i;
    public final defpackage.obr j;
    public final defpackage.obl k;
    public final aoin l;
    public final defpackage.obx m;
    public boolean n;
    public defpackage.obf o;
    public defpackage.obf p;
    public agby q;
    public boolean r;
    public final zpm s;
    public final xm t;
    public final gpd u;
    public final aogc v;
    private final pnb w;
    private final agzc x;
    private final defpackage.odo y;
    private final qhz z;

    public oby(defpackage.obs obsVar, defpackage.nwj nwjVar, afpl afplVar, pnb pnbVar, pyj pyjVar, ruc rucVar, j$.util.Optional optional, zzx zzxVar, zpm zpmVar, java.util.Map map, pzn pznVar, gpd gpdVar, aoss aossVar, agzc agzcVar, defpackage.odo odoVar, ahpz ahpzVar, defpackage.obr obrVar, defpackage.obl oblVar, xm xmVar, qhz qhzVar, aoin aoinVar, aoin aoinVar2, aogc aogcVar) {
        aooh.f(rucVar, "metrics");
        aooh.f(optional, "assistedEmergencyDialingFeature");
        aooh.f(zpmVar, "callScopes");
        aooh.f(pznVar, "earpieceOnDisplayTracker");
        aooh.f(gpdVar, "cuiSemanticLoggerFactory");
        aooh.f(aossVar, "activityCoroutineScope");
        aooh.f(agzcVar, "localSubscriptionMixin");
        aooh.f(ahpzVar, "traceCreation");
        aooh.f(xmVar, "emergencyVoiceFragmentState");
        aooh.f(aoinVar, "enableScreenOffDetection");
        aooh.f(aoinVar2, "enableEmergencyPromoNextDrawDisplayCheck");
        this.b = obsVar;
        this.C = nwjVar;
        this.E = afplVar;
        this.w = pnbVar;
        this.c = pyjVar;
        this.d = rucVar;
        this.e = optional;
        this.D = zzxVar;
        this.s = zpmVar;
        this.f = map;
        this.g = pznVar;
        this.u = gpdVar;
        this.h = aossVar;
        this.x = agzcVar;
        this.y = odoVar;
        this.i = ahpzVar;
        this.j = obrVar;
        this.k = oblVar;
        this.t = xmVar;
        this.z = qhzVar;
        this.A = aoinVar;
        this.l = aoinVar2;
        this.v = aogcVar;
        if (((java.lang.Boolean) aoinVar.a()).booleanValue()) {
            qhzVar.g(((ahfw) obsVar).a, new defpackage.mtr(this, 13));
        }
        this.m = new defpackage.obx(this);
        this.B = new defpackage.obw(this);
    }

    public final int a() {
        return urg.c(this.b.z(), 2130969107);
    }

    public final aw b() {
        return this.b.I().e("tag_voice_assist_fragment");
    }

    public final az c() {
        az azVarG = this.b.G();
        if (azVarG == null) {
            a.b().l("com/android/dialer/emergencycalling/impl/ui/EmergencyVoiceFragmentPeer", "getActivityAndLogIfNull", 934, "EmergencyVoiceFragmentPeer.kt").v("Activity is detached.");
        }
        return azVarG;
    }

    public final defpackage.obd d() {
        return this.C.c(this.o);
    }

    public final android.view.View e(android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup) {
        android.view.Window window;
        aooh.f(layoutInflater, "inflater");
        a.b().l("com/android/dialer/emergencycalling/impl/ui/EmergencyVoiceFragmentPeer", "onCreateView", 249, "EmergencyVoiceFragmentPeer.kt").v("enter");
        android.view.View viewInflate = layoutInflater.inflate(2131624183, viewGroup, false);
        aooh.e(viewInflate, "inflate(...)");
        viewInflate.setBackgroundColor(urg.c(viewInflate.getContext(), android.R.attr.colorBackground));
        pnc pncVar = new pnc();
        pncVar.f(j$.util.Optional.of(viewInflate.findViewById(2131428091)));
        pncVar.k(j$.util.Optional.of(viewInflate.findViewById(2131427844)));
        pncVar.i(j$.util.Optional.of(viewInflate.findViewById(2131428093)));
        pncVar.c(j$.util.Optional.of(viewInflate.findViewById(2131427828)));
        pncVar.g(j$.util.Optional.ofNullable(viewInflate.findViewById(2131427834)));
        pncVar.e(j$.util.Optional.of(viewInflate.findViewById(2131427830)));
        pncVar.d(j$.util.Optional.of(viewInflate.findViewById(2131427829)));
        j$.util.Optional optionalOf = j$.util.Optional.of(viewInflate.findViewById(2131427835));
        if (optionalOf == null) {
            throw new java.lang.NullPointerException("Null emergencyDialingConnectivityChip");
        }
        pncVar.c = optionalOf;
        pncVar.h(j$.util.Optional.of(viewInflate.findViewById(2131427839)));
        pnd pndVarA = pncVar.a();
        j$.util.Optional optional = pndVarA.n;
        if (optional.isPresent()) {
            try {
                ((android.widget.Chronometer) optional.orElseThrow()).setTypeface(dwk.b(((android.widget.Chronometer) optional.orElseThrow()).getContext(), 2131296305));
            } catch (android.content.res.Resources.NotFoundException e) {
                a.c().i(zct.b).k(e).l("com/android/dialer/emergencycalling/impl/ui/EmergencyVoiceFragmentPeer", "onCreateView", 287, "EmergencyVoiceFragmentPeer.kt").v("font could not be loaded");
            }
        }
        pnb pnbVar = this.w;
        pnbVar.j(pndVarA);
        pnbVar.k();
        android.view.View viewFindViewById = viewInflate.findViewById(2131428385);
        aooh.e(viewFindViewById, "findViewById(...)");
        ahpz ahpzVar = this.i;
        afsq.F(viewFindViewById, ahpzVar, "EmergencyVoiceFragmentPeer_onEndCallClicked", new defpackage.nti(this, 3));
        this.x.g(2131428104, this.E.aa(defpackage.obu.class, new defpackage.lme(7)), this.y.b(this.B, false));
        az azVarG = this.b.G();
        if (azVarG != null && (window = azVarG.getWindow()) != null) {
            window.setNavigationBarColor(a());
        }
        ahpr ahprVar = new ahpr(ahpzVar, 400, "emergency_voice_fragment_apply_window_insets_compat", new pbk(viewInflate, this, 1));
        int i = dzs.a;
        dzk.o(viewInflate, ahprVar);
        return viewInflate;
    }

    public final defpackage.heq f() {
        return new defpackage.heq(this.b.N(), (byte[]) null);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: aaos */
    public final void g(defpackage.heq heqVar, defpackage.obf obfVar) throws aaos {
        if (this.D.m()) {
            this.u.i(obfVar != null ? obfVar.g : null).b(mce.bF);
            return;
        }
        if (heqVar.ah() == null) {
            android.view.View viewFindViewById = ((android.view.View) heqVar.a).findViewById(2131428483);
            aooh.e(viewFindViewById, "findViewById(...)");
            ((android.view.ViewStub) viewFindViewById).inflate();
        }
        if (obfVar == null || this.n) {
            com.android.dialer.calllocation.ui.LocationView locationViewAh = heqVar.ah();
            if (locationViewAh != null) {
                locationViewAh.setVisibility(8);
                return;
            }
            return;
        }
        com.android.dialer.calllocation.ui.LocationView locationViewAh2 = heqVar.ah();
        if (locationViewAh2 != null) {
            defpackage.jxw jxwVarY = locationViewAh2.y();
            defpackage.jxs jxsVar = obfVar.i;
            if (jxsVar == null) {
                jxsVar = defpackage.jxs.a;
            }
            aooh.e(jxsVar, "getLocationModel(...)");
            jxwVarY.b(jxsVar);
        }
        com.android.dialer.calllocation.ui.LocationView locationViewAh3 = heqVar.ah();
        if (locationViewAh3 != null) {
            locationViewAh3.setBackgroundColor(a());
        }
        android.view.View view = (android.view.View) heqVar.a;
        android.widget.TextView textView = (android.widget.TextView) view.findViewById(2131428472);
        if (textView != null) {
            textView.setTextColor(urg.c(heqVar.V(), 2130969093));
        }
        android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) view.findViewById(2131428502);
        if (frameLayout != null) {
            frameLayout.setBackground(heqVar.V().getDrawable(2131232087));
        }
        com.android.dialer.calllocation.ui.LocationView locationViewAh4 = heqVar.ah();
        if (locationViewAh4 != null) {
            locationViewAh4.setVisibility(0);
        }
    }
}
