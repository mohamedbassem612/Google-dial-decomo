package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class ict extends aomh implements aonn {
    java.lang.Object a;
    int b;
    int c;
    final /* synthetic */ akzc d;
    final /* synthetic */ defpackage.icu e;
    final /* synthetic */ aogy f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ict(aogy aogyVar, akzc akzcVar, defpackage.icu icuVar, aoln aolnVar) {
        super(2, aolnVar);
        this.f = aogyVar;
        this.d = akzcVar;
        this.e = icuVar;
    }

    public final /* bridge */ /* synthetic */ java.lang.Object a(java.lang.Object obj, java.lang.Object obj2) {
        return c((aoss) obj, (aoln) obj2).b(aojh.a);
    }

    public final java.lang.Object b(java.lang.Object obj) {
        java.lang.Object objB;
        int i;
        defpackage.icu icuVar;
        aolu aoluVar = aolu.a;
        if (this.c != 0) {
            i = this.b;
            objB = this.a;
            aooc.af(obj);
        } else {
            aooc.af(obj);
            aogy aogyVar = this.f;
            akzc akzcVar = this.d;
            aooh.f(akzcVar, "value");
            ((aojw) aogyVar.b).addLast(akzcVar);
            defpackage.icu icuVar2 = this.e;
            aogy aogyVar2 = icuVar2.l;
            int iK = aogyVar2.k();
            aogy aogyVar3 = icuVar2.k;
            int iMin = java.lang.Math.min(iK, aogyVar3.k()) / 2;
            int i2 = iMin << 1;
            byte[] bArrD = aogyVar2.l(i2).D();
            byte[] bArrD2 = aogyVar3.l(i2).D();
            akzb akzbVar = new akzb(iMin << 2);
            aopo aopoVarB = aooc.B(aooc.C(0, i2), 2);
            int i3 = aopoVarB.a;
            int i4 = aopoVarB.b;
            int i5 = aopoVarB.c;
            if ((i5 > 0 && i3 <= i4) || (i5 < 0 && i4 <= i3)) {
                while (true) {
                    akzbVar.write(bArrD2, i3, 2);
                    akzbVar.write(bArrD, i3, 2);
                    if (i3 == i4) {
                        break;
                    }
                    i3 += i5;
                }
            }
            objB = akzbVar.b();
            aooh.e(objB, "toByteString(...)");
            i = 0;
        }
        do {
            akzc akzcVar2 = (akzc) objB;
            if (i < akzcVar2.c()) {
                icuVar = this.e;
                android.media.MediaCodec mediaCodec = icuVar.f;
                android.media.MediaCodec mediaCodec2 = null;
                if (mediaCodec == null) {
                    aooh.j("codec");
                    mediaCodec = null;
                }
                int iDequeueInputBuffer = mediaCodec.dequeueInputBuffer(0L);
                if (iDequeueInputBuffer == -1) {
                    defpackage.icu.b.b().g(1, java.util.concurrent.TimeUnit.MINUTES).l("com/android/dialer/audio/recorder/impl/RecorderImpl", "write$<anonymous>", 167, "RecorderImpl.kt").v("input buffer full");
                } else {
                    android.media.MediaCodec mediaCodec3 = icuVar.f;
                    if (mediaCodec3 == null) {
                        aooh.j("codec");
                        mediaCodec3 = null;
                    }
                    java.nio.ByteBuffer inputBuffer = mediaCodec3.getInputBuffer(iDequeueInputBuffer);
                    if (inputBuffer == null) {
                        throw new java.lang.IllegalStateException("getInputBuffer() not supposed to return null with index from dequeueInputBuffer()");
                    }
                    int iMin2 = java.lang.Math.min(akzcVar2.c() - i, inputBuffer.capacity());
                    inputBuffer.put(akzcVar2.D(), i, iMin2);
                    android.media.MediaCodec mediaCodec4 = icuVar.f;
                    if (mediaCodec4 == null) {
                        aooh.j("codec");
                    } else {
                        mediaCodec2 = mediaCodec4;
                    }
                    long j = icuVar.h;
                    java.util.concurrent.TimeUnit timeUnit = java.util.concurrent.TimeUnit.SECONDS;
                    mediaCodec2.queueInputBuffer(iDequeueInputBuffer, 0, iMin2, (((j * 1000000) / 2) / 2) / 16000, 0);
                    i += iMin2;
                    icuVar.h += iMin2;
                    this.a = objB;
                    this.b = i;
                    this.c = 1;
                }
            }
            return aojh.a;
        } while (icuVar.e(this) != aoluVar);
        return aoluVar;
    }

    public final aoln c(java.lang.Object obj, aoln aolnVar) {
        return new defpackage.ict(this.f, this.d, this.e, aolnVar);
    }
}
