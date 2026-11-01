package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class qav {
    private static final aimz a = aimz.i("com/android/dialer/incall/incallservicelisteners/OnBringToForegroundListenerImpl");
    private final android.content.Context b;
    private final zpm c;
    private final tkl d;
    private final ipc e;

    public qav(android.content.Context context, zpm zpmVar, ipc ipcVar, tkl tklVar) {
        this.b = context;
        this.c = zpmVar;
        this.e = ipcVar;
        this.d = tklVar;
    }

    public final void a(boolean z) {
        if (this.c.a().isEmpty()) {
            a.b().l("com/android/dialer/incall/incallservicelisteners/OnBringToForegroundListenerImpl", "onBringToForeground", 42, "OnBringToForegroundListenerImpl.java").v("no call scopes present");
            return;
        }
        java.lang.Boolean bool = (java.lang.Boolean) this.d.e().orElse(java.lang.Boolean.FALSE);
        boolean zBooleanValue = bool.booleanValue();
        aimz aimzVar = a;
        aimzVar.b().l("com/android/dialer/incall/incallservicelisteners/OnBringToForegroundListenerImpl", "onBringToForeground", 47, "OnBringToForegroundListenerImpl.java").y("isInCallUiVisible: %b", bool);
        if (zBooleanValue) {
            aimzVar.b().l("com/android/dialer/incall/incallservicelisteners/OnBringToForegroundListenerImpl", "onBringToForeground", 49, "OnBringToForegroundListenerImpl.java").v("in-call UI is already showing, avoid firing InCallActivityIntent");
            return;
        }
        android.content.Context context = this.b;
        ipc ipcVar = this.e;
        defpackage.otc otcVarAo = pez.ao();
        otcVarAo.e(z);
        otcVarAo.d(false);
        otcVarAo.b(false);
        ahqx.l(context, ipcVar.bk(otcVarAo.a()));
    }
}
