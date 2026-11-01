package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final /* synthetic */ class dqk implements aomy {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;

    public /* synthetic */ dqk(java.lang.Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r15v23, types: [eoi, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r15v70, types: [cer, java.lang.Object] */
    public final java.lang.Object a() {
        java.util.List list;
        boolean z = false;
        cxi cxiVar = null;
        switch (this.$cid) {
            case 0:
                return this.a;
            case 1:
                ((defpackage.dqc) this.a).x.F();
                return aojh.a;
            case 2:
                android.util.SparseArray<android.os.Parcelable> sparseArray = new android.util.SparseArray<>();
                ((defpackage.dqc) this.a).y.saveHierarchyState(sparseArray);
                return sparseArray;
            case 3:
                defpackage.dqc dqcVar = (defpackage.dqc) this.a;
                dqcVar.B.a(dqcVar.y);
                dqcVar.p(null);
                return aojh.a;
            case 4:
                defpackage.dqc dqcVar2 = (defpackage.dqc) this.a;
                dqcVar2.A.a(dqcVar2.y);
                return aojh.a;
            case 5:
                defpackage.dqc dqcVar3 = (defpackage.dqc) this.a;
                dqcVar3.z.a(dqcVar3.y);
                return aojh.a;
            case 6:
                defpackage.drq drqVar = (defpackage.drq) this.a;
                cxi cxiVarA = drqVar.a();
                if (cxiVarA != null && cxiVarA.u()) {
                    cxiVar = cxiVarA;
                }
                if (cxiVar != null && drqVar.c() != null) {
                    z = true;
                }
                return java.lang.Boolean.valueOf(z);
            case 7:
                java.lang.Object obj = ((izg) this.a).b;
                if (obj == null) {
                    return new defpackage.eou();
                }
                java.util.Map map = ((eoh) obj).a;
                java.lang.Object eouVar = map.get("androidx.navigation.NavControllerViewModel");
                if (eouVar == null) {
                    eouVar = new defpackage.eou();
                    map.put("androidx.navigation.NavControllerViewModel", eouVar);
                }
                return (defpackage.eou) ((eoa) eouVar);
            case 8:
                ?? r15 = this.a;
                defpackage.fvs fvsVar = (defpackage.fvs) r15;
                if (!fvsVar.e) {
                    throw new java.lang.IllegalStateException("You cannot access the NavBackStackEntry's SavedStateHandle until it is added to the NavController's back stack (i.e., the Lifecycle of the NavBackStackEntry reaches the CREATED state).");
                }
                if (fvsVar.f.d == emq.a) {
                    throw new java.lang.IllegalStateException("You cannot access the NavBackStackEntry's SavedStateHandle after the NavBackStackEntry is destroyed.");
                }
                eog eogVarG = enn.g((eoi) r15, (eoe) fvsVar.g.a(), dzo.n((eoi) r15));
                aopu[] aopuVarArr = aoou.a;
                return ((defpackage.fwq) eogVarG.b(new aooa(defpackage.fwq.class))).a;
            case 9:
                defpackage.fvx fvxVar = (defpackage.fvx) this.a;
                if (fvxVar.f && fvxVar.a() > 1) {
                    z = true;
                }
                fvxVar.e.f(z);
                return aojh.a;
            case 10:
                defpackage.fvx fvxVar2 = (defpackage.fvx) this.a;
                return new defpackage.fwh(fvxVar2.a, fvxVar2.b.m);
            case 11:
                java.lang.String str = ((defpackage.fvz) this.a).d;
                if (str != null) {
                    return new aorg(str, 2);
                }
                return null;
            case 12:
                return java.lang.Boolean.valueOf(defpackage.fvz.b.f(((defpackage.fvz) this.a).c));
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_LEFT /* 13 */:
                java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
                defpackage.fvz fvzVar = (defpackage.fvz) this.a;
                if (!fvzVar.h()) {
                    return linkedHashMap;
                }
                java.lang.String str2 = fvzVar.c;
                aooh.c(str2);
                android.net.Uri uriT = defpackage.hgt.T(str2);
                for (java.lang.String str3 : uriT.getQueryParameterNames()) {
                    java.lang.StringBuilder sb = new java.lang.StringBuilder();
                    java.util.List<java.lang.String> queryParameters = uriT.getQueryParameters(str3);
                    if (queryParameters.size() > 1) {
                        throw new java.lang.IllegalArgumentException(a.bD(str2, str3, "Query parameter ", " must only be present once in ", ". To support repeated query parameters, use an array type for your argument and the pattern provided in your URI will be used to parse each query parameter instance."));
                    }
                    java.lang.String str4 = (java.lang.String) ajsz.bG(queryParameters);
                    if (str4 == null) {
                        fvzVar.e = true;
                        str4 = str3;
                    }
                    defpackage.fvy fvyVar = new defpackage.fvy();
                    int i = 0;
                    for (aora aoraVarG = defpackage.fvz.a.g(str4); aoraVarG != null; aoraVarG = aoraVarG.c()) {
                        aoqz aoqzVarB = ((aord) aoraVarG).b.b(1);
                        aooh.c(aoqzVarB);
                        java.lang.String str5 = aoqzVarB.a;
                        aooh.f(str5, "name");
                        fvyVar.c.add(str5);
                        if (((aopo) aoraVarG.b()).a > i) {
                            java.lang.String strSubstring = str4.substring(i, ((aopo) aoraVarG.b()).a);
                            aooh.e(strSubstring, "substring(...)");
                            sb.append(aooh.r(strSubstring));
                        }
                        sb.append("([\\s\\S]+?)?");
                        i = ((aopo) aoraVarG.b()).b + 1;
                    }
                    if (i < str4.length()) {
                        java.lang.String strSubstring2 = str4.substring(i);
                        aooh.e(strSubstring2, "substring(...)");
                        sb.append(aooh.r(strSubstring2));
                    }
                    sb.append('$');
                    fvyVar.a = defpackage.fvz.j(sb.toString());
                    linkedHashMap.put(str3, fvyVar);
                }
                return linkedHashMap;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SLIGHT_RIGHT /* 14 */:
                java.lang.String fragment = defpackage.hgt.T(((defpackage.fvz) this.a).c).getFragment();
                if (fragment == null) {
                    return null;
                }
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
                defpackage.fvz.i(fragment, arrayList, sb2);
                return new aoiu(arrayList, sb2.toString());
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_NORMAL_LEFT /* 15 */:
                aoiu aoiuVarD = ((defpackage.fvz) this.a).d();
                return (aoiuVarD == null || (list = (java.util.List) aoiuVarD.a) == null) ? new java.util.ArrayList() : list;
            case 16:
                aoiu aoiuVarD2 = ((defpackage.fvz) this.a).d();
                if (aoiuVarD2 != null) {
                    return (java.lang.String) aoiuVarD2.b;
                }
                return null;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                java.lang.String str6 = (java.lang.String) ((defpackage.fvz) this.a).f.a();
                if (str6 != null) {
                    return new aorg(str6, 2);
                }
                return null;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                java.lang.String str7 = ((defpackage.fvy) this.a).a;
                if (str7 != null) {
                    return new aorg(str7);
                }
                return null;
            case androidx.car.app.navigation.model.Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                return defpackage.hgu.af((android.content.Context) this.a);
            default:
                java.util.List list2 = (java.util.List) this.a.a();
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                for (java.lang.Object obj2 : list2) {
                    if (aooh.n(((defpackage.fvs) obj2).a.a, "composable")) {
                        arrayList2.add(obj2);
                    }
                }
                return arrayList2;
        }
    }
}
