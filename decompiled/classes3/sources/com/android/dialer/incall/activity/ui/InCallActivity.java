package com.android.dialer.incall.activity.ui;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class InCallActivity extends defpackage.otw implements ahei, aheh, ahfx {
    private defpackage.otz o;
    private boolean q;
    private android.content.Context r;
    private emy t;
    private boolean u;
    private final ahmw p = new ahmw(this, this);
    private final long s = android.os.SystemClock.elapsedRealtime();

    /* JADX WARN: Multi-variable type inference failed */
    public InCallActivity() {
        r(new mey(this, 10));
    }

    private final defpackage.otz C() {
        A();
        return this.o;
    }

    public final void A() {
        if (this.o == null) {
            if (!this.q) {
                throw new java.lang.IllegalStateException("createPeer() called outside of onCreate");
            }
            if (this.u && !isFinishing()) {
                throw new java.lang.IllegalStateException("createPeer() called after destroyed.");
            }
            ahoq ahoqVarW = ahvr.W(433, "CreateComponent");
            try {
                B();
                ahoqVarW.close();
                ahoq ahoqVarW2 = ahvr.W(434, "CreatePeer");
                try {
                    this.o = ((oua) agab.aC(this, oua.class)).m();
                    ahoqVarW2.close();
                } catch (java.lang.Throwable th) {
                    try {
                        ahoqVarW2.close();
                    } catch (java.lang.Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (java.lang.Throwable th3) {
                try {
                    ahoqVarW.close();
                } catch (java.lang.Throwable th4) {
                    th3.addSuppressed(th4);
                }
                throw th3;
            }
        }
    }

    public final ems P() {
        if (this.t == null) {
            this.t = new ahfy(this);
        }
        return this.t;
    }

    public final void applyOverrideConfiguration(android.content.res.Configuration configuration) {
        android.content.Context baseContext = getBaseContext();
        if (baseContext == null) {
            baseContext = this.r;
        }
        ahvr.b(baseContext);
        super.applyOverrideConfiguration(configuration);
    }

    protected final void attachBaseContext(android.content.Context context) {
        this.r = context;
        ahvr.a(context);
        super.attachBaseContext(context);
        this.r = null;
    }

    public final void finish() {
        ahpm ahpmVarA = this.p.a();
        try {
            super.finish();
            ahpmVarA.close();
        } catch (java.lang.Throwable th) {
            try {
                ahpmVarA.close();
            } catch (java.lang.Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final void invalidateOptionsMenu() {
        ahpm ahpmVarG = ahns.g();
        try {
            super.invalidateOptionsMenu();
            ahpmVarG.close();
        } catch (java.lang.Throwable th) {
            try {
                ahpmVarG.close();
            } catch (java.lang.Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final boolean l() {
        ahpm ahpmVarL = this.p.l();
        try {
            boolean zL = super.l();
            ahpmVarL.close();
            return zL;
        } catch (java.lang.Throwable th) {
            try {
                ahpmVarL.close();
            } catch (java.lang.Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    protected final void onActivityResult(int i, int i2, android.content.Intent intent) {
        ahpm ahpmVarT = this.p.t();
        try {
            super.onActivityResult(i, i2, intent);
            ahpmVarT.close();
        } catch (java.lang.Throwable th) {
            try {
                ahpmVarT.close();
            } catch (java.lang.Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final void onAttachedToWindow() {
        ahpm ahpmVarB = this.p.b();
        try {
            super.onAttachedToWindow();
            ahpmVarB.close();
        } catch (java.lang.Throwable th) {
            try {
                ahpmVarB.close();
            } catch (java.lang.Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final void onBackPressed() {
        ahpm ahpmVarC = this.p.c();
        try {
            super.onBackPressed();
            ahpmVarC.close();
        } catch (java.lang.Throwable th) {
            try {
                ahpmVarC.close();
            } catch (java.lang.Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final void onConfigurationChanged(android.content.res.Configuration configuration) {
        ahpm ahpmVarN = this.p.n("onConfigurationChanged", (ahou) null);
        try {
            super.onConfigurationChanged(configuration);
            ahpmVarN.close();
        } catch (java.lang.Throwable th) {
            try {
                ahpmVarN.close();
            } catch (java.lang.Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.otw
    protected final void onCreate(android.os.Bundle bundle) {
        ahmw ahmwVar = this.p;
        ahpm ahpmVarU = ahmwVar.u();
        try {
            this.q = true;
            P().h(ahmwVar);
            super.onCreate(bundle);
            defpackage.otz otzVarC = C();
            aimz aimzVar = defpackage.otz.a;
            aimzVar.b().l("com/android/dialer/incall/activity/ui/InCallActivityPeer", "onCreate", 215, "InCallActivityPeer.java").v("enter");
            otzVarC.j.d();
            otzVarC.o.c();
            if (otzVarC.e()) {
                otzVarC.b.setRequestedOrientation(2);
            }
            otzVarC.i.o(rmx.jO);
            qba qbaVar = otzVarC.f;
            agsm.i(572, ahvr.E(new defpackage.pmw(qbaVar, otzVarC, 9), qbaVar.e), "failed registering AllLocksReleasedListener", new java.lang.Object[0]);
            oud oudVar = otzVarC.k;
            mp mpVar = otzVarC.b;
            aooh.f(mpVar, "activity");
            oud.a.b().l("com/android/dialer/incall/activity/uiminimizer/impl/InCallActivityMinimizerImpl", "registerInCallActivity", 37, "InCallActivityMinimizerImpl.kt").v("Registers InCallActivity.");
            oudVar.b.g(ahvr.E(new lge(oudVar, mpVar, 16, (byte[]) null), oudVar.d), 5L, java.util.concurrent.TimeUnit.SECONDS);
            if (bundle == null) {
                u uVar = new u(mpVar.a());
                ailj ailjVarK = otzVarC.t.e().k();
                while (ailjVarK.hasNext()) {
                    defpackage.otf otfVar = (defpackage.otf) ailjVarK.next();
                    java.lang.String strB = otfVar.b();
                    if (mpVar.a().e(strB) == null) {
                        aimzVar.b().l("com/android/dialer/incall/activity/ui/InCallActivityPeer", "commitHeadlessFragments", 506, "InCallActivityPeer.java").y("attaching headless fragment : %s", strB);
                        uVar.e(0, otfVar.a(), strB, 1);
                    } else {
                        aimzVar.b().l("com/android/dialer/incall/activity/ui/InCallActivityPeer", "commitHeadlessFragments", 509, "InCallActivityPeer.java").y("headless fragment is already attached : %s", strB);
                    }
                }
                uVar.c();
                bo boVarA = mpVar.a();
                java.lang.String name = defpackage.qah.class.getName();
                if (boVarA.e(name) == null) {
                    aimzVar.b().l("com/android/dialer/incall/activity/ui/InCallActivityPeer", "commitScreenHostFragment", 523, "InCallActivityPeer.java").v("attaching ScreenHostFragment");
                    u uVar2 = new u(boVarA);
                    akzx akzxVarM = defpackage.qai.a.m();
                    j$.util.Optional optionalB = defpackage.abwc.b(mpVar.getIntent().getByteArrayExtra("InCallActivity.callee_id"));
                    j$.util.Objects.requireNonNull(akzxVarM);
                    orq orqVar = new orq(akzxVarM, 13);
                    if (true == optionalB.isPresent()) {
                        java.lang.Object obj = optionalB.get();
                        java.lang.Object obj2 = orqVar.a;
                        ((akzx) obj2).u();
                        defpackage.qai qaiVar = (defpackage.qai) ((akzx) obj2).b;
                        j$.util.Objects.requireNonNull(obj);
                        qaiVar.c = (defpackage.abvz) obj;
                        qaiVar.b |= 1;
                    }
                    long longExtra = mpVar.getIntent().getLongExtra("InCallActivity.outgoing_call_request_id", 0L);
                    akzxVarM.u();
                    ((defpackage.qai) akzxVarM.b).d = longExtra;
                    defpackage.qai qaiVar2 = (defpackage.qai) akzxVarM.p();
                    defpackage.qah qahVar = new defpackage.qah();
                    amxr.g(qahVar);
                    ahgl.b(qahVar, qaiVar2);
                    uVar2.q(2131428387, qahVar, name);
                    uVar2.c();
                } else {
                    aimzVar.b().l("com/android/dialer/incall/activity/ui/InCallActivityPeer", "commitScreenHostFragment", 532, "InCallActivityPeer.java").v("ScreenHostFragment is already attached");
                }
            }
            mpVar.fc().c(otzVarC.l);
            ft$.ExternalSyntheticApiModelOutline0.m(mpVar.getWindow().getAttributes(), 1);
            int i = 2129920;
            if (otzVarC.c.a().equals(defpackage.zmw.ROUTE_BLUETOOTH) && otzVarC.r.b(defpackage.zpo.d).isEmpty()) {
                i = 32768;
            }
            mpVar.getWindow().addFlags(i);
            otzVarC.B.q(2132084700);
            if (otzVarC.u.g().isPresent()) {
                mpVar.setTheme(2132084940);
            }
            aimzVar.b().l("com/android/dialer/incall/activity/ui/InCallActivityPeer", "onCreate", 254, "InCallActivityPeer.java").v("Setting aurora background color for the InCallActivity.");
            mpVar.getWindow().getDecorView().setBackgroundColor(urg.c(mpVar.getApplicationContext(), 2130969107));
            aimzVar.b().l("com/android/dialer/incall/activity/ui/InCallActivityPeer", "onCreate", 260, "InCallActivityPeer.java").v("Enabling edge-to-edge for InCallActivity.");
            dzn.c(mpVar.getWindow(), false);
            mpVar.setContentView(2131624270);
            mpVar.setTaskDescription(new android.app.ActivityManager.TaskDescription(mpVar.getString(2132019556)));
            otzVarC.a(mpVar.getIntent());
            defpackage.otq otqVar = otzVarC.g;
            defpackage.otn otnVar = otqVar.g;
            otqVar.g = new defpackage.otm().a();
            j$.util.Optional optional = otnVar.a;
            if (optional.isPresent()) {
                j$.util.Optional optional2 = otnVar.b;
                if (optional2.isPresent()) {
                    otqVar.b.q((aeun) optional.orElseThrow(), (aenj) optional2.orElseThrow(), rub.b);
                }
            }
            if (otzVarC.v.d()) {
                if (otzVarC.n.a(mpVar)) {
                    zjv.i(otzVarC.m, mgv.l, (java.util.List) null, (mhc) null, 0, 30);
                } else {
                    zjv.i(otzVarC.m, mgv.m, (java.util.List) null, (mhc) null, 0, 30);
                }
            }
            ailj ailjVarK2 = otzVarC.r.a().k();
            while (ailjVarK2.hasNext()) {
                agze agzeVarCL = ((defpackage.oty) ((defpackage.apqr) ailjVarK2.next()).a(defpackage.oty.class)).cL();
                agzeVarCL.a = agzeVarCL.a || otzVarC.n.a(mpVar);
            }
            ahvr.w(this).a = findViewById(android.R.id.content);
            defpackage.otz otzVar = this.o;
            ahvr.c(this, defpackage.qaa.class, new lyu(otzVar, 8));
            ahvr.c(this, defpackage.qag.class, new lyu(otzVar, 9));
            this.q = false;
            ahmwVar.o();
            ahpmVarU.close();
        } catch (java.lang.Throwable th) {
            try {
                ahpmVarU.close();
                throw th;
            } catch (java.lang.Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
    }

    public final boolean onCreatePanelMenu(int i, android.view.Menu menu) {
        ahpm ahpmVarV = this.p.v();
        try {
            super.onCreatePanelMenu(i, menu);
            ahpmVarV.close();
            return true;
        } catch (java.lang.Throwable th) {
            try {
                ahpmVarV.close();
            } catch (java.lang.Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.otw
    protected final void onDestroy() {
        ahpm ahpmVarD = this.p.d();
        try {
            super.onDestroy();
            defpackage.otz otzVarC = C();
            qba qbaVar = otzVarC.f;
            agsm.i(574, ahvr.F(new lly(qbaVar, otzVarC, 19, (byte[]) null), qbaVar.e), "failed unregistering AllLocksReleasedListener", new java.lang.Object[0]);
            oud oudVar = otzVarC.k;
            oud.a.b().l("com/android/dialer/incall/activity/uiminimizer/impl/InCallActivityMinimizerImpl", "unregisterInCallActivity", 49, "InCallActivityMinimizerImpl.kt").v("Unregisters InCallActivity.");
            oudVar.b.g(ahvr.E(new lye(oudVar, 14), oudVar.d), 5L, java.util.concurrent.TimeUnit.SECONDS);
            gpd gpdVar = otzVarC.z;
            gpdVar.i((java.lang.String) null).b(mce.Z);
            zpm zpmVar = otzVarC.r;
            if (zpmVar.d().size() <= 1) {
                j$.util.Optional optionalH = zpmVar.h();
                if (true == optionalH.isPresent()) {
                    optionalH = j$.util.Optional.ofNullable(((defpackage.apqr) optionalH.get()).b);
                }
                gpdVar.i((java.lang.String) optionalH.orElse((java.lang.Object) null)).b(mce.aP);
            }
            otzVarC.j.e();
            this.u = true;
            ahpmVarD.close();
        } catch (java.lang.Throwable th) {
            try {
                ahpmVarD.close();
            } catch (java.lang.Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    protected final void onNewIntent(android.content.Intent intent) {
        ahpm ahpmVarE = this.p.e(intent);
        try {
            super.onNewIntent(intent);
            defpackage.otz otzVarC = C();
            aimz aimzVar = defpackage.otz.a;
            aimzVar.b().l("com/android/dialer/incall/activity/ui/InCallActivityPeer", "onNewIntent", 382, "InCallActivityPeer.java").v("enter");
            if (otzVarC.p) {
                otzVarC.c(intent, false);
            } else {
                otzVarC.c(intent, true);
                aimzVar.b().l("com/android/dialer/incall/activity/ui/InCallActivityPeer", "onNewIntent", 390, "InCallActivityPeer.java").v("Restarting InCallActivity to force screen on.");
                otzVarC.b.recreate();
            }
            ahpmVarE.close();
        } catch (java.lang.Throwable th) {
            try {
                ahpmVarE.close();
            } catch (java.lang.Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final boolean onOptionsItemSelected(android.view.MenuItem menuItem) {
        ahpm ahpmVarX = this.p.x();
        try {
            boolean zOnOptionsItemSelected = super.onOptionsItemSelected(menuItem);
            ahpmVarX.close();
            return zOnOptionsItemSelected;
        } catch (java.lang.Throwable th) {
            try {
                ahpmVarX.close();
            } catch (java.lang.Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    protected final void onPause() {
        ahpm ahpmVarF = this.p.f();
        try {
            super.onPause();
            defpackage.otz otzVarC = C();
            defpackage.otz.a.b().l("com/android/dialer/incall/activity/ui/InCallActivityPeer", "onPause", 348, "InCallActivityPeer.java").v("enter");
            otzVarC.A.A();
            ahpmVarF.close();
        } catch (java.lang.Throwable th) {
            try {
                ahpmVarF.close();
            } catch (java.lang.Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final void onPictureInPictureModeChanged(boolean z, android.content.res.Configuration configuration) {
        ahpm ahpmVarY = this.p.y();
        try {
            super.onPictureInPictureModeChanged(z, configuration);
            ahpmVarY.close();
        } catch (java.lang.Throwable th) {
            try {
                ahpmVarY.close();
            } catch (java.lang.Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    protected final void onPostCreate(android.os.Bundle bundle) {
        ahpm ahpmVarZ = this.p.z();
        try {
            super.onPostCreate(bundle);
            ahpmVarZ.close();
        } catch (java.lang.Throwable th) {
            try {
                ahpmVarZ.close();
            } catch (java.lang.Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    protected final void onPostResume() {
        ahpm ahpmVarG = this.p.g();
        try {
            super.onPostResume();
            ahpmVarG.close();
        } catch (java.lang.Throwable th) {
            try {
                ahpmVarG.close();
            } catch (java.lang.Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final boolean onPrepareOptionsMenu(android.view.Menu menu) {
        ahpm ahpmVarG = ahns.g();
        try {
            boolean zOnPrepareOptionsMenu = super.onPrepareOptionsMenu(menu);
            ahpmVarG.close();
            return zOnPrepareOptionsMenu;
        } catch (java.lang.Throwable th) {
            try {
                ahpmVarG.close();
            } catch (java.lang.Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final void onRequestPermissionsResult(int i, java.lang.String[] strArr, int[] iArr) {
        ahpm ahpmVarN = this.p.n("onRequestPermissionsResult", (ahou) null);
        try {
            super.onRequestPermissionsResult(i, strArr, iArr);
            ahpmVarN.close();
        } catch (java.lang.Throwable th) {
            try {
                ahpmVarN.close();
            } catch (java.lang.Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    protected final void onRestart() {
        ahpm ahpmVarH = this.p.h();
        try {
            super.onRestart();
            ahpmVarH.close();
        } catch (java.lang.Throwable th) {
            try {
                ahpmVarH.close();
            } catch (java.lang.Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX WARN: Type inference failed for: r10v4, types: [java.lang.Object, java.util.concurrent.ScheduledExecutorService] */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, java.util.Map] */
    protected final void onResume() {
        ahpm ahpmVarI = this.p.i();
        try {
            super.onResume();
            defpackage.otz otzVarC = C();
            defpackage.otz.a.b().l("com/android/dialer/incall/activity/ui/InCallActivityPeer", "onResume", 307, "InCallActivityPeer.java").v("enter");
            aihd aihdVarO = aihd.o(otzVarC.s.b.keySet());
            int i = 1;
            j$.util.Optional optionalFindAny = aihdVarO.size() == 1 ? j$.util.Collection.-EL.stream(aihdVarO).findAny() : j$.util.Optional.empty();
            orq orqVar = new orq(otzVarC, 12);
            if (true == optionalFindAny.isPresent()) {
                java.lang.Object obj = optionalFindAny.get();
                java.lang.Object obj2 = orqVar.a;
                ((defpackage.otz) obj2).C.aF(((defpackage.otz) obj2).b.findViewById(2131428387), new lge(obj2, (java.lang.Long) obj, 15));
            }
            adae adaeVar = otzVarC.A;
            tkl tklVar = otzVarC.y;
            com.android.dialer.incall.activity.ui.InCallActivity inCallActivity = otzVarC.b;
            adaeVar.z(tklVar.g(inCallActivity));
            ailj ailjVarK = otzVarC.r.a().k();
            while (ailjVarK.hasNext()) {
                defpackage.qax qaxVarAh = ((defpackage.oty) ((defpackage.apqr) ailjVarK.next()).a(defpackage.oty.class)).ah();
                boolean booleanExtra = inCallActivity.getIntent().getBooleanExtra("InCallActivity.for_full_screen", false);
                if (qaxVarAh.n == -1) {
                    aazc aazcVar = qaxVarAh.A;
                    qaxVarAh.n = android.os.SystemClock.elapsedRealtime();
                    qaxVarAh.q = booleanExtra;
                }
            }
            ruc rucVar = otzVarC.h;
            rucVar.m(ruc.c);
            aenj aenjVar = ruc.P;
            rucVar.m(aenjVar);
            rucVar.o(aenjVar);
            defpackage.pgi pgiVar = otzVarC.x;
            agsm.i(436, ahvr.D(new defpackage.plx(pgiVar, i), 1L, java.util.concurrent.TimeUnit.SECONDS, (java.util.concurrent.ScheduledExecutorService) pgiVar.a), "Error logging on resume memory metrics", new java.lang.Object[0]);
            ahpmVarI.close();
        } catch (java.lang.Throwable th) {
            try {
                ahpmVarI.close();
            } catch (java.lang.Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    protected final void onSaveInstanceState(android.os.Bundle bundle) {
        ahpm ahpmVarA = this.p.A();
        try {
            super.onSaveInstanceState(bundle);
            ahpmVarA.close();
        } catch (java.lang.Throwable th) {
            try {
                ahpmVarA.close();
            } catch (java.lang.Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    protected final void onStart() {
        android.view.Display.Mode mode;
        ahpm ahpmVarJ = this.p.j();
        try {
            super.onStart();
            defpackage.otz otzVarC = C();
            aimz aimzVar = defpackage.otz.a;
            aimzVar.b().l("com/android/dialer/incall/activity/ui/InCallActivityPeer", "onStart", 294, "InCallActivityPeer.java").v("enter");
            otzVarC.w.f(true);
            otzVarC.p = true;
            otzVarC.l.f(false);
            if (((java.lang.Boolean) otzVarC.d.a()).booleanValue()) {
                com.android.dialer.incall.activity.ui.InCallActivity inCallActivity = otzVarC.b;
                java.util.List listAsList = java.util.Arrays.asList(inCallActivity.getWindowManager().getDefaultDisplay().getSupportedModes());
                if (listAsList.size() == 1) {
                    aimzVar.b().l("com/android/dialer/incall/activity/ui/InCallActivityPeer", "set60HzDisplayMode", 587, "InCallActivityPeer.java").y("Nothing to do. There is only one supported mode: %s", listAsList.get(0));
                } else {
                    java.util.Iterator it = listAsList.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            mode = null;
                            break;
                        }
                        mode = (android.view.Display.Mode) it.next();
                        aimzVar.b().l("com/android/dialer/incall/activity/ui/InCallActivityPeer", "set60HzDisplayMode", 594, "InCallActivityPeer.java").y("Found supported mode: %s", mode);
                        if (mode.getRefreshRate() > 55.0f && mode.getRefreshRate() < 65.0f) {
                            break;
                        }
                    }
                    if (mode == null) {
                        a.bI(aimzVar.d(), "There is no supported mode for 60Hz", "com/android/dialer/incall/activity/ui/InCallActivityPeer", "set60HzDisplayMode", (char) 601, "InCallActivityPeer.java", zct.b);
                    } else {
                        inCallActivity.getWindow().getAttributes().preferredDisplayModeId = mode.getModeId();
                        aimzVar.b().l("com/android/dialer/incall/activity/ui/InCallActivityPeer", "set60HzDisplayMode", 606, "InCallActivityPeer.java").G("Using 60Hz display mode: %s, %d", mode, inCallActivity.getWindow().getAttributes().preferredDisplayModeId);
                    }
                }
            } else {
                aimzVar.b().l("com/android/dialer/incall/activity/ui/InCallActivityPeer", "set60HzDisplayMode", 580, "InCallActivityPeer.java").v("Forced 60hz refresh rate disabled");
            }
            otzVarC.d(false);
            ahpmVarJ.close();
        } catch (java.lang.Throwable th) {
            try {
                ahpmVarJ.close();
                throw th;
            } catch (java.lang.Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r6v4, types: [java.lang.Object, ruc] */
    protected final void onStop() {
        ahpm ahpmVarK = this.p.k();
        try {
            super.onStop();
            defpackage.otz otzVarC = C();
            defpackage.otz.a.b().l("com/android/dialer/incall/activity/ui/InCallActivityPeer", "onStop", 355, "InCallActivityPeer.java").v("enter");
            if (((java.lang.Boolean) otzVarC.e.a()).booleanValue()) {
                if (!otzVarC.q && !otzVarC.b.isChangingConfigurations()) {
                    otzVarC.w.f(false);
                }
            } else if (!otzVarC.q) {
                otzVarC.w.f(false);
            }
            otzVarC.p = false;
            otzVarC.l.f(true);
            if (!otzVarC.b.isChangingConfigurations()) {
                otzVarC.z.i((java.lang.String) null).b(mce.aa);
            }
            otzVarC.x.b.f(ruc.f);
            ahpmVarK.close();
        } catch (java.lang.Throwable th) {
            try {
                ahpmVarK.close();
            } catch (java.lang.Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final void onUserInteraction() {
        ahpm ahpmVarM = this.p.m();
        try {
            super.onUserInteraction();
            ahpmVarM.close();
        } catch (java.lang.Throwable th) {
            try {
                ahpmVarM.close();
            } catch (java.lang.Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final void startActivity(android.content.Intent intent) {
        agab.aD(intent, getApplicationContext());
        super.startActivity(intent);
    }

    public final long w() {
        return this.s;
    }

    public final /* bridge */ /* synthetic */ java.lang.Object y() {
        defpackage.otz otzVar = this.o;
        if (otzVar == null) {
            throw new java.lang.IllegalStateException("peer() called before initialized.");
        }
        if (this.u) {
            throw new java.lang.IllegalStateException("peer() called after destroyed.");
        }
        return otzVar;
    }

    @Override // defpackage.otw
    public final /* synthetic */ amxj z() {
        return new ahgk(this);
    }

    public final void startActivity(android.content.Intent intent, android.os.Bundle bundle) {
        agab.aD(intent, getApplicationContext());
        super.startActivity(intent, bundle);
    }

    protected final void m() {
    }

    protected final void n() {
    }
}
