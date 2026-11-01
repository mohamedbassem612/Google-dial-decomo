package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class ck {
    public final android.view.ViewGroup a;
    public final java.util.List b;
    public final java.util.List c;
    public boolean d;
    public boolean e;
    private boolean f;

    public ck(android.view.ViewGroup viewGroup) {
        if (viewGroup == null) {
            defpackage.aooh.i("container");
        }
        this.a = viewGroup;
        this.b = new java.util.ArrayList();
        this.c = new java.util.ArrayList();
    }

    private final void j() {
        for (defpackage.cj cjVar : this.b) {
            if (cjVar.i == 2) {
                cjVar.h(defpackage.den.bS(cjVar.a.N().getVisibility()), 1);
            }
        }
    }

    private final void k(java.util.Map map, android.view.View view) {
        int i = defpackage.dzs.a;
        java.lang.String transitionName = view.getTransitionName();
        if (transitionName != null) {
            map.put(transitionName, view);
        }
        if (view instanceof android.view.ViewGroup) {
            android.view.ViewGroup viewGroup = (android.view.ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                android.view.View childAt = viewGroup.getChildAt(i2);
                if (childAt.getVisibility() == 0) {
                    defpackage.aooh.c(childAt);
                    k(map, childAt);
                }
            }
        }
    }

    private static void l(defpackage.aca acaVar, java.util.Collection collection) {
        defpackage.ajsz.bs(acaVar.entrySet(), new defpackage.nm(collection, 1), false);
    }

    public final defpackage.cj a(defpackage.aw awVar) {
        java.lang.Object next;
        java.util.Iterator it = this.b.iterator();
        while (it.hasNext()) {
            next = it.next();
            defpackage.cj cjVar = (defpackage.cj) next;
            if (defpackage.aooh.n(cjVar.a, awVar) && !cjVar.b) {
                return (defpackage.cj) next;
            }
        }
        next = null;
        return (defpackage.cj) next;
    }

    public final defpackage.cj b(defpackage.aw awVar) {
        java.lang.Object next;
        java.util.Iterator it = this.c.iterator();
        while (it.hasNext()) {
            next = it.next();
            defpackage.cj cjVar = (defpackage.cj) next;
            if (defpackage.aooh.n(cjVar.a, awVar) && !cjVar.b) {
                return (defpackage.cj) next;
            }
        }
        next = null;
        return (defpackage.cj) next;
    }

    public final void c(defpackage.cj cjVar) {
        defpackage.aooh.f(cjVar, "operation");
        if (cjVar.f) {
            defpackage.den.bR(cjVar.h, cjVar.a.N(), this.a);
            cjVar.g();
        }
    }

    public final void d(java.util.List list) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            defpackage.ajsz.bv(arrayList, ((defpackage.cj) it.next()).g);
        }
        java.util.List listBZ = defpackage.ajsz.bZ(defpackage.ajsz.cf(arrayList));
        int size = listBZ.size();
        for (int i = 0; i < size; i++) {
            ((ch) listBZ.get(i)).b(this.a);
        }
        int size2 = list.size();
        for (int i2 = 0; i2 < size2; i2++) {
            c((defpackage.cj) list.get(i2));
        }
        java.util.List listBZ2 = defpackage.ajsz.bZ(list);
        int size3 = listBZ2.size();
        for (int i3 = 0; i3 < size3; i3++) {
            defpackage.cj cjVar = (defpackage.cj) listBZ2.get(i3);
            if (cjVar.g.isEmpty()) {
                cjVar.a();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:175:0x04a6 A[Catch: all -> 0x065b, LOOP:25: B:173:0x04a0->B:175:0x04a6, LOOP_END, TryCatch #0 {, blocks: (B:10:0x0018, B:11:0x0026, B:13:0x002d, B:15:0x0039, B:18:0x0040, B:19:0x0043, B:20:0x0047, B:22:0x004e, B:24:0x0058, B:26:0x005e, B:27:0x0069, B:32:0x0081, B:34:0x0087, B:28:0x006d, B:30:0x0073, B:31:0x007e, B:35:0x008b, B:37:0x0091, B:39:0x009f, B:41:0x00ab, B:42:0x00b2, B:44:0x00ba, B:45:0x00c1, B:46:0x00c5, B:48:0x00cb, B:50:0x00e1, B:54:0x00e7, B:55:0x00f2, B:57:0x00f8, B:59:0x010e, B:63:0x0114, B:65:0x011d, B:66:0x012a, B:68:0x013a, B:69:0x014c, B:71:0x0152, B:72:0x0175, B:73:0x017b, B:75:0x0181, B:82:0x019b, B:83:0x01aa, B:84:0x01b3, B:86:0x01b9, B:88:0x01c6, B:89:0x01ca, B:90:0x01d3, B:92:0x01d9, B:94:0x01e6, B:95:0x01ea, B:96:0x01ef, B:98:0x01f5, B:101:0x0203, B:102:0x022c, B:176:0x04b2, B:177:0x04c0, B:179:0x04c6, B:180:0x04d4, B:181:0x04dd, B:183:0x04e3, B:185:0x04f1, B:186:0x04f4, B:188:0x04fa, B:190:0x04fe, B:191:0x0502, B:193:0x050c, B:195:0x0512, B:196:0x0520, B:198:0x0525, B:199:0x0528, B:200:0x0532, B:201:0x0536, B:203:0x053c, B:205:0x0548, B:207:0x054e, B:209:0x055e, B:211:0x0564, B:212:0x0572, B:213:0x057b, B:214:0x0580, B:216:0x0586, B:218:0x0594, B:220:0x059a, B:221:0x059e, B:223:0x05a4, B:229:0x05b7, B:230:0x05c0, B:232:0x05c6, B:233:0x05d2, B:237:0x05db, B:238:0x05e0, B:240:0x05e6, B:245:0x05f9, B:247:0x0601, B:249:0x0621, B:254:0x0640, B:256:0x0649, B:251:0x062a, B:253:0x0634, B:106:0x0237, B:107:0x0260, B:109:0x0266, B:113:0x027a, B:115:0x02a7, B:117:0x02b6, B:118:0x02bd, B:119:0x02c4, B:121:0x02ca, B:123:0x02d7, B:126:0x02ea, B:127:0x030e, B:129:0x0314, B:130:0x0324, B:132:0x032a, B:133:0x0340, B:134:0x0350, B:136:0x0356, B:137:0x036c, B:139:0x037b, B:141:0x0381, B:143:0x0395, B:144:0x0396, B:146:0x03b3, B:148:0x03b9, B:150:0x03cd, B:151:0x03ce, B:153:0x03da, B:155:0x03e6, B:156:0x03e9, B:157:0x03ec, B:159:0x0400, B:122:0x02d1, B:165:0x0469, B:167:0x046f, B:168:0x0473, B:170:0x0479, B:172:0x0483, B:173:0x04a0, B:175:0x04a6, B:257:0x0651, B:258:0x0658), top: B:264:0x0018 }] */
    /* JADX WARN: Code duplicated, block: B:236:0x05da  */
    /* JADX WARN: Code duplicated, block: B:81:0x019a  */
    public final void e() {
        int i;
        java.lang.Object next;
        java.lang.Object objPrevious;
        android.view.ViewGroup viewGroup;
        java.util.ArrayList<y> arrayList;
        ch agVar;
        java.util.Iterator it;
        java.util.ArrayList arrayList2;
        boolean z;
        java.util.ArrayList arrayList3;
        java.util.ArrayList arrayList4;
        ce ceVar;
        java.util.ArrayList arrayList5;
        dvg dvgVar;
        boolean z2;
        boolean z3;
        boolean z4;
        if (this.e) {
            return;
        }
        android.view.ViewGroup viewGroup2 = this.a;
        if (!viewGroup2.isAttachedToWindow()) {
            f();
            this.d = false;
            return;
        }
        java.util.List list = this.b;
        synchronized (list) {
            java.util.List list2 = this.c;
            java.util.ArrayList arrayList6 = new java.util.ArrayList(list2);
            list2.clear();
            java.util.Iterator it2 = arrayList6.iterator();
            while (true) {
                boolean z5 = true;
                if (!it2.hasNext()) {
                    break;
                }
                defpackage.cj cjVar = (defpackage.cj) it2.next();
                if (list.isEmpty() || !cjVar.a.t) {
                    z5 = false;
                }
                cjVar.d = z5;
            }
            java.util.Iterator it3 = arrayList6.iterator();
            while (true) {
                i = 2;
                if (!it3.hasNext()) {
                    break;
                }
                defpackage.cj cjVar2 = (defpackage.cj) it3.next();
                if (this.f) {
                    if (defpackage.bo.Z(2)) {
                        android.util.Log.v("FragmentManager", defpackage.a.bh(cjVar2, "SpecialEffectsController: Completing non-seekable operation "));
                    }
                    cjVar2.a();
                } else {
                    if (defpackage.bo.Z(2)) {
                        android.util.Log.v("FragmentManager", defpackage.a.bh(cjVar2, "SpecialEffectsController: Cancelling operation "));
                    }
                    cjVar2.e(viewGroup2);
                }
                this.f = false;
                if (!cjVar2.c) {
                    list2.add(cjVar2);
                }
            }
            if (!list.isEmpty()) {
                j();
                java.util.ArrayList<defpackage.cj> arrayList7 = new java.util.ArrayList(list);
                if (!arrayList7.isEmpty()) {
                    list.clear();
                    list2.addAll(arrayList7);
                    if (defpackage.bo.Z(2)) {
                        android.util.Log.v("FragmentManager", "SpecialEffectsController: Executing pending operations");
                    }
                    boolean z6 = this.d;
                    if (defpackage.bo.Z(2)) {
                        android.util.Log.v("FragmentManager", "Collecting Effects");
                    }
                    java.util.Iterator it4 = arrayList7.iterator();
                    while (true) {
                        if (!it4.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it4.next();
                        defpackage.cj cjVar3 = (defpackage.cj) next;
                        android.view.View view = cjVar3.a.Q;
                        defpackage.aooh.e(view, "mView");
                        if (defpackage.den.bT(view) == 2 && cjVar3.h != 2) {
                            break;
                        }
                    }
                    defpackage.cj cjVar4 = (defpackage.cj) next;
                    java.util.ListIterator listIterator = arrayList7.listIterator(arrayList7.size());
                    while (true) {
                        if (!listIterator.hasPrevious()) {
                            objPrevious = null;
                            break;
                        }
                        objPrevious = listIterator.previous();
                        defpackage.cj cjVar5 = (defpackage.cj) objPrevious;
                        android.view.View view2 = cjVar5.a.Q;
                        defpackage.aooh.e(view2, "mView");
                        if (defpackage.den.bT(view2) != 2 && cjVar5.h == 2) {
                            break;
                        }
                    }
                    defpackage.cj cjVar6 = (defpackage.cj) objPrevious;
                    if (defpackage.bo.Z(2)) {
                        android.util.Log.v("FragmentManager", defpackage.a.bi(cjVar6, cjVar4, "Executing operations from ", " to "));
                    }
                    java.util.ArrayList arrayList8 = new java.util.ArrayList();
                    java.util.ArrayList arrayList9 = new java.util.ArrayList();
                    if (arrayList7.isEmpty()) {
                        throw new java.util.NoSuchElementException("List is empty.");
                    }
                    defpackage.aw awVar = ((defpackage.cj) arrayList7.get(arrayList7.size() - 1)).a;
                    java.util.Iterator it5 = arrayList7.iterator();
                    while (it5.hasNext()) {
                        int i2 = i;
                        defpackage.at atVar = ((defpackage.cj) it5.next()).a.T;
                        defpackage.at atVar2 = awVar.T;
                        atVar.b = atVar2.b;
                        atVar.c = atVar2.c;
                        atVar.d = atVar2.d;
                        atVar.e = atVar2.e;
                        i = i2;
                    }
                    int i3 = i;
                    for (defpackage.cj cjVar7 : arrayList7) {
                        arrayList8.add(new y(cjVar7, z6));
                        if (z6) {
                            if (cjVar7 == cjVar4) {
                                z4 = true;
                            } else {
                                z4 = false;
                            }
                        } else if (cjVar7 == cjVar6) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        arrayList9.add(new ah(cjVar7, z6, z4));
                        cjVar7.c(new defpackage.ad(this, cjVar7, 1));
                    }
                    java.util.ArrayList arrayList10 = new java.util.ArrayList();
                    for (java.lang.Object obj : arrayList9) {
                        if (!((ah) obj).b()) {
                            arrayList10.add(obj);
                        }
                    }
                    java.util.ArrayList<ah> arrayList11 = new java.util.ArrayList();
                    for (java.lang.Object obj2 : arrayList10) {
                        if (((ah) obj2).a() != null) {
                            arrayList11.add(obj2);
                        }
                    }
                    ce ceVar2 = null;
                    for (ah ahVar : arrayList11) {
                        ce ceVarA = ahVar.a();
                        if (ceVar2 != null && ceVarA != ceVar2) {
                            throw new java.lang.IllegalArgumentException("Mixing framework transitions and AndroidX transitions is not allowed. Fragment " + ((ab) ahVar).a.a + " returned Transition " + ahVar.b + " which uses a different Transition type than other Fragments.");
                        }
                        ceVar2 = ceVarA;
                    }
                    if (ceVar2 == null) {
                        viewGroup = viewGroup2;
                        arrayList = arrayList8;
                    } else {
                        java.util.ArrayList arrayList12 = new java.util.ArrayList();
                        java.util.ArrayList arrayList13 = new java.util.ArrayList();
                        defpackage.aca acaVar = new defpackage.aca();
                        java.util.ArrayList arrayList14 = new java.util.ArrayList();
                        java.util.ArrayList arrayList15 = new java.util.ArrayList();
                        defpackage.aca acaVar2 = new defpackage.aca();
                        defpackage.aca acaVar3 = new defpackage.aca();
                        java.lang.Object obj3 = null;
                        for (ah ahVar2 : arrayList11) {
                            android.view.ViewGroup viewGroup3 = viewGroup2;
                            if (!ahVar2.c() || cjVar4 == null || cjVar6 == null) {
                                arrayList2 = arrayList13;
                                z = z6;
                                arrayList3 = arrayList8;
                                arrayList4 = arrayList11;
                                ceVar = ceVar2;
                                arrayList5 = arrayList12;
                            } else {
                                java.lang.Object objB = ceVar2.b(ceVar2.a(ahVar2.d));
                                defpackage.aw awVar2 = cjVar6.a;
                                arrayList2 = arrayList13;
                                java.util.ArrayList arrayListAa = awVar2.aa();
                                z = z6;
                                defpackage.aw awVar3 = cjVar4.a;
                                arrayList3 = arrayList8;
                                java.util.ArrayList arrayListAa2 = awVar3.aa();
                                arrayList4 = arrayList11;
                                java.util.ArrayList arrayListAb = awVar3.ab();
                                ceVar = ceVar2;
                                int size = arrayListAb.size();
                                arrayList5 = arrayList12;
                                int i4 = 0;
                                while (i4 < size) {
                                    int i5 = size;
                                    int iIndexOf = arrayListAa.indexOf(arrayListAb.get(i4));
                                    java.util.ArrayList arrayList16 = arrayListAb;
                                    if (iIndexOf != -1) {
                                        arrayListAa.set(iIndexOf, arrayListAa2.get(i4));
                                    }
                                    i4++;
                                    size = i5;
                                    arrayListAb = arrayList16;
                                }
                                java.util.ArrayList arrayListAb2 = awVar2.ab();
                                defpackage.aoiu aoiuVar = !z ? new defpackage.aoiu(null, null) : new defpackage.aoiu(null, null);
                                java.lang.Object obj4 = aoiuVar.b;
                                dvg dvgVar2 = (dvg) aoiuVar.a;
                                dvg dvgVar3 = (dvg) obj4;
                                int size2 = arrayListAa.size();
                                int i6 = 0;
                                while (true) {
                                    dvgVar = dvgVar3;
                                    if (i6 >= size2) {
                                        break;
                                    }
                                    java.lang.Object obj5 = arrayListAa.get(i6);
                                    int i7 = size2;
                                    defpackage.aooh.e(obj5, "get(...)");
                                    java.lang.Object obj6 = arrayListAb2.get(i6);
                                    defpackage.aooh.e(obj6, "get(...)");
                                    acaVar.put((java.lang.String) obj5, (java.lang.String) obj6);
                                    i6++;
                                    dvgVar3 = dvgVar;
                                    size2 = i7;
                                }
                                if (defpackage.bo.Z(i3)) {
                                    android.util.Log.v("FragmentManager", ">>> entering view names <<<");
                                    java.util.Iterator it6 = arrayListAb2.iterator();
                                    defpackage.aooh.e(it6, "iterator(...)");
                                    while (it6.hasNext()) {
                                        android.util.Log.v("FragmentManager", "Name: ".concat(java.lang.String.valueOf((java.lang.String) it6.next())));
                                    }
                                    android.util.Log.v("FragmentManager", ">>> exiting view names <<<");
                                    java.util.Iterator it7 = arrayListAa.iterator();
                                    defpackage.aooh.e(it7, "iterator(...)");
                                    while (it7.hasNext()) {
                                        android.util.Log.v("FragmentManager", "Name: ".concat(java.lang.String.valueOf((java.lang.String) it7.next())));
                                    }
                                }
                                android.view.View view3 = awVar3.Q;
                                defpackage.aooh.e(view3, "mView");
                                k(acaVar2, view3);
                                acaVar2.a(arrayListAa);
                                if (dvgVar2 != null) {
                                    if (defpackage.bo.Z(i3)) {
                                        java.util.Objects.toString(cjVar4);
                                        android.util.Log.v("FragmentManager", "Executing exit callback for operation ".concat(cjVar4.toString()));
                                    }
                                    throw null;
                                }
                                acaVar.a(acaVar2.keySet());
                                android.view.View view4 = awVar2.Q;
                                defpackage.aooh.e(view4, "mView");
                                k(acaVar3, view4);
                                acaVar3.a(arrayListAb2);
                                acaVar3.a(acaVar.values());
                                if (dvgVar != null) {
                                    if (defpackage.bo.Z(i3)) {
                                        java.util.Objects.toString(cjVar6);
                                        android.util.Log.v("FragmentManager", "Executing enter callback for operation ".concat(cjVar6.toString()));
                                    }
                                    throw null;
                                }
                                ce ceVar3 = bx.a;
                                for (int i8 = acaVar.d - 1; i8 >= 0; i8--) {
                                    if (!acaVar3.containsKey((java.lang.String) acaVar.g(i8))) {
                                        acaVar.e(i8);
                                    }
                                }
                                l(acaVar2, acaVar.keySet());
                                l(acaVar3, acaVar.values());
                                if (acaVar.isEmpty()) {
                                    android.util.Log.i("FragmentManager", "Ignoring shared elements transition " + objB + " between " + cjVar4 + " and " + cjVar6 + " as there are no matching elements in both the entering and exiting fragment. In order to run a SharedElementTransition, both fragments involved must have the element.");
                                    arrayList5.clear();
                                    arrayList2.clear();
                                    arrayList15 = arrayListAa;
                                    arrayList14 = arrayListAb2;
                                    obj3 = null;
                                } else {
                                    obj3 = objB;
                                    arrayList15 = arrayListAa;
                                    arrayList14 = arrayListAb2;
                                }
                            }
                            arrayList13 = arrayList2;
                            z6 = z;
                            viewGroup2 = viewGroup3;
                            arrayList8 = arrayList3;
                            arrayList11 = arrayList4;
                            ceVar2 = ceVar;
                            arrayList12 = arrayList5;
                        }
                        viewGroup = viewGroup2;
                        java.util.ArrayList arrayList17 = arrayList13;
                        boolean z7 = z6;
                        arrayList = arrayList8;
                        java.util.ArrayList arrayList18 = arrayList11;
                        ce ceVar4 = ceVar2;
                        java.util.ArrayList arrayList19 = arrayList12;
                        if (obj3 != null) {
                            agVar = new ag(arrayList18, cjVar4, cjVar6, ceVar4, obj3, arrayList19, arrayList17, acaVar, arrayList14, arrayList15, acaVar2, acaVar3, z7);
                            it = arrayList18.iterator();
                            while (it.hasNext()) {
                                ((ab) ((ah) it.next())).a.d(agVar);
                            }
                        } else if (!arrayList18.isEmpty()) {
                            java.util.Iterator it8 = arrayList18.iterator();
                            while (true) {
                                if (it8.hasNext()) {
                                    if (((ah) it8.next()).b != null) {
                                        agVar = new ag(arrayList18, cjVar4, cjVar6, ceVar4, obj3, arrayList19, arrayList17, acaVar, arrayList14, arrayList15, acaVar2, acaVar3, z7);
                                        it = arrayList18.iterator();
                                        while (it.hasNext()) {
                                            ((ab) ((ah) it.next())).a.d(agVar);
                                        }
                                    }
                                }
                            }
                        }
                    }
                    java.util.ArrayList<y> arrayList20 = new java.util.ArrayList();
                    java.util.ArrayList arrayList21 = new java.util.ArrayList();
                    java.util.Iterator it9 = arrayList.iterator();
                    while (it9.hasNext()) {
                        defpackage.ajsz.bv(arrayList21, ((ab) ((y) it9.next())).a.g);
                    }
                    boolean zIsEmpty = arrayList21.isEmpty();
                    boolean z8 = false;
                    for (y yVar : arrayList) {
                        defpackage.cj cjVar8 = ((ab) yVar).a;
                        android.content.Context context = viewGroup.getContext();
                        if (context == null) {
                            defpackage.aooh.g();
                        }
                        defpackage.vx vxVarA = yVar.a(context);
                        if (vxVarA != null) {
                            if (vxVarA.b == null) {
                                arrayList20.add(yVar);
                            } else {
                                defpackage.aw awVar4 = cjVar8.a;
                                if (cjVar8.g.isEmpty()) {
                                    if (cjVar8.h == 3) {
                                        cjVar8.g();
                                    }
                                    cjVar8.d(new aa(yVar));
                                    z8 = true;
                                } else if (defpackage.bo.Z(i3)) {
                                    android.util.Log.v("FragmentManager", defpackage.a.bg(awVar4, "Ignoring Animator set on ", " as this Fragment was involved in a Transition."));
                                }
                            }
                        }
                    }
                    for (y yVar2 : arrayList20) {
                        defpackage.cj cjVar9 = ((ab) yVar2).a;
                        defpackage.aw awVar5 = cjVar9.a;
                        if (zIsEmpty) {
                            if (!z8) {
                                cjVar9.d(new x(yVar2));
                            } else if (defpackage.bo.Z(i3)) {
                                android.util.Log.v("FragmentManager", defpackage.a.bg(awVar5, "Ignoring Animation set on ", " as Animations cannot run alongside Animators."));
                            }
                        } else if (defpackage.bo.Z(i3)) {
                            android.util.Log.v("FragmentManager", defpackage.a.bg(awVar5, "Ignoring Animation set on ", " as Animations cannot run alongside Transitions."));
                        }
                    }
                    java.util.Iterator it10 = arrayList7.iterator();
                    loop12: while (true) {
                        z2 = true;
                        while (true) {
                            if (!it10.hasNext()) {
                                break loop12;
                            }
                            java.util.List list3 = ((defpackage.cj) it10.next()).g;
                            if (!list3.isEmpty()) {
                                if (list3.isEmpty()) {
                                    break;
                                }
                                java.util.Iterator it11 = list3.iterator();
                                do {
                                    if (!it11.hasNext()) {
                                        break;
                                    }
                                } while (((ch) it11.next()).e());
                            }
                            z2 = false;
                        }
                    }
                    if (z2) {
                        java.util.ArrayList arrayList22 = new java.util.ArrayList();
                        java.util.Iterator it12 = arrayList7.iterator();
                        while (it12.hasNext()) {
                            defpackage.ajsz.bv(arrayList22, ((defpackage.cj) it12.next()).g);
                        }
                        if (arrayList22.isEmpty()) {
                            z3 = false;
                        } else {
                            z3 = true;
                        }
                    } else {
                        z3 = false;
                    }
                    java.util.Iterator it13 = arrayList7.iterator();
                    boolean z9 = true;
                    while (it13.hasNext()) {
                        z9 &= ((defpackage.cj) it13.next()).a.t;
                    }
                    this.f = z9 && !z3;
                    if (defpackage.bo.Z(i3)) {
                        android.util.Log.v("FragmentManager", "SpecialEffectsController: Operation seekable = " + z3 + " \ntransition = " + z9);
                    }
                    if (!z9) {
                        h(arrayList7);
                        d(arrayList7);
                    } else if (z3) {
                        h(arrayList7);
                        int size3 = arrayList7.size();
                        for (int i9 = 0; i9 < size3; i9++) {
                            c((defpackage.cj) arrayList7.get(i9));
                        }
                    }
                    this.d = false;
                    if (defpackage.bo.Z(i3)) {
                        android.util.Log.v("FragmentManager", "SpecialEffectsController: Finished executing pending operations");
                    }
                }
            }
        }
    }

    public final void f() {
        if (defpackage.bo.Z(2)) {
            android.util.Log.v("FragmentManager", "SpecialEffectsController: Forcing all operations to complete");
        }
        android.view.ViewGroup viewGroup = this.a;
        java.util.List list = this.b;
        boolean zIsAttachedToWindow = viewGroup.isAttachedToWindow();
        synchronized (list) {
            j();
            h(list);
            java.util.ArrayList<defpackage.cj> arrayList = new java.util.ArrayList(this.c);
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((defpackage.cj) it.next()).d = false;
            }
            for (defpackage.cj cjVar : arrayList) {
                if (defpackage.bo.Z(2)) {
                    android.util.Log.v("FragmentManager", defpackage.a.bo(cjVar, zIsAttachedToWindow ? "" : defpackage.a.bg(viewGroup, "Container ", " is not attached to window. "), "SpecialEffectsController: ", "Cancelling running operation "));
                }
                cjVar.e(viewGroup);
            }
            java.util.ArrayList<defpackage.cj> arrayList2 = new java.util.ArrayList(list);
            java.util.Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                ((defpackage.cj) it2.next()).d = false;
            }
            for (defpackage.cj cjVar2 : arrayList2) {
                if (defpackage.bo.Z(2)) {
                    android.util.Log.v("FragmentManager", defpackage.a.bo(cjVar2, zIsAttachedToWindow ? "" : defpackage.a.bg(viewGroup, "Container ", " is not attached to window. "), "SpecialEffectsController: ", "Cancelling pending operation "));
                }
                cjVar2.e(viewGroup);
            }
        }
    }

    public final void g() {
        java.lang.Object objPrevious;
        defpackage.at atVar;
        java.util.List list = this.b;
        synchronized (list) {
            j();
            java.util.ListIterator listIterator = list.listIterator(list.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    objPrevious = null;
                    break;
                }
                objPrevious = listIterator.previous();
                defpackage.cj cjVar = (defpackage.cj) objPrevious;
                android.view.View view = cjVar.a.Q;
                defpackage.aooh.e(view, "mView");
                int iBT = defpackage.den.bT(view);
                if (cjVar.h == 2 && iBT != 2) {
                    break;
                }
            }
            defpackage.cj cjVar2 = (defpackage.cj) objPrevious;
            defpackage.aw awVar = cjVar2 != null ? cjVar2.a : null;
            boolean z = false;
            if (awVar != null && (atVar = awVar.T) != null) {
                z = atVar.p;
            }
            this.e = z;
        }
    }

    public final void h(java.util.List list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ((defpackage.cj) list.get(i)).b();
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            defpackage.ajsz.bv(arrayList, ((defpackage.cj) it.next()).g);
        }
        java.util.List listBZ = defpackage.ajsz.bZ(defpackage.ajsz.cf(arrayList));
        int size2 = listBZ.size();
        for (int i2 = 0; i2 < size2; i2++) {
            ch chVar = (ch) listBZ.get(i2);
            android.view.ViewGroup viewGroup = this.a;
            if (viewGroup == null) {
                defpackage.aooh.i("container");
            }
            if (!chVar.i) {
                chVar.d(viewGroup);
            }
            chVar.i = true;
        }
    }

    public final void i(int i, int i2, defpackage.bt btVar) {
        java.util.List list = this.b;
        synchronized (list) {
            defpackage.aw awVar = btVar.a;
            defpackage.aooh.e(awVar, "getFragment(...)");
            defpackage.cj cjVarA = a(awVar);
            if (cjVarA == null) {
                if (awVar.t || awVar.s) {
                    defpackage.aooh.e(awVar, "getFragment(...)");
                    cjVarA = b(awVar);
                } else {
                    cjVarA = null;
                }
            }
            if (cjVarA != null) {
                cjVarA.h(i, i2);
            } else {
                defpackage.ci ciVar = new defpackage.ci(i, i2, btVar);
                list.add(ciVar);
                ciVar.c(new defpackage.an(this, ciVar, 4));
                ciVar.c(new defpackage.an(this, ciVar, 5));
            }
        }
    }
}
