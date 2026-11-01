package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class rqo extends defpackage.rpu implements defpackage.ahei {
    private android.content.Context c;
    private boolean d;
    private defpackage.rsr e;

    @Override // defpackage.ahfw, defpackage.aw
    public final android.view.View M(android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        this.b.j();
        if (layoutInflater == null) {
            try {
                defpackage.aooh.i("inflater");
            } catch (java.lang.Throwable th) {
                try {
                    defpackage.ahns.l();
                } catch (java.lang.Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        defpackage.rsr rsrVarY = y();
        java.lang.Object obj = null;
        if (layoutInflater == null) {
            defpackage.aooh.i("inflater");
            layoutInflater = null;
        }
        android.view.View viewInflate = layoutInflater.inflate(2131624419, viewGroup, false);
        android.view.View viewFindViewById = viewInflate.findViewById(2131428885);
        defpackage.aooh.e(viewFindViewById, "findViewById(...)");
        com.google.android.material.search.SearchBar searchBar = (com.google.android.material.search.SearchBar) viewFindViewById;
        int dimension = (int) viewInflate.getResources().getDimension(2131165330);
        android.view.ViewGroup.LayoutParams layoutParams = searchBar.getLayoutParams();
        if (layoutParams == null) {
            throw new java.lang.NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.leftMargin = dimension;
        marginLayoutParams.rightMargin = dimension;
        searchBar.setLayoutParams(marginLayoutParams);
        searchBar.q(2132019338);
        searchBar.s(2131231970);
        searchBar.u(new defpackage.afun(searchBar, 1));
        java.lang.CharSequence charSequenceH = searchBar.h();
        if (searchBar == null) {
            defpackage.aooh.i("<this>");
        }
        java.util.Iterator itA = new defpackage.dzv(searchBar).a();
        while (itA.hasNext()) {
            java.lang.Object next = itA.next();
            if (defpackage.aooh.n(((android.view.View) next).getContentDescription(), charSequenceH)) {
                obj = next;
                break;
            }
        }
        android.view.View view = (android.view.View) obj;
        if (view != null) {
            view.setTag(2131428318, "hamburger_menu");
        }
        ((defpackage.ajwr) rsrVarY.a).g(ft$.ExternalSyntheticApiModelOutline0.m(viewInflate, 2131428885), defpackage.rqn.a);
        if (viewInflate == null) {
            defpackage.aooh.g();
        }
        defpackage.ahns.l();
        return viewInflate;
    }

    @Override // defpackage.aw, defpackage.emn
    public final defpackage.eoq T() {
        defpackage.eos eosVar = new defpackage.eos(super.T());
        eosVar.b(defpackage.env.c, new android.os.Bundle());
        return eosVar;
    }

    @Override // defpackage.aheg
    @java.lang.Deprecated
    public final android.content.Context a() {
        if (this.c == null) {
            this.c = new defpackage.ahgi(this, super.z());
        }
        return this.c;
    }

    @Override // defpackage.rpu, defpackage.aw
    public final void ah(android.app.Activity activity) {
        this.b.j();
        try {
            super.ah(activity);
            defpackage.ahns.l();
        } catch (java.lang.Throwable th) {
            try {
                defpackage.ahns.l();
            } catch (java.lang.Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.ahfw, defpackage.aw
    public final void ao(android.view.View view, android.os.Bundle bundle) {
        this.b.j();
        if (view == null) {
            try {
                defpackage.aooh.i("view");
            } catch (java.lang.Throwable th) {
                try {
                    defpackage.ahns.l();
                } catch (java.lang.Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        defpackage.rsr rsrVarY = y();
        if (view == null) {
            defpackage.aooh.i("view");
        }
        defpackage.ahbv.D((defpackage.aw) rsrVarY.b);
        defpackage.ahns.l();
    }

    @Override // defpackage.aw
    public final android.view.LayoutInflater e(android.os.Bundle bundle) {
        this.b.j();
        try {
            android.view.LayoutInflater layoutInflaterAM = aM();
            android.view.LayoutInflater layoutInflaterCloneInContext = layoutInflaterAM.cloneInContext(new defpackage.amyf(layoutInflaterAM, this));
            android.view.LayoutInflater layoutInflaterCloneInContext2 = layoutInflaterCloneInContext.cloneInContext(new defpackage.ahgi(this, layoutInflaterCloneInContext));
            defpackage.ahns.l();
            return layoutInflaterCloneInContext2;
        } catch (java.lang.Throwable th) {
            try {
                defpackage.ahns.l();
            } catch (java.lang.Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.rpu
    protected final /* synthetic */ defpackage.amxr f() {
        return new defpackage.ahgl(this);
    }

    @Override // defpackage.rpu, defpackage.ahfw, defpackage.aw
    public final void g(android.content.Context context) {
        this.b.j();
        try {
            if (this.d) {
                throw new java.lang.IllegalStateException("A Fragment cannot be attached more than once. Instead, create a new Fragment instance.");
            }
            super.g(context);
            if (this.e == null) {
                defpackage.rqp rqpVar = (defpackage.rqp) defpackage.agab.aC(this, defpackage.rqp.class);
                defpackage.ahoq ahoqVarY = defpackage.ahvr.Y(752, defpackage.rqo.class, "CreatePeer");
                try {
                    this.e = rqpVar.dj();
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
            defpackage.ahns.l();
        } catch (java.lang.Throwable th3) {
            try {
                defpackage.ahns.l();
            } catch (java.lang.Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    @Override // defpackage.ahfw, defpackage.aw
    public final void h(android.os.Bundle bundle) {
        this.b.j();
        try {
            aW(bundle);
            super.D().p = true;
            defpackage.ahns.l();
        } catch (java.lang.Throwable th) {
            try {
                defpackage.ahns.l();
            } catch (java.lang.Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.aw
    public final void j() {
        defpackage.ahpm ahpmVarD = this.b.d();
        try {
            bd();
            this.d = true;
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

    @Override // defpackage.ahei
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public final defpackage.rsr y() {
        defpackage.rsr rsrVar = this.e;
        if (rsrVar == null) {
            throw new java.lang.IllegalStateException("peer() called before initialized.");
        }
        if (this.d) {
            throw new java.lang.IllegalStateException("peer() called after destroyed.");
        }
        return rsrVar;
    }

    @Override // defpackage.rpu, defpackage.aw
    public final android.content.Context z() {
        if (super.z() == null) {
            return null;
        }
        return a();
    }
}
