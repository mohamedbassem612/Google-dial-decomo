package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class apmk {
    public static final defpackage.appb a;
    private static final java.lang.String[] b;
    private static final java.lang.String[] c;
    private static final java.lang.String[] d;

    static {
        defpackage.appb appbVar = defpackage.appb.a;
        a = defpackage.aoov.aQ("PRI * HTTP/2.0\r\n\r\nSM\r\n\r\n");
        b = new java.lang.String[]{"DATA", "HEADERS", "PRIORITY", "RST_STREAM", "SETTINGS", "PUSH_PROMISE", "PING", "GOAWAY", "WINDOW_UPDATE", "CONTINUATION"};
        c = new java.lang.String[64];
        java.lang.String[] strArr = new java.lang.String[256];
        for (int i = 0; i < 256; i++) {
            java.lang.String binaryString = java.lang.Integer.toBinaryString(i);
            defpackage.aooh.e(binaryString, "toBinaryString(...)");
            strArr[i] = defpackage.aoov.P(defpackage.apjx.c("%8s", binaryString), ' ', '0');
        }
        d = strArr;
        java.lang.String[] strArr2 = c;
        strArr2[0] = "";
        strArr2[1] = "END_STREAM";
        int[] iArr = {1};
        strArr2[8] = "PADDED";
        int i2 = iArr[0];
        strArr2[i2 | 8] = java.lang.String.valueOf(strArr2[i2]).concat("|PADDED");
        strArr2[4] = "END_HEADERS";
        strArr2[32] = "PRIORITY";
        strArr2[36] = "END_HEADERS|PRIORITY";
        int[] iArr2 = {4, 32, 36};
        for (int i3 = 0; i3 < 3; i3++) {
            int i4 = iArr2[i3];
            int i5 = iArr[0];
            int i6 = i5 | i4;
            java.lang.String[] strArr3 = c;
            strArr3[i6] = strArr3[i5] + '|' + strArr3[i4];
            strArr3[i6 | 8] = strArr3[i5] + '|' + strArr3[i4] + "|PADDED";
        }
        int length = c.length;
        for (int i7 = 0; i7 < 64; i7++) {
            java.lang.String[] strArr4 = c;
            if (strArr4[i7] == null) {
                strArr4[i7] = d[i7];
            }
        }
    }

    private apmk() {
    }

    public static final java.lang.String a(int i) {
        java.lang.String[] strArr = b;
        int length = strArr.length;
        return i < 10 ? strArr[i] : defpackage.apjx.c("0x%02x", java.lang.Integer.valueOf(i));
    }

    /* JADX WARN: Code duplicated, block: B:26:0x004c  */
    /* JADX WARN: Code duplicated, block: B:30:0x0058  */
    public static final java.lang.String b(boolean z, int i, int i2, int i3, int i4) {
        java.lang.String strQ;
        java.lang.String str;
        java.lang.String strA = a(i3);
        if (i4 == 0) {
            strQ = "";
        } else if (i3 == 2 || i3 == 3) {
            strQ = d[i4];
        } else if (i3 == 4 || i3 == 6) {
            strQ = i4 == 1 ? "ACK" : d[i4];
        } else if (i3 == 7 || i3 == 8) {
            strQ = d[i4];
        } else {
            java.lang.String[] strArr = c;
            int length = strArr.length;
            if (i4 < 64) {
                str = strArr[i4];
                defpackage.aooh.c(str);
            } else {
                str = d[i4];
            }
            if (i3 == 5) {
                if ((i4 & 4) != 0) {
                    strQ = defpackage.aoov.Q(str, "HEADERS", "PUSH_PROMISE");
                } else {
                    strQ = str;
                }
            } else if (i3 != 0 || (i4 & 32) == 0) {
                strQ = str;
            } else {
                strQ = defpackage.aoov.Q(str, "PRIORITY", "COMPRESSED");
            }
        }
        return defpackage.apjx.c("%s 0x%08x %5d %-13s %s", true != z ? ">>" : "<<", java.lang.Integer.valueOf(i), java.lang.Integer.valueOf(i2), strA, strQ);
    }

    public static final java.lang.String c(boolean z, int i, long j) {
        return defpackage.apjx.c("%s 0x%08x %5d %-13s %d", true != z ? ">>" : "<<", java.lang.Integer.valueOf(i), 4, a(8), java.lang.Long.valueOf(j));
    }
}
