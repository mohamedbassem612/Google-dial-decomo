package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public class fwc {
    public static final /* synthetic */ int e = 0;
    public final java.lang.String a;
    public final defpackage.fxu b;
    public defpackage.fwe c;
    public final aed d;

    static {
        new java.util.LinkedHashMap();
    }

    public fwc(defpackage.fwn fwnVar) {
        java.util.Map map = defpackage.fwo.a;
        java.lang.String strR = defpackage.hgt.R(fwnVar.getClass());
        if (strR == null) {
            aooh.i("navigatorName");
        }
        this.a = strR;
        this.b = new defpackage.fxu(this);
        this.d = new aed((byte[]) null);
    }

    private final java.util.List i() {
        return this.b.b;
    }

    public boolean a() {
        return true;
    }

    public final int b() {
        return this.b.d;
    }

    public final android.os.Bundle c(android.os.Bundle bundle) {
        defpackage.fxu fxuVar = this.b;
        if (bundle == null && fxuVar.c.isEmpty()) {
            return null;
        }
        android.os.Bundle bundleR = dpe.r((aoiu[]) java.util.Arrays.copyOf(new aoiu[0], 0));
        java.util.Map map = fxuVar.c;
        java.util.Iterator it = map.entrySet().iterator();
        if (it.hasNext()) {
            java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
            throw null;
        }
        if (bundle != null) {
            bundleR.putAll(bundle);
            java.util.Iterator it2 = map.entrySet().iterator();
            if (it2.hasNext()) {
                java.util.Map.Entry entry2 = (java.util.Map.Entry) it2.next();
                throw null;
            }
        }
        return bundleR;
    }

    public defpackage.fwb d(defpackage.fwa fwaVar) {
        boolean zF;
        boolean z;
        aorg aorgVarE;
        aora aoraVarD;
        defpackage.fxu fxuVar = this.b;
        java.util.List<defpackage.fvz> list = fxuVar.b;
        if (list.isEmpty()) {
            return null;
        }
        defpackage.fwb fwbVar = null;
        for (defpackage.fvz fvzVar : list) {
            android.net.Uri uri = fwaVar.a;
            if (fvzVar.e() == null) {
                zF = true;
            } else if (uri == null) {
                zF = false;
            } else {
                aorg aorgVarE2 = fvzVar.e();
                if (aorgVarE2 == null) {
                    aooh.g();
                }
                zF = aorgVarE2.f(uri.toString());
            }
            if (zF) {
                android.os.Bundle bundleB = uri != null ? fvzVar.b(uri, fxuVar.c) : null;
                int iA = fvzVar.a(uri);
                java.lang.String str = fwaVar.b;
                boolean z2 = str != null && aooh.n(str, (java.lang.Object) null);
                if (bundleB != null) {
                    z = z2;
                } else if (z2) {
                    java.util.Map map = fxuVar.c;
                    android.os.Bundle bundleR = dpe.r((aoiu[]) java.util.Arrays.copyOf(new aoiu[0], 0));
                    if (uri != null && (aorgVarE = fvzVar.e()) != null && (aoraVarD = aorgVarE.d(uri.toString())) != null) {
                        fvzVar.f(aoraVarD, bundleR, map);
                        if (fvzVar.h()) {
                            fvzVar.g(uri, bundleR, map);
                        }
                    }
                    if (defpackage.hgt.ab(map, new defpackage.fxs(bundleR, 2)).isEmpty()) {
                        z = true;
                    }
                }
                defpackage.fwb fwbVar2 = new defpackage.fwb(fxuVar.a, bundleB, fvzVar.g, iA, z);
                if (fwbVar == null || fwbVar2.compareTo(fwbVar) > 0) {
                    fwbVar = fwbVar2;
                }
            }
        }
        return fwbVar;
    }

    public final defpackage.fwb e(java.lang.String str) {
        defpackage.fvz fvzVar;
        android.net.Uri uriT;
        android.os.Bundle bundleB;
        defpackage.fxu fxuVar = this.b;
        aoir aoirVar = fxuVar.f;
        if (aoirVar == null || (fvzVar = (defpackage.fvz) aoirVar.a()) == null || (bundleB = fvzVar.b((uriT = defpackage.hgt.T(defpackage.hgt.X(str))), fxuVar.c)) == null) {
            return null;
        }
        return new defpackage.fwb(fxuVar.a, bundleB, fvzVar.g, fvzVar.a(uriT), false);
    }

    public boolean equals(java.lang.Object obj) {
        boolean z;
        boolean z2;
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof defpackage.fwc)) {
            defpackage.fwc fwcVar = (defpackage.fwc) obj;
            boolean zN = aooh.n(i(), fwcVar.i());
            aed aedVar = this.d;
            if (aedVar.c() == fwcVar.d.c()) {
                if (aedVar == null) {
                    aooh.i("<this>");
                }
                java.util.Iterator itA = aooc.f(new defpackage.aef(aedVar)).a();
                while (true) {
                    if (!itA.hasNext()) {
                        z = true;
                        break;
                    }
                    int iIntValue = ((java.lang.Number) itA.next()).intValue();
                    if (!aooh.n(defpackage.aee.a(aedVar, iIntValue), defpackage.aee.a(fwcVar.d, iIntValue))) {
                        z = false;
                        break;
                    }
                }
            } else {
                z = false;
                break;
            }
            java.util.Map map = this.b.c;
            java.util.Map map2 = fwcVar.b.c;
            if (map.size() != map2.size()) {
                z2 = false;
                break;
            }
            java.util.Iterator itA2 = ajsz.ch(map.entrySet()).a();
            while (true) {
                if (!itA2.hasNext()) {
                    z2 = true;
                    break;
                }
                java.util.Map.Entry entry = (java.util.Map.Entry) itA2.next();
                if (!map2.containsKey(entry.getKey()) || !aooh.n(map2.get(entry.getKey()), entry.getValue())) {
                    z2 = false;
                    break;
                }
            }
            if (b() == fwcVar.b() && aooh.n(f(), fwcVar.f()) && zN && z && z2) {
                return true;
            }
        }
        return false;
    }

    public final java.lang.String f() {
        return this.b.e;
    }

    public final java.util.Map g() {
        return ajsz.aS(this.b.c);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0025  */
    /* JADX WARN: Code duplicated, block: B:14:0x0031  */
    public final int[] h(defpackage.fwc fwcVar) {
        aojw aojwVar = new aojw();
        while (true) {
            aooh.c(this);
            defpackage.fwe fweVar = this.c;
            if ((fwcVar != null ? fwcVar.c : null) == null) {
                if (fweVar != null) {
                    aojwVar.addFirst(this);
                } else {
                    aojwVar.addFirst(this);
                }
                if (!aooh.n(fweVar, fwcVar)) {
                    break;
                    break;
                }
                break;
            }
            defpackage.fwe fweVar2 = fwcVar.c;
            aooh.c(fweVar2);
            if (fweVar2.k(this.b()) == this) {
                aojwVar.addFirst(this);
                break;
            }
            if (fweVar != null || fweVar.i() != this.b()) {
                aojwVar.addFirst(this);
            }
            if (!aooh.n(fweVar, fwcVar) || fweVar == null) {
                break;
            }
            this = fweVar;
        }
        java.util.List listBZ = ajsz.bZ(aojwVar);
        java.util.ArrayList arrayList = new java.util.ArrayList(ajsz.bl(listBZ, 10));
        java.util.Iterator it = listBZ.iterator();
        while (it.hasNext()) {
            arrayList.add(java.lang.Integer.valueOf(((defpackage.fwc) it.next()).b()));
        }
        return ajsz.cm(arrayList);
    }

    public int hashCode() {
        int iB = b() * 31;
        java.lang.String strF = f();
        int iHashCode = iB + (strF != null ? strF.hashCode() : 0);
        java.util.Iterator it = i().iterator();
        while (it.hasNext()) {
            iHashCode = ((iHashCode * 31) + ((defpackage.fvz) it.next()).c.hashCode()) * 961;
        }
        java.util.Iterator itB = sl.b(this.d);
        if (itB.hasNext()) {
            throw null;
        }
        java.util.Map map = this.b.c;
        for (java.lang.String str : map.keySet()) {
            int iHashCode2 = ((iHashCode * 31) + str.hashCode()) * 31;
            java.lang.Object obj = map.get(str);
            iHashCode = iHashCode2 + (obj != null ? obj.hashCode() : 0);
        }
        return iHashCode;
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append("(0x");
        sb.append(java.lang.Integer.toHexString(b()));
        sb.append(')');
        java.lang.String strF = f();
        if (strF != null && !aoov.H(strF)) {
            sb.append(" route=");
            sb.append(f());
        }
        return sb.toString();
    }
}
