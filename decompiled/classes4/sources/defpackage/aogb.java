package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class aogb implements javax.net.ssl.HostnameVerifier {
    public static final defpackage.aogb a = new defpackage.aogb();
    private static final java.util.regex.Pattern b = java.util.regex.Pattern.compile("([0-9a-fA-F]*:[0-9a-fA-F:.]*)|([\\d.]+)");

    private static java.util.List a(java.security.cert.X509Certificate x509Certificate, int i) {
        java.lang.Integer num;
        java.lang.String str;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        try {
            java.util.Collection<java.util.List<?>> subjectAlternativeNames = x509Certificate.getSubjectAlternativeNames();
            if (subjectAlternativeNames == null) {
                return java.util.Collections.EMPTY_LIST;
            }
            for (java.util.List<?> list : subjectAlternativeNames) {
                if (list != null && list.size() >= 2 && (num = (java.lang.Integer) list.get(0)) != null && num.intValue() == i && (str = (java.lang.String) list.get(1)) != null) {
                    arrayList.add(str);
                }
            }
            return arrayList;
        } catch (java.security.cert.CertificateParsingException unused) {
            return java.util.Collections.EMPTY_LIST;
        }
    }

    private static final boolean b(java.lang.String str, java.lang.String str2) {
        if (str == null || str.length() == 0 || str.startsWith(".") || str.endsWith("..") || str2 == null || str2.length() == 0 || str2.startsWith(".") || str2.endsWith("..")) {
            return false;
        }
        if (!str.endsWith(".")) {
            str = str.concat(".");
        }
        if (!str2.endsWith(".")) {
            str2 = str2.concat(".");
        }
        java.lang.String strP = ahvr.p(str2);
        if (!strP.contains("*")) {
            return str.equals(strP);
        }
        if (!strP.startsWith("*.") || strP.indexOf(42, 1) != -1 || str.length() < strP.length() || "*.".equals(strP)) {
            return false;
        }
        java.lang.String strSubstring = strP.substring(1);
        if (!str.endsWith(strSubstring)) {
            return false;
        }
        int length = str.length() - strSubstring.length();
        return length <= 0 || str.lastIndexOf(46, length + (-1)) == -1;
    }

    @Override // javax.net.ssl.HostnameVerifier
    public final boolean verify(java.lang.String str, javax.net.ssl.SSLSession sSLSession) {
        boolean z;
        java.lang.String str2;
        char[] cArr;
        char c;
        int i;
        char c2;
        int length = str.length();
        int i2 = 0;
        while (i2 < length && str.charAt(i2) < 128) {
            i2++;
        }
        int i3 = length;
        while (true) {
            z = true;
            if (i2 >= length) {
                break;
            }
            char cCharAt = str.charAt(i2);
            if (cCharAt >= 2048) {
                int length2 = str.length();
                int i4 = 0;
                while (i2 < length2) {
                    char cCharAt2 = str.charAt(i2);
                    if (cCharAt2 < 2048) {
                        i4 += (127 - cCharAt2) >>> 31;
                    } else {
                        i4 += 2;
                        if (cCharAt2 >= 55296 && cCharAt2 <= 57343) {
                            if (java.lang.Character.codePointAt(str, i2) == cCharAt2) {
                                throw new java.lang.IllegalArgumentException(a.bj(i2, "Unpaired surrogate at index "));
                            }
                            i2++;
                        }
                    }
                    i2++;
                }
                i3 += i4;
                break;
            }
            i3 += (127 - cCharAt) >>> 31;
            i2++;
        }
        if (i3 < length) {
            throw new java.lang.IllegalArgumentException("UTF-8 length does not fit in int: " + (((long) i3) + 4294967296L));
        }
        if (i3 == str.length()) {
            try {
                java.security.cert.X509Certificate x509Certificate = (java.security.cert.X509Certificate) sSLSession.getPeerCertificates()[0];
                if (b.matcher(str).matches()) {
                    java.util.List listA = a(x509Certificate, 7);
                    int size = listA.size();
                    for (int i5 = 0; i5 < size; i5++) {
                        if (!str.equalsIgnoreCase((java.lang.String) listA.get(i5))) {
                        }
                    }
                    return false;
                }
                java.lang.String strP = ahvr.p(str);
                java.util.List listA2 = a(x509Certificate, 2);
                int size2 = listA2.size();
                int i6 = 0;
                boolean z2 = false;
                while (i6 < size2) {
                    if (!b(strP, (java.lang.String) listA2.get(i6))) {
                        i6++;
                        z2 = true;
                    }
                }
                if (!z2) {
                    defpackage.aoga aogaVar = new defpackage.aoga(x509Certificate.getSubjectX500Principal());
                    aogaVar.c = 0;
                    aogaVar.d = 0;
                    aogaVar.e = 0;
                    aogaVar.f = 0;
                    java.lang.String str3 = aogaVar.a;
                    aogaVar.g = str3.toCharArray();
                    java.lang.String strC = aogaVar.c();
                    if (strC != null) {
                        while (true) {
                            java.lang.String str4 = "";
                            int i7 = aogaVar.c;
                            int i8 = aogaVar.b;
                            if (i7 == i8) {
                                break;
                            }
                            char c3 = aogaVar.g[i7];
                            boolean z3 = z;
                            if (c3 == '\"') {
                                int i9 = i7 + 1;
                                aogaVar.c = i9;
                                aogaVar.d = i9;
                                aogaVar.e = i9;
                                while (true) {
                                    int i10 = aogaVar.c;
                                    if (i10 == i8) {
                                        throw new java.lang.IllegalStateException("Unexpected end of DN: ".concat(java.lang.String.valueOf(str3)));
                                    }
                                    char[] cArr2 = aogaVar.g;
                                    char c4 = cArr2[i10];
                                    if (c4 == '\"') {
                                        aogaVar.c = i10 + 1;
                                        while (true) {
                                            int i11 = aogaVar.c;
                                            if (i11 >= i8 || aogaVar.g[i11] != ' ') {
                                                break;
                                            }
                                            aogaVar.c = i11 + 1;
                                        }
                                        char[] cArr3 = aogaVar.g;
                                        int i12 = aogaVar.d;
                                        str4 = new java.lang.String(cArr3, i12, aogaVar.e - i12);
                                        break;
                                    }
                                    int i13 = aogaVar.e;
                                    if (c4 == '\\') {
                                        cArr2[i13] = aogaVar.a();
                                    } else {
                                        cArr2[i13] = c4;
                                    }
                                    aogaVar.c++;
                                    aogaVar.e++;
                                }
                            } else if (c3 == '#') {
                                if (i7 + 4 >= i8) {
                                    throw new java.lang.IllegalStateException("Unexpected end of DN: ".concat(java.lang.String.valueOf(str3)));
                                }
                                aogaVar.d = i7;
                                aogaVar.c = i7 + 1;
                                while (true) {
                                    int i14 = aogaVar.c;
                                    if (i14 == i8 || (c = (cArr = aogaVar.g)[i14]) == '+' || c == ',' || c == ';') {
                                        aogaVar.e = i14;
                                        break;
                                    }
                                    if (c == ' ') {
                                        aogaVar.e = i14;
                                        aogaVar.c = i14 + 1;
                                        while (true) {
                                            int i15 = aogaVar.c;
                                            if (i15 >= i8 || aogaVar.g[i15] != ' ') {
                                                break;
                                            }
                                            aogaVar.c = i15 + 1;
                                        }
                                    } else {
                                        if (c >= 'A' && c <= 'F') {
                                            cArr[i14] = (char) (c + ' ');
                                        }
                                        aogaVar.c = i14 + 1;
                                    }
                                }
                                int i16 = aogaVar.e;
                                int i17 = aogaVar.d;
                                int i18 = i16 - i17;
                                if (i18 < 5 || (i18 & 1) == 0) {
                                    throw new java.lang.IllegalStateException("Unexpected end of DN: ".concat(java.lang.String.valueOf(str3)));
                                }
                                int i19 = i18 >> 1;
                                byte[] bArr = new byte[i19];
                                int i20 = i17 + 1;
                                int i21 = 0;
                                while (i21 < i19) {
                                    bArr[i21] = (byte) aogaVar.b(i20);
                                    i21++;
                                    i20 += 2;
                                }
                                str4 = new java.lang.String(aogaVar.g, aogaVar.d, i18);
                            } else if (c3 != '+' && c3 != ',' && c3 != ';') {
                                aogaVar.d = i7;
                                aogaVar.e = i7;
                                while (true) {
                                    int i22 = aogaVar.c;
                                    if (i22 >= i8) {
                                        char[] cArr4 = aogaVar.g;
                                        int i23 = aogaVar.d;
                                        str4 = new java.lang.String(cArr4, i23, aogaVar.e - i23);
                                        break;
                                    }
                                    char[] cArr5 = aogaVar.g;
                                    char c5 = cArr5[i22];
                                    if (c5 != ' ') {
                                        if (c5 != ';') {
                                            if (c5 == '\\') {
                                                int i24 = aogaVar.e;
                                                aogaVar.e = i24 + 1;
                                                cArr5[i24] = aogaVar.a();
                                                aogaVar.c++;
                                            } else if (c5 != '+' && c5 != ',') {
                                                int i25 = aogaVar.e;
                                                aogaVar.e = i25 + 1;
                                                cArr5[i25] = c5;
                                                aogaVar.c = i22 + 1;
                                            }
                                        }
                                        int i26 = aogaVar.d;
                                        str4 = new java.lang.String(cArr5, i26, aogaVar.e - i26);
                                        break;
                                    }
                                    int i27 = aogaVar.e;
                                    aogaVar.f = i27;
                                    aogaVar.c = i22 + 1;
                                    aogaVar.e = i27 + 1;
                                    cArr5[i27] = ' ';
                                    while (true) {
                                        i = aogaVar.c;
                                        if (i >= i8) {
                                            break;
                                        }
                                        char[] cArr6 = aogaVar.g;
                                        if (cArr6[i] != ' ') {
                                            break;
                                        }
                                        int i28 = aogaVar.e;
                                        aogaVar.e = i28 + 1;
                                        cArr6[i28] = ' ';
                                        aogaVar.c = i + 1;
                                    }
                                    if (i == i8 || (c2 = aogaVar.g[i]) == ',' || c2 == '+' || c2 == ';') {
                                        char[] cArr7 = aogaVar.g;
                                        int i29 = aogaVar.d;
                                        str4 = new java.lang.String(cArr7, i29, aogaVar.f - i29);
                                        break;
                                    }
                                }
                            }
                            if ("cn".equalsIgnoreCase(strC)) {
                                str2 = str4;
                            } else {
                                int i30 = aogaVar.c;
                                if (i30 >= i8) {
                                    break;
                                }
                                char c6 = aogaVar.g[i30];
                                if (c6 != ',' && c6 != ';' && c6 != '+') {
                                    throw new java.lang.IllegalStateException("Malformed DN: ".concat(java.lang.String.valueOf(str3)));
                                }
                                aogaVar.c = i30 + 1;
                                strC = aogaVar.c();
                                if (strC == null) {
                                    throw new java.lang.IllegalStateException("Malformed DN: ".concat(java.lang.String.valueOf(str3)));
                                }
                                z = z3;
                            }
                        }
                        str2 = null;
                    } else {
                        str2 = null;
                    }
                    if (str2 != null) {
                        return b(strP, str2);
                    }
                }
                return true;
            } catch (javax.net.ssl.SSLException unused) {
            }
        }
        return false;
    }
}
