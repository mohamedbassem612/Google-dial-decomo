package com.google.android.libraries.onegoogle.expresssignin;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class ExpressSignInLayout extends android.widget.FrameLayout {
    public defpackage.aekj a;
    public boolean b;
    private final defpackage.afpl c;

    public ExpressSignInLayout(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.c = new defpackage.afpl(this);
    }

    public final void a(final defpackage.aekm aekmVar, final defpackage.aekp aekpVar) {
        ahvr.bZ(!c(), "initialize() has to be called only once.");
        aesg aesgVar = aekpVar.b.h;
        android.content.Context context = getContext();
        aooh.f(context, "context");
        android.view.ContextThemeWrapper contextThemeWrapper = new android.view.ContextThemeWrapper(context, 2132083578);
        android.content.res.TypedArray typedArrayObtainStyledAttributes = contextThemeWrapper.getTheme().obtainStyledAttributes(new int[]{2130969602});
        try {
            boolean z = typedArrayObtainStyledAttributes.getBoolean(0, false);
            typedArrayObtainStyledAttributes.recycle();
            defpackage.aekj aekjVar = new defpackage.aekj(contextThemeWrapper, (defpackage.aeku) aekpVar.b.f.c(!z ? new fed(11) : new fed(10)));
            this.a = aekjVar;
            aekjVar.g = this.b;
            super.addView(aekjVar, -1, new android.view.ViewGroup.LayoutParams(-1, -1));
            b(new defpackage.aejv() { // from class: aeju
                @Override // defpackage.aejv
                public final void a(defpackage.aekj aekjVar2) {
                    java.lang.Object objCast;
                    java.lang.String str;
                    android.view.View.OnClickListener onClickListener;
                    defpackage.aejg aejgVar;
                    defpackage.aekm aekmVar2 = aekmVar;
                    aekjVar2.h = aekmVar2;
                    android.content.Context context2 = aekjVar2.getContext();
                    ahvr.cj(context2, "context cannot be null");
                    int i = 0;
                    while (true) {
                        if (i < 1000) {
                            if (nh.class.isInstance(context2)) {
                                objCast = nh.class.cast(context2);
                                break;
                            } else if (context2 instanceof android.content.ContextWrapper) {
                                context2 = ((android.content.ContextWrapper) context2).getBaseContext();
                                i++;
                            }
                        }
                        objCast = null;
                        break;
                    }
                    defpackage.aekp aekpVar2 = aekpVar;
                    nh nhVar = (nh) objCast;
                    ahvr.bN(nhVar != null, "Express Sign In's onBackPressedDispatcherOwner has to be set or one of the context baseContexts should be a OnBackPressedDispatcherOwner");
                    aekjVar2.x = nhVar;
                    defpackage.aeks aeksVar = aekpVar2.b;
                    ahyn ahynVar = aeksVar.b;
                    aekjVar2.s = (android.widget.Button) aekjVar2.findViewById(2131427860);
                    aekjVar2.t = (android.widget.Button) aekjVar2.findViewById(2131428903);
                    aekjVar2.u = new defpackage.aejm(aekjVar2.t);
                    aekjVar2.v = new defpackage.aejm(aekjVar2.s);
                    defpackage.aelt aeltVar = aekmVar2.c;
                    aeltVar.d(aekjVar2);
                    aekjVar2.b(aeltVar);
                    aekjVar2.e = aeksVar.g;
                    ahyn ahynVar2 = aeksVar.d;
                    if (ahynVar2.f()) {
                        ahynVar2.b();
                        android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(-2, -1);
                        layoutParams.gravity = 17;
                        android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) aekjVar2.findViewById(2131428212);
                        android.content.Context context3 = aekjVar2.getContext();
                        android.widget.ImageView imageView = new android.widget.ImageView(context3);
                        imageView.setImageDrawable(den.bO(context3, true != defpackage.aejk.a(context3) ? 2131231273 : 2131231275));
                        frameLayout.addView(imageView, layoutParams);
                        frameLayout.setVisibility(0);
                    }
                    ahyn ahynVar3 = aeksVar.e;
                    ahyn ahynVar4 = aeksVar.a;
                    aekjVar2.w = null;
                    defpackage.aekq aekqVar = aekjVar2.w;
                    ahyn ahynVar5 = aeksVar.c;
                    aekjVar2.z = aeksVar.i;
                    if (ahynVar2.f()) {
                        android.widget.Button button = aekjVar2.n;
                        ((android.view.ViewGroup.MarginLayoutParams) button.getLayoutParams()).topMargin = aekjVar2.getResources().getDimensionPixelSize(2131167274);
                        button.requestLayout();
                        android.view.View viewFindViewById = aekjVar2.findViewById(2131428145);
                        ((android.view.ViewGroup.MarginLayoutParams) viewFindViewById.getLayoutParams()).topMargin = 0;
                        viewFindViewById.requestLayout();
                    }
                    defpackage.aekq aekqVar2 = aekjVar2.w;
                    boolean z2 = aekjVar2.d;
                    aekjVar2.j.setOnClickListener(new defpackage.wgf(aekjVar2, aeltVar, 7));
                    com.google.android.libraries.onegoogle.accountmanagement.SelectedAccountView selectedAccountView = aekjVar2.m;
                    defpackage.wsk wskVar = aekmVar2.f;
                    defpackage.aehm aehmVar = aekmVar2.d.a;
                    aeis aeisVarS = aeis.a().s();
                    defpackage.aejw aejwVar = new defpackage.aejw(aekjVar2, 0);
                    java.lang.String string = aekjVar2.getResources().getString(2132019584);
                    java.lang.String string2 = aekjVar2.getResources().getString(2132019589);
                    selectedAccountView.p = aeisVarS;
                    selectedAccountView.i();
                    selectedAccountView.t = new defpackage.alln(selectedAccountView, aehmVar, aeisVarS);
                    selectedAccountView.j.d(wskVar, aehmVar);
                    selectedAccountView.q = string;
                    selectedAccountView.r = string2;
                    selectedAccountView.s = aejwVar;
                    selectedAccountView.o = false;
                    selectedAccountView.k.setRotation(360.0f);
                    selectedAccountView.j(false);
                    defpackage.aejx aejxVar = new defpackage.aejx(aekjVar2, aekmVar2);
                    aekjVar2.getContext();
                    ahwt ahwtVar = ahwt.a;
                    if (aehmVar == null) {
                        throw new java.lang.NullPointerException("Null accountConverter");
                    }
                    aeiv aeivVar = aekmVar2.a;
                    if (aeivVar == null) {
                        throw new java.lang.NullPointerException("Null accountsModel");
                    }
                    if (wskVar == null) {
                        throw new java.lang.NullPointerException("Null avatarImageLoader");
                    }
                    defpackage.aele aeleVar = aekmVar2.b;
                    if (aeleVar == null) {
                        throw new java.lang.NullPointerException("Null oneGoogleEventLogger");
                    }
                    defpackage.aeiy aeiyVar = new defpackage.aeiy(wskVar, aehmVar, aeivVar, aeleVar, ahwtVar, ahwtVar);
                    new aesg(aekjVar2);
                    defpackage.alfm alfmVarA = defpackage.aekj.a();
                    int i2 = aekjVar2.i.c;
                    defpackage.aejd aejdVar = new defpackage.aejd(aeiyVar, aejxVar, alfmVarA, aeltVar, i2, aeis.a().s());
                    android.content.Context context4 = aekjVar2.getContext();
                    defpackage.aprf aprfVar = new defpackage.aprf(aekjVar2);
                    android.content.Context context5 = aekjVar2.getContext();
                    android.os.UserManager userManager = (android.os.UserManager) context5.getSystemService("user");
                    if (userManager == null || !userManager.hasUserRestriction("no_modify_accounts")) {
                        defpackage.aejf aejfVar = new defpackage.aejf();
                        aejfVar.a(2131428601);
                        aejfVar.c = -1;
                        aejfVar.h = (byte) (aejfVar.h | 2);
                        aejfVar.b(-1);
                        aejfVar.a(2131428599);
                        android.graphics.drawable.Drawable drawableBO = den.bO(context5, 2131231981);
                        ahvr.ci(drawableBO);
                        aejfVar.b = drawableBO;
                        java.lang.String string3 = context5.getString(2132019581);
                        if (string3 == null) {
                            throw new java.lang.NullPointerException("Null label");
                        }
                        aejfVar.d = string3;
                        aejfVar.f = new defpackage.wtm(aprfVar, 13);
                        aejfVar.b(90141);
                        if ((aejfVar.h & 1) == 0) {
                            throw new java.lang.IllegalStateException("Property \"id\" has not been set");
                        }
                        ahvr.bZ(aejfVar.a != 2131428601, "Did you forget to setId()?");
                        if ((aejfVar.h & 4) == 0) {
                            throw new java.lang.IllegalStateException("Property \"veId\" has not been set");
                        }
                        ahvr.bZ(aejfVar.e != -1, "Did you forget to setVeId()?");
                        if ((aejfVar.h & 2) == 0) {
                            throw new java.lang.IllegalStateException("Property \"iconResId\" has not been set");
                        }
                        ahvr.bZ((aejfVar.c != -1) ^ (aejfVar.b != null), "Either icon id or icon drawable must be specified");
                        if (aejfVar.h != 7 || (str = aejfVar.d) == null || (onClickListener = aejfVar.f) == null) {
                            java.lang.StringBuilder sb = new java.lang.StringBuilder();
                            if ((aejfVar.h & 1) == 0) {
                                sb.append(" id");
                            }
                            if ((aejfVar.h & 2) == 0) {
                                sb.append(" iconResId");
                            }
                            if (aejfVar.d == null) {
                                sb.append(" label");
                            }
                            if ((aejfVar.h & 4) == 0) {
                                sb.append(" veId");
                            }
                            if (aejfVar.f == null) {
                                sb.append(" onClickListener");
                            }
                            throw new java.lang.IllegalStateException("Missing required properties:".concat(sb.toString()));
                        }
                        aejgVar = new defpackage.aejg(aejfVar.a, aejfVar.b, aejfVar.c, str, aejfVar.e, onClickListener, aejfVar.g);
                    } else {
                        aejgVar = null;
                    }
                    defpackage.aejp aejpVar = new defpackage.aejp(context4, aejgVar == null ? aike.a : aify.p(aejgVar), aeltVar, i2);
                    defpackage.aekj.l(aekjVar2.k, aejdVar);
                    defpackage.aekj.l(aekjVar2.l, aejpVar);
                    aekjVar2.c(aejdVar, aejpVar);
                    defpackage.aekd aekdVar = new defpackage.aekd(aekjVar2, aejdVar, aejpVar);
                    aejdVar.u(aekdVar);
                    aejpVar.u(aekdVar);
                    aekjVar2.s.setOnClickListener(new mar(aekjVar2, aeltVar, aekpVar2, aekmVar2, 4));
                    aekjVar2.n.setOnClickListener(new mar(aekjVar2, aeltVar, aekmVar2, new defpackage.aelu(aekjVar2, aekpVar2), 3));
                    eca ecaVar = new eca(aekjVar2, aekmVar2, 3);
                    aekjVar2.addOnAttachStateChangeListener(ecaVar);
                    gk gkVar = new gk(aekjVar2, 4);
                    aekjVar2.addOnAttachStateChangeListener(gkVar);
                    int i3 = dzs.a;
                    if (aekjVar2.isAttachedToWindow()) {
                        ecaVar.onViewAttachedToWindow(aekjVar2);
                        gkVar.onViewAttachedToWindow(aekjVar2);
                    }
                    aekjVar2.h(false);
                }
            });
            defpackage.afpl afplVar = this.c;
            ahvr.bZ(((com.google.android.libraries.onegoogle.expresssignin.ExpressSignInLayout) afplVar.b).c(), "Object was not initialized");
            aesg.i(new defpackage.absj(afplVar, 15));
        } catch (java.lang.Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(final android.view.View view, final int i, final android.view.ViewGroup.LayoutParams layoutParams) {
        b(new defpackage.aejv() { // from class: aejt
            @Override // defpackage.aejv
            public final void a(defpackage.aekj aekjVar) {
                aekjVar.addView(view, i, layoutParams);
            }
        });
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, java.util.Queue] */
    public final void b(defpackage.aejv aejvVar) {
        defpackage.aawj aawjVar = new defpackage.aawj(this, aejvVar, 20, null);
        afec.c();
        defpackage.afpl afplVar = this.c;
        afplVar.a.add(aawjVar);
        if (((com.google.android.libraries.onegoogle.expresssignin.ExpressSignInLayout) afplVar.b).c()) {
            afplVar.k();
        }
    }

    public final boolean c() {
        return this.a != null;
    }

    public ExpressSignInLayout(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ExpressSignInLayout(android.content.Context context) {
        this(context, null);
    }
}
