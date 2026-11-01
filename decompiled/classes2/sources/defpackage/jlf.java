package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class jlf extends defpackage.jkm implements ahei, aheg, ahgg, ahph {
    private defpackage.jlm ak;
    private android.content.Context al;
    private boolean an;
    private boolean ao;
    private final emy am = new emy(this, true);
    private final ajwa ap = new ajwa(this);

    @java.lang.Deprecated
    public jlf() {
        afec.c();
    }

    public static defpackage.jlf aX(defpackage.jlw jlwVar) {
        defpackage.jlf jlfVar = new defpackage.jlf();
        amxr.g(jlfVar);
        ahgl.b(jlfVar, jlwVar);
        return jlfVar;
    }

    public final android.view.View M(android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        this.ap.j();
        try {
            final defpackage.jlm jlmVarY = y();
            aooh.f(layoutInflater, "inflater");
            android.view.View viewInflate = layoutInflater.inflate(2131624415, viewGroup, false);
            ahpr ahprVar = new ahpr(jlmVarY.e, 155, "scam_context_selector_dialog_fragment_apply_window_insets_compat", new defpackage.izf(2));
            int i = dzs.a;
            dzk.o(viewInflate, ahprVar);
            afsq.T(jlmVarY.g.a(jlmVarY.a().e), new aonj() { // from class: jli
                /* JADX WARN: Type inference failed for: r2v31, types: [android.view.View, com.android.dialer.blockreportspam.ScamFeedbackChipView] */
                public final java.lang.Object a(java.lang.Object obj) {
                    java.lang.String str;
                    int i2;
                    int i3;
                    defpackage.jlp jlpVar = (defpackage.jlp) obj;
                    aooh.f(jlpVar, "uiState");
                    defpackage.jlm jlmVar = jlmVarY;
                    defpackage.jlf jlfVar = jlmVar.c;
                    android.view.View viewRequireViewById = jlfVar.c().requireViewById(2131427944);
                    aooh.e(viewRequireViewById, "requireViewById(...)");
                    android.view.ViewGroup viewGroup2 = (android.view.ViewGroup) viewRequireViewById;
                    glh glhVar = new glh((byte[]) null);
                    glhVar.U(0);
                    glhVar.V(viewGroup2);
                    glhVar.W(new android.view.animation.LinearInterpolator());
                    glhVar.T(300L);
                    wsc.be(viewGroup2, glhVar);
                    defpackage.jms jmsVar = jlpVar.a;
                    int i4 = jmsVar.a;
                    java.util.List list = jmsVar.b;
                    int i5 = jmsVar.c;
                    defpackage.jmu jmuVarB = defpackage.jmu.b(jlmVar.b.f);
                    if (jmuVarB == null) {
                        jmuVarB = defpackage.jmu.SCAM_SELECTOR_QUESTION_KEY_UNSPECIFIED;
                    }
                    defpackage.jlv jlvVar = new defpackage.jlv(jlfVar, i4, list, i5, jmuVarB, jlpVar.b, jlpVar);
                    final afqz afqzVar = jlvVar.a;
                    int i6 = jlvVar.c;
                    final android.view.View viewN = afqzVar.N();
                    ft$.ExternalSyntheticApiModelOutline0.m(viewN, 2131428738).setProgress(i6);
                    com.google.android.material.chip.ChipGroup chipGroupM = ft$.ExternalSyntheticApiModelOutline0.m(viewN, 2131428865);
                    aooh.e(chipGroupM, "requireViewById(...)");
                    com.google.android.material.chip.ChipGroup chipGroup = chipGroupM;
                    aopq aopqVarC = aooc.C(0, chipGroup.getChildCount());
                    java.util.ArrayList arrayList = new java.util.ArrayList(ajsz.bl(aopqVarC, 10));
                    aopp aoppVarA = aopqVarC.a();
                    while (true) {
                        str = "null cannot be cast to non-null type com.google.android.material.chip.Chip";
                        if (!aoppVarA.a) {
                            break;
                        }
                        com.google.android.material.chip.Chip childAt = chipGroup.getChildAt(aoppVarA.a());
                        aooh.d(childAt, "null cannot be cast to non-null type com.google.android.material.chip.Chip");
                        arrayList.add(childAt);
                    }
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    java.util.Iterator it = arrayList.iterator();
                    while (true) {
                        i2 = 2131428978;
                        if (!it.hasNext()) {
                            break;
                        }
                        java.lang.Object next = it.next();
                        com.google.android.material.chip.Chip chip = (com.google.android.material.chip.Chip) next;
                        if (chip.getId() != 2131428978 && chip.getId() != 2131428589) {
                            arrayList2.add(next);
                        }
                    }
                    java.util.Iterator it2 = arrayList2.iterator();
                    while (it2.hasNext()) {
                        chipGroup.removeView((com.google.android.material.chip.Chip) it2.next());
                    }
                    com.google.android.material.chip.Chip chipM = ft$.ExternalSyntheticApiModelOutline0.m(viewN, 2131428978);
                    aooh.e(chipM, "requireViewById(...)");
                    final com.google.android.material.chip.Chip chip2 = chipM;
                    chip2.setText(afqzVar.A().getString(2132020183));
                    chip2.setChecked(false);
                    final aoot aootVar = new aoot();
                    aootVar.a = new android.view.View.OnLayoutChangeListener() { // from class: jlu
                        @Override // android.view.View.OnLayoutChangeListener
                        public final void onLayoutChange(android.view.View view, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14) {
                            afqz afqzVar2 = afqzVar;
                            com.google.android.material.chip.Chip chip3 = chip2;
                            if (aooh.n(chip3.getText(), afqzVar2.A().getString(2132020183))) {
                                aoot aootVar2 = aootVar;
                                android.view.View view2 = viewN;
                                chip3.setMaxWidth(chip3.getWidth());
                                view2.removeOnLayoutChangeListener((android.view.View.OnLayoutChangeListener) aootVar2.a);
                            }
                        }
                    };
                    viewN.addOnLayoutChangeListener((android.view.View.OnLayoutChangeListener) aootVar.a);
                    ft$.ExternalSyntheticApiModelOutline0.m(viewN, 2131428589).setChecked(false);
                    defpackage.jlp jlpVar2 = jlvVar.f;
                    if (jlpVar2 != null) {
                        android.widget.TextView textView = (android.widget.TextView) ft$.ExternalSyntheticApiModelOutline0.m(viewN, 2131429295);
                        defpackage.jms jmsVar2 = jlpVar2.a;
                        textView.setText(jmsVar2.a);
                        com.google.android.material.chip.ChipGroup chipGroupM2 = ft$.ExternalSyntheticApiModelOutline0.m(viewN, 2131428865);
                        aooh.e(chipGroupM2, "requireViewById(...)");
                        com.google.android.material.chip.ChipGroup chipGroup2 = chipGroupM2;
                        java.util.Iterator it3 = jmsVar2.b.iterator();
                        while (it3.hasNext()) {
                            int iIntValue = ((java.lang.Number) it3.next()).intValue();
                            java.lang.Object objInflate = android.view.View.inflate(afqzVar.z(), 2131624414, null);
                            aooh.d(objInflate, "null cannot be cast to non-null type com.android.dialer.blockreportspam.ScamFeedbackChipView");
                            ?? r2 = (com.android.dialer.blockreportspam.ScamFeedbackChipView) objInflate;
                            r2.setText(iIntValue);
                            chipGroup2.addView((android.view.View) r2, 0);
                        }
                        ft$.ExternalSyntheticApiModelOutline0.m(viewN, 2131428978).setText(jlpVar2.d.length() > 0 ? jlpVar2.d : afqzVar.A().getString(2132020183));
                        i3 = 2131428865;
                    } else {
                        i3 = 2131428865;
                    }
                    com.google.android.material.chip.ChipGroup chipGroupM3 = ft$.ExternalSyntheticApiModelOutline0.m(viewN, i3);
                    aooh.e(chipGroupM3, "requireViewById(...)");
                    com.google.android.material.chip.ChipGroup chipGroup3 = chipGroupM3;
                    int childCount = chipGroup3.getChildCount();
                    int i7 = 0;
                    while (i7 < childCount) {
                        com.google.android.material.chip.Chip childAt2 = chipGroup3.getChildAt(i7);
                        aooh.d(childAt2, str);
                        com.google.android.material.chip.Chip chip3 = childAt2;
                        int i8 = i2;
                        com.google.android.material.chip.ChipGroup chipGroup4 = chipGroup3;
                        chip3.setOnClickListener(new defpackage.mar(chip3, chipGroup4, jlvVar, viewN, 1));
                        i7++;
                        i2 = i8;
                        chipGroup3 = chipGroup4;
                        str = str;
                    }
                    java.lang.String str2 = str;
                    chipGroup3.b = new rai(viewN);
                    com.google.android.material.chip.Chip chipM2 = ft$.ExternalSyntheticApiModelOutline0.m(viewN, i2);
                    aooh.e(chipM2, "requireViewById(...)");
                    com.google.android.material.chip.Chip chip4 = chipM2;
                    chip4.d = new defpackage.gfe(chip4, 3);
                    if (jlpVar2 != null) {
                        com.google.android.material.chip.ChipGroup chipGroupM4 = ft$.ExternalSyntheticApiModelOutline0.m(viewN, 2131428865);
                        aooh.e(chipGroupM4, "requireViewById(...)");
                        com.google.android.material.chip.ChipGroup chipGroup5 = chipGroupM4;
                        int childCount2 = chipGroup5.getChildCount();
                        for (int i9 = 0; i9 < childCount2; i9++) {
                            com.google.android.material.chip.Chip childAt3 = chipGroup5.getChildAt(i9);
                            aooh.d(childAt3, str2);
                            com.google.android.material.chip.Chip chip5 = childAt3;
                            if (jlpVar2.c.contains(chip5.getText().toString())) {
                                chip5.setChecked(true);
                            }
                        }
                    }
                    int i10 = true == jlmVar.a().b() ? 8 : 0;
                    int i11 = true != jlmVar.a().c() ? 2132019478 : 2132020278;
                    ((android.widget.Button) ft$.ExternalSyntheticApiModelOutline0.m(jlfVar.c(), 2131428576)).setText(2132017489);
                    ((android.widget.Button) ft$.ExternalSyntheticApiModelOutline0.m(jlfVar.c(), 2131428576)).setVisibility(i10);
                    ((android.widget.Button) ft$.ExternalSyntheticApiModelOutline0.m(jlfVar.c(), 2131428709)).setText(i11);
                    com.google.android.material.chip.ChipGroup chipGroupM5 = ft$.ExternalSyntheticApiModelOutline0.m(jlfVar.c(), 2131428865);
                    aooh.e(chipGroupM5, "requireViewById(...)");
                    ((android.widget.Button) ft$.ExternalSyntheticApiModelOutline0.m(jlfVar.c(), 2131428709)).setEnabled(!chipGroupM5.a().isEmpty());
                    return aojh.a;
                }
            });
            aooh.c(viewInflate);
            this.an = false;
            ahns.l();
            return viewInflate;
        } catch (java.lang.Throwable th) {
            try {
                ahns.l();
            } catch (java.lang.Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final ems P() {
        return this.am;
    }

    @java.lang.Deprecated
    public final android.content.Context a() {
        if (this.al == null) {
            this.al = new ahgi(this, super.z());
        }
        return this.al;
    }

    public final void aD(android.content.Intent intent) {
        agab.aD(intent, z());
        aP(intent);
    }

    public final void aP(android.content.Intent intent) {
        agab.aD(intent, z());
        super.aP(intent);
    }

    public final void aR(int i, int i2) {
        this.ap.i(i, i2);
        ahns.l();
    }

    @Override // defpackage.jkm
    protected final /* synthetic */ amxr aV() {
        return new ahgl(this);
    }

    public final ahqz aY() {
        return (ahqz) this.ap.b;
    }

    public final java.util.Locale aZ() {
        return agab.aE(this);
    }

    public final void af(android.os.Bundle bundle) {
        this.ap.j();
        try {
            super.af(bundle);
            ahns.l();
        } catch (java.lang.Throwable th) {
            try {
                ahns.l();
            } catch (java.lang.Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final void ag(int i, int i2, android.content.Intent intent) {
        ahpm ahpmVarL = this.ap.l();
        try {
            super.ag(i, i2, intent);
            ahpmVarL.close();
        } catch (java.lang.Throwable th) {
            try {
                ahpmVarL.close();
            } catch (java.lang.Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.jkm
    public final void ah(android.app.Activity activity) {
        this.ap.j();
        try {
            super.ah(activity);
            ahns.l();
        } catch (java.lang.Throwable th) {
            try {
                ahns.l();
            } catch (java.lang.Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final void ai() {
        ahpm ahpmVarE = this.ap.e();
        try {
            super.ai();
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

    public final void al() {
        this.ap.j();
        try {
            super.al();
            ahns.l();
        } catch (java.lang.Throwable th) {
            try {
                ahns.l();
            } catch (java.lang.Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final void an() {
        ahpm ahpmVarE = this.ap.e();
        try {
            super.an();
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

    /* JADX WARN: Multi-variable type inference failed */
    public final void ao(android.view.View view, android.os.Bundle bundle) {
        this.ap.j();
        try {
            if (!this.c && !this.an) {
                ajwr ajwrVarX = ahvr.x(this);
                ajwrVarX.a = view;
                defpackage.jlr.c(ajwrVarX, y());
                defpackage.jlr.a(this, y());
            }
            defpackage.jlm jlmVarY = y();
            aooh.f(view, "view");
            ((android.support.v7.widget.Toolbar) ft$.ExternalSyntheticApiModelOutline0.m(view, 2131429294)).u = new defpackage.jlh(jlmVarY, 0);
            jlmVarY.f.o((rmx) ((defpackage.jlp) jlmVarY.a().e.c()).a.d.get(defpackage.jmr.a));
            ahns.l();
        } catch (java.lang.Throwable th) {
            try {
                ahns.l();
            } catch (java.lang.Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final void au(android.os.Bundle bundle) {
        android.os.Bundle bundle2 = ((aw) this).m;
        boolean z = true;
        if (bundle2 != null && bundle2 != bundle) {
            z = false;
        }
        ahvr.bZ(z, "Cannot overwrite fragment arguments. See - http://go/tiktok/dev/dagger/fragmentpeers.md#argument");
        super.au(bundle);
    }

    public final void av(java.lang.Object obj) {
        ajwa ajwaVar = this.ap;
        if (ajwaVar != null) {
            ajwaVar.k();
        }
        super.av(obj);
    }

    public final void aw(java.lang.Object obj) {
        ajwa ajwaVar = this.ap;
        if (ajwaVar != null) {
            ajwaVar.k();
        }
        super.aw(obj);
    }

    public final void ba(ahqz ahqzVar, boolean z) {
        this.ap.h(ahqzVar, z);
    }

    public final void bb(ahqz ahqzVar) {
        this.ap.c = ahqzVar;
    }

    /* JADX INFO: renamed from: bc, reason: merged with bridge method [inline-methods] */
    public final defpackage.jlm y() {
        defpackage.jlm jlmVar = this.ak;
        if (jlmVar == null) {
            throw new java.lang.IllegalStateException("peer() called before initialized.");
        }
        if (this.ao) {
            throw new java.lang.IllegalStateException("peer() called after destroyed.");
        }
        return jlmVar;
    }

    @Override // defpackage.jkm
    public final android.view.LayoutInflater e(android.os.Bundle bundle) {
        this.ap.j();
        try {
            android.view.LayoutInflater layoutInflaterE = super.e(bundle);
            android.view.LayoutInflater layoutInflaterCloneInContext = layoutInflaterE.cloneInContext(new ahgi(this, layoutInflaterE));
            ahns.l();
            return layoutInflaterCloneInContext;
        } catch (java.lang.Throwable th) {
            try {
                ahns.l();
            } catch (java.lang.Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final android.app.Dialog eb(android.os.Bundle bundle) {
        super.eb(bundle);
        ahph ahphVar = y().c;
        android.content.Context contextZ = ahphVar.z();
        if (contextZ == null) {
            throw new java.lang.IllegalArgumentException("Required value was null.");
        }
        afqy afqyVar = new afqy(contextZ, ahphVar.b);
        afqyVar.setOnShowListener(new defpackage.jlg(afqyVar, 0));
        return afqyVar;
    }

    public final void f() {
        ahpm ahpmVarG = ahns.g();
        try {
            super.f();
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

    @Override // defpackage.jkm
    public final void g(android.content.Context context) {
        this.ap.j();
        try {
            if (this.ao) {
                throw new java.lang.IllegalStateException("A Fragment cannot be attached more than once. Instead, create a new Fragment instance.");
            }
            super.g(context);
            if (this.ak == null) {
                jlo jloVar = (jlo) agab.aC(this, jlo.class);
                ahoq ahoqVarY = ahvr.Y(154, defpackage.jlf.class, "CreatePeer");
                try {
                    this.ak = jloVar.t();
                    ahoqVarY.close();
                    ((aw) this).ab.c(new ahfz(this.ap, this.am));
                } catch (java.lang.Throwable th) {
                    try {
                        ahoqVarY.close();
                    } catch (java.lang.Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }
            ahph ahphVar = ((aw) this).E;
            if (ahphVar instanceof ahph) {
                ajwa ajwaVar = this.ap;
                if (ajwaVar.b == null) {
                    ajwaVar.h(ahphVar.aY(), true);
                }
            }
            ahns.l();
        } catch (java.lang.Throwable th3) {
            try {
                ahns.l();
            } catch (java.lang.Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    public final void h(android.os.Bundle bundle) {
        this.ap.j();
        try {
            super.h(bundle);
            defpackage.jlm jlmVarY = y();
            jlmVarY.d.h(jlmVarY.i);
            ahns.l();
        } catch (java.lang.Throwable th) {
            try {
                ahns.l();
            } catch (java.lang.Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final void i() {
        ahpm ahpmVarE = this.ap.e();
        try {
            super.i();
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

    public final void j() {
        ahpm ahpmVarD = this.ap.d();
        try {
            super.j();
            this.ao = true;
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

    public final void k(android.os.Bundle bundle) {
        this.ap.j();
        try {
            super.k(bundle);
            y().b();
            ahns.l();
        } catch (java.lang.Throwable th) {
            try {
                ahns.l();
            } catch (java.lang.Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void l() {
        this.ap.j();
        try {
            super.l();
            ahus.k(this);
            if (this.c) {
                if (!this.an) {
                    android.view.View viewI = ahus.i(this);
                    ajwr ajwrVarX = ahvr.x(this);
                    ajwrVarX.a = viewI;
                    defpackage.jlr.c(ajwrVarX, y());
                    defpackage.jlr.a(this, y());
                    this.an = true;
                }
                ahus.j(this);
            }
            ahns.l();
        } catch (java.lang.Throwable th) {
            try {
                ahns.l();
            } catch (java.lang.Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final void m() {
        this.ap.j();
        try {
            super.m();
            ahns.l();
        } catch (java.lang.Throwable th) {
            try {
                ahns.l();
            } catch (java.lang.Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final void n(android.os.Bundle bundle) {
        this.ap.j();
        try {
            super.n(bundle);
            ahns.l();
        } catch (java.lang.Throwable th) {
            try {
                ahns.l();
            } catch (java.lang.Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final void onCancel(android.content.DialogInterface dialogInterface) {
        ahpm ahpmVarG = this.ap.g("DialogFragment:onCancel");
        try {
            defpackage.jlm jlmVarY = y();
            aooh.f(dialogInterface, "dialogInterface");
            jlmVarY.f.o((rmx) ((defpackage.jlp) jlmVarY.a().e.c()).a.d.get(defpackage.jmr.b));
            jlmVarY.d.i(zoe.N(aosv.F(jlmVarY.h, 0, new defpackage.jlk(jlmVarY, (aoln) null, 1, (byte[]) null), 3)), jlmVarY.i);
            jlmVarY.c();
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

    public final void onDismiss(android.content.DialogInterface dialogInterface) {
        ahpm ahpmVarG = this.ap.g("DialogFragment:onDismiss");
        try {
            super.onDismiss(dialogInterface);
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

    @Override // defpackage.jkm
    public final android.content.Context z() {
        if (super.z() == null) {
            return null;
        }
        return a();
    }
}
