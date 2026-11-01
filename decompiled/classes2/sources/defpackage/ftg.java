package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class ftg {
    public static final java.util.regex.Pattern a = java.util.regex.Pattern.compile("\\[voice=\"([^\"]*)\"\\]");
    public static final java.util.regex.Pattern b = java.util.regex.Pattern.compile("^((?:[0-9]*\\.)?[0-9]+)(px|em|%)$");
    public final defpackage.etx c = new defpackage.etx();
    public final java.lang.StringBuilder d = new java.lang.StringBuilder();

    public static java.lang.String a(defpackage.etx etxVar, java.lang.StringBuilder sb) {
        char c;
        sb.setLength(0);
        int i = etxVar.c;
        int i2 = etxVar.d;
        loop0: while (true) {
            boolean z = false;
            while (true) {
                if (i < i2 && !z) {
                    c = (char) etxVar.b[i];
                    if ((c >= 'A' && c <= 'Z') || ((c >= 'a' && c <= 'z') || ((c >= '0' && c <= '9') || c == '#' || c == '-' || c == '.' || c == '_'))) {
                        break;
                    }
                    z = true;
                } else {
                    break loop0;
                }
            }
            sb.append(c);
            i++;
        }
        etxVar.R(i - etxVar.c);
        return sb.toString();
    }

    static java.lang.String b(defpackage.etx etxVar, java.lang.StringBuilder sb) {
        c(etxVar);
        if (etxVar.d() == 0) {
            return null;
        }
        java.lang.String strA = a(etxVar, sb);
        return !strA.isEmpty() ? strA : java.lang.String.valueOf((char) etxVar.n());
    }

    static void c(defpackage.etx etxVar) {
        while (true) {
            for (boolean z = true; etxVar.d() > 0 && z; z = false) {
                int i = etxVar.c;
                byte[] bArr = etxVar.b;
                byte b2 = bArr[i];
                char c = (char) b2;
                if (c == '\t' || c == '\n' || c == '\f' || c == '\r' || c == ' ') {
                    etxVar.R(1);
                } else {
                    int i2 = etxVar.d;
                    if (i + 2 <= i2) {
                        int i3 = i + 1;
                        if (b2 == 47) {
                            int i4 = i + 2;
                            if (bArr[i3] == 42) {
                                while (true) {
                                    int i5 = i4 + 1;
                                    if (i5 >= i2) {
                                        break;
                                    }
                                    if (((char) bArr[i4]) == '*' && ((char) bArr[i5]) == '/') {
                                        i2 = i4 + 2;
                                        i4 = i2;
                                    } else {
                                        i4 = i5;
                                    }
                                }
                                etxVar.R(i2 - etxVar.c);
                            }
                        } else {
                            continue;
                        }
                    }
                }
            }
            return;
        }
    }
}
