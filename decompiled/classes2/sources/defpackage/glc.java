package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class glc implements android.view.ViewTreeObserver.OnPreDrawListener, android.view.View.OnAttachStateChangeListener {
    final gkz a;
    final android.view.ViewGroup b;

    public glc(gkz gkzVar, android.view.ViewGroup viewGroup) {
        this.a = gkzVar;
        this.b = viewGroup;
    }

    private final void a() {
        android.view.ViewGroup viewGroup = this.b;
        viewGroup.getViewTreeObserver().removeOnPreDrawListener(this);
        viewGroup.removeOnAttachStateChangeListener(this);
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0208  */
    /* JADX WARN: Code duplicated, block: B:105:0x0228  */
    /* JADX WARN: Code duplicated, block: B:136:0x02ac  */
    /* JADX WARN: Code duplicated, block: B:138:0x02bc  */
    /* JADX WARN: Code duplicated, block: B:142:0x02d8  */
    /* JADX WARN: Code duplicated, block: B:144:0x02dd  */
    /* JADX WARN: Code duplicated, block: B:146:0x02e3  */
    /* JADX WARN: Code duplicated, block: B:148:0x02f6  */
    /* JADX WARN: Code duplicated, block: B:151:0x0307  */
    /* JADX WARN: Code duplicated, block: B:152:0x030d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:153:0x030f  */
    /* JADX WARN: Code duplicated, block: B:156:0x01d5 A[EDGE_INSN: B:156:0x01d5->B:88:0x01d5 BREAK  A[LOOP:1: B:19:0x007f->B:87:0x01cf], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:15:0x0047  */
    /* JADX WARN: Code duplicated, block: B:17:0x004e A[LOOP:0: B:16:0x004c->B:17:0x004e, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:194:0x01f2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:197:0x0212 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:198:0x02a5 A[EDGE_INSN: B:198:0x02a5->B:133:0x02a5 BREAK  A[LOOP:8: B:103:0x0224->B:212:0x0224], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:21:0x0085  */
    /* JADX WARN: Code duplicated, block: B:225:0x02c4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:228:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:23:0x0089 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:24:0x008b  */
    /* JADX WARN: Code duplicated, block: B:26:0x008e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:27:0x0090  */
    /* JADX WARN: Code duplicated, block: B:29:0x009d  */
    /* JADX WARN: Code duplicated, block: B:41:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:44:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:46:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:59:0x0143  */
    /* JADX WARN: Code duplicated, block: B:61:0x0150  */
    /* JADX WARN: Code duplicated, block: B:74:0x0198  */
    /* JADX WARN: Code duplicated, block: B:77:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:91:0x01da  */
    /* JADX WARN: Code duplicated, block: B:93:0x01e8  */
    /* JADX WARN: Code duplicated, block: B:98:0x01fa  */
    /* JADX WARN: Instruction removed from duplicated block: B:146:0x02e3, please report this as an issue */
    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        java.util.ArrayList arrayList;
        gkz gkzVar;
        int i;
        kgl kglVar;
        kgl kglVar2;
        aca acaVar;
        aca acaVar2;
        int i2;
        int[] iArr;
        int i3;
        int i4;
        aca acaVarH;
        int i5;
        java.util.ArrayList arrayList2;
        int i6;
        defpackage.gkv gkvVar;
        int i7;
        gkz gkzVar2;
        android.animation.Animator animator;
        defpackage.klt kltVar;
        java.lang.Object obj;
        defpackage.gli gliVar;
        defpackage.gli gliVar2;
        int i8;
        int i9;
        int i10;
        android.view.View view;
        defpackage.gli gliVar3;
        aec aecVar;
        int i11;
        int i12;
        android.view.View view2;
        android.util.SparseArray sparseArray;
        int size;
        int i13;
        android.view.View view3;
        adb adbVar;
        int iB;
        int i14;
        android.view.View view4;
        int i15;
        int size2;
        int i16;
        a();
        java.util.ArrayList arrayList3 = gld.a;
        android.view.ViewGroup viewGroup = this.b;
        int i17 = 1;
        if (!arrayList3.remove(viewGroup)) {
            return true;
        }
        aca acaVarA = gld.a();
        java.util.ArrayList arrayList4 = (java.util.ArrayList) acaVarA.get(viewGroup);
        if (arrayList4 != null) {
            arrayList = arrayList4.size() > 0 ? new java.util.ArrayList(arrayList4) : null;
            gkzVar = this.a;
            arrayList4.add(gkzVar);
            gkzVar.D(new defpackage.glb(this, acaVarA));
            i = 0;
            gkzVar.p(viewGroup, false);
            if (arrayList != null) {
                size2 = arrayList.size();
                for (i16 = 0; i16 < size2; i16++) {
                    ((gkz) arrayList.get(i16)).w(viewGroup);
                }
            }
            gkzVar.h = new java.util.ArrayList();
            gkzVar.i = new java.util.ArrayList();
            kglVar = gkzVar.s;
            kglVar2 = gkzVar.t;
            acaVar = new aca((aec) kglVar.c);
            acaVar2 = new aca((aec) kglVar2.c);
            i2 = 0;
            while (true) {
                iArr = gkzVar.g;
                if (i2 < 4) {
                    break;
                }
                i8 = iArr[i2];
                if (i8 != i17) {
                    i9 = i2;
                    i10 = ((aec) acaVar).d;
                    while (true) {
                        i10--;
                        if (i10 >= 0) {
                            view = (android.view.View) acaVar.d(i10);
                            if (view == null && gkzVar.C(view) && (gliVar3 = (defpackage.gli) acaVar2.remove(view)) != null && gkzVar.C(gliVar3.b)) {
                                gkzVar.h.add((defpackage.gli) acaVar.e(i10));
                                gkzVar.i.add(gliVar3);
                            }
                        }
                    }
                } else if (i8 != 2) {
                    i9 = i2;
                    java.lang.Object obj2 = kglVar.b;
                    java.lang.Object obj3 = kglVar2.b;
                    aecVar = (aec) obj2;
                    i11 = aecVar.d;
                    for (i12 = 0; i12 < i11; i12++) {
                        view2 = (android.view.View) aecVar.g(i12);
                        if (view2 == null && gkzVar.C(view2)) {
                            android.view.View view5 = (android.view.View) ((aec) obj3).get((java.lang.String) aecVar.d(i12));
                            if (view5 != null && gkzVar.C(view5)) {
                                defpackage.gli gliVar4 = (defpackage.gli) acaVar.get(view2);
                                defpackage.gli gliVar5 = (defpackage.gli) acaVar2.get(view5);
                                if (gliVar4 != null && gliVar5 != null) {
                                    gkzVar.h.add(gliVar4);
                                    gkzVar.i.add(gliVar5);
                                    acaVar.remove(view2);
                                    acaVar2.remove(view5);
                                }
                            }
                        }
                    }
                } else if (i8 != 3) {
                    if (i8 == 4) {
                        java.lang.Object obj4 = kglVar.a;
                        java.lang.Object obj5 = kglVar2.a;
                        adbVar = (adb) obj4;
                        iB = adbVar.b();
                        i14 = i;
                        while (i14 < iB) {
                            view4 = (android.view.View) adbVar.e(i14);
                            if (view4 == null && gkzVar.C(view4)) {
                                i15 = i2;
                                android.view.View view6 = (android.view.View) ((adb) obj5).d(adbVar.c(i14));
                                if (view6 != null && gkzVar.C(view6)) {
                                    defpackage.gli gliVar6 = (defpackage.gli) acaVar.get(view4);
                                    defpackage.gli gliVar7 = (defpackage.gli) acaVar2.get(view6);
                                    if (gliVar6 != null && gliVar7 != null) {
                                        gkzVar.h.add(gliVar6);
                                        gkzVar.i.add(gliVar7);
                                        acaVar.remove(view4);
                                        acaVar2.remove(view6);
                                    }
                                }
                            } else {
                                i15 = i2;
                            }
                            i14++;
                            i2 = i15;
                        }
                    }
                    i9 = i2;
                } else {
                    i9 = i2;
                    java.lang.Object obj6 = kglVar.d;
                    java.lang.Object obj7 = kglVar2.d;
                    sparseArray = (android.util.SparseArray) obj6;
                    size = sparseArray.size();
                    for (i13 = 0; i13 < size; i13++) {
                        view3 = (android.view.View) sparseArray.valueAt(i13);
                        if (view3 == null && gkzVar.C(view3)) {
                            android.view.View view7 = (android.view.View) ((android.util.SparseArray) obj7).get(sparseArray.keyAt(i13));
                            if (view7 != null && gkzVar.C(view7)) {
                                defpackage.gli gliVar8 = (defpackage.gli) acaVar.get(view3);
                                defpackage.gli gliVar9 = (defpackage.gli) acaVar2.get(view7);
                                if (gliVar8 != null && gliVar9 != null) {
                                    gkzVar.h.add(gliVar8);
                                    gkzVar.i.add(gliVar9);
                                    acaVar.remove(view3);
                                    acaVar2.remove(view7);
                                }
                            }
                        }
                    }
                }
                i2 = i9 + 1;
                i = 0;
                i17 = 1;
            }
            for (i3 = 0; i3 < ((aec) acaVar).d; i3++) {
                gliVar2 = (defpackage.gli) acaVar.g(i3);
                if (gkzVar.C(gliVar2.b)) {
                    gkzVar.h.add(gliVar2);
                    gkzVar.i.add(null);
                }
            }
            for (i4 = 0; i4 < ((aec) acaVar2).d; i4++) {
                gliVar = (defpackage.gli) acaVar2.g(i4);
                if (gkzVar.C(gliVar.b)) {
                    gkzVar.i.add(gliVar);
                    gkzVar.h.add(null);
                }
            }
            acaVarH = gkz.h();
            i5 = ((aec) acaVarH).d;
            android.view.WindowId windowId = viewGroup.getWindowId();
            arrayList2 = new java.util.ArrayList();
            while (true) {
                i5--;
                if (i5 >= 0) {
                    break;
                }
                animator = (android.animation.Animator) acaVarH.d(i5);
                if (animator == null && (kltVar = (defpackage.klt) acaVarH.get(animator)) != null && (obj = kltVar.f) != null && j$.util.Objects.equals(windowId, kltVar.e)) {
                    java.lang.Object obj8 = kltVar.d;
                    android.view.View view8 = (android.view.View) obj;
                    defpackage.gli gliVarL = gkzVar.l(view8, true);
                    defpackage.gli gliVarK = gkzVar.k(view8, true);
                    if (gliVarL == null && gliVarK == null) {
                        gliVarK = (defpackage.gli) ((aec) gkzVar.t.c).get(obj);
                    }
                    if (gliVarL != null || gliVarK != null) {
                        java.lang.Object obj9 = kltVar.a;
                        gkz gkzVar3 = (gkz) obj9;
                        if (gkzVar3.B((defpackage.gli) obj8, gliVarK)) {
                            if (gkzVar3.j().q != null) {
                                animator.cancel();
                                java.util.ArrayList arrayList5 = gkzVar3.j;
                                arrayList5.remove(animator);
                                acaVarH.e(i5);
                                if (arrayList5.size() == 0) {
                                    arrayList2.add(obj9);
                                }
                            } else if (animator.isRunning() || animator.isStarted()) {
                                animator.cancel();
                            } else {
                                acaVarH.e(i5);
                            }
                        }
                    }
                }
            }
            for (i6 = 0; i6 < arrayList2.size(); i6++) {
                gkzVar2 = (gkz) arrayList2.get(i6);
                gkzVar2.s(gkzVar2, defpackage.gky.c, false);
                if (!gkzVar2.l) {
                    gkzVar2.l = true;
                    gkzVar2.s(gkzVar2, defpackage.gky.b, false);
                }
            }
            gkzVar.O(viewGroup, gkzVar.s, gkzVar.t, gkzVar.h, gkzVar.i);
            if (gkzVar.q == null) {
                gkzVar.x();
            } else if (android.os.Build.VERSION.SDK_INT >= 34) {
                gkzVar.u();
                defpackage.gkv gkvVar2 = gkzVar.q;
                long jH = gkvVar2.h();
                gkz gkzVar4 = gkvVar2.g;
                long j = gkvVar2.a;
                long j2 = jH == 0 ? 1L : 0L;
                gkzVar4.y(j2, j);
                gkvVar2.a = j2;
                gkvVar = gkzVar.q;
                gkvVar.b = true;
                i7 = gkvVar.d;
                if (i7 == 1) {
                    gkvVar.d = 0;
                    gkvVar.i();
                    return true;
                }
                if (i7 == 2) {
                    return true;
                }
                gkvVar.d = 0;
                gkvVar.j(gkvVar.f);
                return true;
            }
            return true;
        }
        arrayList4 = new java.util.ArrayList();
        acaVarA.put(viewGroup, arrayList4);
        gkzVar = this.a;
        arrayList4.add(gkzVar);
        gkzVar.D(new defpackage.glb(this, acaVarA));
        i = 0;
        gkzVar.p(viewGroup, false);
        if (arrayList != null) {
            size2 = arrayList.size();
            while (i16 < size2) {
                ((gkz) arrayList.get(i16)).w(viewGroup);
            }
        }
        gkzVar.h = new java.util.ArrayList();
        gkzVar.i = new java.util.ArrayList();
        kglVar = gkzVar.s;
        kglVar2 = gkzVar.t;
        acaVar = new aca((aec) kglVar.c);
        acaVar2 = new aca((aec) kglVar2.c);
        i2 = 0;
        while (true) {
            iArr = gkzVar.g;
            if (i2 < 4) {
                break;
                break;
            }
            i8 = iArr[i2];
            if (i8 != i17) {
                i9 = i2;
                i10 = ((aec) acaVar).d;
                while (true) {
                    i10--;
                    if (i10 >= 0) {
                        view = (android.view.View) acaVar.d(i10);
                        if (view == null) {
                        }
                    }
                }
            } else if (i8 != 2) {
                i9 = i2;
                java.lang.Object obj10 = kglVar.b;
                java.lang.Object obj11 = kglVar2.b;
                aecVar = (aec) obj10;
                i11 = aecVar.d;
                while (i12 < i11) {
                    view2 = (android.view.View) aecVar.g(i12);
                    if (view2 == null) {
                    }
                }
            } else if (i8 != 3) {
                if (i8 == 4) {
                    java.lang.Object obj12 = kglVar.a;
                    java.lang.Object obj13 = kglVar2.a;
                    adbVar = (adb) obj12;
                    iB = adbVar.b();
                    i14 = i;
                    while (i14 < iB) {
                        view4 = (android.view.View) adbVar.e(i14);
                        if (view4 == null) {
                            i15 = i2;
                        } else {
                            i15 = i2;
                        }
                        i14++;
                        i2 = i15;
                    }
                }
                i9 = i2;
            } else {
                i9 = i2;
                java.lang.Object obj14 = kglVar.d;
                java.lang.Object obj15 = kglVar2.d;
                sparseArray = (android.util.SparseArray) obj14;
                size = sparseArray.size();
                while (i13 < size) {
                    view3 = (android.view.View) sparseArray.valueAt(i13);
                    if (view3 == null) {
                    }
                }
            }
            i2 = i9 + 1;
            i = 0;
            i17 = 1;
        }
        while (i3 < ((aec) acaVar).d) {
            gliVar2 = (defpackage.gli) acaVar.g(i3);
            if (gkzVar.C(gliVar2.b)) {
                gkzVar.h.add(gliVar2);
                gkzVar.i.add(null);
            }
        }
        while (i4 < ((aec) acaVar2).d) {
            gliVar = (defpackage.gli) acaVar2.g(i4);
            if (gkzVar.C(gliVar.b)) {
                gkzVar.i.add(gliVar);
                gkzVar.h.add(null);
            }
        }
        acaVarH = gkz.h();
        i5 = ((aec) acaVarH).d;
        android.view.WindowId windowId2 = viewGroup.getWindowId();
        arrayList2 = new java.util.ArrayList();
        while (true) {
            i5--;
            if (i5 >= 0) {
                break;
                break;
            }
            animator = (android.animation.Animator) acaVarH.d(i5);
            if (animator == null) {
            }
        }
        while (i6 < arrayList2.size()) {
            gkzVar2 = (gkz) arrayList2.get(i6);
            gkzVar2.s(gkzVar2, defpackage.gky.c, false);
            if (!gkzVar2.l) {
                gkzVar2.l = true;
                gkzVar2.s(gkzVar2, defpackage.gky.b, false);
            }
        }
        gkzVar.O(viewGroup, gkzVar.s, gkzVar.t, gkzVar.h, gkzVar.i);
        if (gkzVar.q == null) {
            gkzVar.x();
        } else if (android.os.Build.VERSION.SDK_INT >= 34) {
            gkzVar.u();
            defpackage.gkv gkvVar3 = gkzVar.q;
            long jH2 = gkvVar3.h();
            gkz gkzVar5 = gkvVar3.g;
            long j3 = gkvVar3.a;
            if (jH2 == 0) {
            }
            gkzVar5.y(j2, j3);
            gkvVar3.a = j2;
            gkvVar = gkzVar.q;
            gkvVar.b = true;
            i7 = gkvVar.d;
            if (i7 == 1) {
                gkvVar.d = 0;
                gkvVar.i();
                return true;
            }
            if (i7 == 2) {
                return true;
            }
            gkvVar.d = 0;
            gkvVar.j(gkvVar.f);
            return true;
        }
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(android.view.View view) {
        a();
        java.util.ArrayList arrayList = gld.a;
        android.view.ViewGroup viewGroup = this.b;
        arrayList.remove(viewGroup);
        java.util.ArrayList arrayList2 = (java.util.ArrayList) gld.a().get(viewGroup);
        if (arrayList2 != null && arrayList2.size() > 0) {
            int size = arrayList2.size();
            for (int i = 0; i < size; i++) {
                ((gkz) arrayList2.get(i)).w(viewGroup);
            }
        }
        this.a.q(true);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(android.view.View view) {
    }
}
