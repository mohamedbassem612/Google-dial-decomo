package com.android.dialer.darpa.impl;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class AdvancedProtectionSpamBlockingUnusedActivity extends defpackage.mfa implements defpackage.ahei, defpackage.aheh, defpackage.ahfx {
    public boolean n;
    public boolean o;
    public defpackage.mni p;
    private android.content.Context s;
    private defpackage.emy u;
    private final defpackage.ahmw r = new defpackage.ahmw(this, this);
    private final long t = android.os.SystemClock.elapsedRealtime();

    public AdvancedProtectionSpamBlockingUnusedActivity() {
        r(new hso(this, 20));
    }

    @Override // defpackage.cm, defpackage.emx
    public final defpackage.ems P() {
        if (this.u == null) {
            this.u = new defpackage.ahfy(this);
        }
        return this.u;
    }

    @Override // defpackage.mp, defpackage.emn
    public final defpackage.eoq T() {
        defpackage.eos eosVar = new defpackage.eos(super.T());
        eosVar.b(defpackage.env.c, new android.os.Bundle());
        return eosVar;
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
        defpackage.ahvr.a(context);
        super.attachBaseContext(context);
        this.s = null;
    }

    @Override // android.app.Activity
    public final void finish() {
        defpackage.ahpm ahpmVarA = this.r.a();
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
        defpackage.ahpm ahpmVarL = this.r.l();
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

    @Override // defpackage.az, defpackage.mp, android.app.Activity
    protected final void onActivityResult(int i, int i2, android.content.Intent intent) {
        defpackage.ahpm ahpmVarT = this.r.t();
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
        defpackage.ahpm ahpmVarB = this.r.b();
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
        defpackage.ahpm ahpmVarC = this.r.c();
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
        defpackage.ahpm ahpmVarN = this.r.n("onConfigurationChanged", null);
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

    @Override // defpackage.mfa, defpackage.urd, defpackage.az, defpackage.mp, defpackage.cm, android.app.Activity
    protected final void onCreate(android.os.Bundle bundle) {
        defpackage.ahmw ahmwVar = this.r;
        defpackage.ahpm ahpmVarU = ahmwVar.u();
        try {
            this.n = true;
            ((defpackage.ahfy) P()).h(ahmwVar);
            super.onCreate(bundle);
            this.n = false;
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
        defpackage.ahpm ahpmVarV = this.r.v();
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

    @Override // defpackage.mfa, defpackage.da, defpackage.az, android.app.Activity
    protected final void onDestroy() {
        defpackage.ahpm ahpmVarD = this.r.d();
        try {
            super.onDestroy();
            this.o = true;
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

    @Override // defpackage.mp, android.app.Activity
    protected final void onNewIntent(android.content.Intent intent) {
        defpackage.ahpm ahpmVarE = this.r.e(intent);
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
        defpackage.ahpm ahpmVarX = this.r.x();
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
        defpackage.ahpm ahpmVarF = this.r.f();
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
        defpackage.ahpm ahpmVarY = this.r.y();
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
        defpackage.ahpm ahpmVarZ = this.r.z();
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
        defpackage.ahpm ahpmVarG = this.r.g();
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
        defpackage.ahpm ahpmVarN = this.r.n("onRequestPermissionsResult", null);
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
        defpackage.ahpm ahpmVarH = this.r.h();
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
        defpackage.ahpm ahpmVarI = this.r.i();
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
        defpackage.ahpm ahpmVarA = this.r.A();
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

    @Override // defpackage.da, defpackage.az, android.app.Activity
    protected final void onStart() {
        defpackage.ahpm ahpmVarJ = this.r.j();
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

    @Override // defpackage.da, defpackage.az, android.app.Activity
    protected final void onStop() {
        defpackage.ahpm ahpmVarK = this.r.k();
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
        defpackage.ahpm ahpmVarM = this.r.m();
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
        return this.t;
    }

    @Override // defpackage.mfa
    public final /* synthetic */ defpackage.amxj x() {
        return new defpackage.ahgk(this);
    }

    @Override // defpackage.ahei
    public final /* bridge */ /* synthetic */ java.lang.Object y() {
        defpackage.mni mniVar = this.p;
        if (mniVar == null) {
            throw new java.lang.IllegalStateException("peer() called before initialized.");
        }
        if (this.o) {
            throw new java.lang.IllegalStateException("peer() called after destroyed.");
        }
        return mniVar;
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
