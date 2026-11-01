package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class aage extends defpackage.aafy {
    final /* synthetic */ defpackage.aagf h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aage(defpackage.aagf aagfVar, int i, android.os.Bundle bundle, int i2) {
        super(aagfVar, i, bundle, i2);
        j$.util.Objects.requireNonNull(aagfVar);
        this.h = aagfVar;
    }

    @Override // defpackage.aafy
    protected final void a(com.google.android.gms.common.ConnectionResult connectionResult) {
        this.h.g.a(connectionResult);
        java.lang.System.currentTimeMillis();
    }

    @Override // defpackage.aafy
    protected final boolean b() {
        this.h.g.a(com.google.android.gms.common.ConnectionResult.a);
        return true;
    }
}
