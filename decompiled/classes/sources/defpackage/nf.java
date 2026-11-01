package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class nf {
    public final java.lang.Object a;
    public final java.lang.Object b;

    public nf(defpackage.dij dijVar, defpackage.aco acoVar) {
        this.a = dijVar.b;
        java.util.List listL = dijVar.l((4 & 1) != 0 ? !dijVar.e : false, ((4 & 2) == 0) & true);
        this.b = new defpackage.acq(listL.size());
        int size = listL.size();
        for (int i = 0; i < size; i++) {
            defpackage.dij dijVar2 = (defpackage.dij) listL.get(i);
            if (acoVar.b(dijVar2.c)) {
                ((defpackage.acq) this.b).d(dijVar2.c);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [ccp, java.lang.Object] */
    private final void U(but butVar) {
        this.b.b(butVar);
    }

    public final void A(defpackage.aw awVar, android.os.Bundle bundle) {
        if (awVar == null) {
            defpackage.aooh.i("f");
        }
        defpackage.aw awVar2 = ((defpackage.bo) this.a).p;
        if (awVar2 != null) {
            awVar2.J().A.A(awVar, bundle);
        }
        java.util.Iterator it = ((java.util.concurrent.CopyOnWriteArrayList) this.b).iterator();
        defpackage.aooh.e(it, "iterator(...)");
        while (it.hasNext()) {
            java.lang.Object obj = ((defpackage.kaw) it.next()).a;
        }
    }

    public final void B(defpackage.aw awVar) {
        if (awVar == null) {
            defpackage.aooh.i("f");
        }
        defpackage.aw awVar2 = ((defpackage.bo) this.a).p;
        if (awVar2 != null) {
            awVar2.J().A.B(awVar);
        }
        java.util.Iterator it = ((java.util.concurrent.CopyOnWriteArrayList) this.b).iterator();
        defpackage.aooh.e(it, "iterator(...)");
        while (it.hasNext()) {
            java.lang.Object obj = ((defpackage.kaw) it.next()).a;
        }
    }

    public final void C(defpackage.aw awVar, android.os.Bundle bundle) {
        defpackage.aooh.f(awVar, "f");
        defpackage.aw awVar2 = ((defpackage.bo) this.a).p;
        if (awVar2 != null) {
            awVar2.J().A.C(awVar, bundle);
        }
        java.util.Iterator it = ((java.util.concurrent.CopyOnWriteArrayList) this.b).iterator();
        defpackage.aooh.e(it, "iterator(...)");
        while (it.hasNext()) {
            java.lang.Object obj = ((defpackage.kaw) it.next()).a;
        }
    }

    public final void D(defpackage.aw awVar) {
        if (awVar == null) {
            defpackage.aooh.i("f");
        }
        defpackage.aw awVar2 = ((defpackage.bo) this.a).p;
        if (awVar2 != null) {
            awVar2.J().A.D(awVar);
        }
        java.util.Iterator it = ((java.util.concurrent.CopyOnWriteArrayList) this.b).iterator();
        defpackage.aooh.e(it, "iterator(...)");
        while (it.hasNext()) {
            java.lang.Object obj = ((defpackage.kaw) it.next()).a;
        }
    }

    public final void E(defpackage.aw awVar) {
        defpackage.aooh.f(awVar, "f");
        defpackage.aw awVar2 = ((defpackage.bo) this.a).p;
        if (awVar2 != null) {
            awVar2.J().A.E(awVar);
        }
        java.util.Iterator it = ((java.util.concurrent.CopyOnWriteArrayList) this.b).iterator();
        defpackage.aooh.e(it, "iterator(...)");
        while (it.hasNext()) {
            java.lang.Object obj = ((defpackage.kaw) it.next()).a;
        }
    }

    public final void F(defpackage.aw awVar, android.view.View view, android.os.Bundle bundle) {
        if (awVar == null) {
            defpackage.aooh.i("f");
        }
        if (view == null) {
            defpackage.aooh.i("v");
        }
        defpackage.aw awVar2 = ((defpackage.bo) this.a).p;
        if (awVar2 != null) {
            awVar2.J().A.F(awVar, view, bundle);
        }
        java.util.Iterator it = ((java.util.concurrent.CopyOnWriteArrayList) this.b).iterator();
        defpackage.aooh.e(it, "iterator(...)");
        while (it.hasNext()) {
            java.lang.Object obj = ((defpackage.kaw) it.next()).a;
        }
    }

    public final void G(defpackage.aw awVar) {
        defpackage.aooh.f(awVar, "f");
        defpackage.aw awVar2 = ((defpackage.bo) this.a).p;
        if (awVar2 != null) {
            awVar2.J().A.G(awVar);
        }
        java.util.Iterator it = ((java.util.concurrent.CopyOnWriteArrayList) this.b).iterator();
        defpackage.aooh.e(it, "iterator(...)");
        while (it.hasNext()) {
            java.lang.Object obj = ((defpackage.kaw) it.next()).a;
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [aomy, java.lang.Object] */
    public final java.lang.Object H(int i) {
        java.lang.Object objC = ((defpackage.cfc) this.b).c(i);
        this.a.a();
        return objC;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [aomy, java.lang.Object] */
    public final void I(int i, java.lang.Object obj) {
        ((defpackage.cfc) this.b).f(i, obj);
        this.a.a();
    }

    public final boolean J() {
        return this.b != defpackage.ciu.a;
    }

    public final boolean K() {
        return this.a != defpackage.ciu.a;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [cer, java.lang.Object] */
    public final but L() {
        return (but) this.b.a();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final java.lang.Object M(buu buuVar, defpackage.aoln aolnVar) {
        buv buvVar;
        java.lang.Object obj;
        java.lang.Throwable th;
        java.lang.Object obj2;
        if (aolnVar instanceof buv) {
            buvVar = (buv) aolnVar;
            int i = buvVar.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                buvVar.b = i - Integer.MIN_VALUE;
            } else {
                buvVar = new buv(this, aolnVar);
            }
        } else {
            buvVar = new buv(this, aolnVar);
        }
        java.lang.Object obj3 = buvVar.a;
        defpackage.aolu aoluVar = defpackage.aolu.a;
        int i2 = buvVar.b;
        try {
            try {
                if (i2 == 0) {
                    defpackage.aooc.af(obj3);
                    obj = this.a;
                    buvVar.c = buuVar;
                    defpackage.apdp apdpVar = (defpackage.apdp) obj;
                    buvVar.d = apdpVar;
                    buvVar.b = 1;
                    if (apdpVar.b(buvVar) == aoluVar) {
                        return aoluVar;
                    }
                } else {
                    if (i2 != 1) {
                        if (i2 != 2) {
                            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        obj2 = buvVar.d;
                        try {
                            defpackage.aooc.af(obj3);
                            U(null);
                            ((defpackage.apdp) obj2).d();
                            return obj3;
                        } catch (java.lang.Throwable th2) {
                            th = th2;
                            U(null);
                            throw th;
                        }
                    }
                    defpackage.apdp apdpVar2 = buvVar.d;
                    buu buuVar2 = buvVar.c;
                    defpackage.aooc.af(obj3);
                    obj = apdpVar2;
                    buuVar = buuVar2;
                }
                buvVar.c = buuVar;
                buvVar.d = (defpackage.apdp) obj;
                buvVar.b = 2;
                defpackage.aosc aoscVar = new defpackage.aosc(defpackage.ajsz.ap(buvVar), 1);
                aoscVar.z();
                U(new but(buuVar, aoscVar));
                java.lang.Object objK = aoscVar.k();
                if (objK == aoluVar) {
                    return aoluVar;
                }
                java.lang.Object obj4 = obj;
                obj3 = objK;
                obj2 = obj4;
                U(null);
                ((defpackage.apdp) obj2).d();
                return obj3;
            } catch (java.lang.Throwable th3) {
                th = th3;
                U(null);
                throw th;
            }
        } catch (java.lang.Throwable th4) {
            ((defpackage.apdp) buuVar).d();
            throw th4;
        }
    }

    public final java.lang.Object N(java.lang.String str, java.lang.String str2, int i, defpackage.aoln aolnVar) {
        return M(new buu(str, str2, i), aolnVar);
    }

    public final java.lang.Object O(aoc aocVar, defpackage.aonj aonjVar, defpackage.aoln aolnVar) {
        return defpackage.aosv.m(new aoe(aocVar, this, aonjVar, (defpackage.aoln) null, 0), aolnVar);
    }

    public final java.lang.Object P(java.lang.Object obj, aoc aocVar, defpackage.aonn aonnVar, defpackage.aoln aolnVar) {
        return defpackage.aosv.m(new aof(aocVar, this, aonnVar, obj, (defpackage.aoln) null), aolnVar);
    }

    public final void Q() {
        ((defpackage.apdp) this.a).d();
    }

    public final defpackage.nf R(java.lang.Object obj) {
        return new defpackage.nf(this.a, obj);
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [aoub, java.lang.Object] */
    public final void T(defpackage.vx vxVar) {
        java.util.concurrent.atomic.AtomicReference atomicReference;
        defpackage.vx vxVar2;
        do {
            atomicReference = (java.util.concurrent.atomic.AtomicReference) this.b;
            vxVar2 = (defpackage.vx) atomicReference.get();
            if (vxVar2 != null) {
                if (((aoc) vxVar.a).compareTo((java.lang.Enum) vxVar2.a) < 0) {
                    throw new java.util.concurrent.CancellationException("Current mutation had a higher priority");
                }
            }
        } while (!defpackage.anty.Q(atomicReference, vxVar2, vxVar));
        if (vxVar2 != null) {
            vxVar2.b.s(new aod());
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [aoir, java.lang.Object] */
    public final defpackage.nd a() {
        return (defpackage.nd) this.b.a();
    }

    public final defpackage.fxy b() {
        return a().a;
    }

    public final void c(defpackage.na naVar) {
        defpackage.aooh.f(naVar, "onBackPressedCallback");
        a().a.e(naVar.g(new defpackage.nb(naVar, null)));
    }

    public final void d(defpackage.emx emxVar, defpackage.na naVar) {
        if (emxVar == null) {
            defpackage.aooh.i("owner");
        }
        if (naVar == null) {
            defpackage.aooh.i("onBackPressedCallback");
        }
        final defpackage.ems emsVarP = emxVar.P();
        if (emsVarP.a() != defpackage.emq.a) {
            defpackage.mz mzVarG = naVar.g(new defpackage.nb(naVar, emxVar));
            mzVarG.e(false);
            a().a.e(mzVarG);
            final defpackage.ne neVar = new defpackage.ne(mzVarG, emsVarP, 0);
            emsVarP.c(neVar);
            naVar.c.add(new java.lang.AutoCloseable() { // from class: nc
                @Override // java.lang.AutoCloseable
                public final void close() {
                    emsVarP.d(neVar);
                }
            });
        }
    }

    public final void e() {
        a().b();
    }

    public final void f(android.window.OnBackInvokedDispatcher onBackInvokedDispatcher) {
        if (onBackInvokedDispatcher == null) {
            defpackage.aooh.i("invoker");
        }
        defpackage.fxy fxyVar = a().a;
        if (onBackInvokedDispatcher == null) {
            defpackage.aooh.i("onBackInvokedDispatcher");
        }
        fxyVar.b(new defpackage.fyi(onBackInvokedDispatcher, 0), 1);
        a().a.b(new defpackage.fyi(onBackInvokedDispatcher), 0);
    }

    public final java.lang.Object g(akd akdVar, defpackage.aonj aonjVar, defpackage.aoln aolnVar) {
        return defpackage.aosv.m(new aoe(akdVar, this, aonjVar, (defpackage.aoln) null, 1), aolnVar);
    }

    public final kl h(defpackage.ld ldVar, int i) {
        defpackage.mb mbVar;
        kl klVar;
        defpackage.aec aecVar = (defpackage.aec) this.b;
        int iC = aecVar.c(ldVar);
        kl klVar2 = null;
        if (iC >= 0 && (mbVar = (defpackage.mb) aecVar.g(iC)) != null) {
            int i2 = mbVar.b;
            if ((i2 & i) != 0) {
                int i3 = i2 & (~i);
                mbVar.b = i3;
                if (i == 4) {
                    klVar = mbVar.c;
                } else {
                    if (i != 8) {
                        throw new java.lang.IllegalArgumentException("Must provide flag PRE or POST");
                    }
                    klVar = mbVar.d;
                }
                klVar2 = klVar;
                if ((i3 & 12) == 0) {
                    aecVar.e(iC);
                    defpackage.mb.b(mbVar);
                }
            }
        }
        return klVar2;
    }

    public final void i(defpackage.ld ldVar) {
        defpackage.aec aecVar = (defpackage.aec) this.b;
        defpackage.mb mbVarA = (defpackage.mb) aecVar.get(ldVar);
        if (mbVarA == null) {
            mbVarA = defpackage.mb.a();
            aecVar.put(ldVar, mbVarA);
        }
        mbVarA.b |= 1;
    }

    public final void j(long j, defpackage.ld ldVar) {
        ((defpackage.adb) this.a).g(j, ldVar);
    }

    public final void k(defpackage.ld ldVar, kl klVar) {
        defpackage.aec aecVar = (defpackage.aec) this.b;
        defpackage.mb mbVarA = (defpackage.mb) aecVar.get(ldVar);
        if (mbVarA == null) {
            mbVarA = defpackage.mb.a();
            aecVar.put(ldVar, mbVarA);
        }
        mbVarA.d = klVar;
        mbVarA.b |= 8;
    }

    public final void l(defpackage.ld ldVar, kl klVar) {
        defpackage.aec aecVar = (defpackage.aec) this.b;
        defpackage.mb mbVarA = (defpackage.mb) aecVar.get(ldVar);
        if (mbVarA == null) {
            mbVarA = defpackage.mb.a();
            aecVar.put(ldVar, mbVarA);
        }
        mbVarA.c = klVar;
        mbVarA.b |= 4;
    }

    public final void m() {
        ((defpackage.aec) this.b).clear();
        ((defpackage.adb) this.a).f();
    }

    public final void n(defpackage.ld ldVar) {
        defpackage.mb mbVar = (defpackage.mb) ((defpackage.aec) this.b).get(ldVar);
        if (mbVar != null) {
            mbVar.b &= -2;
        }
    }

    public final void o(defpackage.ld ldVar) {
        defpackage.adb adbVar = (defpackage.adb) this.a;
        int iB = adbVar.b();
        while (true) {
            iB--;
            if (iB < 0) {
                break;
            }
            if (ldVar == adbVar.e(iB)) {
                java.lang.Object[] objArr = adbVar.c;
                java.lang.Object obj = objArr[iB];
                java.lang.Object obj2 = adc.a;
                if (obj == obj2) {
                    break;
                }
                objArr[iB] = obj2;
                adbVar.a = true;
                break;
            }
        }
        defpackage.mb mbVar = (defpackage.mb) ((defpackage.aec) this.b).remove(ldVar);
        if (mbVar != null) {
            defpackage.mb.b(mbVar);
        }
    }

    public final boolean p(defpackage.ld ldVar) {
        defpackage.mb mbVar = (defpackage.mb) ((defpackage.aec) this.b).get(ldVar);
        return (mbVar == null || (mbVar.b & 1) == 0) ? false : true;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, ma] */
    public final android.view.View q(int i, int i2, int i3, int i4) {
        ?? r0 = this.b;
        int iD = r0.d();
        int iC = r0.c();
        android.view.View view = null;
        int i5 = i;
        while (i5 != i2) {
            android.view.View viewE = r0.e(i5);
            int iB = r0.b(viewE);
            int iA = r0.a(viewE);
            defpackage.lz lzVar = (defpackage.lz) this.a;
            lzVar.c(iD, iC, iB, iA);
            lzVar.b();
            lzVar.a(i3);
            if (lzVar.d()) {
                return viewE;
            }
            if (i4 != 0) {
                lzVar.b();
                lzVar.a(i4);
                if (lzVar.d()) {
                    view = viewE;
                }
            }
            i5 += i2 > i ? 1 : -1;
        }
        return view;
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object, ma] */
    public final boolean r(android.view.View view) {
        java.lang.Object obj = this.a;
        ?? r4 = this.b;
        defpackage.lz lzVar = (defpackage.lz) obj;
        lzVar.c(r4.d(), r4.c(), r4.b(view), r4.a(view));
        lzVar.b();
        lzVar.a(24579);
        return lzVar.d();
    }

    public final void s(android.util.AttributeSet attributeSet, int i) {
        android.content.res.TypedArray typedArrayObtainStyledAttributes = ((android.widget.TextView) this.a).getContext().obtainStyledAttributes(attributeSet, defpackage.ef.i, i, 0);
        try {
            boolean z = typedArrayObtainStyledAttributes.hasValue(14) ? typedArrayObtainStyledAttributes.getBoolean(14, true) : true;
            typedArrayObtainStyledAttributes.recycle();
            java.lang.Object obj = this.b;
            defpackage.ekb ekbVar = defpackage.ekb.b;
            ((defpackage.ekj) ((defpackage.kaw) obj).a).a.a = z;
        } catch (java.lang.Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    public final void t(defpackage.aw awVar, android.os.Bundle bundle) {
        if (awVar == null) {
            defpackage.aooh.i("f");
        }
        defpackage.aw awVar2 = ((defpackage.bo) this.a).p;
        if (awVar2 != null) {
            awVar2.J().A.t(awVar, bundle);
        }
        java.util.Iterator it = ((java.util.concurrent.CopyOnWriteArrayList) this.b).iterator();
        defpackage.aooh.e(it, "iterator(...)");
        while (it.hasNext()) {
            java.lang.Object obj = ((defpackage.kaw) it.next()).a;
        }
    }

    public final void u(defpackage.aw awVar) {
        if (awVar == null) {
            defpackage.aooh.i("f");
        }
        defpackage.bo boVar = (defpackage.bo) this.a;
        android.content.Context context = boVar.n.c;
        defpackage.aw awVar2 = boVar.p;
        if (awVar2 != null) {
            awVar2.J().A.u(awVar);
        }
        java.util.Iterator it = ((java.util.concurrent.CopyOnWriteArrayList) this.b).iterator();
        defpackage.aooh.e(it, "iterator(...)");
        while (it.hasNext()) {
            java.lang.Object obj = ((defpackage.apnt) ((defpackage.kaw) it.next()).a).a;
            if (awVar != null) {
                int i = awVar.F;
                java.lang.String resourceEntryName = i == 0 ? "" : ((agfh) obj).getResources().getResourceEntryName(i);
                java.lang.Class<?> cls = awVar.getClass();
                agfh.c.w("onFragmentAttached fragment name=" + cls.getSimpleName() + ", tag=" + awVar.H + ", id=" + awVar.F + ", name=" + resourceEntryName);
            }
            aggf aggfVarJ = ((com.google.android.setupcompat.internal.TemplateLayout) obj).j(aggf.class);
            if (awVar != null) {
                aggfVarJ.s = awVar.getClass().getSimpleName();
                aggfVarJ.t = awVar.H;
            }
        }
    }

    public final void v(defpackage.aw awVar, android.os.Bundle bundle) {
        if (awVar == null) {
            defpackage.aooh.i("f");
        }
        defpackage.aw awVar2 = ((defpackage.bo) this.a).p;
        if (awVar2 != null) {
            awVar2.J().A.v(awVar, bundle);
        }
        java.util.Iterator it = ((java.util.concurrent.CopyOnWriteArrayList) this.b).iterator();
        defpackage.aooh.e(it, "iterator(...)");
        while (it.hasNext()) {
            java.lang.Object obj = ((defpackage.kaw) it.next()).a;
        }
    }

    public final void w(defpackage.aw awVar) {
        defpackage.aooh.f(awVar, "f");
        defpackage.aw awVar2 = ((defpackage.bo) this.a).p;
        if (awVar2 != null) {
            awVar2.J().A.w(awVar);
        }
        java.util.Iterator it = ((java.util.concurrent.CopyOnWriteArrayList) this.b).iterator();
        defpackage.aooh.e(it, "iterator(...)");
        while (it.hasNext()) {
            java.lang.Object obj = ((defpackage.kaw) it.next()).a;
        }
    }

    public final void x(defpackage.aw awVar) {
        defpackage.aooh.f(awVar, "f");
        defpackage.aw awVar2 = ((defpackage.bo) this.a).p;
        if (awVar2 != null) {
            awVar2.J().A.x(awVar);
        }
        java.util.Iterator it = ((java.util.concurrent.CopyOnWriteArrayList) this.b).iterator();
        defpackage.aooh.e(it, "iterator(...)");
        while (it.hasNext()) {
            java.lang.Object obj = ((defpackage.kaw) it.next()).a;
        }
    }

    public final void y(defpackage.aw awVar) {
        defpackage.aooh.f(awVar, "f");
        defpackage.aw awVar2 = ((defpackage.bo) this.a).p;
        if (awVar2 != null) {
            awVar2.J().A.y(awVar);
        }
        java.util.Iterator it = ((java.util.concurrent.CopyOnWriteArrayList) this.b).iterator();
        defpackage.aooh.e(it, "iterator(...)");
        while (it.hasNext()) {
            java.lang.Object obj = ((defpackage.kaw) it.next()).a;
        }
    }

    public final void z(defpackage.aw awVar) {
        if (awVar == null) {
            defpackage.aooh.i("f");
        }
        defpackage.bo boVar = (defpackage.bo) this.a;
        android.content.Context context = boVar.n.c;
        defpackage.aw awVar2 = boVar.p;
        if (awVar2 != null) {
            awVar2.J().A.z(awVar);
        }
        java.util.Iterator it = ((java.util.concurrent.CopyOnWriteArrayList) this.b).iterator();
        defpackage.aooh.e(it, "iterator(...)");
        while (it.hasNext()) {
            java.lang.Object obj = ((defpackage.kaw) it.next()).a;
        }
    }

    public nf(defpackage.cfc cfcVar, defpackage.aomy aomyVar) {
        this.b = cfcVar;
        this.a = aomyVar;
    }

    public nf(java.lang.Object obj, java.lang.Object obj2) {
        this.a = obj;
        this.b = obj2;
    }

    public nf(defpackage.ma maVar) {
        this.b = maVar;
        this.a = new defpackage.lz();
    }

    public nf(defpackage.bo boVar) {
        this.a = boVar;
        this.b = new java.util.concurrent.CopyOnWriteArrayList();
    }

    public nf(android.widget.TextView textView) {
        this.a = textView;
        this.b = new defpackage.kaw(textView);
    }

    public nf(char[] cArr) {
        this.b = new defpackage.aec(0);
        this.a = new defpackage.adb(10);
    }

    public nf() {
        this((java.lang.Runnable) null);
    }

    public nf(java.lang.Runnable runnable) {
        this.a = runnable;
        this.b = new defpackage.aoiy(new defpackage.ml(this, 5));
    }

    public nf(defpackage.oi oiVar, defpackage.or orVar) {
        if (oiVar == null) {
            defpackage.aooh.i("callback");
        }
        if (orVar == null) {
            defpackage.aooh.i("contract");
        }
        this.a = oiVar;
        this.b = orVar;
    }

    public nf(defpackage.ems emsVar) {
        if (emsVar == null) {
            defpackage.aooh.i("lifecycle");
        }
        this.b = emsVar;
        this.a = new java.util.ArrayList();
    }

    public nf(byte[] bArr) {
        this.b = new java.util.concurrent.atomic.AtomicReference(null);
        this.a = new defpackage.apdp();
    }

    public nf(char[] cArr, byte[] bArr, byte[] bArr2) {
        this.b = new java.util.concurrent.atomic.AtomicReference(null);
        this.a = new defpackage.apdp();
    }

    public nf(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.a = new androidx.compose.runtime.ParcelableSnapshotMutableIntState(Integer.MAX_VALUE);
        this.b = new androidx.compose.runtime.ParcelableSnapshotMutableIntState(Integer.MAX_VALUE);
    }

    public nf(char[] cArr, byte[] bArr) {
        this.a = new defpackage.apdp();
        this.b = new androidx.compose.runtime.ParcelableSnapshotMutableState(null, defpackage.cdu.c);
    }

    public nf(byte[] bArr, byte[] bArr2) {
        this.a = new defpackage.adw(6);
        this.b = new defpackage.adw(6);
    }
}
