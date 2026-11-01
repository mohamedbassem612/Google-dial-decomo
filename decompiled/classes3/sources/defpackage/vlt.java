package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class vlt implements j$.time.temporal.TemporalQuery {
    private final /* synthetic */ int $cid;

    public final java.lang.Object queryFrom(j$.time.temporal.TemporalAccessor temporalAccessor) {
        return this.$cid != 0 ? j$.time.Instant.from(temporalAccessor) : j$.time.Instant.from(temporalAccessor);
    }
}
