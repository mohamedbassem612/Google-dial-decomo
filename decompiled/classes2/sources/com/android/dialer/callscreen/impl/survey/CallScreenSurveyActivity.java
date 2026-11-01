package com.android.dialer.callscreen.impl.survey;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class CallScreenSurveyActivity extends defpackage.llj implements ahei, aheh, ahfx {
    private defpackage.llb o;
    private boolean q;
    private android.content.Context r;
    private emy t;
    private boolean u;
    private final ahmw p = new ahmw(this, this);
    private final long s = android.os.SystemClock.elapsedRealtime();

    /* JADX WARN: Multi-variable type inference failed */
    public CallScreenSurveyActivity() {
        r(new defpackage.hso(this, 14));
    }

    private final defpackage.llb C() {
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

    @Override // defpackage.llj
    protected final void onCreate(android.os.Bundle bundle) {
        java.lang.String group;
        ahmw ahmwVar = this.p;
        ahpm ahpmVarU = ahmwVar.u();
        try {
            this.q = true;
            P().h(ahmwVar);
            super.onCreate(bundle);
            defpackage.llb llbVarC = C();
            defpackage.llb.a.b().l("com/android/dialer/callscreen/impl/survey/CallScreenSurveyActivityPeer", "onCreate", 62, "CallScreenSurveyActivityPeer.java").v("Creating call screen survey activity");
            defpackage.oq oqVar = llbVarC.d;
            com.android.dialer.callscreen.impl.survey.CallScreenSurveyActivity callScreenSurveyActivity = llbVarC.b;
            java.lang.Object obj = oqVar.a;
            ahvr.bM(true);
            ((rwj) obj).c.h();
            rwi rwiVar = ((rwj) obj).b;
            aify aifyVarC = rwiVar.c();
            int size = aifyVarC.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    group = null;
                    break;
                }
                android.service.notification.StatusBarNotification statusBarNotification = (android.service.notification.StatusBarNotification) aifyVarC.get(i);
                if (android.text.TextUtils.equals("feedback_notification_tag", statusBarNotification.getTag()) && statusBarNotification.getId() == 1) {
                    group = statusBarNotification.getNotification().getGroup();
                    break;
                }
                i++;
            }
            if (!android.text.TextUtils.isEmpty(group)) {
                int size2 = aifyVarC.size();
                android.service.notification.StatusBarNotification statusBarNotification2 = null;
                int i2 = 0;
                for (int i3 = 0; i3 < size2; i3++) {
                    android.service.notification.StatusBarNotification statusBarNotification3 = (android.service.notification.StatusBarNotification) aifyVarC.get(i3);
                    if (android.text.TextUtils.equals(group, statusBarNotification3.getNotification().getGroup())) {
                        if ((statusBarNotification3.getNotification().flags & 512) != 0) {
                            statusBarNotification2 = statusBarNotification3;
                        } else {
                            i2++;
                        }
                    }
                }
                android.util.Pair pair = new android.util.Pair(statusBarNotification2, java.lang.Integer.valueOf(i2));
                if (pair.first != null && ((java.lang.Integer) pair.second).intValue() <= 1) {
                    rwj.a.b().l("com/android/dialer/notification/DialerNotificationManagerSync", "cancel", 79, "DialerNotificationManagerSync.java").y("last notification in group (%s) removed, also removing group summary", group);
                    rwiVar.j(((android.service.notification.StatusBarNotification) pair.first).getTag(), ((android.service.notification.StatusBarNotification) pair.first).getId());
                }
            }
            rwiVar.j("feedback_notification_tag", 1);
            android.content.Intent intent = callScreenSurveyActivity.getIntent();
            if (!intent.hasExtra("call_screen_survey_activity_intent_extra_call_screen_survey_args") || intent.getByteArrayExtra("call_screen_survey_activity_intent_extra_call_screen_survey_args") == null) {
                a.bI(defpackage.llb.a.c().m(aioa.b), "no call screen survey args included in intent", "com/android/dialer/callscreen/impl/survey/CallScreenSurveyActivityPeer", "onCreate", 'J', "CallScreenSurveyActivityPeer.java", zct.b);
                llbVarC.b.finish();
            } else {
                try {
                    llbVarC.c = (defpackage.lld) alad.B(defpackage.lld.b, intent.getByteArrayExtra("call_screen_survey_activity_intent_extra_call_screen_survey_args"), akzq.a());
                    u uVar = new u(llbVarC.b.a());
                    defpackage.lld lldVar = llbVarC.c;
                    defpackage.llf llfVar = new defpackage.llf();
                    amxr.g(llfVar);
                    ahgl.b(llfVar, lldVar);
                    uVar.q(android.R.id.content, llfVar, (java.lang.String) null);
                    uVar.c();
                } catch (alaz e) {
                    a.bq(defpackage.llb.a.c(), "Unable to parse call screen survey args", "com/android/dialer/callscreen/impl/survey/CallScreenSurveyActivityPeer", "onCreate", 'Y', "CallScreenSurveyActivityPeer.java", e, zct.b);
                    llbVarC.b.finish();
                }
            }
            this.q = false;
            this.p.o();
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

    @Override // defpackage.llj
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

    protected final void onStart() {
        ahpm ahpmVarJ = this.p.j();
        try {
            super.onStart();
            defpackage.llb llbVarC = C();
            defpackage.llb.a.b().l("com/android/dialer/callscreen/impl/survey/CallScreenSurveyActivityPeer", "onStart", 103, "CallScreenSurveyActivityPeer.java").v("Starting call screen survey activity");
            android.view.Window window = llbVarC.b.getWindow();
            if (android.os.Build.VERSION.SDK_INT < 35) {
                ft$.ExternalSyntheticApiModelOutline0.m(window, 0);
                window.setNavigationBarColor(0);
                window.setStatusBarColor(0);
            }
            window.addFlags(512);
            window.setBackgroundDrawable(new android.graphics.drawable.ColorDrawable(0));
            android.view.WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.dimAmount = 0.5f;
            attributes.flags |= 2;
            window.setAttributes(attributes);
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

    @Override // defpackage.llj
    public final /* synthetic */ amxj x() {
        return new ahgk(this);
    }

    public final /* bridge */ /* synthetic */ java.lang.Object y() {
        defpackage.llb llbVar = this.o;
        if (llbVar == null) {
            throw new java.lang.IllegalStateException("peer() called before initialized.");
        }
        if (this.u) {
            throw new java.lang.IllegalStateException("peer() called after destroyed.");
        }
        return llbVar;
    }

    public final void z() {
        if (this.o == null) {
            if (!this.q) {
                throw new java.lang.IllegalStateException("createPeer() called outside of onCreate");
            }
            if (this.u && !isFinishing()) {
                throw new java.lang.IllegalStateException("createPeer() called after destroyed.");
            }
            ahoq ahoqVarW = ahvr.W(304, "CreateComponent");
            try {
                B();
                ahoqVarW.close();
                ahoq ahoqVarW2 = ahvr.W(305, "CreatePeer");
                try {
                    this.o = ((llc) agab.aC(this, llc.class)).h();
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
