package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class vov implements eoe {
    final /* synthetic */ com.android.dialer.voicemail.settings.RecordVoicemailGreetingActivity a;

    public vov(com.android.dialer.voicemail.settings.RecordVoicemailGreetingActivity recordVoicemailGreetingActivity) {
        j$.util.Objects.requireNonNull(recordVoicemailGreetingActivity);
        this.a = recordVoicemailGreetingActivity;
    }

    public final eoa a(java.lang.Class cls) {
        return new defpackage.vol(this.a.getApplication(), false);
    }

    public final /* synthetic */ eoa b(java.lang.Class cls, eoq eoqVar) {
        return enn.e(this, cls);
    }

    public final /* synthetic */ eoa c(aopu aopuVar, eoq eoqVar) {
        return enn.c(this, aopuVar, eoqVar);
    }
}
