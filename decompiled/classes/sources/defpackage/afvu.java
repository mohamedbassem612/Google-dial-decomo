package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public class afvu {
    private android.window.OnBackInvokedCallback a;

    public android.window.OnBackInvokedCallback a(defpackage.afvt afvtVar) {
        j$.util.Objects.requireNonNull(afvtVar);
        return new ls(afvtVar, 5);
    }

    public void b(defpackage.afvt afvtVar, android.view.View view, boolean z) {
        android.window.OnBackInvokedDispatcher onBackInvokedDispatcherM;
        if (this.a != null || (onBackInvokedDispatcherM = ae$.ExternalSyntheticApiModelOutline0.m(view)) == null) {
            return;
        }
        android.window.OnBackInvokedCallback onBackInvokedCallbackA = a(afvtVar);
        this.a = onBackInvokedCallbackA;
        ae$.ExternalSyntheticApiModelOutline0.m(onBackInvokedDispatcherM, true != z ? 0 : 1000000, onBackInvokedCallbackA);
    }

    public void c(android.view.View view) {
        android.window.OnBackInvokedDispatcher onBackInvokedDispatcherM;
        if (this.a == null || (onBackInvokedDispatcherM = ae$.ExternalSyntheticApiModelOutline0.m(view)) == null) {
            return;
        }
        ae$.ExternalSyntheticApiModelOutline0.m(onBackInvokedDispatcherM, this.a);
        this.a = null;
    }

    final boolean d() {
        return this.a != null;
    }
}
