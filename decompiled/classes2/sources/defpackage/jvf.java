package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class jvf extends defpackage.jvn implements ahei, aheg, ahgg, ahph {
    private defpackage.jvk ak;
    private android.content.Context al;
    private boolean an;
    private final emy am = new emy(this, true);
    private final ajwa ao = new ajwa(this);

    @java.lang.Deprecated
    public jvf() {
        afec.c();
    }

    public static defpackage.jvf aU(defpackage.jrz jrzVar) {
        defpackage.jvf jvfVar = new defpackage.jvf();
        amxr.g(jvfVar);
        ahgl.b(jvfVar, jrzVar);
        return jvfVar;
    }

    public final android.view.View M(android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        agxo jveVar;
        this.ao.j();
        try {
            defpackage.jvk jvkVarY = y();
            ajwr ajwrVar = jvkVarY.k;
            defpackage.jvd jvdVar = jvkVarY.d;
            defpackage.jrz jrzVar = jvkVarY.b;
            if (jvdVar.g.g().isPresent()) {
                defpackage.him himVar = ((hir) jvdVar.j.a).a;
                aogc aogcVarDu = himVar.a.du();
                zjm zjmVarMM = himVar.mM();
                ajct ajctVar = (ajct) himVar.r.a();
                kaw kawVarOy = himVar.oy();
                jveVar = new defpackage.jve(jrzVar, aogcVarDu, zjmVarMM, ajctVar, kawVarOy);
            } else {
                jveVar = new agxo(jvdVar.i, new defpackage.jvc(), defpackage.jve.b);
            }
            ajwrVar.n(jveVar, jvkVarY.j);
            android.view.View viewInflate = layoutInflater.inflate(2131624086, viewGroup, false);
            android.view.View viewFindViewById = viewInflate.findViewById(2131428946);
            ahpz ahpzVar = jvkVarY.e;
            byte[] bArr = null;
            viewFindViewById.setOnClickListener(new ahpp(ahpzVar, 176, "Show more button clicked", new defpackage.jln(jvkVarY, 5, bArr), 0));
            com.google.android.material.appbar.MaterialToolbar materialToolbarFindViewById = viewInflate.findViewById(2131429294);
            materialToolbarFindViewById.u(new ahpp(ahpzVar, 177, "Close button clicked", new defpackage.jln(jvkVarY, 6, bArr), 0));
            materialToolbarFindViewById.setOnClickListener(new ahpp(ahpzVar, 178, "Toolbar clicked", new defpackage.jln(jvkVarY, 7, bArr), 0));
            viewInflate.findViewById(2131428877).setNestedScrollingEnabled(false);
            ahns.l();
            return viewInflate;
        } catch (java.lang.Throwable th) {
            try {
                ahns.l();
                throw th;
            } catch (java.lang.Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
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
        this.ao.i(i, i2);
        ahns.l();
    }

    /* JADX INFO: renamed from: aV, reason: merged with bridge method [inline-methods] */
    public final defpackage.jvk y() {
        defpackage.jvk jvkVar = this.ak;
        if (jvkVar == null) {
            throw new java.lang.IllegalStateException("peer() called before initialized.");
        }
        if (this.an) {
            throw new java.lang.IllegalStateException("peer() called after destroyed.");
        }
        return jvkVar;
    }

    @Override // defpackage.jvn
    protected final /* synthetic */ amxr aW() {
        return new ahgl(this);
    }

    public final ahqz aY() {
        return (ahqz) this.ao.b;
    }

    public final java.util.Locale aZ() {
        return agab.aE(this);
    }

    public final void af(android.os.Bundle bundle) {
        this.ao.j();
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
        ahpm ahpmVarL = this.ao.l();
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

    @Override // defpackage.jvn
    public final void ah(android.app.Activity activity) {
        this.ao.j();
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
        ahpm ahpmVarE = this.ao.e();
        try {
            super.ai();
            defpackage.jvk jvkVarY = y();
            defpackage.jvf jvfVar = jvkVarY.c;
            if (jvfVar.G() == null || !jvfVar.G().isChangingConfigurations()) {
                jvkVarY.d.a();
            }
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
        this.ao.j();
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
        ahpm ahpmVarE = this.ao.e();
        try {
            super.an();
            y().b();
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

    public final void ao(android.view.View view, android.os.Bundle bundle) {
        this.ao.j();
        ahns.l();
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
        ajwa ajwaVar = this.ao;
        if (ajwaVar != null) {
            ajwaVar.k();
        }
        super.av(obj);
    }

    public final void aw(java.lang.Object obj) {
        ajwa ajwaVar = this.ao;
        if (ajwaVar != null) {
            ajwaVar.k();
        }
        super.aw(obj);
    }

    public final void ba(ahqz ahqzVar, boolean z) {
        this.ao.h(ahqzVar, z);
    }

    public final void bb(ahqz ahqzVar) {
        this.ao.c = ahqzVar;
    }

    @Override // defpackage.jvn
    public final android.view.LayoutInflater e(android.os.Bundle bundle) {
        this.ao.j();
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
        final defpackage.jvk jvkVarY = y();
        ahph ahphVar = jvkVarY.c;
        final afqy afqyVar = new afqy(ahphVar.z(), ahphVar.b);
        afqyVar.setOnShowListener(new android.content.DialogInterface.OnShowListener() { // from class: jvg
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r2v15, types: [android.view.ViewTreeObserver$OnPreDrawListener, java.lang.Object] */
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(android.content.DialogInterface dialogInterface) {
                afqy afqyVar2 = afqyVar;
                android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) afqyVar2.findViewById(2131427851);
                defpackage.jvk jvkVar = jvkVarY;
                defpackage.jvf jvfVar = jvkVar.c;
                android.view.View.inflate(jvfVar.z(), 2131624085, frameLayout);
                android.view.View viewFindViewById = afqyVar2.findViewById(2131429041);
                byte[] bArr = null;
                defpackage.jln jlnVar = new defpackage.jln(jvkVar, 9, bArr);
                ahpz ahpzVar = jvkVar.e;
                viewFindViewById.setOnClickListener(new ahpp(ahpzVar, 174, "Submit button clicked", jlnVar, 0));
                viewFindViewById.setEnabled(jvkVar.c());
                afqyVar2.findViewById(2131427738).setOnClickListener(new ahpp(ahpzVar, 175, "Cancel button clicked", new defpackage.jln(jvkVar, 10, bArr), 0));
                jvkVar.i = j$.util.Optional.of(new defpackage.jvi(jvkVar, 0));
                j$.util.Optional optional = jvkVar.i;
                defpackage.jrs jrsVar = new defpackage.jrs(afqyVar2, 2);
                if (true == optional.isPresent()) {
                    ((defpackage.ds) jrsVar.a).findViewById(2131427900).getViewTreeObserver().addOnPreDrawListener(optional.get());
                }
                com.google.android.material.bottomsheet.BottomSheetBehavior bottomSheetBehaviorH = com.google.android.material.bottomsheet.BottomSheetBehavior.h(afqyVar2.findViewById(2131427944));
                bottomSheetBehaviorH.r(true);
                bottomSheetBehaviorH.i(new ahrr(jvkVar.l, new defpackage.jvj(jvkVar)));
                androidx.constraintlayout.widget.ConstraintLayout constraintLayoutFindViewById = jvfVar.c().findViewById(2131428292);
                int i = bottomSheetBehaviorH.f;
                if (i != constraintLayoutFindViewById.e) {
                    constraintLayoutFindViewById.e = i;
                    constraintLayoutFindViewById.requestLayout();
                }
                jvkVar.f.o(rmx.fi);
            }
        });
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

    @Override // defpackage.jvn
    public final void g(android.content.Context context) {
        this.ao.j();
        try {
            if (this.an) {
                throw new java.lang.IllegalStateException("A Fragment cannot be attached more than once. Instead, create a new Fragment instance.");
            }
            super.g(context);
            if (this.ak == null) {
                jvl jvlVar = (jvl) agab.aC(this, jvl.class);
                ahoq ahoqVarY = ahvr.Y(172, defpackage.jvf.class, "CreatePeer");
                try {
                    this.ak = jvlVar.F();
                    ahoqVarY.close();
                    ((aw) this).ab.c(new ahfz(this.ao, this.am));
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
                ajwa ajwaVar = this.ao;
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
        this.ao.j();
        try {
            super.h(bundle);
            y().m.bm(rmu.C);
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
    /* JADX WARN: Type inference failed for: r1v3, types: [android.view.ViewTreeObserver$OnPreDrawListener, java.lang.Object] */
    public final void i() {
        android.view.View viewFindViewById;
        ahpm ahpmVarE = this.ao.e();
        try {
            super.i();
            defpackage.jvk jvkVarY = y();
            jvkVarY.g.clear();
            j$.util.Optional optional = jvkVarY.i;
            if (true == optional.isPresent()) {
                ?? r1 = optional.get();
                ahph ahphVar = ((defpackage.jvk) ((defpackage.jvi) r1).a).c;
                if (ahphVar.d != null && (viewFindViewById = ahphVar.c().findViewById(2131427900)) != null) {
                    viewFindViewById.getViewTreeObserver().removeOnPreDrawListener(r1);
                }
            }
            jvkVarY.i = j$.util.Optional.empty();
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
        ahpm ahpmVarD = this.ao.d();
        try {
            super.j();
            this.an = true;
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
        this.ao.j();
        try {
            super.k(bundle);
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
        this.ao.j();
        try {
            super.l();
            ahus.k(this);
            if (this.c) {
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
        this.ao.j();
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
        this.ao.j();
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
        this.ao.g("DialogFragment:onCancel").close();
    }

    public final void onDismiss(android.content.DialogInterface dialogInterface) {
        ahpm ahpmVarG = this.ao.g("DialogFragment:onDismiss");
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

    @Override // defpackage.jvn
    public final android.content.Context z() {
        if (super.z() == null) {
            return null;
        }
        return a();
    }
}
