package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final /* synthetic */ class aba implements defpackage.abd {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;
    public final /* synthetic */ java.lang.Object b;
    public final /* synthetic */ java.lang.Object c;

    public /* synthetic */ aba(androidx.car.app.IOnDoneCallback iOnDoneCallback, java.lang.Object obj, java.lang.String str, int i) {
        this.$cid = i;
        this.b = iOnDoneCallback;
        this.a = obj;
        this.c = str;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0066  */
    /* JADX WARN: Code duplicated, block: B:23:0x0074  */
    /* JADX WARN: Type inference failed for: r2v0, types: [androidx.car.app.IOnDoneCallback, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v10, types: [androidx.car.app.IOnDoneCallback, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.lang.Object, tu] */
    @Override // defpackage.abd
    public final java.lang.Object a() {
        androidx.car.app.serialization.Bundleable bundleable;
        java.lang.Object obj;
        int i = this.$cid;
        if (i == 0) {
            java.lang.Object obj2 = this.a;
            ?? r2 = this.b;
            if (obj2 == null) {
                bundleable = null;
            } else {
                try {
                    bundleable = new androidx.car.app.serialization.Bundleable(obj2);
                } catch (defpackage.aav e) {
                    defpackage.rx.j(r2, (java.lang.String) this.c, e);
                }
            }
            r2.onSuccess(bundleable);
        } else if (i != 1) {
            try {
                this.b.onFailure(new androidx.car.app.serialization.Bundleable(new androidx.car.app.FailureResponse((java.lang.Throwable) this.c)));
            } catch (defpackage.aav e2) {
                android.util.Log.e("CarApp.Dispatch", "Serialization failure in ".concat(java.lang.String.valueOf(this.a)), e2);
            }
        } else {
            java.lang.Object obj3 = this.a;
            if (((defpackage.tw) obj3).a == null) {
                android.util.Log.e("CarApp.Dispatch", "Host is not bound when attempting to retrieve host service");
            } else {
                try {
                    if (((defpackage.tw) obj3).b == null) {
                        final defpackage.tw twVar = (defpackage.tw) obj3;
                        ((defpackage.tw) obj3).b = defpackage.rx.e("getHost(App)", new defpackage.abd() { // from class: tv
                            @Override // defpackage.abd
                            public final java.lang.Object a() {
                                return androidx.car.app.IAppHost.Stub.asInterface(((androidx.car.app.ICarHost) j$.util.Objects.requireNonNull(twVar.a)).getHost("app"));
                            }
                        });
                    }
                    obj = ((defpackage.tw) obj3).b;
                } catch (defpackage.tx unused) {
                    android.util.Log.e("CarApp.Dispatch", "Host threw an exception when attempting to retrieve host service");
                    obj = null;
                }
                if (obj == null) {
                    android.util.Log.e("CarApp.Dispatch", "Could not retrieve host while dispatching call ".concat((java.lang.String) this.c));
                } else {
                    this.b.a(obj);
                }
            }
            obj = null;
            if (obj == null) {
                android.util.Log.e("CarApp.Dispatch", "Could not retrieve host while dispatching call ".concat((java.lang.String) this.c));
            } else {
                this.b.a(obj);
            }
        }
        return null;
    }

    public /* synthetic */ aba(androidx.car.app.IOnDoneCallback iOnDoneCallback, java.lang.Throwable th, java.lang.String str, int i) {
        this.$cid = i;
        this.b = iOnDoneCallback;
        this.c = th;
        this.a = str;
    }

    public /* synthetic */ aba(defpackage.tw twVar, java.lang.String str, defpackage.tu tuVar, int i) {
        this.$cid = i;
        this.a = twVar;
        this.c = str;
        this.b = tuVar;
    }
}
