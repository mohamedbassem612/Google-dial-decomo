package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class quu extends defpackage.qvb implements ahei {
    private defpackage.quz c;
    private android.content.Context d;
    private boolean e;

    public final android.view.View M(android.view.LayoutInflater layoutInflater, android.view.ViewGroup viewGroup, android.os.Bundle bundle) {
        this.b.j();
        try {
            bi(layoutInflater);
            final defpackage.quz quzVarY = y();
            aooh.f(layoutInflater, "inflater");
            ahoq ahoqVarW = ahvr.W(663, "AudioSelectorFragmentPeer_onCreateView");
            try {
                quzVarY.j.B(quzVarY.e);
                quzVarY.b.g(2131427502, quzVarY.k.aa(defpackage.qux.class, new defpackage.qam(7)), quzVarY.c.b(quzVarY.h, false));
                android.content.Context context = layoutInflater.getContext();
                aooh.e(context, "getContext(...)");
                androidx.compose.ui.platform.ComposeView composeView = new androidx.compose.ui.platform.ComposeView(context, (android.util.AttributeSet) null, 0, 6, (aooc) null);
                composeView.a(new cja(1558389534, true, new aonn() { // from class: quv
                    public final java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
                        java.lang.String string;
                        int iOrdinal;
                        cav cavVar = (cav) obj;
                        int iIntValue = ((java.lang.Integer) obj2).intValue();
                        int i = iIntValue & 3;
                        int i2 = 1;
                        if (cavVar.H(i != 2, iIntValue & 1)) {
                            defpackage.quz quzVar = quzVarY;
                            defpackage.pcq pcqVar = (defpackage.pcq) quzVar.g.a();
                            aooh.e(pcqVar, "<get-dataModel>(...)");
                            android.content.Context context2 = quzVar.d;
                            java.lang.String string2 = context2.getString(2132017469);
                            aooh.e(string2, "getString(...)");
                            boolean zD = cavVar.D(quzVar) | cavVar.D(pcqVar);
                            java.lang.Object objG = cavVar.g();
                            if (zD || objG == cau.a) {
                                objG = new ksu(quzVar, pcqVar, 14, (byte[]) null);
                                cavVar.w(objG);
                            }
                            aomy aomyVar = (aomy) objG;
                            java.lang.String string3 = context2.getString(2132017468);
                            aooh.e(string3, "getString(...)");
                            cavVar.u(1218978090);
                            aify<defpackage.zmv> aifyVar = pcqVar.a;
                            aooh.e(aifyVar, "audioDevices(...)");
                            java.util.ArrayList arrayList = new java.util.ArrayList(ajsz.bl(aifyVar, 10));
                            for (defpackage.zmv zmvVar : aifyVar) {
                                aooh.c(zmvVar);
                                aooh.f(zmvVar, "<this>");
                                defpackage.zmw zmwVar = zmvVar.a;
                                int i3 = 2131231546;
                                if (zmwVar != null && (iOrdinal = zmwVar.ordinal()) != 0) {
                                    if (iOrdinal == i2) {
                                        i3 = 2131231320;
                                    } else if (iOrdinal == 2) {
                                        i3 = 2131231451;
                                    } else if (iOrdinal == 3) {
                                        i3 = 2131231670;
                                    }
                                }
                                int i4 = i3;
                                aooh.f(zmvVar, "<this>");
                                j$.util.Optional optional = zmvVar.c;
                                if (optional.isPresent()) {
                                    java.lang.Object objOrElseThrow = optional.orElseThrow();
                                    aooh.e(objOrElseThrow, "orElseThrow(...)");
                                    string = (java.lang.String) objOrElseThrow;
                                } else if (zmwVar == defpackage.zmw.ROUTE_BLUETOOTH) {
                                    string = context2.getString(2132017465);
                                    aooh.e(string, "getString(...)");
                                } else {
                                    string = "";
                                }
                                boolean zD2 = cavVar.D(quzVar) | cavVar.D(zmvVar);
                                java.lang.Object objG2 = cavVar.g();
                                if (zD2 || objG2 == cau.a) {
                                    objG2 = new ksu(quzVar, zmvVar, 15);
                                    cavVar.w(objG2);
                                }
                                aomy aomyVar2 = (aomy) objG2;
                                java.lang.Object objOrElse = zmvVar.d.orElse(java.lang.Boolean.FALSE);
                                if (objOrElse == null) {
                                    throw new java.lang.IllegalStateException("Required value was null.");
                                }
                                arrayList.add(new lpu(i4, string, aomyVar2, ((java.lang.Boolean) objOrElse).booleanValue()));
                                i2 = 1;
                            }
                            cavVar.o();
                            boolean zD3 = cavVar.D(quzVar);
                            java.lang.Object objG3 = cavVar.g();
                            if (zD3 || objG3 == cau.a) {
                                objG3 = new defpackage.pqf(quzVar, 3);
                                cavVar.w(objG3);
                            }
                            java.lang.String str = pcqVar.b;
                            aomy aomyVar3 = (aomy) objG3;
                            aooh.e(str, "callId(...)");
                            gus.aG(false, false, cfo.j(-1894466403, new ntw(new defpackage.qvc(string2, aomyVar, string3, arrayList, aomyVar3, str.length() == 0, context2.getResources().getBoolean(2131034171)), 20), cavVar), cavVar, 384, 3);
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

    @Override // defpackage.qvb
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

    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final defpackage.quz y() {
        defpackage.quz quzVar = this.c;
        if (quzVar == null) {
            throw new java.lang.IllegalStateException("peer() called before initialized.");
        }
        if (this.e) {
            throw new java.lang.IllegalStateException("peer() called after destroyed.");
        }
        return quzVar;
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

    @Override // defpackage.qvb
    protected final /* synthetic */ amxr f() {
        return new ahgl(this);
    }

    @Override // defpackage.qvb
    public final void g(android.content.Context context) {
        this.b.j();
        try {
            if (this.e) {
                throw new java.lang.IllegalStateException("A Fragment cannot be attached more than once. Instead, create a new Fragment instance.");
            }
            super.g(context);
            if (this.c == null) {
                qva qvaVar = (qva) agab.aC(this, qva.class);
                ahoq ahoqVarY = ahvr.Y(660, defpackage.quu.class, "CreatePeer");
                try {
                    this.c = qvaVar.br();
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

    @Override // defpackage.qvb
    public final android.content.Context z() {
        if (super.z() == null) {
            return null;
        }
        return a();
    }
}
