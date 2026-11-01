package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
final class yav implements defpackage.yau {
    private final /* synthetic */ int $cid;
    private final java.lang.Object a;

    public yav(java.nio.ByteBuffer byteBuffer, int i) {
        this.$cid = i;
        this.a = byteBuffer;
        byteBuffer.order(java.nio.ByteOrder.BIG_ENDIAN);
    }

    @Override // defpackage.yau
    public final int a() throws java.io.IOException {
        int iD;
        short sD;
        if (this.$cid != 0) {
            iD = d() << 8;
            sD = d();
        } else {
            iD = d() << 8;
            sD = d();
        }
        return iD | sD;
    }

    @Override // defpackage.yau
    public final int b(byte[] bArr, int i) throws java.io.IOException {
        int i2 = 0;
        if (this.$cid != 0) {
            java.nio.ByteBuffer byteBuffer = (java.nio.ByteBuffer) this.a;
            int iMin = java.lang.Math.min(i, byteBuffer.remaining());
            if (iMin == 0) {
                return -1;
            }
            byteBuffer.get(bArr, 0, iMin);
            return iMin;
        }
        int i3 = 0;
        while (i2 < i) {
            i3 = ((java.io.InputStream) this.a).read(bArr, i2, i - i2);
            if (i3 == -1) {
                break;
            }
            i2 += i3;
        }
        if (i2 == 0 && i3 == -1) {
            throw new defpackage.yat();
        }
        return i2;
    }

    @Override // defpackage.yau
    public final long c(long j) throws java.io.IOException {
        if (this.$cid != 0) {
            java.nio.ByteBuffer byteBuffer = (java.nio.ByteBuffer) this.a;
            int iMin = (int) java.lang.Math.min(byteBuffer.remaining(), j);
            byteBuffer.position(byteBuffer.position() + iMin);
            return iMin;
        }
        if (j < 0) {
            return 0L;
        }
        long j2 = j;
        while (j2 > 0) {
            java.io.InputStream inputStream = (java.io.InputStream) this.a;
            long jSkip = inputStream.skip(j2);
            if (jSkip <= 0) {
                if (inputStream.read() == -1) {
                    break;
                }
                j2--;
            } else {
                j2 -= jSkip;
            }
        }
        return j - j2;
    }

    @Override // defpackage.yau
    public final short d() throws java.io.IOException {
        int i;
        int i2 = this.$cid;
        java.lang.Object obj = this.a;
        if (i2 != 0) {
            java.nio.ByteBuffer byteBuffer = (java.nio.ByteBuffer) obj;
            if (byteBuffer.remaining() <= 0) {
                throw new defpackage.yat();
            }
            i = byteBuffer.get() & 255;
        } else {
            i = ((java.io.InputStream) obj).read();
            if (i == -1) {
                throw new defpackage.yat();
            }
        }
        return (short) i;
    }

    public yav(java.io.InputStream inputStream, int i) {
        this.$cid = i;
        this.a = inputStream;
    }
}
