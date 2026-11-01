package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class daj extends defpackage.cmv implements defpackage.dbd, defpackage.dat, defpackage.ddc, defpackage.ddb, defpackage.dad, defpackage.dcz, defpackage.dbb, defpackage.dau, defpackage.com, defpackage.coy, defpackage.cpc, defpackage.dcw, defpackage.cnu {
    public defpackage.cmu a;
    public boolean b;
    public final java.util.HashSet c;
    public defpackage.cxi d;
    private czy e;

    public daj(defpackage.cmu cmuVar) {
        this.u = defpackage.dcl.a(cmuVar);
        this.a = cmuVar;
        this.b = true;
        this.c = new java.util.HashSet();
    }

    public final void A() {
        if (this.D) {
            this.c.clear();
            defpackage.dcy dcyVar = ((defpackage.deg) defpackage.cfo.C(this)).u;
            dcyVar.a.c(this, dak.b, new bup(this, 15));
        }
    }

    @Override // defpackage.dcw
    public final boolean B() {
        return this.D;
    }

    @Override // defpackage.ddb
    public final boolean C() {
        cvs cvsVar = this.a;
        if (cvsVar == null) {
            defpackage.aooh.h("null cannot be cast to non-null type androidx.compose.ui.input.pointer.PointerInputModifier");
        }
        cvp cvpVar = cvsVar.e;
        return true;
    }

    @Override // defpackage.ddb
    public final void D() {
        cvs cvsVar = this.a;
        if (cvsVar == null) {
            defpackage.aooh.h("null cannot be cast to non-null type androidx.compose.ui.input.pointer.PointerInputModifier");
        }
        cvp cvpVar = cvsVar.e;
    }

    @Override // defpackage.dau
    public final void a(defpackage.cxi cxiVar) {
        defpackage.cmu cmuVar = this.a;
        if (cmuVar == null) {
            defpackage.aooh.h("null cannot be cast to non-null type androidx.compose.ui.layout.OnGloballyPositionedModifier");
        }
        ((defpackage.cyo) cmuVar).d();
    }

    @Override // defpackage.com
    public final void b(defpackage.cpe cpeVar) {
        defpackage.cmu cmuVar = this.a;
        if (!(cmuVar instanceof defpackage.col)) {
            defpackage.cwh.d("onFocusEvent called on wrong node");
        }
        ((defpackage.col) cmuVar).d();
    }

    @Override // defpackage.coy
    public final void c(cow cowVar) {
        defpackage.cmu cmuVar = this.a;
        if (!(cmuVar instanceof defpackage.cor)) {
            defpackage.cwh.d("applyFocusProperties called on wrong node");
        }
        ((defpackage.cor) cmuVar).d();
    }

    @Override // defpackage.cmv
    public final void cM() {
        if (this.a instanceof cvs) {
            n();
        }
    }

    @Override // defpackage.dad
    public final defpackage.dac cN() {
        czy czyVar = this.e;
        return czyVar == null ? czz.a : czyVar;
    }

    @Override // defpackage.ddc
    public final void cQ(defpackage.diq diqVar) {
        int i;
        defpackage.cmu cmuVar = this.a;
        if (cmuVar == null) {
            defpackage.aooh.h("null cannot be cast to non-null type androidx.compose.ui.semantics.SemanticsModifier");
        }
        defpackage.die dieVarF = ((defpackage.dif) cmuVar).f();
        if (diqVar == null) {
            defpackage.aooh.h("null cannot be cast to non-null type androidx.compose.ui.semantics.SemanticsConfiguration");
        }
        defpackage.die dieVar = (defpackage.die) diqVar;
        if (dieVarF.a) {
            dieVar.a = true;
        }
        if (dieVarF.b) {
            dieVar.b = true;
        }
        defpackage.adw adwVar = dieVarF.c;
        java.lang.Object[] objArr = adwVar.b;
        java.lang.Object[] objArr2 = adwVar.c;
        long[] jArr = adwVar.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i2 = 0;
        while (true) {
            long j = jArr[i2];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i3 = i2 - length;
                int i4 = 0;
                while (true) {
                    i = 8 - ((~i3) >>> 31);
                    if (i4 >= i) {
                        break;
                    }
                    if ((255 & j) < 128) {
                        int i5 = (i2 << 3) + i4;
                        java.lang.Object obj = objArr[i5];
                        java.lang.Object obj2 = objArr2[i5];
                        defpackage.dip dipVar = (defpackage.dip) obj;
                        defpackage.adw adwVar2 = dieVar.c;
                        if (!defpackage.adw.f(adwVar2, dipVar)) {
                            adwVar2.n(dipVar, obj2);
                        } else if (obj2 instanceof defpackage.dhr) {
                            java.lang.Object objA = adwVar2.a(dipVar);
                            if (objA == null) {
                                defpackage.aooh.h("null cannot be cast to non-null type androidx.compose.ui.semantics.AccessibilityAction<*>");
                            }
                            defpackage.dhr dhrVar = (defpackage.dhr) objA;
                            java.lang.String str = dhrVar.a;
                            if (str == null) {
                                str = ((defpackage.dhr) obj2).a;
                            }
                            defpackage.aoio aoioVar = dhrVar.b;
                            if (aoioVar == null) {
                                aoioVar = ((defpackage.dhr) obj2).b;
                            }
                            adwVar2.n(dipVar, new defpackage.dhr(str, aoioVar));
                        }
                    }
                    j >>= 8;
                    i4++;
                }
                if (i != 8) {
                    return;
                }
            }
            if (i2 == length) {
                return;
            } else {
                i2++;
            }
        }
    }

    @Override // defpackage.dcz
    public final java.lang.Object cW(defpackage.dpf dpfVar, java.lang.Object obj) {
        defpackage.cmu cmuVar = this.a;
        if (cmuVar == null) {
            defpackage.aooh.h("null cannot be cast to non-null type androidx.compose.ui.layout.ParentDataModifier");
        }
        return ((defpackage.cyz) cmuVar).d(dpfVar);
    }

    @Override // defpackage.dbd
    public final defpackage.cyf cX(defpackage.cyi cyiVar, defpackage.cyd cydVar, long j) {
        defpackage.cmu cmuVar = this.a;
        if (cmuVar == null) {
            defpackage.aooh.h("null cannot be cast to non-null type androidx.compose.ui.layout.LayoutModifier");
        }
        return ((defpackage.cxm) cmuVar).f();
    }

    @Override // defpackage.cmv
    public final void dc() {
        v(true);
    }

    @Override // defpackage.dbd
    public final int e(defpackage.cxf cxfVar, defpackage.cxe cxeVar, int i) {
        defpackage.cmu cmuVar = this.a;
        if (cmuVar == null) {
            defpackage.aooh.h("null cannot be cast to non-null type androidx.compose.ui.layout.LayoutModifier");
        }
        return ((defpackage.cxm) cmuVar).d();
    }

    @Override // defpackage.dbd
    public final int f(defpackage.cxf cxfVar, defpackage.cxe cxeVar, int i) {
        defpackage.cmu cmuVar = this.a;
        if (cmuVar == null) {
            defpackage.aooh.h("null cannot be cast to non-null type androidx.compose.ui.layout.LayoutModifier");
        }
        return ((defpackage.cxm) cmuVar).e();
    }

    @Override // defpackage.dbb
    public final void g(defpackage.cxi cxiVar) {
        this.d = cxiVar;
        defpackage.cmu cmuVar = this.a;
        if (cmuVar instanceof defpackage.cyt) {
            ((defpackage.cyt) cmuVar).d();
        }
    }

    @Override // defpackage.dbz
    public final void h(long j) {
        defpackage.cmu cmuVar = this.a;
        if (cmuVar instanceof defpackage.cyv) {
            ((defpackage.cyv) cmuVar).d();
        }
    }

    @Override // defpackage.dbd
    public final int i(defpackage.cxf cxfVar, defpackage.cxe cxeVar, int i) {
        defpackage.cmu cmuVar = this.a;
        if (cmuVar == null) {
            defpackage.aooh.h("null cannot be cast to non-null type androidx.compose.ui.layout.LayoutModifier");
        }
        return ((defpackage.cxm) cmuVar).g();
    }

    @Override // defpackage.dbd
    public final int j(defpackage.cxf cxfVar, defpackage.cxe cxeVar, int i) {
        defpackage.cmu cmuVar = this.a;
        if (cmuVar == null) {
            defpackage.aooh.h("null cannot be cast to non-null type androidx.compose.ui.layout.LayoutModifier");
        }
        return ((defpackage.cxm) cmuVar).h();
    }

    @Override // defpackage.cnu
    public final long k() {
        return defpackage.dpy.l(defpackage.cfo.B(this, 128).c);
    }

    @Override // defpackage.dat
    public final void m() {
        this.b = true;
        defpackage.cfo.w(this);
    }

    @Override // defpackage.ddb
    public final void n() {
        cvs cvsVar = this.a;
        if (cvsVar == null) {
            defpackage.aooh.h("null cannot be cast to non-null type androidx.compose.ui.input.pointer.PointerInputModifier");
        }
        cvp cvpVar = cvsVar.e;
        if (cvpVar.e == 2) {
            cvs cvsVar2 = cvpVar.d;
            long jUptimeMillis = android.os.SystemClock.uptimeMillis();
            defpackage.clc clcVar = new defpackage.clc(cvsVar2, 12);
            android.view.MotionEvent motionEventObtain = android.view.MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
            motionEventObtain.setSource(0);
            clcVar.a(motionEventObtain);
            motionEventObtain.recycle();
        }
        cvpVar.b();
    }

    @Override // defpackage.dat
    public final void o(defpackage.dbm dbmVar) {
        defpackage.cmu cmuVar = this.a;
        if (cmuVar == null) {
            defpackage.aooh.h("null cannot be cast to non-null type androidx.compose.ui.draw.DrawModifier");
        }
        defpackage.cnz cnzVar = (defpackage.cnz) cmuVar;
        if (this.b && (cmuVar instanceof cny)) {
            defpackage.cmu cmuVar2 = this.a;
            if (cmuVar2 instanceof cny) {
                defpackage.dcy dcyVar = ((defpackage.deg) defpackage.cfo.C(this)).u;
                dcyVar.a.c(this, dak.a, new bup(cmuVar2, 16));
            }
            this.b = false;
        }
        cnzVar.d(dbmVar);
    }

    @Override // defpackage.ddb
    public final void p(defpackage.cvf cvfVar, cvg cvgVar, long j) {
        boolean z;
        boolean z2;
        boolean z3;
        cvs cvsVar = this.a;
        if (cvsVar == null) {
            defpackage.aooh.h("null cannot be cast to non-null type androidx.compose.ui.input.pointer.PointerInputModifier");
        }
        cvp cvpVar = cvsVar.e;
        aae aaeVar = cvfVar.f;
        if (aaeVar != null && aaeVar.c() == 5) {
            int i = cvfVar.e;
            if (i == 4) {
                return;
            }
            if (i == 5) {
                cvpVar.c = true;
                return;
            }
        }
        java.util.List list = cvfVar.a;
        int i2 = cvfVar.e;
        boolean z4 = i2 == 10 || i2 == 12;
        if (z4) {
            z = false;
            break;
        }
        int size = list.size();
        int i3 = 0;
        while (true) {
            if (i3 >= size) {
                z = true;
                break;
            }
            cvm cvmVar = (cvm) list.get(i3);
            if (defpackage.uu.r(cvmVar) || defpackage.uu.t(cvmVar)) {
                z = false;
                break;
            }
            i3++;
        }
        if (!z) {
            z2 = false;
            break;
        }
        int size2 = list.size();
        int i4 = 0;
        while (true) {
            if (i4 >= size2) {
                z2 = true;
                break;
            } else {
                if (((cvm) list.get(i4)).c()) {
                    z2 = false;
                    break;
                }
                i4++;
            }
        }
        cvs cvsVar2 = cvpVar.d;
        if (!cvsVar2.d && !z4) {
            int size3 = list.size();
            int i5 = 0;
            while (true) {
                if (i5 < size3) {
                    cvm cvmVar2 = (cvm) list.get(i5);
                    if (!defpackage.uu.r(cvmVar2) && !defpackage.uu.t(cvmVar2)) {
                        i5++;
                    }
                } else if (!z2) {
                    z3 = false;
                    break;
                }
                z3 = true;
                break;
            }
        } else {
            z3 = true;
            break;
        }
        if (cvpVar.e != 3) {
            if (cvgVar == cvg.a && z3) {
                cvpVar.b = cvfVar;
                cvpVar.a(cvfVar, !z || cvsVar2.d);
            }
            if (cvgVar == cvg.b && z && defpackage.aooh.n(cvfVar, cvpVar.b) && cvsVar2.d) {
                int size4 = list.size();
                for (int i6 = 0; i6 < size4; i6++) {
                    ((cvm) list.get(i6)).b();
                }
            }
            if (cvgVar == cvg.c && !z3 && !defpackage.aooh.n(cvfVar, cvpVar.b)) {
                cvpVar.a(cvfVar, true);
            }
        }
        if (cvgVar == cvg.c) {
            if (!cvpVar.c || cvfVar.e == 12) {
                int size5 = list.size();
                int i7 = 0;
                while (true) {
                    if (i7 < size5) {
                        if (!defpackage.uu.t((cvm) list.get(i7))) {
                            if (cvfVar.e == 12) {
                                break;
                            } else {
                                break;
                            }
                        }
                        i7++;
                    }
                    cvpVar.b();
                    break;
                }
            } else {
                if (cvpVar.e == 2) {
                    cvpVar.c(cvfVar);
                }
                cvpVar.b();
            }
            if (defpackage.aooh.n(cvfVar, cvpVar.b) && z) {
                int size6 = list.size();
                for (int i8 = 0; i8 < size6; i8++) {
                    if (((cvm) list.get(i8)).c()) {
                        if (cvsVar2.d) {
                            break;
                        }
                        cvpVar.c(cvfVar);
                        return;
                    }
                }
                int size7 = list.size();
                for (int i9 = 0; i9 < size7; i9++) {
                    ((cvm) list.get(i9)).b();
                }
            }
        }
    }

    @Override // defpackage.ddb
    public final /* synthetic */ void q() {
        n();
    }

    @Override // defpackage.cnu
    public final defpackage.dpf r() {
        return defpackage.cfo.A(this).r;
    }

    @Override // defpackage.cnu
    public final defpackage.dpq s() {
        return defpackage.cfo.A(this).s;
    }

    public final java.lang.String toString() {
        return this.a.toString();
    }

    @Override // defpackage.cmv
    public final void u() {
        z();
    }

    public final void v(boolean z) {
        if (!this.D) {
            defpackage.cwh.d("initializeModifier called on unattached node");
        }
        cvs cvsVar = this.a;
        if ((this.u & 32) != 0) {
            if (cvsVar instanceof defpackage.daa) {
                defpackage.cfo.C(this).D(new bup(this, 14));
            }
            if (cvsVar instanceof defpackage.dae) {
                defpackage.dae daeVar = (defpackage.dae) cvsVar;
                czy czyVar = this.e;
                if (czyVar == null || !czyVar.c(daeVar.e())) {
                    this.e = new czy(daeVar);
                    if (dak.a(this)) {
                        defpackage.dab dabVar = ((defpackage.deg) defpackage.cfo.C(this)).A;
                        oq oqVarE = daeVar.e();
                        dabVar.b().q(this);
                        dabVar.c().q(oqVarE);
                        dabVar.a();
                    }
                } else {
                    czyVar.a = daeVar;
                    defpackage.dab dabVar2 = ((defpackage.deg) defpackage.cfo.C(this)).A;
                    oq oqVarE2 = daeVar.e();
                    dabVar2.b().q(this);
                    dabVar2.c().q(oqVarE2);
                    dabVar2.a();
                }
            }
        }
        if ((this.u & 4) != 0) {
            if (cvsVar instanceof cny) {
                this.b = true;
            }
            if (!z) {
                defpackage.cfo.B(this, 2).am();
            }
        }
        if ((this.u & 2) != 0) {
            if (dak.a(this)) {
                defpackage.dck dckVar = this.z;
                if (dckVar == null) {
                    defpackage.aooh.g();
                }
                ((defpackage.dbg) dckVar).I(this);
                dckVar.ao();
            }
            if (!z) {
                defpackage.cfo.B(this, 2).am();
                defpackage.cfo.A(this).H();
            }
        }
        if (cvsVar instanceof defpackage.czg) {
            ((defpackage.czg) cvsVar).d(defpackage.cfo.A(this));
        }
        if ((this.u & 128) != 0 && (cvsVar instanceof defpackage.cyv) && dak.a(this)) {
            defpackage.cfo.A(this).H();
        }
        if ((this.u & 4194304) != 0 && (cvsVar instanceof defpackage.cyt)) {
            this.d = null;
            if (dak.a(this)) {
                defpackage.dcv dcvVarC = defpackage.cfo.C(this);
                defpackage.deg degVar = (defpackage.deg) dcvVarC;
                degVar.w.e.n(new dai(this));
                degVar.ai(null);
            }
        }
        if ((this.u & 256) != 0 && (cvsVar instanceof defpackage.cyo) && dak.a(this)) {
            defpackage.cfo.A(this).H();
        }
        if (cvsVar instanceof defpackage.cpb) {
            ((defpackage.cpb) cvsVar).d().d.n(this);
        }
        int i = this.u;
        if ((i & 16) != 0 && (cvsVar instanceof cvs)) {
            cvsVar.e.a = this.z;
        }
        if ((i & 8) != 0) {
            defpackage.cfo.C(this).C();
        }
    }

    @Override // defpackage.ddc
    public final /* synthetic */ boolean w() {
        return false;
    }

    @Override // defpackage.ddc
    public final /* synthetic */ boolean x() {
        return false;
    }

    @Override // defpackage.ddc
    public final /* synthetic */ boolean y() {
        return true;
    }

    public final void z() {
        if (!this.D) {
            defpackage.cwh.d("unInitializeModifier called on unattached node");
        }
        defpackage.cmu cmuVar = this.a;
        if ((this.u & 32) != 0) {
            if (cmuVar instanceof defpackage.dae) {
                defpackage.dab dabVar = ((defpackage.deg) defpackage.cfo.C(this)).A;
                oq oqVarE = ((defpackage.dae) cmuVar).e();
                defpackage.adq adqVar = dabVar.d;
                if (adqVar == null) {
                    adqVar = new defpackage.adq(16);
                    dabVar.d = adqVar;
                }
                adqVar.q(defpackage.cfo.A(this));
                dabVar.d().q(oqVarE);
                dabVar.a();
            }
            if (cmuVar instanceof defpackage.daa) {
                ((defpackage.daa) cmuVar).d();
            }
        }
        if ((this.u & 8) != 0) {
            defpackage.cfo.C(this).C();
        }
        if (cmuVar instanceof defpackage.cpb) {
            ((defpackage.cpb) cmuVar).d().d.m(this);
        }
    }
}
