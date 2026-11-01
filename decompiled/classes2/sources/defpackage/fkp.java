package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class fkp {
    public static final int[] a = {1, 2, 3, 6};
    public static final int[] b = {48000, 44100, 32000};
    public static final int[] c = {24000, 22050, 16000};
    public static final int[] d = {2, 1, 2, 3, 3, 4, 4, 5};
    public static final int[] e = {32, 40, 48, 56, 64, 80, 96, 112, 128, 160, 192, 224, 256, 320, 384, 448, 512, 576, 640};
    private static final int[] f = {69, 87, 104, 121, 139, 174, 208, 243, 278, 348, 417, 487, 557, 696, 835, 975, 1114, 1253, 1393};

    public static int a(int i, int i2) {
        int i3;
        if (i < 0 || i >= 3 || i2 < 0 || (i3 = i2 >> 1) >= 19) {
            return -1;
        }
        int i4 = b[i];
        if (i4 == 44100) {
            return (f[i3] + (i2 & 1)) << 1;
        }
        int i5 = e[i3];
        return i4 == 32000 ? i5 * 6 : i5 << 2;
    }

    public static defpackage.eqg b(defpackage.etx etxVar, java.lang.String str, java.lang.String str2, androidx.media3.common.DrmInitData drmInitData) {
        defpackage.etv etvVar = new defpackage.etv();
        etvVar.i(etxVar);
        int i = b[etvVar.d(2)];
        etvVar.n(8);
        int i2 = d[etvVar.d(3)];
        if (etvVar.d(1) != 0) {
            i2++;
        }
        int i3 = e[etvVar.d(5)] * 1000;
        etvVar.h();
        etxVar.Q(etvVar.b());
        defpackage.eqf eqfVar = new defpackage.eqf();
        eqfVar.a = str;
        eqfVar.c("audio/ac3");
        eqfVar.F = i2;
        eqfVar.H = i;
        eqfVar.r = drmInitData;
        eqfVar.d = str2;
        eqfVar.h = i3;
        eqfVar.i = i3;
        return new defpackage.eqg(eqfVar);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0062  */
    public static defpackage.eqg c(defpackage.etx etxVar, java.lang.String str, java.lang.String str2, androidx.media3.common.DrmInitData drmInitData) {
        java.lang.String str3;
        defpackage.etv etvVar = new defpackage.etv();
        etvVar.i(etxVar);
        int iD = etvVar.d(13) * 1000;
        etvVar.n(3);
        int i = b[etvVar.d(2)];
        etvVar.n(10);
        int i2 = d[etvVar.d(3)];
        if (etvVar.d(1) != 0) {
            i2++;
        }
        etvVar.n(3);
        int iD2 = etvVar.d(4);
        etvVar.n(1);
        if (iD2 > 0) {
            etvVar.n(6);
            if (etvVar.d(1) != 0) {
                i2 += 2;
            }
            etvVar.n(1);
        }
        if (etvVar.a() > 7) {
            etvVar.n(7);
            if (etvVar.d(1) != 0) {
                str3 = "audio/eac3-joc";
            } else {
                str3 = "audio/eac3";
            }
        } else {
            str3 = "audio/eac3";
        }
        etvVar.h();
        etxVar.Q(etvVar.b());
        defpackage.eqf eqfVar = new defpackage.eqf();
        eqfVar.a = str;
        eqfVar.c(str3);
        eqfVar.F = i2;
        eqfVar.H = i;
        eqfVar.r = drmInitData;
        eqfVar.d = str2;
        eqfVar.i = iD;
        return new defpackage.eqg(eqfVar);
    }
}
