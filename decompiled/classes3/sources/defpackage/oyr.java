package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class oyr extends defpackage.oyi implements ahei {
    private defpackage.oyu c;
    private android.content.Context d;
    private boolean e;

    public final android.view.View M(android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        this.b.j();
        try {
            bi(layoutInflater);
            defpackage.oyu oyuVarY = y();
            oyuVarY.f.g(2131429338, oyuVarY.l.aa(oyt.class, new lme(14)), oyuVarY.g.a(oyuVarY.j));
            android.view.View viewInflate = layoutInflater.inflate(2131624671, viewGroup, false);
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

    @java.lang.Deprecated
    public final android.content.Context a() {
        if (this.d == null) {
            this.d = new ahgi(this, super.z());
        }
        return this.d;
    }

    @Override // defpackage.oyi
    public final void ah(android.app.Activity activity) {
        this.b.j();
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

    public final void ao(android.view.View view, android.os.Bundle bundle) {
        this.b.j();
        try {
            aooh.f(view, "view");
            defpackage.oyu oyuVarY = y();
            oyuVarY.j();
            oyuVarY.i();
            android.content.Context context = oyuVarY.b;
            boolean z = context.getResources().getBoolean(2131034168);
            android.widget.TextView textViewB = oyuVarY.b();
            int i = true != z ? 8 : 0;
            textViewB.setVisibility(i);
            oyuVarY.c().setVisibility(i);
            com.google.android.material.button.MaterialButton materialButtonE = oyuVarY.e();
            ahpz ahpzVar = oyuVarY.e;
            materialButtonE.setOnClickListener(new defpackage.ahpp(ahpzVar, 457, "clicked answer", (android.view.View.OnClickListener) new nti(oyuVarY, 14), 0));
            oyuVarY.d().setOnClickListener(new defpackage.ahpp(ahpzVar, 458, "clicked answer as RTT", (android.view.View.OnClickListener) new nti(oyuVarY, 15), 0));
            oyuVarY.f().setOnClickListener(new defpackage.ahpp(ahpzVar, 459, "clicked decline", (android.view.View.OnClickListener) new nti(oyuVarY, 16), 0));
            if (((android.view.accessibility.AccessibilityManager) context.getSystemService(android.view.accessibility.AccessibilityManager.class)).isTouchExplorationEnabled()) {
                oyuVarY.h = j$.util.Optional.of(defpackage.oyf.e(oyuVarY.d, view, new defpackage.oyo(oyuVarY, 2)));
                ((defpackage.oyf) oyuVarY.h.orElseThrow()).d();
            }
            ahns.l();
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

    public final android.view.LayoutInflater e(android.os.Bundle bundle) {
        this.b.j();
        try {
            android.view.LayoutInflater layoutInflaterAM = aM();
            android.view.LayoutInflater layoutInflaterCloneInContext = layoutInflaterAM.cloneInContext(new amyf(layoutInflaterAM, this));
            android.view.LayoutInflater layoutInflaterCloneInContext2 = layoutInflaterCloneInContext.cloneInContext(new ahgi(this, layoutInflaterCloneInContext));
            ahns.l();
            return layoutInflaterCloneInContext2;
        } catch (java.lang.Throwable th) {
            try {
                ahns.l();
            } catch (java.lang.Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.oyi
    protected final /* synthetic */ amxr f() {
        return new ahgl(this);
    }

    @Override // defpackage.oyi
    public final void g(android.content.Context context) {
        this.b.j();
        try {
            if (this.e) {
                throw new java.lang.IllegalStateException("A Fragment cannot be attached more than once. Instead, create a new Fragment instance.");
            }
            super.g(context);
            if (this.c == null) {
                oyv oyvVar = (oyv) agab.aC(this, oyv.class);
                ahoq ahoqVarY = ahvr.Y(453, defpackage.oyr.class, "CreatePeer");
                try {
                    this.c = oyvVar.aO();
                    ahoqVarY.close();
                } catch (java.lang.Throwable th) {
                    try {
                        ahoqVarY.close();
                    } catch (java.lang.Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
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

    public final void i() {
        ahpm ahpmVarE = this.b.e();
        try {
            bc();
            j$.util.Optional optional = y().h;
            if (true == optional.isPresent()) {
                ((defpackage.oyf) optional.get()).a();
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

    public final void j() {
        ahpm ahpmVarD = this.b.d();
        try {
            bd();
            this.e = true;
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

    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public final defpackage.oyu y() {
        defpackage.oyu oyuVar = this.c;
        if (oyuVar == null) {
            throw new java.lang.IllegalStateException("peer() called before initialized.");
        }
        if (this.e) {
            throw new java.lang.IllegalStateException("peer() called after destroyed.");
        }
        return oyuVar;
    }

    @Override // defpackage.oyi
    public final android.content.Context z() {
        if (super.z() == null) {
            return null;
        }
        return a();
    }
}
