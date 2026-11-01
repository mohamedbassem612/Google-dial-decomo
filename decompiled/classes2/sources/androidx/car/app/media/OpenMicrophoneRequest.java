package androidx.car.app.media;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
@defpackage.ug
public final class OpenMicrophoneRequest {
    private final androidx.car.app.media.CarAudioCallbackDelegate mCarAudioCallbackDelegate;

    OpenMicrophoneRequest(defpackage.vk vkVar) {
        java.lang.Object obj = vkVar.a;
        this.mCarAudioCallbackDelegate = null;
    }

    public androidx.car.app.media.CarAudioCallbackDelegate getCarAudioCallbackDelegate() {
        return (androidx.car.app.media.CarAudioCallbackDelegate) j$.util.Objects.requireNonNull(this.mCarAudioCallbackDelegate);
    }

    private OpenMicrophoneRequest() {
        this.mCarAudioCallbackDelegate = null;
    }
}
