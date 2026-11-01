package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class laq extends defpackage.lae implements ahei, aheg, ahgg, ahph, ahtq {
    private boolean ak;
    private defpackage.lay c;
    private android.content.Context d;
    private final emy e = new emy(this, true);
    private final ajwa al = new ajwa(this);
    private final ahda am = new ahda((byte[]) null, (byte[]) null);

    @java.lang.Deprecated
    public laq() {
        afec.c();
    }

    @Override // defpackage.ger
    public final android.view.View M(android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        this.al.j();
        try {
            super.M(layoutInflater, viewGroup, bundle);
            defpackage.lay layVarY = y();
            defpackage.lay.a.b().l("com/android/dialer/callrecording/impl/settings/SelectedContactNumbersFragmentPeer", "onCreateView", 304, "SelectedContactNumbersFragmentPeer.java").v("onCreateView");
            layVarY.b.i().i(2132020072);
            android.view.View viewInflate = layoutInflater.inflate(2131624430, viewGroup, false);
            viewInflate.findViewById(2131428921).setOnClickListener(new ahpp(layVarY.e, 249, "Click on recording for selected numbers toggle", new defpackage.jln(layVarY, 19, null), 0));
            android.support.v7.widget.RecyclerView recyclerViewFindViewById = viewInflate.findViewById(2131428773);
            recyclerViewFindViewById.aa(new android.support.v7.widget.LinearLayoutManager(1, false));
            amcn amcnVar = new amcn();
            amcnVar.o(layVarY.k);
            amcnVar.n(new defpackage.kwz(18));
            layVarY.i = amcnVar.m();
            recyclerViewFindViewById.Y(layVarY.i);
            url.a(recyclerViewFindViewById, 519);
            layVarY.q.a(layVarY.c, recyclerViewFindViewById);
            ajwr ajwrVar = layVarY.s;
            defpackage.kwc kwcVar = layVarY.d;
            ajwrVar.n(new agxo(kwcVar.l, new defpackage.kvx(kwcVar, 2), defpackage.kzj.a), layVarY.l);
            if (viewInflate == null) {
                throw new java.lang.IllegalStateException("Fragments without views cannot use Android event listeners such as @OnClick, @OnCheckedChange, @OnLongClick, etc.");
            }
            ahns.l();
            return viewInflate;
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

    public final ems P() {
        return this.e;
    }

    @java.lang.Deprecated
    public final android.content.Context a() {
        if (this.d == null) {
            this.d = new ahgi(this, super.z());
        }
        return this.d;
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
        this.al.i(i, i2);
        ahns.l();
    }

    @Override // defpackage.ger
    public final void aU(java.lang.String str) {
        y();
    }

    @Override // defpackage.lae
    protected final /* synthetic */ amxr aX() {
        return new ahgl(this);
    }

    public final ahqz aY() {
        return (ahqz) this.al.b;
    }

    public final java.util.Locale aZ() {
        return agab.aE(this);
    }

    public final void af(android.os.Bundle bundle) {
        this.al.j();
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
        ahpm ahpmVarL = this.al.l();
        try {
            super.ag(i, i2, intent);
            defpackage.lay layVarY = y();
            if (i == 9 && i2 == -1 && intent.getData() != null) {
                defpackage.lay.a.b().l("com/android/dialer/callrecording/impl/settings/SelectedContactNumbersFragmentPeer", "onActivityResult", 277, "SelectedContactNumbersFragmentPeer.java").v("uri received from system contact picker");
                defpackage.kwc kwcVar = layVarY.d;
                ajbg ajbgVarD = kwcVar.c.d(intent.getData(), new java.lang.String[]{"data1"}, (java.lang.String) null, (java.lang.String[]) null, (java.lang.String) null);
                ajbc ajbcVarE = ahqx.e(new kwb(0));
                ajct ajctVar = kwcVar.e;
                ahrv ahrvVarG = ahrv.g(ahrv.g(ajbgVarD.c(ajbcVarE, ajctVar).h()).i(new defpackage.kvd(kwcVar, 16), ajctVar).h(new defpackage.jvq(17), ajctVar));
                aogc aogcVar = kwcVar.m;
                j$.util.Objects.requireNonNull(aogcVar);
                ahrv ahrvVarI = ahrvVarG.i(new defpackage.kvd(aogcVar, 20), ajctVar).i(new defpackage.kvd(kwcVar, 13), ajctVar).i(new defpackage.kvd(kwcVar, 14), ajctVar);
                kwcVar.k.s(ahrvVarI, defpackage.kzj.a);
                layVarY.g.i(zoe.N(ahrvVarI), layVarY.n);
            }
            ahpmVarL.close();
        } catch (java.lang.Throwable th) {
            try {
                ahpmVarL.close();
                throw th;
            } catch (java.lang.Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
    }

    @Override // defpackage.lae
    public final void ah(android.app.Activity activity) {
        this.al.j();
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
        ahpm ahpmVarE = this.al.e();
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
        this.al.j();
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
        ahpm ahpmVarE = this.al.e();
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

    @Override // defpackage.ger
    public final void ao(android.view.View view, android.os.Bundle bundle) {
        this.al.j();
        try {
            ajwr ajwrVarX = ahvr.x(this);
            ajwrVarX.a = view;
            ajwrVarX.f(((android.view.View) ajwrVarX.a).findViewById(2131427764), new defpackage.jln(y(), 20));
            defpackage.lay layVarY = y();
            ahvr.e(this, defpackage.lal.class, new defpackage.kwp(layVarY, 9));
            ahvr.e(this, defpackage.lax.class, new defpackage.kwp(layVarY, 10));
            super.ao(view, bundle);
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
        ajwa ajwaVar = this.al;
        if (ajwaVar != null) {
            ajwaVar.k();
        }
        super.av(obj);
    }

    public final void aw(java.lang.Object obj) {
        ajwa ajwaVar = this.al;
        if (ajwaVar != null) {
            ajwaVar.k();
        }
        super.aw(obj);
    }

    public final void ba(ahqz ahqzVar, boolean z) {
        this.al.h(ahqzVar, z);
    }

    public final void bb(ahqz ahqzVar) {
        this.al.c = ahqzVar;
    }

    /* JADX INFO: renamed from: bd, reason: merged with bridge method [inline-methods] */
    public final defpackage.lay y() {
        defpackage.lay layVar = this.c;
        if (layVar == null) {
            throw new java.lang.IllegalStateException("peer() called before initialized.");
        }
        if (this.ak) {
            throw new java.lang.IllegalStateException("peer() called after destroyed.");
        }
        return layVar;
    }

    public final android.view.LayoutInflater e(android.os.Bundle bundle) {
        this.al.j();
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
        return this.am.j(ahthVar);
    }

    @Override // defpackage.lae
    public final void g(android.content.Context context) {
        this.al.j();
        try {
            if (this.ak) {
                throw new java.lang.IllegalStateException("A Fragment cannot be attached more than once. Instead, create a new Fragment instance.");
            }
            super.g(context);
            if (this.c == null) {
                laz lazVar = (laz) agab.aC(this, laz.class);
                ahoq ahoqVarY = ahvr.Y(248, defpackage.laq.class, "CreatePeer");
                try {
                    this.c = lazVar.Y();
                    ahoqVarY.close();
                    ((aw) this).ab.c(new ahfz(this.al, this.e));
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
                ajwa ajwaVar = this.al;
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

    @Override // defpackage.ger
    public final void h(android.os.Bundle bundle) {
        this.al.j();
        try {
            super.h(bundle);
            defpackage.lay layVarY = y();
            defpackage.lay.a.b().l("com/android/dialer/callrecording/impl/settings/SelectedContactNumbersFragmentPeer", "onCreate", 267, "SelectedContactNumbersFragmentPeer.java").v("onCreate");
            agtj agtjVar = layVarY.g;
            agtjVar.h(layVarY.m);
            agtjVar.h(layVarY.n);
            agtjVar.h(layVarY.o);
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

    @Override // defpackage.ger
    public final void i() {
        ahpm ahpmVarE = this.al.e();
        try {
            super.i();
            if (((aw) this).Q == null) {
                this.am.l();
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
        ahpm ahpmVarD = this.al.d();
        try {
            super.j();
            this.ak = true;
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

    @Override // defpackage.ger
    public final void k(android.os.Bundle bundle) {
        this.al.j();
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

    @Override // defpackage.ger
    public final void l() {
        this.al.j();
        try {
            super.l();
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

    @Override // defpackage.ger
    public final void m() {
        this.al.j();
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
        this.al.j();
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

    public final void q(java.lang.Class cls, ahtl ahtlVar) {
        this.am.k(cls, ahtlVar);
    }

    @Override // defpackage.lae
    public final android.content.Context z() {
        if (super.z() == null) {
            return null;
        }
        return a();
    }
}
