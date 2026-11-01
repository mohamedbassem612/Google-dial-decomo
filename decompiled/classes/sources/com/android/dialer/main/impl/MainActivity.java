package com.android.dialer.main.impl;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class MainActivity extends defpackage.rof implements defpackage.ahei, defpackage.aheh, defpackage.ahfx {
    private defpackage.rog p;
    private boolean r;
    private android.content.Context s;
    private defpackage.emy u;
    private boolean v;
    private final defpackage.ahmw q = new defpackage.ahmw(this, this);
    private final long t = android.os.SystemClock.elapsedRealtime();

    public MainActivity() {
        r(new defpackage.cz(this, 4));
    }

    private final defpackage.rog C() {
        A();
        return this.p;
    }

    public final void A() {
        if (this.p == null) {
            if (!this.r) {
                throw new java.lang.IllegalStateException("createPeer() called outside of onCreate");
            }
            if (this.v && !isFinishing()) {
                throw new java.lang.IllegalStateException("createPeer() called after destroyed.");
            }
            defpackage.ahoq ahoqVarX = defpackage.ahvr.X(740, "CreateComponent", defpackage.ahot.a, true);
            try {
                B();
                ahoqVarX.close();
                defpackage.ahoq ahoqVarX2 = defpackage.ahvr.X(741, "CreatePeer", defpackage.ahot.a, true);
                try {
                    this.p = ((defpackage.roi) defpackage.agab.aC(this, defpackage.roi.class)).v();
                    ahoqVarX2.close();
                } catch (java.lang.Throwable th) {
                    try {
                        ahoqVarX2.close();
                    } catch (java.lang.Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (java.lang.Throwable th3) {
                try {
                    ahoqVarX.close();
                } catch (java.lang.Throwable th4) {
                    th3.addSuppressed(th4);
                }
                throw th3;
            }
        }
    }

    @Override // defpackage.cm, defpackage.emx
    public final defpackage.ems P() {
        if (this.u == null) {
            this.u = new defpackage.ahfy(this);
        }
        return this.u;
    }

    @Override // android.view.ContextThemeWrapper
    public final void applyOverrideConfiguration(android.content.res.Configuration configuration) {
        android.content.Context baseContext = getBaseContext();
        if (baseContext == null) {
            baseContext = this.s;
        }
        defpackage.ahvr.b(baseContext);
        super.applyOverrideConfiguration(configuration);
    }

    @Override // defpackage.da, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    protected final void attachBaseContext(android.content.Context context) {
        this.s = context;
        ((defpackage.ahtr) defpackage.agab.aH(context, defpackage.ahtr.class)).iN();
        super.attachBaseContext(context);
        this.s = null;
    }

    @Override // android.app.Activity
    public final void finish() {
        defpackage.ahpm ahpmVarA = this.q.a();
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

    @Override // defpackage.da, android.app.Activity
    public final void invalidateOptionsMenu() {
        defpackage.ahpm ahpmVarG = defpackage.ahns.g();
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

    @Override // defpackage.da
    public final boolean l() {
        defpackage.ahpm ahpmVarL = this.q.l();
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

    @Override // defpackage.uxz, defpackage.az, defpackage.mp, android.app.Activity
    protected final void onActivityResult(int i, int i2, android.content.Intent intent) {
        defpackage.ahpm ahpmVarT = this.q.t();
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

    @Override // android.app.Activity, android.view.Window.Callback
    public final void onAttachedToWindow() {
        defpackage.ahpm ahpmVarB = this.q.b();
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

    @Override // defpackage.mp, android.app.Activity
    public final void onBackPressed() {
        defpackage.ahpm ahpmVarC = this.q.c();
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

    @Override // defpackage.da, defpackage.mp, android.app.Activity, android.content.ComponentCallbacks
    public final void onConfigurationChanged(android.content.res.Configuration configuration) {
        defpackage.ahpm ahpmVarN = this.q.n("onConfigurationChanged", null);
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

    /* JADX WARN: Type inference failed for: r1v34, types: [gom, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v4, types: [aoin, java.lang.Object] */
    @Override // defpackage.rof, defpackage.uxz, defpackage.urd, defpackage.az, defpackage.mp, defpackage.cm, android.app.Activity
    protected final void onCreate(android.os.Bundle bundle) throws java.lang.Throwable {
        defpackage.ahpm ahpmVar;
        java.lang.Throwable th;
        java.lang.Throwable th2;
        defpackage.ahoq ahoqVar;
        defpackage.ahpm ahpmVar2;
        defpackage.ahoq ahoqVar2;
        int i;
        defpackage.ahmw ahmwVar = this.q;
        defpackage.ahpm ahpmVarU = ahmwVar.u();
        boolean z = true;
        try {
            try {
                this.r = true;
                ((defpackage.ahfy) P()).h(ahmwVar);
                super.onCreate(bundle);
                defpackage.rog rogVarC = C();
                defpackage.ahoq ahoqVarX = defpackage.ahvr.X(742, "MainActivityPeer_onCreate", defpackage.ahot.a, true);
                try {
                    ((defpackage.aimw) defpackage.rog.a.b().l("com/android/dialer/main/impl/MainActivityPeer", "onCreate$<anonymous>", 96, "MainActivityPeer.kt")).v("onCreate");
                    rogVarC.d.b = true;
                    rogVarC.e.b();
                    defpackage.aogc aogcVar = rogVarC.t;
                    com.android.dialer.main.impl.MainActivity mainActivity = rogVarC.b;
                    ((java.util.concurrent.atomic.AtomicReference) aogcVar.a).set(j$.util.Optional.of(mainActivity));
                    if (((java.lang.Boolean) aogcVar.b.a()).booleanValue()) {
                        try {
                            ((java.util.concurrent.atomic.AtomicBoolean) aogcVar.c).set(defpackage.ttj.S(mainActivity.getIntent()));
                        } catch (java.lang.Throwable th3) {
                            th2 = th3;
                            ahpmVar = ahpmVarU;
                            ahoqVar = ahoqVarX;
                        }
                    }
                    mainActivity.P().c(new defpackage.roe(aogcVar, 0));
                    rogVarC.r.q(2132084701);
                    if (rogVarC.l.g().isPresent()) {
                        mainActivity.setTheme(2132084941);
                    }
                    if (((java.lang.Boolean) rogVarC.f.a()).booleanValue()) {
                        mainActivity.getWindow().setFlags(16777216, 16777216);
                    }
                    if (rogVarC.n.d()) {
                        defpackage.mni.aK(rogVarC.k, rogVarC.j.a(mainActivity) ? defpackage.mgv.ACTIVITY_CREATED_ON_COVER_SCREEN : defpackage.mgv.ACTIVITY_CREATED_ON_MAIN_SCREEN);
                    }
                    mainActivity.setContentView(2131624318);
                    try {
                        if (bundle == null) {
                            defpackage.u uVar = new defpackage.u(mainActivity.a());
                            uVar.e(2131428492, rogVarC.a(), "main_fragment", 1);
                            uVar.c();
                            defpackage.u uVar2 = new defpackage.u(mainActivity.a());
                            defpackage.ttj ttjVar = rogVarC.p;
                            uVar2.e(0, defpackage.stq.a(), "post_call_fragment", 1);
                            uVar2.c();
                            defpackage.ipc ipcVar = rogVarC.s;
                            ipcVar.bm(defpackage.rmu.APP_LAUNCHED);
                            if (!mainActivity.getTheme().resolveAttribute(2130969598, new android.util.TypedValue(), true)) {
                                java.lang.String str = java.lang.String.format(java.util.Locale.US, "Unsupported theme: %d", java.util.Arrays.copyOf(new java.lang.Object[]{mainActivity.getTheme()}, 1));
                                defpackage.aooh.e(str, "format(...)");
                                throw new java.lang.AssertionError(str);
                            }
                            android.content.res.TypedArray typedArrayObtainStyledAttributes = mainActivity.obtainStyledAttributes(new int[]{2130969598});
                            defpackage.aooh.e(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
                            boolean z2 = typedArrayObtainStyledAttributes.getBoolean(0, false);
                            typedArrayObtainStyledAttributes.recycle();
                            if (z2) {
                                rogVarC.g.n(defpackage.rmw.APP_LAUNCHED_IN_DARK_MODE);
                                ipcVar.bm(defpackage.rmu.APP_LAUNCHED_IN_DARK_MODE);
                            } else {
                                rogVarC.g.n(defpackage.rmw.APP_LAUNCHED_IN_LIGHT);
                            }
                            defpackage.ailj it = rogVarC.m.e().iterator();
                            defpackage.aooh.e(it, "iterator(...)");
                            while (it.hasNext()) {
                                ((defpackage.rns) it.next()).a(mainActivity.getIntent());
                            }
                            defpackage.rkg rkgVar = rogVarC.c;
                            boolean zB = rkgVar.c.b();
                            defpackage.aimz aimzVar = defpackage.rkg.a;
                            i = 0;
                            ((defpackage.aimw) aimzVar.b().l("com/android/dialer/largescreensupport/activityembedding/ActivityEmbedding", "init", 81, "ActivityEmbedding.kt")).y("isSplitSupported: %s", java.lang.Boolean.valueOf(zB));
                            if (zB) {
                                java.util.List listSingletonList = java.util.Collections.singletonList("com.android.dialer.multibindingsettings.impl.DialerSettingsActivity");
                                defpackage.aooh.e(listSingletonList, "singletonList(...)");
                                java.util.ArrayList arrayList = new java.util.ArrayList(defpackage.ajsz.bl(listSingletonList, 10));
                                java.util.Iterator it2 = listSingletonList.iterator();
                                while (it2.hasNext()) {
                                    boolean z3 = z;
                                    arrayList.add(new defpackage.gnl(new android.content.ComponentName(rkgVar.b, (java.lang.String) it2.next())));
                                    z = z3;
                                }
                                boolean z4 = z;
                                java.util.Set setCf = defpackage.ajsz.cf(arrayList);
                                android.content.Context context = rkgVar.b;
                                defpackage.ipc ipcVarU = defpackage.gus.U(context);
                                if (setCf == null) {
                                    defpackage.aooh.i("filters");
                                }
                                ipcVarU.z(new defpackage.gnm(setCf));
                                java.lang.Class[] clsArr = new java.lang.Class[2];
                                clsArr[0] = com.android.dialer.largescreensupport.activityembedding.TrampolineActivity.class;
                                clsArr[z4 ? 1 : 0] = com.android.dialer.largescreensupport.activityembedding.TerminatingActivity.class;
                                java.util.List listAsList = java.util.Arrays.asList(clsArr);
                                defpackage.aooh.e(listAsList, "asList(...)");
                                java.util.ArrayList arrayList2 = new java.util.ArrayList(defpackage.ajsz.bl(listAsList, 10));
                                java.util.Iterator it3 = listAsList.iterator();
                                while (it3.hasNext()) {
                                    ahpmVar = ahpmVarU;
                                    try {
                                        java.util.Iterator it4 = it3;
                                        defpackage.ahoq ahoqVar3 = ahoqVarX;
                                        arrayList2.add(new defpackage.gpp(new android.content.ComponentName(context, "com.google.android.dialer.extensions.GoogleDialtactsActivity"), new android.content.ComponentName(context, (java.lang.Class<?>) it3.next())));
                                        ahpmVarU = ahpmVar;
                                        it3 = it4;
                                        ahoqVarX = ahoqVar3;
                                    } catch (java.lang.Throwable th4) {
                                        th = th4;
                                    }
                                }
                                ahpmVar2 = ahpmVarU;
                                ahoqVar2 = ahoqVarX;
                                java.util.Set setCf2 = defpackage.ajsz.cf(arrayList2);
                                defpackage.gms gmsVar = new defpackage.gms();
                                defpackage.gph gphVar = new defpackage.gph();
                                int i2 = gmsVar.a;
                                boolean z5 = i2 >= 7 ? z4 ? 1 : 0 : false;
                                ((defpackage.aimw) aimzVar.b().l("com/android/dialer/largescreensupport/activityembedding/ActivityEmbedding", "init", 114, "ActivityEmbedding.kt")).y("isAnimationParamsSupported: %s", java.lang.Boolean.valueOf(z5));
                                if (z5) {
                                    defpackage.goh gohVar = defpackage.goh.b;
                                    defpackage.goi goiVar = defpackage.goi.a;
                                    gphVar.b = defpackage.gus.N(gohVar, goiVar, goiVar, defpackage.goi.b);
                                }
                                if (setCf2 == null) {
                                    defpackage.aooh.i("filters");
                                }
                                defpackage.gok gokVar = defpackage.gpt.e;
                                defpackage.gok gokVar2 = defpackage.gpt.f;
                                defpackage.gps gpsVar = defpackage.gps.a;
                                new defpackage.gph().a();
                                ipcVarU.z(new defpackage.gpq(setCf2, gphVar.a(), gpsVar, defpackage.gps.b, gokVar, gokVar2));
                                defpackage.ipc ipcVarT = defpackage.gus.T(context);
                                boolean z6 = i2 >= 2 ? z4 ? 1 : 0 : false;
                                ((defpackage.aimw) aimzVar.b().l("com/android/dialer/largescreensupport/activityembedding/ActivityEmbedding", "init$<anonymous>", 140, "ActivityEmbedding.kt")).y("isSplitAttributesCalculatorSupported: %s", java.lang.Boolean.valueOf(z6));
                                if (z6) {
                                    ipcVarT.a.e(new defpackage.dsm(rkgVar, 6, (float[]) null));
                                }
                            } else {
                                ahpmVar2 = ahpmVarU;
                                ahoqVar2 = ahoqVarX;
                            }
                            ahoqVar = ahoqVarX;
                            th2 = th;
                            try {
                                throw th2;
                            } catch (java.lang.Throwable th5) {
                                try {
                                    ahoqVar.close();
                                    throw th5;
                                } catch (java.lang.Throwable th6) {
                                    aoil.b(th2, th6);
                                    throw th5;
                                }
                            }
                        }
                        ahpmVar2 = ahpmVarU;
                        ahoqVar2 = ahoqVarX;
                        i = 0;
                        defpackage.aw awVarE = mainActivity.a().e("main_fragment");
                        if (!(!rogVarC.j.a(mainActivity) ? awVarE instanceof defpackage.rpv : awVarE instanceof rpm)) {
                            defpackage.u uVar3 = new defpackage.u(mainActivity.a());
                            uVar3.q(2131428492, rogVarC.a(), "main_fragment");
                            uVar3.c();
                        }
                        rogVarC.b(defpackage.ttj.S(mainActivity.getIntent()) ? defpackage.mce.MAIN_ACTIVITY_ON_CREATE_WITH_DIAL_INTENT : defpackage.mce.MAIN_ACTIVITY_ON_CREATE_WITHOUT_DIAL_INTENT);
                        defpackage.urs ursVar = rogVarC.h;
                        defpackage.urs.n(defpackage.urs.m(mainActivity));
                        if (bundle != null) {
                            rogVarC.b(defpackage.mce.MAIN_ACTIVITY_ON_CREATE_DID_NOT_HANDLE_INTENT);
                        }
                        defpackage.ruc rucVar = rogVarC.i;
                        defpackage.aenj aenjVar = defpackage.ruc.J;
                        rucVar.m(aenjVar);
                        rucVar.o(aenjVar);
                        ahoqVar2.close();
                        ((defpackage.ahti) defpackage.aooc.ar(this, defpackage.ahti.class)).b().a = findViewById(android.R.id.content);
                        defpackage.ahvr.c(this, defpackage.mlb.class, new defpackage.roh(1));
                        defpackage.ahvr.c(this, defpackage.mlc.class, new defpackage.roh(i));
                        defpackage.ahvr.c(this, defpackage.mld.class, new defpackage.roh(2));
                        defpackage.ahvr.c(this, defpackage.rod.class, new defpackage.roh(3));
                        this.r = false;
                        this.q.o();
                        ahpmVar2.close();
                    } catch (java.lang.Throwable th7) {
                        th = th7;
                    }
                } catch (java.lang.Throwable th8) {
                    th = th8;
                    ahpmVar = ahpmVarU;
                }
            } catch (java.lang.Throwable th9) {
                th = th9;
                th = th;
                try {
                    ahpmVar.close();
                    throw th;
                } catch (java.lang.Throwable th10) {
                    th.addSuppressed(th10);
                    throw th;
                }
            }
        } catch (java.lang.Throwable th11) {
            th = th11;
            ahpmVar = ahpmVarU;
            th = th;
            ahpmVar.close();
            throw th;
        }
    }

    @Override // defpackage.mp, android.app.Activity, android.view.Window.Callback
    public final boolean onCreatePanelMenu(int i, android.view.Menu menu) {
        defpackage.ahpm ahpmVarV = this.q.v();
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

    @Override // defpackage.rof, defpackage.uxz, defpackage.da, defpackage.az, android.app.Activity
    protected final void onDestroy() {
        defpackage.ahpm ahpmVarD = this.q.d();
        try {
            super.onDestroy();
            this.v = true;
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

    /* JADX WARN: Type inference failed for: r0v1, types: [aoin, java.lang.Object] */
    @Override // defpackage.uxz, defpackage.mp, android.app.Activity
    protected final void onNewIntent(android.content.Intent intent) {
        defpackage.ahpm ahpmVarE = this.q.e(intent);
        try {
            super.onNewIntent(intent);
            defpackage.rog rogVarC = C();
            defpackage.aooh.f(intent, "intent");
            defpackage.ahoq ahoqVarW = defpackage.ahvr.W(743, "MainActivityPeer_onNewIntent");
            try {
                rogVarC.b.setIntent(intent);
                defpackage.aogc aogcVar = rogVarC.t;
                defpackage.aooh.f(intent, "intent");
                if (((java.lang.Boolean) aogcVar.b.a()).booleanValue()) {
                    ((java.util.concurrent.atomic.AtomicBoolean) aogcVar.c).set(defpackage.ttj.S(intent));
                }
                defpackage.ailj it = rogVarC.m.e().iterator();
                defpackage.aooh.e(it, "iterator(...)");
                while (it.hasNext()) {
                    ((defpackage.rns) it.next()).a(intent);
                }
                defpackage.ajsz.ak(ahoqVarW, null);
                ahpmVarE.close();
            } catch (java.lang.Throwable th) {
                try {
                    throw th;
                } catch (java.lang.Throwable th2) {
                    defpackage.ajsz.ak(ahoqVarW, th);
                    throw th2;
                }
            }
        } catch (java.lang.Throwable th3) {
            try {
                ahpmVarE.close();
            } catch (java.lang.Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(android.view.MenuItem menuItem) {
        defpackage.ahpm ahpmVarX = this.q.x();
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

    @Override // defpackage.az, android.app.Activity
    protected final void onPause() {
        defpackage.ahpm ahpmVarF = this.q.f();
        try {
            super.onPause();
            defpackage.rog rogVarC = C();
            defpackage.ahoq ahoqVarW = defpackage.ahvr.W(744, "MainActivityPeer_onPause");
            try {
                rogVarC.i.b(defpackage.ruc.bV);
                rogVarC.k.e();
                rogVarC.b(defpackage.mce.MAIN_ACTIVITY_ON_PAUSE);
                if (!rogVarC.c()) {
                    rogVarC.q.A();
                    ((defpackage.oqi) rogVarC.u.b).l = j$.util.Optional.empty();
                    ((defpackage.aimw) ((defpackage.aimw) defpackage.rog.a.b()).g(1, java.util.concurrent.TimeUnit.MINUTES).l("com/android/dialer/main/impl/MainActivityPeer", "onPause$<anonymous>", 256, "MainActivityPeer.kt")).v("unregistered GrowthKit and HaTS callbacks");
                }
                defpackage.ajsz.ak(ahoqVarW, null);
                ahpmVarF.close();
            } catch (java.lang.Throwable th) {
                try {
                    throw th;
                } catch (java.lang.Throwable th2) {
                    defpackage.ajsz.ak(ahoqVarW, th);
                    throw th2;
                }
            }
        } catch (java.lang.Throwable th3) {
            try {
                ahpmVarF.close();
            } catch (java.lang.Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    @Override // defpackage.mp, android.app.Activity
    public final void onPictureInPictureModeChanged(boolean z, android.content.res.Configuration configuration) {
        defpackage.ahpm ahpmVarY = this.q.y();
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

    @Override // defpackage.da, android.app.Activity
    protected final void onPostCreate(android.os.Bundle bundle) {
        defpackage.ahpm ahpmVarZ = this.q.z();
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

    @Override // defpackage.da, defpackage.az, android.app.Activity
    protected final void onPostResume() {
        defpackage.ahpm ahpmVarG = this.q.g();
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

    @Override // android.app.Activity
    public final boolean onPrepareOptionsMenu(android.view.Menu menu) {
        defpackage.ahpm ahpmVarG = defpackage.ahns.g();
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

    @Override // defpackage.az, defpackage.mp, android.app.Activity
    public final void onRequestPermissionsResult(int i, java.lang.String[] strArr, int[] iArr) {
        defpackage.ahpm ahpmVarN = this.q.n("onRequestPermissionsResult", null);
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

    @Override // android.app.Activity
    protected final void onRestart() {
        defpackage.ahpm ahpmVarH = this.q.h();
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

    @Override // android.app.Activity
    protected final void onRestoreInstanceState(android.os.Bundle bundle) {
        super.onRestoreInstanceState(bundle);
        C();
        defpackage.aooh.f(bundle, "savedInstanceState");
    }

    @Override // defpackage.uxz, defpackage.az, android.app.Activity
    protected final void onResume() {
        defpackage.ahpm ahpmVarI = this.q.i();
        try {
            super.onResume();
            defpackage.rog rogVarC = C();
            defpackage.ahoq ahoqVarX = defpackage.ahvr.X(745, "MainActivityPeer_onResume", defpackage.ahot.a, true);
            try {
                rogVarC.i.j(defpackage.ruc.bV);
                rogVarC.k.d();
                if (rogVarC.c()) {
                    ((defpackage.aimw) defpackage.rog.a.b().l("com/android/dialer/main/impl/MainActivityPeer", "onResume$<anonymous>", 225, "MainActivityPeer.kt")).v("skipping GrowthKit and HaTS initialization on cover screen");
                } else {
                    rogVarC.q.z(rogVarC.o.g(rogVarC.b));
                    defpackage.aogc aogcVar = rogVarC.u;
                    ((defpackage.oqi) aogcVar.b).l = j$.util.Optional.of(aogcVar);
                    ((defpackage.aimw) defpackage.rog.a.b().l("com/android/dialer/main/impl/MainActivityPeer", "onResume$<anonymous>", 223, "MainActivityPeer.kt")).v("registered GrowthKit and HaTS callbacks");
                }
                ahoqVarX.close();
                ahpmVarI.close();
            } catch (java.lang.Throwable th) {
                try {
                    throw th;
                } catch (java.lang.Throwable th2) {
                    try {
                        ahoqVarX.close();
                    } catch (java.lang.Throwable th3) {
                        aoil.b(th, th3);
                    }
                    throw th2;
                }
            }
        } catch (java.lang.Throwable th4) {
            try {
                ahpmVarI.close();
            } catch (java.lang.Throwable th5) {
                th4.addSuppressed(th5);
            }
            throw th4;
        }
    }

    @Override // defpackage.uxz, defpackage.mp, defpackage.cm, android.app.Activity
    protected final void onSaveInstanceState(android.os.Bundle bundle) {
        defpackage.ahpm ahpmVarA = this.q.A();
        try {
            super.onSaveInstanceState(bundle);
            C();
            defpackage.aooh.f(bundle, "outState");
            ((defpackage.aimw) defpackage.rog.a.b().l("com/android/dialer/main/impl/MainActivityPeer", "onSaveInstanceState", 268, "MainActivityPeer.kt")).v("onSaveInstanceState enter");
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

    @Override // defpackage.uxz, defpackage.da, defpackage.az, android.app.Activity
    protected final void onStart() {
        defpackage.ahpm ahpmVarJ = this.q.j();
        try {
            super.onStart();
            C();
            defpackage.ahvr.X(746, "MainActivityPeer_onStart", defpackage.ahot.a, true).close();
            ahpmVarJ.close();
        } catch (java.lang.Throwable th) {
            try {
                ahpmVarJ.close();
            } catch (java.lang.Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.da, defpackage.az, android.app.Activity
    protected final void onStop() {
        defpackage.ahpm ahpmVarK = this.q.k();
        try {
            super.onStop();
            C().g.o(defpackage.rmx.MAIN_ACTIVITY_ON_STOP);
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

    @Override // android.app.Activity
    public final void onUserInteraction() {
        defpackage.ahpm ahpmVarM = this.q.m();
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

    @Override // defpackage.mp, android.app.Activity
    protected final void onUserLeaveHint() {
        super.onUserLeaveHint();
        C();
    }

    @Override // android.app.Activity, android.content.ContextWrapper, android.content.Context
    public final void startActivity(android.content.Intent intent) {
        defpackage.agab.aD(intent, getApplicationContext());
        super.startActivity(intent);
    }

    @Override // defpackage.aheh
    public final long w() {
        return this.t;
    }

    @Override // defpackage.ahei
    public final /* bridge */ /* synthetic */ java.lang.Object y() {
        defpackage.rog rogVar = this.p;
        if (rogVar == null) {
            throw new java.lang.IllegalStateException("peer() called before initialized.");
        }
        if (this.v) {
            throw new java.lang.IllegalStateException("peer() called after destroyed.");
        }
        return rogVar;
    }

    @Override // defpackage.rof
    public final /* synthetic */ defpackage.amxj z() {
        return new defpackage.ahgk(this);
    }

    @Override // android.app.Activity, android.content.ContextWrapper, android.content.Context
    public final void startActivity(android.content.Intent intent, android.os.Bundle bundle) {
        defpackage.agab.aD(intent, getApplicationContext());
        super.startActivity(intent, bundle);
    }

    @Override // defpackage.da
    protected final void m() {
    }

    @Override // defpackage.da
    protected final void n() {
    }
}
