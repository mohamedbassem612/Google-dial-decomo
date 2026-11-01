package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class ftn implements defpackage.frt {
    private final defpackage.etx a = new defpackage.etx();
    private final defpackage.ftg b = new defpackage.ftg();

    @Override // defpackage.frt
    public final /* synthetic */ defpackage.frj a(byte[] bArr, int i, int i2) {
        return defpackage.fsu.a(this, bArr, i2);
    }

    /* JADX WARN: Code duplicated, block: B:115:0x020a  */
    /* JADX WARN: Code duplicated, block: B:116:0x0215  */
    /* JADX WARN: Code duplicated, block: B:118:0x021e  */
    /* JADX WARN: Code duplicated, block: B:119:0x0228  */
    /* JADX WARN: Code duplicated, block: B:121:0x0230  */
    /* JADX WARN: Code duplicated, block: B:123:0x0238  */
    /* JADX WARN: Code duplicated, block: B:124:0x023c  */
    /* JADX WARN: Code duplicated, block: B:126:0x0244  */
    /* JADX WARN: Code duplicated, block: B:127:0x0249  */
    /* JADX WARN: Code duplicated, block: B:129:0x0251  */
    /* JADX WARN: Code duplicated, block: B:134:0x0263  */
    /* JADX WARN: Code duplicated, block: B:136:0x0268  */
    /* JADX WARN: Code duplicated, block: B:138:0x0270  */
    /* JADX WARN: Code duplicated, block: B:140:0x0278  */
    /* JADX WARN: Code duplicated, block: B:141:0x027d  */
    /* JADX WARN: Code duplicated, block: B:143:0x0285  */
    /* JADX WARN: Code duplicated, block: B:144:0x028d  */
    /* JADX WARN: Code duplicated, block: B:146:0x0295  */
    /* JADX WARN: Code duplicated, block: B:148:0x029d  */
    /* JADX WARN: Code duplicated, block: B:149:0x02a2  */
    /* JADX WARN: Code duplicated, block: B:151:0x02ab  */
    /* JADX WARN: Code duplicated, block: B:153:0x02b3  */
    /* JADX WARN: Code duplicated, block: B:154:0x02b7  */
    /* JADX WARN: Code duplicated, block: B:156:0x02bf  */
    /* JADX WARN: Code duplicated, block: B:158:0x02cf  */
    /* JADX WARN: Code duplicated, block: B:159:0x02dd  */
    /* JADX WARN: Code duplicated, block: B:161:0x02ed  */
    /* JADX WARN: Code duplicated, block: B:163:0x02f1  */
    /* JADX WARN: Code duplicated, block: B:168:0x0302  */
    /* JADX WARN: Code duplicated, block: B:170:0x030a  */
    /* JADX WARN: Code duplicated, block: B:172:0x030f  */
    /* JADX WARN: Code duplicated, block: B:174:0x0317  */
    /* JADX WARN: Code duplicated, block: B:197:0x0386  */
    /* JADX WARN: Code duplicated, block: B:216:0x0329 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:217:0x0329 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:249:0x032f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:252:0x032f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:255:0x032f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:257:0x032f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:259:0x032f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:59:0x010c  */
    @Override // defpackage.frt
    public final void b(byte[] bArr, int i, int i2, defpackage.frs frsVar, java.util.function.Consumer consumer) {
        defpackage.fti ftiVarB;
        java.lang.String strSubstring;
        java.lang.String string;
        java.util.regex.Matcher matcher;
        java.lang.String strGroup;
        int iHashCode;
        int i3;
        boolean z;
        defpackage.ftn ftnVar = this;
        defpackage.etx etxVar = ftnVar.a;
        etxVar.O(bArr, i + i2);
        etxVar.Q(i);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        try {
            int i4 = defpackage.fto.a;
            int i5 = etxVar.c;
            java.lang.String strZ = etxVar.z();
            int i6 = 1;
            if (strZ == null || !strZ.startsWith("WEBVTT")) {
                etxVar.Q(i5);
                throw new defpackage.era("Expected WEBVTT. Got ".concat(java.lang.String.valueOf(etxVar.z())), null, true, 1);
            }
            while (!android.text.TextUtils.isEmpty(etxVar.z())) {
                ftnVar = this;
            }
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            int i7 = -1;
            int i8 = 0;
            while (true) {
                int i9 = i7;
                int i10 = i8;
                while (true) {
                    if (i9 == i7) {
                        i10 = etxVar.c;
                        java.lang.String strZ2 = etxVar.z();
                        if (strZ2 == null) {
                            i9 = i8;
                        } else if ("STYLE".equals(strZ2)) {
                            i9 = 2;
                        } else {
                            i9 = strZ2.startsWith("NOTE") ? i6 : 3;
                        }
                    } else {
                        etxVar.Q(i10);
                        if (i9 == 0) {
                            defpackage.fsu.b(new defpackage.ftp(arrayList2), frsVar, consumer);
                            return;
                        }
                        if (i9 == i6) {
                            break;
                        }
                        if (i9 != 2) {
                            java.util.regex.Pattern pattern = defpackage.ftm.a;
                            java.lang.String strZ3 = etxVar.z();
                            if (strZ3 != null) {
                                java.util.regex.Pattern pattern2 = defpackage.ftm.a;
                                java.util.regex.Matcher matcher2 = pattern2.matcher(strZ3);
                                if (matcher2.matches()) {
                                    ftiVarB = defpackage.ftm.b(null, matcher2, etxVar, arrayList);
                                } else {
                                    java.lang.String strZ4 = etxVar.z();
                                    if (strZ4 != null) {
                                        java.util.regex.Matcher matcher3 = pattern2.matcher(strZ4);
                                        if (matcher3.matches()) {
                                            ftiVarB = defpackage.ftm.b(strZ3.trim(), matcher3, etxVar, arrayList);
                                        } else {
                                            ftiVarB = null;
                                        }
                                    } else {
                                        ftiVarB = null;
                                    }
                                }
                            } else {
                                ftiVarB = null;
                            }
                            if (ftiVarB != null) {
                                arrayList2.add(ftiVarB);
                            }
                        } else {
                            if (!arrayList2.isEmpty()) {
                                throw new java.lang.IllegalArgumentException("A style block was found after the first cue.");
                            }
                            etxVar.z();
                            defpackage.ftg ftgVar = ftnVar.b;
                            java.lang.StringBuilder sb = ftgVar.d;
                            sb.setLength(i8);
                            int i11 = etxVar.c;
                            while (!android.text.TextUtils.isEmpty(etxVar.z())) {
                                i6 = 1;
                            }
                            defpackage.etx etxVar2 = ftgVar.c;
                            etxVar2.O(etxVar.b, etxVar.c);
                            etxVar2.Q(i11);
                            java.util.ArrayList arrayList3 = new java.util.ArrayList();
                            while (true) {
                                defpackage.ftg.c(etxVar2);
                                if (etxVar2.d() < 5 || !"::cue".equals(etxVar2.C(5))) {
                                    strSubstring = null;
                                } else {
                                    int i12 = etxVar2.c;
                                    java.lang.String strB = defpackage.ftg.b(etxVar2, sb);
                                    if (strB == null) {
                                        strSubstring = null;
                                    } else if ("{".equals(strB)) {
                                        etxVar2.Q(i12);
                                        strSubstring = "";
                                    } else {
                                        if ("(".equals(strB)) {
                                            int i13 = etxVar2.c;
                                            int i14 = etxVar2.d;
                                            int i15 = i8;
                                            while (i13 < i14 && i15 == 0) {
                                                int i16 = i13 + 1;
                                                int i17 = ((char) etxVar2.b[i13]) == ')' ? i6 : i8;
                                                i13 = i16;
                                                i15 = i17;
                                            }
                                            strSubstring = etxVar2.C((i13 - 1) - etxVar2.c).trim();
                                        } else {
                                            strSubstring = null;
                                        }
                                        if (!")".equals(defpackage.ftg.b(etxVar2, sb))) {
                                            strSubstring = null;
                                        }
                                    }
                                }
                                if (strSubstring == null || !"{".equals(defpackage.ftg.b(etxVar2, sb))) {
                                    break;
                                }
                                defpackage.fth fthVar = new defpackage.fth();
                                if (!strSubstring.isEmpty()) {
                                    int iIndexOf = strSubstring.indexOf(91);
                                    if (iIndexOf != i7) {
                                        java.util.regex.Matcher matcher4 = defpackage.ftg.a.matcher(strSubstring.substring(iIndexOf));
                                        if (matcher4.matches()) {
                                            java.lang.String strGroup2 = matcher4.group(i6);
                                            ahvr.ci(strGroup2);
                                            fthVar.d = strGroup2;
                                        }
                                        strSubstring = strSubstring.substring(i8, iIndexOf);
                                    }
                                    java.lang.String str = eum.a;
                                    java.lang.String[] strArrSplit = strSubstring.split("\\.", i7);
                                    java.lang.String str2 = strArrSplit[i8];
                                    int iIndexOf2 = str2.indexOf(35);
                                    if (iIndexOf2 != i7) {
                                        fthVar.b = str2.substring(i8, iIndexOf2);
                                        fthVar.a = str2.substring(iIndexOf2 + 1);
                                    } else {
                                        fthVar.b = str2;
                                    }
                                    int length = strArrSplit.length;
                                    if (length > i6) {
                                        fthVar.c = new java.util.HashSet(java.util.Arrays.asList((java.lang.String[]) java.util.Arrays.copyOfRange(strArrSplit, i6, length)));
                                    }
                                }
                                int i18 = i8;
                                java.lang.String str3 = null;
                                while (i18 == 0) {
                                    int i19 = etxVar2.c;
                                    java.lang.String strB2 = defpackage.ftg.b(etxVar2, sb);
                                    int i20 = (strB2 == null || "}".equals(strB2)) ? i6 : i8;
                                    if (i20 == 0) {
                                        etxVar2.Q(i19);
                                        defpackage.ftg.c(etxVar2);
                                        java.lang.String strA = defpackage.ftg.a(etxVar2, sb);
                                        if (!strA.isEmpty() && ":".equals(defpackage.ftg.b(etxVar2, sb))) {
                                            defpackage.ftg.c(etxVar2);
                                            java.lang.StringBuilder sb2 = new java.lang.StringBuilder();
                                            boolean z2 = false;
                                            while (true) {
                                                if (z2) {
                                                    string = sb2.toString();
                                                    break;
                                                }
                                                int i21 = etxVar2.c;
                                                java.lang.String strB3 = defpackage.ftg.b(etxVar2, sb);
                                                if (strB3 == null) {
                                                    string = null;
                                                    break;
                                                } else if ("}".equals(strB3) || ";".equals(strB3)) {
                                                    etxVar2.Q(i21);
                                                    z2 = true;
                                                } else {
                                                    sb2.append(strB3);
                                                }
                                            }
                                            if (string != null && !string.isEmpty()) {
                                                int i22 = etxVar2.c;
                                                java.lang.String strB4 = defpackage.ftg.b(etxVar2, sb);
                                                if (";".equals(strB4)) {
                                                    if ("color".equals(strA)) {
                                                        fthVar.f = defpackage.etf.a(string, true);
                                                        fthVar.g = true;
                                                    } else if ("background-color".equals(strA)) {
                                                        fthVar.h = defpackage.etf.a(string, true);
                                                        fthVar.i = true;
                                                    } else if ("ruby-position".equals(strA)) {
                                                        if ("over".equals(string)) {
                                                            fthVar.o = 1;
                                                        } else if ("under".equals(string)) {
                                                            fthVar.o = 2;
                                                        }
                                                    } else if ("text-combine-upright".equals(strA)) {
                                                        if (!"all".equals(string) || string.startsWith("digits")) {
                                                            z = true;
                                                        } else {
                                                            z = false;
                                                        }
                                                        fthVar.p = z;
                                                    } else if ("text-decoration".equals(strA)) {
                                                        if ("underline".equals(string)) {
                                                            fthVar.j = 1;
                                                        }
                                                    } else if ("font-family".equals(strA)) {
                                                        fthVar.e = ahvr.p(string);
                                                    } else if ("font-weight".equals(strA)) {
                                                        if ("bold".equals(string)) {
                                                            fthVar.k = 1;
                                                        }
                                                    } else if ("font-style".equals(strA)) {
                                                        if ("italic".equals(string)) {
                                                            fthVar.l = 1;
                                                        }
                                                    } else if ("font-size".equals(strA)) {
                                                        matcher = defpackage.ftg.b.matcher(ahvr.p(string));
                                                        if (matcher.matches()) {
                                                            strGroup = matcher.group(2);
                                                            ahvr.ci(strGroup);
                                                            iHashCode = strGroup.hashCode();
                                                            if (iHashCode != 37) {
                                                                if (iHashCode != 3240) {
                                                                    if (iHashCode != 3592 && strGroup.equals("px")) {
                                                                        fthVar.m = 1;
                                                                        i3 = 1;
                                                                    }
                                                                } else if (strGroup.equals("em")) {
                                                                    fthVar.m = 2;
                                                                    i3 = 1;
                                                                }
                                                                throw new java.lang.IllegalStateException();
                                                            }
                                                            if (strGroup.equals("%")) {
                                                                throw new java.lang.IllegalStateException();
                                                            }
                                                            fthVar.m = 3;
                                                            i3 = 1;
                                                            java.lang.String strGroup3 = matcher.group(i3);
                                                            ahvr.ci(strGroup3);
                                                            fthVar.n = java.lang.Float.parseFloat(strGroup3);
                                                        } else {
                                                            defpackage.etr.f("WebvttCssParser", a.bk(string, "Invalid font-size: '", "'."));
                                                        }
                                                    } else {
                                                        continue;
                                                    }
                                                } else if ("}".equals(strB4)) {
                                                    etxVar2.Q(i22);
                                                    if ("color".equals(strA)) {
                                                        fthVar.f = defpackage.etf.a(string, true);
                                                        fthVar.g = true;
                                                    } else if ("background-color".equals(strA)) {
                                                        fthVar.h = defpackage.etf.a(string, true);
                                                        fthVar.i = true;
                                                    } else if ("ruby-position".equals(strA)) {
                                                        if ("over".equals(string)) {
                                                            fthVar.o = 1;
                                                        } else if ("under".equals(string)) {
                                                            fthVar.o = 2;
                                                        }
                                                    } else if ("text-combine-upright".equals(strA)) {
                                                        if ("all".equals(string)) {
                                                            z = true;
                                                        } else {
                                                            z = true;
                                                        }
                                                        fthVar.p = z;
                                                    } else if ("text-decoration".equals(strA)) {
                                                        if ("underline".equals(string)) {
                                                            fthVar.j = 1;
                                                        }
                                                    } else if ("font-family".equals(strA)) {
                                                        fthVar.e = ahvr.p(string);
                                                    } else if ("font-weight".equals(strA)) {
                                                        if ("bold".equals(string)) {
                                                            fthVar.k = 1;
                                                        }
                                                    } else if ("font-style".equals(strA)) {
                                                        if ("italic".equals(string)) {
                                                            fthVar.l = 1;
                                                        }
                                                    } else if ("font-size".equals(strA)) {
                                                        matcher = defpackage.ftg.b.matcher(ahvr.p(string));
                                                        if (matcher.matches()) {
                                                            defpackage.etr.f("WebvttCssParser", a.bk(string, "Invalid font-size: '", "'."));
                                                        } else {
                                                            strGroup = matcher.group(2);
                                                            ahvr.ci(strGroup);
                                                            iHashCode = strGroup.hashCode();
                                                            if (iHashCode != 37) {
                                                                if (iHashCode != 3240) {
                                                                    if (iHashCode != 3592) {
                                                                    }
                                                                } else if (strGroup.equals("em")) {
                                                                    fthVar.m = 2;
                                                                    i3 = 1;
                                                                }
                                                                throw new java.lang.IllegalStateException();
                                                            }
                                                            if (strGroup.equals("%")) {
                                                                throw new java.lang.IllegalStateException();
                                                            }
                                                            fthVar.m = 3;
                                                            i3 = 1;
                                                            java.lang.String strGroup4 = matcher.group(i3);
                                                            ahvr.ci(strGroup4);
                                                            fthVar.n = java.lang.Float.parseFloat(strGroup4);
                                                        }
                                                    } else {
                                                        continue;
                                                    }
                                                } else {
                                                    continue;
                                                }
                                            }
                                        }
                                    }
                                    str3 = strB2;
                                    i18 = i20;
                                    i6 = 1;
                                    i8 = 0;
                                }
                                if ("}".equals(str3)) {
                                    arrayList3.add(fthVar);
                                }
                                i7 = -1;
                                i6 = 1;
                                i8 = 0;
                            }
                            arrayList.addAll(arrayList3);
                        }
                        ftnVar = this;
                        i7 = -1;
                        i6 = 1;
                        i8 = 0;
                        i9 = -1;
                        i10 = 0;
                    }
                }
                while (!android.text.TextUtils.isEmpty(etxVar.z())) {
                }
            }
        } catch (defpackage.era e) {
            throw new java.lang.IllegalArgumentException(e);
        }
    }

    @Override // defpackage.frt
    public final /* synthetic */ void c() {
    }
}
