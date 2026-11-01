package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class vsi extends amzm {
    private final amzg b;
    private final amzg c;
    private final amzg d;

    public vsi(amyz amyzVar, amyz amyzVar2, amzg amzgVar, amzg amzgVar2, amzg amzgVar3) {
        super(amyzVar2, new defpackage.amzw(defpackage.vsi.class), amyzVar);
        this.b = amzs.b(amzgVar);
        this.c = amzs.b(amzgVar2);
        this.d = amzs.b(amzgVar3);
    }

    public final /* bridge */ /* synthetic */ ajcq b(java.lang.Object obj) {
        java.util.List list = (java.util.List) obj;
        android.telecom.PhoneAccountHandle phoneAccountHandle = (android.telecom.PhoneAccountHandle) list.get(0);
        int iIntValue = ((java.lang.Integer) list.get(1)).intValue();
        j$.util.Optional optional = (j$.util.Optional) list.get(2);
        android.content.Intent intent = new android.content.Intent("android.telephony.action.CONFIGURE_VOICEMAIL");
        intent.setFlags(536870912);
        intent.putExtra("android.telephony.extra.HIDE_PUBLIC_SETTINGS", true);
        intent.putExtra("android.telephony.extra.PHONE_ACCOUNT_HANDLE", phoneAccountHandle);
        intent.putExtra("com.android.phone.settings.SubscriptionInfoHelper.SubscriptionId", iIntValue);
        intent.putExtra("com.android.phone.settings.SubscriptionInfoHelper.SubscriptionLabel", ((android.telecom.PhoneAccount) optional.orElseThrow()).getLabel());
        return aiql.z(intent);
    }

    protected final ajcq c() {
        amzg amzgVar = this.d;
        return aiql.w(new ajcq[]{this.b.d(), this.c.d(), amzgVar.d()});
    }
}
