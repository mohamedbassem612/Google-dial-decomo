package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class apoe implements javax.net.ssl.HostnameVerifier {
    public static final defpackage.apoe a = new defpackage.apoe();

    public static final java.util.List a(java.security.cert.X509Certificate x509Certificate, int i) {
        java.lang.Object obj;
        try {
            java.util.Collection<java.util.List<?>> subjectAlternativeNames = x509Certificate.getSubjectAlternativeNames();
            if (subjectAlternativeNames == null) {
                return defpackage.aokc.a;
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (java.util.List<?> list : subjectAlternativeNames) {
                if (list != null && list.size() >= 2 && defpackage.aooh.n(list.get(0), java.lang.Integer.valueOf(i)) && (obj = list.get(1)) != null) {
                    arrayList.add((java.lang.String) obj);
                }
            }
            return arrayList;
        } catch (java.security.cert.CertificateParsingException unused) {
            return defpackage.aokc.a;
        }
    }

    /* JADX WARN: Code duplicated, block: B:66:0x0107  */
    public static final boolean b(java.lang.String str, java.security.cert.X509Certificate x509Certificate) {
        boolean zN;
        int length;
        if (str == null) {
            defpackage.aooh.i("host");
        }
        if (x509Certificate == null) {
            defpackage.aooh.i("certificate");
        }
        defpackage.aorg aorgVar = defpackage.apju.a;
        if (str == null) {
            defpackage.aooh.i("<this>");
        }
        if (defpackage.apju.a.f(str)) {
            java.lang.String strA = defpackage.apju.a(str);
            if (strA != null) {
                java.util.List listA = a(x509Certificate, 7);
                if (!listA.isEmpty()) {
                    java.util.Iterator it = listA.iterator();
                    while (it.hasNext()) {
                        if (defpackage.aooh.n(strA, defpackage.apju.a((java.lang.String) it.next()))) {
                            return true;
                        }
                    }
                }
            }
        } else {
            java.lang.String strD = d(str);
            java.util.List<java.lang.String> listA2 = a(x509Certificate, 2);
            if (!listA2.isEmpty()) {
                for (java.lang.String strConcat : listA2) {
                    if (strD == null || strD.length() == 0 || strD.startsWith(".") || defpackage.aoov.r(strD, "..", false) || strConcat == null || strConcat.length() == 0 || strConcat.startsWith(".") || defpackage.aoov.r(strConcat, "..", false)) {
                        zN = false;
                    } else {
                        java.lang.String strConcat2 = !defpackage.aoov.r(strD, ".", false) ? strD.concat(".") : strD;
                        if (!defpackage.aoov.r(strConcat, ".", false)) {
                            strConcat = strConcat.concat(".");
                        }
                        java.lang.String strD2 = d(strConcat);
                        if (!defpackage.aoov.G(strD2, "*", false)) {
                            zN = defpackage.aooh.n(strConcat2, strD2);
                        } else if (!defpackage.aoov.ad(strD2, "*.") || defpackage.aoov.M(strD2, '*', 1) != -1 || strConcat2.length() < strD2.length() || defpackage.aooh.n("*.", strD2)) {
                            zN = false;
                        } else {
                            java.lang.String strSubstring = strD2.substring(1);
                            defpackage.aooh.e(strSubstring, "substring(...)");
                            if (!defpackage.aoov.r(strConcat2, strSubstring, false) || ((length = strConcat2.length() - strSubstring.length()) > 0 && defpackage.aoov.N(strConcat2, '.', length - 1, 4) != -1)) {
                                zN = false;
                            } else {
                                zN = true;
                            }
                        }
                    }
                    if (zN) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    private static final boolean c(java.lang.String str) {
        long j;
        int length = str.length();
        int length2 = str.length();
        if (str == null) {
            defpackage.aooh.i("<this>");
        }
        if (length2 > str.length()) {
            throw new java.lang.IllegalArgumentException("endIndex > string.length: " + length2 + " > " + str.length());
        }
        long j2 = 0;
        int i = 0;
        while (i < length2) {
            int i2 = i + 1;
            char cCharAt = str.charAt(i);
            if (cCharAt >= 128) {
                if (cCharAt < 2048) {
                    j = 2;
                } else if (cCharAt < 55296 || cCharAt > 57343) {
                    j = 3;
                } else {
                    char cCharAt2 = i2 < length2 ? str.charAt(i2) : (char) 0;
                    if (cCharAt <= 56319 && cCharAt2 >= 56320 && cCharAt2 <= 57343) {
                        j2 += 4;
                        i += 2;
                    }
                }
                j2 += j;
                i = i2;
            }
            j2++;
            i = i2;
        }
        return length == ((int) j2);
    }

    private static final java.lang.String d(java.lang.String str) {
        if (!c(str)) {
            return str;
        }
        java.util.Locale locale = java.util.Locale.US;
        defpackage.aooh.e(locale, "US");
        java.lang.String lowerCase = str.toLowerCase(locale);
        defpackage.aooh.e(lowerCase, "toLowerCase(...)");
        return lowerCase;
    }

    @Override // javax.net.ssl.HostnameVerifier
    public final boolean verify(java.lang.String str, javax.net.ssl.SSLSession sSLSession) {
        if (str == null) {
            defpackage.aooh.i("host");
        }
        if (sSLSession == null) {
            defpackage.aooh.i("session");
        }
        if (!c(str)) {
            return false;
        }
        try {
            java.security.cert.Certificate certificate = sSLSession.getPeerCertificates()[0];
            if (certificate == null) {
                defpackage.aooh.h("null cannot be cast to non-null type java.security.cert.X509Certificate");
            }
            return b(str, (java.security.cert.X509Certificate) certificate);
        } catch (javax.net.ssl.SSLException unused) {
            return false;
        }
    }
}
