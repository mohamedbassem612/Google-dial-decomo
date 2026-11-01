package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class hzp implements defpackage.hzl {
    public final defpackage.hzf c;
    public byte[] d;
    public j$.util.Optional e = j$.util.Optional.empty();
    public ajcq f;
    public defpackage.hyw g;
    private final defpackage.hzj i;
    private final ajcu j;
    private final ajcu k;
    private final aazc l;
    public static final aimz a = aimz.i("com/android/dialer/audio/impl/audiocontroller/RecordingAudioSource");
    private static final j$.time.Duration h = j$.time.Duration.ofSeconds(5);
    public static final j$.time.Duration b = j$.time.Duration.ofMillis(10);

    public hzp(defpackage.hzj hzjVar, ajcu ajcuVar, ajcu ajcuVar2, defpackage.hzf hzfVar, aazc aazcVar) {
        this.i = hzjVar;
        this.j = ajcuVar;
        this.k = ajcuVar2;
        this.l = aazcVar;
        this.c = hzfVar;
    }

    private final void d(java.lang.Runnable runnable, java.lang.String str, j$.time.Duration duration) {
        long jElapsedRealtime = android.os.SystemClock.elapsedRealtime();
        ajcs ajcsVarB = this.k.b(new defpackage.ac((java.lang.Object) this, (java.lang.Object) str, (java.lang.Object) duration, 15, (short[]) null), duration.toMillis(), java.util.concurrent.TimeUnit.MILLISECONDS);
        runnable.run();
        ajcsVarB.cancel(true);
        a.b().l("com/android/dialer/audio/impl/audiocontroller/RecordingAudioSource", "crashIfTimesOut", 164, "RecordingAudioSource.java").H("%s finished: %dms", str, android.os.SystemClock.elapsedRealtime() - jElapsedRealtime);
    }

    @Override // defpackage.hzl
    public final android.media.AudioFormat a() {
        return this.i.a();
    }

    @Override // defpackage.hzl
    public final void b() {
        aimz aimzVar = a;
        aimzVar.b().l("com/android/dialer/audio/impl/audiocontroller/RecordingAudioSource", "stopListening", 103, "RecordingAudioSource.java").v("enter");
        lpb.b();
        ahvr.bZ(this.e.isPresent(), "source not started");
        this.f.cancel(true);
        d(new defpackage.fkh(this, 14, null), "recorder.get().stopRecording()", h);
        this.e = j$.util.Optional.empty();
        aimzVar.b().l("com/android/dialer/audio/impl/audiocontroller/RecordingAudioSource", "stopListening", 116, "RecordingAudioSource.java").v("stopped");
    }

    @Override // defpackage.hzl
    public final void c(defpackage.hyw hywVar) {
        aimz aimzVar = a;
        aimzVar.b().l("com/android/dialer/audio/impl/audiocontroller/RecordingAudioSource", "startListening", 69, "RecordingAudioSource.java").v("enter");
        lpb.b();
        this.g = hywVar;
        ahvr.bZ(!this.e.isPresent(), "source already recording");
        defpackage.hzj hzjVar = this.i;
        defpackage.hzk hzkVarB = hzjVar.b();
        j$.util.Objects.requireNonNull(hzkVarB);
        d(new defpackage.fkh(hzkVarB, 15, null), "newRecorder::startRecording", h);
        ahvr.bZ(hzkVarB.c(), "startRecording() failed");
        this.e = j$.util.Optional.of(hzkVarB);
        aimzVar.b().l("com/android/dialer/audio/impl/audiocontroller/RecordingAudioSource", "startListening", 85, "RecordingAudioSource.java").v("started");
        this.d = new byte[hzjVar.a().getSampleRate() << 1];
        this.f = ahus.t(new defpackage.fkh(this, 16, null), 0L, b.toMillis(), java.util.concurrent.TimeUnit.MILLISECONDS, this.j);
    }
}
