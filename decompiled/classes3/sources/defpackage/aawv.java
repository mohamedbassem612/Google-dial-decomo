package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class aawv extends defpackage.aawn {
    final /* synthetic */ com.google.android.gms.wearable.internal.ChannelImpl a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aawv(com.google.android.gms.wearable.internal.ChannelImpl channelImpl, aade aadeVar) {
        super(aadeVar);
        j$.util.Objects.requireNonNull(channelImpl);
        this.a = channelImpl;
    }

    public final /* synthetic */ aadl a(com.google.android.gms.common.api.Status status) {
        return new defpackage.aaww(status, (java.io.InputStream) null, 1);
    }

    protected final /* bridge */ /* synthetic */ void b(aacr aacrVar) {
        defpackage.aaxg aaxgVar = new defpackage.aaxg();
        defpackage.aaxn aaxnVar = (defpackage.aaxn) ((defpackage.aayc) aacrVar).v();
        defpackage.aaxv aaxvVar = new defpackage.aaxv(this, aaxgVar);
        android.os.Parcel parcelEP = aaxnVar.eP();
        yld.f(parcelEP, aaxvVar);
        yld.f(parcelEP, aaxgVar);
        parcelEP.writeString(this.a.a);
        aaxnVar.eR(34, parcelEP);
    }
}
