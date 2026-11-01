package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class fsp implements defpackage.frt {
    private static final java.util.regex.Pattern a = java.util.regex.Pattern.compile("(?:(\\d+):)?(\\d+):(\\d+)[:.](\\d+)");
    private final boolean b;
    private final defpackage.fso c;
    private java.util.Map e;
    private float f = -3.4028235E38f;
    private float g = -3.4028235E38f;
    private final defpackage.etx d = new defpackage.etx();

    public fsp(java.util.List list) {
        if (list == null || list.isEmpty()) {
            this.b = false;
            this.c = null;
            return;
        }
        this.b = true;
        java.lang.String strH = eum.H((byte[]) list.get(0));
        ahvr.bM(strH.startsWith("Format:"));
        defpackage.fso fsoVarA = defpackage.fso.a(strH);
        ahvr.ci(fsoVarA);
        this.c = fsoVarA;
        g(new defpackage.etx((byte[]) list.get(1)), java.nio.charset.StandardCharsets.UTF_8);
    }

    private static float d(int i) {
        if (i == 0) {
            return 0.05f;
        }
        if (i != 1) {
            return i != 2 ? -3.4028235E38f : 0.95f;
        }
        return 0.5f;
    }

    private static int e(long j, java.util.List list, java.util.List list2) {
        int size = list.size();
        while (true) {
            size--;
            if (size < 0) {
                size = 0;
                break;
            }
            if (((java.lang.Long) list.get(size)).longValue() != j) {
                if (((java.lang.Long) list.get(size)).longValue() < j) {
                    size++;
                    break;
                }
            }
            return size;
        }
        list.add(size, java.lang.Long.valueOf(j));
        list2.add(size, size == 0 ? new java.util.ArrayList() : new java.util.ArrayList((java.util.Collection) list2.get(size - 1)));
        return size;
    }

    private static long f(java.lang.String str) {
        java.util.regex.Matcher matcher = a.matcher(str.trim());
        if (!matcher.matches()) {
            return -9223372036854775807L;
        }
        java.lang.String strGroup = matcher.group(1);
        java.lang.String str2 = eum.a;
        long j = java.lang.Long.parseLong(strGroup) * 3600000000L;
        long j2 = java.lang.Long.parseLong(matcher.group(2)) * 60000000;
        return j + j2 + (java.lang.Long.parseLong(matcher.group(3)) * 1000000) + (java.lang.Long.parseLong(matcher.group(4)) * 10000);
    }

    /* JADX WARN: Code duplicated, block: B:143:0x0282  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private final void g(defpackage.etx etxVar, java.nio.charset.Charset charset) {
        int i;
        defpackage.fss fssVar;
        while (true) {
            java.lang.String strA = etxVar.A(charset);
            if (strA == null) {
                return;
            }
            int i2 = 91;
            char c = 2;
            if ("[Script Info]".equalsIgnoreCase(strA)) {
                while (true) {
                    java.lang.String strA2 = etxVar.A(charset);
                    if (strA2 == null || (etxVar.d() != 0 && etxVar.f(charset) == 91)) {
                        break;
                    }
                    java.lang.String[] strArrSplit = strA2.split(":");
                    if (strArrSplit.length == 2) {
                        java.lang.String strP = ahvr.p(strArrSplit[0].trim());
                        switch (strP.hashCode()) {
                            case 1879649548:
                                if (strP.equals("playresx")) {
                                    this.f = java.lang.Float.parseFloat(strArrSplit[1].trim());
                                }
                                break;
                            case 1879649549:
                                if (strP.equals("playresy")) {
                                    try {
                                        this.g = java.lang.Float.parseFloat(strArrSplit[1].trim());
                                    } catch (java.lang.NumberFormatException unused) {
                                    }
                                }
                                break;
                        }
                    }
                }
            } else if ("[V4+ Styles]".equalsIgnoreCase(strA)) {
                java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
                while (true) {
                    defpackage.fsq fsqVar = null;
                    while (true) {
                        java.lang.String strA3 = etxVar.A(charset);
                        if (strA3 != null && (etxVar.d() == 0 || etxVar.f(charset) != i2)) {
                            if (strA3.startsWith("Format:")) {
                                java.lang.String[] strArrSplit2 = android.text.TextUtils.split(strA3.substring(7), ",");
                                int i3 = 0;
                                int i4 = -1;
                                int i5 = -1;
                                int i6 = -1;
                                int i7 = -1;
                                int i8 = -1;
                                int i9 = -1;
                                int i10 = -1;
                                int i11 = -1;
                                int i12 = -1;
                                int i13 = -1;
                                while (true) {
                                    int length = strArrSplit2.length;
                                    if (i3 < length) {
                                        java.lang.String strP2 = ahvr.p(strArrSplit2[i3].trim());
                                        switch (strP2.hashCode()) {
                                            case -1178781136:
                                                if (strP2.equals("italic")) {
                                                    i10 = i3;
                                                }
                                                break;
                                            case -1026963764:
                                                if (strP2.equals("underline")) {
                                                    i11 = i3;
                                                }
                                                break;
                                            case -192095652:
                                                if (strP2.equals("strikeout")) {
                                                    i12 = i3;
                                                }
                                                break;
                                            case -70925746:
                                                if (strP2.equals("primarycolour")) {
                                                    i6 = i3;
                                                }
                                                break;
                                            case 3029637:
                                                if (strP2.equals("bold")) {
                                                    i9 = i3;
                                                }
                                                break;
                                            case 3373707:
                                                if (strP2.equals("name")) {
                                                    i4 = i3;
                                                }
                                                break;
                                            case 366554320:
                                                if (strP2.equals("fontsize")) {
                                                    i8 = i3;
                                                }
                                                break;
                                            case 767321349:
                                                if (strP2.equals("borderstyle")) {
                                                    i13 = i3;
                                                }
                                                break;
                                            case 1767875043:
                                                if (strP2.equals("alignment")) {
                                                    i5 = i3;
                                                }
                                                break;
                                            case 1988365454:
                                                if (strP2.equals("outlinecolour")) {
                                                    i7 = i3;
                                                }
                                                break;
                                        }
                                        i3++;
                                    } else if (i4 != -1) {
                                        fsqVar = new defpackage.fsq(i4, i5, i6, i7, i8, i9, i10, i11, i12, i13, length);
                                    }
                                }
                            } else {
                                if (strA3.startsWith("Style:")) {
                                    if (fsqVar == null) {
                                        defpackage.etr.f("SsaParser", "Skipping 'Style:' line before 'Format:' line: ".concat(strA3));
                                    } else {
                                        ahvr.bM(strA3.startsWith("Style:"));
                                        java.lang.String[] strArrSplit3 = android.text.TextUtils.split(strA3.substring(6), ",");
                                        int length2 = strArrSplit3.length;
                                        int i14 = fsqVar.k;
                                        if (length2 != i14) {
                                            java.lang.Integer numValueOf = java.lang.Integer.valueOf(i14);
                                            java.lang.Integer numValueOf2 = java.lang.Integer.valueOf(length2);
                                            java.lang.Object[] objArr = new java.lang.Object[3];
                                            objArr[0] = numValueOf;
                                            objArr[1] = numValueOf2;
                                            objArr[c] = strA3;
                                            defpackage.etr.f("SsaStyle", eum.G("Skipping malformed 'Style:' line (expected %s values, found %s): '%s'", objArr));
                                        } else {
                                            try {
                                                java.lang.String strTrim = strArrSplit3[fsqVar.a].trim();
                                                int i15 = fsqVar.b;
                                                int iA = i15 != -1 ? defpackage.fss.a(strArrSplit3[i15].trim()) : -1;
                                                int i16 = fsqVar.c;
                                                java.lang.Integer numB = i16 != -1 ? defpackage.fss.b(strArrSplit3[i16].trim()) : null;
                                                int i17 = fsqVar.d;
                                                java.lang.Integer numB2 = i17 != -1 ? defpackage.fss.b(strArrSplit3[i17].trim()) : null;
                                                int i18 = fsqVar.e;
                                                float f = -3.4028235E38f;
                                                if (i18 != -1) {
                                                    java.lang.String strTrim2 = strArrSplit3[i18].trim();
                                                    try {
                                                        f = java.lang.Float.parseFloat(strTrim2);
                                                    } catch (java.lang.NumberFormatException e) {
                                                        defpackage.etr.g("SsaStyle", a.bp((byte) 39, strTrim2, "Failed to parse font size: '"), e);
                                                    }
                                                }
                                                int i19 = fsqVar.f;
                                                boolean z = i19 != -1 && defpackage.fss.c(strArrSplit3[i19].trim());
                                                int i20 = fsqVar.g;
                                                boolean z2 = i20 != -1 && defpackage.fss.c(strArrSplit3[i20].trim());
                                                int i21 = fsqVar.h;
                                                boolean z3 = i21 != -1 && defpackage.fss.c(strArrSplit3[i21].trim());
                                                int i22 = fsqVar.i;
                                                boolean z4 = i22 != -1 && defpackage.fss.c(strArrSplit3[i22].trim());
                                                int i23 = fsqVar.j;
                                                if (i23 != -1) {
                                                    java.lang.String strTrim3 = strArrSplit3[i23].trim();
                                                    try {
                                                        int i24 = java.lang.Integer.parseInt(strTrim3.trim());
                                                        if (i24 == 1 || i24 == 3) {
                                                            i = i24;
                                                        } else {
                                                            defpackage.etr.f("SsaStyle", "Ignoring unknown BorderStyle: ".concat(java.lang.String.valueOf(strTrim3)));
                                                            i = -1;
                                                        }
                                                    } catch (java.lang.NumberFormatException unused2) {
                                                    }
                                                } else {
                                                    i = -1;
                                                }
                                                fssVar = new defpackage.fss(strTrim, iA, numB, numB2, f, z, z2, z3, z4, i);
                                            } catch (java.lang.RuntimeException e2) {
                                                defpackage.etr.g("SsaStyle", a.bp((byte) 39, strA3, "Skipping malformed 'Style:' line: '"), e2);
                                                fssVar = null;
                                            }
                                            if (fssVar != null) {
                                                linkedHashMap.put(fssVar.a, fssVar);
                                            }
                                        }
                                        fssVar = null;
                                        if (fssVar != null) {
                                            linkedHashMap.put(fssVar.a, fssVar);
                                        }
                                    }
                                }
                                i2 = 91;
                                c = 2;
                            }
                        }
                    }
                }
                this.e = linkedHashMap;
            } else if ("[V4 Styles]".equalsIgnoreCase(strA)) {
                defpackage.etr.e("SsaParser", "[V4 Styles] are not supported");
            } else if ("[Events]".equalsIgnoreCase(strA)) {
                return;
            }
        }
    }

    @Override // defpackage.frt
    public final /* synthetic */ defpackage.frj a(byte[] bArr, int i, int i2) {
        return defpackage.fsu.a(this, bArr, i2);
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0250  */
    /* JADX WARN: Code duplicated, block: B:103:0x0261  */
    /* JADX WARN: Code duplicated, block: B:106:0x0271  */
    /* JADX WARN: Code duplicated, block: B:108:0x027f  */
    /* JADX WARN: Code duplicated, block: B:110:0x0285  */
    /* JADX WARN: Code duplicated, block: B:111:0x0287 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:112:0x0289  */
    /* JADX WARN: Code duplicated, block: B:113:0x028c  */
    /* JADX WARN: Code duplicated, block: B:116:0x0292  */
    /* JADX WARN: Code duplicated, block: B:117:0x0299 A[FALL_THROUGH] */
    /* JADX WARN: Code duplicated, block: B:118:0x029b  */
    /* JADX WARN: Code duplicated, block: B:119:0x029e  */
    /* JADX WARN: Code duplicated, block: B:120:0x02a1  */
    /* JADX WARN: Code duplicated, block: B:123:0x02aa  */
    /* JADX WARN: Code duplicated, block: B:124:0x02b1 A[FALL_THROUGH] */
    /* JADX WARN: Code duplicated, block: B:125:0x02b3  */
    /* JADX WARN: Code duplicated, block: B:126:0x02b5  */
    /* JADX WARN: Code duplicated, block: B:127:0x02b7  */
    /* JADX WARN: Code duplicated, block: B:130:0x02bd  */
    /* JADX WARN: Code duplicated, block: B:131:0x02c4 A[FALL_THROUGH] */
    /* JADX WARN: Code duplicated, block: B:132:0x02c6  */
    /* JADX WARN: Code duplicated, block: B:133:0x02c8  */
    /* JADX WARN: Code duplicated, block: B:134:0x02ca  */
    /* JADX WARN: Code duplicated, block: B:142:0x02e4  */
    /* JADX WARN: Code duplicated, block: B:145:0x0304 A[LOOP:2: B:144:0x0302->B:145:0x0304, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:163:0x0361  */
    /* JADX WARN: Code duplicated, block: B:169:0x038a  */
    /* JADX WARN: Code duplicated, block: B:202:0x0394 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:46:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:51:0x011f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:52:0x0121  */
    /* JADX WARN: Code duplicated, block: B:55:0x013f  */
    /* JADX WARN: Code duplicated, block: B:57:0x014c  */
    /* JADX WARN: Code duplicated, block: B:59:0x0152 A[Catch: RuntimeException -> 0x0182, TryCatch #1 {RuntimeException -> 0x0182, blocks: (B:54:0x0125, B:56:0x0141, B:60:0x015a, B:59:0x0152), top: B:183:0x0125 }] */
    /* JADX WARN: Code duplicated, block: B:62:0x0176  */
    /* JADX WARN: Code duplicated, block: B:64:0x0179  */
    /* JADX WARN: Code duplicated, block: B:69:0x018e A[Catch: RuntimeException -> 0x01a6, TRY_LEAVE, TryCatch #0 {RuntimeException -> 0x01a6, blocks: (B:67:0x0182, B:69:0x018e), top: B:181:0x0182 }] */
    /* JADX WARN: Code duplicated, block: B:71:0x019b  */
    /* JADX WARN: Code duplicated, block: B:74:0x019f  */
    /* JADX WARN: Code duplicated, block: B:76:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:79:0x01e2  */
    /* JADX WARN: Code duplicated, block: B:81:0x01eb  */
    /* JADX WARN: Code duplicated, block: B:94:0x0229  */
    /* JADX WARN: Code duplicated, block: B:96:0x022d  */
    /* JADX WARN: Code duplicated, block: B:97:0x023c  */
    /* JADX WARN: Code duplicated, block: B:98:0x024b  */
    @Override // defpackage.frt
    public final void b(byte[] bArr, int i, int i2, defpackage.frs frsVar, java.util.function.Consumer consumer) {
        defpackage.fso fsoVarA;
        defpackage.frf frfVar;
        java.nio.charset.Charset charset;
        int i3;
        defpackage.fss fssVar;
        java.util.regex.Matcher matcher;
        int i4;
        android.graphics.PointF pointF;
        float f;
        android.text.SpannableString spannableString;
        defpackage.esr esrVar;
        float f2;
        int i5;
        android.text.Layout.Alignment alignment;
        int i6;
        int i7;
        defpackage.ess essVarA;
        int iE;
        int iE2;
        java.lang.Integer num;
        float f3;
        int i8;
        java.lang.Integer num2;
        java.lang.String strGroup;
        long j;
        java.util.regex.Matcher matcher2;
        int iA;
        java.util.regex.Matcher matcher3;
        java.util.regex.Matcher matcher4;
        boolean zFind;
        boolean zFind2;
        android.graphics.PointF pointF2;
        java.lang.String strGroup2;
        java.lang.String strGroup3;
        defpackage.fsp fspVar = this;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        defpackage.etx etxVar = fspVar.d;
        etxVar.O(bArr, i + i2);
        etxVar.Q(i);
        java.nio.charset.Charset charsetE = etxVar.E();
        if (charsetE == null) {
            charsetE = java.nio.charset.StandardCharsets.UTF_8;
        }
        if (fspVar.b) {
            fsoVarA = fspVar.c;
        } else {
            fspVar.g(etxVar, charsetE);
            fsoVarA = null;
        }
        while (true) {
            java.lang.String strA = etxVar.A(charsetE);
            if (strA == null) {
                long j2 = frsVar.b;
                java.util.ArrayList arrayList3 = (j2 == -9223372036854775807L || !frsVar.c) ? null : new java.util.ArrayList();
                int i9 = 0;
                while (i9 < arrayList.size()) {
                    java.util.List list = (java.util.List) arrayList.get(i9);
                    if (!list.isEmpty()) {
                        if (i9 != arrayList.size() - 1) {
                            throw new java.lang.IllegalStateException();
                        }
                        long jLongValue = ((java.lang.Long) arrayList2.get(i9)).longValue();
                        long jLongValue2 = ((java.lang.Long) arrayList2.get(i9 + 1)).longValue();
                        frfVar = new defpackage.frf(list, jLongValue, jLongValue2 - jLongValue);
                        if (j2 != -9223372036854775807L || jLongValue2 >= j2) {
                            aa$.ExternalSyntheticApiModelOutline1.m(consumer, frfVar);
                        } else if (arrayList3 != null) {
                            arrayList3.add(frfVar);
                        }
                    } else if (i9 == 0) {
                        i9 = 0;
                        if (i9 != arrayList.size() - 1) {
                            throw new java.lang.IllegalStateException();
                        }
                        long jLongValue3 = ((java.lang.Long) arrayList2.get(i9)).longValue();
                        long jLongValue4 = ((java.lang.Long) arrayList2.get(i9 + 1)).longValue();
                        frfVar = new defpackage.frf(list, jLongValue3, jLongValue4 - jLongValue3);
                        if (j2 != -9223372036854775807L) {
                            aa$.ExternalSyntheticApiModelOutline1.m(consumer, frfVar);
                        } else {
                            aa$.ExternalSyntheticApiModelOutline1.m(consumer, frfVar);
                        }
                    } else {
                        continue;
                    }
                    i9++;
                }
                if (arrayList3 != null) {
                    int size = arrayList3.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        aa$.ExternalSyntheticApiModelOutline1.m(consumer, (defpackage.frf) arrayList3.get(i10));
                    }
                    return;
                }
                return;
            }
            if (strA.startsWith("Format:")) {
                fsoVarA = defpackage.fso.a(strA);
            } else {
                if (strA.startsWith("Dialogue:")) {
                    if (fsoVarA == null) {
                        defpackage.etr.f("SsaParser", "Skipping dialogue line before complete format: ".concat(strA));
                    } else {
                        ahvr.bM(strA.startsWith("Dialogue:"));
                        java.lang.String strSubstring = strA.substring(9);
                        int i11 = fsoVarA.f;
                        java.lang.String[] strArrSplit = strSubstring.split(",", i11);
                        if (strArrSplit.length != i11) {
                            defpackage.etr.f("SsaParser", "Skipping dialogue line with fewer columns than format: ".concat(strA));
                        } else {
                            int i12 = fsoVarA.a;
                            if (i12 != -1) {
                                try {
                                    i3 = java.lang.Integer.parseInt(strArrSplit[i12].trim());
                                } catch (java.lang.RuntimeException unused) {
                                    defpackage.etr.f("SsaParser", "Fail to parse layer: ".concat(java.lang.String.valueOf(strArrSplit[fsoVarA.a])));
                                    i3 = 0;
                                }
                            } else {
                                i3 = 0;
                            }
                            long jF = f(strArrSplit[fsoVarA.b]);
                            if (jF == -9223372036854775807L) {
                                defpackage.etr.f("SsaParser", "Skipping invalid timing: ".concat(strA));
                            } else {
                                long jF2 = f(strArrSplit[fsoVarA.c]);
                                if (jF2 == -9223372036854775807L || jF2 <= jF) {
                                    charset = charsetE;
                                    defpackage.etr.f("SsaParser", "Skipping invalid timing: ".concat(strA));
                                } else {
                                    java.util.Map map = fspVar.e;
                                    if (map != null) {
                                        int i13 = fsoVarA.d;
                                        charset = charsetE;
                                        fssVar = i13 != -1 ? (defpackage.fss) map.get(strArrSplit[i13].trim()) : null;
                                        java.lang.String str = strArrSplit[fsoVarA.e];
                                        matcher = defpackage.fsr.a.matcher(str);
                                        i4 = -1;
                                        pointF = null;
                                        while (matcher.find()) {
                                            strGroup = matcher.group(1);
                                            ahvr.ci(strGroup);
                                            try {
                                                try {
                                                    matcher3 = defpackage.fsr.b.matcher(strGroup);
                                                    matcher = matcher;
                                                    try {
                                                        matcher4 = defpackage.fsr.c.matcher(strGroup);
                                                        zFind = matcher3.find();
                                                        zFind2 = matcher4.find();
                                                        if (zFind) {
                                                            if (zFind2) {
                                                                j = jF2;
                                                                try {
                                                                    defpackage.etr.e("SsaStyle.Overrides", "Override has both \\pos(x,y) and \\move(x1,y1,x2,y2); using \\pos values. override='" + strGroup + '\'');
                                                                } catch (java.lang.RuntimeException unused2) {
                                                                }
                                                            } else {
                                                                j = jF2;
                                                            }
                                                            strGroup2 = matcher3.group(1);
                                                            strGroup3 = matcher3.group(2);
                                                        } else {
                                                            j = jF2;
                                                            if (zFind2) {
                                                                strGroup2 = matcher4.group(1);
                                                                strGroup3 = matcher4.group(2);
                                                            } else {
                                                                pointF2 = null;
                                                            }
                                                            if (pointF2 != null) {
                                                                pointF = pointF2;
                                                            }
                                                            matcher2 = defpackage.fsr.d.matcher(strGroup);
                                                            if (matcher2.find()) {
                                                                java.lang.String strGroup4 = matcher2.group(1);
                                                                ahvr.ci(strGroup4);
                                                                iA = defpackage.fss.a(strGroup4);
                                                            } else {
                                                                iA = -1;
                                                            }
                                                            if (iA != -1) {
                                                                i4 = iA;
                                                            }
                                                            jF2 = j;
                                                        }
                                                        ahvr.ci(strGroup2);
                                                        float f4 = java.lang.Float.parseFloat(strGroup2.trim());
                                                        ahvr.ci(strGroup3);
                                                        pointF2 = new android.graphics.PointF(f4, java.lang.Float.parseFloat(strGroup3.trim()));
                                                        if (pointF2 != null) {
                                                            pointF = pointF2;
                                                        }
                                                    } catch (java.lang.RuntimeException unused3) {
                                                        j = jF2;
                                                    }
                                                } catch (java.lang.RuntimeException unused4) {
                                                    j = jF2;
                                                    matcher = matcher;
                                                }
                                                matcher2 = defpackage.fsr.d.matcher(strGroup);
                                                if (matcher2.find()) {
                                                    java.lang.String strGroup5 = matcher2.group(1);
                                                    ahvr.ci(strGroup5);
                                                    iA = defpackage.fss.a(strGroup5);
                                                } else {
                                                    iA = -1;
                                                }
                                                if (iA != -1) {
                                                    i4 = iA;
                                                }
                                            } catch (java.lang.RuntimeException unused5) {
                                            }
                                            jF2 = j;
                                        }
                                        long j3 = jF2;
                                        java.lang.String strReplace = defpackage.fsr.a.matcher(str).replaceAll("").replace("\\N", "\n").replace("\\n", "\n").replace("\\h", " ");
                                        float f5 = fspVar.f;
                                        f = fspVar.g;
                                        spannableString = new android.text.SpannableString(strReplace);
                                        esrVar = new defpackage.esr();
                                        esrVar.d(spannableString);
                                        esrVar.l = i3;
                                        if (fssVar != null) {
                                            num = fssVar.c;
                                            f2 = -3.4028235E38f;
                                            if (num != null) {
                                                spannableString.setSpan(new android.text.style.ForegroundColorSpan(num.intValue()), 0, spannableString.length(), 33);
                                            }
                                            if (fssVar.j == 3 && (num2 = fssVar.d) != null) {
                                                spannableString.setSpan(new android.text.style.BackgroundColorSpan(num2.intValue()), 0, spannableString.length(), 33);
                                            }
                                            f3 = fssVar.e;
                                            if (f3 != -3.4028235E38f && f != -3.4028235E38f) {
                                                esrVar.e(f3 / f, 1);
                                            }
                                            if (fssVar.f) {
                                                i8 = 0;
                                                if (fssVar.g) {
                                                    spannableString.setSpan(new android.text.style.StyleSpan(2), 0, spannableString.length(), 33);
                                                }
                                            } else if (fssVar.g) {
                                                i8 = 0;
                                                spannableString.setSpan(new android.text.style.StyleSpan(3), 0, spannableString.length(), 33);
                                            } else {
                                                i8 = 0;
                                                spannableString.setSpan(new android.text.style.StyleSpan(1), 0, spannableString.length(), 33);
                                            }
                                            if (fssVar.h) {
                                                spannableString.setSpan(new android.text.style.UnderlineSpan(), i8, spannableString.length(), 33);
                                            }
                                            if (fssVar.i) {
                                                spannableString.setSpan(new android.text.style.StrikethroughSpan(), i8, spannableString.length(), 33);
                                            }
                                        } else {
                                            f2 = -3.4028235E38f;
                                        }
                                        if (i4 != -1) {
                                            i5 = i4;
                                        } else if (fssVar != null) {
                                            i5 = fssVar.b;
                                        } else {
                                            i5 = -1;
                                        }
                                        switch (i5) {
                                            case 0:
                                            default:
                                                defpackage.etr.f("SsaParser", a.bj(i5, "Unknown alignment: "));
                                            case androidx.car.app.model.Row.NO_DECORATION /* -1 */:
                                                alignment = null;
                                                break;
                                            case 1:
                                            case 4:
                                            case 7:
                                                alignment = android.text.Layout.Alignment.ALIGN_NORMAL;
                                                break;
                                            case 2:
                                            case 5:
                                            case 8:
                                                alignment = android.text.Layout.Alignment.ALIGN_CENTER;
                                                break;
                                            case 3:
                                            case 6:
                                            case 9:
                                                alignment = android.text.Layout.Alignment.ALIGN_OPPOSITE;
                                                break;
                                        }
                                        esrVar.b = alignment;
                                        switch (i5) {
                                            case 0:
                                            default:
                                                defpackage.etr.f("SsaParser", a.bj(i5, "Unknown alignment: "));
                                            case androidx.car.app.model.Row.NO_DECORATION /* -1 */:
                                                i6 = Integer.MIN_VALUE;
                                                break;
                                            case 1:
                                            case 4:
                                            case 7:
                                                i6 = 0;
                                                break;
                                            case 2:
                                            case 5:
                                            case 8:
                                                i6 = 1;
                                                break;
                                            case 3:
                                            case 6:
                                            case 9:
                                                i6 = 2;
                                                break;
                                        }
                                        esrVar.f = i6;
                                        switch (i5) {
                                            case 0:
                                            default:
                                                defpackage.etr.f("SsaParser", a.bj(i5, "Unknown alignment: "));
                                            case androidx.car.app.model.Row.NO_DECORATION /* -1 */:
                                                i7 = Integer.MIN_VALUE;
                                                break;
                                            case 1:
                                            case 2:
                                            case 3:
                                                i7 = 2;
                                                break;
                                            case 4:
                                            case 5:
                                            case 6:
                                                i7 = 1;
                                                break;
                                            case 7:
                                            case 8:
                                            case 9:
                                                i7 = 0;
                                                break;
                                        }
                                        esrVar.d = i7;
                                        if (pointF != null || f == f2 || f5 == f2) {
                                            esrVar.e = d(esrVar.f);
                                            esrVar.c(d(i7), 0);
                                        } else {
                                            esrVar.e = pointF.x / f5;
                                            esrVar.c(pointF.y / f, 0);
                                        }
                                        essVarA = esrVar.a();
                                        iE2 = e(j3, arrayList2, arrayList);
                                        for (iE = e(jF, arrayList2, arrayList); iE < iE2; iE++) {
                                            ((java.util.List) arrayList.get(iE)).add(essVarA);
                                        }
                                    } else {
                                        charset = charsetE;
                                    }
                                    java.lang.String str2 = strArrSplit[fsoVarA.e];
                                    matcher = defpackage.fsr.a.matcher(str2);
                                    i4 = -1;
                                    pointF = null;
                                    while (matcher.find()) {
                                        strGroup = matcher.group(1);
                                        ahvr.ci(strGroup);
                                        matcher3 = defpackage.fsr.b.matcher(strGroup);
                                        matcher = matcher;
                                        matcher4 = defpackage.fsr.c.matcher(strGroup);
                                        zFind = matcher3.find();
                                        zFind2 = matcher4.find();
                                        if (zFind) {
                                            if (zFind2) {
                                                j = jF2;
                                                defpackage.etr.e("SsaStyle.Overrides", "Override has both \\pos(x,y) and \\move(x1,y1,x2,y2); using \\pos values. override='" + strGroup + '\'');
                                            } else {
                                                j = jF2;
                                            }
                                            strGroup2 = matcher3.group(1);
                                            strGroup3 = matcher3.group(2);
                                        } else {
                                            j = jF2;
                                            if (zFind2) {
                                                strGroup2 = matcher4.group(1);
                                                strGroup3 = matcher4.group(2);
                                            } else {
                                                pointF2 = null;
                                            }
                                            if (pointF2 != null) {
                                                pointF = pointF2;
                                            }
                                            matcher2 = defpackage.fsr.d.matcher(strGroup);
                                            if (matcher2.find()) {
                                                java.lang.String strGroup6 = matcher2.group(1);
                                                ahvr.ci(strGroup6);
                                                iA = defpackage.fss.a(strGroup6);
                                            } else {
                                                iA = -1;
                                            }
                                            if (iA != -1) {
                                                i4 = iA;
                                            }
                                            jF2 = j;
                                        }
                                        ahvr.ci(strGroup2);
                                        float f6 = java.lang.Float.parseFloat(strGroup2.trim());
                                        ahvr.ci(strGroup3);
                                        pointF2 = new android.graphics.PointF(f6, java.lang.Float.parseFloat(strGroup3.trim()));
                                        if (pointF2 != null) {
                                            pointF = pointF2;
                                        }
                                        matcher2 = defpackage.fsr.d.matcher(strGroup);
                                        if (matcher2.find()) {
                                            java.lang.String strGroup7 = matcher2.group(1);
                                            ahvr.ci(strGroup7);
                                            iA = defpackage.fss.a(strGroup7);
                                        } else {
                                            iA = -1;
                                        }
                                        if (iA != -1) {
                                            i4 = iA;
                                        }
                                        jF2 = j;
                                    }
                                    long j4 = jF2;
                                    java.lang.String strReplace2 = defpackage.fsr.a.matcher(str2).replaceAll("").replace("\\N", "\n").replace("\\n", "\n").replace("\\h", " ");
                                    float f7 = fspVar.f;
                                    f = fspVar.g;
                                    spannableString = new android.text.SpannableString(strReplace2);
                                    esrVar = new defpackage.esr();
                                    esrVar.d(spannableString);
                                    esrVar.l = i3;
                                    if (fssVar != null) {
                                        num = fssVar.c;
                                        f2 = -3.4028235E38f;
                                        if (num != null) {
                                            spannableString.setSpan(new android.text.style.ForegroundColorSpan(num.intValue()), 0, spannableString.length(), 33);
                                        }
                                        if (fssVar.j == 3) {
                                            spannableString.setSpan(new android.text.style.BackgroundColorSpan(num2.intValue()), 0, spannableString.length(), 33);
                                        }
                                        f3 = fssVar.e;
                                        if (f3 != -3.4028235E38f) {
                                            esrVar.e(f3 / f, 1);
                                        }
                                        if (fssVar.f) {
                                            i8 = 0;
                                            if (fssVar.g) {
                                                spannableString.setSpan(new android.text.style.StyleSpan(2), 0, spannableString.length(), 33);
                                            }
                                        } else if (fssVar.g) {
                                            i8 = 0;
                                            spannableString.setSpan(new android.text.style.StyleSpan(3), 0, spannableString.length(), 33);
                                        } else {
                                            i8 = 0;
                                            spannableString.setSpan(new android.text.style.StyleSpan(1), 0, spannableString.length(), 33);
                                        }
                                        if (fssVar.h) {
                                            spannableString.setSpan(new android.text.style.UnderlineSpan(), i8, spannableString.length(), 33);
                                        }
                                        if (fssVar.i) {
                                            spannableString.setSpan(new android.text.style.StrikethroughSpan(), i8, spannableString.length(), 33);
                                        }
                                    } else {
                                        f2 = -3.4028235E38f;
                                    }
                                    if (i4 != -1) {
                                        i5 = i4;
                                    } else if (fssVar != null) {
                                        i5 = fssVar.b;
                                    } else {
                                        i5 = -1;
                                    }
                                    switch (i5) {
                                        case 0:
                                        default:
                                            defpackage.etr.f("SsaParser", a.bj(i5, "Unknown alignment: "));
                                        case androidx.car.app.model.Row.NO_DECORATION /* -1 */:
                                            alignment = null;
                                            break;
                                        case 1:
                                        case 4:
                                        case 7:
                                            alignment = android.text.Layout.Alignment.ALIGN_NORMAL;
                                            break;
                                        case 2:
                                        case 5:
                                        case 8:
                                            alignment = android.text.Layout.Alignment.ALIGN_CENTER;
                                            break;
                                        case 3:
                                        case 6:
                                        case 9:
                                            alignment = android.text.Layout.Alignment.ALIGN_OPPOSITE;
                                            break;
                                    }
                                    esrVar.b = alignment;
                                    switch (i5) {
                                        case 0:
                                        default:
                                            defpackage.etr.f("SsaParser", a.bj(i5, "Unknown alignment: "));
                                        case androidx.car.app.model.Row.NO_DECORATION /* -1 */:
                                            i6 = Integer.MIN_VALUE;
                                            break;
                                        case 1:
                                        case 4:
                                        case 7:
                                            i6 = 0;
                                            break;
                                        case 2:
                                        case 5:
                                        case 8:
                                            i6 = 1;
                                            break;
                                        case 3:
                                        case 6:
                                        case 9:
                                            i6 = 2;
                                            break;
                                    }
                                    esrVar.f = i6;
                                    switch (i5) {
                                        case 0:
                                        default:
                                            defpackage.etr.f("SsaParser", a.bj(i5, "Unknown alignment: "));
                                        case androidx.car.app.model.Row.NO_DECORATION /* -1 */:
                                            i7 = Integer.MIN_VALUE;
                                            break;
                                        case 1:
                                        case 2:
                                        case 3:
                                            i7 = 2;
                                            break;
                                        case 4:
                                        case 5:
                                        case 6:
                                            i7 = 1;
                                            break;
                                        case 7:
                                        case 8:
                                        case 9:
                                            i7 = 0;
                                            break;
                                    }
                                    esrVar.d = i7;
                                    if (pointF != null) {
                                        esrVar.e = d(esrVar.f);
                                        esrVar.c(d(i7), 0);
                                    } else {
                                        esrVar.e = d(esrVar.f);
                                        esrVar.c(d(i7), 0);
                                    }
                                    essVarA = esrVar.a();
                                    iE2 = e(j4, arrayList2, arrayList);
                                    while (iE < iE2) {
                                        ((java.util.List) arrayList.get(iE)).add(essVarA);
                                    }
                                }
                            }
                        }
                    }
                    charset = charsetE;
                } else {
                    charset = charsetE;
                }
                fspVar = this;
                fsoVarA = fsoVarA;
                charsetE = charset;
                etxVar = etxVar;
            }
        }
    }

    @Override // defpackage.frt
    public final /* synthetic */ void c() {
    }
}
