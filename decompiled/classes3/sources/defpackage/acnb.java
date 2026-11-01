package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class acnb {
    public final java.util.Set a = new java.util.LinkedHashSet();
    public final java.util.Set b = new java.util.LinkedHashSet();
    public final java.util.Map c = new java.util.HashMap();
    public final java.util.List d = new java.util.ArrayList();
    public final java.util.List e = new java.util.ArrayList();
    public final java.util.Map f = new java.util.HashMap();
    public java.util.Collection g = null;
    public final boolean h = true;
    public final boolean i;

    public acnb() {
        aikn aiknVar = aikn.a;
        this.i = false;
    }

    private final defpackage.acna d(defpackage.acmd acmdVar) {
        java.util.List list = this.d;
        defpackage.acna acnaVar = new defpackage.acna(list.size(), this.a.size());
        acmi acmiVarA = acnaVar.a(acmdVar, -1);
        java.util.ArrayList arrayList = new java.util.ArrayList(1);
        aaoo.ay(acmdVar, arrayList);
        aiwc aiwcVar = acmiVarA.d;
        if (aiwcVar == null) {
            aiwcVar = aiwc.a;
        }
        acnaVar.b(new defpackage.acnj(1, arrayList, aiwcVar.c));
        list.add(acnaVar);
        this.c.put(acmiVarA, acnaVar);
        return acnaVar;
    }

    public final defpackage.acna a(java.util.List list, int i) {
        acmi acmiVar = (acmi) ahvr.bk(list);
        java.util.Map map = this.c;
        defpackage.acna acnaVar = (defpackage.acna) map.get(acmiVar);
        if (acnaVar != null) {
            return acnaVar;
        }
        java.util.List list2 = this.d;
        defpackage.acna acnaVar2 = new defpackage.acna(list2.size(), i);
        list2.add(acnaVar2);
        map.put(acmiVar, acnaVar2);
        return acnaVar2;
    }

    public final defpackage.acna b(defpackage.acmd acmdVar) {
        defpackage.acna acnaVarB;
        java.lang.String string;
        int i = acmdVar.b;
        if (i != -1) {
            if (i != -2) {
                return (defpackage.acna) this.d.get(i);
            }
            return null;
        }
        if (!acmdVar.b()) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(acmdVar);
            sb.append(" has no VE id, it may need to be re-instrumented if it has been reset.");
            defpackage.acmx acmxVar = acmdVar.a;
            if (acmxVar instanceof defpackage.acml) {
                sb.append("\n\tError occurred on CVE with associated View of type: ");
                sb.append(defpackage.acml.a(acmdVar).getClass().getSimpleName());
            } else {
                sb.append("\n\tError occurred on SyntheticNode");
            }
            java.lang.Object objC = acmxVar.c();
            if (objC != null) {
                sb.append("\n\t\tAncestry (leaf -> root):");
            }
            while (objC != null) {
                defpackage.acmd acmdVar2 = (defpackage.acmd) objC;
                defpackage.acmx acmxVar2 = acmdVar2.a;
                if (acmxVar2 == null) {
                    sb.append("\n\t\t\t<Found CVE with no Node attached. Ending traversal.>");
                    string = sb.toString();
                    throw new java.lang.IllegalStateException(string);
                }
                if (acmxVar2 instanceof defpackage.acml) {
                    sb.append("\n\t\t\tView of type: ");
                    sb.append(defpackage.acml.a(acmdVar2).getClass().getSimpleName());
                } else {
                    sb.append("\n\t\t\tSyntheticNode");
                }
                objC = acmxVar2.c();
            }
            string = sb.toString();
            throw new java.lang.IllegalStateException(string);
        }
        this.e.add(acmdVar);
        defpackage.acmx acmxVar3 = acmdVar.a;
        if (acmxVar3.m()) {
            return d(acmdVar);
        }
        java.lang.Object objC2 = acmxVar3.c();
        if (objC2 == null) {
            acmi acmiVarA = acmdVar.a();
            apdi apdiVar = defpackage.acot.a;
            acmiVarA.c(apdiVar);
            if (((alaa) acmiVarA).n.l((alac) apdiVar.a)) {
                return d(acmdVar);
            }
            android.view.View viewA = defpackage.acml.a(acmdVar);
            while (viewA != null) {
                if (!defpackage.acml.n(viewA)) {
                    java.lang.Object parent = viewA.getParent();
                    if (!(parent instanceof android.view.View)) {
                        break;
                    }
                    viewA = (android.view.View) parent;
                } else {
                    android.util.Log.e("GIL", hgb.i(acmdVar, "Unexpected visual element (", ") without parent detected. All visual elements except the root view must have a parent visual element. See also: go/gil-android/instrumentation#requirements."));
                }
                acmdVar.b = -2;
                return null;
            }
            if (android.util.Log.isLoggable("GIL", 2)) {
                android.util.Log.v("GIL", hgb.i(acmdVar, "Ignoring CVE (", ") outside of AutoLogger scope."));
            }
            acmdVar.b = -2;
            return null;
        }
        defpackage.acmd acmdVar3 = (defpackage.acmd) objC2;
        if (acmdVar3.b == -1 && acmdVar3.c()) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(null);
            aaoo.ay(acmdVar3, arrayList);
            ahvr.bY(arrayList.size() > 1);
            acnaVarB = a(arrayList, this.a.size());
            acmi acmiVarA2 = acnaVarB.a(acmdVar, -1);
            arrayList.set(0, acmiVarA2);
            aiwc aiwcVar = acmiVarA2.d;
            if (aiwcVar == null) {
                aiwcVar = aiwc.a;
            }
            acnaVarB.b(new defpackage.acnj(1, arrayList, aiwcVar.c));
        } else {
            acnaVarB = b(acmdVar3);
            if (acnaVarB == null) {
                return null;
            }
            aiwc aiwcVar2 = acmdVar3.c.b.d;
            if (aiwcVar2 == null) {
                aiwcVar2 = aiwc.a;
            }
            acnaVarB.a(acmdVar, aiwcVar2.c);
        }
        return acnaVarB;
    }

    public final boolean c(defpackage.acmd acmdVar, int i) {
        if (this.a.contains(acmdVar)) {
            return false;
        }
        int iAS = a.aS(acmdVar.c.b.e);
        if (iAS == 0) {
            iAS = 1;
        }
        java.util.Set set = this.b;
        if (iAS == i) {
            set.remove(acmdVar);
            return false;
        }
        set.add(acmdVar);
        return true;
    }
}
