package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class vpn implements ahyc {
    public final /* synthetic */ android.telecom.PhoneAccountHandle a;
    public final /* synthetic */ java.util.function.Function b;

    public /* synthetic */ vpn(android.telecom.PhoneAccountHandle phoneAccountHandle, java.util.function.Function function) {
        this.a = phoneAccountHandle;
        this.b = function;
    }

    public final java.lang.Object apply(java.lang.Object obj) {
        android.telecom.PhoneAccountHandle phoneAccountHandle = this.a;
        vpk vpkVarB = (vpk) obj;
        if (!vpq.g(phoneAccountHandle, vpkVarB)) {
            vpkVarB = vpq.b(phoneAccountHandle, vpkVarB);
        }
        return (vpk) aa$.ExternalSyntheticApiModelOutline1.m(this.b, vpkVarB);
    }
}
