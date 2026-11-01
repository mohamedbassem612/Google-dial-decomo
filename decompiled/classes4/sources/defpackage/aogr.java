package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
final class aogr implements apqd {
    int a;
    byte b;
    int c;
    int d;
    short e;
    private final appa f;

    public aogr(appa appaVar) {
        this.f = appaVar;
    }

    public final long b(apoy apoyVar, long j) throws java.io.IOException {
        int i;
        int iF;
        do {
            int i2 = this.d;
            appa appaVar = this.f;
            if (i2 != 0) {
                long jB = appaVar.b(apoyVar, java.lang.Math.min(8192L, i2));
                if (jB == -1) {
                    return -1L;
                }
                this.d -= (int) jB;
                return jB;
            }
            appaVar.A(this.e);
            this.e = (short) 0;
            if ((this.b & 4) != 0) {
                return -1L;
            }
            i = this.c;
            int iB = defpackage.aogv.b(appaVar);
            this.d = iB;
            this.a = iB;
            int iD = appaVar.d() & 255;
            this.b = (byte) (appaVar.d() & 255);
            java.util.logging.Logger logger = defpackage.aogv.a;
            byte b = (byte) iD;
            if (logger.isLoggable(java.util.logging.Level.FINE)) {
                logger.logp(java.util.logging.Level.FINE, "io.grpc.okhttp.internal.framed.Http2$ContinuationSource", "readContinuationHeader", defpackage.aogs.a(true, this.c, this.a, b, this.b));
            }
            iF = appaVar.f() & Integer.MAX_VALUE;
            this.c = iF;
            if (b != 9) {
                throw defpackage.aogv.c("%s != TYPE_CONTINUATION", java.lang.Byte.valueOf(b));
            }
        } while (iF == i);
        throw defpackage.aogv.c("TYPE_CONTINUATION streamId changed", new java.lang.Object[0]);
    }

    public final apqf fP() {
        return this.f.fP();
    }

    public final void close() {
    }
}
