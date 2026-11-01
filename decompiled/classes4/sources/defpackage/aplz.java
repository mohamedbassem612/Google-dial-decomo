package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
final class aplz extends defpackage.aplw {
    final /* synthetic */ defpackage.apmc c;
    private long d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aplz(defpackage.apmc apmcVar, apiw apiwVar, long j) {
        super(apmcVar, apiwVar);
        this.c = apmcVar;
        this.d = j;
        if (j == 0) {
            c(apiu.a);
        }
    }

    @Override // defpackage.aplw
    public final long b(apoy apoyVar, long j) throws java.io.IOException {
        if (this.a) {
            throw new java.lang.IllegalStateException("closed");
        }
        long j2 = this.d;
        if (j2 == 0) {
            return -1L;
        }
        long jB = super.b(apoyVar, java.lang.Math.min(j2, 8192L));
        if (jB == -1) {
            this.c.c.g();
            java.net.ProtocolException protocolException = new java.net.ProtocolException("unexpected end of stream");
            c(defpackage.apmc.a);
            throw protocolException;
        }
        long j3 = this.d - jB;
        this.d = j3;
        if (j3 == 0) {
            c(apiu.a);
        }
        return jB;
    }

    public final void close() {
        if (this.a) {
            return;
        }
        if (this.d != 0 && !apjx.m(this, java.util.concurrent.TimeUnit.MILLISECONDS)) {
            this.c.c.g();
            c(defpackage.apmc.a);
        }
        d();
    }
}
