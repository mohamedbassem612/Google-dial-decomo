package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class nwo extends defpackage.nws implements ahei, aheg, ahgg, ahph {
    private defpackage.nwp ak;
    private android.content.Context al;
    private boolean an;
    private final emy am = new emy(this, true);
    private final ajwa ao = new ajwa(this);

    @java.lang.Deprecated
    public nwo() {
        afec.c();
    }

    public final android.view.View M(android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        this.ao.j();
        ahns.l();
        return null;
    }

    public final ems P() {
        return this.am;
    }

    public final eoq T() {
        eos eosVar = new eos(super.T());
        eosVar.b(env.c, new android.os.Bundle());
        return eosVar;
    }

    @java.lang.Deprecated
    public final android.content.Context a() {
        if (this.al == null) {
            this.al = new ahgi(this, super.z());
        }
        return this.al;
    }

    public final void aD(android.content.Intent intent) {
        agab.aD(intent, z());
        aP(intent);
    }

    public final void aP(android.content.Intent intent) {
        agab.aD(intent, z());
        super.aP(intent);
    }

    public final void aR(int i, int i2) {
        this.ao.i(i, i2);
        ahns.l();
    }

    /* JADX INFO: renamed from: aU, reason: merged with bridge method [inline-methods] */
    public final defpackage.nwp y() {
        defpackage.nwp nwpVar = this.ak;
        if (nwpVar == null) {
            throw new java.lang.IllegalStateException("peer() called before initialized.");
        }
        if (this.an) {
            throw new java.lang.IllegalStateException("peer() called after destroyed.");
        }
        return nwpVar;
    }

    @Override // defpackage.nws
    protected final /* synthetic */ amxr aV() {
        return new ahgl(this);
    }

    public final ahqz aY() {
        return (ahqz) this.ao.b;
    }

    public final java.util.Locale aZ() {
        return agab.aE(this);
    }

    public final void af(android.os.Bundle bundle) {
        this.ao.j();
        try {
            super.af(bundle);
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

    public final void ag(int i, int i2, android.content.Intent intent) {
        ahpm ahpmVarL = this.ao.l();
        try {
            super.ag(i, i2, intent);
            ahpmVarL.close();
        } catch (java.lang.Throwable th) {
            try {
                ahpmVarL.close();
            } catch (java.lang.Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.nws
    public final void ah(android.app.Activity activity) {
        this.ao.j();
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
        ahpm ahpmVarE = this.ao.e();
        try {
            super.ai();
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

    public final void al() {
        this.ao.j();
        try {
            super.al();
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

    public final void an() {
        ahpm ahpmVarE = this.ao.e();
        try {
            super.an();
            defpackage.nwp nwpVarY = y();
            defpackage.nwo nwoVar = nwpVarY.b;
            android.content.Context contextZ = nwoVar.z();
            android.app.KeyguardManager keyguardManager = contextZ != null ? (android.app.KeyguardManager) contextZ.getSystemService(android.app.KeyguardManager.class) : null;
            if (keyguardManager != null && keyguardManager.isKeyguardLocked() && !nwpVarY.e) {
                nwoVar.f();
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

    public final void ao(android.view.View view, android.os.Bundle bundle) {
        this.ao.j();
        ahns.l();
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

    public final void av(java.lang.Object obj) {
        ajwa ajwaVar = this.ao;
        if (ajwaVar != null) {
            ajwaVar.k();
        }
        super.av(obj);
    }

    public final void aw(java.lang.Object obj) {
        ajwa ajwaVar = this.ao;
        if (ajwaVar != null) {
            ajwaVar.k();
        }
        super.aw(obj);
    }

    public final void ba(ahqz ahqzVar, boolean z) {
        this.ao.h(ahqzVar, z);
    }

    public final void bb(ahqz ahqzVar) {
        this.ao.c = ahqzVar;
    }

    @Override // defpackage.nws, defpackage.al
    public final android.view.LayoutInflater e(android.os.Bundle bundle) {
        this.ao.j();
        try {
            android.view.LayoutInflater layoutInflaterE = super.e(bundle);
            android.view.LayoutInflater layoutInflaterCloneInContext = layoutInflaterE.cloneInContext(new ahgi(this, layoutInflaterE));
            ahns.l();
            return layoutInflaterCloneInContext;
        } catch (java.lang.Throwable th) {
            try {
                ahns.l();
            } catch (java.lang.Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.al
    public final android.app.Dialog eb(android.os.Bundle bundle) {
        super.eb(bundle);
        defpackage.nwp nwpVarY = y();
        if (bundle != null) {
            nwpVarY.d = bundle.getBoolean("is_default_checked");
            nwpVarY.e = bundle.getBoolean("was_keyguard_locked_at_start", false);
        } else {
            android.content.Context contextZ = nwpVarY.b.z();
            android.app.KeyguardManager keyguardManager = contextZ != null ? (android.app.KeyguardManager) contextZ.getSystemService(android.app.KeyguardManager.class) : null;
            nwpVarY.e = keyguardManager != null ? keyguardManager.isKeyguardLocked() : false;
        }
        defpackage.nwo nwoVar = nwpVarY.b;
        return defpackage.lvk.aU(nwoVar.z(), nwoVar.H(), nwpVarY.a(), new defpackage.ktq(nwpVarY, 10), nwpVarY.d, new defpackage.gfe(nwpVarY, 5));
    }

    @Override // defpackage.al
    public final void f() {
        ahpm ahpmVarG = ahns.g();
        try {
            super.s(false, false);
            ahpmVarG.close();
        } catch (java.lang.Throwable th) {
            try {
                ahpmVarG.close();
            } catch (java.lang.Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.nws, defpackage.al
    public final void g(android.content.Context context) {
        this.ao.j();
        try {
            if (this.an) {
                throw new java.lang.IllegalStateException("A Fragment cannot be attached more than once. Instead, create a new Fragment instance.");
            }
            super.g(context);
            if (this.ak == null) {
                nwq nwqVar = (nwq) agab.aC(this, nwq.class);
                ahoq ahoqVarY = ahvr.Y(386, defpackage.nwo.class, "CreatePeer");
                try {
                    this.ak = nwqVar.az();
                    ahoqVarY.close();
                    ((aw) this).ab.c(new ahfz(this.ao, this.am));
                } catch (java.lang.Throwable th) {
                    try {
                        ahoqVarY.close();
                    } catch (java.lang.Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }
            ahph ahphVar = ((aw) this).E;
            if (ahphVar instanceof ahph) {
                ajwa ajwaVar = this.ao;
                if (ajwaVar.b == null) {
                    ajwaVar.h(ahphVar.aY(), true);
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

    @Override // defpackage.al
    public final void h(android.os.Bundle bundle) {
        this.ao.j();
        try {
            super.h(bundle);
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

    @Override // defpackage.al
    public final void i() {
        ahpm ahpmVarE = this.ao.e();
        try {
            super.i();
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

    @Override // defpackage.al
    public final void j() {
        ahpm ahpmVarD = this.ao.d();
        try {
            super.j();
            this.an = true;
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

    @Override // defpackage.al
    public final void k(android.os.Bundle bundle) {
        this.ao.j();
        try {
            super.k(bundle);
            defpackage.nwp nwpVarY = y();
            bundle.putBoolean("is_default_checked", nwpVarY.d);
            bundle.putBoolean("was_keyguard_locked_at_start", nwpVarY.e);
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

    @Override // defpackage.al
    public final void l() {
        this.ao.j();
        try {
            super.l();
            defpackage.nwo nwoVar = y().b;
            defpackage.lvk.aW(nwoVar.z(), nwoVar.c());
            ahus.k(this);
            if (this.c) {
                ahus.j(this);
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

    @Override // defpackage.al
    public final void m() {
        this.ao.j();
        try {
            super.m();
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

    @Override // defpackage.al
    public final void n(android.os.Bundle bundle) {
        this.ao.j();
        try {
            super.n(bundle);
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

    @Override // defpackage.al, android.content.DialogInterface.OnCancelListener
    public final void onCancel(android.content.DialogInterface dialogInterface) {
        this.ao.g("DialogFragment:onCancel").close();
    }

    @Override // defpackage.al, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(android.content.DialogInterface dialogInterface) {
        ahpm ahpmVarG = this.ao.g("DialogFragment:onDismiss");
        try {
            super.onDismiss(dialogInterface);
            defpackage.nwp nwpVarY = y();
            aooh.f(dialogInterface, "dialog");
            if (!nwpVarY.c) {
                ahvr.i(new zsy(), nwpVarY.b);
            }
            ahpmVarG.close();
        } catch (java.lang.Throwable th) {
            try {
                ahpmVarG.close();
            } catch (java.lang.Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.nws
    public final android.content.Context z() {
        if (super.z() == null) {
            return null;
        }
        return a();
    }
}
