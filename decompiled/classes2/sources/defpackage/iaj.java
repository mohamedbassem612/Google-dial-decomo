package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class iaj implements defpackage.hzl {
    public byte[] b;
    private final defpackage.hzh e;
    private final ajcu f;
    private android.os.ParcelFileDescriptor g;
    private android.os.ParcelFileDescriptor h;
    private ajcq i;
    private final defpackage.iao j;
    private final aazc k;
    private static final aimz c = aimz.i("com/android/dialer/audio/impl/audiocontroller/voip/VoiceLibAudioSource");
    public static final j$.time.Duration a = j$.time.Duration.ofMillis(10);
    private static final android.media.AudioFormat d = new android.media.AudioFormat.Builder().setEncoding(2).setSampleRate(16000).setChannelMask(4).build();

    public iaj(defpackage.hzh hzhVar, defpackage.iao iaoVar, ajcu ajcuVar, aazc aazcVar) {
        this.e = hzhVar;
        this.j = iaoVar;
        this.f = ajcuVar;
        this.k = aazcVar;
    }

    @Override // defpackage.hzl
    public final android.media.AudioFormat a() {
        return d;
    }

    @Override // defpackage.hzl
    public final void b() {
        c.b().l("com/android/dialer/audio/impl/audiocontroller/voip/VoiceLibAudioSource", "stopListening", 142, "VoiceLibAudioSource.java").v("VoiceLibAudioSource.stopListening()");
        this.i.cancel(false);
        try {
            this.h.close();
            this.h = null;
            this.g.close();
            this.g = null;
            defpackage.iao iaoVar = this.j;
            iaoVar.c.h(ahvr.E(new defpackage.fkh(iaoVar, 19, null), iaoVar.d), java.util.concurrent.TimeUnit.SECONDS);
        } catch (java.io.IOException e) {
            throw new java.lang.IllegalStateException("Exception in stopListening()", e);
        }
    }

    @Override // defpackage.hzl
    public final void c(defpackage.hyw hywVar) {
        c.b().l("com/android/dialer/audio/impl/audiocontroller/voip/VoiceLibAudioSource", "startListening", 76, "VoiceLibAudioSource.java").v("VoiceLibAudioSource.startListening()");
        if (this.g != null || this.h != null) {
            b();
            throw new java.lang.IllegalStateException("startListening() called while an active recording session exists");
        }
        try {
            android.os.ParcelFileDescriptor[] parcelFileDescriptorArrCreatePipe = android.os.ParcelFileDescriptor.createPipe();
            this.h = parcelFileDescriptorArrCreatePipe[0];
            this.g = parcelFileDescriptorArrCreatePipe[1];
            android.os.ParcelFileDescriptor.AutoCloseInputStream autoCloseInputStream = new android.os.ParcelFileDescriptor.AutoCloseInputStream(this.h);
            j$.time.Duration duration = a;
            this.b = new byte[(int) (duration.toMillis() << 5)];
            this.i = ahus.t(new defpackage.ac(this, autoCloseInputStream, hywVar, 17, (int[]) null), duration.toMillis(), duration.toMillis(), java.util.concurrent.TimeUnit.MILLISECONDS, this.f);
            final defpackage.iao iaoVar = this.j;
            final android.os.ParcelFileDescriptor parcelFileDescriptor = this.g;
            final defpackage.hzh hzhVar = this.e;
            final defpackage.fcg fcgVar = new defpackage.fcg(this, 5);
            iaoVar.c.h(ahvr.E(new java.lang.Runnable() { // from class: iam
                @Override // java.lang.Runnable
                public final void run() {
                    final defpackage.iao iaoVar2 = iaoVar;
                    final defpackage.hzh hzhVar2 = hzhVar;
                    final android.os.ParcelFileDescriptor parcelFileDescriptor2 = parcelFileDescriptor;
                    final java.util.function.Consumer consumer = fcgVar;
                    iaoVar2.a(new java.util.function.Consumer() { // from class: ial
                        @Override // java.util.function.Consumer
                        public final void accept(java.lang.Object obj) {
                            defpackage.iao iaoVar3 = iaoVar2;
                            defpackage.hzh hzhVar3 = hzhVar2;
                            android.os.ParcelFileDescriptor parcelFileDescriptor3 = parcelFileDescriptor2;
                            java.util.function.Consumer consumer2 = consumer;
                            defpackage.aazb aazbVar = (defpackage.aazb) obj;
                            try {
                                int iOrdinal = hzhVar3.ordinal();
                                int i = 2;
                                if (iOrdinal != 0) {
                                    if (iOrdinal == 1) {
                                        i = 0;
                                    } else {
                                        if (iOrdinal != 2) {
                                            throw new java.lang.IllegalArgumentException(java.lang.String.format("invalid AudioSourceType: %s", hzhVar3));
                                        }
                                        i = 1;
                                    }
                                }
                                defpackage.aaza aazaVar = new defpackage.aaza(iaoVar3, consumer2);
                                android.os.Parcel parcelEP = aazbVar.eP();
                                yld.d(parcelEP, parcelFileDescriptor3);
                                parcelEP.writeInt(16000);
                                parcelEP.writeInt(i);
                                yld.f(parcelEP, aazaVar);
                                aazbVar.eS(4, parcelEP);
                            } catch (android.os.RemoteException e) {
                                throw new java.lang.IllegalStateException("Exception in recording Fi VoIP call audio", e);
                            }
                        }

                        @Override // java.util.function.Consumer
                        public final /* synthetic */ java.util.function.Consumer andThen(java.util.function.Consumer consumer2) {
                            return j$.util.function.Consumer.-CC.$default$andThen(this, consumer2);
                        }
                    });
                }
            }, iaoVar.d), java.util.concurrent.TimeUnit.SECONDS);
        } catch (java.io.IOException e) {
            throw new java.lang.IllegalStateException("Exception in VoiceLibAudioSource.startListening: ", e);
        }
    }
}
