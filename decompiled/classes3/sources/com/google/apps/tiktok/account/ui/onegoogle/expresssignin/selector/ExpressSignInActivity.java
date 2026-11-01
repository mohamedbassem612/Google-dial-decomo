package com.google.apps.tiktok.account.ui.onegoogle.expresssignin.selector;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class ExpressSignInActivity extends defpackage.agrf implements ahei, aheh, ahfx {
    private defpackage.agrc o;
    private boolean q;
    private android.content.Context r;
    private emy t;
    private boolean u;
    private final ahmw p = new ahmw(this, this);
    private final long s = android.os.SystemClock.elapsedRealtime();

    /* JADX WARN: Multi-variable type inference failed */
    public ExpressSignInActivity() {
        r(new defpackage.vwa(this, 6));
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

    @Override // defpackage.agrf
    protected final void onCreate(android.os.Bundle bundle) {
        ahmw ahmwVar = this.p;
        ahpm ahpmVarU = ahmwVar.u();
        try {
            this.q = true;
            P().h(ahmwVar);
            super.onCreate(bundle);
            z();
            defpackage.agrc agrcVar = this.o;
            boolean z = agrcVar.c;
            boolean z2 = agrcVar.d;
            com.google.apps.tiktok.account.ui.onegoogle.expresssignin.selector.ExpressSignInActivity expressSignInActivity = agrcVar.a;
            expressSignInActivity.setContentView(2131624210);
            expressSignInActivity.setFinishOnTouchOutside(false);
            if (expressSignInActivity.a().d(2131428299) == null) {
                u uVar = new u(expressSignInActivity.a());
                defpackage.agrh agrhVar = new defpackage.agrh();
                amxr.g(agrhVar);
                uVar.e(2131428299, agrhVar, (java.lang.String) null, 1);
                uVar.c();
            }
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

    @Override // defpackage.agrf
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

    @Override // defpackage.agrf
    public final /* synthetic */ amxj x() {
        return new ahgk(this);
    }

    public final /* bridge */ /* synthetic */ java.lang.Object y() {
        defpackage.agrc agrcVar = this.o;
        if (agrcVar == null) {
            throw new java.lang.IllegalStateException("peer() called before initialized.");
        }
        if (this.u) {
            throw new java.lang.IllegalStateException("peer() called after destroyed.");
        }
        return agrcVar;
    }

    public final void z() {
        if (this.o == null) {
            if (!this.q) {
                throw new java.lang.IllegalStateException("createPeer() called outside of onCreate");
            }
            if (this.u && !isFinishing()) {
                throw new java.lang.IllegalStateException("createPeer() called after destroyed.");
            }
            ahoq ahoqVarW = ahvr.W(1307, "CreateComponent");
            try {
                B();
                ahoqVarW.close();
                ahoq ahoqVarW2 = ahvr.W(1308, "CreatePeer");
                try {
                    this.o = ((agrd) agab.aC(this, agrd.class)).H();
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
