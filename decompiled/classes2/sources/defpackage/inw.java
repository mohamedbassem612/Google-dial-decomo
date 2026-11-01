package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class inw implements inv {
    public com.google.audio.hearing.common.resample.QResampler a;

    public final akzc a(akzc akzcVar, int i, int i2) {
        byte[] bArrArray;
        aooh.f(akzcVar, "input");
        if (i == 16000) {
            return akzcVar;
        }
        byte[] bArrD = akzcVar.D();
        if (i == 16000) {
            bArrArray = java.util.Arrays.copyOf(bArrD, bArrD.length);
            aooh.e(bArrArray, "copyOf(...)");
        } else {
            if (i <= 0) {
                throw new java.lang.IllegalArgumentException("resampleAudio must be called with an inputSampleRate greater than 0");
            }
            com.google.audio.hearing.common.resample.QResampler qResampler = this.a;
            double d = i;
            if (qResampler == null) {
                this.a = new com.google.audio.hearing.common.resample.QResampler(d, 16000.0d);
            } else if (qResampler.b != d || qResampler.c != 16000.0d) {
                qResampler.a();
                this.a = new com.google.audio.hearing.common.resample.QResampler(d, 16000.0d);
            }
            com.google.audio.hearing.common.resample.QResampler qResampler2 = this.a;
            aooh.d(qResampler2, "null cannot be cast to non-null type com.google.audio.hearing.common.resample.QResampler");
            java.nio.ShortBuffer shortBufferAsShortBuffer = java.nio.ByteBuffer.wrap(bArrD).order(java.nio.ByteOrder.nativeOrder()).asShortBuffer();
            aooh.e(shortBufferAsShortBuffer, "asShortBuffer(...)");
            java.nio.FloatBuffer floatBufferAllocate = java.nio.FloatBuffer.allocate(bArrD.length >> 1);
            while (shortBufferAsShortBuffer.hasRemaining()) {
                floatBufferAllocate.put(shortBufferAsShortBuffer.get() / 32768.0f);
            }
            float[] fArrArray = floatBufferAllocate.array();
            aooh.e(fArrArray, "array(...)");
            float[] fArrB = qResampler2.b(fArrArray);
            aooh.e(fArrB, "process(...)");
            aooh.f(fArrB, "<this>");
            java.nio.FloatBuffer floatBufferWrap = java.nio.FloatBuffer.wrap(fArrB);
            java.nio.ByteBuffer byteBufferOrder = java.nio.ByteBuffer.allocate(fArrB.length << 1).order(java.nio.ByteOrder.nativeOrder());
            aooh.e(byteBufferOrder, "order(...)");
            while (floatBufferWrap.hasRemaining()) {
                byteBufferOrder.putShort((short) (floatBufferWrap.get() * 32768.0f));
            }
            bArrArray = byteBufferOrder.array();
            aooh.e(bArrArray, "array(...)");
        }
        akzc akzcVarU = akzc.u(bArrArray);
        aooh.c(akzcVarU);
        return akzcVarU;
    }
}
