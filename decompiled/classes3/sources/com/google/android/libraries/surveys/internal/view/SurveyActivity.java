package com.google.android.libraries.surveys.internal.view;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public class SurveyActivity extends da implements defpackage.aflw {
    public defpackage.aflv n;
    private final na o = new defpackage.aflr(this);

    @Override // defpackage.afls
    public final boolean aW() {
        return false;
    }

    @Override // defpackage.afls
    public final boolean aX() {
        return this.n.m();
    }

    @Override // defpackage.afkl
    public final void aY() {
        this.n.j(false);
    }

    @Override // defpackage.afls
    public final void c() {
        this.n.e();
    }

    @Override // defpackage.afls
    public final void f() {
        android.widget.ImageButton imageButton = (android.widget.ImageButton) this.n.b(2131429155);
        if (imageButton != null) {
            imageButton.setVisibility(8);
        }
    }

    /* JADX WARN: Code duplicated, block: B:108:0x02e3  */
    /* JADX WARN: Code duplicated, block: B:123:0x030b  */
    /* JADX WARN: Code duplicated, block: B:138:0x0334  */
    /* JADX WARN: Code duplicated, block: B:57:0x013f  */
    /* JADX WARN: Multi-variable type inference failed */
    protected final void onCreate(android.os.Bundle bundle) {
        defpackage.amip amipVar;
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        java.lang.String str4;
        super.onCreate(bundle);
        defpackage.aflv aflvVar = new defpackage.aflv(this, a(), this);
        this.n = aflvVar;
        android.content.Context context = afjy.b;
        android.app.Activity activity = aflvVar.u;
        if (context == null) {
            activity.finish();
        } else {
            android.content.Intent intent = activity.getIntent();
            if (intent.getBooleanExtra("IsDismissing", false)) {
                activity.finish();
            } else {
                activity.setTitle("");
                java.lang.String stringExtra = intent.getStringExtra("TriggerId");
                java.io.Serializable serializableExtra = null;
                aflvVar.c = null;
                aflvVar.b = null;
                aehj aehjVar = afjy.c;
                if (afjy.b(ankz.c(afjy.b))) {
                    byte[] byteArrayExtra = intent.getByteArrayExtra("SurveyPayload");
                    if (byteArrayExtra != null) {
                        aflvVar.b = afjz.c(defpackage.amip.a, byteArrayExtra);
                    }
                    byte[] byteArrayExtra2 = intent.getByteArrayExtra("SurveySession");
                    if (byteArrayExtra2 != null) {
                        aflvVar.c = afjz.c(amje.a, byteArrayExtra2);
                    }
                } else {
                    aflvVar.b = afjz.c(defpackage.amip.a, intent.getByteArrayExtra("SurveyPayload"));
                    aflvVar.c = afjz.c(amje.a, intent.getByteArrayExtra("SurveySession"));
                }
                if (bundle != null) {
                    aflvVar.e = (com.google.android.libraries.surveys.internal.model.Answer) bundle.getParcelable("Answer");
                    aflvVar.j = bundle.getBoolean("IsSubmitting");
                    aflvVar.f = bundle.getBundle("SingleSelectOrdinalAnswerMappings");
                    if (aflvVar.f == null) {
                        aflvVar.f = new android.os.Bundle();
                    }
                } else {
                    aflvVar.e = (com.google.android.libraries.surveys.internal.model.Answer) intent.getParcelableExtra("Answer");
                    aflvVar.j = intent.getBooleanExtra("IsSubmitting", false);
                }
                aflvVar.s = intent.getBooleanExtra("IgnoreFirstQuestion", false);
                aflvVar.m = intent.getBooleanExtra("keepNextButtonForLastQuestion", false);
                aflvVar.n = intent.getBooleanExtra("isCarDisplayFullyReachable", true);
                aflvVar.o = intent.getBooleanExtra("isCarDisplayRightOfUser", true);
                aflvVar.r = intent.hasExtra("LogoResId") ? java.lang.Integer.valueOf(intent.getIntExtra("LogoResId", 0)) : null;
                if (stringExtra == null || (amipVar = aflvVar.b) == null || amipVar.g.size() == 0 || aflvVar.e == null || aflvVar.c == null) {
                    android.util.Log.e("SurveyActivityImpl", "Required EXTRAS not found in the intent, bailing out.");
                    activity.finish();
                } else {
                    defpackage.amil amilVar = aflvVar.b.c;
                    if (amilVar == null) {
                        amilVar = defpackage.amil.a;
                    }
                    boolean z = amilVar.b || aflvVar.s;
                    if (afjy.d()) {
                        afjj afjjVarC = aflvVar.c();
                        if (afjjVarC != null) {
                            if (bundle == null) {
                                if (z) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                            }
                            aehj.b.q(afjjVarC);
                        }
                    } else {
                        if (bundle == null) {
                            if (z) {
                                z = true;
                            } else {
                                z = false;
                            }
                        }
                        aehj.b.p();
                    }
                    long j = afjz.a;
                    aflvVar.x = new defpackage.wyw(activity, stringExtra, aflvVar.c);
                    activity.getTheme().applyStyle(2132085218, false);
                    activity.setContentView(2131624633);
                    aflvVar.g = (android.widget.ScrollView) aflvVar.b(2131429162);
                    aflvVar.i = (android.widget.LinearLayout) aflvVar.b(2131429156);
                    aflvVar.h = (com.google.android.material.card.MaterialCardView) aflvVar.b(2131429172);
                    if (android.os.Build.VERSION.SDK_INT >= 35) {
                        final android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) aflvVar.b(2131428283);
                        defpackage.afkc afkcVar = defpackage.afkc.d;
                        defpackage.afkc[] afkcVarArr = {afkcVar};
                        aooh.f(frameLayout, "view");
                        final boolean zCY = ajsz.cY(afkcVarArr, defpackage.afkc.a);
                        final boolean zCY2 = ajsz.cY(afkcVarArr, defpackage.afkc.c);
                        final boolean zCY3 = ajsz.cY(afkcVarArr, defpackage.afkc.b);
                        final boolean zCY4 = ajsz.cY(afkcVarArr, afkcVar);
                        aooh.f(frameLayout, "view");
                        frameLayout.setFitsSystemWindows(false);
                        android.widget.FrameLayout frameLayout2 = true != (frameLayout instanceof android.view.ViewGroup) ? null : frameLayout;
                        if (frameLayout2 != null) {
                            frameLayout2.setClipToPadding(false);
                        }
                        final dwn dwnVarD = dwn.d(frameLayout.getPaddingLeft(), frameLayout.getPaddingTop(), frameLayout.getPaddingRight(), frameLayout.getPaddingBottom());
                        dyy dyyVar = new dyy() { // from class: afkb
                            public final eax dC(android.view.View view, eax eaxVar) {
                                aooh.f(view, "<unused var>");
                                boolean z2 = zCY;
                                dwn dwnVarF = eaxVar.f(655);
                                int i = z2 ? dwnVarF.b : 0;
                                int i2 = zCY2 ? dwnVarF.c : 0;
                                int i3 = zCY3 ? dwnVarF.d : 0;
                                int i4 = zCY4 ? dwnVarF.e : 0;
                                android.view.View view2 = frameLayout;
                                dwn dwnVar = dwnVarD;
                                dwn dwnVarD2 = dwn.d(i, i2, i3, i4);
                                int i5 = dwnVarD2.b;
                                int i6 = dwnVarD2.c;
                                int i7 = dwnVarD2.d;
                                int i8 = dwnVarD2.e;
                                dwn dwnVarD3 = dwn.d(dwnVar.b + i5, dwnVar.c + i6, dwnVar.d + i7, dwnVar.e + i8);
                                view2.setPadding(dwnVarD3.b, dwnVarD3.c, dwnVarD3.d, dwnVarD3.e);
                                return eaxVar.o(i5, i6, i7, i8);
                            }
                        };
                        int i = dzs.a;
                        dzk.o(frameLayout, dyyVar);
                        if (frameLayout.isAttachedToWindow()) {
                            frameLayout.requestApplyInsets();
                        } else {
                            frameLayout.addOnAttachStateChangeListener(new defpackage.afkd());
                        }
                    }
                    android.widget.FrameLayout.LayoutParams layoutParams = (android.widget.FrameLayout.LayoutParams) aflvVar.g.getLayoutParams();
                    android.widget.FrameLayout.LayoutParams layoutParams2 = (android.widget.FrameLayout.LayoutParams) aflvVar.h.getLayoutParams();
                    if (defpackage.afjs.d(aflvVar.g.getContext())) {
                        if (!aflvVar.n) {
                            layoutParams.width = aflvVar.g.getContext().getResources().getDimensionPixelOffset(2131167816);
                            layoutParams.gravity = true != aflvVar.o ? 85 : 83;
                        }
                        layoutParams2.width = -2;
                    } else {
                        layoutParams2.width = defpackage.afjs.a(aflvVar.h.getContext());
                    }
                    aflvVar.g.setLayoutParams(layoutParams);
                    aflvVar.h.setLayoutParams(layoutParams2);
                    aflvVar.g.setFocusable(false);
                    java.lang.String str5 = android.text.TextUtils.isEmpty(aflvVar.e.b) ? null : aflvVar.e.b;
                    android.widget.ImageButton imageButton = (android.widget.ImageButton) aflvVar.b(2131429155);
                    imageButton.setImageDrawable(aehj.K(activity));
                    imageButton.setOnClickListener(new defpackage.wgf(aflvVar, str5, 16));
                    aflvVar.l = intent.getIntExtra("StartingQuestionIndex", 1);
                    boolean zM = aflvVar.m();
                    activity.getLayoutInflater().inflate(2131624634, aflvVar.i);
                    aehj aehjVar2 = afjy.c;
                    if (afjy.b(anlc.d(afjy.b))) {
                        aflvVar.j(zM);
                    } else if (!zM) {
                        aflvVar.j(false);
                    }
                    if (z) {
                        aflvVar.p();
                        str4 = str5;
                    } else {
                        defpackage.aflu afluVar = new defpackage.aflu(aflvVar, str5, 0);
                        defpackage.amim amimVar = aflvVar.b.i;
                        if (amimVar == null) {
                            amimVar = defpackage.amim.a;
                        }
                        if ((amimVar.b & 1) == 0) {
                            str = null;
                        } else {
                            defpackage.amim amimVar2 = aflvVar.b.i;
                            if (amimVar2 == null) {
                                amimVar2 = defpackage.amim.a;
                            }
                            if (amimVar2.c.length() > 0) {
                                defpackage.amim amimVar3 = aflvVar.b.i;
                                if (amimVar3 == null) {
                                    amimVar3 = defpackage.amim.a;
                                }
                                str = amimVar3.c;
                            } else {
                                str = null;
                            }
                        }
                        defpackage.amim amimVar4 = aflvVar.b.i;
                        if (((amimVar4 == null ? defpackage.amim.a : amimVar4).b & 2) == 0) {
                            str2 = null;
                        } else {
                            if (amimVar4 == null) {
                                amimVar4 = defpackage.amim.a;
                            }
                            if (amimVar4.d.length() > 0) {
                                defpackage.amim amimVar5 = aflvVar.b.i;
                                if (amimVar5 == null) {
                                    amimVar5 = defpackage.amim.a;
                                }
                                str2 = amimVar5.d;
                            } else {
                                str2 = null;
                            }
                        }
                        defpackage.amim amimVar6 = aflvVar.b.i;
                        if (((amimVar6 == null ? defpackage.amim.a : amimVar6).b & 4) == 0) {
                            str3 = null;
                        } else {
                            if (amimVar6 == null) {
                                amimVar6 = defpackage.amim.a;
                            }
                            if (amimVar6.e.length() > 0) {
                                defpackage.amim amimVar7 = aflvVar.b.i;
                                if (amimVar7 == null) {
                                    amimVar7 = defpackage.amim.a;
                                }
                                str3 = amimVar7.e;
                            } else {
                                str3 = null;
                            }
                        }
                        str4 = str5;
                        aehj.H(activity, (android.widget.TextView) aflvVar.b(2131429159), str4, str, str2, str3, afluVar);
                    }
                    if (android.os.Build.VERSION.SDK_INT >= 34) {
                        serializableExtra = intent.getSerializableExtra("SurveyCompletionStyle", defpackage.afiz.class);
                    } else {
                        java.io.Serializable serializableExtra2 = intent.getSerializableExtra("SurveyCompletionStyle");
                        if (defpackage.afiz.class.isInstance(serializableExtra2)) {
                            serializableExtra = serializableExtra2;
                        }
                    }
                    aflvVar.t = (defpackage.afiz) serializableExtra;
                    defpackage.afiz afizVar = aflvVar.t;
                    bo boVar = aflvVar.w;
                    defpackage.amip amipVar2 = aflvVar.b;
                    java.lang.Integer num = aflvVar.r;
                    boolean z2 = aflvVar.s;
                    defpackage.afmc afmcVar = new defpackage.afmc(boVar, amipVar2, num, z2, aehj.y(z2, amipVar2, aflvVar.e), afizVar, aflvVar.l);
                    aflvVar.d = (com.google.android.libraries.surveys.internal.view.SurveyViewPager) aflvVar.b(2131429206);
                    com.google.android.libraries.surveys.internal.view.SurveyViewPager surveyViewPager = aflvVar.d;
                    surveyViewPager.t = aflvVar.v;
                    surveyViewPager.l(afmcVar);
                    aflvVar.d.setImportantForAccessibility(2);
                    if (bundle != null) {
                        aflvVar.d.m(bundle.getInt("CurrentQuestionIndexForViewPager"));
                    }
                    if (zM) {
                        aflvVar.k();
                    }
                    aflvVar.i.setVisibility(0);
                    aflvVar.i.forceLayout();
                    if (aflvVar.s) {
                        aflvVar.h();
                        aflvVar.l();
                        aflvVar.o(5);
                    }
                    if (zM) {
                        ((com.google.android.material.button.MaterialButton) aflvVar.b(2131429166)).setOnClickListener(new defpackage.wgf(aflvVar, str4, 17));
                    }
                    android.view.Window window = activity.getWindow();
                    window.addFlags(2);
                    window.clearFlags(32);
                    window.addFlags(262144);
                    window.setDimAmount(0.4f);
                    aflvVar.b(2131429155).setVisibility(0);
                    com.google.android.libraries.surveys.internal.view.SurveyViewPager surveyViewPager2 = aflvVar.d;
                    if (surveyViewPager2 != null && surveyViewPager2.C()) {
                        defpackage.amil amilVar2 = aflvVar.b.c;
                        if (amilVar2 == null) {
                            amilVar2 = defpackage.amil.a;
                        }
                        if (!amilVar2.b) {
                            aflvVar.o(2);
                        }
                    }
                    if (intent.hasExtra("IsPausing")) {
                        com.google.android.material.button.MaterialButton materialButton = (com.google.android.material.button.MaterialButton) aflvVar.b(2131429166);
                        if (materialButton != null) {
                            aflvVar.k = materialButton.isEnabled();
                        }
                        aflvVar.g(intent.getBooleanExtra("IsPausing", false));
                    }
                }
            }
        }
        fc().d(this, this.o);
    }

    protected final void onDestroy() {
        super.onDestroy();
        defpackage.aflv aflvVar = this.n;
        if (afjy.b != null) {
            if (afjy.d()) {
                afjj afjjVarC = aflvVar.c();
                if (aflvVar.u.isFinishing() && afjjVarC != null) {
                    aehj.b.o(afjjVarC);
                }
            } else if (aflvVar.u.isFinishing()) {
                aehj.b.n();
            }
            aflvVar.p.removeCallbacks(aflvVar.q);
        }
    }

    protected final void onNewIntent(android.content.Intent intent) {
        super.onNewIntent(intent);
        defpackage.aflv aflvVar = this.n;
        if (intent.getBooleanExtra("IsDismissing", false)) {
            aflvVar.u.finish();
        }
        if (intent.hasExtra("IsPausing")) {
            aflvVar.g(intent.getBooleanExtra("IsPausing", false));
        }
    }

    protected final void onSaveInstanceState(android.os.Bundle bundle) {
        super.onSaveInstanceState(bundle);
        defpackage.aflv aflvVar = this.n;
        aehj aehjVar = afjy.c;
        if (afjy.b(anlc.d(afjy.b))) {
            com.google.android.libraries.surveys.internal.view.SurveyViewPager surveyViewPager = aflvVar.d;
            bundle.putInt("CurrentQuestionIndexForViewPager", surveyViewPager != null ? ((androidx.viewpager.widget.ViewPager) surveyViewPager).d : 0);
        } else {
            bundle.putInt("CurrentQuestionIndexForViewPager", aflvVar.a());
        }
        bundle.putBoolean("IsSubmitting", aflvVar.j);
        bundle.putParcelable("Answer", aflvVar.e);
        bundle.putBundle("SingleSelectOrdinalAnswerMappings", aflvVar.f);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean onTouchEvent(android.view.MotionEvent motionEvent) {
        aehj aehjVar = afjy.c;
        boolean zC = ankq.c(this);
        defpackage.aflv aflvVar = this.n;
        if (!zC) {
            return aflvVar.n(motionEvent);
        }
        if (aflvVar.n(motionEvent)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // defpackage.afkl
    public final void p() {
        this.n.f();
    }

    @Override // defpackage.afkm
    public final void q(boolean z, aw awVar) {
        defpackage.aflv aflvVar = this.n;
        if (aflvVar.j || defpackage.afmc.k(awVar) != ((androidx.viewpager.widget.ViewPager) aflvVar.d).d) {
            return;
        }
        aflvVar.i(z);
    }

    @Override // defpackage.afkl
    public final void t(boolean z) {
        this.n.i(z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.aflw
    public final android.app.Activity b() {
        return this;
    }
}
