package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class lbg {
    private long a;
    private kui b;
    private long c;
    private j$.util.Optional d = j$.util.Optional.empty();
    private byte e;

    public final defpackage.lbh a() {
        kui kuiVar;
        if (this.e == 3 && (kuiVar = this.b) != null) {
            return new defpackage.lbh(this.a, kuiVar, this.c, this.d);
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        if ((this.e & 1) == 0) {
            sb.append(" callCreationTimeMillis");
        }
        if (this.b == null) {
            sb.append(" callRecordingDetails");
        }
        if ((this.e & 2) == 0) {
            sb.append(" lastModifiedTimestampMillis");
        }
        throw new java.lang.IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    public final void b(long j) {
        this.a = j;
        this.e = (byte) (this.e | 1);
    }

    public final void c(kui kuiVar) {
        if (kuiVar == null) {
            throw new java.lang.NullPointerException("Null callRecordingDetails");
        }
        this.b = kuiVar;
    }

    public final void d(j$.util.Optional optional) {
        if (optional == null) {
            throw new java.lang.NullPointerException("Null callRecordingExtras");
        }
        this.d = optional;
    }

    public final void e(long j) {
        this.c = j;
        this.e = (byte) (this.e | 2);
    }
}
