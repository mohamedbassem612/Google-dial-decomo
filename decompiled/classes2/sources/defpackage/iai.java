package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class iai implements defpackage.hzm {
    private static final aimz d = aimz.i("com/android/dialer/audio/impl/audiocontroller/voip/VoiceLibAudioInjector");
    public final java.lang.Runnable a;
    public final java.util.function.Consumer b;
    public final defpackage.iao c;
    private final ajcu e;
    private int f;

    public iai(ajcu ajcuVar, defpackage.iao iaoVar, final rlv rlvVar, java.lang.Runnable runnable, final java.util.function.Consumer consumer) {
        this.e = ajcuVar;
        this.c = iaoVar;
        this.a = runnable;
        this.b = new java.util.function.Consumer() { // from class: iah
            @Override // java.util.function.Consumer
            public final void accept(java.lang.Object obj) {
                rlvVar.o(rmx.zL);
                aa$.ExternalSyntheticApiModelOutline1.m(consumer, (java.lang.Throwable) obj);
            }

            @Override // java.util.function.Consumer
            public final /* synthetic */ java.util.function.Consumer andThen(java.util.function.Consumer consumer2) {
                return j$.util.function.Consumer.-CC.$default$andThen(this, consumer2);
            }
        };
    }

    @Override // defpackage.hzm
    public final int a() {
        return this.f;
    }

    @Override // defpackage.hzm
    public final void b() {
        d.b().l("com/android/dialer/audio/impl/audiocontroller/voip/VoiceLibAudioInjector", "release", 139, "VoiceLibAudioInjector.java").v("release");
    }

    @Override // defpackage.hzm
    public final void c(java.lang.String str) throws java.lang.Exception {
        aimz aimzVar = d;
        aimzVar.b().l("com/android/dialer/audio/impl/audiocontroller/voip/VoiceLibAudioInjector", "start", 72, "VoiceLibAudioInjector.java").v("starting");
        try {
            android.media.MediaMetadataRetriever mediaMetadataRetriever = new android.media.MediaMetadataRetriever();
            try {
                mediaMetadataRetriever.setDataSource(str);
                this.f = java.lang.Integer.parseInt(mediaMetadataRetriever.extractMetadata(9));
                aimzVar.b().l("com/android/dialer/audio/impl/audiocontroller/voip/VoiceLibAudioInjector", "start", 78, "VoiceLibAudioInjector.java").w("duration: %d", this.f);
                mediaMetadataRetriever.close();
                try {
                    java.io.File file = new java.io.File(str);
                    byte[] bArr = new byte[(int) file.length()];
                    java.io.FileInputStream fileInputStream = new java.io.FileInputStream(file);
                    try {
                        fileInputStream.read(bArr);
                        fileInputStream.close();
                        defpackage.idk idkVar = new defpackage.idk(bArr);
                        if (idkVar.b != 1) {
                            throw new java.lang.IllegalArgumentException("multi channel audio not supported.");
                        }
                        int i = idkVar.c;
                        if (i != 2) {
                            throw new java.lang.IllegalArgumentException(java.lang.String.format(java.util.Locale.US, "PCM encoding %d is not supported.", java.lang.Integer.valueOf(i)));
                        }
                        akzc akzcVar = akzc.d;
                        akzb akzbVar = new akzb(128);
                        byte[] bArr2 = new byte[262144];
                        for (int i2 = idkVar.read(bArr2); i2 > 0; i2 = idkVar.read(bArr2)) {
                            akzbVar.write(bArr2, 0, i2);
                        }
                        akzc akzcVarB = akzbVar.b();
                        byte[] bArr3 = new byte[akzcVarB.c()];
                        akzcVarB.B(bArr3, 0, 0, akzcVarB.c());
                        agsm.i(94, ahvr.E(new defpackage.ac((java.lang.Object) this, (java.lang.Object) bArr3, (java.lang.Object) idkVar, 16, (short[]) null), this.e), "inject uplink audio failure", new java.lang.Object[0]);
                    } catch (java.lang.Throwable th) {
                        try {
                            fileInputStream.close();
                            throw th;
                        } catch (java.lang.Throwable th2) {
                            th.addSuppressed(th2);
                            throw th;
                        }
                    }
                } catch (java.io.IOException e) {
                    throw new java.lang.IllegalStateException(e);
                }
            } catch (java.lang.Throwable th3) {
                try {
                    mediaMetadataRetriever.close();
                    throw th3;
                } catch (java.lang.Throwable th4) {
                    th3.addSuppressed(th4);
                    throw th3;
                }
            }
        } catch (java.io.IOException e2) {
            throw new java.lang.IllegalStateException(e2);
        }
    }

    @Override // defpackage.hzm
    public final void d() {
        d.b().l("com/android/dialer/audio/impl/audiocontroller/voip/VoiceLibAudioInjector", "stop", 131, "VoiceLibAudioInjector.java").v("stop");
        defpackage.iao iaoVar = this.c;
        j$.util.Objects.requireNonNull(iaoVar);
        agsm.i(95, ahvr.E(new defpackage.fkh(iaoVar, 18, null), this.e), "Stop audio injection failure", new java.lang.Object[0]);
    }
}
