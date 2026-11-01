package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class evp extends defpackage.evm {
    private defpackage.evv a;
    private byte[] b;
    private int c;
    private int d;

    public evp() {
        super(false);
    }

    @Override // defpackage.epz
    public final int a(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        int i3 = this.d;
        if (i3 == 0) {
            return -1;
        }
        int iMin = java.lang.Math.min(i2, i3);
        byte[] bArr2 = this.b;
        java.lang.String str = eum.a;
        java.lang.System.arraycopy(bArr2, this.c, bArr, i, iMin);
        this.c += iMin;
        this.d -= iMin;
        g(iMin);
        return iMin;
    }

    @Override // defpackage.evr
    public final long b(defpackage.evv evvVar) throws defpackage.evs, defpackage.era {
        j();
        this.a = evvVar;
        android.net.Uri uriNormalizeScheme = evvVar.a.normalizeScheme();
        java.lang.String scheme = uriNormalizeScheme.getScheme();
        ahvr.bR("data".equals(scheme), "Unsupported scheme: %s", scheme);
        java.lang.String schemeSpecificPart = uriNormalizeScheme.getSchemeSpecificPart();
        java.lang.String str = eum.a;
        java.lang.String[] strArrSplit = schemeSpecificPart.split(",", -1);
        if (strArrSplit.length != 2) {
            throw new defpackage.era("Unexpected URI format: ".concat(java.lang.String.valueOf(java.lang.String.valueOf(uriNormalizeScheme))), null, true, 0);
        }
        java.lang.String str2 = strArrSplit[1];
        if (strArrSplit[0].contains(";base64")) {
            try {
                this.b = android.util.Base64.decode(str2, 0);
            } catch (java.lang.IllegalArgumentException e) {
                throw new defpackage.era("Error while parsing Base64 encoded string: ".concat(java.lang.String.valueOf(str2)), e, true, 0);
            }
        } else {
            this.b = eum.Z(j$.net.URLDecoder.decode(str2, java.nio.charset.StandardCharsets.US_ASCII.name()));
        }
        long j = evvVar.e;
        int length = this.b.length;
        if (j > length) {
            this.b = null;
            throw new defpackage.evs(2008);
        }
        int i = (int) j;
        this.c = i;
        this.d = length - i;
        long j2 = evvVar.f;
        i(evvVar);
        return this.d;
    }

    @Override // defpackage.evr
    public final android.net.Uri c() {
        defpackage.evv evvVar = this.a;
        if (evvVar != null) {
            return evvVar.a;
        }
        return null;
    }

    @Override // defpackage.evr
    public final void d() {
        if (this.b != null) {
            this.b = null;
            h();
        }
        this.a = null;
    }
}
