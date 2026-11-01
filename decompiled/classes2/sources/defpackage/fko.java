package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class fko {
    public static final /* synthetic */ int a = 0;
    private static final int[] b = {96000, 88200, 64000, 48000, 44100, 32000, 24000, 22050, 16000, 12000, 11025, 8000, 7350};
    private static final int[] c = {0, 1, 2, 3, 4, 5, 6, 8, -1, -1, -1, 7, 8, -1, 8, -1};

    public static defpackage.fsi a(byte[] bArr) {
        return b(new defpackage.etv(bArr), false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:52:0x00a1, code lost:
    
        if (r13 != 3) goto L59;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.fsi b(defpackage.etv r13, boolean r14) throws defpackage.era {
        /*
            Method dump skipped, instruction units count: 234
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fko.b(etv, boolean):fsi");
    }

    private static int c(defpackage.etv etvVar) {
        int iD = etvVar.d(5);
        return iD == 31 ? etvVar.d(6) + 32 : iD;
    }

    private static int d(defpackage.etv etvVar) throws defpackage.era {
        int iD = etvVar.d(4);
        if (iD == 15) {
            if (etvVar.a() >= 24) {
                return etvVar.d(24);
            }
            throw new defpackage.era("AAC header insufficient data", null, true, 1);
        }
        if (iD < 13) {
            return b[iD];
        }
        throw new defpackage.era("AAC header wrong Sampling Frequency Index", null, true, 1);
    }
}
