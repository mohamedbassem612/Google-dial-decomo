package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class vxe implements android.content.DialogInterface.OnClickListener {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ defpackage.vxq a;

    public /* synthetic */ vxe(defpackage.vxq vxqVar, int i) {
        this.$cid = i;
        this.a = vxqVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(android.content.DialogInterface dialogInterface, int i) {
        int i2 = this.$cid;
        defpackage.vxq vxqVar = this.a;
        if (i2 != 0) {
            vxqVar.m.n(rmw.ab);
            android.content.Intent intent = new android.content.Intent("android.telephony.action.CONFIGURE_VOICEMAIL");
            intent.putExtra("android.telephony.extra.PHONE_ACCOUNT_HANDLE", ((defpackage.vub) vxqVar.E.orElseThrow()).f);
            afsq.G(vxqVar.d, intent);
            return;
        }
        j$.util.Optional optional = vxqVar.E;
        defpackage.vxc vxcVar = new defpackage.vxc(vxqVar, 2);
        if (true == optional.isPresent()) {
            java.lang.Object obj = optional.get();
            java.lang.Object obj2 = vxcVar.a;
            ((defpackage.vxq) obj2).W.r(((defpackage.vub) obj).f);
        }
    }
}
