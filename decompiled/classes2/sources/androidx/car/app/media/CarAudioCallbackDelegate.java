package androidx.car.app.media;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
@defpackage.ug
public class CarAudioCallbackDelegate {
    private final androidx.car.app.media.ICarAudioCallback mCallback;

    private CarAudioCallbackDelegate(defpackage.vi viVar) {
        this.mCallback = new androidx.car.app.media.CarAudioCallbackDelegate.CarAudioCallbackStub(viVar);
    }

    static androidx.car.app.media.CarAudioCallbackDelegate create(defpackage.vi viVar) {
        return new androidx.car.app.media.CarAudioCallbackDelegate(viVar);
    }

    public void onStopRecording() {
        try {
            ((androidx.car.app.media.ICarAudioCallback) j$.util.Objects.requireNonNull(this.mCallback)).onStopRecording();
        } catch (android.os.RemoteException e) {
            throw new java.lang.RuntimeException(e);
        }
    }

    /* JADX INFO: compiled from: PG */
    @defpackage.ug
    class CarAudioCallbackStub extends androidx.car.app.media.ICarAudioCallback.Stub {
        private final defpackage.vi mCarAudioCallback;

        CarAudioCallbackStub() {
            this.mCarAudioCallback = null;
        }

        @Override // androidx.car.app.media.ICarAudioCallback
        public int getInterfaceVersion() {
            return 1;
        }

        @Override // androidx.car.app.media.ICarAudioCallback
        public void onStopRecording() {
            ((defpackage.vi) j$.util.Objects.requireNonNull(this.mCarAudioCallback)).a();
        }

        public CarAudioCallbackStub(defpackage.vi viVar) {
            this.mCarAudioCallback = viVar;
        }
    }

    private CarAudioCallbackDelegate() {
        this.mCallback = null;
    }
}
