package androidx.car.app.dialer;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
@defpackage.ug
public class TelephoneKeypadCallbackDelegateImpl implements defpackage.up {
    private final androidx.car.app.model.ITelephoneKeypadCallback mBinder;

    /* JADX INFO: compiled from: PG */
    @defpackage.ug
    public class TelephoneKeypadCallbackStub extends androidx.car.app.model.ITelephoneKeypadCallback.Stub {
        private final defpackage.uo mTelephoneKeypadCallback;

        public TelephoneKeypadCallbackStub(defpackage.uo uoVar) {
            this.mTelephoneKeypadCallback = uoVar;
        }

        @Override // androidx.car.app.model.ITelephoneKeypadCallback
        public int getInterfaceVersion() {
            return 1;
        }

        /* JADX INFO: renamed from: lambda$onKeyDown$0$androidx-car-app-dialer-TelephoneKeypadCallbackDelegateImpl$TelephoneKeypadCallbackStub, reason: not valid java name */
        public /* synthetic */ java.lang.Object m28xcd25de4f(int i) {
            this.mTelephoneKeypadCallback.a();
            return null;
        }

        /* JADX INFO: renamed from: lambda$onKeyLongPress$0$androidx-car-app-dialer-TelephoneKeypadCallbackDelegateImpl$TelephoneKeypadCallbackStub, reason: not valid java name */
        public /* synthetic */ java.lang.Object m29x958616ee(int i) {
            this.mTelephoneKeypadCallback.b();
            return null;
        }

        /* JADX INFO: renamed from: lambda$onKeyUp$0$androidx-car-app-dialer-TelephoneKeypadCallbackDelegateImpl$TelephoneKeypadCallbackStub, reason: not valid java name */
        public /* synthetic */ java.lang.Object m30xed251fc8(int i) {
            this.mTelephoneKeypadCallback.c();
            return null;
        }

        @Override // androidx.car.app.model.ITelephoneKeypadCallback
        public void onKeyDown(final int i, androidx.car.app.IOnDoneCallback iOnDoneCallback) {
            defpackage.rx.f(iOnDoneCallback, "TelephoneKeypadCallback#onKeyDown", new defpackage.abc() { // from class: ur
                @Override // defpackage.abc
                public final java.lang.Object a() {
                    return this.a.m28xcd25de4f(i);
                }
            });
        }

        @Override // androidx.car.app.model.ITelephoneKeypadCallback
        public void onKeyLongPress(final int i, androidx.car.app.IOnDoneCallback iOnDoneCallback) {
            defpackage.rx.f(iOnDoneCallback, "TelephoneKeypadCallback#onKeyLongPress", new defpackage.abc() { // from class: uq
                @Override // defpackage.abc
                public final java.lang.Object a() {
                    return this.a.m29x958616ee(i);
                }
            });
        }

        @Override // androidx.car.app.model.ITelephoneKeypadCallback
        public void onKeyUp(final int i, androidx.car.app.IOnDoneCallback iOnDoneCallback) {
            defpackage.rx.f(iOnDoneCallback, "TelephoneKeypadCallback#onKeyUp", new defpackage.abc() { // from class: us
                @Override // defpackage.abc
                public final java.lang.Object a() {
                    return this.a.m30xed251fc8(i);
                }
            });
        }
    }

    private TelephoneKeypadCallbackDelegateImpl(defpackage.uo uoVar) {
        this.mBinder = new androidx.car.app.dialer.TelephoneKeypadCallbackDelegateImpl.TelephoneKeypadCallbackStub(uoVar);
    }

    public static defpackage.up create(defpackage.uo uoVar) {
        return new androidx.car.app.dialer.TelephoneKeypadCallbackDelegateImpl(uoVar);
    }

    public void sendKeyDown(int i, defpackage.tz tzVar) {
        try {
            ((androidx.car.app.model.ITelephoneKeypadCallback) j$.util.Objects.requireNonNull(this.mBinder)).onKeyDown(i, new androidx.car.app.utils.RemoteUtils$1(tzVar));
        } catch (android.os.RemoteException e) {
            throw new java.lang.RuntimeException(e);
        }
    }

    public void sendKeyLongPress(int i, defpackage.tz tzVar) {
        try {
            ((androidx.car.app.model.ITelephoneKeypadCallback) j$.util.Objects.requireNonNull(this.mBinder)).onKeyLongPress(i, new androidx.car.app.utils.RemoteUtils$1(tzVar));
        } catch (android.os.RemoteException e) {
            throw new java.lang.RuntimeException(e);
        }
    }

    public void sendKeyUp(int i, defpackage.tz tzVar) {
        try {
            ((androidx.car.app.model.ITelephoneKeypadCallback) j$.util.Objects.requireNonNull(this.mBinder)).onKeyUp(i, new androidx.car.app.utils.RemoteUtils$1(tzVar));
        } catch (android.os.RemoteException e) {
            throw new java.lang.RuntimeException(e);
        }
    }

    private TelephoneKeypadCallbackDelegateImpl() {
        this.mBinder = null;
    }
}
