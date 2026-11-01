package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class vjv implements defpackage.viz {
    private final /* synthetic */ int $cid;
    private final ajct a;
    private final vgj b;

    public vjv(vgj vgjVar, ajct ajctVar, int i) {
        this.$cid = i;
        this.b = vgjVar;
        this.a = ajctVar;
    }

    @Override // defpackage.viz
    public final ajcq a(j$.util.Optional optional) {
        if (this.$cid != 0) {
            return ahvr.H(this.b.b((android.telecom.PhoneAccountHandle) optional.orElseThrow()), new defpackage.vft(20), this.a);
        }
        return ahvr.H(this.b.b((android.telecom.PhoneAccountHandle) optional.orElseThrow()), new defpackage.vju(1), this.a);
    }

    @Override // defpackage.viz
    public final ajcq b(j$.util.Optional optional) {
        if (this.$cid != 0) {
            return aiql.z("STATUS");
        }
        return ahvr.H(this.b.b((android.telecom.PhoneAccountHandle) optional.orElseThrow()), new defpackage.vju(0), this.a);
    }

    @Override // defpackage.viz
    public final j$.util.Optional c() {
        return this.$cid != 0 ? j$.util.Optional.of(java.lang.String.format(java.util.Locale.US, "%s:%s=%s;%s=%s", "Deactivate", "pv", "12", "ct", wsc.aE())) : j$.util.Optional.of(java.lang.String.format(java.util.Locale.US, "%s:%s=%s;%s=%s", "Deactivate", "pv", "13", "ct", wsc.aE()));
    }
}
