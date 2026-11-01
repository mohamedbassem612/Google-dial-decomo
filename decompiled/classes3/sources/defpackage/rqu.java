package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class rqu extends defpackage.rrb implements ahei, ahtq {
    private final ahda ak = new ahda((byte[]) null, (byte[]) null);
    private defpackage.rqz c;
    private android.content.Context d;
    private boolean e;

    public final android.view.View M(android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        this.b.j();
        try {
            bi(layoutInflater);
            defpackage.rqz rqzVarY = y();
            aooh.f(layoutInflater, "inflater");
            defpackage.rqz.a.b().l("com/android/dialer/main/impl/ui/searchcontainer/DialpadSearchFragmentPeer", "onCreateView", 148, "DialpadSearchFragmentPeer.kt").v("enter");
            rqzVarY.h.g(2131427993, new defpackage.rph(rqzVarY.i, 2), rqzVarY.j.b(rqzVarY.l, false));
            android.view.View viewInflate = layoutInflater.inflate(2131624154, viewGroup, false);
            aooh.e(viewInflate, "inflate(...)");
            defpackage.rqu rquVar = rqzVarY.d;
            u uVar = new u(rquVar.I());
            if (rquVar.I().e("dialpad_search_fragment_tag") == null) {
                uVar.e(2131427995, new defpackage.tkd(), "dialpad_search_fragment_tag", 1);
            }
            if (rqzVarY.a() == null) {
                uVar.e(2131427992, mla.q(), "precall_dialpad_dialog", 1);
            }
            uVar.c();
            int i = dzs.a;
            dzk.o((android.view.View) dzo.b(viewInflate, 2131427994), new ahpr(rqzVarY.e, 754, "dialpad_search_apply_window_insets_compat", new ebx(rqzVarY, 7)));
            if (viewInflate == null) {
                pez.bd(this, y());
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

    @Override // defpackage.rrb
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
            defpackage.rqz rqzVarY = y();
            defpackage.rqz.a.b().l("com/android/dialer/main/impl/ui/searchcontainer/DialpadSearchFragmentPeer", "onDestroy", 248, "DialpadSearchFragmentPeer.kt").v("enter");
            rqzVarY.c(mce.eR);
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

    public final void aj(boolean z) {
        defpackage.rqz rqzVarY = y();
        aimz aimzVar = defpackage.rqz.a;
        aimzVar.b().l("com/android/dialer/main/impl/ui/searchcontainer/DialpadSearchFragmentPeer", "onHiddenChanged", 260, "DialpadSearchFragmentPeer.kt").v("enter");
        if (z) {
            aimzVar.b().l("com/android/dialer/main/impl/ui/searchcontainer/DialpadSearchFragmentPeer", "onHiddenChanged", 266, "DialpadSearchFragmentPeer.kt").v("hide fragment");
            rqzVarY.c(mce.eU);
            return;
        }
        aimzVar.b().l("com/android/dialer/main/impl/ui/searchcontainer/DialpadSearchFragmentPeer", "onHiddenChanged", 262, "DialpadSearchFragmentPeer.kt").v("show fragment");
        rqzVarY.c(mce.eT);
        android.view.View view = ((aw) rqzVarY.d).Q;
        if (view != null) {
            dza.b(view, new defpackage.rqy(view, (java.lang.Object) rqzVarY, 0));
        }
    }

    public final void an() {
        ahpm ahpmVarE = this.b.e();
        try {
            bf();
            defpackage.rqz rqzVarY = y();
            aimz aimzVar = defpackage.rqz.a;
            aimzVar.b().l("com/android/dialer/main/impl/ui/searchcontainer/DialpadSearchFragmentPeer", "onResume", 242, "DialpadSearchFragmentPeer.kt").v("enter");
            aimzVar.b().l("com/android/dialer/main/impl/ui/searchcontainer/DialpadSearchFragmentPeer", "onResume", 243, "DialpadSearchFragmentPeer.kt").y("isHidden = %b", java.lang.Boolean.valueOf(rqzVarY.d.aH()));
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
        this.b.j();
        try {
            ahvr.x(this).a = view;
            y();
            pez.bd(this, y());
            aooh.f(view, "view");
            defpackage.rqz rqzVarY = y();
            aooh.f(view, "view");
            aimz aimzVar = defpackage.rqz.a;
            aimzVar.b().l("com/android/dialer/main/impl/ui/searchcontainer/DialpadSearchFragmentPeer", "onViewCreated", 184, "DialpadSearchFragmentPeer.kt").v("enter");
            aimzVar.b().l("com/android/dialer/main/impl/ui/searchcontainer/DialpadSearchFragmentPeer", "onViewCreated", 193, "DialpadSearchFragmentPeer.kt").v("onViewCreated");
            mni.cx(new opo(rqzVarY, bundle, view, 4, (char[]) null));
            ahbv ahbvVar = rqzVarY.n;
            defpackage.rqu rquVar = rqzVarY.d;
            ahbvVar.B(rquVar);
            ahbv.D(rquVar);
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

    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final defpackage.rqz y() {
        defpackage.rqz rqzVar = this.c;
        if (rqzVar == null) {
            throw new java.lang.IllegalStateException("peer() called before initialized.");
        }
        if (this.e) {
            throw new java.lang.IllegalStateException("peer() called after destroyed.");
        }
        return rqzVar;
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

    public final defpackage.ahtm f(ahth ahthVar) {
        return this.ak.j(ahthVar);
    }

    @Override // defpackage.rrb
    public final void g(android.content.Context context) {
        this.b.j();
        try {
            if (this.e) {
                throw new java.lang.IllegalStateException("A Fragment cannot be attached more than once. Instead, create a new Fragment instance.");
            }
            super.g(context);
            if (this.c == null) {
                rra rraVar = (rra) agab.aC(this, rra.class);
                ahoq ahoqVarY = ahvr.Y(753, defpackage.rqu.class, "CreatePeer");
                try {
                    this.c = rraVar.bM();
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
            defpackage.rqz rqzVarY = y();
            defpackage.rqz.a.b().l("com/android/dialer/main/impl/ui/searchcontainer/DialpadSearchFragmentPeer", "onCreate", 107, "DialpadSearchFragmentPeer.kt").v("enter");
            if (bundle != null) {
                rqzVarY.k = java.lang.Long.valueOf(bundle.getLong("intentTimestamp"));
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

    public final void k(android.os.Bundle bundle) {
        this.b.j();
        try {
            java.lang.Long l = y().k;
            if (l != null) {
                bundle.putLong("intentTimestamp", l.longValue());
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

    public final void l() {
        this.b.j();
        try {
            bg();
            y();
            defpackage.rqz.a.b().l("com/android/dialer/main/impl/ui/searchcontainer/DialpadSearchFragmentPeer", "onStart", 237, "DialpadSearchFragmentPeer.kt").v("enter");
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
        this.b.j();
        try {
            bh();
            defpackage.rqz rqzVarY = y();
            defpackage.rqz.a.b().l("com/android/dialer/main/impl/ui/searchcontainer/DialpadSearchFragmentPeer", "onStop", 254, "DialpadSearchFragmentPeer.kt").v("enter");
            rqzVarY.c(mce.eQ);
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

    @Override // defpackage.rrb
    protected final /* synthetic */ amxr p() {
        return new ahgl(this);
    }

    public final void q(java.lang.Class cls, ahtl ahtlVar) {
        this.ak.k(cls, ahtlVar);
    }

    @Override // defpackage.rrb
    public final android.content.Context z() {
        if (super.z() == null) {
            return null;
        }
        return a();
    }
}
