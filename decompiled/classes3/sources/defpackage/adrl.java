package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public abstract class adrl extends java.io.InputStream implements j$.io.InputStreamRetargetInterface {
    private static final aimz c = aimz.i("com/google/android/libraries/micore/telephony/common/speechrecognition/interfaces/PausableAudioInputStream");
    private adrk d;
    public volatile boolean a = false;
    public aify b = aike.a;
    private boolean e = false;

    protected abstract int a(byte[] bArr, int i, int i2);

    protected abstract boolean b();

    public final synchronized void c(adrk adrkVar) {
        this.d = adrkVar;
        this.e = true;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.a = true;
    }

    protected final void finalize() {
        close();
    }

    @Override // java.io.InputStream
    public final synchronized int read(byte[] bArr, int i, int i2) {
        if (this.a || !b()) {
            close();
            return -1;
        }
        int iA = a(bArr, i, i2);
        if (iA > 0 && this.e) {
            this.d.b(java.util.Arrays.copyOfRange(bArr, i, i + iA));
        }
        if (!this.b.isEmpty()) {
            try {
                java.nio.ByteBuffer byteBufferOrder = java.nio.ByteBuffer.wrap(bArr, i, iA).order(java.nio.ByteOrder.LITTLE_ENDIAN);
                int i3 = iA / 2;
                short[] sArr = new short[i3];
                for (int i4 = 0; i4 < i3; i4++) {
                    sArr[i4] = byteBufferOrder.getShort();
                }
                ailk ailkVarY = this.b.y(0);
                while (ailkVarY.hasNext()) {
                    ((defpackage.adrh) ailkVarY.next()).a();
                }
                java.nio.ByteBuffer byteBufferOrder2 = java.nio.ByteBuffer.allocate(iA).order(java.nio.ByteOrder.LITTLE_ENDIAN);
                for (int i5 = 0; i5 < i3; i5++) {
                    byteBufferOrder2.putShort(sArr[i5]);
                }
                java.lang.System.arraycopy(byteBufferOrder2.array(), 0, bArr, i, iA);
            } catch (java.lang.RuntimeException e) {
                a.by(c.d(), "Error while applying audio effects", "com/google/android/libraries/micore/telephony/common/speechrecognition/interfaces/PausableAudioInputStream", "applyAudioEffects", (char) 159, "PausableAudioInputStream.java", e);
            }
        }
        return iA;
    }

    @Override // java.io.InputStream
    public final /* synthetic */ long transferTo(java.io.OutputStream outputStream) {
        return j$.io.DesugarInputStream.transferTo(this, outputStream);
    }

    @Override // java.io.InputStream
    public final int read() {
        throw new java.lang.UnsupportedOperationException("Not implemented.");
    }
}
