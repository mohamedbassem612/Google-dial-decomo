package androidx.car.app.navigation;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public class NavigationManager$1 extends androidx.car.app.navigation.INavigationManager.Stub {
    final /* synthetic */ defpackage.zv this$0;
    final /* synthetic */ ems val$lifecycle;

    public NavigationManager$1(defpackage.zv zvVar, ems emsVar) {
        this.val$lifecycle = emsVar;
        this.this$0 = zvVar;
    }

    @Override // androidx.car.app.navigation.INavigationManager
    public int getInterfaceVersion() {
        return 1;
    }

    /* JADX INFO: renamed from: lambda$onStopNavigation$0$androidx-car-app-navigation-NavigationManager$1, reason: not valid java name */
    public /* synthetic */ java.lang.Object m61xb1216230() {
        defpackage.abn.a();
        return null;
    }

    @Override // androidx.car.app.navigation.INavigationManager
    public void onStopNavigation(androidx.car.app.IOnDoneCallback iOnDoneCallback) {
        defpackage.rx.h(this.val$lifecycle, iOnDoneCallback, "onStopNavigation", new defpackage.abc() { // from class: zt
            @Override // defpackage.abc
            public final java.lang.Object a() {
                return this.a.m61xb1216230();
            }
        });
    }
}
