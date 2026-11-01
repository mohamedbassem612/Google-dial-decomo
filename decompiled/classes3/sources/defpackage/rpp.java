package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class rpp extends defpackage.rps implements ahei, aheg, ahgg, ahph {
    private android.content.Context ak;
    private boolean am;
    private hgw ao;
    private final emy al = new emy(this, true);
    private final ajwa an = new ajwa(this);

    @java.lang.Deprecated
    public rpp() {
        afec.c();
    }

    public static defpackage.rpp aU() {
        defpackage.rpp rppVar = new defpackage.rpp();
        amxr.g(rppVar);
        return rppVar;
    }

    public final android.view.View M(android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        this.an.j();
        ahns.l();
        return null;
    }

    public final ems P() {
        return this.al;
    }

    @java.lang.Deprecated
    public final android.content.Context a() {
        if (this.ak == null) {
            this.ak = new ahgi(this, super.z());
        }
        return this.ak;
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
        this.an.i(i, i2);
        ahns.l();
    }

    @Override // defpackage.rps
    protected final /* synthetic */ amxr aV() {
        return new ahgl(this);
    }

    /* JADX INFO: renamed from: aW, reason: merged with bridge method [inline-methods] */
    public final hgw y() {
        hgw hgwVar = this.ao;
        if (hgwVar == null) {
            throw new java.lang.IllegalStateException("peer() called before initialized.");
        }
        if (this.am) {
            throw new java.lang.IllegalStateException("peer() called after destroyed.");
        }
        return hgwVar;
    }

    public final ahqz aY() {
        return (ahqz) this.an.b;
    }

    public final java.util.Locale aZ() {
        return agab.aE(this);
    }

    public final void af(android.os.Bundle bundle) {
        this.an.j();
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
        ahpm ahpmVarL = this.an.l();
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

    @Override // defpackage.rps
    public final void ah(android.app.Activity activity) {
        this.an.j();
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
        ahpm ahpmVarE = this.an.e();
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
        this.an.j();
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
        ahpm ahpmVarE = this.an.e();
        try {
            super.an();
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
        this.an.j();
        ahns.l();
    }

    public final void av(java.lang.Object obj) {
        ajwa ajwaVar = this.an;
        if (ajwaVar != null) {
            ajwaVar.k();
        }
        super.av(obj);
    }

    public final void aw(java.lang.Object obj) {
        ajwa ajwaVar = this.an;
        if (ajwaVar != null) {
            ajwaVar.k();
        }
        super.aw(obj);
    }

    public final void ba(ahqz ahqzVar, boolean z) {
        this.an.h(ahqzVar, z);
    }

    public final void bb(ahqz ahqzVar) {
        this.an.c = ahqzVar;
    }

    @Override // defpackage.rps
    public final android.view.LayoutInflater e(android.os.Bundle bundle) {
        this.an.j();
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

    public final android.app.Dialog eb(android.os.Bundle bundle) {
        super.eb(bundle);
        defpackage.ahtg ahtgVarD = ((ucm) y().a).d();
        ahtgVarD.b(2132018290);
        cy cyVarA = ahtgVarD.a();
        aooh.e(cyVarA, "create(...)");
        return cyVarA;
    }

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

    @Override // defpackage.rps
    public final void g(android.content.Context context) {
        this.an.j();
        try {
            if (this.am) {
                throw new java.lang.IllegalStateException("A Fragment cannot be attached more than once. Instead, create a new Fragment instance.");
            }
            super.g(context);
            if (this.ao == null) {
                rpq rpqVar = (rpq) agab.aC(this, rpq.class);
                ahoq ahoqVarY = ahvr.Y(748, defpackage.rpp.class, "CreatePeer");
                try {
                    this.ao = rpqVar.dA();
                    ahoqVarY.close();
                    ((aw) this).ab.c(new ahfz(this.an, this.al));
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
                ajwa ajwaVar = this.an;
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

    public final void h(android.os.Bundle bundle) {
        this.an.j();
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

    public final void i() {
        ahpm ahpmVarE = this.an.e();
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

    public final void j() {
        ahpm ahpmVarD = this.an.d();
        try {
            super.j();
            this.am = true;
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
        this.an.j();
        try {
            super.k(bundle);
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
        this.an.j();
        try {
            super.l();
            defpackage.ahus.k(this);
            if (((al) this).c) {
                defpackage.ahus.j(this);
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

    public final void m() {
        this.an.j();
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

    public final void n(android.os.Bundle bundle) {
        this.an.j();
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

    public final void onCancel(android.content.DialogInterface dialogInterface) {
        this.an.g("DialogFragment:onCancel").close();
    }

    public final void onDismiss(android.content.DialogInterface dialogInterface) {
        ahpm ahpmVarG = this.an.g("DialogFragment:onDismiss");
        try {
            super.onDismiss(dialogInterface);
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

    @Override // defpackage.rps
    public final android.content.Context z() {
        if (super.z() == null) {
            return null;
        }
        return a();
    }
}
