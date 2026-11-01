package androidx.car.app.navigation.model;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
@defpackage.ug
public class PanModeDelegateImpl implements defpackage.aag {
    private final androidx.car.app.navigation.model.IPanModeListener mStub;

    /* JADX INFO: compiled from: PG */
    @defpackage.ug
    public class PanModeListenerStub extends androidx.car.app.navigation.model.IPanModeListener.Stub {
        private final defpackage.aai mListener;

        public PanModeListenerStub(defpackage.aai aaiVar) {
            this.mListener = aaiVar;
        }

        @Override // androidx.car.app.navigation.model.IPanModeListener
        public int getInterfaceVersion() {
            return 1;
        }

        /* JADX INFO: renamed from: lambda$onPanModeChanged$0$androidx-car-app-navigation-model-PanModeDelegateImpl$PanModeListenerStub, reason: not valid java name */
        public /* synthetic */ java.lang.Object m62xa5766d47(boolean z) {
            this.mListener.a();
            return null;
        }

        @Override // androidx.car.app.navigation.model.IPanModeListener
        public void onPanModeChanged(final boolean z, androidx.car.app.IOnDoneCallback iOnDoneCallback) {
            defpackage.rx.f(iOnDoneCallback, "onPanModeChanged", new defpackage.abc() { // from class: aah
                @Override // defpackage.abc
                public final java.lang.Object a() {
                    return this.a.m62xa5766d47(z);
                }
            });
        }
    }

    private PanModeDelegateImpl(defpackage.aai aaiVar) {
        this.mStub = new androidx.car.app.navigation.model.PanModeDelegateImpl.PanModeListenerStub(aaiVar);
    }

    public static defpackage.aag create(defpackage.aai aaiVar) {
        return new androidx.car.app.navigation.model.PanModeDelegateImpl(aaiVar);
    }

    public void sendPanModeChanged(boolean z, defpackage.tz tzVar) {
        try {
            ((androidx.car.app.navigation.model.IPanModeListener) j$.util.Objects.requireNonNull(this.mStub)).onPanModeChanged(z, new androidx.car.app.utils.RemoteUtils$1(tzVar));
        } catch (android.os.RemoteException e) {
            throw new java.lang.RuntimeException(e);
        }
    }

    private PanModeDelegateImpl() {
        this.mStub = null;
    }
}
