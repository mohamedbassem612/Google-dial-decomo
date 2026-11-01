package androidx.car.app.model;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
@defpackage.ug
public class InputCallbackDelegateImpl implements defpackage.xe {
    private final androidx.car.app.model.IInputCallback mCallback;

    /* JADX INFO: compiled from: PG */
    @defpackage.ug
    public class OnInputCallbackStub extends androidx.car.app.model.IInputCallback.Stub {
        private final defpackage.xd mCallback;

        public OnInputCallbackStub(defpackage.xd xdVar) {
            this.mCallback = xdVar;
        }

        @Override // androidx.car.app.model.IInputCallback
        public int getInterfaceVersion() {
            return 1;
        }

        /* JADX INFO: renamed from: lambda$onInputSubmitted$0$androidx-car-app-model-InputCallbackDelegateImpl$OnInputCallbackStub, reason: not valid java name */
        public /* synthetic */ java.lang.Object m43x52ef688c(java.lang.String str) {
            this.mCallback.b();
            return null;
        }

        /* JADX INFO: renamed from: lambda$onInputTextChanged$0$androidx-car-app-model-InputCallbackDelegateImpl$OnInputCallbackStub, reason: not valid java name */
        public /* synthetic */ java.lang.Object m44xddef77c0(java.lang.String str) {
            this.mCallback.a(str);
            return null;
        }

        @Override // androidx.car.app.model.IInputCallback
        public void onInputSubmitted(final java.lang.String str, androidx.car.app.IOnDoneCallback iOnDoneCallback) {
            defpackage.rx.f(iOnDoneCallback, "onInputSubmitted", new defpackage.abc() { // from class: xg
                @Override // defpackage.abc
                public final java.lang.Object a() {
                    return this.a.m43x52ef688c(str);
                }
            });
        }

        @Override // androidx.car.app.model.IInputCallback
        public void onInputTextChanged(final java.lang.String str, androidx.car.app.IOnDoneCallback iOnDoneCallback) {
            defpackage.rx.f(iOnDoneCallback, "onInputTextChanged", new defpackage.abc() { // from class: xf
                @Override // defpackage.abc
                public final java.lang.Object a() {
                    return this.a.m44xddef77c0(str);
                }
            });
        }
    }

    private InputCallbackDelegateImpl(defpackage.xd xdVar) {
        this.mCallback = new androidx.car.app.model.InputCallbackDelegateImpl.OnInputCallbackStub(xdVar);
    }

    public static defpackage.xe create(defpackage.xd xdVar) {
        return new androidx.car.app.model.InputCallbackDelegateImpl((defpackage.xd) j$.util.Objects.requireNonNull(xdVar));
    }

    public void sendInputSubmitted(java.lang.String str, defpackage.tz tzVar) {
        try {
            ((androidx.car.app.model.IInputCallback) j$.util.Objects.requireNonNull(this.mCallback)).onInputSubmitted(str, new androidx.car.app.utils.RemoteUtils$1(tzVar));
        } catch (android.os.RemoteException e) {
            throw new java.lang.RuntimeException(e);
        }
    }

    public void sendInputTextChanged(java.lang.String str, defpackage.tz tzVar) {
        try {
            ((androidx.car.app.model.IInputCallback) j$.util.Objects.requireNonNull(this.mCallback)).onInputTextChanged(str, new androidx.car.app.utils.RemoteUtils$1(tzVar));
        } catch (android.os.RemoteException e) {
            throw new java.lang.RuntimeException(e);
        }
    }

    private InputCallbackDelegateImpl() {
        this.mCallback = null;
    }
}
