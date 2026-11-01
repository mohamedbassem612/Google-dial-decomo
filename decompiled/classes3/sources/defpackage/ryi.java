package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class ryi extends defpackage.ryo implements ahei {
    private defpackage.ryl c;
    private android.content.Context d;
    private boolean e;

    public final android.view.View M(android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        this.b.j();
        try {
            bi(layoutInflater);
            final defpackage.ryl rylVarY = y();
            aooh.f(layoutInflater, "inflater");
            if (!((java.lang.Boolean) rylVarY.h.a()).booleanValue()) {
                rylVarY.c.b(rylVarY.o);
            }
            androidx.compose.ui.platform.ComposeView composeView = new androidx.compose.ui.platform.ComposeView(rylVarY.b.A(), (android.util.AttributeSet) null, 0, 6, (aooc) null);
            if (((java.lang.Boolean) rylVarY.i.a()).booleanValue()) {
                composeView.k(dgi.a);
            }
            composeView.a(new cja(2137564232, true, new aonn() { // from class: ryj
                /* JADX INFO: Thrown type has an unknown type hierarchy: aois */
                /* JADX WARN: Code duplicated, block: B:121:0x0254  */
                /* JADX WARN: Code duplicated, block: B:122:0x0259  */
                /* JADX WARN: Code duplicated, block: B:125:0x0279  */
                /* JADX WARN: Code duplicated, block: B:126:0x027e  */
                /* JADX WARN: Code duplicated, block: B:128:0x0284  */
                /* JADX WARN: Code duplicated, block: B:129:0x0289  */
                /* JADX WARN: Code duplicated, block: B:131:0x028f  */
                /* JADX WARN: Code duplicated, block: B:132:0x0294  */
                /* JADX WARN: Code duplicated, block: B:135:0x02b8  */
                /* JADX WARN: Code duplicated, block: B:136:0x02bb  */
                /* JADX WARN: Code duplicated, block: B:35:0x00d2  */
                /* JADX WARN: Code duplicated, block: B:98:0x01d5  */
                /* JADX WARN: Type inference failed for: r3v3, types: [cer, java.lang.Object] */
                public final java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) throws aois {
                    java.lang.Integer numValueOf;
                    defpackage.seh sehVar;
                    java.lang.String str;
                    defpackage.ryt rytVar;
                    android.net.Uri uri;
                    boolean z;
                    int iL;
                    float fFloatValue;
                    float fFloatValue2;
                    float fFloatValue3;
                    boolean z2;
                    defpackage.ryq ryqVar;
                    defpackage.abxs abxsVarG;
                    defpackage.abxs abxsVarG2;
                    java.lang.String str2;
                    java.lang.Object next;
                    agoq agoqVar;
                    defpackage.abxs abxsVarG3;
                    defpackage.abxs abxsVarG4;
                    defpackage.abxs abxsVarG5;
                    defpackage.amml ammlVar;
                    cav cavVar = (cav) obj;
                    int iIntValue = ((java.lang.Integer) obj2).intValue();
                    if (cavVar.H((iIntValue & 3) != 2, iIntValue & 1)) {
                        defpackage.ryl rylVar = rylVarY;
                        cer cerVarH = dzo.h(rylVar.k.d, (emq) null, cavVar, 0, 7);
                        defpackage.ahae ahaeVar = (defpackage.ahae) rylVar.p.a.a();
                        boolean zY = a.y(cerVarH);
                        boolean zD = cavVar.D(rylVar);
                        java.lang.Object objG = cavVar.g();
                        if (zD || objG == cau.a) {
                            objG = new gbp(rylVar, 20, (char[]) null, (byte[]) null);
                            cavVar.w(objG);
                        }
                        aonj aonjVar = (aonj) objG;
                        boolean zD2 = cavVar.D(rylVar);
                        java.lang.Object objG2 = cavVar.g();
                        if (zD2 || objG2 == cau.a) {
                            objG2 = new ovt(rylVar, 5, (boolean[]) null);
                            cavVar.w(objG2);
                        }
                        defpackage.ryp rypVar = rylVar.d;
                        aomy aomyVar = (aomy) objG2;
                        aooh.f(ahaeVar, "snapshot");
                        aooh.f(aonjVar, "onDone");
                        aooh.f(aomyVar, "toEditor");
                        aoin aoinVar = rypVar.e;
                        defpackage.abxt abxtVar = ((java.lang.Boolean) aoinVar.a()).booleanValue() ? rypVar.c.a().c : rypVar.d;
                        defpackage.abxr abxrVarF = defpackage.abxl.f(abxtVar);
                        if (abxrVarF == null) {
                            numValueOf = null;
                        } else {
                            if ((abxrVarF.b & 1) != 0) {
                                ammlVar = abxrVarF.c;
                                if (ammlVar == null) {
                                    ammlVar = defpackage.amml.a;
                                }
                            } else {
                                ammlVar = null;
                            }
                            if (ammlVar != null) {
                                float f = ammlVar.c;
                                float f2 = ammlVar.d;
                                float f3 = ammlVar.e;
                                akzv akzvVar = ammlVar.f;
                                if (akzvVar == null) {
                                    akzvVar = akzv.a;
                                }
                                numValueOf = java.lang.Integer.valueOf(cfd.L(cfd.R(f, f2, f3, akzvVar.b, (crn) null, 16)));
                            } else {
                                numValueOf = null;
                            }
                        }
                        defpackage.abxp abxpVarE = defpackage.abxl.e(abxtVar);
                        java.lang.Float fValueOf = (abxpVarE == null || (abxsVarG5 = defpackage.abxl.g(abxpVarE)) == null) ? null : java.lang.Float.valueOf(abxsVarG5.c);
                        defpackage.abxp abxpVarE2 = defpackage.abxl.e(abxtVar);
                        java.lang.Float fValueOf2 = (abxpVarE2 == null || (abxsVarG4 = defpackage.abxl.g(abxpVarE2)) == null) ? null : java.lang.Float.valueOf(abxsVarG4.d);
                        defpackage.abxp abxpVarE3 = defpackage.abxl.e(abxtVar);
                        java.lang.Float fValueOf3 = (abxpVarE3 == null || (abxsVarG3 = defpackage.abxl.g(abxpVarE3)) == null) ? null : java.lang.Float.valueOf(abxsVarG3.e);
                        aokv aokvVar = new aokv(10);
                        if (numValueOf == null) {
                            aokvVar.add("fontColor");
                        }
                        if (fValueOf == null) {
                            aokvVar.add("scale");
                        }
                        if (fValueOf2 == null) {
                            aokvVar.add("translationX");
                        }
                        if (fValueOf3 == null) {
                            aokvVar.add("translationY");
                        }
                        java.util.List listAX = ajsz.aX(aokvVar);
                        if (!listAX.isEmpty()) {
                            defpackage.ryp.a.c().m(aioa.b).l("com/android/dialer/patrick/account/sharing/ui/compose/CallingCardSharingUiAdapter", "createUiData", 88, "CallingCardSharingUiAdapter.kt").y("Required property was missing in PatrickData: %s", listAX);
                        }
                        j$.util.Objects.checkIndex(0, 4);
                        if (ahaeVar != null) {
                            if (ahaeVar instanceof defpackage.ahac) {
                                ryqVar = null;
                            } else {
                                if (ahaeVar instanceof defpackage.ahad) {
                                    sehVar = (defpackage.seh) ((defpackage.ahad) ahaeVar).a;
                                } else if (ahaeVar instanceof defpackage.ahab) {
                                    defpackage.ryp.a.c().k(((defpackage.ahab) ahaeVar).a).l("com/android/dialer/patrick/account/sharing/ui/compose/CallingCardSharingUiAdapter", "createUiData", 99, "CallingCardSharingUiAdapter.kt").v("Error loading Calling card sharing UI model.");
                                    sehVar = null;
                                }
                                if (sehVar == null || (agoqVar = sehVar.a) == null || (str = agoqVar.d) == null) {
                                    str = "";
                                }
                                java.lang.String str3 = str;
                                java.lang.String str4 = sehVar != null ? sehVar.c : null;
                                if (sehVar != null) {
                                    java.util.Iterator it = rypVar.g.iterator();
                                    do {
                                        if (!it.hasNext()) {
                                            next = null;
                                            break;
                                        }
                                        next = it.next();
                                    } while (((defpackage.ryt) next).a != sehVar.b);
                                    rytVar = (defpackage.ryt) next;
                                    if (rytVar == null) {
                                        rytVar = (defpackage.ryt) ajsz.bE(rypVar.g);
                                    }
                                } else {
                                    rytVar = (defpackage.ryt) ajsz.bE(rypVar.g);
                                }
                                obp obpVar = new obp(rypVar, str3, str4, 10, (char[]) null);
                                defpackage.abxp abxpVarE4 = defpackage.abxl.e(abxtVar);
                                if (abxpVarE4 == null || (abxsVarG2 = defpackage.abxl.g(abxpVarE4)) == null || (str2 = abxsVarG2.f) == null) {
                                    uri = null;
                                } else {
                                    android.net.Uri uri2 = android.net.Uri.parse(str2);
                                    aooh.e(uri2, "parse(...)");
                                    uri = uri2;
                                }
                                defpackage.abxp abxpVarE5 = defpackage.abxl.e(abxtVar);
                                java.lang.String str5 = (abxpVarE5 == null || (abxsVarG = defpackage.abxl.g(abxpVarE5)) == null) ? null : abxsVarG.g;
                                defpackage.abxr abxrVarF2 = defpackage.abxl.f(abxtVar);
                                if (abxrVarF2 != null) {
                                    defpackage.abmv abmvVar = new defpackage.abmv(java.lang.Integer.valueOf(abxrVarF2.f), java.lang.Integer.valueOf(abxrVarF2.g), java.lang.Float.valueOf(abxrVarF2.d), java.lang.Float.valueOf(abxrVarF2.e), java.lang.Float.valueOf(abxrVarF2.h));
                                    z = true;
                                    defpackage.abmv abmvVar2 = true == abmvVar.a() ? abmvVar : null;
                                    if (numValueOf != null) {
                                        iL = numValueOf.intValue();
                                    } else {
                                        float f4 = defpackage.smf.a;
                                        iL = cfd.L(defpackage.smf.m << 32);
                                    }
                                    defpackage.slh slhVar = new defpackage.slh(uri, str5, str3, abmvVar2, iL, null, false, null, true);
                                    if (fValueOf != null) {
                                        fFloatValue = fValueOf.floatValue();
                                    } else {
                                        fFloatValue = defpackage.abjl.a.b;
                                    }
                                    if (fValueOf2 != null) {
                                        fFloatValue2 = fValueOf2.floatValue();
                                    } else {
                                        fFloatValue2 = defpackage.abjl.a.c;
                                    }
                                    if (fValueOf3 != null) {
                                        fFloatValue3 = fValueOf3.floatValue();
                                    } else {
                                        fFloatValue3 = defpackage.abjl.a.d;
                                    }
                                    defpackage.abjl abjlVar = new defpackage.abjl(fFloatValue, fFloatValue2, fFloatValue3);
                                    java.util.List list = rypVar.g;
                                    java.lang.Object objA = aoinVar.a();
                                    aooh.e(objA, "get(...)");
                                    boolean zBooleanValue = ((java.lang.Boolean) objA).booleanValue();
                                    if (rypVar.c.c.c() == defpackage.sjg.a) {
                                        z2 = z;
                                    } else {
                                        z2 = false;
                                    }
                                    ryqVar = new defpackage.ryq(obpVar, aomyVar, aonjVar, slhVar, abjlVar, rytVar, list, zY, zBooleanValue, z2);
                                } else {
                                    z = true;
                                }
                                if (numValueOf != null) {
                                    iL = numValueOf.intValue();
                                } else {
                                    float f5 = defpackage.smf.a;
                                    iL = cfd.L(defpackage.smf.m << 32);
                                }
                                defpackage.slh slhVar2 = new defpackage.slh(uri, str5, str3, abmvVar2, iL, null, false, null, true);
                                if (fValueOf != null) {
                                    fFloatValue = fValueOf.floatValue();
                                } else {
                                    fFloatValue = defpackage.abjl.a.b;
                                }
                                if (fValueOf2 != null) {
                                    fFloatValue2 = fValueOf2.floatValue();
                                } else {
                                    fFloatValue2 = defpackage.abjl.a.c;
                                }
                                if (fValueOf3 != null) {
                                    fFloatValue3 = fValueOf3.floatValue();
                                } else {
                                    fFloatValue3 = defpackage.abjl.a.d;
                                }
                                defpackage.abjl abjlVar2 = new defpackage.abjl(fFloatValue, fFloatValue2, fFloatValue3);
                                java.util.List list2 = rypVar.g;
                                java.lang.Object objA2 = aoinVar.a();
                                aooh.e(objA2, "get(...)");
                                boolean zBooleanValue2 = ((java.lang.Boolean) objA2).booleanValue();
                                if (rypVar.c.c.c() == defpackage.sjg.a) {
                                    z2 = z;
                                } else {
                                    z2 = false;
                                }
                                ryqVar = new defpackage.ryq(obpVar, aomyVar, aonjVar, slhVar2, abjlVar2, rytVar, list2, zY, zBooleanValue2, z2);
                            }
                            if (ryqVar == null) {
                                cavVar.u(-1303707236);
                            } else {
                                cavVar.u(-1303707235);
                                abny.c((aonn) null, (aonn) null, (aonn) null, (aono) null, (aonn) null, (aono) null, (aonq) null, (aono) null, false, (aonn) null, (aonj) null, 0, cfo.j(857384311, new defpackage.qxy(ryqVar, 11), cavVar), cavVar, 0, 384, 4095);
                            }
                            cavVar.o();
                        }
                        throw new aois();
                    }
                    cavVar.s();
                    return aojh.a;
                }
            }));
            ahns.l();
            return composeView;
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

    public final eoq T() {
        eos eosVar = new eos(super.T());
        eosVar.b(env.c, new android.os.Bundle());
        return eosVar;
    }

    @java.lang.Deprecated
    public final android.content.Context a() {
        if (this.d == null) {
            this.d = new ahgi(this, super.z());
        }
        return this.d;
    }

    @Override // defpackage.ryo
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
    public final defpackage.ryl y() {
        defpackage.ryl rylVar = this.c;
        if (rylVar == null) {
            throw new java.lang.IllegalStateException("peer() called before initialized.");
        }
        if (this.e) {
            throw new java.lang.IllegalStateException("peer() called after destroyed.");
        }
        return rylVar;
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

    @Override // defpackage.ryo
    protected final /* synthetic */ amxr f() {
        return new ahgl(this);
    }

    @Override // defpackage.ryo
    public final void g(android.content.Context context) {
        this.b.j();
        try {
            if (this.e) {
                throw new java.lang.IllegalStateException("A Fragment cannot be attached more than once. Instead, create a new Fragment instance.");
            }
            super.g(context);
            if (this.c == null) {
                rym rymVar = (rym) agab.aC(this, rym.class);
                ahoq ahoqVarY = ahvr.Y(769, defpackage.ryi.class, "CreatePeer");
                try {
                    this.c = rymVar.bT();
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
            defpackage.ryl rylVarY = y();
            rylVarY.e.h(rylVarY.n);
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

    @Override // defpackage.ryo
    public final android.content.Context z() {
        if (super.z() == null) {
            return null;
        }
        return a();
    }
}
