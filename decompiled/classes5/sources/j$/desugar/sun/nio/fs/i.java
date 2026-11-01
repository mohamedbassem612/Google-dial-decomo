package j$.desugar.sun.nio.fs;

/* JADX INFO: compiled from: r8-map-id-3adb9db301d96c2361dbb0b6577526ae53bce59ce57ea3dca6dd17a1bcfda15c */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes5.dex */
public final class i extends j$.nio.file.i {
    public final java.lang.String a;
    public final j$.desugar.sun.nio.fs.m b;

    public i(j$.desugar.sun.nio.fs.m mVar, java.lang.String str) {
        this.b = mVar;
        this.a = str;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // j$.nio.file.i
    public final j$.nio.file.Path f(java.lang.String str, java.lang.String[] strArr) {
        if (strArr.length != 0) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder();
            sb.append(str);
            for (java.lang.String str2 : strArr) {
                if (!str2.isEmpty()) {
                    if (sb.length() > 0) {
                        sb.append('/');
                    }
                    sb.append(str2);
                }
            }
            str = sb.toString();
        }
        return new j$.desugar.sun.nio.fs.o(this, str, this.a, "/");
    }

    /* JADX WARN: Code duplicated, block: B:126:0x0120 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:134:0x0126 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:139:0x00fd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:71:0x0101  */
    @Override // j$.nio.file.i
    public final j$.nio.file.PathMatcher i(java.lang.String str) {
        boolean z;
        int i;
        int iIndexOf = str.indexOf(58);
        boolean z2 = true;
        byte b = 0;
        if (iIndexOf <= 0 || iIndexOf == str.length()) {
            throw new java.lang.IllegalArgumentException(java.lang.String.format("Requested <syntax>:<pattern> spliterator(':') position(%d) is out of bound in %s", java.lang.Integer.valueOf(iIndexOf), str));
        }
        java.lang.String strSubstring = str.substring(0, iIndexOf);
        java.lang.String strSubstring2 = str.substring(iIndexOf + 1);
        if (strSubstring.equalsIgnoreCase("glob")) {
            java.lang.StringBuilder sb = new java.lang.StringBuilder("^");
            int i2 = 0;
            boolean z3 = false;
            while (i2 < strSubstring2.length()) {
                int i3 = i2 + 1;
                char cCharAt = strSubstring2.charAt(i2);
                if (cCharAt != '*') {
                    if (cCharAt != ',') {
                        char c = '/';
                        if (cCharAt == '/') {
                            z = z2;
                            sb.append(cCharAt);
                        } else if (cCharAt == '?') {
                            z = z2;
                            sb.append("[^/]");
                        } else if (cCharAt == '{') {
                            z = z2;
                            if (z3) {
                                throw new java.util.regex.PatternSyntaxException("Cannot nest groups", strSubstring2, i2);
                            }
                            sb.append("(?:(?:");
                            z3 = z;
                        } else if (cCharAt == '}') {
                            z = z2;
                            if (z3) {
                                sb.append("))");
                                z3 = false;
                            } else {
                                sb.append('}');
                            }
                        } else if (cCharAt == '[') {
                            sb.append("[[^/]&&[");
                            if (j$.com.android.tools.r8.a.R(strSubstring2, i3) == '^') {
                                sb.append("\\^");
                                i2 += 2;
                            } else {
                                if (j$.com.android.tools.r8.a.R(strSubstring2, i3) == '!') {
                                    sb.append('^');
                                    i3 = i2 + 2;
                                }
                                if (j$.com.android.tools.r8.a.R(strSubstring2, i3) == '-') {
                                    sb.append('-');
                                    i2 = i3 + 1;
                                } else {
                                    i2 = i3;
                                }
                            }
                            boolean z4 = false;
                            char c2 = 0;
                            while (true) {
                                if (i2 >= strSubstring2.length()) {
                                    z = z2;
                                    break;
                                }
                                int i4 = i2 + 1;
                                char cCharAt2 = strSubstring2.charAt(i2);
                                if (cCharAt2 == ']') {
                                    z = z2;
                                    i2 = i4;
                                    cCharAt = cCharAt2;
                                    break;
                                }
                                if (cCharAt2 == c) {
                                    throw new java.util.regex.PatternSyntaxException("Explicit 'name separator' in class", strSubstring2, i2);
                                }
                                if (cCharAt2 == '\\' || cCharAt2 == '[') {
                                    z = z2;
                                } else {
                                    z = z2;
                                    if (cCharAt2 == '&' && j$.com.android.tools.r8.a.R(strSubstring2, i4) == '&') {
                                    }
                                    sb.append(cCharAt2);
                                    if (cCharAt2 != '-') {
                                        c = '/';
                                        z2 = z;
                                        z4 = z2;
                                        i2 = i4;
                                        cCharAt = cCharAt2;
                                        c2 = cCharAt;
                                    } else {
                                        if (z4) {
                                            throw new java.util.regex.PatternSyntaxException("Invalid range", strSubstring2, i2);
                                        }
                                        i = i2 + 2;
                                        cCharAt = j$.com.android.tools.r8.a.R(strSubstring2, i4);
                                        if (cCharAt != 0 || cCharAt == ']') {
                                            i2 = i;
                                            break;
                                        }
                                        if (cCharAt < c2) {
                                            throw new java.util.regex.PatternSyntaxException("Invalid range", strSubstring2, i2 - 1);
                                        }
                                        sb.append(cCharAt);
                                        c = '/';
                                        z2 = z;
                                        i2 = i;
                                        z4 = false;
                                    }
                                }
                                sb.append('\\');
                                sb.append(cCharAt2);
                                if (cCharAt2 != '-') {
                                    if (z4) {
                                        throw new java.util.regex.PatternSyntaxException("Invalid range", strSubstring2, i2);
                                    }
                                    i = i2 + 2;
                                    cCharAt = j$.com.android.tools.r8.a.R(strSubstring2, i4);
                                    if (cCharAt != 0) {
                                    }
                                    i2 = i;
                                    break;
                                }
                                c = '/';
                                z2 = z;
                                z4 = z2;
                                i2 = i4;
                                cCharAt = cCharAt2;
                                c2 = cCharAt;
                            }
                            if (cCharAt != ']') {
                                throw new java.util.regex.PatternSyntaxException("Missing ']", strSubstring2, i2 - 1);
                            }
                            sb.append("]]");
                        } else if (cCharAt != '\\') {
                            if (".^$+{[]|()".indexOf(cCharAt) != -1) {
                                sb.append('\\');
                            }
                            sb.append(cCharAt);
                            z = z2;
                        } else {
                            if (i3 == strSubstring2.length()) {
                                throw new java.util.regex.PatternSyntaxException("No character to escape", strSubstring2, i2);
                            }
                            i2 += 2;
                            char cCharAt3 = strSubstring2.charAt(i3);
                            if ("\\*?[{".indexOf(cCharAt3) != -1 || ".^$+{[]|()".indexOf(cCharAt3) != -1) {
                                sb.append('\\');
                            }
                            sb.append(cCharAt3);
                            z = z2;
                        }
                    } else {
                        z = z2;
                        if (z3) {
                            sb.append(")|(?:");
                        } else {
                            sb.append(',');
                        }
                    }
                    i2 = i3;
                } else {
                    z = z2;
                    if (j$.com.android.tools.r8.a.R(strSubstring2, i3) == '*') {
                        sb.append(".*");
                        i2 += 2;
                    } else {
                        sb.append("[^/]*");
                        i2 = i3;
                    }
                }
                z2 = z;
            }
            if (z3) {
                throw new java.util.regex.PatternSyntaxException("Missing '}", strSubstring2, i2 - 1);
            }
            sb.append('$');
            strSubstring2 = sb.toString();
        } else if (!strSubstring.equalsIgnoreCase("regex")) {
            throw new java.lang.UnsupportedOperationException(j$.desugar.sun.nio.fs.h.a("Syntax '", strSubstring, "' not recognized"));
        }
        return new j$.desugar.sun.nio.fs.g(b, java.util.regex.Pattern.compile(strSubstring2));
    }

    @Override // j$.nio.file.i
    public final java.lang.Iterable j() {
        return j$.com.android.tools.r8.a.F(new java.lang.Object[]{new j$.desugar.sun.nio.fs.o(this, "/", this.a, "/")});
    }

    @Override // j$.nio.file.i
    public final j$.nio.file.spi.c v() {
        return this.b;
    }
}
