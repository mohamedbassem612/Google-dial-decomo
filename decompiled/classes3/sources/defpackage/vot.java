package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class vot extends na {
    final /* synthetic */ com.android.dialer.voicemail.settings.RecordVoicemailGreetingActivity a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vot(com.android.dialer.voicemail.settings.RecordVoicemailGreetingActivity recordVoicemailGreetingActivity) {
        super(false);
        j$.util.Objects.requireNonNull(recordVoicemailGreetingActivity);
        this.a = recordVoicemailGreetingActivity;
    }

    public final void b() {
        com.android.dialer.voicemail.settings.RecordVoicemailGreetingActivity recordVoicemailGreetingActivity = this.a;
        recordVoicemailGreetingActivity.t.n(rmw.cr);
        recordVoicemailGreetingActivity.A();
    }
}
