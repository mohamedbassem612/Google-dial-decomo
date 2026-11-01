package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class adpt extends defpackage.adpc {
    private static final aimz d = aimz.i("com/google/android/libraries/micore/telephony/common/audio/voip/VoipTxController");
    public j$.util.Optional b;
    public boolean c;
    private final defpackage.adph e;
    private final ajct f;
    private j$.util.Optional g;
    private int h;

    public adpt(android.content.Context context, defpackage.adph adphVar, ajct ajctVar) {
        super(context, new java.lang.String[0]);
        this.b = j$.util.Optional.empty();
        this.c = false;
        this.g = j$.util.Optional.empty();
        this.e = adphVar;
        this.f = ajctVar;
    }

    @Override // defpackage.adpc
    public final synchronized void d() {
        if (this.b.isPresent()) {
            return;
        }
        j$.util.Optional optionalOf = j$.util.Optional.of(this.e.a(new android.media.AudioFormat.Builder().build()));
        this.b = optionalOf;
        ((defpackage.vqf) optionalOf.get()).E();
        this.c = true;
        this.g = j$.util.Optional.of(this.f.eU(new defpackage.zpk(this, 10)));
        this.h = 2;
    }

    /* JADX WARN: Type inference failed for: r0v9, types: [ajcq, java.lang.Object] */
    @Override // defpackage.adpc
    public final synchronized void e() {
        if (this.h != 2) {
            return;
        }
        this.c = false;
        if (this.g.isPresent()) {
            try {
                this.g.get().get(500L, java.util.concurrent.TimeUnit.MILLISECONDS);
            } catch (java.lang.Exception e) {
                a.by(d.d(), "unmute() - exception occurred when waiting for audio track write loop to finish", "com/google/android/libraries/micore/telephony/common/audio/voip/VoipTxController", "unmute", 'Z', "VoipTxController.java", e);
            }
        }
        this.h = 3;
        this.b = j$.util.Optional.empty();
    }
}
