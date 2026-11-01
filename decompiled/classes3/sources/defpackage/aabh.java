package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class aabh extends defpackage.aabi {
    @Override // defpackage.aabi
    public final void a(android.os.Bundle bundle) {
        if (bundle.getBoolean("ack", false)) {
            d(null);
        } else {
            c(new defpackage.aabj("Invalid response to one way request", null));
        }
    }

    @Override // defpackage.aabi
    public final boolean b() {
        return true;
    }
}
