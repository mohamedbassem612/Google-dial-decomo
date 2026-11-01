package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class aaxs extends defpackage.aaxj {
    final /* synthetic */ zzx a;

    public aaxs(defpackage.aawd aawdVar, zzx zzxVar) {
        this.a = zzxVar;
        j$.util.Objects.requireNonNull(aawdVar);
    }

    @Override // defpackage.aaxj
    public final void e(com.google.android.gms.wearable.internal.GetNodeIdResponse getNodeIdResponse) {
        aais.ax(aaoo.E(getNodeIdResponse.a), getNodeIdResponse.b, this.a);
    }
}
