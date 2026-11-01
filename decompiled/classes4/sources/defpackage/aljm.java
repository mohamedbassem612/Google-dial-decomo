package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class aljm implements defpackage.allg {
    public static final aimz a = aimz.i("com/google/quality/views/extraction/kcube/bg/ondevice/core/infra/AudioIntentExtractionProcessor");
    public static final defpackage.aljl b = new defpackage.aljl(null);
    public final defpackage.allj c;
    public final java.util.concurrent.locks.ReentrantLock d = new java.util.concurrent.locks.ReentrantLock();
    public j$.util.Optional e = j$.util.Optional.empty();
    public final java.util.concurrent.atomic.AtomicBoolean f = new java.util.concurrent.atomic.AtomicBoolean(false);
    public defpackage.allo g;
    private final defpackage.alkw h;
    private defpackage.aloa i;
    private final defpackage.amac j;

    public aljm(defpackage.alli alliVar, defpackage.amac amacVar, defpackage.alkw alkwVar) {
        this.c = alliVar.a(defpackage.allh.a.name());
        this.j = amacVar;
        this.h = alkwVar;
    }

    @Override // defpackage.allg
    public final aihd a() {
        return aikn.a;
    }

    public final void c(byte[] bArr) {
        akzc akzcVarU = akzc.u(bArr);
        int iC = akzcVarU.c() >> 1;
        short[] sArr = new short[iC];
        java.nio.ByteBuffer.wrap(akzcVarU.D()).order(java.nio.ByteOrder.nativeOrder()).asShortBuffer().get(sArr);
        hgb.c(defpackage.alpt.a.b(), "resampling using QResampler", "com/google/quality/views/extraction/kcube/bg/ondevice/core/infra/utils/android/AndroidAudioResampler", "resampleAudio", 'D', "AndroidAudioResampler.java", (byte) 1, java.util.concurrent.TimeUnit.SECONDS);
        com.google.audio.hearing.common.resample.QResampler qResampler = new com.google.audio.hearing.common.resample.QResampler(16000.0d, 8000.0d);
        byte[] bArr2 = new byte[iC << 1];
        java.nio.ByteBuffer.wrap(bArr2).order(java.nio.ByteOrder.nativeOrder()).asShortBuffer().put(sArr);
        float[] fArrB = qResampler.b(a.c(bArr2));
        qResampler.a();
        byte[] bArr3 = new byte[fArrB.length << 1];
        int i = 0;
        for (float f : fArrB) {
            int i2 = i + 1;
            short s = (short) (f / 3.0517578E-5f);
            bArr3[i] = (byte) s;
            i += 2;
            bArr3[i2] = (byte) (s >> 8);
        }
        int iC2 = akzc.u(bArr3).c() >> 1;
        short[] sArr2 = new short[iC2];
        java.nio.ByteBuffer.wrap(bArr3).order(java.nio.ByteOrder.nativeOrder()).asShortBuffer().get(sArr2);
        byte[] bArr4 = new byte[iC2 << 1];
        java.nio.ByteBuffer.wrap(bArr4).order(java.nio.ByteOrder.nativeOrder()).asShortBuffer().put(sArr2);
        akzc akzcVarU2 = akzc.u(bArr4);
        defpackage.allo alloVar = this.g;
        byte[] bArrD = akzcVarU2.D();
        java.util.concurrent.locks.ReentrantLock reentrantLock = alloVar.b;
        reentrantLock.lock();
        try {
            if (alloVar.c.size() >= 6553600) {
                defpackage.allo.a.d().l("com/google/quality/views/extraction/kcube/bg/ondevice/core/infra/SimpleAudioBuffer", "addToBuffer", 64, "SimpleAudioBuffer.java").w("Audio buffer is out of capacity: dropping bytes of length %s", bArrD.length);
                reentrantLock.unlock();
            } else {
                alloVar.c.addAll(ajee.m(bArrD));
                alloVar.b.unlock();
            }
        } catch (java.lang.Throwable th) {
            alloVar.b.unlock();
            throw th;
        }
    }

    @Override // defpackage.allg
    public final void d() {
        try {
            this.j.c(new defpackage.agqr(this, 7), j$.util.Optional.of(new defpackage.aljn(this, 1)));
        } catch (defpackage.aljs e) {
            a.by(a.c(), "Consuming audio failed.", "com/google/quality/views/extraction/kcube/bg/ondevice/core/infra/AudioIntentExtractionProcessor", "start", (char) 163, "AudioIntentExtractionProcessor.java", e);
        }
    }

    @Override // defpackage.allg
    public final void e() {
        this.d.lock();
        try {
            this.f.set(true);
            j$.util.Optional optional = this.e;
            if (true == optional.isPresent()) {
                java.lang.Object obj = optional.get();
                ((defpackage.aljx) obj).b.ifPresentOrElse(new defpackage.aljd(2), new defpackage.ahlo(4));
                ((defpackage.aljx) obj).b = j$.util.Optional.empty();
            }
            defpackage.allo alloVar = this.g;
            alloVar.b.lock();
            try {
                alloVar.c.clear();
                alloVar.b.unlock();
                this.d.unlock();
            } catch (java.lang.Throwable th) {
                alloVar.b.unlock();
                throw th;
            }
        } catch (java.lang.Throwable th2) {
            this.d.unlock();
            throw th2;
        }
    }

    @Override // defpackage.allg
    public final void f(alqd alqdVar, defpackage.alqh alqhVar, defpackage.alqk alqkVar, defpackage.almb almbVar, defpackage.alml almlVar, defpackage.alkf alkfVar) throws defpackage.aljs {
        this.g = new defpackage.allo();
        try {
            if (!alqkVar.d || almbVar.k.isEmpty()) {
                this.f.set(true);
                return;
            }
            this.f.set(false);
            vqy vqyVarK = vqy.k(alqdVar, almbVar);
            defpackage.aloa aloaVar = (defpackage.aloa) vqyVarK.b;
            this.i = aloaVar;
            this.h.c(aloaVar);
            this.d.lock();
            try {
                try {
                    defpackage.aqan aqanVarI = vqyVarK.i(((defpackage.almb) vqyVarK.a).k, new defpackage.aqam(null));
                    defpackage.aljx.a.b().l("com/google/quality/views/extraction/kcube/bg/ondevice/core/infra/EarsAudioModelClient", "create", 41, "EarsAudioModelClient.java").v("Ears TfLite Audio model loaded.");
                    this.e = j$.util.Optional.of(new defpackage.aljx(aqanVarI));
                    this.d.unlock();
                } catch (java.io.IOException e) {
                    throw new defpackage.aljs("Failed to load audio model assets.", defpackage.aljr.c, e);
                }
            } catch (java.lang.Throwable th) {
                this.d.unlock();
                throw th;
            }
        } catch (java.io.IOException e2) {
            throw new defpackage.aljs("Failed to load Audio Model Client.", defpackage.aljr.b, e2);
        }
    }

    @Override // defpackage.allg
    public final void b(defpackage.almy almyVar) {
    }
}
