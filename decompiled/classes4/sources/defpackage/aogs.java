package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class aogs {
    private static final java.lang.String[] a = {"DATA", "HEADERS", "PRIORITY", "RST_STREAM", "SETTINGS", "PUSH_PROMISE", "PING", "GOAWAY", "WINDOW_UPDATE", "CONTINUATION"};
    private static final java.lang.String[] b = new java.lang.String[64];
    private static final java.lang.String[] c = new java.lang.String[256];

    static {
        for (int i = 0; i < 256; i++) {
            c[i] = java.lang.String.format("%8s", java.lang.Integer.toBinaryString(i)).replace(' ', '0');
        }
        java.lang.String[] strArr = b;
        strArr[0] = "";
        strArr[1] = "END_STREAM";
        int[] iArr = {1};
        strArr[8] = "PADDED";
        int i2 = iArr[0];
        strArr[i2 | 8] = java.lang.String.valueOf(strArr[i2]).concat("|PADDED");
        strArr[4] = "END_HEADERS";
        strArr[32] = "PRIORITY";
        strArr[36] = "END_HEADERS|PRIORITY";
        int[] iArr2 = {4, 32, 36};
        for (int i3 = 0; i3 < 3; i3++) {
            int i4 = iArr2[i3];
            int i5 = iArr[0];
            int i6 = i5 | i4;
            java.lang.String[] strArr2 = b;
            strArr2[i6] = strArr2[i5] + '|' + strArr2[i4];
            strArr2[i6 | 8] = strArr2[i5] + '|' + strArr2[i4] + "|PADDED";
        }
        for (int i7 = 0; i7 < 64; i7++) {
            java.lang.String[] strArr3 = b;
            if (strArr3[i7] == null) {
                strArr3[i7] = c[i7];
            }
        }
    }

    aogs() {
    }

    /* JADX WARN: Code duplicated, block: B:30:0x005c  */
    /* JADX WARN: Code duplicated, block: B:34:0x0068  */
    public static java.lang.String a(boolean z, int i, int i2, byte b2, byte b3) {
        java.lang.String strReplace;
        java.lang.String str = b2 < 10 ? a[b2] : java.lang.String.format("0x%02x", java.lang.Byte.valueOf(b2));
        if (b3 == 0) {
            strReplace = "";
        } else if (b2 == 2 || b2 == 3) {
            strReplace = c[b3];
        } else if (b2 == 4 || b2 == 6) {
            strReplace = b3 == 1 ? "ACK" : c[b3];
        } else if (b2 == 7 || b2 == 8) {
            strReplace = c[b3];
        } else {
            java.lang.String str2 = b3 < 64 ? b[b3] : c[b3];
            if (b2 == 5) {
                if ((b3 & 4) != 0) {
                    strReplace = str2.replace("HEADERS", "PUSH_PROMISE");
                } else {
                    strReplace = str2;
                }
            } else if (b2 != 0 || (b3 & 32) == 0) {
                strReplace = str2;
            } else {
                strReplace = str2.replace("PRIORITY", "COMPRESSED");
            }
        }
        return java.lang.String.format(java.util.Locale.US, "%s 0x%08x %5d %-13s %s", true != z ? ">>" : "<<", java.lang.Integer.valueOf(i), java.lang.Integer.valueOf(i2), str, strReplace);
    }
}
