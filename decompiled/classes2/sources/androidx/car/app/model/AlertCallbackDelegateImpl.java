package androidx.car.app.model;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
@defpackage.ug
public class AlertCallbackDelegateImpl implements defpackage.wa {
    private final androidx.car.app.model.IAlertCallback mCallback;

    /* JADX INFO: compiled from: PG */
    @defpackage.ug
    public class AlertCallbackStub extends androidx.car.app.model.IAlertCallback.Stub {
        private final defpackage.vz mCallback;

        public AlertCallbackStub(defpackage.vz vzVar) {
            this.mCallback = vzVar;
        }

        @Override // androidx.car.app.model.IAlertCallback
        public int getInterfaceVersion() {
            return 1;
        }

        /* JADX INFO: renamed from: lambda$onAlertCancelled$0$androidx-car-app-model-AlertCallbackDelegateImpl$AlertCallbackStub, reason: not valid java name */
        public /* synthetic */ java.lang.Object m36x74881a4b(int i) {
            this.mCallback.b();
            return null;
        }

        /* JADX INFO: renamed from: lambda$onAlertDismissed$0$androidx-car-app-model-AlertCallbackDelegateImpl$AlertCallbackStub, reason: not valid java name */
        public /* synthetic */ java.lang.Object m37x4e6115f3() {
            this.mCallback.a();
            return null;
        }

        @Override // androidx.car.app.model.IAlertCallback
        public void onAlertCancelled(final int i, androidx.car.app.IOnDoneCallback iOnDoneCallback) {
            defpackage.rx.f(iOnDoneCallback, "onCancel", new defpackage.abc() { // from class: wc
                @Override // defpackage.abc
                public final java.lang.Object a() {
                    return this.a.m36x74881a4b(i);
                }
            });
        }

        @Override // androidx.car.app.model.IAlertCallback
        public void onAlertDismissed(androidx.car.app.IOnDoneCallback iOnDoneCallback) {
            defpackage.rx.f(iOnDoneCallback, "onDismiss", new defpackage.abc() { // from class: wb
                @Override // defpackage.abc
                public final java.lang.Object a() {
                    return this.a.m37x4e6115f3();
                }
            });
        }
    }

    private AlertCallbackDelegateImpl(defpackage.vz vzVar) {
        this.mCallback = new androidx.car.app.model.AlertCallbackDelegateImpl.AlertCallbackStub(vzVar);
    }

    public static defpackage.wa create(defpackage.vz vzVar) {
        return new androidx.car.app.model.AlertCallbackDelegateImpl(vzVar);
    }

    public void sendCancel(int i, defpackage.tz tzVar) {
        try {
            ((androidx.car.app.model.IAlertCallback) j$.util.Objects.requireNonNull(this.mCallback)).onAlertCancelled(i, new androidx.car.app.utils.RemoteUtils$1(tzVar));
        } catch (android.os.RemoteException e) {
            throw new java.lang.RuntimeException(e);
        }
    }

    public void sendDismiss(defpackage.tz tzVar) {
        try {
            ((androidx.car.app.model.IAlertCallback) j$.util.Objects.requireNonNull(this.mCallback)).onAlertDismissed(new androidx.car.app.utils.RemoteUtils$1(tzVar));
        } catch (android.os.RemoteException e) {
            throw new java.lang.RuntimeException(e);
        }
    }

    private AlertCallbackDelegateImpl() {
        this.mCallback = null;
    }
}
