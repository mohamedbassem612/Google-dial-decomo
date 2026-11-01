package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class aaya extends defpackage.aaxt {
    @Override // defpackage.aaxj
    public final void h(com.google.android.gms.wearable.internal.RpcResponse rpcResponse) {
        com.google.android.gms.common.api.Status statusE = aaoo.E(rpcResponse.a);
        int i = rpcResponse.b;
        i(new defpackage.aaxc(statusE, rpcResponse.c, 2));
    }
}
