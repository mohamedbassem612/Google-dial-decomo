package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class kwj extends defpackage.kws implements ahei, ahtq {
    private final ahda ak = new ahda((byte[]) null, (byte[]) null);
    private defpackage.kwo c;
    private android.content.Context d;
    private boolean e;

    public final android.view.View M(android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        this.b.j();
        try {
            bi(layoutInflater);
            defpackage.kwo kwoVarY = y();
            defpackage.kwo.a.b().l("com/android/dialer/callrecording/impl/history/CallRecordingSessionFragmentPeer", "onCreateView", 153, "CallRecordingSessionFragmentPeer.java").v("enter");
            android.view.View viewInflate = layoutInflater.inflate(2131624063, viewGroup, false);
            com.android.dialer.widget.DialerToolbar dialerToolbarFindViewById = viewInflate.findViewById(2131429294);
            defpackage.kwk kwkVar = kwoVarY.b;
            dialerToolbarFindViewById.x(kwkVar.c);
            dialerToolbarFindViewById.u(new defpackage.jln(dialerToolbarFindViewById, 18, null));
            kwoVarY.j.e(kwoVarY.d);
            android.view.View viewA = defpackage.hgz.a(kwoVarY.e, (android.view.ViewGroup) viewInflate.findViewById(2131427499));
            android.net.Uri uriV = kwoVarY.k.v(kwkVar.d);
            akzx akzxVarM = defpackage.iek.a.m();
            akzx akzxVarM2 = defpackage.ied.a.m();
            java.lang.String string = uriV.toString();
            akzxVarM2.u();
            defpackage.ied iedVar = (defpackage.ied) akzxVarM2.b;
            j$.util.Objects.requireNonNull(string);
            iedVar.c = string;
            defpackage.iec iecVar = defpackage.iec.CALL_RECORDING;
            akzxVarM2.u();
            ((defpackage.ied) akzxVarM2.b).e = iecVar.a();
            akzxVarM.u();
            defpackage.iek iekVar = (defpackage.iek) akzxVarM.b;
            defpackage.ied iedVar2 = (defpackage.ied) akzxVarM2.p();
            j$.util.Objects.requireNonNull(iedVar2);
            iekVar.c = iedVar2;
            iekVar.b |= 1;
            akzxVarM.u();
            ((defpackage.iek) akzxVarM.b).d = true;
            akzxVarM.u();
            ((defpackage.iek) akzxVarM.b).e = true;
            akzxVarM.u();
            ((defpackage.iek) akzxVarM.b).h = true;
            defpackage.hgz.c(viewA, (defpackage.iek) akzxVarM.p());
            defpackage.hgz.e(viewA, true);
            ahpr ahprVar = new ahpr(kwoVarY.h, 229, "call_recording_session_activity_apply_window_insets_compat", new defpackage.izf(3));
            int i = dzs.a;
            dzk.o(viewInflate, ahprVar);
            if (viewInflate == null) {
                defpackage.hhb.n(this, y());
            }
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

    @Override // defpackage.kws
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
            ahvr.x(this).a = view;
            y();
            defpackage.hhb.n(this, y());
            aooh.f(view, "view");
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
    public final defpackage.kwo y() {
        defpackage.kwo kwoVar = this.c;
        if (kwoVar == null) {
            throw new java.lang.IllegalStateException("peer() called before initialized.");
        }
        if (this.e) {
            throw new java.lang.IllegalStateException("peer() called after destroyed.");
        }
        return kwoVar;
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

    public final ahtm f(ahth ahthVar) {
        return this.ak.j(ahthVar);
    }

    @Override // defpackage.kws
    public final void g(android.content.Context context) {
        this.b.j();
        try {
            if (this.e) {
                throw new java.lang.IllegalStateException("A Fragment cannot be attached more than once. Instead, create a new Fragment instance.");
            }
            super.g(context);
            if (this.c == null) {
                kwq kwqVar = (kwq) agab.aC(this, kwq.class);
                ahoq ahoqVarY = ahvr.Y(228, defpackage.kwj.class, "CreatePeer");
                try {
                    this.c = kwqVar.R();
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

    public final void h(android.os.Bundle bundle) {
        this.b.j();
        try {
            aW(bundle);
            defpackage.kwo kwoVarY = y();
            kwoVarY.f.h(kwoVarY.i);
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
        ahpm ahpmVarE = this.b.e();
        try {
            bc();
            if (((aw) this).Q == null) {
                this.ak.l();
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

    @Override // defpackage.kws
    protected final /* synthetic */ amxr p() {
        return new ahgl(this);
    }

    public final void q(java.lang.Class cls, ahtl ahtlVar) {
        this.ak.k(cls, ahtlVar);
    }

    @Override // defpackage.kws
    public final android.content.Context z() {
        if (super.z() == null) {
            return null;
        }
        return a();
    }
}
