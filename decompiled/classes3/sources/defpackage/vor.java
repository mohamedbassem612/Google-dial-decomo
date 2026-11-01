package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class vor implements enh {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ java.lang.Object a;

    public /* synthetic */ vor(java.lang.Object obj, int i) {
        this.$cid = i;
        this.a = obj;
    }

    public final void a(java.lang.Object obj) {
        if (this.$cid != 0) {
            ((com.google.android.material.appbar.AppBarLayout) this.a).o(((java.lang.Boolean) obj).booleanValue());
            return;
        }
        defpackage.voj vojVar = (defpackage.voj) obj;
        com.android.dialer.voicemail.settings.RecordVoicemailGreetingActivity.n.b().l("com/android/dialer/voicemail/settings/RecordVoicemailGreetingActivity", "onStateChanged", 251, "RecordVoicemailGreetingActivity.java").y("state: %s", vojVar);
        int iOrdinal = vojVar.ordinal();
        java.lang.Object obj2 = this.a;
        if (iOrdinal == 0) {
            com.android.dialer.voicemail.settings.RecordVoicemailGreetingActivity recordVoicemailGreetingActivity = (com.android.dialer.voicemail.settings.RecordVoicemailGreetingActivity) obj2;
            recordVoicemailGreetingActivity.o.setVisibility(4);
            recordVoicemailGreetingActivity.y(false);
            recordVoicemailGreetingActivity.z(false);
            recordVoicemailGreetingActivity.s.a(1, 0.0f);
        } else if (iOrdinal == 1) {
            com.android.dialer.voicemail.settings.RecordVoicemailGreetingActivity recordVoicemailGreetingActivity2 = (com.android.dialer.voicemail.settings.RecordVoicemailGreetingActivity) obj2;
            recordVoicemailGreetingActivity2.t.n(rmw.cd);
            recordVoicemailGreetingActivity2.o.setVisibility(4);
            recordVoicemailGreetingActivity2.y(true);
            recordVoicemailGreetingActivity2.z(true);
            recordVoicemailGreetingActivity2.s.a(3, recordVoicemailGreetingActivity2.r.a() / recordVoicemailGreetingActivity2.r.i);
        } else if (iOrdinal == 2) {
            com.android.dialer.voicemail.settings.RecordVoicemailGreetingActivity recordVoicemailGreetingActivity3 = (com.android.dialer.voicemail.settings.RecordVoicemailGreetingActivity) obj2;
            recordVoicemailGreetingActivity3.o.setVisibility(0);
            recordVoicemailGreetingActivity3.y(false);
            recordVoicemailGreetingActivity3.z(false);
            com.android.dialer.voicemail.settings.widget.RecordLottieViewContainer recordLottieViewContainer = recordVoicemailGreetingActivity3.s;
            recordLottieViewContainer.e = recordVoicemailGreetingActivity3.r.j;
            recordLottieViewContainer.a(4, 0.0f);
        } else if (iOrdinal == 3) {
            com.android.dialer.voicemail.settings.RecordVoicemailGreetingActivity recordVoicemailGreetingActivity4 = (com.android.dialer.voicemail.settings.RecordVoicemailGreetingActivity) obj2;
            recordVoicemailGreetingActivity4.t.n(rmw.ct);
            recordVoicemailGreetingActivity4.o.setVisibility(0);
            recordVoicemailGreetingActivity4.y(true);
            recordVoicemailGreetingActivity4.z(false);
            recordVoicemailGreetingActivity4.s.a(6, recordVoicemailGreetingActivity4.r.a() / recordVoicemailGreetingActivity4.r.j);
        } else if (iOrdinal == 4) {
            com.android.dialer.voicemail.settings.RecordVoicemailGreetingActivity recordVoicemailGreetingActivity5 = (com.android.dialer.voicemail.settings.RecordVoicemailGreetingActivity) obj2;
            recordVoicemailGreetingActivity5.o.setVisibility(0);
            recordVoicemailGreetingActivity5.y(false);
            recordVoicemailGreetingActivity5.z(false);
            recordVoicemailGreetingActivity5.s.a(7, 0.0f);
        } else if (iOrdinal == 5) {
            com.android.dialer.voicemail.settings.RecordVoicemailGreetingActivity recordVoicemailGreetingActivity6 = (com.android.dialer.voicemail.settings.RecordVoicemailGreetingActivity) obj2;
            recordVoicemailGreetingActivity6.o.setVisibility(0);
            recordVoicemailGreetingActivity6.y(false);
            recordVoicemailGreetingActivity6.z(false);
            recordVoicemailGreetingActivity6.s.a(8, 0.0f);
        }
        com.android.dialer.voicemail.settings.RecordVoicemailGreetingActivity recordVoicemailGreetingActivity7 = (com.android.dialer.voicemail.settings.RecordVoicemailGreetingActivity) obj2;
        recordVoicemailGreetingActivity7.w();
        aigf aigfVar = recordVoicemailGreetingActivity7.w;
        if (aigfVar.containsKey(vojVar)) {
            ((na) aigfVar.get(vojVar)).f(true);
        } else {
            recordVoicemailGreetingActivity7.v.f(true);
        }
    }
}
