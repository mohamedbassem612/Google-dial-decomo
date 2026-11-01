package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class uby extends defpackage.ubo implements ahei {
    private defpackage.ucc c;
    private android.content.Context d;
    private boolean e;

    public final android.view.View M(android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        this.b.j();
        try {
            bi(layoutInflater);
            defpackage.ucc uccVarY = y();
            j$.util.Optional optionalH = uccVarY.g.h();
            if (true == optionalH.isPresent()) {
                optionalH = j$.util.Optional.ofNullable(((defpackage.uca) ((defpackage.apqr) optionalH.get()).a(defpackage.uca.class)).cQ());
            }
            if (true == optionalH.isPresent()) {
                ((defpackage.qbe) ((defpackage.uss) optionalH.get()).a).a(qbc.hz);
            }
            uccVarY.c.g(2131428985, uccVarY.i.aa(defpackage.ucb.class, new defpackage.qam(16)), uccVarY.d.a(uccVarY.f));
            android.view.View viewInflate = layoutInflater.inflate(2131624459, viewGroup, false);
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

    @Override // defpackage.ubo
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
            defpackage.ucc uccVarY = y();
            com.google.android.libraries.communications.ux.views.promo.PromoCard promoCard = (com.google.android.libraries.communications.ux.views.promo.PromoCard) view.findViewById(2131428742);
            defpackage.ubz ubzVar = uccVarY.e;
            java.lang.String str = ubzVar.c;
            java.lang.String str2 = ubzVar.d;
            java.lang.String str3 = ubzVar.e;
            defpackage.afmm afmmVar = new defpackage.afmm();
            afmmVar.g(str3);
            afmmVar.a = new sky(uccVarY, 12);
            defpackage.abpr abprVarF = afmmVar.f();
            java.lang.String string = view.getContext().getString(2132020199);
            defpackage.afmm afmmVar2 = new defpackage.afmm();
            afmmVar2.g("");
            afmmVar2.a = new sky(uccVarY, 13);
            defpackage.abpr abprVarF2 = afmmVar2.f();
            if (str == null) {
                throw new java.lang.NullPointerException("Null title");
            }
            if (str2 == null) {
                throw new java.lang.NullPointerException("Null description");
            }
            defpackage.abps abpsVar = new defpackage.abps(true, str, str2, string, abprVarF, abprVarF2);
            defpackage.ahiy ahiyVar = promoCard.a;
            java.lang.Object obj = ahiyVar.f;
            ((android.widget.ImageView) obj).setImageResource(2131231514);
            ((android.widget.ImageView) obj).setImageTintList((android.content.res.ColorStateList) ahiyVar.i);
            ((android.view.View) ahiyVar.d).setVisibility(8);
            java.lang.Object obj2 = ahiyVar.g;
            ((android.view.View) obj2).setVisibility(0);
            ((android.widget.ImageView) obj2).setContentDescription(abpsVar.f);
            ((android.widget.ImageView) obj2).setOnClickListener(new defpackage.wtm(abpsVar, 7));
            ((android.widget.TextView) ahiyVar.c).setText(abpsVar.c);
            ((android.widget.TextView) ahiyVar.h).setText(abpsVar.d);
            java.lang.Object obj3 = ahiyVar.b;
            defpackage.abpr abprVar = abpsVar.g;
            ((android.widget.Button) obj3).setText(abprVar.a);
            ((android.widget.Button) obj3).setOnClickListener(new defpackage.wtm(abprVar, 8));
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

    public final void au(android.os.Bundle bundle) {
        android.os.Bundle bundle2 = ((aw) this).m;
        boolean z = true;
        if (bundle2 != null && bundle2 != bundle) {
            z = false;
        }
        ahvr.bZ(z, "Cannot overwrite fragment arguments. See - http://go/tiktok/dev/dagger/fragmentpeers.md#argument");
        super.au(bundle);
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

    @Override // defpackage.ubo
    protected final /* synthetic */ amxr f() {
        return new ahgl(this);
    }

    @Override // defpackage.ubo
    public final void g(android.content.Context context) {
        this.b.j();
        try {
            if (this.e) {
                throw new java.lang.IllegalStateException("A Fragment cannot be attached more than once. Instead, create a new Fragment instance.");
            }
            super.g(context);
            if (this.c == null) {
                ucd ucdVar = (ucd) agab.aC(this, ucd.class);
                ahoq ahoqVarY = ahvr.Y(907, defpackage.uby.class, "CreatePeer");
                try {
                    this.c = ucdVar.cm();
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
    public final defpackage.ucc y() {
        defpackage.ucc uccVar = this.c;
        if (uccVar == null) {
            throw new java.lang.IllegalStateException("peer() called before initialized.");
        }
        if (this.e) {
            throw new java.lang.IllegalStateException("peer() called after destroyed.");
        }
        return uccVar;
    }

    @Override // defpackage.ubo
    public final android.content.Context z() {
        if (super.z() == null) {
            return null;
        }
        return a();
    }
}
