package androidx.car.app.model;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
@defpackage.ug
public class OnCheckedChangeDelegateImpl implements defpackage.xq {
    private final androidx.car.app.model.IOnCheckedChangeListener mStub;

    /* JADX INFO: compiled from: PG */
    @defpackage.ug
    public class OnCheckedChangeListenerStub extends androidx.car.app.model.IOnCheckedChangeListener.Stub {
        private final defpackage.zg mListener;

        public OnCheckedChangeListenerStub(defpackage.zg zgVar) {
            this.mListener = zgVar;
        }

        @Override // androidx.car.app.model.IOnCheckedChangeListener
        public int getInterfaceVersion() {
            return 1;
        }

        /* JADX INFO: renamed from: lambda$onCheckedChange$0$androidx-car-app-model-OnCheckedChangeDelegateImpl$OnCheckedChangeListenerStub, reason: not valid java name */
        public /* synthetic */ java.lang.Object m45xd37d5aa3(boolean z) {
            this.mListener.a();
            return null;
        }

        @Override // androidx.car.app.model.IOnCheckedChangeListener
        public void onCheckedChange(final boolean z, androidx.car.app.IOnDoneCallback iOnDoneCallback) {
            defpackage.rx.f(iOnDoneCallback, "onCheckedChange", new defpackage.abc() { // from class: xr
                @Override // defpackage.abc
                public final java.lang.Object a() {
                    return this.a.m45xd37d5aa3(z);
                }
            });
        }
    }

    private OnCheckedChangeDelegateImpl(defpackage.zg zgVar) {
        this.mStub = new androidx.car.app.model.OnCheckedChangeDelegateImpl.OnCheckedChangeListenerStub(zgVar);
    }

    public static defpackage.xq create(defpackage.zg zgVar) {
        return new androidx.car.app.model.OnCheckedChangeDelegateImpl(zgVar);
    }

    public void sendCheckedChange(boolean z, defpackage.tz tzVar) {
        try {
            ((androidx.car.app.model.IOnCheckedChangeListener) j$.util.Objects.requireNonNull(this.mStub)).onCheckedChange(z, new androidx.car.app.utils.RemoteUtils$1(tzVar));
        } catch (android.os.RemoteException e) {
            throw new java.lang.RuntimeException(e);
        }
    }

    private OnCheckedChangeDelegateImpl() {
        this.mStub = null;
    }
}
