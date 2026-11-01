package androidx.car.app.model;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
@defpackage.ug
public class OnSelectedDelegateImpl implements defpackage.ya {
    private final androidx.car.app.model.IOnSelectedListener mStub;

    /* JADX INFO: compiled from: PG */
    @defpackage.ug
    public class OnSelectedListenerStub extends androidx.car.app.model.IOnSelectedListener.Stub {
        private final defpackage.xk mListener;

        public OnSelectedListenerStub(defpackage.xk xkVar) {
            this.mListener = xkVar;
        }

        @Override // androidx.car.app.model.IOnSelectedListener
        public int getInterfaceVersion() {
            return 1;
        }

        /* JADX INFO: renamed from: lambda$onSelected$0$androidx-car-app-model-OnSelectedDelegateImpl$OnSelectedListenerStub, reason: not valid java name */
        public /* synthetic */ java.lang.Object m49x5a7f46f5(int i) {
            this.mListener.a();
            return null;
        }

        @Override // androidx.car.app.model.IOnSelectedListener
        public void onSelected(final int i, androidx.car.app.IOnDoneCallback iOnDoneCallback) {
            defpackage.rx.f(iOnDoneCallback, "onSelectedListener", new defpackage.abc() { // from class: yb
                @Override // defpackage.abc
                public final java.lang.Object a() {
                    return this.a.m49x5a7f46f5(i);
                }
            });
        }
    }

    private OnSelectedDelegateImpl(defpackage.xk xkVar) {
        this.mStub = new androidx.car.app.model.OnSelectedDelegateImpl.OnSelectedListenerStub(xkVar);
    }

    public static defpackage.ya create(defpackage.xk xkVar) {
        return new androidx.car.app.model.OnSelectedDelegateImpl(xkVar);
    }

    public void sendSelected(int i, defpackage.tz tzVar) {
        try {
            ((androidx.car.app.model.IOnSelectedListener) j$.util.Objects.requireNonNull(this.mStub)).onSelected(i, new androidx.car.app.utils.RemoteUtils$1(tzVar));
        } catch (android.os.RemoteException e) {
            throw new java.lang.RuntimeException(e);
        }
    }

    private OnSelectedDelegateImpl() {
        this.mStub = null;
    }
}
