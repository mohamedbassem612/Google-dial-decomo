package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aetp {
    private final defpackage.aoin i;
    private final defpackage.aoin j;
    private static final defpackage.aihd d = defpackage.aihd.t("googleapis.com", "adwords.google.com", "m.google.com", "sandbox.google.com");
    private static final java.util.regex.Pattern e = java.util.regex.Pattern.compile("(?:[^\\/]*\\/)([^;]*)");
    public static final java.util.regex.Pattern a = java.util.regex.Pattern.compile("([^\\?]+)(\\?+)");
    private static final java.util.regex.Pattern f = java.util.regex.Pattern.compile("((?:https?:\\/\\/|)[a-zA-Z0-9-_\\.]+(?::\\d+)?)(.*)?");
    public static final java.util.regex.Pattern b = java.util.regex.Pattern.compile("(.*)(?<!https?:\\/)(?:\\/[\\w]+$)");
    public static final java.util.regex.Pattern c = java.util.regex.Pattern.compile("(.*)(?<!https?:\\/)(?:\\/[\\w]+\\.[\\w]*$)");
    private static final java.util.regex.Pattern g = java.util.regex.Pattern.compile("([a-zA-Z0-9-_]+)");
    private static final java.util.regex.Pattern h = java.util.regex.Pattern.compile("\\b([0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3})(:\\d{1,5})?\\b");

    public aetp(defpackage.aoin aoinVar, defpackage.aoin aoinVar2) {
        this.i = aoinVar;
        this.j = aoinVar2;
    }

    static java.lang.String a(java.lang.String str) {
        java.util.regex.Matcher matcher = f.matcher(str);
        if (matcher.matches()) {
            return matcher.group(1);
        }
        return null;
    }

    static java.lang.String b(java.lang.String str) {
        if (str == null) {
            return null;
        }
        java.util.regex.Matcher matcher = h.matcher(str);
        return matcher.find() ? matcher.replaceFirst("<ip>") : str;
    }

    static java.lang.String d(java.lang.String str, boolean z) {
        boolean z2;
        if (defpackage.ahvr.cp(str)) {
            return null;
        }
        if (z) {
            z2 = true;
        } else {
            java.lang.String strA = a(str);
            if (strA != null) {
                str = strA;
                z2 = true;
            } else {
                z2 = false;
            }
        }
        java.util.regex.Matcher matcher = a.matcher(str);
        if (matcher.find()) {
            str = matcher.group(1);
            z2 = true;
        }
        java.lang.String strB = b(str);
        if (strB != null && !strB.equals(str)) {
            z2 = true;
        }
        if (strB != null) {
            java.util.regex.Matcher matcher2 = h.matcher(strB);
            if (matcher2.find()) {
                strB = matcher2.replaceFirst("<ip>");
                z2 = true;
            }
        }
        if (strB == null || z2) {
            return strB;
        }
        java.util.regex.Matcher matcher3 = g.matcher(strB);
        if (matcher3.find()) {
            return matcher3.group(1);
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:65:0x0181  */
    /* JADX WARN: Code duplicated, block: B:84:0x0238  */
    /* JADX WARN: Code duplicated, block: B:86:0x023e  */
    /* JADX WARN: Code duplicated, block: B:89:0x0256  */
    /* JADX WARN: Code duplicated, block: B:91:0x0262  */
    /* JADX WARN: Code duplicated, block: B:93:0x0268  */
    public final defpackage.apgu c(java.lang.Iterable iterable) {
        int i;
        java.lang.String strB;
        java.lang.String strD;
        boolean zAnyMatch;
        int i2;
        java.lang.String strD2;
        java.lang.String strGroup;
        defpackage.akzx akzxVarM = defpackage.apfd.a.m();
        java.util.Iterator it = iterable.iterator();
        while (it.hasNext()) {
            aeto aetoVar = (aeto) it.next();
            defpackage.akzx akzxVarM2 = apfc.a.m();
            int i3 = aetoVar.e;
            if (i3 > 0) {
                akzxVarM2.u();
                apfc apfcVar = akzxVarM2.b;
                apfcVar.b |= 128;
                apfcVar.l = i3;
            }
            int i4 = aetoVar.d;
            if (i4 > 0) {
                akzxVarM2.u();
                apfc apfcVar2 = akzxVarM2.b;
                apfcVar2.b |= 64;
                apfcVar2.k = i4;
            }
            long j = aetoVar.c;
            long j2 = 0;
            if (j > 0) {
                akzxVarM2.u();
                apfc apfcVar3 = akzxVarM2.b;
                apfcVar3.b |= 8;
                apfcVar3.h = (int) j;
            }
            long j3 = aetoVar.b;
            if (j3 > 0) {
                akzxVarM2.u();
                apfc apfcVar4 = akzxVarM2.b;
                apfcVar4.b |= 16;
                apfcVar4.i = (int) j3;
            }
            int i5 = aetoVar.j;
            akzxVarM2.u();
            apfc apfcVar5 = akzxVarM2.b;
            apfcVar5.b |= 32;
            apfcVar5.j = i5;
            if (aetoVar.p >= 0) {
                defpackage.akzx akzxVarM3 = apfe.a.m();
                int i6 = aetoVar.p;
                akzxVarM3.u();
                apfe apfeVar = akzxVarM3.b;
                apfeVar.b |= 1;
                apfeVar.c = i6;
                apfe apfeVarR = akzxVarM3.r();
                akzxVarM2.u();
                apfc apfcVar6 = akzxVarM2.b;
                j$.util.Objects.requireNonNull(apfeVarR);
                apfcVar6.z = apfeVarR;
                apfcVar6.b |= 4194304;
            }
            java.lang.String str = aetoVar.k;
            java.lang.String strGroup2 = null;
            if (str != null) {
                if (!defpackage.ahvr.cp(str)) {
                    java.util.regex.Matcher matcher = e.matcher(str);
                    if (matcher.find()) {
                        strGroup = matcher.group(0);
                        j2 = 0;
                    } else {
                        ((defpackage.aimw) ((defpackage.aimw) aenr.a.d()).l("com/google/android/libraries/performance/primes/metrics/network/NetworkMetricCollector", "extractContentType", 445, "NetworkMetricCollector.java")).y("contentType extraction failed for %s, skipping logging path", str);
                    }
                    if (strGroup != null) {
                        akzxVarM2.u();
                        apfc apfcVar7 = akzxVarM2.b;
                        j$.util.Objects.requireNonNull(strGroup);
                        apfcVar7.b |= 1;
                        apfcVar7.e = strGroup;
                    }
                }
                strGroup = null;
                if (strGroup != null) {
                    akzxVarM2.u();
                    apfc apfcVar8 = akzxVarM2.b;
                    j$.util.Objects.requireNonNull(strGroup);
                    apfcVar8.b |= 1;
                    apfcVar8.e = strGroup;
                }
            } else {
                j2 = 0;
            }
            java.lang.String str2 = aetoVar.i;
            if (defpackage.ahvr.cp(str2)) {
                i = 1;
            } else if (str2.equals("http/1.1")) {
                i = 2;
            } else if (str2.equals("spdy/2")) {
                i = 3;
            } else if (str2.equals("spdy/3")) {
                i = 4;
            } else if (str2.equals("spdy/3.1")) {
                i = 5;
            } else if (str2.startsWith("h2")) {
                i = 6;
            } else if (str2.equals("quic/1+spdy/3")) {
                i = 7;
            } else if (str2.startsWith("http/2+quic")) {
                i = 11;
            } else if (str2.startsWith("h3")) {
                i = 12;
            } else if (str2.equals("http/0.9")) {
                i = 9;
            } else if (str2.equals("http/1.0")) {
                i = 10;
            } else {
                i = 1;
            }
            akzxVarM2.u();
            apfc apfcVar9 = akzxVarM2.b;
            apfcVar9.m = i - 1;
            apfcVar9.b |= 256;
            defpackage.aoin aoinVar = this.i;
            java.lang.String str3 = aetoVar.f;
            if (str3 != null) {
                if (aetoVar.h) {
                    strGroup2 = aetoVar.g;
                    akzxVarM2.u();
                    apfc apfcVar10 = akzxVarM2.b;
                    j$.util.Objects.requireNonNull(str3);
                    apfcVar10.b |= 4;
                    apfcVar10.g = str3;
                } else {
                    java.lang.String strA = a(str3);
                    int i7 = aetoVar.t;
                    if (((defpackage.aetn) aoinVar.a()).b) {
                        if (((java.lang.Boolean) this.j.a()).booleanValue()) {
                            java.lang.String strA2 = a(str3);
                            if (strA2 != null) {
                                zAnyMatch = j$.util.stream.Stream.-CC.concat(j$.util.Collection.-EL.stream(d), j$.util.Collection.-EL.stream(((defpackage.aetn) aoinVar.a()).d)).anyMatch(new abdh(strA2.replaceAll("^(https?://)", "").replaceAll("(?::\\d+)$", ""), 15));
                            }
                            if (i7 == 0 && ((i2 = i7 - 1) == 1 || i2 == 2)) {
                                strD2 = d(str3, true);
                                if (strD2 != null) {
                                    java.util.regex.Matcher matcher2 = f.matcher(strD2);
                                    strGroup2 = matcher2.matches() ? matcher2.group(2) : null;
                                    if (strGroup2 != null) {
                                        akzxVarM2.u();
                                        apfc apfcVar11 = akzxVarM2.b;
                                        j$.util.Objects.requireNonNull(strGroup2);
                                        apfcVar11.b |= 524288;
                                        apfcVar11.w = strGroup2;
                                    }
                                }
                            } else {
                                strD = d(str3, false);
                                if (strD != null) {
                                    akzxVarM2.u();
                                    apfc apfcVar12 = akzxVarM2.b;
                                    j$.util.Objects.requireNonNull(strD);
                                    apfcVar12.b |= 2;
                                    apfcVar12.f = strD;
                                }
                            }
                        } else {
                            j$.util.stream.Stream streamConcat = j$.util.stream.Stream.-CC.concat(j$.util.Collection.-EL.stream(d), j$.util.Collection.-EL.stream(((defpackage.aetn) aoinVar.a()).d));
                            j$.util.Objects.requireNonNull(str3);
                            zAnyMatch = streamConcat.anyMatch(new abdh(str3, 16));
                        }
                        if (!zAnyMatch) {
                            if (i7 == 0) {
                            }
                            strD = d(str3, false);
                            if (strD != null) {
                                akzxVarM2.u();
                                apfc apfcVar13 = akzxVarM2.b;
                                j$.util.Objects.requireNonNull(strD);
                                apfcVar13.b |= 2;
                                apfcVar13.f = strD;
                            }
                        }
                        strD2 = d(str3, true);
                        if (strD2 != null) {
                            java.util.regex.Matcher matcher3 = f.matcher(strD2);
                            if (matcher3.matches()) {
                            }
                            if (strGroup2 != null) {
                                akzxVarM2.u();
                                apfc apfcVar14 = akzxVarM2.b;
                                j$.util.Objects.requireNonNull(strGroup2);
                                apfcVar14.b |= 524288;
                                apfcVar14.w = strGroup2;
                            }
                        }
                    } else {
                        strD = d(str3, false);
                        if (strD != null) {
                            akzxVarM2.u();
                            apfc apfcVar15 = akzxVarM2.b;
                            j$.util.Objects.requireNonNull(strD);
                            apfcVar15.b |= 2;
                            apfcVar15.f = strD;
                        }
                    }
                    strGroup2 = strA;
                }
            }
            if (strGroup2 != null && (strB = b(strGroup2)) != null) {
                akzxVarM2.u();
                apfc apfcVar16 = akzxVarM2.b;
                j$.util.Objects.requireNonNull(strB);
                apfcVar16.b |= 2097152;
                apfcVar16.y = strB;
            }
            defpackage.apfx apfxVar = aetoVar.l;
            if (apfxVar != null) {
                akzxVarM2.u();
                apfc apfcVar17 = akzxVarM2.b;
                j$.util.Objects.requireNonNull(apfxVar);
                apfcVar17.n = apfxVar;
                apfcVar17.b |= 512;
            }
            int i8 = aetoVar.r;
            if (i8 != 0) {
                akzxVarM2.u();
                apfc apfcVar18 = akzxVarM2.b;
                apfcVar18.o = i8 - 1;
                apfcVar18.b |= 1024;
            }
            defpackage.akzx akzxVarM4 = apfb.a.m();
            int i9 = aetoVar.s;
            if (i9 != 0) {
                akzxVarM4.u();
                apfb apfbVar = akzxVarM4.b;
                apfbVar.c = i9 - 2;
                apfbVar.b |= 1;
            }
            akzxVarM2.u();
            apfc apfcVar19 = akzxVarM2.b;
            apfb apfbVarR = akzxVarM4.r();
            j$.util.Objects.requireNonNull(apfbVarR);
            apfcVar19.p = apfbVarR;
            apfcVar19.b |= 2048;
            int i10 = aetoVar.t;
            if (i10 != 0) {
                akzxVarM2.u();
                apfc apfcVar20 = akzxVarM2.b;
                apfcVar20.q = i10 - 1;
                apfcVar20.b |= 4096;
            }
            defpackage.apev apevVar = aetoVar.m;
            long j4 = aetoVar.a;
            if (j4 > j2) {
                akzxVarM2.u();
                apfc apfcVar21 = akzxVarM2.b;
                apfcVar21.b |= 16384;
                apfcVar21.r = j4;
            }
            int i11 = aetoVar.o;
            defpackage.aevn aevnVar = aetoVar.q;
            if (aevnVar != null) {
                if (aevnVar.f()) {
                    int i12 = aevnVar.c;
                    akzxVarM2.u();
                    apfc apfcVar22 = akzxVarM2.b;
                    apfcVar22.c = 28;
                    apfcVar22.d = java.lang.Long.valueOf(i12);
                } else {
                    defpackage.akzx akzxVarM5 = defpackage.apfz.a.m();
                    int i13 = aevnVar.c;
                    akzxVarM5.u();
                    defpackage.apfz apfzVar = (defpackage.apfz) akzxVarM5.b;
                    apfzVar.b |= 1;
                    apfzVar.c = i13;
                    int i14 = aevnVar.d;
                    akzxVarM5.u();
                    defpackage.apfz apfzVar2 = (defpackage.apfz) akzxVarM5.b;
                    apfzVar2.b |= 2;
                    apfzVar2.d = i14;
                    akzxVarM2.u();
                    apfc apfcVar23 = akzxVarM2.b;
                    defpackage.apfz apfzVar3 = (defpackage.apfz) akzxVarM5.r();
                    j$.util.Objects.requireNonNull(apfzVar3);
                    apfcVar23.d = apfzVar3;
                    apfcVar23.c = 29;
                }
            }
            int i15 = aetoVar.u;
            if (i15 != 0) {
                akzxVarM2.u();
                apfc apfcVar24 = akzxVarM2.b;
                apfcVar24.t = i15 - 1;
                apfcVar24.b |= 65536;
            }
            int i16 = aetoVar.v;
            if (i16 != 0) {
                akzxVarM2.u();
                apfc apfcVar25 = akzxVarM2.b;
                apfcVar25.s = i16 - 1;
                apfcVar25.b |= 32768;
            }
            java.lang.Integer num = aetoVar.n;
            if (num != null) {
                int iIntValue = num.intValue();
                akzxVarM2.u();
                apfc apfcVar26 = akzxVarM2.b;
                apfcVar26.b |= 131072;
                apfcVar26.u = iIntValue;
            }
            akzxVarM2.u();
            apfc apfcVar27 = akzxVarM2.b;
            apfcVar27.b |= 262144;
            apfcVar27.v = 0;
            akzxVarM.u();
            defpackage.apfd apfdVar = (defpackage.apfd) akzxVarM.b;
            apfc apfcVarR = akzxVarM2.r();
            j$.util.Objects.requireNonNull(apfcVarR);
            apfdVar.b();
            apfdVar.b.add(apfcVarR);
        }
        defpackage.akzx akzxVarM6 = defpackage.apgu.a.m();
        akzxVarM6.u();
        defpackage.apgu apguVar = (defpackage.apgu) akzxVarM6.b;
        defpackage.apfd apfdVar2 = (defpackage.apfd) akzxVarM.r();
        j$.util.Objects.requireNonNull(apfdVar2);
        apguVar.h = apfdVar2;
        apguVar.b |= 32;
        return (defpackage.apgu) akzxVarM6.r();
    }
}
