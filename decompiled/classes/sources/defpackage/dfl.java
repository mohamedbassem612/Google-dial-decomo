package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class dfl {
    private defpackage.eoi A;
    private final android.content.res.Configuration B;
    private final defpackage.ccp C;
    private android.os.Handler D;
    private final defpackage.dfk E;
    private oq F;
    public final android.view.View a;
    public boolean b;
    public boolean c;
    public java.util.List d;
    public final defpackage.ddu e;
    public final defpackage.ccp f;
    public final defpackage.dex g;
    public final defpackage.dbm h;
    public final defpackage.dfz i;
    public int j;
    public boolean k;
    public final defpackage.aomy l;
    public boolean m;
    public final defpackage.dez n;
    public oq o;
    public defpackage.vx p;
    public final defpackage.ipc q;
    public final defpackage.kaw r;
    public final defpackage.kaw s;
    public final defpackage.kaw t;
    public final defpackage.kaw u;
    public final defpackage.kaw v;
    private boolean w;
    private defpackage.caz x;
    private defpackage.emx y;
    private defpackage.gii z;

    public /* synthetic */ dfl(defpackage.dfl dflVar, android.view.View view, defpackage.caz cazVar, defpackage.emx emxVar, defpackage.gii giiVar, defpackage.eoi eoiVar) {
        defpackage.kaw kawVar;
        android.content.res.Configuration configuration;
        defpackage.ccp parcelableSnapshotMutableState;
        defpackage.kaw kawVar2;
        oq oqVarJ;
        defpackage.ddu dduVar;
        defpackage.kaw kawVar3;
        defpackage.dez dezVar;
        defpackage.ccp parcelableSnapshotMutableState2;
        defpackage.dex dexVar;
        android.view.View view2;
        boolean zN = defpackage.aooh.n((dflVar == null || (view2 = dflVar.a) == null) ? null : view2.getContext(), view.getContext());
        this.a = view;
        this.x = cazVar;
        this.y = emxVar;
        this.z = giiVar;
        this.A = eoiVar;
        if (zN) {
            if (dflVar == null) {
                defpackage.aooh.g();
            }
            kawVar = dflVar.r;
        } else {
            kawVar = new defpackage.kaw((char[]) null, (byte[]) null);
        }
        this.r = kawVar;
        this.q = dflVar != null ? dflVar.q : new defpackage.ipc(null, null, null, null, null);
        this.p = dflVar != null ? dflVar.k() : null;
        if (zN) {
            if (dflVar == null) {
                defpackage.aooh.g();
            }
            configuration = dflVar.B;
        } else {
            configuration = new android.content.res.Configuration(view.getContext().getResources().getConfiguration());
        }
        this.B = configuration;
        if (zN) {
            if (dflVar == null) {
                defpackage.aooh.g();
            }
            parcelableSnapshotMutableState = dflVar.C;
        } else {
            parcelableSnapshotMutableState = new androidx.compose.runtime.ParcelableSnapshotMutableState(new android.content.res.Configuration(configuration), defpackage.cdu.c);
        }
        this.C = parcelableSnapshotMutableState;
        if (zN) {
            if (dflVar == null) {
                defpackage.aooh.g();
            }
            kawVar2 = dflVar.t;
        } else {
            kawVar2 = new defpackage.kaw(view.getContext(), (short[]) null);
        }
        this.t = kawVar2;
        if (zN) {
            if (dflVar == null) {
                defpackage.aooh.g();
            }
            oqVarJ = dflVar.j();
        } else {
            oqVarJ = null;
        }
        this.F = oqVarJ;
        if (zN) {
            if (dflVar == null) {
                defpackage.aooh.g();
            }
            dduVar = dflVar.e;
        } else {
            dduVar = new defpackage.ddu(view.getContext());
        }
        this.e = dduVar;
        if (zN) {
            if (dflVar == null) {
                defpackage.aooh.g();
            }
            kawVar3 = dflVar.s;
        } else {
            kawVar3 = new defpackage.kaw(dduVar, (byte[]) null);
        }
        this.s = kawVar3;
        if (zN) {
            if (dflVar == null) {
                defpackage.aooh.g();
            }
            dezVar = dflVar.n;
        } else {
            view.getContext();
            dezVar = new defpackage.dez();
        }
        this.n = dezVar;
        if (zN) {
            if (dflVar == null) {
                defpackage.aooh.g();
            }
            parcelableSnapshotMutableState2 = dflVar.f;
        } else {
            parcelableSnapshotMutableState2 = new androidx.compose.runtime.ParcelableSnapshotMutableState(defpackage.dez.h(view.getContext()), defpackage.cdu.a);
        }
        this.f = parcelableSnapshotMutableState2;
        this.u = view == (dflVar != null ? dflVar.a : null) ? dflVar.u : new defpackage.kaw((java.lang.Object) view, (byte[]) null);
        if (zN) {
            if (dflVar == null) {
                defpackage.aooh.g();
            }
            dexVar = dflVar.g;
        } else {
            dexVar = new defpackage.dex(android.view.ViewConfiguration.get(view.getContext()));
        }
        this.g = dexVar;
        this.h = dflVar != null ? dflVar.h : new defpackage.dbm(new defpackage.csh());
        view.getContext();
        this.i = new defpackage.dfz();
        this.v = dflVar != null ? dflVar.v : new defpackage.kaw((byte[]) null, (char[]) null);
        this.l = new defpackage.ddw(this, 2);
        this.E = new defpackage.dfk(this);
    }

    private final void l() {
        if (this.w) {
            return;
        }
        this.w = true;
        if (this.x == null) {
            android.view.View view = this.a;
            defpackage.caz cazVarB = defpackage.dgx.b(view);
            if (cazVarB == null) {
                cazVarB = defpackage.dgx.d(view);
            }
            this.x = cazVarB;
        }
        if (this.y == null) {
            defpackage.emx emxVarK = defpackage.dzo.k(this.a);
            if (emxVarK == null) {
                throw new java.lang.IllegalStateException("Composed into a View which doesn't propagate ViewTreeLifecycleOwner!");
            }
            this.y = emxVarK;
        }
        if (this.z == null) {
            defpackage.gii giiVarN = defpackage.dzk.N(this.a);
            if (giiVarN == null) {
                throw new java.lang.IllegalStateException("Composed into a View which doesn't propagate ViewTreeSavedStateRegistryOwner!");
            }
            this.z = giiVarN;
        }
        if (this.A == null) {
            this.A = defpackage.dzo.i(this.a);
        }
    }

    public final defpackage.caz a() {
        l();
        defpackage.caz cazVar = this.x;
        if (cazVar == null) {
            defpackage.aooh.g();
        }
        return cazVar;
    }

    public final defpackage.emx b() {
        l();
        defpackage.emx emxVar = this.y;
        if (emxVar == null) {
            defpackage.aooh.g();
        }
        return emxVar;
    }

    public final defpackage.eoi c() {
        l();
        return this.A;
    }

    public final defpackage.gii d() {
        l();
        defpackage.gii giiVar = this.z;
        if (giiVar == null) {
            defpackage.aooh.g();
        }
        return giiVar;
    }

    public final void e(defpackage.deg degVar, defpackage.aonn aonnVar, defpackage.cav cavVar, int i) {
        int i2;
        int i3 = i & 6;
        defpackage.cav cavVarB = cavVar.b(123858079);
        int i4 = 4;
        boolean z = true;
        if (i3 == 0) {
            i2 = (true != ((i & 8) == 0 ? cavVarB.B(degVar) : cavVarB.D(degVar)) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= true != cavVarB.D(aonnVar) ? 16 : 32;
        }
        if ((i & 384) == 0) {
            i2 |= true != cavVarB.D(this) ? 128 : 256;
        }
        if (cavVarB.H((i2 & 147) != 146, i2 & 1)) {
            int i5 = i2 & 14;
            java.lang.Object tag = degVar.getTag(2131428417);
            byte[] bArr = null;
            java.util.Set set = defpackage.aoov.e(tag) ? (java.util.Set) tag : null;
            if (set == null) {
                java.lang.Object parent = degVar.getParent();
                android.view.View view = parent instanceof android.view.View ? (android.view.View) parent : null;
                java.lang.Object tag2 = view != null ? view.getTag(2131428417) : null;
                set = defpackage.aoov.e(tag2) ? (java.util.Set) tag2 : null;
            }
            if (set != null) {
                set.add(cavVarB.d());
                defpackage.cbt cbtVar = (defpackage.cbt) cavVarB;
                cbtVar.h = true;
                cbtVar.n = true;
                cbtVar.c.b();
                cbtVar.q.b();
                defpackage.cfp cfpVar = cbtVar.r;
                defpackage.cfm cfmVar = cfpVar.a;
                cfpVar.e = cfmVar.i;
                cfpVar.s = cfmVar.j;
            }
            cavVarB.u(479840575);
            defpackage.cdj[] cdjVarArr = new defpackage.cdj[13];
            cdjVarArr[0] = defpackage.dfm.a.b(degVar);
            cdjVarArr[1] = defpackage.eom.a.b(b());
            cdjVarArr[2] = defpackage.gik.a.b(d());
            cdjVarArr[3] = defpackage.cmf.a.b(set);
            cdjVarArr[4] = defpackage.dep.b.b(degVar.getContext());
            int i6 = 5;
            cdjVarArr[5] = defpackage.dep.a.b(degVar.ab());
            defpackage.cbd cbdVar = defpackage.cjz.a;
            boolean z2 = i5 == 4 || ((i2 & 8) != 0 && cavVarB.D(degVar));
            defpackage.cbt cbtVar2 = (defpackage.cbt) cavVarB;
            java.lang.Object objR = cbtVar2.R();
            if (z2 || objR == defpackage.cau.a) {
                objR = new defpackage.ddz(degVar, i4);
                cbtVar2.ab(objR);
            }
            cdjVarArr[6] = new defpackage.cdj(cbdVar, null, false, null, (defpackage.aonj) objR, false);
            defpackage.cbd cbdVar2 = defpackage.dfo.r;
            int i7 = 8;
            if (i5 != 4 && ((i2 & 8) == 0 || !cavVarB.D(degVar))) {
                z = false;
            }
            java.lang.Object objR2 = cbtVar2.R();
            if (z || objR2 == defpackage.cau.a) {
                objR2 = new defpackage.ddz(degVar, i6);
                cbtVar2.ab(objR2);
            }
            cdjVarArr[7] = new defpackage.cdj(cbdVar2, null, false, null, (defpackage.aonj) objR2, false);
            defpackage.cbd cbdVar3 = defpackage.cca.a;
            defpackage.kaw kawVar = degVar.O;
            if (kawVar == null) {
                kawVar = new defpackage.kaw((java.lang.Object) degVar, (byte[]) null);
                degVar.O = kawVar;
            }
            cdjVarArr[8] = cbdVar3.b(kawVar);
            cdjVarArr[9] = defpackage.dep.f.b(degVar);
            cdjVarArr[10] = defpackage.dfo.n.b(degVar.q());
            cdjVarArr[11] = defpackage.dep.d.b(this.r);
            cdjVarArr[12] = defpackage.dep.e.b(this.q);
            defpackage.den.ac(cdjVarArr, defpackage.cfo.j(1409209137, new defpackage.bec(degVar, aonnVar, i7, bArr), cavVarB), cavVarB, 48);
            cbtVar2.W(false);
        } else {
            cavVarB.s();
        }
        defpackage.cdk cdkVarI = cavVarB.I();
        if (cdkVarI != null) {
            cdkVarI.c = new defpackage.ciz(this, degVar, aonnVar, i, 2);
        }
    }

    public final void f() {
        int i = this.j - 1;
        this.j = i;
        if (i < 0) {
            android.util.Log.e("ComposeViewContext", "View count has dropped below 0");
            this.j = 0;
        } else if (i != 0) {
            return;
        }
        android.view.View view = this.a;
        defpackage.dfk dfkVar = this.E;
        view.getContext().unregisterComponentCallbacks(dfkVar);
        this.i.c(null);
        view.getViewTreeObserver().removeOnWindowFocusChangeListener(dfkVar);
        view.getViewTreeObserver().removeOnGlobalLayoutListener(dfkVar);
        this.k = false;
        boolean z = this.m;
        android.os.Handler handler = this.D;
        if (z) {
            if (handler != null) {
                handler.post(dfkVar);
            }
        } else if (handler != null) {
            handler.removeCallbacks(dfkVar);
        }
        this.D = null;
    }

    public final void g() {
        int i = this.j + 1;
        this.j = i;
        if (i == 1) {
            android.view.View view = this.a;
            defpackage.dfk dfkVar = this.E;
            view.getContext().registerComponentCallbacks(dfkVar);
            h(view.getResources().getConfiguration());
            defpackage.dfz dfzVar = this.i;
            dfzVar.d(view.hasWindowFocus());
            defpackage.aomy aomyVar = this.l;
            dfzVar.c(aomyVar);
            defpackage.ccp ccpVar = dfzVar.a;
            if (ccpVar != null) {
                ccpVar.b(aomyVar.a());
            }
            view.getViewTreeObserver().addOnWindowFocusChangeListener(dfkVar);
            view.getViewTreeObserver().addOnGlobalLayoutListener(dfkVar);
            this.k = false;
            android.view.accessibility.AccessibilityManager accessibilityManager = (android.view.accessibility.AccessibilityManager) this.t.a;
            boolean zIsEnabled = accessibilityManager.isEnabled();
            this.b = zIsEnabled;
            this.c = zIsEnabled && accessibilityManager.isTouchExplorationEnabled();
            android.os.Handler handler = view.getHandler();
            this.D = handler;
            if (handler != null) {
                handler.post(dfkVar);
            }
        }
    }

    public final void h(android.content.res.Configuration configuration) {
        int iUpdateFrom = this.B.updateFrom(configuration);
        if (iUpdateFrom != 0) {
            java.util.Iterator it = ((java.util.HashMap) this.r.a).entrySet().iterator();
            while (it.hasNext()) {
                defpackage.dhe dheVar = (defpackage.dhe) ((java.lang.ref.WeakReference) ((java.util.Map.Entry) it.next()).getValue()).get();
                if (dheVar == null || android.content.res.Configuration.needNewResources(iUpdateFrom, dheVar.b)) {
                    it.remove();
                }
            }
            this.C.b(new android.content.res.Configuration(configuration));
            this.q.ag();
            if ((268435456 & iUpdateFrom) != 0) {
                this.f.b(defpackage.dez.h(this.a.getContext()));
            }
            if ((iUpdateFrom & 805248384) != 0) {
                if (android.os.Build.VERSION.SDK_INT < 33) {
                    this.k = true;
                    return;
                }
                defpackage.dfz dfzVar = this.i;
                defpackage.aomy aomyVar = this.l;
                defpackage.ccp ccpVar = dfzVar.a;
                if (ccpVar != null) {
                    ccpVar.b(aomyVar.a());
                }
            }
        }
    }

    public final void i() {
        this.d = null;
    }

    public final oq j() {
        oq oqVar = this.F;
        if (oqVar != null) {
            return oqVar;
        }
        oq oqVar2 = new oq(this.a.getContext(), (byte[]) null);
        this.F = oqVar2;
        return oqVar2;
    }

    public final defpackage.vx k() {
        defpackage.vx vxVar = this.p;
        if (vxVar != null) {
            return vxVar;
        }
        defpackage.vx vxVar2 = new defpackage.vx((byte[]) null, (char[]) null);
        this.p = vxVar2;
        return vxVar2;
    }
}
