package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class uly extends defpackage.ulk implements ahei, ahtq {
    private final ahda ak = new ahda((byte[]) null, (byte[]) null);
    private defpackage.umd c;
    private android.content.Context d;
    private boolean e;

    public final android.view.View M(android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        this.b.j();
        try {
            bi(layoutInflater);
            defpackage.umd umdVarY = y();
            aooh.f(layoutInflater, "inflater");
            android.view.View viewInflate = layoutInflater.inflate(2131624463, viewGroup, false);
            defpackage.ujp ujpVar = umdVarY.i;
            java.util.Map map = defpackage.ujq.a;
            defpackage.ulz ulzVar = umdVarY.b;
            java.lang.String str = ulzVar.c;
            aooh.e(str, "getAction(...)");
            aooh.f(str, "key");
            java.lang.Object obj = defpackage.ujq.a.get(str);
            if (obj == null) {
                throw new java.lang.IllegalArgumentException("Invalid key: ".concat(java.lang.String.valueOf(str)));
            }
            defpackage.ujq ujqVar = (defpackage.ujq) obj;
            defpackage.uku ukuVar = ulzVar.d;
            if (ukuVar == null) {
                ukuVar = defpackage.uku.a;
            }
            aooh.e(ukuVar, "getNotificationModel(...)");
            aooh.f(ukuVar, "notificationModel");
            defpackage.ujp.a.b().l("com/android/dialer/spamnotification/impl/service/SpamFragmentControllerImpl", "updateFragmentModel", 44, "SpamFragmentControllerImpl.kt").v("enter");
            aimz aimzVar = zih.a;
            aoov.al(ujpVar.c, zih.b.plus(aols.a), 1, new defpackage.ujo(null, ujpVar, ujqVar, ukuVar));
            aooh.c(viewInflate);
            if (viewInflate == null) {
                wsc.bC(this, y());
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

    @Override // defpackage.ulk
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
            wsc.bC(this, y());
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

    @Override // defpackage.ulk
    public final void g(android.content.Context context) {
        this.b.j();
        try {
            if (this.e) {
                throw new java.lang.IllegalStateException("A Fragment cannot be attached more than once. Instead, create a new Fragment instance.");
            }
            super.g(context);
            if (this.c == null) {
                ume umeVar = (ume) agab.aC(this, ume.class);
                ahoq ahoqVarY = ahvr.Y(921, defpackage.uly.class, "CreatePeer");
                try {
                    this.c = umeVar.co();
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
            defpackage.umd umdVarY = y();
            ajwr ajwrVar = umdVarY.j;
            defpackage.uyg uygVar = umdVarY.k;
            ajwrVar.n(new agxo((agab) uygVar.b, new kvx(uygVar, 10), defpackage.ukh.a), umdVarY.h);
            aimz aimzVar = zih.a;
            aoov.al(umdVarY.c, zih.b.plus(aols.a), 1, new defpackage.uke((aoln) null, umdVarY, 3));
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

    @Override // defpackage.ulk
    protected final /* synthetic */ amxr p() {
        return new ahgl(this);
    }

    public final void q(java.lang.Class cls, ahtl ahtlVar) {
        this.ak.k(cls, ahtlVar);
    }

    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public final defpackage.umd y() {
        defpackage.umd umdVar = this.c;
        if (umdVar == null) {
            throw new java.lang.IllegalStateException("peer() called before initialized.");
        }
        if (this.e) {
            throw new java.lang.IllegalStateException("peer() called after destroyed.");
        }
        return umdVar;
    }

    @Override // defpackage.ulk
    public final android.content.Context z() {
        if (super.z() == null) {
            return null;
        }
        return a();
    }
}
