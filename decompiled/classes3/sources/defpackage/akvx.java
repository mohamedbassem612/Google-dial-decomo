package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class akvx {
    public static final ahyj a;
    private static final ahzf b = ahzf.b('=').a().k();
    private static final ahzf c = ahzf.b('/');
    private static final ahzf d = ahzf.b('-');
    private static final ahyj e;
    private static final ahyj f;
    private static final aify g;

    static {
        ahzf.b(':');
        e = new ahyj("/");
        f = new ahyj("-");
        a = new ahyj("=");
        g = aify.w(new defpackage.akvw("s", false), new defpackage.akvw("w", false), new defpackage.akvw("c", true), new defpackage.akvw("d", true), new defpackage.akvw("h", false), new defpackage.akvw("s", true), new defpackage.akvw("h", true), new defpackage.akvw("p", true), new defpackage.akvw("pp", true), new defpackage.akvw("pf", true), new defpackage.akvw("n", true), new defpackage.akvw("r", false), new defpackage.akvw[]{new defpackage.akvw("r", true), new defpackage.akvw("o", true), new defpackage.akvw("o", false), new defpackage.akvw("j", false), new defpackage.akvw("x", false), new defpackage.akvw("y", false), new defpackage.akvw("z", false), new defpackage.akvw("g", true), new defpackage.akvw("e", false), new defpackage.akvw("f", false), new defpackage.akvw("k", true), new defpackage.akvw("u", true), new defpackage.akvw("ut", true), new defpackage.akvw("i", true), new defpackage.akvw("a", true), new defpackage.akvw("b", true), new defpackage.akvw("b", false), new defpackage.akvw("c", false), new defpackage.akvw("t", false), new defpackage.akvw("nt0", false), new defpackage.akvw("v", true), new defpackage.akvw("q", false), new defpackage.akvw("fh", true), new defpackage.akvw("fv", true), new defpackage.akvw("fg", true), new defpackage.akvw("ci", true), new defpackage.akvw("rw", true), new defpackage.akvw("rwu", true), new defpackage.akvw("rwa", true), new defpackage.akvw("nw", true), new defpackage.akvw("rh", true), new defpackage.akvw("no", true), new defpackage.akvw("ns", true), new defpackage.akvw("k", false), new defpackage.akvw("p", false), new defpackage.akvw("l", false), new defpackage.akvw("v", false), new defpackage.akvw("nu", true), new defpackage.akvw("ft", true), new defpackage.akvw("cc", true), new defpackage.akvw("nd", true), new defpackage.akvw("ip", true), new defpackage.akvw("nc", true), new defpackage.akvw("a", false), new defpackage.akvw("rj", true), new defpackage.akvw("rp", true), new defpackage.akvw("rg", true), new defpackage.akvw("pd", true), new defpackage.akvw("pa", true), new defpackage.akvw("m", false), new defpackage.akvw("vb", false), new defpackage.akvw("vl", false), new defpackage.akvw("lf", true), new defpackage.akvw("mv", true), new defpackage.akvw("id", true), new defpackage.akvw("al", true), new defpackage.akvw("ic", false), new defpackage.akvw("pg", true), new defpackage.akvw("mo", true), new defpackage.akvw("iv", false), new defpackage.akvw("il", false), new defpackage.akvw("ba", false), new defpackage.akvw("vm", false), new defpackage.akvw("vf", false)});
    }

    public static java.lang.String a(java.lang.String str, java.lang.String str2, boolean z) {
        ahvr.bN(str != null, "oldOptions is null");
        if (str.isEmpty()) {
            return str2;
        }
        java.util.List<java.lang.String> listB = b(str, !z);
        if (listB.isEmpty()) {
            return str2;
        }
        listB.addAll(b(str2, false));
        aidf aidfVar = new aidf((byte[]) null);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.String str3 : listB) {
            aike aikeVar = g;
            int i = aikeVar.d;
            defpackage.akvw akvwVar = null;
            for (int i2 = 0; i2 < i; i2++) {
                defpackage.akvw akvwVar2 = (defpackage.akvw) aikeVar.get(i2);
                java.lang.String lowerCase = str3.toLowerCase(java.util.Locale.getDefault());
                java.lang.String str4 = akvwVar2.a;
                if (lowerCase.startsWith(str4)) {
                    if (akvwVar2.b) {
                        if (str3.length() == str4.length()) {
                            akvwVar = akvwVar2;
                            break;
                        }
                    } else {
                        akvwVar = akvwVar2;
                    }
                }
            }
            if (akvwVar != null) {
                aidfVar.t(akvwVar, str3);
            } else {
                arrayList.add(str3);
            }
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        aike aikeVar2 = g;
        int i3 = aikeVar2.d;
        for (int i4 = 0; i4 < i3; i4++) {
            java.lang.String str5 = "";
            for (java.lang.String str6 : aidfVar.f((defpackage.akvw) aikeVar2.get(i4))) {
                if (java.lang.Character.isUpperCase(str6.charAt(0))) {
                    arrayList2.add(str6);
                } else {
                    str5 = str6;
                }
            }
            if (!str5.isEmpty()) {
                arrayList2.add(str5);
            }
        }
        arrayList2.addAll(arrayList);
        return f.b(arrayList2);
    }

    public static java.util.List b(java.lang.String str, boolean z) {
        ahvr.bN(str != null, "options is null");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = d.h(str).iterator();
        while (it.hasNext()) {
            java.lang.String strF = (java.lang.String) it.next();
            if (!strF.isEmpty()) {
                if (strF.startsWith("O") || strF.startsWith("J")) {
                    while (strF.length() < 12) {
                        strF = f.f(strF, it.hasNext() ? it.next() : "", new java.lang.Object[0]);
                    }
                }
                if (strF.equals("pi") || strF.equals("ya") || strF.equals("ro")) {
                    strF = f.f(strF, it.hasNext() ? it.next() : "", new java.lang.Object[0]);
                }
                if (!z || java.lang.Character.isUpperCase(strF.charAt(0))) {
                    arrayList.add(strF);
                }
            }
        }
        return arrayList;
    }

    public static android.net.Uri c(defpackage.akwa akwaVar, android.net.Uri uri) throws defpackage.abzs {
        try {
            defpackage.abzr abzrVar = new defpackage.abzr(uri);
            ahvr.bN(abzrVar.a() != null, "url path is null");
            java.lang.String strA = abzrVar.a();
            if (strA.contains("=")) {
                throw new defpackage.akvv("url path cannot already contain =");
            }
            java.lang.String strA2 = a("", akwaVar.c(""), false);
            if (!strA2.isEmpty()) {
                strA = a.f(strA, strA2, new java.lang.Object[0]);
            }
            return abzrVar.b(strA).a;
        } catch (defpackage.akvv e2) {
            throw new defpackage.abzs(e2);
        }
    }

    static final java.util.List d(defpackage.abzr abzrVar) {
        java.util.ArrayList arrayListAK = ahvr.aK(c.h(abzrVar.a()));
        return (arrayListAK.size() <= 0 || !((java.lang.String) arrayListAK.get(0)).isEmpty()) ? arrayListAK : arrayListAK.subList(1, arrayListAK.size());
    }

    public static boolean e(android.net.Uri uri) {
        java.lang.String string = new defpackage.abzr(uri).toString();
        java.util.regex.Pattern pattern = defpackage.akwc.a;
        if (string != null) {
            return defpackage.akwc.a.matcher(string).find();
        }
        throw new java.lang.IllegalArgumentException();
    }

    public static final java.lang.Object f(defpackage.akwa akwaVar, defpackage.abzr abzrVar, boolean z) throws defpackage.akvv {
        if (abzrVar.a() == null) {
            throw new defpackage.akvv("url path is null");
        }
        java.util.List listD = d(abzrVar);
        boolean z2 = true;
        if (!listD.isEmpty() && "u".equals(listD.get(0))) {
            listD.remove(1);
            listD.remove(0);
        } else if (!listD.isEmpty() && "image".equals(listD.get(0))) {
            listD.remove(0);
        }
        if (listD.size() == 2) {
            listD.remove(0);
        }
        int size = listD.size();
        if (size < 4 || (size != 4 ? size > 6 : ((java.lang.String) listD.get(3)).isEmpty())) {
            int size2 = listD.size();
            if (size2 <= 0 || size2 > 1 || ((java.lang.String) listD.get(0)).isEmpty()) {
                throw new defpackage.akvv(abzrVar.toString());
            }
            ahvr.bN(abzrVar.a() != null, "url path is null");
            ahzf ahzfVar = b;
            java.util.ArrayList arrayListAK = ahvr.aK(ahzfVar.h(abzrVar.a()));
            java.lang.String strC = akwaVar.c("");
            java.util.ArrayList arrayListAK2 = ahvr.aK(ahzfVar.h(abzrVar.a()));
            java.lang.String strA = a(arrayListAK2.size() == 2 ? (java.lang.String) arrayListAK2.get(1) : "", strC, z);
            java.lang.String strF = (java.lang.String) arrayListAK.get(0);
            if (!strA.isEmpty()) {
                strF = a.f(strF, strA, new java.lang.Object[0]);
            }
            return abzrVar.b(strF).a;
        }
        ahvr.bN(abzrVar.a() != null, "url path is null");
        java.util.List listD2 = d(abzrVar);
        if (listD2.isEmpty() || !((java.lang.String) listD2.get(0)).equals("image")) {
            z2 = false;
        } else {
            listD2.remove(0);
        }
        java.lang.String strC2 = akwaVar.c("");
        if (listD2.size() == 4) {
            listD2.add("");
        } else if (listD2.size() == 5) {
            listD2.add(4, "");
        }
        java.lang.String strA2 = a((java.lang.String) listD2.get(4), strC2, z);
        listD2.set(4, strA2);
        if (strA2.isEmpty() && listD2.size() > 5) {
            listD2.remove(4);
        }
        if (z2) {
            listD2.add(0, "image");
        }
        return abzrVar.b("/".concat(e.b(listD2))).a;
    }
}
