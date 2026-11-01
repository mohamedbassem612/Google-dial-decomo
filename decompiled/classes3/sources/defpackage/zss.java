package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class zss extends defpackage.zsn implements ahei, ahtq {
    private final ahda ak = new ahda((byte[]) null, (byte[]) null);
    private defpackage.zsu c;
    private android.content.Context d;
    private boolean e;

    public final android.view.View M(android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        this.b.j();
        try {
            bi(layoutInflater);
            y();
            android.view.View viewInflate = layoutInflater.inflate(2131624256, viewGroup, false);
            if (viewInflate == null) {
                aehj.ce(this, y());
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

    @Override // defpackage.zsn
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
            aehj.ce(this, y());
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

    @Override // defpackage.zsn
    public final void g(android.content.Context context) {
        this.b.j();
        try {
            if (this.e) {
                throw new java.lang.IllegalStateException("A Fragment cannot be attached more than once. Instead, create a new Fragment instance.");
            }
            super.g(context);
            if (this.c == null) {
                zsv zsvVar = (zsv) agab.aC(this, zsv.class);
                ahoq ahoqVarY = ahvr.Y(1239, defpackage.zss.class, "CreatePeer");
                try {
                    this.c = zsvVar.cT();
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
        defpackage.zrx zrxVar;
        this.b.j();
        try {
            aW(bundle);
            defpackage.zsu zsuVarY = y();
            if (bundle == null) {
                defpackage.zss zssVar = zsuVarY.c;
                int i = ((aw) zssVar).m.getInt("ACTION_POSITION_KEY");
                zsuVarY.h = i;
                zsuVarY.e.a(i).a(zsuVarY.b).r(zssVar.I(), "PRECALL_ACTION_DIALOG_TAG");
            } else {
                zsuVarY.h = bundle.getInt("ACTION_POSITION_KEY", 0);
                try {
                    zrxVar = (defpackage.zrx) defpackage.akmr.m(bundle, "CALL_PARAMETER_KEY", defpackage.zrx.a, akzq.a());
                } catch (alaz e) {
                    a.by(defpackage.zsu.a.c(), "Failed to parse CallParameter", "com/google/android/dialershared/precall/impl/PrecallFragmentPeer", "getCallParameter", 'g', "PrecallFragmentPeer.java", e);
                    zrxVar = defpackage.zrx.a;
                }
                zsuVarY.b = zrxVar;
            }
            defpackage.zsu.a.b().l("com/google/android/dialershared/precall/impl/PrecallFragmentPeer", "onCreate", 91, "PrecallFragmentPeer.java").w("start precall UI at %d", zsuVarY.h);
            zsuVarY.d.h(zsuVarY.g);
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
            defpackage.zsu zsuVarY = y();
            bundle.putInt("ACTION_POSITION_KEY", zsuVarY.h);
            bundle.putParcelable("CALL_PARAMETER_KEY", new com.google.protobuf.contrib.android.ProtoParsers.InternalDontUse((byte[]) null, zsuVarY.b));
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

    @Override // defpackage.zsn
    protected final /* synthetic */ amxr p() {
        return new ahgl(this);
    }

    public final void q(java.lang.Class cls, ahtl ahtlVar) {
        this.ak.k(cls, ahtlVar);
    }

    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public final defpackage.zsu y() {
        defpackage.zsu zsuVar = this.c;
        if (zsuVar == null) {
            throw new java.lang.IllegalStateException("peer() called before initialized.");
        }
        if (this.e) {
            throw new java.lang.IllegalStateException("peer() called after destroyed.");
        }
        return zsuVar;
    }

    @Override // defpackage.zsn
    public final android.content.Context z() {
        if (super.z() == null) {
            return null;
        }
        return a();
    }
}
