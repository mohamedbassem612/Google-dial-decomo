package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
final class aaxu extends defpackage.aaxt {
    @Override // defpackage.aaxj
    public final void b(com.google.android.gms.wearable.internal.GetCapabilityResponse getCapabilityResponse) {
        com.google.android.gms.common.api.Status statusE = aaoo.E(getCapabilityResponse.a);
        com.google.android.gms.wearable.internal.CapabilityInfoParcelable capabilityInfoParcelable = getCapabilityResponse.b;
        i(new defpackage.aaxc(statusE, capabilityInfoParcelable == null ? null : new defpackage.aawp(capabilityInfoParcelable), 1));
    }
}
