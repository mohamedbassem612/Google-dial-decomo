package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class rck extends defpackage.rch implements ahei, aheg, ahgg, ahph {
    private defpackage.rcm ak;
    private android.content.Context al;
    private boolean an;
    private boolean ao;
    private final emy am = new emy(this, true);
    private final ajwa ap = new ajwa(this);

    @java.lang.Deprecated
    public rck() {
        afec.c();
    }

    public final android.view.View M(android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        this.ap.j();
        try {
            this.an = false;
            ahns.l();
            return null;
        } catch (java.lang.Throwable th) {
            try {
                ahns.l();
            } catch (java.lang.Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final ems P() {
        return this.am;
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
        this.ap.i(i, i2);
        ahns.l();
    }

    @Override // defpackage.rch
    protected final /* synthetic */ amxr aV() {
        return new ahgl(this);
    }

    /* JADX INFO: renamed from: aX, reason: merged with bridge method [inline-methods] */
    public final defpackage.rcm y() {
        defpackage.rcm rcmVar = this.ak;
        if (rcmVar == null) {
            throw new java.lang.IllegalStateException("peer() called before initialized.");
        }
        if (this.ao) {
            throw new java.lang.IllegalStateException("peer() called after destroyed.");
        }
        return rcmVar;
    }

    public final ahqz aY() {
        return (ahqz) this.ap.b;
    }

    public final java.util.Locale aZ() {
        return agab.aE(this);
    }

    public final void af(android.os.Bundle bundle) {
        this.ap.j();
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
        ahpm ahpmVarL = this.ap.l();
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

    @Override // defpackage.rch
    public final void ah(android.app.Activity activity) {
        this.ap.j();
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
        ahpm ahpmVarE = this.ap.e();
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
        this.ap.j();
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
        ahpm ahpmVarE = this.ap.e();
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
        this.ap.j();
        try {
            if (!((al) this).c && !this.an) {
                ahvr.x(this).a = view;
                y();
                pez.by(this, y());
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

    public final void av(java.lang.Object obj) {
        ajwa ajwaVar = this.ap;
        if (ajwaVar != null) {
            ajwaVar.k();
        }
        super.av(obj);
    }

    public final void aw(java.lang.Object obj) {
        ajwa ajwaVar = this.ap;
        if (ajwaVar != null) {
            ajwaVar.k();
        }
        super.aw(obj);
    }

    public final void ba(ahqz ahqzVar, boolean z) {
        this.ap.h(ahqzVar, z);
    }

    public final void bb(ahqz ahqzVar) {
        this.ap.c = ahqzVar;
    }

    @Override // defpackage.rch
    public final android.view.LayoutInflater e(android.os.Bundle bundle) {
        this.ap.j();
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
        defpackage.rcm rcmVarY = y();
        android.view.View viewInflate = android.view.LayoutInflater.from(((aw) rcmVarY.a).A()).inflate(2131624096, (android.view.ViewGroup) null, false);
        ((android.widget.TextView) viewInflate.findViewById(2131427799)).setText(2132017759);
        viewInflate.findViewById(2131428780).setVisibility(8);
        defpackage.ahtg ahtgVarD = ((ucm) rcmVarY.b).d();
        ahtgVarD.n(viewInflate);
        ahtgVarD.k(2132017761);
        ahtgVarD.h(2132017760);
        ahtgVarD.d(android.R.string.cancel);
        cy cyVarA = ahtgVarD.a();
        cyVarA.setOnShowListener(new jlg(rcmVarY, 9));
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

    @Override // defpackage.rch
    public final void g(android.content.Context context) {
        this.ap.j();
        try {
            if (this.ao) {
                throw new java.lang.IllegalStateException("A Fragment cannot be attached more than once. Instead, create a new Fragment instance.");
            }
            super.g(context);
            if (this.ak == null) {
                rco rcoVar = (rco) agab.aC(this, rco.class);
                ahoq ahoqVarY = ahvr.Y(685, defpackage.rck.class, "CreatePeer");
                try {
                    this.ak = rcoVar.bv();
                    ahoqVarY.close();
                    ((aw) this).ab.c(new ahfz(this.ap, this.am));
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
                ajwa ajwaVar = this.ap;
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
        this.ap.j();
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
        ahpm ahpmVarE = this.ap.e();
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
        ahpm ahpmVarD = this.ap.d();
        try {
            super.j();
            this.ao = true;
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
        this.ap.j();
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
        this.ap.j();
        try {
            super.l();
            defpackage.ahus.k(this);
            if (((al) this).c) {
                if (!this.an) {
                    ahvr.x(this).a = defpackage.ahus.i(this);
                    y();
                    pez.by(this, y());
                    this.an = true;
                }
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
        this.ap.j();
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
        this.ap.j();
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
        this.ap.g("DialogFragment:onCancel").close();
    }

    public final void onDismiss(android.content.DialogInterface dialogInterface) {
        ahpm ahpmVarG = this.ap.g("DialogFragment:onDismiss");
        try {
            super.onDismiss(dialogInterface);
            j$.util.Optional optionalA = y().a();
            if (true == optionalA.isPresent()) {
                defpackage.qvo qvoVar = (defpackage.qvo) optionalA.get();
                if (qvoVar.e.getAndSet(false)) {
                    qvoVar.h.a(ajcm.a);
                }
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

    @Override // defpackage.rch
    public final android.content.Context z() {
        if (super.z() == null) {
            return null;
        }
        return a();
    }
}
