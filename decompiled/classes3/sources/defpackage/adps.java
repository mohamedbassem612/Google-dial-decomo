package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class adps extends defpackage.adpc implements defpackage.adpg {
    private static final aimz b = aimz.i("com/google/android/libraries/micore/telephony/common/audio/voip/VoipRxController");
    private j$.util.Optional c;
    private final defpackage.adpf d;
    private final java.util.concurrent.ConcurrentMap e;
    private int f;

    public adps(android.content.Context context, defpackage.adpf adpfVar) {
        super(context, new java.lang.String[0]);
        this.c = j$.util.Optional.empty();
        this.e = new j$.util.concurrent.ConcurrentHashMap();
        this.d = adpfVar;
        this.f = 1;
    }

    private final void i() {
        java.util.concurrent.ConcurrentMap concurrentMap = this.e;
        java.util.Iterator it = concurrentMap.values().iterator();
        while (it.hasNext()) {
            j((android.media.AudioTrack) it.next());
        }
        concurrentMap.clear();
    }

    private static final void j(android.media.AudioTrack audioTrack) {
        if (audioTrack.getPlayState() == 3) {
            audioTrack.stop();
        }
        audioTrack.release();
    }

    @Override // defpackage.adpg
    public final void b(defpackage.afpl afplVar, byte[] bArr, int i, int i2) {
        if (h() == 3) {
            if (i2 <= 0) {
                b.d().l("com/google/android/libraries/micore/telephony/common/audio/voip/VoipRxController", "onRead", 97, "VoipRxController.java").w("onRead(): No data was read results value is: %d, skipping", i2);
            }
            android.media.AudioTrack audioTrack = (android.media.AudioTrack) j$.util.concurrent.ConcurrentMap.-EL.computeIfAbsent(this.e, afplVar, new defpackage.adci(2));
            if (audioTrack.getPlayState() != 3) {
                audioTrack.play();
            }
            int iWrite = 0;
            while (iWrite < i2) {
                iWrite += audioTrack.write(bArr, i + iWrite, i2 - iWrite, 0);
                if (iWrite <= 0) {
                    b.c().l("com/google/android/libraries/micore/telephony/common/audio/voip/VoipRxController", "writeDataToAudioTrack", 164, "VoipRxController.java").w("writeDataToAudioTrack(): Failed to write audio data: %d", iWrite);
                    throw new java.lang.IllegalStateException(a.bj(iWrite, "Failed to write audio data: "));
                }
            }
        }
    }

    @Override // defpackage.adpg
    public final void c(defpackage.afpl afplVar) {
        android.media.AudioTrack audioTrack = (android.media.AudioTrack) this.e.remove(afplVar);
        if (audioTrack != null) {
            j(audioTrack);
        }
    }

    @Override // defpackage.adpc
    public final synchronized void d() {
        if (this.c.isPresent()) {
            return;
        }
        j$.util.Optional optionalOf = j$.util.Optional.of(this.d.a(new android.media.AudioFormat.Builder().setSampleRate(16000).build()));
        this.c = optionalOf;
        ((defpackage.afpl) optionalOf.get()).p();
        this.f = 2;
        i();
    }

    @Override // defpackage.adpc
    public final synchronized void e() {
        if (this.c.isPresent()) {
            ((defpackage.afpl) this.c.get()).q();
            ((defpackage.afpl) this.c.get()).o();
            this.c = j$.util.Optional.empty();
        }
        this.f = 3;
    }

    public final synchronized void g() {
        b.b().l("com/google/android/libraries/micore/telephony/common/audio/voip/VoipRxController", "release", 115, "VoipRxController.java").v("release(): unmuting and releasing audio tracks");
        e();
        i();
    }

    public final synchronized int h() {
        return this.f;
    }

    @Override // defpackage.adpg
    public final void a(android.media.AudioFormat audioFormat) {
    }
}
