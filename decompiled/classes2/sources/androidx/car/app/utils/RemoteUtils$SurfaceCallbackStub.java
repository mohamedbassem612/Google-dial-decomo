package androidx.car.app.utils;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public class RemoteUtils$SurfaceCallbackStub extends androidx.car.app.ISurfaceCallback.Stub {
    private final ems mLifecycle;
    private defpackage.uf mSurfaceCallback;

    RemoteUtils$SurfaceCallbackStub(ems emsVar, defpackage.uf ufVar) {
        this.mLifecycle = emsVar;
        this.mSurfaceCallback = ufVar;
        emsVar.c(new defpackage.abm(this));
    }

    @Override // androidx.car.app.ISurfaceCallback
    public int getInterfaceVersion() {
        return 1;
    }

    /* JADX INFO: renamed from: lambda$onClick$0$androidx-car-app-utils-RemoteUtils$SurfaceCallbackStub, reason: not valid java name */
    public /* synthetic */ java.lang.Object m64x98df29ae(float f, float f2) {
        defpackage.uf ufVar = this.mSurfaceCallback;
        if (ufVar == null) {
            return null;
        }
        ufVar.a();
        return null;
    }

    /* JADX INFO: renamed from: lambda$onFling$0$androidx-car-app-utils-RemoteUtils$SurfaceCallbackStub, reason: not valid java name */
    public /* synthetic */ java.lang.Object m65xd9b5e85a(float f, float f2) {
        defpackage.uf ufVar = this.mSurfaceCallback;
        if (ufVar == null) {
            return null;
        }
        ufVar.b();
        return null;
    }

    /* JADX INFO: renamed from: lambda$onScale$0$androidx-car-app-utils-RemoteUtils$SurfaceCallbackStub, reason: not valid java name */
    public /* synthetic */ java.lang.Object m66x675acc2c(float f, float f2, float f3) {
        defpackage.uf ufVar = this.mSurfaceCallback;
        if (ufVar == null) {
            return null;
        }
        ufVar.c();
        return null;
    }

    /* JADX INFO: renamed from: lambda$onScroll$0$androidx-car-app-utils-RemoteUtils$SurfaceCallbackStub, reason: not valid java name */
    public /* synthetic */ java.lang.Object m67x38562d91(float f, float f2) {
        defpackage.uf ufVar = this.mSurfaceCallback;
        if (ufVar == null) {
            return null;
        }
        ufVar.d();
        return null;
    }

    /* JADX INFO: renamed from: lambda$onStableAreaChanged$0$androidx-car-app-utils-RemoteUtils$SurfaceCallbackStub, reason: not valid java name */
    public /* synthetic */ java.lang.Object m68x912a8a8a(android.graphics.Rect rect) {
        defpackage.uf ufVar = this.mSurfaceCallback;
        if (ufVar == null) {
            return null;
        }
        ufVar.e();
        return null;
    }

    /* JADX INFO: renamed from: lambda$onSurfaceAvailable$0$androidx-car-app-utils-RemoteUtils$SurfaceCallbackStub, reason: not valid java name */
    public /* synthetic */ java.lang.Object m69x37c861a2(androidx.car.app.serialization.Bundleable bundleable) {
        defpackage.uf ufVar = this.mSurfaceCallback;
        if (ufVar == null) {
            return null;
        }
        ufVar.f();
        return null;
    }

    /* JADX INFO: renamed from: lambda$onSurfaceDestroyed$0$androidx-car-app-utils-RemoteUtils$SurfaceCallbackStub, reason: not valid java name */
    public /* synthetic */ java.lang.Object m70xdaf3f052(androidx.car.app.serialization.Bundleable bundleable) {
        defpackage.uf ufVar = this.mSurfaceCallback;
        if (ufVar == null) {
            return null;
        }
        ufVar.g();
        return null;
    }

    /* JADX INFO: renamed from: lambda$onVisibleAreaChanged$0$androidx-car-app-utils-RemoteUtils$SurfaceCallbackStub, reason: not valid java name */
    public /* synthetic */ java.lang.Object m71xaddd01c9(android.graphics.Rect rect) {
        defpackage.uf ufVar = this.mSurfaceCallback;
        if (ufVar == null) {
            return null;
        }
        ufVar.h();
        return null;
    }

    @Override // androidx.car.app.ISurfaceCallback
    public void onClick(final float f, final float f2) {
        defpackage.rx.g(this.mLifecycle, "onClick", new defpackage.abc() { // from class: abf
            @Override // defpackage.abc
            public final java.lang.Object a() {
                return this.a.m64x98df29ae(f, f2);
            }
        });
    }

    @Override // androidx.car.app.ISurfaceCallback
    public void onFling(final float f, final float f2) {
        defpackage.rx.g(this.mLifecycle, "onFling", new defpackage.abc() { // from class: abj
            @Override // defpackage.abc
            public final java.lang.Object a() {
                return this.a.m65xd9b5e85a(f, f2);
            }
        });
    }

    @Override // androidx.car.app.ISurfaceCallback
    public void onScale(final float f, final float f2, final float f3) {
        defpackage.rx.g(this.mLifecycle, "onScale", new defpackage.abc() { // from class: abk
            @Override // defpackage.abc
            public final java.lang.Object a() {
                return this.a.m66x675acc2c(f, f2, f3);
            }
        });
    }

    @Override // androidx.car.app.ISurfaceCallback
    public void onScroll(final float f, final float f2) {
        defpackage.rx.g(this.mLifecycle, "onScroll", new defpackage.abc() { // from class: abi
            @Override // defpackage.abc
            public final java.lang.Object a() {
                return this.a.m67x38562d91(f, f2);
            }
        });
    }

    @Override // androidx.car.app.ISurfaceCallback
    public void onStableAreaChanged(final android.graphics.Rect rect, androidx.car.app.IOnDoneCallback iOnDoneCallback) {
        defpackage.rx.h(this.mLifecycle, iOnDoneCallback, "onStableAreaChanged", new defpackage.abc() { // from class: abl
            @Override // defpackage.abc
            public final java.lang.Object a() {
                return this.a.m68x912a8a8a(rect);
            }
        });
    }

    @Override // androidx.car.app.ISurfaceCallback
    public void onSurfaceAvailable(final androidx.car.app.serialization.Bundleable bundleable, androidx.car.app.IOnDoneCallback iOnDoneCallback) {
        defpackage.rx.h(this.mLifecycle, iOnDoneCallback, "onSurfaceAvailable", new defpackage.abc() { // from class: abh
            @Override // defpackage.abc
            public final java.lang.Object a() {
                return this.a.m69x37c861a2(bundleable);
            }
        });
    }

    @Override // androidx.car.app.ISurfaceCallback
    public void onSurfaceDestroyed(final androidx.car.app.serialization.Bundleable bundleable, androidx.car.app.IOnDoneCallback iOnDoneCallback) {
        defpackage.rx.h(this.mLifecycle, iOnDoneCallback, "onSurfaceDestroyed", new defpackage.abc() { // from class: abe
            @Override // defpackage.abc
            public final java.lang.Object a() {
                return this.a.m70xdaf3f052(bundleable);
            }
        });
    }

    @Override // androidx.car.app.ISurfaceCallback
    public void onVisibleAreaChanged(final android.graphics.Rect rect, androidx.car.app.IOnDoneCallback iOnDoneCallback) {
        defpackage.rx.h(this.mLifecycle, iOnDoneCallback, "onVisibleAreaChanged", new defpackage.abc() { // from class: abg
            @Override // defpackage.abc
            public final java.lang.Object a() {
                return this.a.m71xaddd01c9(rect);
            }
        });
    }
}
