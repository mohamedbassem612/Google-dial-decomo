package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class aprs {
    private static final java.util.regex.Pattern a = java.util.regex.Pattern.compile("(.*?)=\\?(.+?)\\?(\\w)\\?(.+?)\\?=", 32);

    /* JADX WARN: Code duplicated, block: B:101:0x0151 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:63:0x0129  */
    /* JADX WARN: Code duplicated, block: B:64:0x0131  */
    /* JADX WARN: Code duplicated, block: B:65:0x0133 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:66:0x0135  */
    /* JADX WARN: Code duplicated, block: B:69:0x013c  */
    /* JADX WARN: Code duplicated, block: B:71:0x0146 A[LOOP:1: B:67:0x0136->B:71:0x0146, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:74:0x0151 A[EDGE_INSN: B:74:0x0151->B:75:0x0154 BREAK  A[LOOP:1: B:67:0x0136->B:71:0x0146]] */
    /* JADX WARN: Code duplicated, block: B:94:0x0149 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:95:0x0160 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:96:0x015d A[SYNTHETIC] */
    public static java.lang.String a(java.lang.String str, defpackage.aprr aprrVar) {
        java.lang.String str2;
        int i;
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        java.util.regex.Matcher matcher = a.matcher(str);
        int iEnd = 0;
        boolean z = false;
        while (matcher.find()) {
            java.lang.String strGroup = matcher.group(1);
            java.lang.String strGroup2 = matcher.group(2);
            java.lang.String strGroup3 = matcher.group(3);
            java.lang.String strGroup4 = matcher.group(4);
            java.nio.charset.Charset charsetU = aodc.u(strGroup2);
            if (charsetU == null) {
                b(strGroup2, strGroup3, strGroup4, "Mime charser '", strGroup2, "' doesn't have a corresponding Java charset");
            } else if (strGroup4.length() == 0) {
                b(strGroup2, strGroup3, strGroup4, "Missing encoded text in encoded word");
            } else {
                try {
                    try {
                        if (strGroup3.equalsIgnoreCase("Q")) {
                            java.lang.String strName = charsetU.name();
                            java.lang.StringBuilder sb2 = new java.lang.StringBuilder(128);
                            for (int i2 = 0; i2 < strGroup4.length(); i2++) {
                                char cCharAt = strGroup4.charAt(i2);
                                if (cCharAt == '_') {
                                    sb2.append("=20");
                                } else {
                                    sb2.append(cCharAt);
                                }
                            }
                            java.lang.String string = sb2.toString();
                            try {
                                defpackage.aprt aprtVar = new defpackage.aprt(aodc.x(string), aprrVar);
                                try {
                                    defpackage.aptw aptwVar = new defpackage.aptw(string.length());
                                    while (true) {
                                        int i3 = aprtVar.read();
                                        if (i3 == -1) {
                                            break;
                                        }
                                        aptwVar.b(i3);
                                    }
                                    byte[] bArrE = aptwVar.e();
                                    aprtVar.close();
                                    str2 = new java.lang.String(bArrE, strName);
                                } catch (java.lang.Throwable th) {
                                    aprtVar.close();
                                    throw th;
                                }
                            } catch (java.io.IOException e) {
                                throw new java.lang.Error(e);
                            }
                        } else if (strGroup3.equalsIgnoreCase("B")) {
                            java.lang.String strName2 = charsetU.name();
                            try {
                                defpackage.apro aproVar = new defpackage.apro(aodc.x(strGroup4), aprrVar);
                                try {
                                    defpackage.aptw aptwVar2 = new defpackage.aptw(strGroup4.length());
                                    while (true) {
                                        int i4 = aproVar.read();
                                        if (i4 == -1) {
                                            break;
                                        }
                                        aptwVar2.b(i4);
                                    }
                                    byte[] bArrE2 = aptwVar2.e();
                                    aproVar.close();
                                    str2 = new java.lang.String(bArrE2, strName2);
                                } catch (java.lang.Throwable th2) {
                                    aproVar.close();
                                    throw th2;
                                }
                            } catch (java.io.IOException e2) {
                                throw new java.lang.Error(e2);
                            }
                        } else {
                            b(strGroup2, strGroup3, strGroup4, "Warning: Unknown encoding in encoded word");
                        }
                    } catch (java.lang.RuntimeException e3) {
                        b(strGroup2, strGroup3, strGroup4, "Could not decode (", e3.getMessage(), ") encoded word");
                    }
                } catch (java.io.UnsupportedEncodingException e4) {
                    b(strGroup2, strGroup3, strGroup4, "Unsupported encoding (", e4.getMessage(), ") in encoded word");
                }
                if (str2 == null) {
                    sb.append(matcher.group(0));
                } else {
                    if (!z) {
                        sb.append(strGroup);
                        break;
                    }
                    if (strGroup != null) {
                        throw new java.lang.IllegalArgumentException("String may not be null");
                    }
                    for (i = 0; i < strGroup.length(); i++) {
                        if (aodc.v(strGroup.charAt(i))) {
                            sb.append(strGroup);
                            break;
                        }
                    }
                    sb.append(str2);
                }
                iEnd = matcher.end();
                z = str2 != null;
            }
            str2 = null;
            if (str2 == null) {
                sb.append(matcher.group(0));
            } else {
                if (!z) {
                    sb.append(strGroup);
                    break;
                }
                if (strGroup != null) {
                    throw new java.lang.IllegalArgumentException("String may not be null");
                }
                while (i < strGroup.length()) {
                    if (aodc.v(strGroup.charAt(i))) {
                        sb.append(strGroup);
                        break;
                    }
                }
                sb.append(str2);
            }
            iEnd = matcher.end();
            if (str2 != null) {
            }
        }
        if (iEnd == 0) {
            return str;
        }
        sb.append(str.substring(iEnd));
        return sb.toString();
    }

    private static void b(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String... strArr) {
        java.lang.String str4 = "=?" + str + '?' + str2 + '?' + str3 + "?=";
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        for (java.lang.String str5 : strArr) {
            sb.append(str5);
        }
        sb.append(" (");
        sb.append(str4);
        sb.append(')');
        throw new java.lang.IllegalArgumentException(sb.toString());
    }
}
