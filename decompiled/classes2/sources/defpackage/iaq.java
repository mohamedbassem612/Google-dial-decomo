package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class iaq implements defpackage.hzi {
    private static final aimz a = aimz.i("com/android/dialer/audio/impl/audiocontroller/voip/VoipAudioController");
    private final defpackage.hzp b;
    private final defpackage.hzl c;
    private final defpackage.hzl d;
    private final defpackage.iat e;
    private final j$.util.Optional f = j$.util.Optional.empty();
    private final izg g;

    public iaq(defpackage.ifb ifbVar, rai raiVar, defpackage.hzs hzsVar, defpackage.iat iatVar, izg izgVar) {
        this.b = ifbVar.c(hzsVar);
        this.c = raiVar.m(defpackage.hzh.b);
        this.d = raiVar.m(defpackage.hzh.c);
        this.e = iatVar;
        this.g = izgVar;
    }

    @Override // defpackage.hzi
    public final defpackage.hzl a(defpackage.hzh hzhVar) {
        int iOrdinal = hzhVar.ordinal();
        if (iOrdinal == 0) {
            return this.b;
        }
        if (iOrdinal == 1) {
            return this.c;
        }
        if (iOrdinal == 2) {
            return this.d;
        }
        throw new java.lang.RuntimeException(null, null);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v4, types: [aoin, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v2, types: [aoin, java.lang.Object] */
    @Override // defpackage.hzi
    public final defpackage.hzm b(java.lang.Runnable runnable, java.util.function.Consumer consumer) {
        a.bI(a.b(), "Use VoiceLibAudioInjector for audio injection", "com/android/dialer/audio/impl/audiocontroller/voip/VoipAudioController", "createMediaPlayer", 'Q', "VoipAudioController.java", zct.a);
        izg izgVar = this.g;
        ajcu ajcuVar = (ajcu) izgVar.a.a();
        ajcuVar.getClass();
        defpackage.iao iaoVar = (defpackage.iao) izgVar.c.a();
        iaoVar.getClass();
        rlv rlvVar = (rlv) izgVar.b.a();
        rlvVar.getClass();
        return new defpackage.iai(ajcuVar, iaoVar, rlvVar, runnable, consumer);
    }

    @Override // defpackage.hzi
    public final defpackage.hzo c() {
        return this.e;
    }

    @Override // defpackage.hzi
    public final ajcq d() {
        this.f.isPresent();
        return ajcm.a;
    }
}
