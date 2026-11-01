package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class qbx {
    public static final defpackage.aimz a = defpackage.aimz.i("com/android/dialer/incall/motorolaincalluinotifier/MotorolaInCallUiNotifier");
    public final defpackage.zof b;
    public final znv c;
    private final android.content.Context d;

    public qbx(android.content.Context context) {
        defpackage.aooh.f(context, "appContext");
        this.d = context;
        this.b = new nzx(this, 4);
        this.c = new ooa(this, 4);
    }

    public final void a(boolean z) {
        ((defpackage.aimw) a.b().l("com/android/dialer/incall/motorolaincalluinotifier/MotorolaInCallUiNotifier", "sendUiVisibilityBroadcast", 38, "MotorolaInCallUiNotifier.kt")).y("sending visibility: %b", java.lang.Boolean.valueOf(z));
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("visible", z);
        intent.setAction("com.motorola.incallui.action.INCOMING_CALL_VISIBILITY_CHANGED");
        this.d.sendBroadcast(intent, "com.motorola.incallui.permission.INCOMING_CALL_VISIBILITY_CHANGED");
    }
}
