package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class bja {
    public static final java.lang.String a;
    public static final java.lang.String b;

    static {
        java.lang.String str;
        int length = "H".length();
        if (length != 0) {
            int i = 1;
            if (length != 1) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder("H".length() * 10);
                while (true) {
                    sb.append((java.lang.CharSequence) "H");
                    if (i == 10) {
                        break;
                    } else {
                        i++;
                    }
                }
                str = sb.toString();
            } else {
                char cCharAt = "H".charAt(0);
                char[] cArr = new char[10];
                for (int i2 = 0; i2 < 10; i2++) {
                    cArr[i2] = cCharAt;
                }
                str = new java.lang.String(cArr);
            }
        } else {
            str = "";
        }
        a = str;
        b = str + '\n' + str;
    }
}
