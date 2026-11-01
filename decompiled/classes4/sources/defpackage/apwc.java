package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final /* synthetic */ class apwc implements defpackage.apwn {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ defpackage.apwe a;
    public final /* synthetic */ boolean b;

    public /* synthetic */ apwc(defpackage.apwe apweVar, boolean z, int i) {
        this.$cid = i;
        this.a = apweVar;
        this.b = z;
    }

    @Override // defpackage.apwn
    public final void a() throws java.io.IOException {
        int i = this.$cid;
        defpackage.apwe apweVar = this.a;
        if (i != 0) {
            defpackage.apwx apwxVar = apweVar.c;
            long length = apwxVar.getLength();
            apweVar.e = length;
            if (length == 0) {
                apweVar.f();
                return;
            }
            if (length <= 0 || length >= 8192) {
                apweVar.d = java.nio.ByteBuffer.allocateDirect(8192);
            } else {
                apweVar.d = java.nio.ByteBuffer.allocateDirect(((int) length) + 1);
            }
            long j = apweVar.e;
            if (j > 0) {
                apweVar.h.setFixedLengthStreamingMode(j);
            } else {
                apweVar.h.setChunkedStreamingMode(8192);
            }
            if (this.b) {
                apweVar.c();
                return;
            } else {
                apweVar.a.set(1);
                apwxVar.rewind(apweVar);
                return;
            }
        }
        long j2 = apweVar.e;
        if (j2 != -1 && j2 - apweVar.f < apweVar.d.remaining()) {
            apweVar.g(new java.lang.IllegalArgumentException(java.lang.String.format(java.util.Locale.getDefault(), "Read upload data length %d exceeds expected length %d", java.lang.Long.valueOf(apweVar.f + ((long) apweVar.d.remaining())), java.lang.Long.valueOf(apweVar.e))));
            return;
        }
        boolean z = this.b;
        if (apweVar.d.remaining() == 0 && !z) {
            apweVar.g(new java.lang.IllegalStateException("Bytes read can't be zero except for last chunk!"));
            return;
        }
        long j3 = apweVar.f;
        java.nio.ByteBuffer byteBuffer = apweVar.d;
        int iWrite = 0;
        while (byteBuffer.hasRemaining()) {
            iWrite += apweVar.i.write(byteBuffer);
        }
        apweVar.j.flush();
        long j4 = j3 + ((long) iWrite);
        apweVar.f = j4;
        long j5 = apweVar.e;
        if (j4 >= j5) {
            if (j5 == -1) {
                if (z) {
                    j5 = -1;
                }
            }
            if (j5 == -1) {
                apweVar.f();
                return;
            } else if (j5 == j4) {
                apweVar.f();
                return;
            } else {
                apweVar.g(new java.lang.IllegalArgumentException(java.lang.String.format(java.util.Locale.getDefault(), "Read upload data length %d exceeds expected length %d", java.lang.Long.valueOf(apweVar.f), java.lang.Long.valueOf(apweVar.e))));
                return;
            }
        }
        apweVar.a.set(0);
        apweVar.b();
    }
}
