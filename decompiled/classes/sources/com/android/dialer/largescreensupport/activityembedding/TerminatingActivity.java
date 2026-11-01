package com.android.dialer.largescreensupport.activityembedding;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class TerminatingActivity extends defpackage.rkj implements defpackage.ahei, defpackage.aheh, defpackage.ahfx {
    private rkm o;
    private boolean q;
    private android.content.Context r;
    private defpackage.emy t;
    private boolean u;
    private final defpackage.ahmw p = new defpackage.ahmw(this, this);
    private final long s = android.os.SystemClock.elapsedRealtime();

    public TerminatingActivity() {
        r(new rkk(this, 2));
    }

    @Override // defpackage.cm, defpackage.emx
    public final defpackage.ems P() {
        if (this.t == null) {
            this.t = new defpackage.ahfy(this);
        }
        return this.t;
    }

    @Override // android.view.ContextThemeWrapper
    public final void applyOverrideConfiguration(android.content.res.Configuration configuration) {
        android.content.Context baseContext = getBaseContext();
        if (baseContext == null) {
            baseContext = this.r;
        }
        defpackage.ahvr.b(baseContext);
        super.applyOverrideConfiguration(configuration);
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    protected final void attachBaseContext(android.content.Context context) {
        this.r = context;
        defpackage.ahvr.a(context);
        super.attachBaseContext(context);
        this.r = null;
    }

    @Override // android.app.Activity
    public final void finish() {
        defpackage.ahpm ahpmVarA = this.p.a();
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

    @Override // android.app.Activity
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

    @Override // defpackage.rkj
    public final /* synthetic */ defpackage.amxj j() {
        return new defpackage.ahgk(this);
    }

    public final void k() {
        if (this.o == null) {
            if (!this.q) {
                throw new java.lang.IllegalStateException("createPeer() called outside of onCreate");
            }
            if (this.u && !isFinishing()) {
                throw new java.lang.IllegalStateException("createPeer() called after destroyed.");
            }
            defpackage.ahoq ahoqVarW = defpackage.ahvr.W(728, "CreateComponent");
            try {
                B();
                ahoqVarW.close();
                defpackage.ahoq ahoqVarW2 = defpackage.ahvr.W(729, "CreatePeer");
                try {
                    this.o = ((defpackage.rkn) defpackage.agab.aC(this, defpackage.rkn.class)).t();
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

    @Override // defpackage.az, defpackage.mp, android.app.Activity
    protected final void onActivityResult(int i, int i2, android.content.Intent intent) {
        defpackage.ahpm ahpmVarT = this.p.t();
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
        defpackage.ahpm ahpmVarB = this.p.b();
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
        defpackage.ahpm ahpmVarC = this.p.c();
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

    @Override // defpackage.mp, android.app.Activity, android.content.ComponentCallbacks
    public final void onConfigurationChanged(android.content.res.Configuration configuration) {
        defpackage.ahpm ahpmVarN = this.p.n("onConfigurationChanged", null);
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

    @Override // defpackage.rkj, defpackage.az, defpackage.mp, defpackage.cm, android.app.Activity
    public final void onCreate(android.os.Bundle bundle) {
        defpackage.ahmw ahmwVar = this.p;
        defpackage.ahpm ahpmVarU = ahmwVar.u();
        try {
            this.q = true;
            ((defpackage.ahfy) P()).h(ahmwVar);
            super.onCreate(bundle);
            k();
            rkm rkmVar = this.o;
            ((defpackage.aimw) rkm.a.b().l("com/android/dialer/largescreensupport/activityembedding/TerminatingActivityPeer", "onCreate", 29, "TerminatingActivityPeer.kt")).v("enter");
            rkmVar.b.finish();
            this.q = false;
            ahmwVar.o();
            ahpmVarU.close();
        } catch (java.lang.Throwable th) {
            try {
                ahpmVarU.close();
            } catch (java.lang.Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.mp, android.app.Activity, android.view.Window.Callback
    public final boolean onCreatePanelMenu(int i, android.view.Menu menu) {
        defpackage.ahpm ahpmVarV = this.p.v();
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

    @Override // defpackage.rkj, defpackage.az, android.app.Activity
    public final void onDestroy() {
        defpackage.ahpm ahpmVarD = this.p.d();
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

    @Override // defpackage.az, defpackage.mp, android.app.Activity, android.view.Window.Callback
    public final boolean onMenuItemSelected(int i, android.view.MenuItem menuItem) {
        defpackage.ahpm ahpmVarW = this.p.w();
        try {
            boolean zOnMenuItemSelected = super.onMenuItemSelected(i, menuItem);
            ahpmVarW.close();
            return zOnMenuItemSelected;
        } catch (java.lang.Throwable th) {
            try {
                ahpmVarW.close();
            } catch (java.lang.Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.mp, android.app.Activity
    protected final void onNewIntent(android.content.Intent intent) {
        defpackage.ahpm ahpmVarE = this.p.e(intent);
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

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(android.view.MenuItem menuItem) {
        defpackage.ahpm ahpmVarX = this.p.x();
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
        defpackage.ahpm ahpmVarF = this.p.f();
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

    @Override // defpackage.mp, android.app.Activity
    public final void onPictureInPictureModeChanged(boolean z, android.content.res.Configuration configuration) {
        defpackage.ahpm ahpmVarY = this.p.y();
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

    @Override // android.app.Activity
    protected final void onPostCreate(android.os.Bundle bundle) {
        defpackage.ahpm ahpmVarZ = this.p.z();
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

    @Override // defpackage.az, android.app.Activity
    protected final void onPostResume() {
        defpackage.ahpm ahpmVarG = this.p.g();
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
        defpackage.ahpm ahpmVarN = this.p.n("onRequestPermissionsResult", null);
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
        defpackage.ahpm ahpmVarH = this.p.h();
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

    @Override // defpackage.az, android.app.Activity
    protected final void onResume() {
        defpackage.ahpm ahpmVarI = this.p.i();
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

    @Override // defpackage.mp, defpackage.cm, android.app.Activity
    protected final void onSaveInstanceState(android.os.Bundle bundle) {
        defpackage.ahpm ahpmVarA = this.p.A();
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

    @Override // defpackage.az, android.app.Activity
    protected final void onStart() {
        defpackage.ahpm ahpmVarJ = this.p.j();
        try {
            super.onStart();
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

    @Override // defpackage.az, android.app.Activity
    protected final void onStop() {
        defpackage.ahpm ahpmVarK = this.p.k();
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

    @Override // android.app.Activity
    public final void onUserInteraction() {
        defpackage.ahpm ahpmVarM = this.p.m();
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

    @Override // android.app.Activity, android.content.ContextWrapper, android.content.Context
    public final void startActivity(android.content.Intent intent) {
        defpackage.agab.aD(intent, getApplicationContext());
        super.startActivity(intent);
    }

    @Override // defpackage.aheh
    public final long w() {
        return this.s;
    }

    @Override // defpackage.ahei
    public final /* bridge */ /* synthetic */ java.lang.Object y() {
        rkm rkmVar = this.o;
        if (rkmVar == null) {
            throw new java.lang.IllegalStateException("peer() called before initialized.");
        }
        if (this.u) {
            throw new java.lang.IllegalStateException("peer() called after destroyed.");
        }
        return rkmVar;
    }

    @Override // android.app.Activity, android.content.ContextWrapper, android.content.Context
    public final void startActivity(android.content.Intent intent, android.os.Bundle bundle) {
        defpackage.agab.aD(intent, getApplicationContext());
        super.startActivity(intent, bundle);
    }
}
