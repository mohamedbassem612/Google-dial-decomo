package androidx.car.app.media;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
@defpackage.ug
public final class OpenMicrophoneResponse {
    private final androidx.car.app.media.CarAudioCallbackDelegate mCarAudioCallbackDelegate;
    private final android.os.ParcelFileDescriptor mCarMicrophoneDescriptor;

    OpenMicrophoneResponse(defpackage.vl vlVar) {
        androidx.car.app.media.CarAudioCallbackDelegate carAudioCallbackDelegate = vlVar.a;
        this.mCarAudioCallbackDelegate = null;
        android.os.ParcelFileDescriptor parcelFileDescriptor = vlVar.b;
        this.mCarMicrophoneDescriptor = null;
    }

    public androidx.car.app.media.CarAudioCallbackDelegate getCarAudioCallback() {
        return (androidx.car.app.media.CarAudioCallbackDelegate) j$.util.Objects.requireNonNull(this.mCarAudioCallbackDelegate);
    }

    public java.io.InputStream getCarMicrophoneInputStream() {
        android.os.ParcelFileDescriptor parcelFileDescriptor = this.mCarMicrophoneDescriptor;
        if (parcelFileDescriptor == null) {
            try {
                android.os.ParcelFileDescriptor[] parcelFileDescriptorArrCreateReliablePipe = android.os.ParcelFileDescriptor.createReliablePipe();
                parcelFileDescriptorArrCreateReliablePipe[1].close();
                parcelFileDescriptor = parcelFileDescriptorArrCreateReliablePipe[0];
            } catch (java.io.IOException e) {
                throw new java.lang.IllegalStateException(e);
            }
        }
        return new android.os.ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor);
    }

    private OpenMicrophoneResponse() {
        this.mCarMicrophoneDescriptor = null;
        this.mCarAudioCallbackDelegate = null;
    }
}
