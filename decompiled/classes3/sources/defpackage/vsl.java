package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class vsl extends amzm {
    private final amzg b;
    private final amzg c;

    public vsl(amyz amyzVar, amyz amyzVar2, amzg amzgVar, amzg amzgVar2) {
        super(amyzVar2, new defpackage.amzw(defpackage.vsl.class), amyzVar);
        this.b = amzs.b(amzgVar);
        this.c = amzs.b(amzgVar2);
    }

    public final /* bridge */ /* synthetic */ ajcq b(java.lang.Object obj) {
        java.util.List list = (java.util.List) obj;
        android.content.Context context = (android.content.Context) list.get(0);
        android.telecom.PhoneAccountHandle phoneAccountHandle = (android.telecom.PhoneAccountHandle) list.get(1);
        android.content.Intent intent = new android.content.Intent(new android.content.Intent(context, (java.lang.Class<?>) com.android.dialer.voicemail.settings.pin.VoicemailChangePinActivity.class));
        intent.setFlags(536870912);
        intent.putExtra("phone_account_handle", phoneAccountHandle);
        return aiql.z(j$.util.Optional.of(intent));
    }

    protected final ajcq c() {
        return aiql.w(new ajcq[]{this.b.d(), this.c.d()});
    }
}
