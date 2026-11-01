package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class rie implements znb {
    public static final aimz a = aimz.i("com/android/dialer/internationalcallonwifi/ui/InternationalCallOnWifiDialogLauncher");
    public final ruc b;
    public final defpackage.qbe c;
    private final android.content.Context d;
    private final java.lang.String e;
    private final ajct f;
    private final defpackage.rcr g;

    public rie(android.content.Context context, java.lang.String str, defpackage.rcr rcrVar, ajct ajctVar, ruc rucVar, defpackage.qbe qbeVar) {
        this.d = context;
        this.e = str;
        this.g = rcrVar;
        this.f = ajctVar;
        this.b = rucVar;
        this.c = qbeVar;
    }

    /* JADX WARN: Type inference failed for: r5v5, types: [java.lang.Object, java.util.concurrent.Executor] */
    public final void a(java.lang.String str, android.os.Bundle bundle) {
        a.b().l("com/android/dialer/internationalcallonwifi/ui/InternationalCallOnWifiDialogLauncher", "onConnectionEvent", 58, "InternationalCallOnWifiDialogLauncher.java").v("enter");
        if (str.equals("android.telephony.event.EVENT_NOTIFY_INTERNATIONAL_CALL_ON_WFC")) {
            this.c.a(qbc.ei);
            this.b.j(ruc.av);
            defpackage.rcr rcrVar = this.g;
            agsm.i(721, ahvr.H(ahvr.H(((aogc) rcrVar.a).bk(), new defpackage.rht(0), (java.util.concurrent.Executor) rcrVar.b), new defpackage.qgx(this, 16), this.f), "failed to check dialog data and start activity", new java.lang.Object[0]);
        }
    }

    public final void b(boolean z) {
        android.content.Context context = this.d;
        android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) com.android.dialer.internationalcallonwifi.ui.InternationalCallOnWifiDialogActivity.class);
        intent.setFlags(402653184);
        intent.putExtra("extra_call_id_string", this.e);
        intent.putExtra("extra_is_always_warn_checked", z);
        ahqx.l(context, intent);
    }
}
