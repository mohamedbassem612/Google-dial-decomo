package androidx.car.app.model;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
@defpackage.ug
public class OnContentRefreshDelegateImpl implements defpackage.xv {
    private final androidx.car.app.model.IOnContentRefreshListener mListener;

    /* JADX INFO: compiled from: PG */
    @defpackage.ug
    public class OnContentRefreshListenerStub extends androidx.car.app.model.IOnContentRefreshListener.Stub {
        private final defpackage.xx mOnContentRefreshListener;

        public OnContentRefreshListenerStub(defpackage.xx xxVar) {
            this.mOnContentRefreshListener = xxVar;
        }

        @Override // androidx.car.app.model.IOnContentRefreshListener
        public int getInterfaceVersion() {
            return 1;
        }

        /* JADX INFO: renamed from: lambda$onContentRefreshRequested$0$androidx-car-app-model-OnContentRefreshDelegateImpl$OnContentRefreshListenerStub, reason: not valid java name */
        public /* synthetic */ java.lang.Object m47xff9c1a9c() {
            this.mOnContentRefreshListener.a();
            return null;
        }

        @Override // androidx.car.app.model.IOnContentRefreshListener
        public void onContentRefreshRequested(androidx.car.app.IOnDoneCallback iOnDoneCallback) {
            defpackage.rx.f(iOnDoneCallback, "onClick", new defpackage.abc() { // from class: xw
                @Override // defpackage.abc
                public final java.lang.Object a() {
                    return this.a.m47xff9c1a9c();
                }
            });
        }
    }

    private OnContentRefreshDelegateImpl(defpackage.xx xxVar) {
        this.mListener = new androidx.car.app.model.OnContentRefreshDelegateImpl.OnContentRefreshListenerStub(xxVar);
    }

    public static defpackage.xv create(defpackage.xx xxVar) {
        return new androidx.car.app.model.OnContentRefreshDelegateImpl(xxVar);
    }

    public void sendContentRefreshRequested(defpackage.tz tzVar) {
        try {
            ((androidx.car.app.model.IOnContentRefreshListener) j$.util.Objects.requireNonNull(this.mListener)).onContentRefreshRequested(new androidx.car.app.utils.RemoteUtils$1(tzVar));
        } catch (android.os.RemoteException e) {
            throw new java.lang.RuntimeException(e);
        }
    }

    private OnContentRefreshDelegateImpl() {
        this.mListener = null;
    }
}
