package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class sto extends defpackage.stn implements defpackage.ahei {
    private defpackage.stq c;
    private android.content.Context d;
    private boolean e;

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
        defpackage.stq stqVarY = y();
        defpackage.ajwr ajwrVar = stqVarY.f;
        defpackage.sti stiVar = stqVarY.b;
        ajwrVar.n(new defpackage.agxo(stiVar.e, new defpackage.sth(stiVar, 0), defpackage.sti.a), stqVarY.e);
        android.view.View viewInflate = layoutInflater.inflate(2131624369, viewGroup, false);
        defpackage.ahns.l();
        return viewInflate;
    }

    @Override // defpackage.aheg
    @java.lang.Deprecated
    public final android.content.Context a() {
        if (this.d == null) {
            this.d = new defpackage.ahgi(this, super.z());
        }
        return this.d;
    }

    @Override // defpackage.stn, defpackage.aw
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
    public final void an() {
        defpackage.ahpm ahpmVarE = this.b.e();
        try {
            bf();
            y().h.s(defpackage.ajcm.a, defpackage.sti.a);
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

    @Override // defpackage.stn
    protected final /* synthetic */ defpackage.amxr f() {
        return new defpackage.ahgl(this);
    }

    @Override // defpackage.stn, defpackage.ahfw, defpackage.aw
    public final void g(android.content.Context context) {
        this.b.j();
        try {
            if (this.e) {
                throw new java.lang.IllegalStateException("A Fragment cannot be attached more than once. Instead, create a new Fragment instance.");
            }
            super.g(context);
            if (this.c == null) {
                defpackage.str strVar = (defpackage.str) defpackage.agab.aC(this, defpackage.str.class);
                defpackage.ahoq ahoqVarY = defpackage.ahvr.Y(835, defpackage.sto.class, "CreatePeer");
                try {
                    this.c = strVar.bZ();
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

    @Override // defpackage.aw
    public final void j() {
        defpackage.ahpm ahpmVarD = this.b.d();
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

    @Override // defpackage.ahei
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public final defpackage.stq y() {
        defpackage.stq stqVar = this.c;
        if (stqVar == null) {
            throw new java.lang.IllegalStateException("peer() called before initialized.");
        }
        if (this.e) {
            throw new java.lang.IllegalStateException("peer() called after destroyed.");
        }
        return stqVar;
    }

    @Override // defpackage.stn, defpackage.aw
    public final android.content.Context z() {
        if (super.z() == null) {
            return null;
        }
        return a();
    }
}
