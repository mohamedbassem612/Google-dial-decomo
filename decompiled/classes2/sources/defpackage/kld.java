package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class kld extends defpackage.kmk implements ahei, ahtq {
    private final ahda ak = new ahda((byte[]) null, (byte[]) null);
    private defpackage.klo c;
    private android.content.Context d;
    private boolean e;

    public final android.view.View M(android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        this.b.j();
        try {
            bi(layoutInflater);
            defpackage.klo kloVarY = y();
            ahoq ahoqVarW = ahvr.W(202, "CallLogFragmentPeer_onCreateView");
            try {
                defpackage.klo.a.b().l("com/android/dialer/calllog/ui/CallLogFragmentPeer", "onCreateView", 436, "CallLogFragmentPeer.java").v("onCreateView");
                defpackage.kld kldVar = kloVarY.f;
                epq.a(kldVar.z()).b(kloVarY.v, new android.content.IntentFilter("action_delete_call_log_item_requested"));
                int i = 2131624053;
                if (((java.lang.Boolean) kloVarY.o.a()).booleanValue() && kloVarY.k.a(kloVarY.b)) {
                    i = 2131624054;
                }
                android.view.View viewInflate = layoutInflater.inflate(i, viewGroup, false);
                kloVarY.x = viewInflate.findViewById(2131427670);
                kloVarY.x.Z((km) null);
                rai raiVar = kloVarY.Q;
                android.support.v7.widget.RecyclerView recyclerView = kloVarY.x;
                java.lang.Object obj = raiVar.a;
                jys jysVarH = ((hir) obj).b.H();
                defpackage.him himVar = ((hir) obj).a;
                kloVarY.z = new defpackage.kla(jysVarH, (gpd) himVar.fD.a(), (rlv) himVar.fq.a(), recyclerView);
                kloVarY.y = kldVar.G().findViewById(2131428497);
                if (rhx.b(kloVarY.b)) {
                    kloVarY.h.d(kloVarY.x, ruc.m);
                } else {
                    kloVarY.h.d(kloVarY.x, ruc.k);
                }
                kloVarY.x.au(new defpackage.kln(kloVarY));
                kloVarY.I.e(kldVar);
                ajwr ajwrVar = kloVarY.M;
                kew kewVar = kloVarY.F;
                ajwrVar.n(new agxo(kewVar.f, new defpackage.kvx(kewVar, 1), agxz.b(aihd.r(kew.b, jyy.b))), kloVarY.u);
                ahoqVarW.close();
                if (viewInflate == null) {
                    defpackage.hgu.z(this, y());
                }
                ahns.l();
                return viewInflate;
            } catch (java.lang.Throwable th) {
                try {
                    ahoqVarW.close();
                } catch (java.lang.Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (java.lang.Throwable th3) {
            try {
                ahns.l();
            } catch (java.lang.Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    @java.lang.Deprecated
    public final android.content.Context a() {
        if (this.d == null) {
            this.d = new ahgi(this, super.z());
        }
        return this.d;
    }

    @Override // defpackage.kmk
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

    public final void aj(boolean z) {
        defpackage.klo kloVarY = y();
        defpackage.klo.a.b().l("com/android/dialer/calllog/ui/CallLogFragmentPeer", "onHiddenChanged", 511, "CallLogFragmentPeer.java").y("hidden = %b", java.lang.Boolean.valueOf(z));
        if (z) {
            kloVarY.c();
        } else {
            kloVarY.d();
        }
    }

    public final void al() {
        this.b.j();
        try {
            be();
            defpackage.klo kloVarY = y();
            defpackage.klo.a.b().l("com/android/dialer/calllog/ui/CallLogFragmentPeer", "onPause", 521, "CallLogFragmentPeer.java").v("onPause");
            kloVarY.c();
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
        ahpm ahpmVarE = this.b.e();
        try {
            bf();
            defpackage.klo kloVarY = y();
            ahoq ahoqVarW = ahvr.W(204, "CallLogFragmentPeer_onResume");
            try {
                defpackage.kld kldVar = kloVarY.f;
                boolean zAH = kldVar.aH();
                aimz aimzVar = defpackage.klo.a;
                aimzVar.b().l("com/android/dialer/calllog/ui/CallLogFragmentPeer", "onResume", 487, "CallLogFragmentPeer.java").y("isHidden = %b", java.lang.Boolean.valueOf(zAH));
                if (zAH) {
                    android.view.View view = ((aw) kldVar).Q;
                    if (view != null && view.getVisibility() == 0) {
                        aimzVar.b().l("com/android/dialer/calllog/ui/CallLogFragmentPeer", "onResume", 494, "CallLogFragmentPeer.java").v("CallLogFragment is hidden but root view is visible");
                        kloVarY.g.o(rmx.sA);
                    }
                } else {
                    kloVarY.d();
                }
                ahoqVarW.close();
                ahpmVarE.close();
            } catch (java.lang.Throwable th) {
                try {
                    ahoqVarW.close();
                } catch (java.lang.Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (java.lang.Throwable th3) {
            try {
                ahpmVarE.close();
            } catch (java.lang.Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    public final void ao(android.view.View view, android.os.Bundle bundle) {
        this.b.j();
        try {
            ahvr.x(this).a = view;
            y();
            defpackage.hgu.z(this, y());
            aooh.f(view, "view");
            y();
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

    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final defpackage.klo y() {
        defpackage.klo kloVar = this.c;
        if (kloVar == null) {
            throw new java.lang.IllegalStateException("peer() called before initialized.");
        }
        if (this.e) {
            throw new java.lang.IllegalStateException("peer() called after destroyed.");
        }
        return kloVar;
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

    @Override // defpackage.kmk
    public final void g(android.content.Context context) {
        this.b.j();
        try {
            if (this.e) {
                throw new java.lang.IllegalStateException("A Fragment cannot be attached more than once. Instead, create a new Fragment instance.");
            }
            super.g(context);
            if (this.c == null) {
                klp klpVar = (klp) agab.aC(this, klp.class);
                ahoq ahoqVarY = ahvr.Y(199, defpackage.kld.class, "CreatePeer");
                try {
                    this.c = klpVar.J();
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
            defpackage.klo kloVarY = y();
            ahoq ahoqVarW = ahvr.W(201, "CallLogFragmentPeer_onCreate");
            try {
                defpackage.klo.a.b().l("com/android/dialer/calllog/ui/CallLogFragmentPeer", "onCreate", 404, "CallLogFragmentPeer.java").v("onCreate");
                defpackage.kld kldVar = kloVarY.f;
                android.content.Context contextZ = kldVar.z();
                ahvr.ci(contextZ);
                epq.a(contextZ).b(kloVarY.w, new android.content.IntentFilter("action_history_button_clicked"));
                agtj agtjVar = kloVarY.j;
                agtjVar.h(kloVarY.s);
                agtjVar.h(kloVarY.t);
                kloVarY.B = defpackage.lpa.a(kldVar.I(), "CallLogFragmentPeer.deleteAllCalls");
                kloVarY.C = defpackage.lpa.a(kldVar.I(), "CallLogFragmentPeer.deleteCallLogItem");
                ahoqVarW.close();
                ahns.l();
            } catch (java.lang.Throwable th) {
                try {
                    ahoqVarW.close();
                } catch (java.lang.Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (java.lang.Throwable th3) {
            try {
                ahns.l();
            } catch (java.lang.Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    public final void i() {
        ahpm ahpmVarE = this.b.e();
        try {
            bc();
            defpackage.klo kloVarY = y();
            defpackage.klo.a.b().l("com/android/dialer/calllog/ui/CallLogFragmentPeer", "onDestroyView", 536, "CallLogFragmentPeer.java").v("enter");
            epq.a(kloVarY.f.z()).c(kloVarY.v);
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
            defpackage.klo kloVarY = y();
            defpackage.klo.a.b().l("com/android/dialer/calllog/ui/CallLogFragmentPeer", "onDetach", 543, "CallLogFragmentPeer.java").v("onDetach");
            android.content.Context contextZ = kloVarY.f.z();
            ahvr.ci(contextZ);
            epq.a(contextZ).c(kloVarY.w);
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

    /* JADX WARN: Code duplicated, block: B:12:0x0059 A[Catch: all -> 0x006f, TRY_LEAVE, TryCatch #1 {all -> 0x006f, blocks: (B:3:0x0005, B:5:0x001a, B:7:0x0028, B:9:0x0035, B:10:0x004b, B:12:0x0059), top: B:23:0x0005 }] */
    public final void l() {
        this.b.j();
        try {
            bg();
            defpackage.klo kloVarY = y();
            if (((java.lang.Boolean) kloVarY.p.a()).booleanValue() || ((java.lang.Boolean) kloVarY.q.a()).booleanValue()) {
                agsm.i(205, kloVarY.O.R(defpackage.oqt.DIALER_HATS_RECENTS_TAB_STARTED), "failed to log Recents tab started HaTS event", new java.lang.Object[0]);
            } else {
                j$.util.Optional optionalG = kloVarY.K.g();
                if (true == optionalG.isPresent()) {
                    optionalG = j$.util.Optional.ofNullable(java.lang.Boolean.valueOf(((gat) ((tkl) optionalG.get()).b).B()));
                }
                if (((java.lang.Boolean) optionalG.orElse(java.lang.Boolean.FALSE)).booleanValue()) {
                    agsm.i(205, kloVarY.O.R(defpackage.oqt.DIALER_HATS_RECENTS_TAB_STARTED), "failed to log Recents tab started HaTS event", new java.lang.Object[0]);
                }
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
        this.b.j();
        try {
            bh();
            defpackage.klo kloVarY = y();
            defpackage.klo.a.b().l("com/android/dialer/calllog/ui/CallLogFragmentPeer", "onStop", 528, "CallLogFragmentPeer.java").v("onStop");
            kh khVar = kloVarY.x.m;
            if (khVar != null) {
                defpackage.klc klcVar = (defpackage.klc) khVar;
                rlv rlvVar = klcVar.a;
                qqo qqoVar = klcVar.k;
                rlvVar.b(new rlu(qqoVar.b, qqoVar.a, klcVar.h));
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

    @Override // defpackage.kmk
    protected final /* synthetic */ amxr p() {
        return new ahgl(this);
    }

    public final void q(java.lang.Class cls, ahtl ahtlVar) {
        this.ak.k(cls, ahtlVar);
    }

    @Override // defpackage.kmk
    public final android.content.Context z() {
        if (super.z() == null) {
            return null;
        }
        return a();
    }
}
