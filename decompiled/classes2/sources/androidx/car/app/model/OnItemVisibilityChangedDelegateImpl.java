package androidx.car.app.model;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
@defpackage.ug
public class OnItemVisibilityChangedDelegateImpl implements defpackage.xy {
    private final androidx.car.app.model.IOnItemVisibilityChangedListener mStub;

    /* JADX INFO: compiled from: PG */
    public class OnItemVisibilityChangedListenerStub extends androidx.car.app.model.IOnItemVisibilityChangedListener.Stub {
        private final defpackage.xj mListener;

        public OnItemVisibilityChangedListenerStub(defpackage.xj xjVar) {
            this.mListener = xjVar;
        }

        @Override // androidx.car.app.model.IOnItemVisibilityChangedListener
        public int getInterfaceVersion() {
            return 1;
        }

        /* JADX INFO: renamed from: lambda$onItemVisibilityChanged$0$androidx-car-app-model-OnItemVisibilityChangedDelegateImpl$OnItemVisibilityChangedListenerStub, reason: not valid java name */
        public /* synthetic */ java.lang.Object m48xb730acdb(int i, int i2) {
            this.mListener.a();
            return null;
        }

        @Override // androidx.car.app.model.IOnItemVisibilityChangedListener
        public void onItemVisibilityChanged(final int i, final int i2, androidx.car.app.IOnDoneCallback iOnDoneCallback) {
            defpackage.rx.f(iOnDoneCallback, "onItemVisibilityChanged", new defpackage.abc() { // from class: xz
                @Override // defpackage.abc
                public final java.lang.Object a() {
                    return this.a.m48xb730acdb(i, i2);
                }
            });
        }
    }

    private OnItemVisibilityChangedDelegateImpl(defpackage.xj xjVar) {
        this.mStub = new androidx.car.app.model.OnItemVisibilityChangedDelegateImpl.OnItemVisibilityChangedListenerStub(xjVar);
    }

    public static defpackage.xy create(defpackage.xj xjVar) {
        return new androidx.car.app.model.OnItemVisibilityChangedDelegateImpl(xjVar);
    }

    public void sendItemVisibilityChanged(int i, int i2, defpackage.tz tzVar) {
        try {
            ((androidx.car.app.model.IOnItemVisibilityChangedListener) j$.util.Objects.requireNonNull(this.mStub)).onItemVisibilityChanged(i, i2, new androidx.car.app.utils.RemoteUtils$1(tzVar));
        } catch (android.os.RemoteException e) {
            throw new java.lang.RuntimeException(e);
        }
    }

    private OnItemVisibilityChangedDelegateImpl() {
        this.mStub = null;
    }
}
