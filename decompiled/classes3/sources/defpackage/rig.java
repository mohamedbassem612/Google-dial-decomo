package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class rig extends java.io.PipedInputStream implements j$.io.InputStreamRetargetInterface {
    private final int a;

    public rig() {
        super(65536);
        this.a = Integer.MAX_VALUE;
    }

    final synchronized void a(byte[] bArr, int i, int i2) {
        notifyAll();
        while (available() > this.a) {
            try {
                wait(1000L);
            } catch (java.lang.InterruptedException e) {
                java.lang.Thread.currentThread().interrupt();
                throw new java.lang.IllegalStateException(e);
            }
        }
        while (i2 > 0) {
            int i3 = i + 1;
            receive(bArr[i]);
            notifyAll();
            int i4 = i2 - 1;
            if (this.in > this.out) {
                int iMin = java.lang.Math.min(i4, this.buffer.length - this.in);
                java.lang.System.arraycopy(bArr, i3, this.buffer, this.in, iMin);
                this.in += iMin;
                i3 += iMin;
                i4 -= iMin;
                if (this.in == this.buffer.length) {
                    this.in = 0;
                }
                if (i4 == 0) {
                    break;
                }
            }
            int iMin2 = java.lang.Math.min(i4, this.out - this.in);
            java.lang.System.arraycopy(bArr, i3, this.buffer, this.in, iMin2);
            this.in += iMin2;
            i2 = i4 - iMin2;
            i = i3 + iMin2;
        }
    }

    @Override // java.io.PipedInputStream, java.io.InputStream
    public final synchronized int read() {
        int i;
        i = super.read();
        notifyAll();
        return i;
    }

    @Override // java.io.InputStream
    public final /* synthetic */ long transferTo(java.io.OutputStream outputStream) {
        return j$.io.DesugarInputStream.transferTo(this, outputStream);
    }

    @Override // java.io.PipedInputStream, java.io.InputStream
    public final synchronized int read(byte[] bArr, int i, int i2) {
        int i3;
        i3 = super.read(bArr, i, i2);
        notifyAll();
        return i3;
    }
}
