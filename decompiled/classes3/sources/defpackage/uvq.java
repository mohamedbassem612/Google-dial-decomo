package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class uvq extends defpackage.uwh implements ahei {
    private defpackage.uvt c;
    private android.content.Context d;
    private boolean e;

    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Object, java.util.concurrent.Executor] */
    public final android.view.View M(android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        this.b.j();
        try {
            bi(layoutInflater);
            defpackage.uvt uvtVarY = y();
            defpackage.uvt.a.b().l("com/android/dialer/transcriptaudiofeedback/impl/FeedbackRecordingFragmentPeer", "onCreateView", 77, "FeedbackRecordingFragmentPeer.java").v("Fragment view created");
            android.view.View viewInflate = layoutInflater.inflate(2131624231, viewGroup, false);
            uvtVarY.g.e(uvtVarY.d);
            android.view.View viewA = hgz.a(uvtVarY.b, (android.view.ViewGroup) viewInflate.findViewById(2131427499));
            hgz.e(viewA, false);
            ajwr ajwrVar = uvtVarY.h;
            defpackage.zlr zlrVar = uvtVarY.j;
            ajcq ajcqVarI = ahvr.I(aiql.v((aify) j$.util.Collection.-EL.stream(((zzx) zlrVar.a).k().f()).map(new defpackage.pgq(zlrVar, uvtVarY.e, 9)).collect(aido.a)), new defpackage.udu(zlrVar, 15), (java.util.concurrent.Executor) zlrVar.c);
            ajwrVar.n(new agxo((agab) zlrVar.b, new kvx(ajcqVarI, 11), "combined_audio_recording_data"), new defpackage.uvs(uvtVarY, viewA));
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

    @Override // defpackage.uwh
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

    public final void ai() {
        ahpm ahpmVarE = this.b.e();
        try {
            aX();
            defpackage.uvt uvtVarY = y();
            defpackage.uvt.a.b().l("com/android/dialer/transcriptaudiofeedback/impl/FeedbackRecordingFragmentPeer", "onDestroy", 96, "FeedbackRecordingFragmentPeer.java").v("enter");
            if (uvtVarY.d.G().isFinishing()) {
                defpackage.uvb uvbVar = uvtVarY.c;
                agsm.i(953, uvbVar.c.eU(ahqx.i(new defpackage.tvg(uvbVar, 16))), "failed to delete audio file after feedback", new java.lang.Object[0]);
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
    public final defpackage.uvt y() {
        defpackage.uvt uvtVar = this.c;
        if (uvtVar == null) {
            throw new java.lang.IllegalStateException("peer() called before initialized.");
        }
        if (this.e) {
            throw new java.lang.IllegalStateException("peer() called after destroyed.");
        }
        return uvtVar;
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

    @Override // defpackage.uwh
    protected final /* synthetic */ amxr f() {
        return new ahgl(this);
    }

    @Override // defpackage.uwh
    public final void g(android.content.Context context) {
        this.b.j();
        try {
            if (this.e) {
                throw new java.lang.IllegalStateException("A Fragment cannot be attached more than once. Instead, create a new Fragment instance.");
            }
            super.g(context);
            if (this.c == null) {
                uvu uvuVar = (uvu) agab.aC(this, uvu.class);
                ahoq ahoqVarY = ahvr.Y(952, defpackage.uvq.class, "CreatePeer");
                try {
                    this.c = uvuVar.cu();
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

    @Override // defpackage.uwh
    public final android.content.Context z() {
        if (super.z() == null) {
            return null;
        }
        return a();
    }
}
