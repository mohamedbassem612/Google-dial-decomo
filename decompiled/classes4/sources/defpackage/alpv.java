package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class alpv {
    public static final ymj a(java.util.Map map, defpackage.alnr alnrVar) throws defpackage.aljs {
        ymj ymjVar = (ymj) map.get(alnrVar);
        if (ymjVar != null) {
            return ymjVar;
        }
        defpackage.alnq alnqVarB = defpackage.alnq.b(alnrVar.c);
        if (alnqVarB == null) {
            alnqVarB = defpackage.alnq.UNKNOWN_LLM_FEATURE;
        }
        throw new defpackage.aljs("No service was initialized for feature ID " + alnqVarB.name() + " (version: " + alnrVar.d + ')', defpackage.aljr.g);
    }

    public static final aify b(ynp ynpVar) {
        aify aifyVar = ynpVar.a;
        java.util.ArrayList arrayList = new java.util.ArrayList(ajsz.bl(aifyVar, 10));
        java.util.Iterator it = aifyVar.iterator();
        while (it.hasNext()) {
            arrayList.add(((ynl) it.next()).a);
        }
        return ahvr.bv(arrayList);
    }

    public static /* synthetic */ java.util.Map.Entry c(java.lang.Object obj, java.lang.Object obj2) {
        return new java.util.AbstractMap.SimpleImmutableEntry(j$.util.Objects.requireNonNull(obj), j$.util.Objects.requireNonNull(obj2));
    }

    public static final /* synthetic */ void d(defpackage.alqi alqiVar, akzx akzxVar) {
        aooh.f(alqiVar, "value");
        akzxVar.u();
        defpackage.alqj alqjVar = (defpackage.alqj) akzxVar.b;
        defpackage.alqj alqjVar2 = defpackage.alqj.a;
        j$.util.Objects.requireNonNull(alqiVar);
        alat alatVar = alqjVar.b;
        if (!alatVar.c()) {
            alqjVar.b = alad.J(alatVar);
        }
        alqjVar.b.add(alqiVar);
    }

    public static final /* synthetic */ void e(akzx akzxVar) {
        java.util.List listUnmodifiableList = j$.util.DesugarCollections.unmodifiableList(((defpackage.alqj) akzxVar.b).b);
        aooh.e(listUnmodifiableList, "getActiveExperimentsList(...)");
        new alct(listUnmodifiableList);
    }

    public static java.util.List f(java.util.List list) {
        int size = list.size();
        int i = 0;
        if (size == 1) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add((defpackage.ally) list.get(0));
            return arrayList;
        }
        java.util.List listF = f(u(list, 0));
        java.util.List listF2 = f(u(list, 1));
        int i2 = size / 2;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        while (i < i2) {
            double d = (((double) i) * (-6.283185307179586d)) / ((double) size);
            defpackage.ally allyVar = new defpackage.ally(java.lang.Math.cos(d), java.lang.Math.sin(d));
            defpackage.ally allyVar2 = (defpackage.ally) listF2.get(i);
            double d2 = allyVar.a;
            double d3 = allyVar2.a;
            double d4 = allyVar.b;
            java.util.List list2 = listF2;
            int i3 = size;
            double d5 = allyVar2.b;
            defpackage.ally allyVar3 = new defpackage.ally((d2 * d3) - (d4 * d5), (d2 * d5) + (d4 * d3));
            defpackage.ally allyVar4 = (defpackage.ally) listF.get(i);
            double d6 = allyVar4.a;
            double d7 = allyVar3.a;
            double d8 = allyVar4.b;
            double d9 = allyVar3.b;
            arrayList2.add(new defpackage.ally(d6 + d7, d8 + d9));
            arrayList3.add(new defpackage.ally(d6 - d7, d8 - d9));
            i++;
            listF2 = list2;
            size = i3;
        }
        arrayList2.addAll(arrayList3);
        return arrayList2;
    }

    public static java.lang.String g(java.lang.String str) {
        return !str.isEmpty() ? " ".concat(str).concat(" ") : " ";
    }

    public static j$.util.Optional h(defpackage.almz almzVar, int i, java.util.Map map) {
        apdi apdiVar = defpackage.alol.f;
        almzVar.c(apdiVar);
        java.lang.Object objJ = ((alaa) almzVar).n.j((alac) apdiVar.a);
        if (objJ == null) {
            objJ = apdiVar.b;
        } else {
            apdiVar.c(objJ);
        }
        defpackage.alsw alswVar = ((defpackage.alol) objJ).e;
        if (alswVar == null) {
            alswVar = defpackage.alsw.a;
        }
        java.lang.String str = (alswVar.b == 1 ? (defpackage.alsn) alswVar.c : defpackage.alsn.a).c;
        if (map.containsKey(str)) {
            return j$.util.Optional.of((java.lang.String) map.get(str));
        }
        int iOrdinal = defpackage.alsv.a(alswVar.b).ordinal();
        if (iOrdinal == 0) {
            if (i - 1 == 0) {
                return j$.util.Optional.of(str);
            }
            defpackage.alsm alsmVar = (alswVar.b == 1 ? (defpackage.alsn) alswVar.c : defpackage.alsn.a).d;
            if (alsmVar == null) {
                alsmVar = defpackage.alsm.a;
            }
            return j$.util.Optional.of(alsmVar.d);
        }
        if (iOrdinal == 1) {
            return j$.util.Optional.of((alswVar.b == 2 ? (defpackage.altf) alswVar.c : defpackage.altf.a).c);
        }
        if (iOrdinal == 2) {
            return j$.util.Optional.of(defpackage.alpq.a(alswVar.b == 3 ? (defpackage.alrg) alswVar.c : defpackage.alrg.b));
        }
        if (iOrdinal == 3) {
            return j$.util.Optional.empty();
        }
        throw new java.lang.AssertionError("Unknown Speech request type.");
    }

    public static j$.util.Optional i(defpackage.almz almzVar) {
        return h(almzVar, 1, aikj.b);
    }

    public static defpackage.almz j(defpackage.amal amalVar) {
        akzz akzzVarM = defpackage.almz.a.m();
        defpackage.alnb alnbVar = defpackage.alnb.EVENT_AUDIO_TICK;
        akzzVarM.u();
        defpackage.almz almzVar = akzzVarM.b;
        almzVar.c = alnbVar.aN;
        almzVar.b |= 1;
        apdi apdiVar = defpackage.almf.b;
        apdi apdiVar2 = defpackage.ambe.b;
        amalVar.c(apdiVar2);
        java.lang.Object objJ = ((alaa) amalVar).n.j((alac) apdiVar2.a);
        if (objJ == null) {
            objJ = apdiVar2.b;
        } else {
            apdiVar2.c(objJ);
        }
        akzzVarM.bV(apdiVar, (defpackage.aljk) objJ);
        return akzzVarM.p();
    }

    public static void k(defpackage.aljv aljvVar, defpackage.almy almyVar) {
        akzz akzzVarP = aljvVar.c(almyVar).p();
        java.lang.String str = almyVar.e;
        akzzVarP.u();
        defpackage.alsi alsiVar = akzzVarP.b;
        j$.util.Objects.requireNonNull(str);
        alsiVar.b |= 1;
        alsiVar.c = str;
        aljvVar.h((defpackage.alsi) akzzVarP.p());
    }

    public static final /* synthetic */ xtq l(akzx akzxVar) {
        aooh.f(akzxVar, "builder");
        return new xtq(akzxVar);
    }

    public static final /* synthetic */ xtq m(akzx akzxVar) {
        aooh.f(akzxVar, "builder");
        return new xtq(akzxVar);
    }

    public static final /* synthetic */ xtq n(akzx akzxVar) {
        aooh.f(akzxVar, "builder");
        return new xtq(akzxVar);
    }

    public static final /* synthetic */ xtq o(akzz akzzVar) {
        aooh.f(akzzVar, "builder");
        return new xtq(akzzVar);
    }

    public static final /* synthetic */ xtq p(akzx akzxVar) {
        aooh.f(akzxVar, "builder");
        return new xtq(akzxVar);
    }

    public static final /* synthetic */ zoe q(akzx akzxVar) {
        aooh.f(akzxVar, "builder");
        return new zoe(akzxVar);
    }

    public static final /* synthetic */ vaa r(akzx akzxVar) {
        aooh.f(akzxVar, "builder");
        return new vaa(akzxVar);
    }

    public static final /* synthetic */ vqu s(akzx akzxVar) {
        aooh.f(akzxVar, "builder");
        return new vqu(akzxVar);
    }

    public static final /* synthetic */ vaa t(akzx akzxVar) {
        aooh.f(akzxVar, "builder");
        return new vaa(akzxVar);
    }

    private static java.util.List u(java.util.List list, int i) {
        int size = list.size();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        while (i < size) {
            arrayList.add((defpackage.ally) list.get(i));
            i += 2;
        }
        return arrayList;
    }
}
