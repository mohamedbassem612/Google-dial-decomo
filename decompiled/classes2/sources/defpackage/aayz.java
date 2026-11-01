package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class aayz extends ylc implements android.os.IInterface {
    final /* synthetic */ java.lang.Runnable a;
    final /* synthetic */ java.util.function.Consumer b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aayz(defpackage.iao iaoVar, java.lang.Runnable runnable, java.util.function.Consumer consumer) {
        super("com.google.android.ims.ipc.IAudioInjectionCallback");
        this.a = runnable;
        this.b = consumer;
        j$.util.Objects.requireNonNull(iaoVar);
    }

    protected final boolean F(int i, android.os.Parcel parcel, android.os.Parcel parcel2) {
        if (i == 1) {
            defpackage.iao.a.b().l("com/android/dialer/audio/impl/audiocontroller/voip/VoiceLibControllerImpl$1", "onFinish", 145, "VoiceLibControllerImpl.java").v("Audio injection finishes");
            this.a.run();
            return true;
        }
        if (i != 2) {
            return false;
        }
        int i2 = parcel.readInt();
        yld.c(parcel);
        defpackage.iao.a.c().m(aioa.b).i(zct.b).l("com/android/dialer/audio/impl/audiocontroller/voip/VoiceLibControllerImpl$1", "onError", 155, "VoiceLibControllerImpl.java").w("Audio injection error: %d", i2);
        aa$.ExternalSyntheticApiModelOutline1.m(this.b, new java.lang.IllegalStateException(java.lang.String.format(java.util.Locale.US, "Audio injection error %d", java.lang.Integer.valueOf(i2))));
        return true;
    }
}
