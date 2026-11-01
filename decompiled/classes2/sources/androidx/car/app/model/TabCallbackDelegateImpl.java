package androidx.car.app.model;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
@defpackage.ug
public class TabCallbackDelegateImpl implements defpackage.yx {
    private final androidx.car.app.model.ITabCallback mStubCallback;

    /* JADX INFO: compiled from: PG */
    @defpackage.ug
    public class TabCallbackStub extends androidx.car.app.model.ITabCallback.Stub {
        private final defpackage.zd mCallback;

        public TabCallbackStub(defpackage.zd zdVar) {
            this.mCallback = zdVar;
        }

        @Override // androidx.car.app.model.ITabCallback
        public int getInterfaceVersion() {
            return 1;
        }

        /* JADX INFO: renamed from: lambda$onTabSelected$0$androidx-car-app-model-TabCallbackDelegateImpl$TabCallbackStub, reason: not valid java name */
        public /* synthetic */ java.lang.Object m60x7d0e011a(java.lang.String str) {
            this.mCallback.a(str);
            return null;
        }

        @Override // androidx.car.app.model.ITabCallback
        public void onTabSelected(final java.lang.String str, androidx.car.app.IOnDoneCallback iOnDoneCallback) {
            defpackage.rx.f(iOnDoneCallback, "onTabSelected", new defpackage.abc() { // from class: yy
                @Override // defpackage.abc
                public final java.lang.Object a() {
                    return this.a.m60x7d0e011a(str);
                }
            });
        }
    }

    private TabCallbackDelegateImpl(defpackage.zd zdVar) {
        this.mStubCallback = new androidx.car.app.model.TabCallbackDelegateImpl.TabCallbackStub(zdVar);
    }

    public static defpackage.yx create(defpackage.zd zdVar) {
        return new androidx.car.app.model.TabCallbackDelegateImpl(zdVar);
    }

    public void sendTabSelected(java.lang.String str, defpackage.tz tzVar) {
        try {
            ((androidx.car.app.model.ITabCallback) j$.util.Objects.requireNonNull(this.mStubCallback)).onTabSelected(str, new androidx.car.app.utils.RemoteUtils$1(tzVar));
        } catch (android.os.RemoteException e) {
            throw new java.lang.RuntimeException(e);
        }
    }

    private TabCallbackDelegateImpl() {
        this.mStubCallback = null;
    }
}
