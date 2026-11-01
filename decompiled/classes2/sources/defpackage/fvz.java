package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class fvz {
    public final java.lang.String c;
    public java.lang.String d;
    public boolean e;
    public final aoir f;
    public boolean g;
    private final java.util.List l;
    private final aoir m;
    private final aoir n;
    private final aoir o;
    private final aoir p;
    private final aoir q;
    private final aoir r;
    private static final aorg h = new aorg("^[a-zA-Z]+[+\\w\\-.]*:");
    public static final aorg a = new aorg("\\{(.+?)\\}");
    private static final aorg i = new aorg("http[s]?://");
    private static final aorg j = new aorg("([^/]*?|)");
    public static final aorg b = new aorg("^[^?#]+\\?([^#]*).*");
    private static final aorg k = new aorg("(\\?|#|$)");

    static {
        new aorg("^[\\s\\S]+/[\\s\\S]+$");
    }

    public fvz(java.lang.String str) {
        this.c = str;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        this.l = arrayList;
        this.m = aooc.ag(new defpackage.dqk(this, 11));
        this.n = aooc.ag(new defpackage.dqk(this, 12));
        this.o = aooc.ah(3, new defpackage.dqk(this, 13));
        this.p = aooc.ah(3, new defpackage.dqk(this, 14));
        this.q = aooc.ah(3, new defpackage.dqk(this, 15));
        this.f = aooc.ah(3, new defpackage.dqk(this, 16));
        this.r = aooc.ag(new defpackage.dqk(this, 17));
        aooc.ag(new defpackage.eli(4));
        java.lang.StringBuilder sb = new java.lang.StringBuilder("^");
        if (!h.e(str)) {
            sb.append(i.a());
        }
        aora aoraVarG = k.g(str);
        boolean z = false;
        if (aoraVarG != null) {
            java.lang.String strSubstring = str.substring(0, ((aopo) aoraVarG.b()).a);
            aooh.e(strSubstring, "substring(...)");
            i(strSubstring, arrayList, sb);
            sb.append("($|(\\?(.)*)|(#(.)*))");
        }
        java.lang.String strJ = j(sb.toString());
        this.d = strJ;
        aooh.c(strJ);
        if (!aoov.G(strJ, ".*", false)) {
            java.lang.String str2 = this.d;
            aooh.c(str2);
            if (!aoov.G(str2, j.a(), false)) {
                z = true;
            }
        }
        this.g = z;
    }

    public static final void i(java.lang.String str, java.util.List list, java.lang.StringBuilder sb) {
        int i2 = 0;
        for (aora aoraVarG = a.g(str); aoraVarG != null; aoraVarG = aoraVarG.c()) {
            aoqz aoqzVarB = ((aord) aoraVarG).b.b(1);
            aooh.c(aoqzVarB);
            list.add(aoqzVarB.a);
            if (((aopo) aoraVarG.b()).a > i2) {
                java.lang.String strSubstring = str.substring(i2, ((aopo) aoraVarG.b()).a);
                aooh.e(strSubstring, "substring(...)");
                sb.append(aooh.r(strSubstring));
            }
            sb.append(j.a());
            i2 = ((aopo) aoraVarG.b()).b + 1;
        }
        if (i2 < str.length()) {
            java.lang.String strSubstring2 = str.substring(i2);
            aooh.e(strSubstring2, "substring(...)");
            sb.append(aooh.r(strSubstring2));
        }
    }

    public static final java.lang.String j(java.lang.String str) {
        if (aoov.G(str, "\\Q", false) && aoov.G(str, "\\E", false)) {
            return aoov.Q(str, ".*", "\\E.*\\Q");
        }
        return aoov.G(str, "\\.\\*", false) ? aoov.Q(str, "\\.\\*", ".*") : str;
    }

    private final java.util.List k() {
        return (java.util.List) this.q.a();
    }

    private final java.util.Map l() {
        return (java.util.Map) this.o.a();
    }

    private static final void m(android.os.Bundle bundle, java.lang.String str, java.lang.String str2, defpackage.fvr fvrVar) {
        if (fvrVar != null) {
            throw null;
        }
        gij.d(bundle, str, str2);
    }

    public final int a(android.net.Uri uri) {
        if (uri == null) {
            return 0;
        }
        return ajsz.cd(uri.getPathSegments(), defpackage.hgt.T(this.c).getPathSegments()).size();
    }

    public final android.os.Bundle b(android.net.Uri uri, java.util.Map map) {
        aora aoraVarD;
        aord aordVarD;
        java.lang.String str;
        aooh.f(uri, "deepLink");
        aorg aorgVarE = e();
        if (aorgVarE == null || (aoraVarD = aorgVarE.d(uri.toString())) == null) {
            return null;
        }
        int i2 = 0;
        android.os.Bundle bundleR = dpe.r((aoiu[]) java.util.Arrays.copyOf(new aoiu[0], 0));
        if (!f(aoraVarD, bundleR, map)) {
            return null;
        }
        if (h() && !g(uri, bundleR, map)) {
            return null;
        }
        java.lang.String fragment = uri.getFragment();
        aorg aorgVar = (aorg) this.r.a();
        if (aorgVar != null && (aordVarD = aorgVar.d(java.lang.String.valueOf(fragment))) != null) {
            java.util.List listK = k();
            java.util.ArrayList arrayList = new java.util.ArrayList(ajsz.bl(listK, 10));
            for (java.lang.Object obj : listK) {
                int i3 = i2 + 1;
                if (i2 < 0) {
                    ajsz.bh();
                }
                java.lang.String str2 = (java.lang.String) obj;
                aoqz aoqzVarB = aordVarD.b.b(i3);
                java.lang.String strS = (aoqzVarB == null || (str = aoqzVarB.a) == null) ? null : defpackage.hgt.S(str);
                defpackage.fvr fvrVar = (defpackage.fvr) map.get(str2);
                if (strS == null) {
                    strS = "";
                }
                try {
                    m(bundleR, str2, strS, fvrVar);
                    arrayList.add(aojh.a);
                    i2 = i3;
                } catch (java.lang.IllegalArgumentException unused) {
                }
            }
        }
        if (defpackage.hgt.ab(map, new dih(bundleR, 15)).isEmpty()) {
            return bundleR;
        }
        return null;
    }

    public final java.util.List c() {
        java.util.Collection collectionValues = l().values();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = collectionValues.iterator();
        while (it.hasNext()) {
            ajsz.bv(arrayList, ((defpackage.fvy) it.next()).c);
        }
        return ajsz.bT(ajsz.bT(this.l, arrayList), k());
    }

    public final aoiu d() {
        return (aoiu) this.p.a();
    }

    public final aorg e() {
        return (aorg) this.m.a();
    }

    public final boolean equals(java.lang.Object obj) {
        return obj != null && (obj instanceof defpackage.fvz) && aooh.n(this.c, ((defpackage.fvz) obj).c) && aooh.n((java.lang.Object) null, (java.lang.Object) null) && aooh.n((java.lang.Object) null, (java.lang.Object) null);
    }

    public final boolean f(aora aoraVar, android.os.Bundle bundle, java.util.Map map) {
        java.lang.String str;
        java.util.List list = this.l;
        java.util.ArrayList arrayList = new java.util.ArrayList(ajsz.bl(list, 10));
        int i2 = 0;
        for (java.lang.Object obj : list) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                ajsz.bh();
            }
            java.lang.String str2 = (java.lang.String) obj;
            aoqz aoqzVarB = ((aord) aoraVar).b.b(i3);
            java.lang.String strS = null;
            if (aoqzVarB != null && (str = aoqzVarB.a) != null) {
                strS = defpackage.hgt.S(str);
            }
            defpackage.fvr fvrVar = (defpackage.fvr) map.get(str2);
            if (strS == null) {
                strS = "";
            }
            try {
                m(bundle, str2, strS, fvrVar);
                arrayList.add(aojh.a);
                i2 = i3;
            } catch (java.lang.IllegalArgumentException unused) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v0 */
    /* JADX WARN: Type inference failed for: r14v1, types: [int] */
    /* JADX WARN: Type inference failed for: r14v8 */
    /* JADX WARN: Type inference failed for: r20v0, types: [java.util.Map] */
    public final boolean g(android.net.Uri uri, android.os.Bundle bundle, java.util.Map map) {
        aojh aojhVarValueOf;
        boolean z;
        java.lang.String query;
        for (java.util.Map.Entry entry : l().entrySet()) {
            java.lang.String str = (java.lang.String) entry.getKey();
            defpackage.fvy fvyVar = (defpackage.fvy) entry.getValue();
            java.util.List<java.lang.String> queryParameters = uri.getQueryParameters(str);
            if (this.e && (query = uri.getQuery()) != null && !aooh.n(query, uri.toString())) {
                queryParameters = ajsz.aY(query);
            }
            boolean z2 = false;
            android.os.Bundle bundleR = dpe.r((aoiu[]) java.util.Arrays.copyOf(new aoiu[0], 0));
            java.util.List list = fvyVar.c;
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                if (((defpackage.fvr) map.get((java.lang.String) it.next())) != null) {
                    throw null;
                }
            }
            for (java.lang.String str2 : queryParameters) {
                aorg aorgVar = (aorg) fvyVar.b.a();
                aora aoraVarD = aorgVar != null ? aorgVar.d(str2) : null;
                if (aoraVarD == null) {
                    return z2;
                }
                java.util.ArrayList arrayList = new java.util.ArrayList(ajsz.bl(list, 10));
                ?? r14 = z2;
                for (java.lang.Object obj : list) {
                    int i2 = r14 + 1;
                    if (r14 < 0) {
                        ajsz.bh();
                    }
                    java.lang.String str3 = (java.lang.String) obj;
                    aoqz aoqzVarB = ((aord) aoraVarD).b.b(i2);
                    java.lang.String str4 = aoqzVarB != null ? aoqzVarB.a : null;
                    defpackage.fvr fvrVar = (defpackage.fvr) map.get(str3);
                    try {
                        if (gie.f(bundleR, str3)) {
                            if (!gie.f(bundleR, str3)) {
                                z = true;
                            } else {
                                if (fvrVar != null) {
                                    throw null;
                                }
                                z = false;
                            }
                            aojhVarValueOf = java.lang.Boolean.valueOf(z);
                        } else {
                            if (str4 == null) {
                                str4 = "";
                            }
                            m(bundleR, str3, str4, fvrVar);
                            aojhVarValueOf = aojh.a;
                        }
                    } catch (java.lang.IllegalArgumentException unused) {
                        aojhVarValueOf = aojh.a;
                    }
                    arrayList.add(aojhVarValueOf);
                    r14 = i2;
                    z2 = false;
                }
            }
            bundle.putAll(bundleR);
        }
        return true;
    }

    public final boolean h() {
        return ((java.lang.Boolean) this.n.a()).booleanValue();
    }

    public final int hashCode() {
        return this.c.hashCode() * 961;
    }
}
