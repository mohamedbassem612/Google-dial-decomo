package androidx.car.app.model;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
@defpackage.ug
public class SearchCallbackDelegateImpl implements defpackage.yl {
    private final androidx.car.app.model.ISearchCallback mStubCallback;

    /* JADX INFO: compiled from: PG */
    @defpackage.ug
    public class SearchCallbackStub extends androidx.car.app.model.ISearchCallback.Stub {
        private final defpackage.yk mSearchCallback;

        public SearchCallbackStub(defpackage.yk ykVar) {
            this.mSearchCallback = ykVar;
        }

        @Override // androidx.car.app.model.ISearchCallback
        public int getInterfaceVersion() {
            return 1;
        }

        /* JADX INFO: renamed from: lambda$onSearchSubmitted$0$androidx-car-app-model-SearchCallbackDelegateImpl$SearchCallbackStub, reason: not valid java name */
        public /* synthetic */ java.lang.Object m50x22f3dea1(java.lang.String str) {
            this.mSearchCallback.a();
            return null;
        }

        /* JADX INFO: renamed from: lambda$onSearchTextChanged$0$androidx-car-app-model-SearchCallbackDelegateImpl$SearchCallbackStub, reason: not valid java name */
        public /* synthetic */ java.lang.Object m51xa7c97055(java.lang.String str) {
            this.mSearchCallback.b();
            return null;
        }

        @Override // androidx.car.app.model.ISearchCallback
        public void onSearchSubmitted(final java.lang.String str, androidx.car.app.IOnDoneCallback iOnDoneCallback) {
            defpackage.rx.f(iOnDoneCallback, "onSearchSubmitted", new defpackage.abc() { // from class: ym
                @Override // defpackage.abc
                public final java.lang.Object a() {
                    return this.a.m50x22f3dea1(str);
                }
            });
        }

        @Override // androidx.car.app.model.ISearchCallback
        public void onSearchTextChanged(final java.lang.String str, androidx.car.app.IOnDoneCallback iOnDoneCallback) {
            defpackage.rx.f(iOnDoneCallback, "onSearchTextChanged", new defpackage.abc() { // from class: yn
                @Override // defpackage.abc
                public final java.lang.Object a() {
                    return this.a.m51xa7c97055(str);
                }
            });
        }
    }

    private SearchCallbackDelegateImpl(defpackage.yk ykVar) {
        this.mStubCallback = new androidx.car.app.model.SearchCallbackDelegateImpl.SearchCallbackStub(ykVar);
    }

    public static defpackage.yl create(defpackage.yk ykVar) {
        return new androidx.car.app.model.SearchCallbackDelegateImpl(ykVar);
    }

    public void sendSearchSubmitted(java.lang.String str, defpackage.tz tzVar) {
        try {
            ((androidx.car.app.model.ISearchCallback) j$.util.Objects.requireNonNull(this.mStubCallback)).onSearchSubmitted(str, new androidx.car.app.utils.RemoteUtils$1(tzVar));
        } catch (android.os.RemoteException e) {
            throw new java.lang.RuntimeException(e);
        }
    }

    public void sendSearchTextChanged(java.lang.String str, defpackage.tz tzVar) {
        try {
            ((androidx.car.app.model.ISearchCallback) j$.util.Objects.requireNonNull(this.mStubCallback)).onSearchTextChanged(str, new androidx.car.app.utils.RemoteUtils$1(tzVar));
        } catch (android.os.RemoteException e) {
            throw new java.lang.RuntimeException(e);
        }
    }

    private SearchCallbackDelegateImpl() {
        this.mStubCallback = null;
    }
}
