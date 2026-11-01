package androidx.car.app.utils;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public class RemoteUtils$1 extends androidx.car.app.IOnDoneCallback.Stub {
    final /* synthetic */ defpackage.tz val$callback;

    public RemoteUtils$1(defpackage.tz tzVar) {
        this.val$callback = tzVar;
    }

    @Override // androidx.car.app.IOnDoneCallback
    public int getInterfaceVersion() {
        return 1;
    }

    @Override // androidx.car.app.IOnDoneCallback
    public void onFailure(androidx.car.app.serialization.Bundleable bundleable) {
        this.val$callback.a();
    }

    @Override // androidx.car.app.IOnDoneCallback
    public void onSuccess(androidx.car.app.serialization.Bundleable bundleable) {
        this.val$callback.b();
    }
}
