package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class ag extends defpackage.ch {
    public final java.util.List a;
    public final cj b;
    public final cj c;
    public final defpackage.ce d;
    public final aca e;
    public final boolean f;
    public java.lang.Object g;
    public boolean h;
    private final java.lang.Object k;
    private final java.util.ArrayList l;
    private final java.util.ArrayList m;
    private final aca n;
    private final java.util.ArrayList o;
    private final java.util.ArrayList p;
    private final aca q;
    private final defpackage.dxa r = new defpackage.dxa();

    public ag(java.util.List list, cj cjVar, cj cjVar2, defpackage.ce ceVar, java.lang.Object obj, java.util.ArrayList arrayList, java.util.ArrayList arrayList2, aca acaVar, java.util.ArrayList arrayList3, java.util.ArrayList arrayList4, aca acaVar2, aca acaVar3, boolean z) {
        this.a = list;
        this.b = cjVar;
        this.c = cjVar2;
        this.d = ceVar;
        this.k = obj;
        this.l = arrayList;
        this.m = arrayList2;
        this.n = acaVar;
        this.o = arrayList3;
        this.p = arrayList4;
        this.q = acaVar2;
        this.e = acaVar3;
        this.f = z;
    }

    private final aoiu g(android.view.ViewGroup viewGroup, cj cjVar, cj cjVar2) {
        defpackage.ce ceVar;
        java.lang.Object obj;
        java.util.ArrayList arrayList;
        java.lang.Object obj2;
        cjVar = cjVar;
        android.view.View view = new android.view.View(viewGroup.getContext());
        android.graphics.Rect rect = new android.graphics.Rect();
        java.util.List list = this.a;
        java.util.Iterator it = list.iterator();
        int i = 0;
        boolean z = false;
        android.view.View view2 = null;
        while (it.hasNext()) {
            if (((defpackage.ah) it.next()).c() && cjVar2 != null && cjVar != null && !this.n.isEmpty() && (obj2 = this.k) != null) {
                aca acaVar = this.q;
                defpackage.bx.b(cjVar.a, cjVar2.a);
                dza.b(viewGroup, new defpackage.ac(cjVar, cjVar2, this, i));
                java.util.ArrayList arrayList2 = this.l;
                arrayList2.addAll(acaVar.values());
                java.util.ArrayList arrayList3 = this.p;
                if (!arrayList3.isEmpty()) {
                    java.lang.Object obj3 = arrayList3.get(i);
                    aooh.e(obj3, "get(...)");
                    view2 = (android.view.View) acaVar.get((java.lang.String) obj3);
                    this.d.i(obj2, view2);
                }
                java.util.ArrayList arrayList4 = this.m;
                aca acaVar2 = this.e;
                arrayList4.addAll(acaVar2.values());
                java.util.ArrayList arrayList5 = this.o;
                if (!arrayList5.isEmpty()) {
                    java.lang.Object obj4 = arrayList5.get(0);
                    aooh.e(obj4, "get(...)");
                    android.view.View view3 = (android.view.View) acaVar2.get((java.lang.String) obj4);
                    if (view3 != null) {
                        dza.b(viewGroup, new ad(view3, rect, 0));
                        z = true;
                    }
                }
                defpackage.ce ceVar2 = this.d;
                ceVar2.j(obj2, view, arrayList2);
                ceVar2.p(obj2, null, null, obj2, arrayList4);
            }
            list = list;
            i = 0;
        }
        java.util.List list2 = list;
        java.util.ArrayList arrayList6 = new java.util.ArrayList();
        java.util.Iterator it2 = list2.iterator();
        java.lang.Object objO = null;
        while (it2.hasNext()) {
            defpackage.ah ahVar = (defpackage.ah) it2.next();
            cj cjVar3 = ahVar.a;
            defpackage.ce ceVar3 = this.d;
            java.lang.Object objA = ceVar3.a(ahVar.b);
            if (objA != null) {
                java.util.Iterator it3 = it2;
                java.util.ArrayList arrayList7 = new java.util.ArrayList();
                boolean z2 = z;
                aw awVar = cjVar3.a;
                java.lang.Object obj5 = objO;
                android.view.View view4 = awVar.Q;
                aooh.e(view4, "mView");
                h(arrayList7, view4);
                if (this.k != null) {
                    if (cjVar3 == cjVar2) {
                        arrayList7.removeAll(ajsz.cf(this.l));
                    } else if (cjVar3 == cjVar) {
                        arrayList7.removeAll(ajsz.cf(this.m));
                    }
                }
                if (arrayList7.isEmpty()) {
                    ceVar3.c(objA, view);
                    arrayList = arrayList7;
                    obj = objA;
                    ceVar = ceVar3;
                } else {
                    ceVar3.d(objA, arrayList7);
                    ceVar3.p(objA, objA, arrayList7, null, null);
                    ceVar = ceVar3;
                    obj = objA;
                    arrayList = arrayList7;
                    if (cjVar3.h == 3) {
                        cjVar3.g();
                        java.util.ArrayList arrayList8 = new java.util.ArrayList(arrayList);
                        arrayList8.remove(awVar.Q);
                        ceVar.g(obj, awVar.Q, arrayList8);
                        dza.b(viewGroup, new ae(arrayList, 0));
                    }
                }
                if (cjVar3.h == 2) {
                    arrayList6.addAll(arrayList);
                    if (z2) {
                        ceVar.h(obj, rect);
                    }
                    if (bo.Z(2)) {
                        java.util.Objects.toString(obj);
                        android.util.Log.v("FragmentManager", "Entering Transition: ".concat(obj.toString()));
                        android.util.Log.v("FragmentManager", ">>>>> EnteringViews <<<<<");
                        java.util.Iterator it4 = arrayList.iterator();
                        aooh.e(it4, "iterator(...)");
                        while (it4.hasNext()) {
                            java.lang.Object next = it4.next();
                            aooh.e(next, "next(...)");
                            android.view.View view5 = (android.view.View) next;
                            java.util.Objects.toString(view5);
                            android.util.Log.v("FragmentManager", "View: ".concat(java.lang.String.valueOf(view5)));
                        }
                    }
                } else {
                    ceVar.i(obj, view2);
                    if (bo.Z(2)) {
                        java.util.Objects.toString(obj);
                        android.util.Log.v("FragmentManager", "Exiting Transition: ".concat(obj.toString()));
                        android.util.Log.v("FragmentManager", ">>>>> ExitingViews <<<<<");
                        java.util.Iterator it5 = arrayList.iterator();
                        aooh.e(it5, "iterator(...)");
                        while (it5.hasNext()) {
                            java.lang.Object next2 = it5.next();
                            aooh.e(next2, "next(...)");
                            android.view.View view6 = (android.view.View) next2;
                            java.util.Objects.toString(view6);
                            android.util.Log.v("FragmentManager", "View: ".concat(java.lang.String.valueOf(view6)));
                        }
                    }
                }
                boolean z3 = ahVar.c;
                objO = ceVar.o(obj5, obj);
                it2 = it3;
                z = z2;
            }
        }
        java.lang.Object objR = this.d.r(objO, this.k);
        if (bo.Z(2)) {
            android.util.Log.v("FragmentManager", a.bi(viewGroup, objR, "Final merged transition: ", " for container "));
        }
        return new aoiu(arrayList6, objR);
    }

    private final void h(java.util.ArrayList arrayList, android.view.View view) {
        if (!(view instanceof android.view.ViewGroup)) {
            if (arrayList.contains(view)) {
                return;
            }
            arrayList.add(view);
            return;
        }
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) view;
        int i = defpackage.dzu.a;
        if (viewGroup.isTransitionGroup()) {
            if (arrayList.contains(view)) {
                return;
            }
            arrayList.add(view);
            return;
        }
        int childCount = viewGroup.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            android.view.View childAt = viewGroup.getChildAt(i2);
            if (childAt.getVisibility() == 0) {
                aooh.c(childAt);
                h(arrayList, childAt);
            }
        }
    }

    private final void i(java.util.ArrayList arrayList, android.view.ViewGroup viewGroup, aomy aomyVar) {
        defpackage.bx.a(arrayList, 4);
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.util.ArrayList arrayList3 = this.m;
        int size = arrayList3.size();
        for (int i = 0; i < size; i++) {
            android.view.View view = (android.view.View) arrayList3.get(i);
            int i2 = dzs.a;
            arrayList2.add(view.getTransitionName());
            view.setTransitionName(null);
        }
        if (bo.Z(2)) {
            android.util.Log.v("FragmentManager", ">>>>> Beginning transition <<<<<");
            android.util.Log.v("FragmentManager", ">>>>> SharedElementFirstOutViews <<<<<");
            java.util.Iterator it = this.l.iterator();
            aooh.e(it, "iterator(...)");
            while (it.hasNext()) {
                java.lang.Object next = it.next();
                aooh.e(next, "next(...)");
                android.view.View view2 = (android.view.View) next;
                int i3 = dzs.a;
                android.util.Log.v("FragmentManager", "View: " + view2 + " Name: " + view2.getTransitionName());
            }
            android.util.Log.v("FragmentManager", ">>>>> SharedElementLastInViews <<<<<");
            java.util.Iterator it2 = arrayList3.iterator();
            aooh.e(it2, "iterator(...)");
            while (it2.hasNext()) {
                java.lang.Object next2 = it2.next();
                aooh.e(next2, "next(...)");
                android.view.View view3 = (android.view.View) next2;
                int i4 = dzs.a;
                android.util.Log.v("FragmentManager", "View: " + view3 + " Name: " + view3.getTransitionName());
            }
        }
        aomyVar.a();
        defpackage.ce ceVar = this.d;
        java.util.ArrayList arrayList4 = this.l;
        aca acaVar = this.n;
        int size2 = arrayList3.size();
        java.util.ArrayList arrayList5 = new java.util.ArrayList();
        for (int i5 = 0; i5 < size2; i5++) {
            android.view.View view4 = (android.view.View) arrayList4.get(i5);
            int i6 = dzs.a;
            java.lang.String transitionName = view4.getTransitionName();
            arrayList5.add(transitionName);
            if (transitionName != null) {
                view4.setTransitionName(null);
                java.lang.String str = (java.lang.String) acaVar.get(transitionName);
                for (int i7 = 0; i7 < size2; i7++) {
                    if (str.equals(arrayList2.get(i7))) {
                        ((android.view.View) arrayList3.get(i7)).setTransitionName(transitionName);
                        break;
                    }
                }
            }
        }
        dza.b(viewGroup, new defpackage.eyv(size2, arrayList3, arrayList2, arrayList4, arrayList5, 1));
        defpackage.bx.a(arrayList, 0);
        ceVar.k(this.k, arrayList4, arrayList3);
    }

    @Override // defpackage.ch
    public final void a(android.view.ViewGroup viewGroup) {
        aooh.f(viewGroup, "container");
        this.r.a();
    }

    @Override // defpackage.ch
    public final void b(android.view.ViewGroup viewGroup) {
        aooh.f(viewGroup, "container");
        if (!viewGroup.isLaidOut() || this.h) {
            java.util.Iterator it = this.a.iterator();
            while (it.hasNext()) {
                cj cjVar = ((defpackage.ah) it.next()).a;
                if (bo.Z(2)) {
                    if (this.h) {
                        java.util.Objects.toString(cjVar);
                        android.util.Log.v("FragmentManager", "SpecialEffectsController: TransitionSeekController was not created. Completing operation ".concat(java.lang.String.valueOf(cjVar)));
                    } else {
                        android.util.Log.v("FragmentManager", a.bi(cjVar, viewGroup, "SpecialEffectsController: Container ", " has not been laid out. Completing operation "));
                    }
                }
                cjVar.f(this);
            }
            this.h = false;
            return;
        }
        java.lang.Object obj = this.g;
        if (obj != null) {
            this.d.t(obj);
            if (bo.Z(2)) {
                android.util.Log.v("FragmentManager", "Ending execution of operations from " + this.b + " to " + this.c);
                return;
            }
            return;
        }
        cj cjVar2 = this.c;
        cj cjVar3 = this.b;
        aoiu aoiuVarG = g(viewGroup, cjVar2, cjVar3);
        java.lang.Object obj2 = aoiuVarG.a;
        java.lang.Object obj3 = aoiuVarG.b;
        java.util.List list = this.a;
        java.util.ArrayList arrayList = (java.util.ArrayList) obj2;
        java.util.ArrayList<cj> arrayList2 = new java.util.ArrayList(ajsz.bl(list, 10));
        java.util.Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList2.add(((defpackage.ah) it2.next()).a);
        }
        for (cj cjVar4 : arrayList2) {
            defpackage.ce ceVar = this.d;
            aw awVar = cjVar4.a;
            ceVar.q(obj3, this.r, new ad(cjVar4, this, 2));
        }
        i(arrayList, viewGroup, new defpackage.af((java.lang.Object) this, (java.lang.Object) viewGroup, obj3, 0));
        if (bo.Z(2)) {
            android.util.Log.v("FragmentManager", a.bi(cjVar2, cjVar3, "Completed executing operations from ", " to "));
        }
    }

    @Override // defpackage.ch
    public final void c(defpackage.mk mkVar, android.view.ViewGroup viewGroup) {
        aooh.f(viewGroup, "container");
        java.lang.Object obj = this.g;
        if (obj != null) {
            this.d.w(obj, mkVar.b);
        }
    }

    @Override // defpackage.ch
    public final void d(android.view.ViewGroup viewGroup) {
        java.lang.Object obj;
        aooh.f(viewGroup, "container");
        if (!viewGroup.isLaidOut()) {
            java.util.Iterator it = this.a.iterator();
            while (it.hasNext()) {
                cj cjVar = ((defpackage.ah) it.next()).a;
                if (bo.Z(2)) {
                    android.util.Log.v("FragmentManager", a.bi(cjVar, viewGroup, "SpecialEffectsController: Container ", " has not been laid out. Skipping onStart for operation "));
                }
            }
            return;
        }
        if (f() && (obj = this.k) != null && !e()) {
            android.util.Log.i("FragmentManager", "Ignoring shared elements transition " + obj + " between " + this.b + " and " + this.c + " as neither fragment has set a Transition. In order to run a SharedElementTransition, you must also set either an enter or exit transition on a fragment involved in the transaction. The sharedElementTransition will run after the back gesture has been committed.");
        }
        if (e() && f()) {
            aoot aootVar = new aoot();
            aoiu aoiuVarG = g(viewGroup, this.c, this.b);
            java.lang.Object obj2 = aoiuVarG.a;
            java.lang.Object obj3 = aoiuVarG.b;
            java.util.List list = this.a;
            java.util.ArrayList arrayList = (java.util.ArrayList) obj2;
            java.util.ArrayList<cj> arrayList2 = new java.util.ArrayList(ajsz.bl(list, 10));
            java.util.Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                arrayList2.add(((defpackage.ah) it2.next()).a);
            }
            for (cj cjVar2 : arrayList2) {
                java.lang.Runnable aeVar = new ae(aootVar, 2);
                defpackage.ce ceVar = this.d;
                aw awVar = cjVar2.a;
                ceVar.z(obj3, this.r, aeVar, new ad(cjVar2, this, 3));
            }
            i(arrayList, viewGroup, new defpackage.ajx(this, viewGroup, obj3, aootVar, 1));
        }
    }

    @Override // defpackage.ch
    public final boolean e() {
        java.lang.Object obj;
        defpackage.ce ceVar = this.d;
        if (!ceVar.m()) {
            return false;
        }
        java.util.List<defpackage.ah> list = this.a;
        if (!list.isEmpty()) {
            for (defpackage.ah ahVar : list) {
                if (android.os.Build.VERSION.SDK_INT < 34 || (obj = ahVar.b) == null || !ceVar.n(obj)) {
                    return false;
                }
            }
        }
        java.lang.Object obj2 = this.k;
        return obj2 == null || ceVar.n(obj2);
    }

    public final boolean f() {
        java.util.List list = this.a;
        if (list.isEmpty()) {
            return true;
        }
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            if (!((defpackage.ah) it.next()).a.a.t) {
                return false;
            }
        }
        return true;
    }
}
