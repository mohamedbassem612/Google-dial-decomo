package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aajt implements defpackage.aaei, defpackage.aafi {
    public final java.util.Queue a = new java.util.ArrayDeque();
    public com.google.android.gms.common.api.Status b = new com.google.android.gms.common.api.Status(17, "None of the GmsClient connection callbacks have been called.", null, null);

    private final void c() {
        while (true) {
            java.util.function.Consumer consumerM = aa$.ExternalSyntheticApiModelOutline1.m(this.a.poll());
            if (consumerM == null) {
                return;
            } else {
                aa$.ExternalSyntheticApiModelOutline1.m(consumerM, this.b);
            }
        }
    }

    @Override // defpackage.aaei
    public final void a(android.os.Bundle bundle) {
        this.b = com.google.android.gms.common.api.Status.a;
        c();
    }

    @Override // defpackage.aaei
    public final void b(int i) {
        this.b = new com.google.android.gms.common.api.Status(20, defpackage.a.bj(i, "Connection to the GMS Core module was suspended, cause: "), null, null);
        c();
    }

    @Override // defpackage.aafi
    public final void i(com.google.android.gms.common.ConnectionResult connectionResult) {
        this.b = new com.google.android.gms.common.api.Status(connectionResult, "Connection to the GMS Core module failed.");
        c();
    }
}
