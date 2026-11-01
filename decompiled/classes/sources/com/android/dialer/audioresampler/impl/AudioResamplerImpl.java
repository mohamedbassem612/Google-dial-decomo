package com.android.dialer.audioresampler.impl;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class AudioResamplerImpl implements defpackage.inv {
    private static final defpackage.aimz a = defpackage.aimz.i("com/android/dialer/audioresampler/impl/AudioResamplerImpl");
    private final defpackage.ahzi b = defpackage.ahvr.bI(new defpackage.tzo(1));
    private final defpackage.aoin c;

    public AudioResamplerImpl(defpackage.aoin aoinVar) {
        this.c = aoinVar;
    }

    private static native short[] resampleAudioNative(short[] sArr, int i, int i2);

    @Override // defpackage.inv
    public final defpackage.akzc a(defpackage.akzc akzcVar, int i, int i2) {
        short[] sArrResampleAudioNative;
        if (i == i2) {
            return akzcVar;
        }
        int iC = akzcVar.c() / 2;
        short[] sArr = new short[iC];
        java.nio.ByteBuffer.wrap(akzcVar.D()).order(java.nio.ByteOrder.nativeOrder()).asShortBuffer().get(sArr);
        if (i <= 0) {
            throw new java.lang.IllegalArgumentException("resampleAudio must be called with an inputSampleRate greater than 0");
        }
        if (i2 <= 0) {
            throw new java.lang.IllegalArgumentException("resampleAudio must be called with an outputSampleRate greater than 0");
        }
        if (((java.lang.Boolean) this.c.a()).booleanValue()) {
            ((defpackage.aimw) ((defpackage.aimw) a.b()).l("com/android/dialer/audioresampler/impl/AudioResamplerImpl", "resampleAudio", 78, "AudioResamplerImpl.java")).v("resampling using QResampler");
            com.google.audio.hearing.common.resample.QResampler qResampler = new com.google.audio.hearing.common.resample.QResampler(i, i2);
            byte[] bArr = new byte[iC << 1];
            java.nio.ByteBuffer.wrap(bArr).order(java.nio.ByteOrder.nativeOrder()).asShortBuffer().put(sArr);
            float[] fArrB = qResampler.b(defpackage.a.c(bArr));
            qResampler.a();
            byte[] bArr2 = new byte[fArrB.length << 1];
            int i3 = 0;
            for (float f : fArrB) {
                int i4 = i3 + 1;
                short s = (short) (f / 3.0517578E-5f);
                bArr2[i3] = (byte) (s & 255);
                i3 += 2;
                bArr2[i4] = (byte) ((s >> 8) & 255);
            }
            sArrResampleAudioNative = new short[defpackage.akzc.u(bArr2).c() >> 1];
            java.nio.ByteBuffer.wrap(bArr2).order(java.nio.ByteOrder.nativeOrder()).asShortBuffer().get(sArrResampleAudioNative);
        } else {
            this.b.eZ();
            sArrResampleAudioNative = resampleAudioNative(sArr, i, i2);
        }
        byte[] bArr3 = new byte[sArrResampleAudioNative.length << 1];
        java.nio.ByteBuffer.wrap(bArr3).order(java.nio.ByteOrder.nativeOrder()).asShortBuffer().put(sArrResampleAudioNative);
        return defpackage.akzc.u(bArr3);
    }
}
