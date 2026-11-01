package com.android.dialer.featuredemo;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class FeatureDemoActivity extends defpackage.olo implements ahei, aheh, ahfx {
    private defpackage.oll o;
    private boolean q;
    private android.content.Context r;
    private emy t;
    private boolean u;
    private final ahmw p = new ahmw(this, this);
    private final long s = android.os.SystemClock.elapsedRealtime();

    /* JADX WARN: Multi-variable type inference failed */
    public FeatureDemoActivity() {
        r(new defpackage.mey(this, 3));
    }

    private final defpackage.oll C() {
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

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.lang.CharSequence, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v44, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v26, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // defpackage.olo
    protected final void onCreate(android.os.Bundle bundle) {
        ols uyeVar;
        ahmw ahmwVar = this.p;
        ahpm ahpmVarU = ahmwVar.u();
        try {
            this.q = true;
            P().h(ahmwVar);
            super.onCreate(bundle);
            defpackage.oll ollVarC = C();
            mp mpVar = ollVarC.i;
            int intExtra = mpVar.getIntent().getIntExtra("requested_orientation", 1);
            if (ollVarC.m.a(mpVar) || mpVar.isInMultiWindowMode()) {
                mpVar.setRequestedOrientation(2);
            } else {
                mpVar.setRequestedOrientation(intExtra);
            }
            mpVar.setContentView(2131624222);
            try {
                byte[] byteArrayExtra = mpVar.getIntent().getByteArrayExtra("feature_demo_ui_config");
                ahvr.ci(byteArrayExtra);
                defpackage.oln olnVar = (defpackage.oln) alad.B(defpackage.oln.a, byteArrayExtra, akzq.a());
                int iAN = a.aN(olnVar.c);
                if (iAN == 0) {
                    iAN = 1;
                }
                int i = iAN - 1;
                if (i == 1) {
                    ollVarC.j.o(rmx.gM);
                    j$.util.Optional optionalG = ollVarC.o.g();
                    if (!optionalG.isPresent()) {
                        int iAN2 = a.aN(olnVar.c);
                        if (iAN2 == 0) {
                            iAN2 = 1;
                        }
                        throw new java.lang.AssertionError(java.lang.String.format("Demo %s is absent", pez.ax(iAN2)));
                    }
                    uyeVar = ((tkl) optionalG.orElseThrow()).b;
                } else if (i == 2) {
                    ollVarC.j.o(rmx.gN);
                    j$.util.Optional optional = ollVarC.h;
                    optional.isPresent();
                    uyeVar = (ols) optional.orElseThrow();
                } else {
                    if (i != 3) {
                        int iAN3 = a.aN(olnVar.c);
                        if (iAN3 == 0) {
                            iAN3 = 1;
                        }
                        throw new java.lang.AssertionError(java.lang.String.format("Unsupported demo type: %s", pez.ax(iAN3)));
                    }
                    zjm zjmVar = ollVarC.n;
                    if (!zjmVar.g().isPresent()) {
                        int iAN4 = a.aN(olnVar.c);
                        if (iAN4 == 0) {
                            iAN4 = 1;
                        }
                        throw new java.lang.AssertionError(java.lang.String.format("Demo %s is absent", pez.ax(iAN4)));
                    }
                    try {
                        byte[] byteArrayExtra2 = ollVarC.i.getIntent().getByteArrayExtra("video_calling_tech");
                        ahvr.ci(byteArrayExtra2);
                        uyl uylVarB = alad.B(uyl.a, byteArrayExtra2, akzq.a());
                        java.lang.Object obj = ((vqf) zjmVar.g().orElseThrow()).a;
                        android.content.Context context = (android.content.Context) ((uyg) obj).b.a();
                        context.getClass();
                        uylVarB.getClass();
                        rlv rlvVar = (rlv) ((uyg) obj).a.a();
                        rlvVar.getClass();
                        uyeVar = new uye(context, uylVarB, rlvVar);
                    } catch (alaz e) {
                        throw new java.lang.IllegalStateException("Unable to parse video calling tech", e);
                    }
                }
                ollVarC.a = uyeVar;
                com.android.dialer.featuredemo.FeatureDemoActivity featureDemoActivity = ollVarC.i;
                android.support.v7.widget.Toolbar toolbarFindViewById = featureDemoActivity.findViewById(2131429294);
                ollVarC.b = (com.airbnb.lottie.LottieAnimationView) featureDemoActivity.findViewById(2131427938);
                ollVarC.c = (androidx.viewpager.widget.ViewPager) featureDemoActivity.findViewById(2131427940);
                com.google.android.material.tabs.TabLayout tabLayoutFindViewById = featureDemoActivity.findViewById(2131428651);
                ollVarC.d = (android.widget.ImageButton) featureDemoActivity.findViewById(2131428719);
                ollVarC.e = (android.widget.ImageButton) featureDemoActivity.findViewById(2131428582);
                ollVarC.f = (android.widget.Button) featureDemoActivity.findViewById(2131428061);
                ollVarC.g = (android.widget.Button) featureDemoActivity.findViewById(2131428961);
                toolbarFindViewById.x(ollVarC.a.h());
                j$.util.Optional optionalC = ollVarC.a.c();
                int i2 = 8;
                if (optionalC.isPresent()) {
                    ollVarC.b.setVisibility(0);
                    ollVarC.b.i(((defpackage.olr) optionalC.orElseThrow()).a);
                    j$.util.Optional optional2 = ((defpackage.olr) optionalC.orElseThrow()).b;
                    com.airbnb.lottie.LottieAnimationView lottieAnimationView = ollVarC.b;
                    j$.util.Objects.requireNonNull(lottieAnimationView);
                    defpackage.lwx lwxVar = new defpackage.lwx(lottieAnimationView, 18);
                    if (true == optional2.isPresent()) {
                        ((com.airbnb.lottie.LottieAnimationView) lwxVar.a).m((java.lang.String) optional2.get());
                    }
                } else {
                    ollVarC.b.setVisibility(8);
                }
                ollVarC.c.l(new defpackage.olj(ollVarC, featureDemoActivity.a()));
                tabLayoutFindViewById.n(ollVarC.c, false);
                android.view.ViewGroup viewGroup = (android.view.ViewGroup) tabLayoutFindViewById.getChildAt(0);
                int i3 = 0;
                while (i3 < viewGroup.getChildCount()) {
                    viewGroup.getChildAt(i3).setClickable(false);
                    android.view.View childAt = viewGroup.getChildAt(i3);
                    i3++;
                    childAt.setContentDescription(featureDemoActivity.getString(2132017198, new java.lang.Object[]{java.lang.Integer.valueOf(i3)}));
                }
                android.graphics.drawable.Drawable drawable = featureDemoActivity.getDrawable(2131232027);
                ahvr.ci(drawable);
                android.graphics.drawable.Drawable drawableMutate = drawable.mutate();
                drawableMutate.setAutoMirrored(true);
                ollVarC.d.setImageDrawable(drawableMutate);
                ollVarC.d.setOnClickListener(new defpackage.nti(ollVarC, 5));
                android.graphics.drawable.Drawable drawable2 = featureDemoActivity.getDrawable(2131232028);
                ahvr.ci(drawable2);
                android.graphics.drawable.Drawable drawableMutate2 = drawable2.mutate();
                drawableMutate2.setAutoMirrored(true);
                ollVarC.e.setImageDrawable(drawableMutate2);
                ollVarC.e.setOnClickListener(new defpackage.nti(ollVarC, 6));
                ollVarC.f.setOnClickListener(new defpackage.nti(ollVarC, 7));
                j$.util.Optional optionalE = ollVarC.a.e();
                android.widget.Button button = ollVarC.f;
                j$.util.Objects.requireNonNull(button);
                defpackage.lwx lwxVar2 = new defpackage.lwx(button, 19);
                if (true == optionalE.isPresent()) {
                    ((android.widget.TextView) lwxVar2.a).setText((java.lang.CharSequence) optionalE.get());
                }
                ollVarC.g.setOnClickListener(new defpackage.nti(ollVarC, i2));
                int i4 = bundle != null ? bundle.getInt("current_page_index") : 0;
                ollVarC.l = i4;
                ollVarC.c.m(i4);
                ollVarC.c(ollVarC.l);
                ollVarC.c.g(new defpackage.olk(ollVarC));
                this.q = false;
                ahmwVar.o();
                ahpmVarU.close();
            } catch (alaz e2) {
                throw new java.lang.AssertionError("Unable to parse feature demo UI config", e2);
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

    @Override // defpackage.olo
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
            defpackage.oll ollVarC = C();
            ollVarC.a.i(ollVarC.l);
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
            defpackage.oll ollVarC = C();
            int i = ollVarC.c.d;
            ollVarC.d(i, i);
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
            bundle.putInt("current_page_index", C().c.d);
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

    @Override // defpackage.olo
    public final /* synthetic */ amxj x() {
        return new ahgk(this);
    }

    public final /* bridge */ /* synthetic */ java.lang.Object y() {
        defpackage.oll ollVar = this.o;
        if (ollVar == null) {
            throw new java.lang.IllegalStateException("peer() called before initialized.");
        }
        if (this.u) {
            throw new java.lang.IllegalStateException("peer() called after destroyed.");
        }
        return ollVar;
    }

    public final void z() {
        if (this.o == null) {
            if (!this.q) {
                throw new java.lang.IllegalStateException("createPeer() called outside of onCreate");
            }
            if (this.u && !isFinishing()) {
                throw new java.lang.IllegalStateException("createPeer() called after destroyed.");
            }
            ahoq ahoqVarW = ahvr.W(407, "CreateComponent");
            try {
                B();
                ahoqVarW.close();
                ahoq ahoqVarW2 = ahvr.W(408, "CreatePeer");
                try {
                    this.o = ((olm) agab.aC(this, olm.class)).j();
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
