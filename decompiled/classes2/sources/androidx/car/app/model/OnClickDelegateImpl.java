package androidx.car.app.model;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
@defpackage.ug
public class OnClickDelegateImpl implements defpackage.xs {
    private final boolean mIsParkedOnly;
    private final androidx.car.app.model.IOnClickListener mListener;

    /* JADX INFO: compiled from: PG */
    public class OnClickListenerStub extends androidx.car.app.model.IOnClickListener.Stub {
        private final defpackage.xu mOnClickListener;

        public OnClickListenerStub(defpackage.xu xuVar) {
            this.mOnClickListener = xuVar;
        }

        @Override // androidx.car.app.model.IOnClickListener
        public int getInterfaceVersion() {
            return 1;
        }

        /* JADX INFO: renamed from: lambda$onClick$0$androidx-car-app-model-OnClickDelegateImpl$OnClickListenerStub, reason: not valid java name */
        public /* synthetic */ java.lang.Object m46xba9c2d94() {
            this.mOnClickListener.onClick();
            return null;
        }

        @Override // androidx.car.app.model.IOnClickListener
        public void onClick(androidx.car.app.IOnDoneCallback iOnDoneCallback) {
            defpackage.rx.f(iOnDoneCallback, "onClick", new defpackage.abc() { // from class: xt
                @Override // defpackage.abc
                public final java.lang.Object a() {
                    return this.a.m46xba9c2d94();
                }
            });
        }
    }

    private OnClickDelegateImpl(defpackage.xu xuVar, boolean z) {
        this.mListener = new androidx.car.app.model.OnClickDelegateImpl.OnClickListenerStub(xuVar);
        this.mIsParkedOnly = z;
    }

    public static defpackage.xs create(defpackage.xu xuVar) {
        return new androidx.car.app.model.OnClickDelegateImpl(xuVar, xuVar instanceof androidx.car.app.model.ParkedOnlyOnClickListener);
    }

    @Override // defpackage.xs
    public boolean isParkedOnly() {
        return this.mIsParkedOnly;
    }

    public void sendClick(defpackage.tz tzVar) {
        try {
            ((androidx.car.app.model.IOnClickListener) j$.util.Objects.requireNonNull(this.mListener)).onClick(new androidx.car.app.utils.RemoteUtils$1(tzVar));
        } catch (android.os.RemoteException e) {
            throw new java.lang.RuntimeException(e);
        }
    }

    private OnClickDelegateImpl() {
        this.mListener = null;
        this.mIsParkedOnly = false;
    }
}
