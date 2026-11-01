package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class kt {
    public final java.util.ArrayList a;
    public java.util.ArrayList b;
    public final java.util.ArrayList c;
    public final java.util.List d;
    int e;
    public final /* synthetic */ android.support.v7.widget.RecyclerView f;
    defpackage.afab g;

    public kt(android.support.v7.widget.RecyclerView recyclerView) {
        this.f = recyclerView;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        this.a = arrayList;
        this.b = null;
        this.c = new java.util.ArrayList();
        this.d = j$.util.DesugarCollections.unmodifiableList(arrayList);
        this.e = 2;
    }

    public final int a(int i) {
        if (i >= 0) {
            android.support.v7.widget.RecyclerView recyclerView = this.f;
            defpackage.la laVar = recyclerView.L;
            if (i < laVar.a()) {
                return laVar.g ? recyclerView.g.a(i, 0) : i;
            }
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("invalid position ");
        sb.append(i);
        sb.append(". State item count is ");
        android.support.v7.widget.RecyclerView recyclerView2 = this.f;
        sb.append(recyclerView2.L.a());
        sb.append(recyclerView2.l());
        throw new java.lang.IndexOutOfBoundsException(sb.toString());
    }

    final void b(defpackage.ld ldVar, boolean z) {
        android.support.v7.widget.RecyclerView.u(ldVar);
        android.support.v7.widget.RecyclerView recyclerView = this.f;
        android.view.View view = ldVar.a;
        defpackage.lf lfVar = recyclerView.Q;
        if (lfVar != null) {
            defpackage.dye dyeVarJ = lfVar.j();
            defpackage.dzs.i(view, dyeVarJ instanceof defpackage.le ? (defpackage.dye) ((defpackage.le) dyeVarJ).b.remove(view) : null);
        }
        if (z) {
            java.util.List list = recyclerView.o;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                ((ku) list.get(i)).a();
            }
            defpackage.kh khVar = recyclerView.m;
            if (khVar != null) {
                khVar.q(ldVar);
            }
            if (recyclerView.L != null) {
                recyclerView.V.o(ldVar);
            }
        }
        ldVar.r = null;
        ldVar.q = null;
        defpackage.afab afabVarP = p();
        int i2 = ldVar.f;
        java.util.ArrayList arrayList = afabVarP.h(i2).a;
        int i3 = ((defpackage.ks) ((android.util.SparseArray) afabVarP.b).get(i2)).b;
        if (arrayList.size() >= 5) {
            defpackage.eaw.b(view);
        } else {
            ldVar.l();
            arrayList.add(ldVar);
        }
    }

    public final void c() {
        this.a.clear();
        g();
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, java.util.Set] */
    public final void d() {
        android.support.v7.widget.RecyclerView recyclerView;
        defpackage.kh khVar;
        defpackage.afab afabVar = this.g;
        if (afabVar == null || (khVar = (recyclerView = this.f).m) == null || !recyclerView.q) {
            return;
        }
        afabVar.c.add(khVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Set] */
    public final void e(defpackage.kh khVar, boolean z) {
        defpackage.afab afabVar = this.g;
        if (afabVar == null) {
            return;
        }
        ?? r0 = afabVar.c;
        r0.remove(khVar);
        if (r0.size() != 0 || z) {
            return;
        }
        int i = 0;
        while (true) {
            android.util.SparseArray sparseArray = (android.util.SparseArray) afabVar.b;
            if (i >= sparseArray.size()) {
                return;
            }
            java.util.ArrayList arrayList = ((defpackage.ks) sparseArray.get(sparseArray.keyAt(i))).a;
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                defpackage.eaw.b(((defpackage.ld) arrayList.get(i2)).a);
            }
            i++;
        }
    }

    final void f(android.view.View view) {
        defpackage.ld ldVarI = android.support.v7.widget.RecyclerView.i(view);
        ldVarI.m = null;
        ldVarI.n = false;
        ldVarI.i();
        j(ldVarI);
    }

    public final void g() {
        java.util.ArrayList arrayList = this.c;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                arrayList.clear();
                this.f.K.b();
                return;
            }
            h(size);
        }
    }

    public final void h(int i) {
        int i2 = android.support.v7.widget.RecyclerView.aa;
        java.util.ArrayList arrayList = this.c;
        b((defpackage.ld) arrayList.get(i), true);
        arrayList.remove(i);
    }

    public final void i(android.view.View view) {
        defpackage.ld ldVarI = android.support.v7.widget.RecyclerView.i(view);
        if (ldVarI.x()) {
            this.f.removeDetachedView(view, false);
        }
        if (ldVarI.w()) {
            ldVarI.p();
        } else if (ldVarI.B()) {
            ldVarI.i();
        }
        j(ldVarI);
        android.support.v7.widget.RecyclerView recyclerView = this.f;
        if (recyclerView.E == null || ldVarI.u()) {
            return;
        }
        recyclerView.E.b(ldVarI);
    }

    /* JADX WARN: Code duplicated, block: B:15:0x002c  */
    final void j(defpackage.ld ldVar) {
        boolean z;
        boolean z2;
        boolean z3 = true;
        boolean z4 = false;
        if (!ldVar.w()) {
            android.view.View view = ldVar.a;
            if (view.getParent() == null) {
                if (ldVar.x()) {
                    throw new java.lang.IllegalArgumentException("Tmp detached view should be removed from RecyclerView before it can be recycled: " + ldVar + this.f.l());
                }
                if (ldVar.A()) {
                    throw new java.lang.IllegalArgumentException("Trying to recycle an ignored view holder. You should first call stopIgnoringView(view) before calling recycle.".concat(this.f.l()));
                }
                if ((ldVar.j & 16) == 0) {
                    int i = defpackage.dzs.a;
                    if (view.hasTransientState()) {
                        z = true;
                    } else {
                        z = false;
                    }
                } else {
                    z = false;
                }
                android.support.v7.widget.RecyclerView recyclerView = this.f;
                if (ldVar.u()) {
                    if (this.e <= 0 || ldVar.q(526)) {
                        z2 = false;
                    } else {
                        java.util.ArrayList arrayList = this.c;
                        int size = arrayList.size();
                        if (size >= this.e && size > 0) {
                            h(0);
                            size--;
                        }
                        if (size > 0 && !recyclerView.K.d(ldVar.c)) {
                            do {
                                size--;
                                if (size < 0) {
                                    break;
                                }
                            } while (recyclerView.K.d(((defpackage.ld) arrayList.get(size)).c));
                            size++;
                        }
                        arrayList.add(size, ldVar);
                        z2 = true;
                    }
                    if (z2) {
                        z3 = false;
                    } else {
                        b(ldVar, true);
                    }
                    z4 = z2;
                } else {
                    z3 = false;
                }
                recyclerView.V.o(ldVar);
                if (z4 || z3 || !z) {
                    return;
                }
                defpackage.eaw.b(view);
                ldVar.r = null;
                ldVar.q = null;
                return;
            }
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Scrapped or attached views may not be recycled. isScrap:");
        sb.append(ldVar.w());
        sb.append(" isAttached:");
        sb.append(ldVar.a.getParent() != null);
        sb.append(this.f.l());
        throw new java.lang.IllegalArgumentException(sb.toString());
    }

    final void k(android.view.View view) {
        defpackage.km kmVar;
        defpackage.ld ldVarI = android.support.v7.widget.RecyclerView.i(view);
        if (!ldVarI.q(12) && ldVarI.y() && (kmVar = this.f.E) != null && !kmVar.g(ldVarI, ldVarI.d())) {
            if (this.b == null) {
                this.b = new java.util.ArrayList();
            }
            ldVarI.o(this, true);
            this.b.add(ldVarI);
            return;
        }
        if (ldVarI.t() && !ldVarI.v()) {
            android.support.v7.widget.RecyclerView recyclerView = this.f;
            if (!recyclerView.m.c) {
                throw new java.lang.IllegalArgumentException("Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool.".concat(recyclerView.l()));
            }
        }
        ldVarI.o(this, false);
        this.a.add(ldVarI);
    }

    public final void l(defpackage.ld ldVar) {
        if (ldVar.n) {
            this.b.remove(ldVar);
        } else {
            this.a.remove(ldVar);
        }
        ldVar.m = null;
        ldVar.n = false;
        ldVar.i();
    }

    public final void m() {
        defpackage.kp kpVar = this.f.n;
        this.e = (kpVar != null ? kpVar.y : 0) + 2;
        java.util.ArrayList arrayList = this.c;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0 || arrayList.size() <= this.e) {
                return;
            } else {
                h(size);
            }
        }
    }

    public final android.view.View n(int i) {
        return o(i, Long.MAX_VALUE).a;
    }

    /* JADX WARN: Code duplicated, block: B:114:0x01d8  */
    /* JADX WARN: Code duplicated, block: B:115:0x01e1  */
    /* JADX WARN: Code duplicated, block: B:117:0x01e7  */
    /* JADX WARN: Code duplicated, block: B:119:0x01ef  */
    /* JADX WARN: Code duplicated, block: B:171:0x02f2 A[EDGE_INSN: B:171:0x02f2->B:172:0x02f3 BREAK  A[LOOP:5: B:166:0x02da->B:170:0x02ef]] */
    /* JADX WARN: Code duplicated, block: B:244:0x046e  */
    /* JADX WARN: Code duplicated, block: B:274:0x04ed  */
    /* JADX WARN: Code duplicated, block: B:275:0x04f5  */
    /* JADX WARN: Code duplicated, block: B:277:0x04fb  */
    /* JADX WARN: Code duplicated, block: B:278:0x0503  */
    /* JADX WARN: Code duplicated, block: B:283:0x050f  */
    /* JADX WARN: Code duplicated, block: B:34:0x007a A[EDGE_INSN: B:34:0x007a->B:35:0x007b BREAK  A[LOOP:0: B:13:0x0022->B:19:0x003c]] */
    final defpackage.ld o(int i, long j) {
        boolean z;
        defpackage.ld ldVarD;
        long j2;
        long j3;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        android.view.View view;
        android.view.ViewGroup.LayoutParams layoutParams;
        android.view.ViewGroup.LayoutParams layoutParamsGenerateLayoutParams;
        boolean z6;
        defpackage.ld ldVar;
        android.view.View view2;
        int size;
        int iA;
        if (i >= 0) {
            android.support.v7.widget.RecyclerView recyclerView = this.f;
            defpackage.la laVar = recyclerView.L;
            if (i < laVar.a()) {
                if (laVar.g) {
                    java.util.ArrayList arrayList = this.b;
                    if (arrayList != null && (size = arrayList.size()) != 0) {
                        int i2 = 0;
                        while (true) {
                            if (i2 >= size) {
                                if (recyclerView.m.c && (iA = recyclerView.g.a(i, 0)) > 0 && iA < recyclerView.m.a()) {
                                    long jC = recyclerView.m.c(iA);
                                    int i3 = 0;
                                    while (true) {
                                        if (i3 >= size) {
                                            ldVarD = null;
                                            break;
                                        }
                                        defpackage.ld ldVar2 = (defpackage.ld) this.b.get(i3);
                                        if (!ldVar2.B() && ldVar2.e == jC) {
                                            ldVar2.f(32);
                                            ldVarD = ldVar2;
                                            break;
                                        }
                                        i3++;
                                    }
                                } else {
                                    ldVarD = null;
                                    break;
                                }
                            } else {
                                ldVarD = (defpackage.ld) this.b.get(i2);
                                if (!ldVarD.B() && ldVarD.c() == i) {
                                    ldVarD.f(32);
                                    break;
                                }
                                i2++;
                            }
                        }
                    } else {
                        ldVarD = null;
                        break;
                    }
                    z = ldVarD != null;
                } else {
                    z = false;
                    ldVarD = null;
                }
                if (ldVarD == null) {
                    java.util.ArrayList arrayList2 = this.a;
                    int size2 = arrayList2.size();
                    int i4 = 0;
                    while (true) {
                        if (i4 >= size2) {
                            defpackage.ip ipVar = recyclerView.h;
                            java.util.List list = ipVar.b;
                            int size3 = list.size();
                            int i5 = 0;
                            while (true) {
                                if (i5 >= size3) {
                                    view2 = null;
                                    break;
                                }
                                view2 = (android.view.View) list.get(i5);
                                defpackage.apnt apntVar = ipVar.e;
                                defpackage.ld ldVar3 = view2 == null ? null : ((defpackage.kq) view2.getLayoutParams()).c;
                                if (ldVar3.c() == i && !ldVar3.t() && !ldVar3.v()) {
                                    break;
                                }
                                i5++;
                            }
                            if (view2 == null) {
                                java.util.ArrayList arrayList3 = this.c;
                                int size4 = arrayList3.size();
                                int i6 = 0;
                                while (true) {
                                    if (i6 >= size4) {
                                        ldVarD = null;
                                        break;
                                    }
                                    defpackage.ld ldVar4 = (defpackage.ld) arrayList3.get(i6);
                                    if (!ldVar4.t() && ldVar4.c() == i && !ldVar4.r()) {
                                        arrayList3.remove(i6);
                                        ldVarD = ldVar4;
                                        break;
                                    }
                                    i6++;
                                }
                            } else {
                                defpackage.ld ldVar5 = ((defpackage.kq) view2.getLayoutParams()).c;
                                defpackage.ip ipVar2 = recyclerView.h;
                                int iE = ipVar2.e.E(view2);
                                if (iE < 0) {
                                    java.util.Objects.toString(view2);
                                    throw new java.lang.IllegalArgumentException("view is not a child, cannot hide ".concat(view2.toString()));
                                }
                                defpackage.io ioVar = ipVar2.a;
                                if (!ioVar.f(iE)) {
                                    java.util.Objects.toString(view2);
                                    throw new java.lang.RuntimeException("trying to unhide a view that was not hidden".concat(view2.toString()));
                                }
                                ioVar.b(iE);
                                ipVar2.l(view2);
                                int iC = recyclerView.h.c(view2);
                                if (iC == -1) {
                                    throw new java.lang.IllegalStateException("layout index should not be -1 after unhiding a view:" + ldVar5 + recyclerView.l());
                                }
                                recyclerView.h.h(iC);
                                k(view2);
                                ldVar5.f(8224);
                                ldVarD = ldVar5;
                                break;
                            }
                        } else {
                            defpackage.ld ldVar6 = (defpackage.ld) arrayList2.get(i4);
                            if (!ldVar6.B() && ldVar6.c() == i && !ldVar6.t() && (laVar.g || !ldVar6.v())) {
                                ldVar6.f(32);
                                ldVarD = ldVar6;
                                break;
                            }
                            i4++;
                        }
                    }
                    if (ldVarD != null) {
                        if (!ldVarD.v()) {
                            int i7 = ldVarD.c;
                            if (i7 < 0 || i7 >= recyclerView.m.a()) {
                                throw new java.lang.IndexOutOfBoundsException("Inconsistency detected. Invalid view holder adapter position" + ldVarD + recyclerView.l());
                            }
                            if (laVar.g || recyclerView.m.b(ldVarD.c) == ldVarD.f) {
                                defpackage.kh khVar = recyclerView.m;
                                if (!khVar.c || ldVarD.e == khVar.c(ldVarD.c)) {
                                    z = true;
                                }
                            }
                            ldVarD.f(4);
                            if (ldVarD.w()) {
                                recyclerView.removeDetachedView(ldVarD.a, false);
                                ldVarD.p();
                            } else if (ldVarD.B()) {
                                ldVarD.i();
                            }
                            j(ldVarD);
                            ldVarD = null;
                        } else if (laVar.g) {
                            z = true;
                        } else {
                            ldVarD.f(4);
                            if (ldVarD.w()) {
                                recyclerView.removeDetachedView(ldVarD.a, false);
                                ldVarD.p();
                            } else if (ldVarD.B()) {
                                ldVarD.i();
                            }
                            j(ldVarD);
                            ldVarD = null;
                        }
                    }
                }
                if (ldVarD == null) {
                    int iA2 = recyclerView.g.a(i, 0);
                    if (iA2 < 0 || iA2 >= recyclerView.m.a()) {
                        throw new java.lang.IndexOutOfBoundsException("Inconsistency detected. Invalid item position " + i + "(offset:" + iA2 + ").state:" + laVar.a() + recyclerView.l());
                    }
                    int iB = recyclerView.m.b(iA2);
                    defpackage.kh khVar2 = recyclerView.m;
                    j2 = 0;
                    if (khVar2.c) {
                        long jC2 = khVar2.c(iA2);
                        java.util.ArrayList arrayList4 = this.a;
                        int size5 = arrayList4.size() - 1;
                        while (true) {
                            if (size5 < 0) {
                                j3 = Long.MAX_VALUE;
                                java.util.ArrayList arrayList5 = this.c;
                                int size6 = arrayList5.size() - 1;
                                while (true) {
                                    if (size6 >= 0) {
                                        defpackage.ld ldVar7 = (defpackage.ld) arrayList5.get(size6);
                                        if (ldVar7.e != jC2 || ldVar7.r()) {
                                            size6--;
                                        } else {
                                            if (iB == ldVar7.f) {
                                                arrayList5.remove(size6);
                                                ldVarD = ldVar7;
                                                break;
                                            }
                                            h(size6);
                                        }
                                    }
                                    ldVarD = null;
                                    break;
                                }
                            }
                            j3 = Long.MAX_VALUE;
                            defpackage.ld ldVar8 = (defpackage.ld) arrayList4.get(size5);
                            if (ldVar8.e == jC2 && !ldVar8.B()) {
                                if (iB == ldVar8.f) {
                                    ldVar8.f(32);
                                    if (ldVar8.v() && !laVar.g) {
                                        ldVar8.m(2, 14);
                                    }
                                    ldVarD = ldVar8;
                                    break;
                                }
                                arrayList4.remove(size5);
                                android.view.View view3 = ldVar8.a;
                                recyclerView.removeDetachedView(view3, false);
                                f(view3);
                            }
                            size5--;
                        }
                        if (ldVarD != null) {
                            ldVarD.c = iA2;
                            z = true;
                        }
                    } else {
                        j3 = Long.MAX_VALUE;
                    }
                    if (ldVarD == null) {
                        defpackage.ks ksVar = (defpackage.ks) ((android.util.SparseArray) p().b).get(iB);
                        if (ksVar == null) {
                            ldVar = null;
                            break;
                        }
                        java.util.ArrayList arrayList6 = ksVar.a;
                        if (!arrayList6.isEmpty()) {
                            int size7 = arrayList6.size() - 1;
                            while (true) {
                                if (size7 < 0) {
                                    ldVar = null;
                                    break;
                                }
                                if (!((defpackage.ld) arrayList6.get(size7)).r()) {
                                    ldVar = (defpackage.ld) arrayList6.remove(size7);
                                    break;
                                }
                                size7--;
                            }
                        } else {
                            ldVar = null;
                            break;
                        }
                        if (ldVar != null) {
                            ldVar.l();
                        }
                        ldVarD = ldVar;
                    }
                    if (ldVarD == null) {
                        long jNanoTime = java.lang.System.nanoTime();
                        if (j != j3) {
                            long j4 = this.g.h(iB).c;
                            if (j4 != 0 && j4 + jNanoTime >= j) {
                                return null;
                            }
                        }
                        defpackage.kh khVar3 = recyclerView.m;
                        try {
                            if (da$.ExternalSyntheticApiModelOutline0.m()) {
                                android.os.Trace.beginSection(java.lang.String.format("RV onCreateViewHolder type=0x%X", java.lang.Integer.valueOf(iB)));
                            }
                            ldVarD = khVar3.d(recyclerView, iB);
                            if (ldVarD.a.getParent() != null) {
                                throw new java.lang.IllegalStateException("ViewHolder views must not be attached when created. Ensure that you are not passing 'true' to the attachToRoot parameter of LayoutInflater.inflate(..., boolean attachToRoot)");
                            }
                            ldVarD.f = iB;
                            android.os.Trace.endSection();
                            android.support.v7.widget.RecyclerView recyclerViewJ = android.support.v7.widget.RecyclerView.j(ldVarD.a);
                            if (recyclerViewJ != null) {
                                ldVarD.b = new java.lang.ref.WeakReference(recyclerViewJ);
                            }
                            long jNanoTime2 = java.lang.System.nanoTime() - jNanoTime;
                            defpackage.ks ksVarH = this.g.h(iB);
                            ksVarH.c = defpackage.afab.i(ksVarH.c, jNanoTime2);
                        } catch (java.lang.Throwable th) {
                            android.os.Trace.endSection();
                            throw th;
                        }
                    }
                } else {
                    j2 = 0;
                    j3 = Long.MAX_VALUE;
                }
                if (z) {
                    android.support.v7.widget.RecyclerView recyclerView2 = this.f;
                    defpackage.la laVar2 = recyclerView2.L;
                    if (!laVar2.g && ldVarD.q(8192)) {
                        ldVarD.m(0, 8192);
                        if (laVar2.j) {
                            defpackage.km.t(ldVarD);
                            ldVarD.d();
                            recyclerView2.S(ldVarD, defpackage.km.s(ldVarD));
                        }
                    }
                }
                android.support.v7.widget.RecyclerView recyclerView3 = this.f;
                defpackage.la laVar3 = recyclerView3.L;
                if (!laVar3.g || !ldVarD.s()) {
                    if (!ldVarD.s() || ldVarD.z() || ldVarD.t()) {
                        int iA3 = recyclerView3.g.a(i, 0);
                        ldVarD.r = null;
                        ldVarD.q = recyclerView3;
                        int i8 = ldVarD.f;
                        long jNanoTime3 = java.lang.System.nanoTime();
                        if (j != j3) {
                            long j5 = this.g.h(i8).d;
                            if (j5 == j2 || j5 + jNanoTime3 < j) {
                            }
                        }
                        if (ldVarD.x()) {
                            android.view.View view4 = ldVarD.a;
                            recyclerView3.attachViewToParent(view4, recyclerView3.getChildCount(), view4.getLayoutParams());
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        defpackage.kh khVar4 = recyclerView3.m;
                        boolean z7 = ldVarD.r == null;
                        if (z7) {
                            ldVarD.c = iA3;
                            if (khVar4.c) {
                                ldVarD.e = khVar4.c(iA3);
                            }
                            ldVarD.m(1, 519);
                            if (da$.ExternalSyntheticApiModelOutline0.m()) {
                                z3 = false;
                                android.os.Trace.beginSection(java.lang.String.format("RV onBindViewHolder type=0x%X", java.lang.Integer.valueOf(ldVarD.f)));
                            } else {
                                z3 = false;
                            }
                        } else {
                            z3 = false;
                        }
                        ldVarD.r = khVar4;
                        ldVarD.d();
                        khVar4.m(ldVarD, iA3);
                        if (z7) {
                            ldVarD.h();
                            android.view.ViewGroup.LayoutParams layoutParams2 = ldVarD.a.getLayoutParams();
                            if (layoutParams2 instanceof defpackage.kq) {
                                ((defpackage.kq) layoutParams2).e = true;
                            }
                            android.os.Trace.endSection();
                        }
                        if (z2) {
                            recyclerView3.detachViewFromParent(ldVarD.a);
                        }
                        long jNanoTime4 = java.lang.System.nanoTime();
                        defpackage.ks ksVarH2 = this.g.h(ldVarD.f);
                        ksVarH2.d = defpackage.afab.i(ksVarH2.d, jNanoTime4 - jNanoTime3);
                        if (recyclerView3.al()) {
                            android.view.View view5 = ldVarD.a;
                            z4 = true;
                            if (view5.getImportantForAccessibility() == 0) {
                                view5.setImportantForAccessibility(1);
                            }
                            defpackage.lf lfVar = recyclerView3.Q;
                            if (lfVar != null) {
                                defpackage.dye dyeVarJ = lfVar.j();
                                if (dyeVarJ instanceof defpackage.le) {
                                    defpackage.le leVar = (defpackage.le) dyeVarJ;
                                    defpackage.dye dyeVarB = defpackage.dzs.b(view5);
                                    if (dyeVarB != null && dyeVarB != leVar) {
                                        leVar.b.put(view5, dyeVarB);
                                    }
                                }
                                defpackage.dzs.i(view5, dyeVarJ);
                            }
                        } else {
                            z4 = true;
                        }
                        if (laVar3.g) {
                            ldVarD.g = i;
                        }
                        z5 = z4;
                    }
                    view = ldVarD.a;
                    layoutParams = view.getLayoutParams();
                    if (layoutParams == null) {
                        layoutParamsGenerateLayoutParams = recyclerView3.generateDefaultLayoutParams();
                        view.setLayoutParams(layoutParamsGenerateLayoutParams);
                    } else if (recyclerView3.checkLayoutParams(layoutParams)) {
                        layoutParamsGenerateLayoutParams = (defpackage.kq) layoutParams;
                    } else {
                        layoutParamsGenerateLayoutParams = recyclerView3.generateLayoutParams(layoutParams);
                        view.setLayoutParams(layoutParamsGenerateLayoutParams);
                    }
                    defpackage.kq kqVar = (defpackage.kq) layoutParamsGenerateLayoutParams;
                    kqVar.c = ldVarD;
                    if (z || !z5) {
                        z6 = z3;
                    } else {
                        z6 = z4;
                    }
                    kqVar.f = z6;
                    return ldVarD;
                }
                ldVarD.g = i;
                z5 = false;
                z4 = true;
                z3 = false;
                view = ldVarD.a;
                layoutParams = view.getLayoutParams();
                if (layoutParams == null) {
                    layoutParamsGenerateLayoutParams = recyclerView3.generateDefaultLayoutParams();
                    view.setLayoutParams(layoutParamsGenerateLayoutParams);
                } else if (recyclerView3.checkLayoutParams(layoutParams)) {
                    layoutParamsGenerateLayoutParams = recyclerView3.generateLayoutParams(layoutParams);
                    view.setLayoutParams(layoutParamsGenerateLayoutParams);
                } else {
                    layoutParamsGenerateLayoutParams = (defpackage.kq) layoutParams;
                }
                defpackage.kq kqVar2 = (defpackage.kq) layoutParamsGenerateLayoutParams;
                kqVar2.c = ldVarD;
                if (z) {
                    z6 = z3;
                } else {
                    z6 = z3;
                }
                kqVar2.f = z6;
                return ldVarD;
            }
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Invalid item position ");
        sb.append(i);
        sb.append('(');
        sb.append(i);
        sb.append("). Item count:");
        android.support.v7.widget.RecyclerView recyclerView4 = this.f;
        sb.append(recyclerView4.L.a());
        sb.append(recyclerView4.l());
        throw new java.lang.IndexOutOfBoundsException(sb.toString());
    }

    public final defpackage.afab p() {
        if (this.g == null) {
            this.g = new defpackage.afab(null, null);
            d();
        }
        return this.g;
    }
}
