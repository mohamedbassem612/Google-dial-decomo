package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class vjt implements defpackage.viz {
    private final /* synthetic */ int $cid;

    public vjt(int i) {
        this.$cid = i;
    }

    @Override // defpackage.viz
    public final ajcq a(j$.util.Optional optional) {
        int i = this.$cid;
        if (i != 0) {
            return i != 1 ? aiql.z("STATUS") : aiql.z(java.lang.String.format(java.util.Locale.US, "%s:%s=%d", "Activate", "dt", 6));
        }
        return aiql.z(java.lang.String.format(java.util.Locale.US, "%s:%s=%s;%s=%s", "Activate", "pv", "11", "ct", wsc.aE()));
    }

    @Override // defpackage.viz
    public final ajcq b(j$.util.Optional optional) {
        int i = this.$cid;
        if (i != 0) {
            return i != 1 ? aiql.z("STATUS") : aiql.z("STATUS");
        }
        return aiql.z("STATUS");
    }

    @Override // defpackage.viz
    public final j$.util.Optional c() {
        int i = this.$cid;
        if (i != 0) {
            return i != 1 ? j$.util.Optional.empty() : j$.util.Optional.of(java.lang.String.format(java.util.Locale.US, "%s:%s=%d", "Deactivate", "dt", 6));
        }
        return j$.util.Optional.of(java.lang.String.format(java.util.Locale.US, "%s:%s=%s;%s=%s", "Deactivate", "pv", "11", "ct", wsc.aE()));
    }
}
