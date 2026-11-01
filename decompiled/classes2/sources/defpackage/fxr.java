package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class fxr {
    public final defpackage.fvx a;
    public final aomy b;
    public defpackage.fwe c;
    public android.os.Bundle d;
    public android.os.Bundle[] e;
    public final aojw f = new aojw();
    public final aozh g;
    public final java.util.Map h;
    public final java.util.Map i;
    public emx j;
    public emq k;
    public final emw l;
    public final defpackage.fwo m;
    public final java.util.Map n;
    public aonj o;
    public aonj p;
    public final java.util.Map q;
    public final aozj r;
    public final aozj s;
    public defpackage.fwl t;
    private final java.util.Map u;
    private final java.util.Map v;
    private final java.util.List w;
    private int x;
    private final java.util.List y;
    private final aoyq z;

    public fxr(defpackage.fvx fvxVar, aomy aomyVar) {
        this.a = fvxVar;
        this.b = aomyVar;
        aokc aokcVar = aokc.a;
        this.r = aozk.a(aokcVar);
        aozj aozjVarA = aozk.a(aokcVar);
        this.s = aozjVarA;
        this.g = new aoys(aozjVarA, (aoub) null);
        this.u = new java.util.LinkedHashMap();
        this.v = new java.util.LinkedHashMap();
        this.h = new java.util.LinkedHashMap();
        this.i = new java.util.LinkedHashMap();
        this.w = new java.util.ArrayList();
        this.k = emq.b;
        this.l = new defpackage.emr(this, 3, null);
        this.m = new defpackage.fwo();
        this.n = new java.util.LinkedHashMap();
        this.q = new java.util.LinkedHashMap();
        this.y = new java.util.ArrayList();
        this.z = aoyx.c(1, 0, 2, 2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5, types: [fwc, fwe] */
    /* JADX WARN: Type inference failed for: r0v6, types: [fwe, java.lang.Object] */
    public static final defpackage.fwc n(defpackage.fwc fwcVar, int i, boolean z, defpackage.fwc fwcVar2) {
        ?? r0;
        defpackage.fwe fweVar;
        aooh.f(fwcVar, "destination");
        if (fwcVar.b() == i) {
            if (fwcVar2 == null) {
                return fwcVar;
            }
            if (aooh.n(fwcVar, fwcVar2) && aooh.n(fwcVar.c, fwcVar2.c)) {
                return fwcVar;
            }
        }
        if (fwcVar instanceof defpackage.fwe) {
            fweVar = (defpackage.fwe) fwcVar;
        } else {
            r0 = 0;
        }
        if (r0 == 0) {
            r0 = fweVar;
            r0 = fwcVar.c;
            aooh.c((java.lang.Object) r0);
        }
        r0 = fweVar;
        return r0.m(i, r0, z, fwcVar2);
    }

    public static /* synthetic */ void q(defpackage.fxr fxrVar, defpackage.fvs fvsVar) {
        fxrVar.k(fvsVar, false, new aojw());
    }

    public final emq a() {
        return this.j == null ? emq.c : this.k;
    }

    public final defpackage.fvs b(int i) {
        java.lang.Object objPrevious;
        aojw aojwVar = this.f;
        java.util.ListIterator listIterator = aojwVar.listIterator(aojwVar.a);
        do {
            if (!listIterator.hasPrevious()) {
                objPrevious = null;
                break;
            }
            objPrevious = listIterator.previous();
        } while (((defpackage.fvs) objPrevious).a.b() != i);
        defpackage.fvs fvsVar = (defpackage.fvs) objPrevious;
        if (fvsVar != null) {
            return fvsVar;
        }
        throw new java.lang.IllegalArgumentException("No destination with ID " + i + " is on the NavController's back stack. The current destination is " + e());
    }

    public final defpackage.fvs c() {
        return (defpackage.fvs) this.f.f();
    }

    public final defpackage.fwc d(int i, defpackage.fwc fwcVar) {
        defpackage.fwc fwcVar2;
        defpackage.fwe fweVar = this.c;
        if (fweVar == null) {
            return null;
        }
        if (fweVar.b() == i && (fwcVar == null || (aooh.n(this.c, fwcVar) && fwcVar.c == null))) {
            return this.c;
        }
        defpackage.fvs fvsVar = (defpackage.fvs) this.f.f();
        if (fvsVar == null || (fwcVar2 = fvsVar.a) == null) {
            fwcVar2 = this.c;
            aooh.c(fwcVar2);
        }
        return n(fwcVar2, i, false, fwcVar);
    }

    public final defpackage.fwc e() {
        defpackage.fvs fvsVarC = c();
        if (fvsVarC != null) {
            return fvsVarC.a;
        }
        return null;
    }

    public final defpackage.fwe f() {
        defpackage.fwe fweVar = this.c;
        if (fweVar != null) {
            return fweVar;
        }
        throw new java.lang.IllegalStateException("You must call setGraph() before calling getGraph()");
    }

    public final defpackage.fwe g() {
        defpackage.fwc fwcVar;
        defpackage.fvs fvsVar = (defpackage.fvs) this.f.f();
        if (fvsVar == null || (fwcVar = fvsVar.a) == null) {
            fwcVar = this.c;
            aooh.c(fwcVar);
        }
        defpackage.fwe fweVar = fwcVar instanceof defpackage.fwe ? (defpackage.fwe) fwcVar : null;
        if (fweVar != null) {
            return fweVar;
        }
        defpackage.fwe fweVar2 = fwcVar.c;
        aooh.c(fweVar2);
        return fweVar2;
    }

    public final java.util.List h() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = this.n.values().iterator();
        while (it.hasNext()) {
            java.lang.Iterable iterable = (java.lang.Iterable) ((defpackage.fvu) it.next()).e.c();
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            for (java.lang.Object obj : iterable) {
                defpackage.fvs fvsVar = (defpackage.fvs) obj;
                if (!arrayList.contains(fvsVar) && !fvsVar.i.a(emq.d)) {
                    arrayList2.add(obj);
                }
            }
            ajsz.bv(arrayList, arrayList2);
        }
        aojw aojwVar = this.f;
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        for (java.lang.Object obj2 : aojwVar) {
            defpackage.fvs fvsVar2 = (defpackage.fvs) obj2;
            if (!arrayList.contains(fvsVar2) && fvsVar2.i.a(emq.d)) {
                arrayList3.add(obj2);
            }
        }
        ajsz.bv(arrayList, arrayList3);
        java.util.ArrayList arrayList4 = new java.util.ArrayList();
        for (java.lang.Object obj3 : arrayList) {
            if (!(((defpackage.fvs) obj3).a instanceof defpackage.fwe)) {
                arrayList4.add(obj3);
            }
        }
        return arrayList4;
    }

    public final void i(defpackage.fwc fwcVar, android.os.Bundle bundle, defpackage.fvs fvsVar, java.util.List list) {
        aojw aojwVar;
        java.lang.Object objPrevious;
        java.lang.Object objPrevious2;
        aojw aojwVar2;
        defpackage.fwc fwcVar2 = fvsVar.a;
        if (!(fwcVar2 instanceof defpackage.fxf)) {
            do {
                aojwVar2 = this.f;
                if (aojwVar2.isEmpty() || !(((defpackage.fvs) aojwVar2.e()).a instanceof defpackage.fxf)) {
                    break;
                }
            } while (m(((defpackage.fvs) aojwVar2.e()).a.b(), true, false));
        }
        aojw<defpackage.fvs> aojwVar3 = new aojw();
        java.lang.Object obj = null;
        if (fwcVar instanceof defpackage.fwe) {
            defpackage.fwc fwcVar3 = fwcVar2;
            do {
                aooh.c(fwcVar3);
                fwcVar3 = fwcVar3.c;
                if (fwcVar3 != null) {
                    java.util.ListIterator listIterator = list.listIterator(list.size());
                    do {
                        if (!listIterator.hasPrevious()) {
                            objPrevious2 = null;
                            break;
                        }
                        objPrevious2 = listIterator.previous();
                    } while (!aooh.n(((defpackage.fvs) objPrevious2).a, fwcVar3));
                    defpackage.fvs fvsVarAi = (defpackage.fvs) objPrevious2;
                    if (fvsVarAi == null) {
                        fvsVarAi = defpackage.hgt.ai(u(), fwcVar3, bundle, a(), this.t);
                    }
                    aojwVar3.addFirst(fvsVarAi);
                    aojw aojwVar4 = this.f;
                    if (!aojwVar4.isEmpty() && ((defpackage.fvs) aojwVar4.e()).a == fwcVar3) {
                        q(this, (defpackage.fvs) aojwVar4.e());
                    }
                }
                if (fwcVar3 == null) {
                    break;
                }
            } while (fwcVar3 != fwcVar);
        }
        defpackage.fwc fwcVar4 = aojwVar3.isEmpty() ? fwcVar2 : ((defpackage.fvs) aojwVar3.a()).a;
        while (fwcVar4 != null && d(fwcVar4.b(), fwcVar4) != fwcVar4) {
            fwcVar4 = fwcVar4.c;
            if (fwcVar4 != null) {
                android.os.Bundle bundle2 = (bundle == null || !bundle.isEmpty()) ? bundle : null;
                java.util.ListIterator listIterator2 = list.listIterator(list.size());
                do {
                    if (!listIterator2.hasPrevious()) {
                        objPrevious = null;
                        break;
                    }
                    objPrevious = listIterator2.previous();
                } while (!aooh.n(((defpackage.fvs) objPrevious).a, fwcVar4));
                defpackage.fvs fvsVarAi2 = (defpackage.fvs) objPrevious;
                if (fvsVarAi2 == null) {
                    fvsVarAi2 = defpackage.hgt.ai(u(), fwcVar4, fwcVar4.c(bundle2), a(), this.t);
                }
                aojwVar3.addFirst(fvsVarAi2);
            }
        }
        if (!aojwVar3.isEmpty()) {
            fwcVar2 = ((defpackage.fvs) aojwVar3.a()).a;
        }
        while (true) {
            aojwVar = this.f;
            if (aojwVar.isEmpty() || !(((defpackage.fvs) aojwVar.e()).a instanceof defpackage.fwe)) {
                break;
            }
            defpackage.fwc fwcVar5 = ((defpackage.fvs) aojwVar.e()).a;
            aooh.d(fwcVar5, "null cannot be cast to non-null type androidx.navigation.NavGraph");
            if (defpackage.aee.a(((defpackage.fwe) fwcVar5).j(), fwcVar2.b()) != null) {
                break;
            } else {
                q(this, (defpackage.fvs) aojwVar.e());
            }
        }
        defpackage.fvs fvsVar2 = (defpackage.fvs) aojwVar.c();
        if (fvsVar2 == null) {
            fvsVar2 = (defpackage.fvs) aojwVar3.c();
        }
        if (!aooh.n(fvsVar2 != null ? fvsVar2.a : null, this.c)) {
            java.util.ListIterator listIterator3 = list.listIterator(list.size());
            while (listIterator3.hasPrevious()) {
                java.lang.Object objPrevious3 = listIterator3.previous();
                defpackage.fwc fwcVar6 = ((defpackage.fvs) objPrevious3).a;
                defpackage.fwe fweVar = this.c;
                aooh.c(fweVar);
                if (aooh.n(fwcVar6, fweVar)) {
                    obj = objPrevious3;
                    break;
                }
            }
            defpackage.fvs fvsVarAi3 = (defpackage.fvs) obj;
            if (fvsVarAi3 == null) {
                defpackage.vk vkVarU = u();
                defpackage.fwe fweVar2 = this.c;
                aooh.c(fweVar2);
                defpackage.fwe fweVar3 = this.c;
                aooh.c(fweVar3);
                fvsVarAi3 = defpackage.hgt.ai(vkVarU, fweVar2, fweVar3.c(bundle), a(), this.t);
            }
            aojwVar3.addFirst(fvsVarAi3);
        }
        for (defpackage.fvs fvsVar3 : aojwVar3) {
            java.lang.Object obj2 = this.n.get(this.m.b(fvsVar3.a.a));
            if (obj2 == null) {
                throw new java.lang.IllegalStateException("NavigatorBackStack for " + fwcVar.a + " should already be created");
            }
            ((defpackage.fvu) obj2).b(fvsVar3);
        }
        aojwVar.addAll(aojwVar3);
        aojwVar.addLast(fvsVar);
        for (defpackage.fvs fvsVar4 : ajsz.bU(aojwVar3, fvsVar)) {
            defpackage.fwe fweVar4 = fvsVar4.a.c;
            if (fweVar4 != null) {
                j(fvsVar4, b(fweVar4.b()));
            }
        }
    }

    public final void j(defpackage.fvs fvsVar, defpackage.fvs fvsVar2) {
        aooh.f(fvsVar, "child");
        this.u.put(fvsVar, fvsVar2);
        java.util.Map map = this.v;
        if (map.get(fvsVar2) == null) {
            map.put(fvsVar2, new defpackage.vk((byte[]) null));
        }
        java.lang.Object obj = map.get(fvsVar2);
        aooh.c(obj);
        ((java.util.concurrent.atomic.AtomicInteger) ((defpackage.vk) obj).a).incrementAndGet();
    }

    public final void k(defpackage.fvs fvsVar, boolean z, aojw aojwVar) {
        defpackage.fwl fwlVar;
        java.util.Set set;
        aooh.f(fvsVar, "popUpTo");
        aojw aojwVar2 = this.f;
        defpackage.fvs fvsVar2 = (defpackage.fvs) aojwVar2.e();
        if (!aooh.n(fvsVar2, fvsVar)) {
            throw new java.lang.IllegalStateException("Attempted to pop " + fvsVar.a + ", which is not the top of the back stack (" + fvsVar2.a + ')');
        }
        ajsz.bq(aojwVar2);
        defpackage.fvu fvuVar = (defpackage.fvu) this.n.get(this.m.b(fvsVar2.a.a));
        boolean z2 = true;
        if ((fvuVar == null || (set = (java.util.Set) fvuVar.e.c()) == null || !set.contains(fvsVar2)) && !this.v.containsKey(fvsVar2)) {
            z2 = false;
        }
        emq emqVar = fvsVar2.f.d;
        emq emqVar2 = emq.c;
        if (emqVar.a(emqVar2)) {
            if (z) {
                fvsVar2.b(emqVar2);
                aojwVar.addFirst(new defpackage.vk(fvsVar2));
            }
            if (z2) {
                fvsVar2.b(emqVar2);
            } else {
                fvsVar2.b(emq.a);
                s(fvsVar2);
            }
        }
        if (z || z2 || (fwlVar = this.t) == null) {
            return;
        }
        fwlVar.a(fvsVar2.c);
    }

    public final void l() {
        defpackage.vk vkVar;
        java.util.Set set;
        java.util.List<defpackage.fvs> listCb = ajsz.cb(this.f);
        if (listCb.isEmpty()) {
            return;
        }
        defpackage.fwc fwcVar = ((defpackage.fvs) ajsz.bI(listCb)).a;
        java.util.List listBd = ajsz.bd(new defpackage.fwc[]{fwcVar});
        if (fwcVar instanceof defpackage.fwr) {
            boolean z = fwcVar instanceof defpackage.fxf;
            java.util.Iterator it = ajsz.bR(ajsz.bV(listCb), 1).iterator();
            while (it.hasNext()) {
                defpackage.fwc fwcVar2 = ((defpackage.fvs) it.next()).a;
                if (z && !(fwcVar2 instanceof defpackage.fxf) && !(fwcVar2 instanceof defpackage.fwe)) {
                    break;
                }
                listBd.add(fwcVar2);
                if (!(fwcVar2 instanceof defpackage.fwr) && !(fwcVar2 instanceof defpackage.fwe)) {
                    break;
                }
            }
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (ajsz.bI(listBd) instanceof defpackage.fxf) {
            java.util.Iterator it2 = ajsz.bV(listCb).iterator();
            while (it2.hasNext()) {
                defpackage.fwc fwcVar3 = ((defpackage.fvs) it2.next()).a;
                arrayList.add(fwcVar3);
                if (!(fwcVar3 instanceof defpackage.fxf) && !(fwcVar3 instanceof defpackage.fwr) && !(fwcVar3 instanceof defpackage.fwe)) {
                    break;
                }
            }
        }
        java.util.HashMap map = new java.util.HashMap();
        for (defpackage.fvs fvsVar : ajsz.bV(listCb)) {
            emq emqVar = fvsVar.i;
            defpackage.fwc fwcVar4 = fvsVar.a;
            defpackage.fwc fwcVar5 = (defpackage.fwc) ajsz.bG(listBd);
            if (fwcVar5 != null && fwcVar5.b() == fwcVar4.b()) {
                emq emqVar2 = emq.e;
                if (emqVar != emqVar2) {
                    defpackage.fvu fvuVar = (defpackage.fvu) this.n.get(this.m.b(fvsVar.a.a));
                    java.lang.Boolean boolValueOf = null;
                    if (fvuVar != null && (set = (java.util.Set) fvuVar.e.c()) != null) {
                        boolValueOf = java.lang.Boolean.valueOf(set.contains(fvsVar));
                    }
                    if (aooh.n(boolValueOf, java.lang.Boolean.TRUE) || ((vkVar = (defpackage.vk) this.v.get(fvsVar)) != null && ((java.util.concurrent.atomic.AtomicInteger) vkVar.a).get() == 0)) {
                        map.put(fvsVar, emq.d);
                    } else {
                        map.put(fvsVar, emqVar2);
                    }
                }
                defpackage.fwc fwcVar6 = (defpackage.fwc) ajsz.bG(arrayList);
                if (fwcVar6 != null && fwcVar6.b() == fwcVar4.b()) {
                    ajsz.bp(arrayList);
                }
                ajsz.bp(listBd);
                defpackage.fwe fweVar = fwcVar4.c;
                if (fweVar != null) {
                    listBd.add(fweVar);
                }
            } else if (arrayList.isEmpty() || fwcVar4.b() != ((defpackage.fwc) ajsz.bE(arrayList)).b()) {
                fvsVar.b(emq.c);
            } else {
                defpackage.fwc fwcVar7 = (defpackage.fwc) ajsz.bp(arrayList);
                if (emqVar == emq.e) {
                    fvsVar.b(emq.d);
                } else {
                    emq emqVar3 = emq.d;
                    if (emqVar != emqVar3) {
                        map.put(fvsVar, emqVar3);
                    }
                }
                defpackage.fwe fweVar2 = fwcVar7.c;
                if (fweVar2 != null && !arrayList.contains(fweVar2)) {
                    arrayList.add(fweVar2);
                }
            }
        }
        for (defpackage.fvs fvsVar2 : listCb) {
            emq emqVar4 = (emq) map.get(fvsVar2);
            if (emqVar4 != null) {
                fvsVar2.b(emqVar4);
            } else {
                fvsVar2.c();
            }
        }
    }

    public final boolean m(int i, boolean z, boolean z2) {
        defpackage.fwc fwcVar;
        boolean z3;
        aoop aoopVar;
        aojw aojwVar = this.f;
        if (aojwVar.isEmpty()) {
            return false;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = ajsz.bV(aojwVar).iterator();
        while (true) {
            if (!it.hasNext()) {
                fwcVar = null;
                break;
            }
            defpackage.fwc fwcVar2 = ((defpackage.fvs) it.next()).a;
            defpackage.fwn fwnVarB = this.m.b(fwcVar2.a);
            if (z || fwcVar2.b() != i) {
                arrayList.add(fwnVarB);
            }
            if (fwcVar2.b() == i) {
                fwcVar = fwcVar2;
                break;
            }
        }
        if (fwcVar == null) {
            int i2 = defpackage.fwc.e;
            android.util.Log.i("NavController", "Ignoring popBackStack to destination " + defpackage.hgt.ae(u(), i) + " as it was not found on the current back stack");
            return false;
        }
        aoop aoopVar2 = new aoop();
        aojw aojwVar2 = new aojw();
        java.util.Iterator it2 = arrayList.iterator();
        do {
            if (!it2.hasNext()) {
                z3 = z2;
                break;
            }
            defpackage.fwn fwnVar = (defpackage.fwn) it2.next();
            aoopVar = new aoop();
            defpackage.fvs fvsVar = (defpackage.fvs) aojwVar.e();
            z3 = z2;
            defpackage.fxq fxqVar = new defpackage.fxq(aoopVar, aoopVar2, this, z3, aojwVar2, 0);
            aooh.f(fwnVar, "navigator");
            aooh.f(fvsVar, "popUpTo");
            this.p = fxqVar;
            fwnVar.g(fvsVar, z3);
            this.p = null;
        } while (aoopVar.a);
        if (z3) {
            if (!z) {
                aoqs aoqsVar = new aoqs(new aoqt(aooc.h(fwcVar, new defpackage.fvt(14)), new defpackage.fxs(this, 1), 0));
                while (aoqsVar.hasNext()) {
                    defpackage.fwc fwcVar3 = (defpackage.fwc) aoqsVar.next();
                    java.util.Map map = this.h;
                    java.lang.Integer numValueOf = java.lang.Integer.valueOf(fwcVar3.b());
                    defpackage.vk vkVar = (defpackage.vk) aojwVar2.c();
                    map.put(numValueOf, vkVar != null ? vkVar.e() : null);
                }
            }
            if (!aojwVar2.isEmpty()) {
                defpackage.vk vkVar2 = (defpackage.vk) aojwVar2.a();
                aoqs aoqsVar2 = new aoqs(new aoqt(aooc.h(d(vkVar2.c(), null), new defpackage.fvt(12)), new dih(this, 19), 0));
                while (aoqsVar2.hasNext()) {
                    this.h.put(java.lang.Integer.valueOf(((defpackage.fwc) aoqsVar2.next()).b()), vkVar2.e());
                }
                if (this.h.values().contains(vkVar2.e())) {
                    this.i.put(vkVar2.e(), aojwVar2);
                }
            }
        }
        this.b.a();
        return aoopVar2.a;
    }

    /* JADX WARN: Code duplicated, block: B:105:0x016c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:107:0x0199 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:109:0x0174 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:111:0x01e0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:112:0x01db A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:113:? A[LOOP:7: B:67:0x01c5->B:113:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:46:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:49:0x0106 A[LOOP:4: B:47:0x0100->B:49:0x0106, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:53:0x0155  */
    /* JADX WARN: Code duplicated, block: B:55:0x0161  */
    /* JADX WARN: Code duplicated, block: B:60:0x017a  */
    /* JADX WARN: Code duplicated, block: B:62:0x0196  */
    /* JADX WARN: Code duplicated, block: B:69:0x01cb A[Catch: all -> 0x01eb, TryCatch #0 {, blocks: (B:66:0x01b1, B:67:0x01c5, B:69:0x01cb, B:71:0x01db, B:73:0x01e1), top: B:94:0x01b1 }] */
    /* JADX WARN: Code duplicated, block: B:80:0x01f1  */
    /* JADX WARN: Code duplicated, block: B:94:0x01b1 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public final void o(defpackage.fwc fwcVar, android.os.Bundle bundle, defpackage.fwj fwjVar) {
        boolean z;
        int iNextIndex;
        defpackage.fwc fwcVar2;
        aojw<defpackage.fvs> aojwVar;
        defpackage.fwn fwnVarB;
        defpackage.fwc fwcVar3;
        defpackage.fwp fwpVarF;
        java.util.ListIterator listIterator;
        int iNextIndex2;
        defpackage.fwe fweVar;
        int i;
        aooh.f(fwcVar, "node");
        java.util.Iterator it = this.n.values().iterator();
        while (it.hasNext()) {
            ((defpackage.fvu) it.next()).c = true;
        }
        aoop aoopVar = new aoop();
        boolean zM = (fwjVar == null || (i = fwjVar.c) == -1) ? false : m(i, fwjVar.d, fwjVar.e);
        android.os.Bundle bundleC = fwcVar.c(bundle);
        if (fwjVar != null && fwjVar.b && this.h.containsKey(java.lang.Integer.valueOf(fwcVar.b()))) {
            aoopVar.a = r(fwcVar.b(), bundleC, fwjVar);
            z = false;
        } else {
            if (fwjVar == null || !fwjVar.a) {
                z = false;
            } else {
                defpackage.fvs fvsVarC = c();
                aojw aojwVar2 = this.f;
                java.util.ListIterator listIterator2 = aojwVar2.listIterator(aojwVar2.a);
                while (true) {
                    if (listIterator2.hasPrevious()) {
                        if (((defpackage.fvs) listIterator2.previous()).a == fwcVar) {
                            iNextIndex = listIterator2.nextIndex();
                            break;
                        }
                    } else {
                        iNextIndex = -1;
                        break;
                    }
                }
                if (iNextIndex == -1) {
                    z = false;
                } else if (fwcVar instanceof defpackage.fwe) {
                    int i2 = defpackage.fwe.g;
                    java.util.List listK = aooc.k(new aoqt(defpackage.hgt.V((defpackage.fwe) fwcVar), new defpackage.fvt(13), 2));
                    if (aojwVar2.a - iNextIndex == listK.size()) {
                        java.util.List listSubList = aojwVar2.subList(iNextIndex, aojwVar2.a);
                        java.util.ArrayList arrayList = new java.util.ArrayList(ajsz.bl(listSubList, 10));
                        java.util.Iterator it2 = listSubList.iterator();
                        while (it2.hasNext()) {
                            arrayList.add(java.lang.Integer.valueOf(((defpackage.fvs) it2.next()).a.b()));
                        }
                        if (aooh.n(arrayList, listK)) {
                            aojwVar = new aojw();
                            while (ajsz.aZ(aojwVar2) >= iNextIndex) {
                                defpackage.fvs fvsVar = (defpackage.fvs) ajsz.bq(aojwVar2);
                                s(fvsVar);
                                android.os.Bundle bundleC2 = fvsVar.a.c(bundle);
                                aooh.f(fvsVar, "entry");
                                defpackage.fvs fvsVar2 = new defpackage.fvs(fvsVar.k, fvsVar.a, bundleC2, fvsVar.b, fvsVar.j, fvsVar.c, fvsVar.d);
                                emq emqVar = fvsVar.b;
                                aooh.f(emqVar, "<set-?>");
                                fvsVar2.b = emqVar;
                                fvsVar2.b(fvsVar.i);
                                aojwVar.addFirst(fvsVar2);
                            }
                            for (defpackage.fvs fvsVar3 : aojwVar) {
                                fweVar = fvsVar3.a.c;
                                if (fweVar != null) {
                                    j(fvsVar3, b(fweVar.b()));
                                }
                                aojwVar2.addLast(fvsVar3);
                            }
                            for (defpackage.fvs fvsVar4 : aojwVar) {
                                fwnVarB = this.m.b(fvsVar4.a.a);
                                aooh.f(fvsVar4, "backStackEntry");
                                fwcVar3 = fvsVar4.a;
                                if (true != (fwcVar3 instanceof defpackage.fwc)) {
                                    fwcVar3 = null;
                                }
                                if (fwcVar3 != null) {
                                    defpackage.hgt.U(new defpackage.fvt(7));
                                    fwnVarB.c(fwcVar3);
                                    fwpVarF = fwnVarB.f();
                                    aooh.f(fvsVar4, "backStackEntry");
                                    synchronized (fwpVarF.h) {
                                        java.util.List listCb = ajsz.cb((java.util.Collection) fwpVarF.d.c());
                                        listIterator = listCb.listIterator(listCb.size());
                                        while (true) {
                                            if (listIterator.hasPrevious()) {
                                                if (aooh.n(((defpackage.fvs) listIterator.previous()).c, fvsVar4.c)) {
                                                    iNextIndex2 = listIterator.nextIndex();
                                                    break;
                                                }
                                            } else {
                                                iNextIndex2 = -1;
                                                break;
                                            }
                                        }
                                        listCb.set(iNextIndex2, fvsVar4);
                                        fwpVarF.f.e(listCb);
                                    }
                                }
                            }
                            z = true;
                        }
                    }
                    z = false;
                } else if (fvsVarC == null || (fwcVar2 = fvsVarC.a) == null || fwcVar.b() != fwcVar2.b()) {
                    z = false;
                } else {
                    aojwVar = new aojw();
                    while (ajsz.aZ(aojwVar2) >= iNextIndex) {
                        defpackage.fvs fvsVar5 = (defpackage.fvs) ajsz.bq(aojwVar2);
                        s(fvsVar5);
                        android.os.Bundle bundleC3 = fvsVar5.a.c(bundle);
                        aooh.f(fvsVar5, "entry");
                        defpackage.fvs fvsVar6 = new defpackage.fvs(fvsVar5.k, fvsVar5.a, bundleC3, fvsVar5.b, fvsVar5.j, fvsVar5.c, fvsVar5.d);
                        emq emqVar2 = fvsVar5.b;
                        aooh.f(emqVar2, "<set-?>");
                        fvsVar6.b = emqVar2;
                        fvsVar6.b(fvsVar5.i);
                        aojwVar.addFirst(fvsVar6);
                    }
                    while (r0.hasNext()) {
                        fweVar = fvsVar3.a.c;
                        if (fweVar != null) {
                            j(fvsVar3, b(fweVar.b()));
                        }
                        aojwVar2.addLast(fvsVar3);
                    }
                    while (r0.hasNext()) {
                        fwnVarB = this.m.b(fvsVar4.a.a);
                        aooh.f(fvsVar4, "backStackEntry");
                        fwcVar3 = fvsVar4.a;
                        if (true != (fwcVar3 instanceof defpackage.fwc)) {
                            fwcVar3 = null;
                        }
                        if (fwcVar3 != null) {
                            defpackage.hgt.U(new defpackage.fvt(7));
                            fwnVarB.c(fwcVar3);
                            fwpVarF = fwnVarB.f();
                            aooh.f(fvsVar4, "backStackEntry");
                            synchronized (fwpVarF.h) {
                                java.util.List listCb2 = ajsz.cb((java.util.Collection) fwpVarF.d.c());
                                listIterator = listCb2.listIterator(listCb2.size());
                                while (true) {
                                    if (listIterator.hasPrevious()) {
                                        if (aooh.n(((defpackage.fvs) listIterator.previous()).c, fvsVar4.c)) {
                                            iNextIndex2 = listIterator.nextIndex();
                                            break;
                                        }
                                    } else {
                                        iNextIndex2 = -1;
                                        break;
                                    }
                                }
                                listCb2.set(iNextIndex2, fvsVar4);
                                fwpVarF.f.e(listCb2);
                            }
                        }
                    }
                    z = true;
                }
            }
            if (!z) {
                p(this.m.b(fwcVar.a), ajsz.aY(defpackage.hgt.ai(u(), fwcVar, bundleC, a(), this.t)), fwjVar, new defpackage.aju(aoopVar, this, fwcVar, bundleC, 5));
            }
        }
        this.b.a();
        java.util.Iterator it3 = this.n.values().iterator();
        while (it3.hasNext()) {
            ((defpackage.fvu) it3.next()).c = false;
        }
        if (zM || aoopVar.a || z) {
            t();
        } else {
            l();
        }
    }

    public final void p(defpackage.fwn fwnVar, java.util.List list, defpackage.fwj fwjVar, aonj aonjVar) {
        aooh.f(list, "entries");
        this.o = aonjVar;
        fwnVar.e(list, fwjVar);
        this.o = null;
    }

    public final boolean r(int i, android.os.Bundle bundle, defpackage.fwj fwjVar) {
        defpackage.fwc fwcVarF;
        defpackage.fvs fvsVar;
        defpackage.fwc fwcVar;
        java.util.Map map = this.h;
        java.lang.Integer numValueOf = java.lang.Integer.valueOf(i);
        if (!map.containsKey(numValueOf)) {
            return false;
        }
        java.lang.String str = (java.lang.String) map.get(numValueOf);
        ajsz.bt(map.values(), new dih(str, 20));
        java.util.Map map2 = this.i;
        aoov.g(map2);
        aojw<defpackage.vk> aojwVar = (aojw) map2.remove(str);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        defpackage.fvs fvsVar2 = (defpackage.fvs) this.f.f();
        if (fvsVar2 == null || (fwcVarF = fvsVar2.a) == null) {
            fwcVarF = f();
        }
        if (aojwVar != null) {
            for (defpackage.vk vkVar : aojwVar) {
                defpackage.fwc fwcVarN = n(fwcVarF, vkVar.c(), true, null);
                if (fwcVarN == null) {
                    throw new java.lang.IllegalStateException("Restore State failed: destination " + defpackage.hgt.ae(u(), vkVar.c()) + " cannot be found from the current destination " + fwcVarF);
                }
                arrayList.add(vkVar.h(u(), fwcVarN, a(), this.t));
                fwcVarF = fwcVarN;
            }
        }
        java.util.ArrayList<java.util.List> arrayList2 = new java.util.ArrayList();
        java.util.ArrayList<defpackage.fvs> arrayList3 = new java.util.ArrayList();
        for (java.lang.Object obj : arrayList) {
            if (!(((defpackage.fvs) obj).a instanceof defpackage.fwe)) {
                arrayList3.add(obj);
            }
        }
        for (defpackage.fvs fvsVar3 : arrayList3) {
            java.util.List list = (java.util.List) ajsz.bJ(arrayList2);
            if (aooh.n((list == null || (fvsVar = (defpackage.fvs) ajsz.bI(list)) == null || (fwcVar = fvsVar.a) == null) ? null : fwcVar.a, fvsVar3.a.a)) {
                list.add(fvsVar3);
            } else {
                arrayList2.add(ajsz.bd(new defpackage.fvs[]{fvsVar3}));
            }
        }
        aoop aoopVar = new aoop();
        for (java.util.List list2 : arrayList2) {
            p(this.m.b(((defpackage.fvs) ajsz.bE(list2)).a.a), list2, fwjVar, new defpackage.dqw(aoopVar, arrayList, new aoor(), this, bundle, 2));
        }
        return aoopVar.a;
    }

    public final void s(defpackage.fvs fvsVar) {
        aooh.f(fvsVar, "child");
        defpackage.fvs fvsVar2 = (defpackage.fvs) this.u.remove(fvsVar);
        if (fvsVar2 != null) {
            java.util.Map map = this.v;
            defpackage.vk vkVar = (defpackage.vk) map.get(fvsVar2);
            java.lang.Integer numValueOf = vkVar != null ? java.lang.Integer.valueOf(((java.util.concurrent.atomic.AtomicInteger) vkVar.a).decrementAndGet()) : null;
            if (numValueOf == null || numValueOf.intValue() != 0) {
                return;
            }
            defpackage.fvu fvuVar = (defpackage.fvu) this.n.get(this.m.b(fvsVar2.a.a));
            if (fvuVar != null) {
                fvuVar.c(fvsVar2);
            }
            map.remove(fvsVar2);
        }
    }

    public final void t() {
        aojw aojwVar;
        while (true) {
            aojwVar = this.f;
            if (aojwVar.isEmpty() || !(((defpackage.fvs) aojwVar.e()).a instanceof defpackage.fwe)) {
                break;
            } else {
                q(this, (defpackage.fvs) aojwVar.e());
            }
        }
        defpackage.fvs fvsVar = (defpackage.fvs) aojwVar.f();
        if (fvsVar != null) {
            this.y.add(fvsVar);
        }
        this.x++;
        l();
        int i = this.x - 1;
        this.x = i;
        if (i == 0) {
            java.util.List list = this.y;
            java.util.List<defpackage.fvs> listCb = ajsz.cb(list);
            list.clear();
            for (defpackage.fvs fvsVar2 : listCb) {
                for (defpackage.fvv fvvVar : ajsz.bZ(this.w)) {
                    defpackage.fwc fwcVar = fvsVar2.a;
                    fvsVar2.a();
                    fvvVar.a();
                }
                this.z.d(fvsVar2);
            }
            this.r.e(ajsz.cb(aojwVar));
            this.s.e(h());
        }
    }

    public final defpackage.vk u() {
        return this.a.g;
    }
}
