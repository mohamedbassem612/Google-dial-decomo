package com.google.android.dialershared.precall.impl;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class PrecallActivity extends defpackage.zsm implements ahei, aheh, ahfx {
    private defpackage.zso o;
    private boolean q;
    private android.content.Context r;
    private emy t;
    private boolean u;
    private final ahmw p = new ahmw(this, this);
    private final long s = android.os.SystemClock.elapsedRealtime();

    /* JADX WARN: Multi-variable type inference failed */
    public PrecallActivity() {
        r(new defpackage.vwa(this, 4));
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

    @Override // defpackage.zsm
    public final /* synthetic */ amxj j() {
        return new ahgk(this);
    }

    public final void k() {
        if (this.o == null) {
            if (!this.q) {
                throw new java.lang.IllegalStateException("createPeer() called outside of onCreate");
            }
            if (this.u && !isFinishing()) {
                throw new java.lang.IllegalStateException("createPeer() called after destroyed.");
            }
            ahoq ahoqVarW = ahvr.W(1237, "CreateComponent");
            try {
                B();
                ahoqVarW.close();
                ahoq ahoqVarW2 = ahvr.W(1238, "CreatePeer");
                try {
                    this.o = ((zsp) agab.aC(this, zsp.class)).G();
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
    @Override // defpackage.zsm
    protected final void onCreate(android.os.Bundle bundle) {
        defpackage.zrx zrxVarL;
        ahmw ahmwVar = this.p;
        ahpm ahpmVarU = ahmwVar.u();
        try {
            this.q = true;
            P().h(ahmwVar);
            super.onCreate(bundle);
            k();
            defpackage.zso zsoVar = this.o;
            j$.util.Optional optional = zsoVar.c;
            defpackage.xch xchVar = new defpackage.xch(zsoVar, 16);
            optional.isPresent();
            ((gou) optional.get()).l(((defpackage.zso) xchVar.a).b);
            if (bundle == null) {
                try {
                    zrxVarL = defpackage.akmr.l(zsoVar.b.getIntent(), "CALL_PARAMETER_EXTRA", defpackage.zrx.a, akzq.a());
                } catch (alaz e) {
                    a.by(defpackage.zso.a.c(), "Failed to parse CallParameter", "com/google/android/dialershared/precall/impl/PrecallActivityPeer", "getCallParameter", ']', "PrecallActivityPeer.java", e);
                    zrxVarL = defpackage.zrx.a;
                }
                defpackage.zss zssVar = new defpackage.zss();
                amxr.g(zssVar);
                ahgl.b(zssVar, zrxVarL);
                com.google.android.dialershared.precall.impl.PrecallActivity precallActivity = zsoVar.b;
                ((aw) zssVar).m.putInt("ACTION_POSITION_KEY", precallActivity.getIntent().getIntExtra("REQUIRES_UI_AT_POSITION_EXTRA", 0));
                u uVar = new u(precallActivity.a());
                uVar.e(android.R.id.content, zssVar, "PRECALL_FRAGMENT_TAG", 1);
                uVar.c();
            }
            ahvr.w(this).a = findViewById(android.R.id.content);
            ahvr.c(this, defpackage.zsl.class, new defpackage.wtl(this.o, 14));
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

    @Override // defpackage.zsm
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

    public final boolean onMenuItemSelected(int i, android.view.MenuItem menuItem) {
        ahpm ahpmVarW = this.p.w();
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

    public final /* bridge */ /* synthetic */ java.lang.Object y() {
        defpackage.zso zsoVar = this.o;
        if (zsoVar == null) {
            throw new java.lang.IllegalStateException("peer() called before initialized.");
        }
        if (this.u) {
            throw new java.lang.IllegalStateException("peer() called after destroyed.");
        }
        return zsoVar;
    }

    public final void startActivity(android.content.Intent intent, android.os.Bundle bundle) {
        agab.aD(intent, getApplicationContext());
        super.startActivity(intent, bundle);
    }
}
