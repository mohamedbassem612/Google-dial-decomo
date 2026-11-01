package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class uvv extends defpackage.uwi implements ahei {
    private defpackage.uvx c;
    private android.content.Context d;
    private boolean e;

    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Object, java.util.concurrent.Executor] */
    public final android.view.View M(android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        this.b.j();
        try {
            bi(layoutInflater);
            defpackage.uvx uvxVarY = y();
            defpackage.uvx.a.b().l("com/android/dialer/transcriptaudiofeedback/impl/FeedbackTranscriptFragmentPeer", "onCreateView", 77, "FeedbackTranscriptFragmentPeer.java").v("Fragment view created");
            android.view.View viewInflate = layoutInflater.inflate(2131624232, viewGroup, false);
            ajwr ajwrVar = uvxVarY.g;
            defpackage.ulw ulwVar = uvxVarY.f;
            ajcq ajcqVarH = ahvr.H(aiql.v((aify) j$.util.Collection.-EL.stream(((zzx) ulwVar.c).k().f()).map(new defpackage.pgq(ulwVar, uvxVarY.b, 10)).collect(aido.a)), new defpackage.uqm(20), (java.util.concurrent.Executor) ulwVar.a);
            ajwrVar.n(new agxo((agab) ulwVar.b, new kvx(ajcqVarH, 12), "transcript_data"), uvxVarY.e);
            android.support.v7.widget.RecyclerView recyclerViewFindViewById = viewInflate.findViewById(2131428260);
            recyclerViewFindViewById.aa(new android.support.v7.widget.LinearLayoutManager(1, false));
            amcn amcnVar = new amcn();
            amcnVar.d = new defpackage.uev(uvxVarY, 19);
            uvxVarY.d = amcnVar.m();
            recyclerViewFindViewById.Y(uvxVarY.d);
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

    @Override // defpackage.uwi
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

    public final void au(android.os.Bundle bundle) {
        android.os.Bundle bundle2 = ((aw) this).m;
        boolean z = true;
        if (bundle2 != null && bundle2 != bundle) {
            z = false;
        }
        ahvr.bZ(z, "Cannot overwrite fragment arguments. See - http://go/tiktok/dev/dagger/fragmentpeers.md#argument");
        super.au(bundle);
    }

    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final defpackage.uvx y() {
        defpackage.uvx uvxVar = this.c;
        if (uvxVar == null) {
            throw new java.lang.IllegalStateException("peer() called before initialized.");
        }
        if (this.e) {
            throw new java.lang.IllegalStateException("peer() called after destroyed.");
        }
        return uvxVar;
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

    @Override // defpackage.uwi
    protected final /* synthetic */ amxr f() {
        return new ahgl(this);
    }

    @Override // defpackage.uwi
    public final void g(android.content.Context context) {
        this.b.j();
        try {
            if (this.e) {
                throw new java.lang.IllegalStateException("A Fragment cannot be attached more than once. Instead, create a new Fragment instance.");
            }
            super.g(context);
            if (this.c == null) {
                uvy uvyVar = (uvy) agab.aC(this, uvy.class);
                ahoq ahoqVarY = ahvr.Y(954, defpackage.uvv.class, "CreatePeer");
                try {
                    this.c = uvyVar.cv();
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

    @Override // defpackage.uwi
    public final android.content.Context z() {
        if (super.z() == null) {
            return null;
        }
        return a();
    }
}
