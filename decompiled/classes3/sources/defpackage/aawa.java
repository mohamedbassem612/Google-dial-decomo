package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class aawa extends defpackage.aafx implements aadl {
    private final /* synthetic */ int $cid;
    private final com.google.android.gms.common.api.Status b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aawa(com.google.android.gms.common.data.DataHolder dataHolder, int i, byte[] bArr) {
        super(dataHolder);
        this.$cid = i;
        this.b = new com.google.android.gms.common.api.Status(dataHolder.e, (java.lang.String) null, (android.app.PendingIntent) null, (com.google.android.gms.common.ConnectionResult) null);
    }

    public final com.google.android.gms.common.api.Status b() {
        return this.b;
    }

    @Override // defpackage.aafx
    protected final /* synthetic */ java.lang.Object f(int i, int i2) {
        return this.$cid != 0 ? new defpackage.aaxd(this.a, i, i2) : new defpackage.aaxe(this.a, i, i2);
    }

    @Override // defpackage.aafx
    protected final java.lang.String g() {
        return "path";
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aawa(com.google.android.gms.common.data.DataHolder dataHolder, int i) {
        super(dataHolder);
        this.$cid = i;
        this.b = new com.google.android.gms.common.api.Status(dataHolder.e, (java.lang.String) null, (android.app.PendingIntent) null, (com.google.android.gms.common.ConnectionResult) null);
    }
}
