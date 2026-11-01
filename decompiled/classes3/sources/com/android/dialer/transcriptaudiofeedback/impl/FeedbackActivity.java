package com.android.dialer.transcriptaudiofeedback.impl;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class FeedbackActivity extends defpackage.uwe implements ahei, aheh, ahfx {
    private defpackage.uvd o;
    private boolean q;
    private android.content.Context r;
    private emy t;
    private boolean u;
    private final ahmw p = new ahmw(this, this);
    private final long s = android.os.SystemClock.elapsedRealtime();

    /* JADX WARN: Multi-variable type inference failed */
    public FeedbackActivity() {
        r(new defpackage.rkk(this, 14));
    }

    private final defpackage.uvd C() {
        z();
        return this.o;
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

    @Override // defpackage.uwe
    protected final void onCreate(android.os.Bundle bundle) {
        int iAP;
        ahmw ahmwVar = this.p;
        ahpm ahpmVarU = ahmwVar.u();
        final boolean z = true;
        try {
            this.q = true;
            P().h(ahmwVar);
            super.onCreate(bundle);
            final defpackage.uvd uvdVarC = C();
            defpackage.uvd.a.b().l("com/android/dialer/transcriptaudiofeedback/impl/FeedbackActivityPeer", "onCreate", 81, "FeedbackActivityPeer.java").v("Activity created");
            com.android.dialer.transcriptaudiofeedback.impl.FeedbackActivity feedbackActivity = uvdVarC.b;
            feedbackActivity.setContentView(2131624223);
            android.content.Intent intent = feedbackActivity.getIntent();
            ahvr.bZ(intent.hasExtra("feedback_activity_intent_extra_feedback_ui_info"), "no feedback ui info in the intent");
            try {
                uvdVarC.e = (defpackage.utu) alad.B(defpackage.utu.a, intent.getByteArrayExtra("feedback_activity_intent_extra_feedback_ui_info"), akzq.a());
                ahfx ahfxVar = uvdVarC.b;
                u uVar = new u(ahfxVar.a());
                defpackage.utu utuVar = uvdVarC.e;
                defpackage.uvl uvlVar = new defpackage.uvl();
                amxr.g(uvlVar);
                ahgl.b(uvlVar, utuVar);
                uVar.q(2131428256, uvlVar, (java.lang.String) null);
                uVar.c();
                uvdVarC.f = (com.android.dialer.widget.DialerToolbar) ahfxVar.findViewById(2131428248);
                android.support.v7.widget.Toolbar toolbar = uvdVarC.f;
                izf izfVar = new izf(11);
                int i = dzs.a;
                dzk.o(toolbar, izfVar);
                int i2 = uvdVarC.e.f;
                int iAP2 = a.aP(i2);
                if ((iAP2 == 0 || iAP2 != 4) && ((iAP = a.aP(i2)) == 0 || iAP != 5)) {
                    z = false;
                }
                uvdVarC.f.u(new android.view.View.OnClickListener() { // from class: uvc
                    @Override // android.view.View.OnClickListener
                    public final void onClick(android.view.View view) {
                        boolean z2 = z;
                        defpackage.uvd uvdVar = uvdVarC;
                        if (!z2) {
                            java.lang.String str = uvdVar.e.e;
                            defpackage.uwp uwpVar = uvdVar.d;
                            defpackage.uwp.a.b().l("com/android/dialer/transcriptaudiofeedback/impl/metrics/FeedbackMetricsLogger", "logUserCanceledFromTranscriptView", 93, "FeedbackMetricsLogger.java").v("logging user closed feedback from transcript view");
                            uwpVar.b(str, new defpackage.uwm(2));
                            uwpVar.a(str);
                            uvdVar.c.k(uvdVar.g.a(uvdVar.e.c));
                        }
                        com.android.dialer.transcriptaudiofeedback.impl.FeedbackActivity feedbackActivity2 = uvdVar.b;
                        feedbackActivity2.finish();
                        feedbackActivity2.overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);
                    }
                });
                defpackage.abwd abwdVar = uvdVarC.e.d;
                if (abwdVar == null) {
                    abwdVar = defpackage.abwd.a;
                }
                java.lang.String str = abwdVar.c;
                defpackage.utu utuVar2 = uvdVarC.e;
                defpackage.abwd abwdVar2 = utuVar2.d;
                if (abwdVar2 == null) {
                    abwdVar2 = defpackage.abwd.a;
                }
                java.lang.String str2 = abwdVar2.d;
                java.lang.String dateTime = android.text.format.DateUtils.formatDateTime(ahfxVar, utuVar2.c, 17);
                if (str.isEmpty()) {
                    uvdVarC.f.x(str2);
                    uvdVarC.f.w(dateTime);
                } else {
                    uvdVarC.f.x(str);
                    uvdVarC.f.w(a.br(dateTime, str2, " • "));
                }
                this.q = false;
                this.p.o();
                ahpmVarU.close();
            } catch (alaz e) {
                throw new java.lang.AssertionError("Unable to parse feedback ui info", e);
            }
        } catch (java.lang.Throwable th) {
            try {
                ahpmVarU.close();
            } catch (java.lang.Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
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

    @Override // defpackage.uwe
    protected final void onDestroy() {
        ahpm ahpmVarD = this.p.d();
        try {
            super.onDestroy();
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

    protected final void onResume() {
        ahpm ahpmVarI = this.p.i();
        try {
            super.onResume();
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

    /* JADX WARN: Type inference failed for: r6v3, types: [android.content.Context, com.android.dialer.transcriptaudiofeedback.impl.FeedbackActivity] */
    protected final void onStart() {
        ahpm ahpmVarJ = this.p.j();
        try {
            super.onStart();
            defpackage.uvd uvdVarC = C();
            defpackage.uvd.a.b().l("com/android/dialer/transcriptaudiofeedback/impl/FeedbackActivityPeer", "onStart", 109, "FeedbackActivityPeer.java").v("Activity started");
            ?? r6 = uvdVarC.b;
            ft$.ExternalSyntheticApiModelOutline0.m(r6.getWindow(), 0);
            r6.getWindow().setNavigationBarColor(urg.c((android.content.Context) r6, android.R.attr.colorBackground));
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

    protected final void onStop() {
        ahpm ahpmVarK = this.p.k();
        try {
            super.onStop();
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

    @Override // defpackage.uwe
    public final /* synthetic */ amxj x() {
        return new ahgk(this);
    }

    public final /* bridge */ /* synthetic */ java.lang.Object y() {
        defpackage.uvd uvdVar = this.o;
        if (uvdVar == null) {
            throw new java.lang.IllegalStateException("peer() called before initialized.");
        }
        if (this.u) {
            throw new java.lang.IllegalStateException("peer() called after destroyed.");
        }
        return uvdVar;
    }

    public final void z() {
        if (this.o == null) {
            if (!this.q) {
                throw new java.lang.IllegalStateException("createPeer() called outside of onCreate");
            }
            if (this.u && !isFinishing()) {
                throw new java.lang.IllegalStateException("createPeer() called after destroyed.");
            }
            ahoq ahoqVarW = ahvr.W(944, "CreateComponent");
            try {
                B();
                ahoqVarW.close();
                ahoq ahoqVarW2 = ahvr.W(945, "CreatePeer");
                try {
                    this.o = ((uve) agab.aC(this, uve.class)).B();
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

    public final void startActivity(android.content.Intent intent, android.os.Bundle bundle) {
        agab.aD(intent, getApplicationContext());
        super.startActivity(intent, bundle);
    }

    protected final void m() {
    }

    protected final void n() {
    }
}
