package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class ubq extends defpackage.ubn implements ahei, ahtq {
    private final ahda ak = new ahda((byte[]) null, (byte[]) null);
    private defpackage.ubw c;
    private android.content.Context d;
    private boolean e;

    public final android.view.View M(android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        this.b.j();
        try {
            bi(layoutInflater);
            final defpackage.ubw ubwVarY = y();
            aooh.f(layoutInflater, "inflater");
            aooh.f(viewGroup, "container");
            ahoq ahoqVarW = ahvr.W(906, "SonicGridFragmentPeer_onCreateView");
            try {
                ubwVarY.l.B(ubwVarY.b);
                ubwVarY.c.g(2131428983, ubwVarY.n.aa(defpackage.ubu.class, new defpackage.qam(15)), ubwVarY.d.b(ubwVarY.j, false));
                defpackage.qbe qbeVarC = ubwVarY.c();
                if (qbeVarC != null) {
                    qbeVarC.a(qbc.hI);
                }
                android.content.Context context = layoutInflater.getContext();
                aooh.e(context, "getContext(...)");
                androidx.compose.ui.platform.ComposeView composeView = new androidx.compose.ui.platform.ComposeView(context, (android.util.AttributeSet) null, 0, 6, (aooc) null);
                if (((java.lang.Boolean) ubwVarY.h.a()).booleanValue()) {
                    composeView.k(dgi.a);
                }
                composeView.a(new cja(1270980948, true, new aonn() { // from class: ubs
                    /* JADX INFO: Thrown type has an unknown type hierarchy: aois */
                    public final java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) throws aois {
                        int i;
                        int i2;
                        cav cavVar = (cav) obj;
                        int iIntValue = ((java.lang.Integer) obj2).intValue();
                        if (cavVar.H((iIntValue & 3) != 2, iIntValue & 1)) {
                            defpackage.ubw ubwVar = ubwVarY;
                            defpackage.uaa uaaVar = (defpackage.uaa) ubwVar.i.a();
                            android.content.Context contextA = ubwVar.b.A();
                            cavVar.u(1307272107);
                            alat alatVar = uaaVar.d;
                            aooh.e(alatVar, "getSonicEntryUiStateList(...)");
                            java.util.ArrayList arrayList = new java.util.ArrayList(ajsz.bl(alatVar, 10));
                            java.util.Iterator it = alatVar.iterator();
                            while (it.hasNext()) {
                                j$.util.Optional optionalA = defpackage.uab.a(((defpackage.tzy) it.next()).c);
                                aooh.e(optionalA, "getSonicKeyFromString(...)");
                                java.lang.Object objQ = aooh.q(optionalA);
                                if (objQ == null) {
                                    throw new java.lang.IllegalStateException("Key should be present!");
                                }
                                defpackage.uab uabVar = (defpackage.uab) objQ;
                                int iOrdinal = uabVar.ordinal();
                                if (iOrdinal == 0) {
                                    i = 2131231041;
                                } else if (iOrdinal == 1) {
                                    i = 2131231039;
                                } else if (iOrdinal == 2) {
                                    i = 2131231045;
                                } else if (iOrdinal == 3) {
                                    i = 2131231044;
                                } else if (iOrdinal == 4) {
                                    i = 2131231042;
                                } else {
                                    if (iOrdinal != 5) {
                                        throw new aois();
                                    }
                                    i = 2131231047;
                                }
                                int iOrdinal2 = uabVar.ordinal();
                                if (iOrdinal2 == 0) {
                                    i2 = 2132020185;
                                } else if (iOrdinal2 == 1) {
                                    i2 = 2132020195;
                                } else if (iOrdinal2 == 2) {
                                    i2 = 2132020200;
                                } else if (iOrdinal2 == 3) {
                                    i2 = 2132020188;
                                } else if (iOrdinal2 == 4) {
                                    i2 = 2132020196;
                                } else {
                                    if (iOrdinal2 != 5) {
                                        throw new aois();
                                    }
                                    i2 = 2132020189;
                                }
                                java.lang.String string = contextA.getString(i2);
                                aooh.e(string, "getString(...)");
                                boolean zD = cavVar.D(ubwVar) | cavVar.z(uabVar.ordinal());
                                java.lang.Object objG = cavVar.g();
                                if (zD || objG == cau.a) {
                                    objG = new defpackage.qza(ubwVar, uabVar, 20);
                                    cavVar.w(objG);
                                }
                                arrayList.add(new defpackage.ucg(uabVar, i, string, (aomy) objG));
                            }
                            cavVar.o();
                            java.lang.String string2 = contextA.getString(2132020204);
                            aooh.e(string2, "getString(...)");
                            java.lang.String string3 = contextA.getString(2132020191);
                            aooh.e(string3, "getString(...)");
                            boolean z = uaaVar.c;
                            boolean zD2 = cavVar.D(ubwVar);
                            java.lang.Object objG2 = cavVar.g();
                            if (zD2 || objG2 == cau.a) {
                                objG2 = new sky(ubwVar, 10);
                                cavVar.w(objG2);
                            }
                            aomy aomyVar = (aomy) objG2;
                            boolean zD3 = cavVar.D(ubwVar);
                            java.lang.Object objG3 = cavVar.g();
                            if (zD3 || objG3 == cau.a) {
                                objG3 = new sky(ubwVar, 11);
                                cavVar.w(objG3);
                            }
                            gus.aG(false, false, cfo.j(1156381621, new ubr(new defpackage.uch(string2, string3, z, aomyVar, (aomy) objG3, arrayList, aooh.n(uaaVar, defpackage.uaa.a), ubwVar.g.getResources().getBoolean(2131034171)), 0), cavVar), cavVar, 384, 3);
                        } else {
                            cavVar.s();
                        }
                        return aojh.a;
                    }
                }));
                ajsz.ak(ahoqVarW, (java.lang.Throwable) null);
                ahns.l();
                return composeView;
            } catch (java.lang.Throwable th) {
                try {
                    throw th;
                } catch (java.lang.Throwable th2) {
                    ajsz.ak(ahoqVarW, th);
                    throw th2;
                }
            }
        } catch (java.lang.Throwable th3) {
            try {
                ahns.l();
                throw th3;
            } catch (java.lang.Throwable th4) {
                th3.addSuppressed(th4);
                throw th3;
            }
        }
    }

    @java.lang.Deprecated
    public final android.content.Context a() {
        if (this.d == null) {
            this.d = new ahgi(this, super.z());
        }
        return this.d;
    }

    @Override // defpackage.ubn
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
            defpackage.ubw ubwVarY = y();
            ahvr.e(this, defpackage.ubp.class, new defpackage.rrj(ubwVarY, 6));
            ahvr.e(this, defpackage.uck.class, new defpackage.rrj(ubwVarY, 7));
            aooh.f(view, "view");
            defpackage.ubw ubwVarY2 = y();
            aooh.f(view, "view");
            ubwVarY2.e.g(ubwVarY2.m.R(oqt.j), 5L, java.util.concurrent.TimeUnit.SECONDS);
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

    @Override // defpackage.ubn
    public final void g(android.content.Context context) {
        this.b.j();
        try {
            if (this.e) {
                throw new java.lang.IllegalStateException("A Fragment cannot be attached more than once. Instead, create a new Fragment instance.");
            }
            super.g(context);
            if (this.c == null) {
                ubx ubxVar = (ubx) agab.aC(this, ubx.class);
                ahoq ahoqVarY = ahvr.Y(903, defpackage.ubq.class, "CreatePeer");
                try {
                    this.c = ubxVar.cl();
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

    @Override // defpackage.ubn
    protected final /* synthetic */ amxr p() {
        return new ahgl(this);
    }

    public final void q(java.lang.Class cls, ahtl ahtlVar) {
        this.ak.k(cls, ahtlVar);
    }

    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public final defpackage.ubw y() {
        defpackage.ubw ubwVar = this.c;
        if (ubwVar == null) {
            throw new java.lang.IllegalStateException("peer() called before initialized.");
        }
        if (this.e) {
            throw new java.lang.IllegalStateException("peer() called after destroyed.");
        }
        return ubwVar;
    }

    @Override // defpackage.ubn
    public final android.content.Context z() {
        if (super.z() == null) {
            return null;
        }
        return a();
    }
}
