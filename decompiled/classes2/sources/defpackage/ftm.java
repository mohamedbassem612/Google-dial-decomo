package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class ftm {
    public static final java.util.regex.Pattern a = java.util.regex.Pattern.compile("^(\\S+)\\s+-->\\s+(\\S+)((?:.|\\f)*+)?$");
    private static final java.util.regex.Pattern b = java.util.regex.Pattern.compile("(\\S+?):(\\S+)");
    private static final java.util.Map c;
    private static final java.util.Map d;

    static {
        java.util.HashMap map = new java.util.HashMap();
        map.put("white", -1);
        map.put("lime", -16711936);
        map.put("cyan", -16711681);
        map.put("red", -65536);
        map.put("yellow", -256);
        map.put("magenta", -65281);
        map.put("blue", -16776961);
        map.put("black", -16777216);
        c = j$.util.DesugarCollections.unmodifiableMap(map);
        java.util.HashMap map2 = new java.util.HashMap();
        map2.put("bg_white", -1);
        map2.put("bg_lime", -16711936);
        map2.put("bg_cyan", -16711681);
        map2.put("bg_red", -65536);
        map2.put("bg_yellow", -256);
        map2.put("bg_magenta", -65281);
        map2.put("bg_blue", -16776961);
        map2.put("bg_black", -16777216);
        d = j$.util.DesugarCollections.unmodifiableMap(map2);
    }

    /* JADX WARN: Code duplicated, block: B:120:0x020c  */
    /* JADX WARN: Code duplicated, block: B:92:0x01a3 A[EDGE_INSN: B:135:0x01a3->B:92:0x01a3 BREAK  A[LOOP:1: B:73:0x0125->B:137:?]] */
    static android.text.SpannedString a(java.lang.String str, java.lang.String str2, java.util.List list) {
        int i;
        int i2;
        int i3;
        android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder();
        java.util.ArrayDeque arrayDeque = new java.util.ArrayDeque();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int i4 = 0;
        int i5 = 0;
        while (true) {
            java.lang.String strTrim = "";
            if (i5 >= str2.length()) {
                break;
            }
            int i6 = i5 + 1;
            char cCharAt = str2.charAt(i5);
            if (cCharAt == '&') {
                int iIndexOf = str2.indexOf(59, i6);
                int iIndexOf2 = str2.indexOf(32, i6);
                if (iIndexOf == -1) {
                    iIndexOf = iIndexOf2;
                } else if (iIndexOf2 != -1) {
                    iIndexOf = java.lang.Math.min(iIndexOf, iIndexOf2);
                }
                if (iIndexOf != -1) {
                    java.lang.String strSubstring = str2.substring(i6, iIndexOf);
                    int iHashCode = strSubstring.hashCode();
                    if (iHashCode != 3309) {
                        if (iHashCode != 3464) {
                            if (iHashCode != 96708) {
                                if (iHashCode == 3374865 && strSubstring.equals("nbsp")) {
                                    spannableStringBuilder.append(' ');
                                } else {
                                    defpackage.etr.f("WebvttCueParser", a.bk(strSubstring, "ignoring unsupported entity: '&", ";'"));
                                }
                            } else if (strSubstring.equals("amp")) {
                                spannableStringBuilder.append('&');
                            } else {
                                defpackage.etr.f("WebvttCueParser", a.bk(strSubstring, "ignoring unsupported entity: '&", ";'"));
                            }
                        } else if (strSubstring.equals("lt")) {
                            spannableStringBuilder.append('<');
                        } else {
                            defpackage.etr.f("WebvttCueParser", a.bk(strSubstring, "ignoring unsupported entity: '&", ";'"));
                        }
                    } else if (strSubstring.equals("gt")) {
                        spannableStringBuilder.append('>');
                    } else {
                        defpackage.etr.f("WebvttCueParser", a.bk(strSubstring, "ignoring unsupported entity: '&", ";'"));
                    }
                    if (iIndexOf == iIndexOf2) {
                        spannableStringBuilder.append((java.lang.CharSequence) " ");
                    }
                    i5 = iIndexOf + 1;
                } else {
                    spannableStringBuilder.append(cCharAt);
                }
                i4 = 0;
            } else if (cCharAt != '<') {
                spannableStringBuilder.append(cCharAt);
            } else if (i6 < str2.length()) {
                char cCharAt2 = str2.charAt(i6);
                int iIndexOf3 = str2.indexOf(62, i6);
                int length = iIndexOf3 == -1 ? str2.length() : iIndexOf3 + 1;
                int i7 = length - 2;
                if (str2.charAt(i7) == '/') {
                    i2 = i4;
                    i = 1;
                } else {
                    i = i4;
                    i2 = i;
                }
                int i8 = i5 + (cCharAt2 == '/' ? 2 : 1);
                if (i == 0) {
                    i7 = length - 1;
                }
                java.lang.String strSubstring2 = str2.substring(i8, i7);
                if (strSubstring2.trim().isEmpty()) {
                    i3 = i2;
                } else {
                    java.lang.String strTrim2 = strSubstring2.trim();
                    ahvr.bM(!strTrim2.isEmpty());
                    java.lang.String str3 = eum.a;
                    java.lang.String str4 = strTrim2.split("[ \\.]", 2)[i2];
                    int iHashCode2 = str4.hashCode();
                    if (iHashCode2 == 98 ? !str4.equals("b") : iHashCode2 == 99 ? !str4.equals("c") : iHashCode2 == 105 ? !str4.equals("i") : iHashCode2 == 3650 ? !str4.equals("rt") : iHashCode2 == 3314158 ? !str4.equals("lang") : iHashCode2 == 3511770 ? !str4.equals("ruby") : iHashCode2 == 117 ? !str4.equals("u") : !(iHashCode2 == 118 && str4.equals("v"))) {
                        i3 = i2;
                    } else {
                        if (cCharAt2 == '/') {
                            while (!arrayDeque.isEmpty()) {
                                defpackage.adss adssVar = (defpackage.adss) arrayDeque.pop();
                                f(str, adssVar, arrayList, spannableStringBuilder, list);
                                if (arrayDeque.isEmpty()) {
                                    arrayList.clear();
                                } else {
                                    arrayList.add(new defpackage.ftj(adssVar, spannableStringBuilder.length()));
                                }
                                if (((java.lang.String) adssVar.c).equals(str4)) {
                                    break;
                                }
                            }
                        } else if (i == 0) {
                            int length2 = spannableStringBuilder.length();
                            java.lang.String strTrim3 = strSubstring2.trim();
                            ahvr.bM(!strTrim3.isEmpty());
                            int iIndexOf4 = strTrim3.indexOf(" ");
                            if (iIndexOf4 == -1) {
                                i3 = i2;
                            } else {
                                strTrim = strTrim3.substring(iIndexOf4).trim();
                                i3 = i2;
                                strTrim3 = strTrim3.substring(i3, iIndexOf4);
                            }
                            java.lang.String[] strArrSplit = strTrim3.split("\\.", -1);
                            java.lang.String str5 = strArrSplit[i3];
                            java.util.HashSet hashSet = new java.util.HashSet();
                            for (int i9 = 1; i9 < strArrSplit.length; i9++) {
                                hashSet.add(strArrSplit[i9]);
                            }
                            arrayDeque.push(new defpackage.adss(str5, length2, strTrim, hashSet));
                        }
                        i3 = i2;
                    }
                }
                i5 = length;
                i4 = i3;
            }
            i5 = i6;
            i4 = 0;
        }
        while (!arrayDeque.isEmpty()) {
            f(str, (defpackage.adss) arrayDeque.pop(), arrayList, spannableStringBuilder, list);
        }
        f(str, new defpackage.adss("", i4, "", java.util.Collections.EMPTY_SET), java.util.Collections.EMPTY_LIST, spannableStringBuilder, list);
        return android.text.SpannedString.valueOf(spannableStringBuilder);
    }

    public static defpackage.fti b(java.lang.String str, java.util.regex.Matcher matcher, defpackage.etx etxVar, java.util.List list) {
        defpackage.ftl ftlVar = new defpackage.ftl();
        try {
            java.lang.String strGroup = matcher.group(1);
            ahvr.ci(strGroup);
            ftlVar.a = defpackage.fto.b(strGroup);
            java.lang.String strGroup2 = matcher.group(2);
            ahvr.ci(strGroup2);
            ftlVar.b = defpackage.fto.b(strGroup2);
            java.lang.String strGroup3 = matcher.group(3);
            ahvr.ci(strGroup3);
            c(strGroup3, ftlVar);
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            java.lang.String strZ = etxVar.z();
            while (!android.text.TextUtils.isEmpty(strZ)) {
                if (sb.length() > 0) {
                    sb.append('\n');
                }
                sb.append(strZ.trim());
                strZ = etxVar.z();
            }
            ftlVar.c = a(str, sb.toString(), list);
            return new defpackage.fti(ftlVar.a().a(), ftlVar.a, ftlVar.b);
        } catch (java.lang.IllegalArgumentException unused) {
            defpackage.etr.f("WebvttCueParser", "Skipping cue with bad header: ".concat(java.lang.String.valueOf(matcher.group())));
            return null;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:30:0x009d A[Catch: NumberFormatException -> 0x01b1, TRY_ENTER, TryCatch #0 {NumberFormatException -> 0x01b1, blocks: (B:6:0x0022, B:9:0x003a, B:11:0x0042, B:13:0x004a, B:15:0x0052, B:16:0x0059, B:18:0x0061, B:19:0x007e, B:31:0x00a7, B:30:0x009d, B:32:0x00ab, B:34:0x00b1, B:56:0x00fb, B:55:0x00ef, B:57:0x0101, B:58:0x0109, B:81:0x014c, B:79:0x0142, B:82:0x0150, B:84:0x0156, B:100:0x018e, B:99:0x0183, B:101:0x0194, B:103:0x019c, B:104:0x01a6), top: B:108:0x0022 }] */
    /* JADX WARN: Code duplicated, block: B:48:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:54:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:55:0x00ef A[Catch: NumberFormatException -> 0x01b1, TRY_ENTER, TryCatch #0 {NumberFormatException -> 0x01b1, blocks: (B:6:0x0022, B:9:0x003a, B:11:0x0042, B:13:0x004a, B:15:0x0052, B:16:0x0059, B:18:0x0061, B:19:0x007e, B:31:0x00a7, B:30:0x009d, B:32:0x00ab, B:34:0x00b1, B:56:0x00fb, B:55:0x00ef, B:57:0x0101, B:58:0x0109, B:81:0x014c, B:79:0x0142, B:82:0x0150, B:84:0x0156, B:100:0x018e, B:99:0x0183, B:101:0x0194, B:103:0x019c, B:104:0x01a6), top: B:108:0x0022 }] */
    /* JADX WARN: Code duplicated, block: B:79:0x0142 A[Catch: NumberFormatException -> 0x01b1, TRY_ENTER, TryCatch #0 {NumberFormatException -> 0x01b1, blocks: (B:6:0x0022, B:9:0x003a, B:11:0x0042, B:13:0x004a, B:15:0x0052, B:16:0x0059, B:18:0x0061, B:19:0x007e, B:31:0x00a7, B:30:0x009d, B:32:0x00ab, B:34:0x00b1, B:56:0x00fb, B:55:0x00ef, B:57:0x0101, B:58:0x0109, B:81:0x014c, B:79:0x0142, B:82:0x0150, B:84:0x0156, B:100:0x018e, B:99:0x0183, B:101:0x0194, B:103:0x019c, B:104:0x01a6), top: B:108:0x0022 }] */
    /* JADX WARN: Code duplicated, block: B:98:0x0181  */
    /* JADX WARN: Code duplicated, block: B:99:0x0183 A[Catch: NumberFormatException -> 0x01b1, TRY_ENTER, TryCatch #0 {NumberFormatException -> 0x01b1, blocks: (B:6:0x0022, B:9:0x003a, B:11:0x0042, B:13:0x004a, B:15:0x0052, B:16:0x0059, B:18:0x0061, B:19:0x007e, B:31:0x00a7, B:30:0x009d, B:32:0x00ab, B:34:0x00b1, B:56:0x00fb, B:55:0x00ef, B:57:0x0101, B:58:0x0109, B:81:0x014c, B:79:0x0142, B:82:0x0150, B:84:0x0156, B:100:0x018e, B:99:0x0183, B:101:0x0194, B:103:0x019c, B:104:0x01a6), top: B:108:0x0022 }] */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0115, code lost:
    
        if (r6.equals("start") != false) goto L81;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void c(java.lang.String r16, defpackage.ftl r17) {
        /*
            Method dump skipped, instruction units count: 524
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ftm.c(java.lang.String, ftl):void");
    }

    private static int d(java.util.List list, java.lang.String str, defpackage.adss adssVar) {
        java.util.List listE = e(list, str, adssVar);
        for (int i = 0; i < listE.size(); i++) {
            int i2 = ((defpackage.ftk) listE.get(i)).b.o;
            if (i2 != -1) {
                return i2;
            }
        }
        return -1;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x006f  */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.CharSequence, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, java.util.Set] */
    private static java.util.List e(java.util.List list, java.lang.String str, defpackage.adss adssVar) {
        int size;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (int i = 0; i < list.size(); i++) {
            defpackage.fth fthVar = (defpackage.fth) list.get(i);
            ?? r4 = adssVar.c;
            ?? r5 = adssVar.d;
            java.lang.Object obj = adssVar.b;
            if (!fthVar.a.isEmpty() || !fthVar.b.isEmpty() || !fthVar.c.isEmpty() || !fthVar.d.isEmpty()) {
                int iB = defpackage.fth.b(defpackage.fth.b(defpackage.fth.b(0, fthVar.a, str, 1073741824), fthVar.b, (java.lang.String) r4, 2), fthVar.d, (java.lang.String) obj, 4);
                if (iB == -1 || !r5.containsAll(fthVar.c)) {
                    size = 0;
                } else {
                    size = iB + (fthVar.c.size() << 2);
                }
            } else if (android.text.TextUtils.isEmpty(r4)) {
                size = 1;
            } else {
                size = 0;
            }
            if (size > 0) {
                arrayList.add(new defpackage.ftk(size, fthVar));
            }
        }
        j$.util.List.-EL.sort(arrayList, (java.util.Comparator) null);
        return arrayList;
    }

    /* JADX WARN: Type inference failed for: r6v12, types: [java.lang.Object, java.util.Set] */
    private static void f(java.lang.String str, defpackage.adss adssVar, java.util.List list, android.text.SpannableStringBuilder spannableStringBuilder, java.util.List list2) {
        int i = adssVar.a;
        int length = spannableStringBuilder.length();
        java.lang.String str2 = (java.lang.String) adssVar.c;
        int iHashCode = str2.hashCode();
        int i2 = -1;
        if (iHashCode != 0) {
            if (iHashCode != 105) {
                if (iHashCode != 3314158) {
                    if (iHashCode == 3511770) {
                        if (!str2.equals("ruby")) {
                            return;
                        }
                        int iD = d(list2, str, adssVar);
                        java.util.ArrayList arrayList = new java.util.ArrayList(list.size());
                        arrayList.addAll(list);
                        j$.util.List.-EL.sort(arrayList, defpackage.ftj.a);
                        int i3 = i;
                        int i4 = 0;
                        int length2 = 0;
                        while (i4 < arrayList.size()) {
                            if ("rt".equals(((defpackage.ftj) arrayList.get(i4)).c.c)) {
                                defpackage.ftj ftjVar = (defpackage.ftj) arrayList.get(i4);
                                defpackage.adss adssVar2 = ftjVar.c;
                                int iD2 = d(list2, str, adssVar2);
                                if (iD2 == i2) {
                                    iD2 = iD != i2 ? iD : 1;
                                }
                                int i5 = adssVar2.a - length2;
                                int i6 = ftjVar.b - length2;
                                java.lang.CharSequence charSequenceSubSequence = spannableStringBuilder.subSequence(i5, i6);
                                spannableStringBuilder.delete(i5, i6);
                                spannableStringBuilder.setSpan(new defpackage.esw(charSequenceSubSequence.toString(), iD2), i3, i5, 33);
                                length2 += charSequenceSubSequence.length();
                                i3 = i5;
                            }
                            i4++;
                            i2 = -1;
                        }
                    } else if (iHashCode != 98) {
                        if (iHashCode == 99) {
                            if (!str2.equals("c")) {
                                return;
                            }
                            for (java.lang.String str3 : adssVar.d) {
                                java.util.Map map = c;
                                if (map.containsKey(str3)) {
                                    spannableStringBuilder.setSpan(new android.text.style.ForegroundColorSpan(((java.lang.Integer) map.get(str3)).intValue()), i, length, 33);
                                } else {
                                    java.util.Map map2 = d;
                                    if (map2.containsKey(str3)) {
                                        spannableStringBuilder.setSpan(new android.text.style.BackgroundColorSpan(((java.lang.Integer) map2.get(str3)).intValue()), i, length, 33);
                                    }
                                }
                            }
                        } else if (iHashCode != 117) {
                            if (iHashCode != 118 || !str2.equals("v")) {
                                return;
                            } else {
                                spannableStringBuilder.setSpan(new defpackage.esy((java.lang.String) adssVar.b), i, length, 33);
                            }
                        } else if (!str2.equals("u")) {
                            return;
                        } else {
                            spannableStringBuilder.setSpan(new android.text.style.UnderlineSpan(), i, length, 33);
                        }
                    } else if (!str2.equals("b")) {
                        return;
                    } else {
                        spannableStringBuilder.setSpan(new android.text.style.StyleSpan(1), i, length, 33);
                    }
                } else if (!str2.equals("lang")) {
                    return;
                }
            } else if (!str2.equals("i")) {
                return;
            } else {
                spannableStringBuilder.setSpan(new android.text.style.StyleSpan(2), i, length, 33);
            }
        } else if (!str2.equals("")) {
            return;
        }
        java.util.List listE = e(list2, str, adssVar);
        for (int i7 = 0; i7 < listE.size(); i7++) {
            defpackage.fth fthVar = ((defpackage.ftk) listE.get(i7)).b;
            if (fthVar != null) {
                if (fthVar.a() != -1) {
                    defpackage.hgt.aF(spannableStringBuilder, new android.text.style.StyleSpan(fthVar.a()), i, length);
                }
                if (fthVar.j == 1) {
                    spannableStringBuilder.setSpan(new android.text.style.UnderlineSpan(), i, length, 33);
                }
                if (fthVar.g) {
                    if (!fthVar.g) {
                        throw new java.lang.IllegalStateException("Font color not defined");
                    }
                    defpackage.hgt.aF(spannableStringBuilder, new android.text.style.ForegroundColorSpan(fthVar.f), i, length);
                }
                if (fthVar.i) {
                    if (!fthVar.i) {
                        throw new java.lang.IllegalStateException("Background color not defined.");
                    }
                    defpackage.hgt.aF(spannableStringBuilder, new android.text.style.BackgroundColorSpan(fthVar.h), i, length);
                }
                if (fthVar.e != null) {
                    defpackage.hgt.aF(spannableStringBuilder, new android.text.style.TypefaceSpan(fthVar.e), i, length);
                }
                int i8 = fthVar.m;
                if (i8 == 1) {
                    defpackage.hgt.aF(spannableStringBuilder, new android.text.style.AbsoluteSizeSpan((int) fthVar.n, true), i, length);
                } else if (i8 == 2) {
                    defpackage.hgt.aF(spannableStringBuilder, new android.text.style.RelativeSizeSpan(fthVar.n), i, length);
                } else if (i8 == 3) {
                    defpackage.hgt.aF(spannableStringBuilder, new android.text.style.RelativeSizeSpan(fthVar.n / 100.0f), i, length);
                }
                if (fthVar.p) {
                    spannableStringBuilder.setSpan(new defpackage.esv(), i, length, 33);
                }
            }
        }
    }
}
