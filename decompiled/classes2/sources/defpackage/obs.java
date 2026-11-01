package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class obs extends defpackage.oca implements ahei, ahtq {
    private final ahda ak = new ahda((byte[]) null, (byte[]) null);
    private defpackage.oby c;
    private android.content.Context d;
    private boolean e;

    public final android.view.View M(android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        this.b.j();
        try {
            bi(layoutInflater);
            android.view.View viewE = y().e(layoutInflater, viewGroup);
            if (viewE == null) {
                pez.aE(this, y());
            }
            ahns.l();
            return viewE;
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

    @Override // defpackage.oca
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
            y().m.e();
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

    /* JADX INFO: Thrown type has an unknown type hierarchy: aaos */
    public final void ak(boolean z) throws aaos {
        defpackage.oby obyVarY = y();
        obyVarY.n = z;
        obyVarY.g(obyVarY.f(), obyVarY.o);
    }

    public final void al() {
        this.b.j();
        try {
            be();
            y();
            defpackage.oby.a.b().l("com/android/dialer/emergencycalling/impl/ui/EmergencyVoiceFragmentPeer", "onPause", 329, "EmergencyVoiceFragmentPeer.kt").v("enter");
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
        defpackage.obf obfVar;
        az azVarC;
        ahpm ahpmVarE = this.b.e();
        try {
            bf();
            defpackage.oby obyVarY = y();
            if (obyVarY.t.a == 2 && (obfVar = obyVarY.o) != null && (azVarC = obyVarY.c()) != null) {
                boolean zB = rhx.b(azVarC);
                defpackage.oby.a.b().l("com/android/dialer/emergencycalling/impl/ui/EmergencyVoiceFragmentPeer", "forceModalAnimationToComplete", 385, "EmergencyVoiceFragmentPeer.kt").v("Animation not finished in onResume(). Forcing it to complete.");
                defpackage.obr obrVar = obyVarY.j;
                defpackage.heq heqVarF = obyVarY.f();
                aimz aimzVar = defpackage.obr.a;
                aimzVar.b().l("com/android/dialer/emergencycalling/impl/ui/EmergencyFeatureModalTransitionWithAnimation", "forceAnimationToFinishImmediately", 338, "EmergencyFeatureModalTransitionWithAnimation.kt").v("enter");
                defpackage.nzp nzpVarAL = pez.aL(obfVar);
                if (nzpVarAL == null) {
                    aimzVar.d().l("com/android/dialer/emergencycalling/impl/ui/EmergencyFeatureModalTransitionWithAnimation", "forceAnimationToFinishImmediately$<anonymous>", 342, "EmergencyFeatureModalTransitionWithAnimation.kt").v("center button is null!");
                } else {
                    heqVarF.ac().setText(nzpVarAL.j);
                    heqVarF.ab().setText(nzpVarAL.k);
                    heqVarF.ac().setVisibility(0);
                    heqVarF.ab().setVisibility(0);
                    heqVarF.ae().setVisibility(0);
                    heqVarF.ae().setAlpha(1.0f);
                    heqVarF.af().setVisibility(8);
                    heqVarF.ag().setVisibility(8);
                    android.widget.ImageButton imageButtonZ = heqVarF.Z();
                    imageButtonZ.setVisibility(0);
                    afsq.F(imageButtonZ, obrVar.b, "EmergencyVoiceFragmentPeer_showModal_onCloseButtonClicked", new defpackage.jjg(obrVar, obfVar, 13));
                    androidx.constraintlayout.widget.ConstraintLayout constraintLayoutAe = heqVarF.ae();
                    aooh.f(constraintLayoutAe, "view");
                    pez.aI(constraintLayoutAe).setVisibility(8);
                    pez.aG(constraintLayoutAe).setVisibility(8);
                    pez.aJ(constraintLayoutAe).setVisibility(0);
                    android.widget.ImageView imageViewAF = pez.aF(constraintLayoutAe);
                    imageViewAF.setVisibility(0);
                    imageViewAF.setImageResource(nzpVarAL.d);
                    imageViewAF.setContentDescription(nzpVarAL.g);
                    android.widget.TextView textViewAH = pez.aH(constraintLayoutAe);
                    textViewAH.setText(nzpVarAL.f);
                    textViewAH.setVisibility(0);
                    int dimensionPixelSize = zB ? ((android.view.View) heqVarF.a).getResources().getDimensionPixelSize(2131167279) : ((android.view.View) heqVarF.a).getResources().getDimensionPixelSize(2131167277);
                    androidx.constraintlayout.widget.ConstraintLayout constraintLayoutAe2 = heqVarF.ae();
                    constraintLayoutAe2.setPadding(constraintLayoutAe2.getPaddingLeft(), constraintLayoutAe2.getPaddingTop(), constraintLayoutAe2.getPaddingRight(), dimensionPixelSize);
                    androidx.constraintlayout.widget.ConstraintLayout constraintLayoutAe3 = heqVarF.ae();
                    dtv layoutParams = constraintLayoutAe3.getLayoutParams();
                    if (layoutParams == null) {
                        throw new java.lang.NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                    }
                    dtv dtvVar = layoutParams;
                    dtvVar.t = 2131428533;
                    dtvVar.u = -1;
                    dtvVar.s = -1;
                    dtvVar.v = 2131428533;
                    constraintLayoutAe3.setLayoutParams(dtvVar);
                    obrVar.c.a = 3;
                    obrVar.d.i(obfVar.g).b(mce.eZ);
                    qbe qbeVarB = obrVar.b(obfVar.g);
                    if (qbeVarB != null) {
                        qbeVarB.a(qbc.gQ);
                    }
                }
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
        this.b.j();
        try {
            ahvr.x(this).a = view;
            y();
            pez.aE(this, y());
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

    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final defpackage.oby y() {
        defpackage.oby obyVar = this.c;
        if (obyVar == null) {
            throw new java.lang.IllegalStateException("peer() called before initialized.");
        }
        if (this.e) {
            throw new java.lang.IllegalStateException("peer() called after destroyed.");
        }
        return obyVar;
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

    @Override // defpackage.oca
    public final void g(android.content.Context context) {
        this.b.j();
        try {
            if (this.e) {
                throw new java.lang.IllegalStateException("A Fragment cannot be attached more than once. Instead, create a new Fragment instance.");
            }
            super.g(context);
            if (this.c == null) {
                obz obzVar = (obz) agab.aC(this, obz.class);
                ahoq ahoqVarY = ahvr.Y(399, defpackage.obs.class, "CreatePeer");
                try {
                    this.c = obzVar.aA();
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

    /* JADX WARN: Type inference failed for: r0v5, types: [aonj, java.lang.Object] */
    public final void h(android.os.Bundle bundle) {
        this.b.j();
        try {
            aW(bundle);
            defpackage.oby obyVarY = y();
            defpackage.obs obsVar = obyVarY.b;
            obsVar.H().fc().d(obsVar, obyVarY.m);
            obyVarY.g.b(obsVar, obyVarY.h);
            if (bundle == null) {
                gpd gpdVar = obyVarY.u;
                j$.util.Optional optionalH = obyVarY.s.h();
                defpackage.nzu nzuVar = new defpackage.nzu(new defpackage.mws(14), 9);
                if (true == optionalH.isPresent()) {
                    optionalH = j$.util.Optional.ofNullable(a.l((aonj) nzuVar.a, optionalH.get()));
                }
                aooh.e(optionalH, "map(...)");
                gpdVar.i((java.lang.String) aooh.q(optionalH)).b(mce.bA);
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
            com.android.dialer.calllocation.ui.LocationView locationViewAh = y().f().ah();
            if (locationViewAh != null) {
                aaky aakyVar = locationViewAh.y().d.a;
                aaog aaogVar = aakyVar.c;
                if (aaogVar != null) {
                    try {
                        android.os.Bundle bundle2 = new android.os.Bundle();
                        aaoo.e(bundle, bundle2);
                        aaom aaomVar = aaogVar.c;
                        android.os.Parcel parcelEP = aaomVar.eP();
                        yld.d(parcelEP, bundle2);
                        android.os.Parcel parcelEQ = aaomVar.eQ(7, parcelEP);
                        if (parcelEQ.readInt() != 0) {
                            bundle2.readFromParcel(parcelEQ);
                        }
                        parcelEQ.recycle();
                        aaoo.e(bundle2, bundle);
                    } catch (android.os.RemoteException e) {
                        throw new aaos(e);
                    }
                } else {
                    android.os.Bundle bundle3 = aakyVar.a;
                    if (bundle3 != null) {
                        bundle.putAll(bundle3);
                    }
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

    public final void l() {
        this.b.j();
        try {
            bg();
            defpackage.oby obyVarY = y();
            defpackage.oby.a.b().l("com/android/dialer/emergencycalling/impl/ui/EmergencyVoiceFragmentPeer", "onStart", 321, "EmergencyVoiceFragmentPeer.kt").v("enter");
            obyVarY.d.m(ruc.i);
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

    /* JADX INFO: Thrown type has an unknown type hierarchy: aaos */
    public final void onLowMemory() throws aaos {
        aaog aaogVar;
        super.onLowMemory();
        com.android.dialer.calllocation.ui.LocationView locationViewAh = y().f().ah();
        if (locationViewAh == null || (aaogVar = locationViewAh.y().d.a.c) == null) {
            return;
        }
        try {
            aaom aaomVar = aaogVar.c;
            aaomVar.eR(6, aaomVar.eP());
        } catch (android.os.RemoteException e) {
            throw new aaos(e);
        }
    }

    @Override // defpackage.oca
    protected final /* synthetic */ amxr p() {
        return new ahgl(this);
    }

    public final void q(java.lang.Class cls, ahtl ahtlVar) {
        this.ak.k(cls, ahtlVar);
    }

    @Override // defpackage.oca
    public final android.content.Context z() {
        if (super.z() == null) {
            return null;
        }
        return a();
    }
}
