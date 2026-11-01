package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class apiv {
    public java.lang.String a;
    public java.lang.String d;
    public java.util.List g;
    public java.lang.String h;
    public java.lang.String b = "";
    public java.lang.String c = "";
    public int e = -1;
    public final java.util.List f = new java.util.ArrayList(new defpackage.aojv(new java.lang.String[]{""}, true));

    private final int d() {
        int i = this.e;
        if (i != -1) {
            return i;
        }
        java.lang.String str = this.a;
        if (str == null) {
            defpackage.aooh.g();
        }
        return defpackage.aooh.T(str);
    }

    private static final java.util.List e(java.lang.String str) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int i = 0;
        while (i <= str.length()) {
            int iM = defpackage.aoov.M(str, '&', i);
            if (iM == -1) {
                iM = str.length();
            }
            int iM2 = defpackage.aoov.M(str, '=', i);
            if (iM2 == -1 || iM2 > iM) {
                java.lang.String strSubstring = str.substring(i, iM);
                defpackage.aooh.e(strSubstring, "substring(...)");
                arrayList.add(strSubstring);
                arrayList.add(null);
            } else {
                java.lang.String strSubstring2 = str.substring(i, iM2);
                defpackage.aooh.e(strSubstring2, "substring(...)");
                arrayList.add(strSubstring2);
                java.lang.String strSubstring3 = str.substring(iM2 + 1, iM);
                defpackage.aooh.e(strSubstring3, "substring(...)");
                arrayList.add(strSubstring3);
            }
            i = iM + 1;
        }
        return arrayList;
    }

    public final defpackage.apiw a() {
        java.util.ArrayList arrayList;
        java.lang.String str = this.a;
        if (str == null) {
            throw new java.lang.IllegalStateException("scheme == null");
        }
        java.lang.String strC = defpackage.apof.c(this.b, 0, 0, false, 7);
        java.lang.String strC2 = defpackage.apof.c(this.c, 0, 0, false, 7);
        java.lang.String str2 = this.d;
        if (str2 == null) {
            throw new java.lang.IllegalStateException("host == null");
        }
        int iD = d();
        java.util.List list = this.f;
        java.util.ArrayList arrayList2 = new java.util.ArrayList(list.size());
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList2.add(defpackage.apof.c((java.lang.String) it.next(), 0, 0, false, 7));
        }
        java.util.List<java.lang.String> list2 = this.g;
        if (list2 != null) {
            arrayList = new java.util.ArrayList(list2.size());
            for (java.lang.String str3 : list2) {
                arrayList.add(str3 != null ? defpackage.apof.c(str3, 0, 0, true, 3) : null);
            }
        } else {
            arrayList = null;
        }
        java.lang.String str4 = this.h;
        return new defpackage.apiw(str, strC, strC2, str2, iD, arrayList, str4 != null ? defpackage.apof.c(str4, 0, 0, false, 7) : null, toString());
    }

    public final void b(java.lang.String str) {
        java.lang.String strB;
        java.util.List listE = null;
        if (str != null && (strB = defpackage.apof.b(str, 0, 0, " \"'<>#", true, false, true, false, 83)) != null) {
            listE = e(strB);
        }
        this.g = listE;
    }

    /* JADX WARN: Code duplicated, block: B:102:0x01e0  */
    /* JADX WARN: Code duplicated, block: B:107:0x0200  */
    /* JADX WARN: Code duplicated, block: B:110:0x0206  */
    /* JADX WARN: Code duplicated, block: B:112:0x0224  */
    /* JADX WARN: Code duplicated, block: B:114:0x0232  */
    /* JADX WARN: Code duplicated, block: B:166:0x0354  */
    /* JADX WARN: Code duplicated, block: B:201:0x01d7 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:202:0x01d5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:203:0x01d2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:204:0x01d2 A[EDGE_INSN: B:204:0x01d2->B:97:0x01d2 BREAK  A[LOOP:5: B:93:0x01c6->B:206:?], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:65:0x010d  */
    /* JADX WARN: Code duplicated, block: B:89:0x01bc  */
    /* JADX WARN: Code duplicated, block: B:91:0x01c2  */
    /* JADX WARN: Code duplicated, block: B:93:0x01c6 A[LOOP:5: B:93:0x01c6->B:206:?, LOOP_START, PHI: r2
      0x01c6: PHI (r2v16 int) = (r2v5 int), (r2v17 int) binds: [B:92:0x01c4, B:206:?] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:95:0x01ca  */
    /* JADX WARN: Instruction removed from duplicated block: B:110:0x0206, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:166:0x0354, please report this as an issue */
    public final void c(defpackage.apiw apiwVar, java.lang.String str) {
        int i;
        char c;
        char c2;
        int i2;
        int iB;
        int i3;
        boolean z;
        java.lang.String str2;
        int i4;
        int i5;
        int i6;
        java.lang.String str3;
        int i7;
        char cCharAt;
        char cCharAt2;
        int i8;
        java.lang.String str4;
        boolean z2;
        char c3;
        char cCharAt3;
        char cCharAt4;
        java.lang.String str5 = str;
        if (str5 == null) {
            defpackage.aooh.i("input");
        }
        int i9 = defpackage.apjv.a;
        int iD = defpackage.apjv.d(str5, 0, str5.length());
        int iE = defpackage.apjv.e(str5, iD, str5.length());
        if (iE - iD >= 2 && (((cCharAt4 = str5.charAt(iD)) >= 'a' && cCharAt4 <= 'z') || (cCharAt4 >= 'A' && cCharAt4 <= 'Z'))) {
            i = iD + 1;
            while (true) {
                if (i < iE) {
                    char cCharAt5 = str5.charAt(i);
                    if ((cCharAt5 < 'a' || cCharAt5 >= '{') && ((cCharAt5 < 'A' || cCharAt5 >= '[') && !((cCharAt5 >= '0' && cCharAt5 < ':') || cCharAt5 == '+' || cCharAt5 == '-' || cCharAt5 == '.'))) {
                        if (cCharAt5 == ':') {
                            break;
                        } else {
                            break;
                        }
                    }
                    i++;
                }
                i = -1;
                break;
            }
        } else {
            i = -1;
            break;
        }
        if (i != -1) {
            if (defpackage.aoov.u(str5, "https:", iD, true)) {
                this.a = "https";
                iD += 6;
            } else {
                if (!defpackage.aoov.u(str5, "http:", iD, true)) {
                    java.lang.String strSubstring = str5.substring(0, i);
                    defpackage.aooh.e(strSubstring, "substring(...)");
                    throw new java.lang.IllegalArgumentException("Expected URL scheme 'http' or 'https' but was '" + strSubstring + '\'');
                }
                this.a = "http";
                iD += 5;
            }
        } else {
            if (apiwVar == null) {
                throw new java.lang.IllegalArgumentException("Expected URL scheme 'http' or 'https' but no scheme was found for ".concat(java.lang.String.valueOf(str5.length() > 6 ? java.lang.String.valueOf(defpackage.aoov.aa(str5, 6)).concat("...") : str5)));
            }
            this.a = apiwVar.a;
        }
        int i10 = iD;
        int i11 = 0;
        while (true) {
            c = '\\';
            c2 = '/';
            if (i10 >= iE || !((cCharAt3 = str5.charAt(i10)) == '/' || cCharAt3 == '\\')) {
                break;
            }
            i11++;
            i10++;
        }
        char c4 = '?';
        char c5 = '#';
        if (i11 >= 2 || apiwVar == null) {
            i2 = iD + i11;
            boolean z3 = false;
            boolean z4 = false;
            while (true) {
                iB = defpackage.apjv.b(str5, "@/\\?#", i2, iE);
                if (iB == iE || (cCharAt2 = str5.charAt(iB)) == c5 || cCharAt2 == c2 || cCharAt2 == c || cCharAt2 == c4) {
                    break;
                }
                if (cCharAt2 == '@') {
                    if (z3) {
                        int i12 = i2;
                        i8 = iB;
                        str4 = str;
                        this.c = this.c + "%40" + defpackage.apof.b(str4, i12, i8, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, 112);
                    } else {
                        int i13 = i2;
                        int iA = defpackage.apjv.a(str5, ':', i13, iB);
                        java.lang.String strB = defpackage.apof.b(str, i13, iA, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, 112);
                        if (z4) {
                            strB = this.b + "%40" + strB;
                        }
                        this.b = strB;
                        if (iA != iB) {
                            int i14 = iA + 1;
                            i8 = iB;
                            this.c = defpackage.apof.b(str, i14, i8, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, 112);
                            z2 = true;
                        } else {
                            i8 = iB;
                            z2 = z3;
                        }
                        str4 = str;
                        z3 = z2;
                        z4 = true;
                    }
                    i2 = i8 + 1;
                    str5 = str4;
                    c4 = '?';
                    c5 = '#';
                    c = '\\';
                    c2 = '/';
                }
            }
            i3 = i2;
            z = true;
            iD = iB;
            str2 = str5;
            i4 = i3;
            while (true) {
                if (i4 >= iD) {
                    cCharAt = str2.charAt(i4);
                    if (cCharAt != ':') {
                        i5 = i4;
                        break;
                    }
                    if (cCharAt == '[') {
                        do {
                            i4++;
                            if (i4 < iD) {
                                break;
                            }
                        } while (str2.charAt(i4) != ']');
                    }
                    i4++;
                } else {
                    i5 = iD;
                    break;
                }
            }
            i6 = i5 + 1;
            if (i6 < iD) {
                this.d = defpackage.apju.a(defpackage.apof.c(str2, i3, i5, false, 4));
                try {
                    i7 = java.lang.Integer.parseInt(defpackage.apof.b(str2, i6, iD, "", false, false, false, false, 120));
                    if (i7 > 0 || i7 >= 65536) {
                        i7 = -1;
                    }
                } catch (java.lang.NumberFormatException unused) {
                }
                this.e = i7;
                if (i7 == -1) {
                    java.lang.String strSubstring2 = str2.substring(i6, iD);
                    defpackage.aooh.e(strSubstring2, "substring(...)");
                    throw new java.lang.IllegalArgumentException("Invalid URL port: \"" + strSubstring2 + '\"');
                }
            } else {
                this.d = defpackage.apju.a(defpackage.apof.c(str2, i3, i5, false, 4));
                str3 = this.a;
                if (str3 == null) {
                    defpackage.aooh.g();
                }
                this.e = defpackage.aooh.T(str3);
            }
            if (this.d == null) {
                java.lang.String strSubstring3 = str2.substring(i3, i5);
                defpackage.aooh.e(strSubstring3, "substring(...)");
                throw new java.lang.IllegalArgumentException("Invalid URL host: \"" + strSubstring3 + '\"');
            }
        } else if (defpackage.aooh.n(apiwVar.a, this.a)) {
            this.b = apiwVar.d();
            this.c = apiwVar.a();
            this.d = apiwVar.b;
            this.e = apiwVar.c;
            java.util.List list = this.f;
            list.clear();
            list.addAll(apiwVar.h());
            if (iD == iE || str5.charAt(iD) == '#') {
                b(apiwVar.c());
            }
            str2 = str5;
            z = true;
        } else {
            i2 = iD + i11;
            boolean z5 = false;
            boolean z6 = false;
            while (true) {
                iB = defpackage.apjv.b(str5, "@/\\?#", i2, iE);
                if (iB == iE) {
                    break;
                } else {
                    break;
                }
            }
            i3 = i2;
            z = true;
            iD = iB;
            str2 = str5;
            i4 = i3;
            while (true) {
                if (i4 >= iD) {
                    cCharAt = str2.charAt(i4);
                    if (cCharAt != ':') {
                        i5 = i4;
                        break;
                    }
                    if (cCharAt == '[') {
                        do {
                            i4++;
                            if (i4 < iD) {
                                break;
                                break;
                            }
                        } while (str2.charAt(i4) != ']');
                    }
                    i4++;
                } else {
                    i5 = iD;
                    break;
                }
            }
            i6 = i5 + 1;
            if (i6 < iD) {
                this.d = defpackage.apju.a(defpackage.apof.c(str2, i3, i5, false, 4));
                i7 = java.lang.Integer.parseInt(defpackage.apof.b(str2, i6, iD, "", false, false, false, false, 120));
                if (i7 > 0) {
                    i7 = -1;
                } else {
                    i7 = -1;
                }
                this.e = i7;
                if (i7 == -1) {
                    java.lang.String strSubstring4 = str2.substring(i6, iD);
                    defpackage.aooh.e(strSubstring4, "substring(...)");
                    throw new java.lang.IllegalArgumentException("Invalid URL port: \"" + strSubstring4 + '\"');
                }
            } else {
                this.d = defpackage.apju.a(defpackage.apof.c(str2, i3, i5, false, 4));
                str3 = this.a;
                if (str3 == null) {
                    defpackage.aooh.g();
                }
                this.e = defpackage.aooh.T(str3);
            }
            if (this.d == null) {
                java.lang.String strSubstring5 = str2.substring(i3, i5);
                defpackage.aooh.e(strSubstring5, "substring(...)");
                throw new java.lang.IllegalArgumentException("Invalid URL host: \"" + strSubstring5 + '\"');
            }
        }
        int iB2 = defpackage.apjv.b(str2, "?#", iD, iE);
        if (iD != iB2) {
            char cCharAt6 = str2.charAt(iD);
            if (cCharAt6 == '/' || cCharAt6 == '\\') {
                java.util.List list2 = this.f;
                list2.clear();
                list2.add("");
                iD++;
            } else {
                java.util.List list3 = this.f;
                list3.set(list3.size() - 1, "");
            }
            int i15 = iD;
            while (i15 < iB2) {
                int iB3 = defpackage.apjv.b(str2, "/\\", i15, iB2);
                java.lang.String strB2 = defpackage.apof.b(str2, i15, iB3, " \"<>^`{}|/\\?#", true, false, false, false, 112);
                if (!defpackage.aooh.n(strB2, ".")) {
                    boolean z7 = z;
                    if (!defpackage.aoov.s(strB2, "%2e", z7)) {
                        if (defpackage.aooh.n(strB2, "..") || defpackage.aoov.s(strB2, "%2e.", z7) || defpackage.aoov.s(strB2, ".%2e", z7) || defpackage.aoov.s(strB2, "%2e%2e", z7)) {
                            java.util.List list4 = this.f;
                            if (((java.lang.String) list4.remove(list4.size() - 1)).length() != 0 || list4.isEmpty()) {
                                list4.add("");
                            } else {
                                list4.set(list4.size() - 1, "");
                            }
                        } else {
                            java.util.List list5 = this.f;
                            if (((java.lang.CharSequence) list5.get(list5.size() - 1)).length() == 0) {
                                list5.set(list5.size() - 1, strB2);
                            } else {
                                list5.add(strB2);
                            }
                            if (iB3 < iB2) {
                                list5.add("");
                            }
                        }
                    }
                }
                i15 = iB3 < iB2 ? iB3 + 1 : iB3;
                z = true;
            }
        }
        if (iB2 >= iE || str2.charAt(iB2) != '?') {
            c3 = '#';
        } else {
            c3 = '#';
            int iA2 = defpackage.apjv.a(str2, '#', iB2, iE);
            this.g = e(defpackage.apof.b(str2, iB2 + 1, iA2, " \"'<>#", true, false, true, false, 80));
            iB2 = iA2;
        }
        if (iB2 >= iE || str2.charAt(iB2) != c3) {
            return;
        }
        this.h = defpackage.apof.b(str2, iB2 + 1, iE, "", true, false, false, true, 48);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        java.lang.String str = this.a;
        if (str != null) {
            sb.append(str);
            sb.append("://");
        } else {
            sb.append("//");
        }
        if (this.b.length() > 0 || this.c.length() > 0) {
            sb.append(this.b);
            if (this.c.length() > 0) {
                sb.append(':');
                sb.append(this.c);
            }
            sb.append('@');
        }
        java.lang.String str2 = this.d;
        if (str2 != null) {
            if (defpackage.aoov.M(str2, ':', 0) >= 0) {
                sb.append('[');
                sb.append(this.d);
                sb.append(']');
            } else {
                sb.append(this.d);
            }
        }
        if (this.e != -1 || this.a != null) {
            int iD = d();
            java.lang.String str3 = this.a;
            if (str3 == null || iD != defpackage.aooh.T(str3)) {
                sb.append(':');
                sb.append(iD);
            }
        }
        java.util.List list = this.f;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            sb.append('/');
            sb.append((java.lang.String) list.get(i));
        }
        if (this.g != null) {
            sb.append('?');
            java.util.List list2 = this.g;
            if (list2 == null) {
                defpackage.aooh.g();
            }
            defpackage.aopo aopoVarB = defpackage.aooc.B(defpackage.aooc.C(0, list2.size()), 2);
            int i2 = aopoVarB.a;
            int i3 = aopoVarB.b;
            int i4 = aopoVarB.c;
            if ((i4 > 0 && i2 <= i3) || (i4 < 0 && i3 <= i2)) {
                while (true) {
                    java.lang.String str4 = (java.lang.String) list2.get(i2);
                    java.lang.String str5 = (java.lang.String) list2.get(i2 + 1);
                    if (i2 > 0) {
                        sb.append('&');
                    }
                    sb.append(str4);
                    if (str5 != null) {
                        sb.append('=');
                        sb.append(str5);
                    }
                    if (i2 == i3) {
                        break;
                    }
                    i2 += i4;
                }
            }
        }
        if (this.h != null) {
            sb.append('#');
            sb.append(this.h);
        }
        return sb.toString();
    }
}
