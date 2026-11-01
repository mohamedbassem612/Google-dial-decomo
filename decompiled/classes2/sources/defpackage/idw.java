package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final /* synthetic */ class idw implements java.util.concurrent.Callable {
    public final /* synthetic */ defpackage.idt a;
    public final /* synthetic */ akzc b;

    public /* synthetic */ idw(defpackage.idt idtVar, akzc akzcVar) {
        this.a = idtVar;
        this.b = akzcVar;
    }

    @Override // java.util.concurrent.Callable
    public final java.lang.Object call() throws java.io.IOException {
        android.media.MediaFormat mediaFormatCreateAudioFormat;
        defpackage.idz idxVar;
        long j;
        int i;
        defpackage.idt idtVar = this.a;
        char c = 2;
        ahvr.bN(idtVar.c == 2, "invalid config");
        akzc akzcVar = this.b;
        ahvr.bN(!akzcVar.C(), "no data to encode");
        defpackage.idr idrVar = idtVar.c == 2 ? (defpackage.idr) idtVar.d : defpackage.idr.a;
        int iC = defpackage.hgu.c(idrVar.c);
        if (iC == 0) {
            throw null;
        }
        int i2 = iC - 1;
        if (i2 == 0) {
            mediaFormatCreateAudioFormat = android.media.MediaFormat.createAudioFormat("audio/flac", idrVar.e, idrVar.f);
            mediaFormatCreateAudioFormat.setInteger("bitrate", idrVar.h);
            mediaFormatCreateAudioFormat.setInteger("flac-compression-level", (idrVar.c == 5 ? (defpackage.idq) idrVar.d : defpackage.idq.a).c);
        } else {
            if (i2 != 1) {
                throw new java.lang.UnsupportedOperationException("unsupported format");
            }
            mediaFormatCreateAudioFormat = android.media.MediaFormat.createAudioFormat("audio/mp4a-latm", idrVar.e, idrVar.f);
            mediaFormatCreateAudioFormat.setInteger("bitrate", idrVar.h);
        }
        java.lang.String strFindEncoderForFormat = new android.media.MediaCodecList(0).findEncoderForFormat(mediaFormatCreateAudioFormat);
        ahvr.cj(strFindEncoderForFormat, "encoder not found");
        android.media.MediaCodec mediaCodecCreateByCodecName = android.media.MediaCodec.createByCodecName(strFindEncoderForFormat);
        mediaCodecCreateByCodecName.configure(mediaFormatCreateAudioFormat, (android.view.Surface) null, (android.media.MediaCrypto) null, 1);
        java.io.File file = new java.io.File(idtVar.e);
        try {
            java.lang.String str = idtVar.e;
            int iC2 = defpackage.hgu.c(idrVar.c);
            int i3 = iC2 - 1;
            if (iC2 == 0) {
                throw null;
            }
            if (i3 == 0) {
                idxVar = new defpackage.idx(idrVar, str);
            } else {
                if (i3 != 1) {
                    throw new java.lang.UnsupportedOperationException("unsupported format");
                }
                idxVar = new defpackage.idy(idrVar, str);
            }
            try {
                mediaCodecCreateByCodecName.start();
                int i4 = 0;
                while (true) {
                    if (i4 >= akzcVar.c()) {
                        c = c;
                        file = file;
                        j = 0;
                    } else {
                        j = 0;
                        int iDequeueInputBuffer = mediaCodecCreateByCodecName.dequeueInputBuffer(0L);
                        if (iDequeueInputBuffer < 0) {
                            i = 0;
                        } else {
                            java.nio.ByteBuffer inputBuffer = mediaCodecCreateByCodecName.getInputBuffer(iDequeueInputBuffer);
                            ahvr.cj(inputBuffer, "failed to get input buffer");
                            int iMin = java.lang.Math.min(inputBuffer.capacity(), akzcVar.c() - i4);
                            inputBuffer.clear();
                            inputBuffer.put(akzcVar.D(), i4, iMin);
                            inputBuffer.flip();
                            int i5 = i4 + iMin;
                            int iC3 = akzcVar.c();
                            java.util.concurrent.TimeUnit timeUnit = java.util.concurrent.TimeUnit.SECONDS;
                            mediaCodecCreateByCodecName.queueInputBuffer(iDequeueInputBuffer, 0, iMin, (1000000 * ((long) i4)) / ((long) (idrVar.e * idrVar.g)), i5 == iC3 ? 4 : 0);
                            i = iMin;
                        }
                        i4 += i;
                    }
                    android.media.MediaCodec.BufferInfo bufferInfo = new android.media.MediaCodec.BufferInfo();
                    int iDequeueOutputBuffer = mediaCodecCreateByCodecName.dequeueOutputBuffer(bufferInfo, j);
                    if (iDequeueOutputBuffer == -2) {
                        idxVar.a(mediaCodecCreateByCodecName.getOutputFormat());
                    } else if (iDequeueOutputBuffer >= 0) {
                        java.nio.ByteBuffer outputBuffer = mediaCodecCreateByCodecName.getOutputBuffer(iDequeueOutputBuffer);
                        ahvr.cj(outputBuffer, "no encoded data");
                        outputBuffer.position(bufferInfo.offset);
                        outputBuffer.limit(bufferInfo.offset + bufferInfo.size);
                        if ((bufferInfo.flags & 2) == 0) {
                            idxVar.b(outputBuffer, bufferInfo);
                        }
                        mediaCodecCreateByCodecName.releaseOutputBuffer(iDequeueOutputBuffer, false);
                    }
                    if ((i4 == akzcVar.c() && (bufferInfo.flags & 4) != 0) || (i4 == akzcVar.c() && (bufferInfo.flags & 4) != 0)) {
                        break;
                    }
                    file = file;
                    c = c;
                }
                idxVar.close();
                mediaCodecCreateByCodecName.stop();
                mediaCodecCreateByCodecName.release();
                akzx akzxVarM = defpackage.idv.a.m();
                java.lang.String absolutePath = file.getAbsolutePath();
                akzxVarM.u();
                defpackage.idv idvVar = (defpackage.idv) akzxVarM.b;
                j$.util.Objects.requireNonNull(absolutePath);
                idvVar.b |= 1;
                idvVar.c = absolutePath;
                long length = file.length();
                akzxVarM.u();
                defpackage.idv idvVar2 = (defpackage.idv) akzxVarM.b;
                idvVar2.b |= 2;
                idvVar2.d = length;
                return (defpackage.idv) akzxVarM.p();
            } catch (java.lang.Throwable th) {
                try {
                    idxVar.close();
                    throw th;
                } catch (java.lang.Throwable th2) {
                    th.addSuppressed(th2);
                    throw th;
                }
            }
        } catch (java.lang.Throwable th3) {
            mediaCodecCreateByCodecName.stop();
            mediaCodecCreateByCodecName.release();
            throw th3;
        }
    }
}
