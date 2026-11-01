package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class fso {
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;

    private fso(int i, int i2, int i3, int i4, int i5, int i6) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = i5;
        this.f = i6;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static defpackage.fso a(java.lang.String str) {
        ahvr.bM(str.startsWith("Format:"));
        java.lang.String[] strArrSplit = android.text.TextUtils.split(str.substring(7), ",");
        int i = 0;
        int i2 = -1;
        int i3 = -1;
        int i4 = -1;
        int i5 = -1;
        int i6 = -1;
        while (true) {
            int length = strArrSplit.length;
            if (i >= length) {
                if (i3 == -1 || i4 == -1 || i6 == -1) {
                    return null;
                }
                return new defpackage.fso(i2, i3, i4, i5, i6, length);
            }
            java.lang.String strP = ahvr.p(strArrSplit[i].trim());
            switch (strP.hashCode()) {
                case 100571:
                    if (strP.equals("end")) {
                        i4 = i;
                    }
                    break;
                case 3556653:
                    if (strP.equals("text")) {
                        i6 = i;
                    }
                    break;
                case 102749521:
                    if (strP.equals("layer")) {
                        i2 = i;
                    }
                    break;
                case 109757538:
                    if (strP.equals("start")) {
                        i3 = i;
                    }
                    break;
                case 109780401:
                    if (strP.equals("style")) {
                        i5 = i;
                    }
                    break;
            }
            i++;
        }
    }

    public fso(int i, int i2, int i3, int i4, int i5, int i6, byte[] bArr) {
        this.e = i;
        this.c = i2;
        this.f = i3;
        this.a = i4;
        this.d = i5;
        this.b = i6;
    }
}
