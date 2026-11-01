package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class apiw {
    public final java.lang.String a;
    public final java.lang.String b;
    public final int c;
    private final java.lang.String d;
    private final java.lang.String e;
    private final java.util.List f;
    private final java.lang.String g;
    private final java.lang.String h;

    public apiw(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, int i, java.util.List list, java.lang.String str5, java.lang.String str6) {
        this.a = str;
        this.d = str2;
        this.e = str3;
        this.b = str4;
        this.c = i;
        this.f = list;
        this.g = str5;
        this.h = str6;
    }

    public final java.lang.String a() {
        if (this.e.length() == 0) {
            return "";
        }
        java.lang.String str = this.h;
        java.lang.String strSubstring = str.substring(defpackage.aoov.M(str, ':', this.a.length() + 3) + 1, defpackage.aoov.M(str, '@', 0));
        defpackage.aooh.e(strSubstring, "substring(...)");
        return strSubstring;
    }

    public final java.lang.String b() {
        int length = this.a.length() + 3;
        java.lang.String str = this.h;
        int iM = defpackage.aoov.M(str, '/', length);
        int i = defpackage.apjv.a;
        int i2 = iM;
        while (true) {
            int length2 = str.length();
            if (i2 >= length2) {
                i2 = length2;
                break;
            }
            if (defpackage.aoov.M("?#", str.charAt(i2), 0) >= 0) {
                break;
            }
            i2++;
        }
        java.lang.String strSubstring = str.substring(iM, i2);
        defpackage.aooh.e(strSubstring, "substring(...)");
        return strSubstring;
    }

    public final java.lang.String c() {
        if (this.f == null) {
            return null;
        }
        java.lang.String str = this.h;
        int iM = defpackage.aoov.M(str, '?', 0) + 1;
        int i = defpackage.apjv.a;
        int i2 = iM;
        while (true) {
            int length = str.length();
            if (i2 >= length) {
                i2 = length;
                break;
            }
            if (str.charAt(i2) == '#') {
                break;
            }
            i2++;
        }
        java.lang.String strSubstring = str.substring(iM, i2);
        defpackage.aooh.e(strSubstring, "substring(...)");
        return strSubstring;
    }

    public final java.lang.String d() {
        if (this.d.length() == 0) {
            return "";
        }
        java.lang.String str = this.a;
        java.lang.String str2 = this.h;
        int i = defpackage.apjv.a;
        int length = str.length() + 3;
        int i2 = length;
        while (true) {
            int length2 = str2.length();
            if (i2 >= length2) {
                i2 = length2;
                break;
            }
            if (defpackage.aoov.M(":@", str2.charAt(i2), 0) >= 0) {
                break;
            }
            i2++;
        }
        java.lang.String strSubstring = str2.substring(length, i2);
        defpackage.aooh.e(strSubstring, "substring(...)");
        return strSubstring;
    }

    public final java.lang.String e() {
        defpackage.apiv apivVarI = i("/...");
        if (apivVarI == null) {
            defpackage.aooh.g();
        }
        apivVarI.b = defpackage.apof.b("", 0, 0, " \"':;<=>@[]^`{}|/\\?#", false, false, false, false, 123);
        apivVarI.c = defpackage.apof.b("", 0, 0, " \"':;<=>@[]^`{}|/\\?#", false, false, false, false, 123);
        return apivVarI.a().h;
    }

    public final boolean equals(java.lang.Object obj) {
        return (obj instanceof defpackage.apiw) && defpackage.aooh.n(((defpackage.apiw) obj).h, this.h);
    }

    public final java.net.URI f() {
        java.lang.String strSubstring;
        defpackage.apiv apivVar = new defpackage.apiv();
        java.lang.String str = this.a;
        apivVar.a = str;
        java.lang.String strD = d();
        if (strD == null) {
            defpackage.aooh.i("<set-?>");
        }
        apivVar.b = strD;
        java.lang.String strA = a();
        if (strA == null) {
            defpackage.aooh.i("<set-?>");
        }
        apivVar.c = strA;
        apivVar.d = this.b;
        int i = this.c;
        if (i == defpackage.aooh.T(str)) {
            i = -1;
        }
        apivVar.e = i;
        java.util.List list = apivVar.f;
        list.clear();
        list.addAll(h());
        apivVar.b(c());
        if (this.g == null) {
            strSubstring = null;
        } else {
            java.lang.String str2 = this.h;
            strSubstring = str2.substring(defpackage.aoov.M(str2, '#', 0) + 1);
            defpackage.aooh.e(strSubstring, "substring(...)");
        }
        apivVar.h = strSubstring;
        java.lang.String str3 = apivVar.d;
        apivVar.d = str3 != null ? new defpackage.aorg("[\"<>^`{|}]").b(str3, "") : null;
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            list.set(i2, defpackage.apof.b((java.lang.String) list.get(i2), 0, 0, "[]", true, true, false, false, 99));
        }
        java.util.List list2 = apivVar.g;
        if (list2 != null) {
            int size2 = list2.size();
            for (int i3 = 0; i3 < size2; i3++) {
                java.lang.String str4 = (java.lang.String) list2.get(i3);
                list2.set(i3, str4 != null ? defpackage.apof.b(str4, 0, 0, "\\^`{|}", true, true, true, false, 67) : null);
            }
        }
        java.lang.String str5 = apivVar.h;
        apivVar.h = str5 != null ? defpackage.apof.b(str5, 0, 0, " \"#<>\\^`{|}", true, true, false, true, 35) : null;
        java.lang.String string = apivVar.toString();
        try {
            return new java.net.URI(string);
        } catch (java.net.URISyntaxException e) {
            try {
                java.net.URI uriCreate = java.net.URI.create(new defpackage.aorg("[\\u0000-\\u001F\\u007F-\\u009F\\p{javaWhitespace}]").b(string, ""));
                if (uriCreate != null) {
                    return uriCreate;
                }
                defpackage.aooh.g();
                return null;
            } catch (java.lang.Exception unused) {
                throw new java.lang.RuntimeException(e);
            }
        }
    }

    public final java.net.URL g() {
        try {
            return new java.net.URL(this.h);
        } catch (java.net.MalformedURLException e) {
            throw new java.lang.RuntimeException(e);
        }
    }

    public final java.util.List h() {
        int length = this.a.length() + 3;
        java.lang.String str = this.h;
        int iM = defpackage.aoov.M(str, '/', length);
        int i = defpackage.apjv.a;
        int i2 = iM;
        while (true) {
            int length2 = str.length();
            if (i2 >= length2) {
                i2 = length2;
                break;
            }
            if (defpackage.aoov.M("?#", str.charAt(i2), 0) >= 0) {
                break;
            }
            i2++;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        while (iM < i2) {
            int i3 = iM + 1;
            int i4 = i3;
            while (true) {
                if (i4 >= i2) {
                    i4 = i2;
                    break;
                }
                if (str.charAt(i4) == '/') {
                    break;
                }
                i4++;
            }
            java.lang.String strSubstring = str.substring(i3, i4);
            defpackage.aooh.e(strSubstring, "substring(...)");
            arrayList.add(strSubstring);
            iM = i4;
        }
        return arrayList;
    }

    public final int hashCode() {
        return this.h.hashCode();
    }

    public final defpackage.apiv i(java.lang.String str) {
        try {
            defpackage.apiv apivVar = new defpackage.apiv();
            apivVar.c(this, str);
            return apivVar;
        } catch (java.lang.IllegalArgumentException unused) {
            return null;
        }
    }

    public final boolean j() {
        return defpackage.aooh.n(this.a, "https");
    }

    public final java.lang.String toString() {
        return this.h;
    }
}
