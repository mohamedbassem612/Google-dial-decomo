package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
final class anxv implements defpackage.aodo {
    @Override // defpackage.aodo
    public final long a() {
        j$.time.Instant instantNow = j$.time.Instant.now();
        return defpackage.aiql.ai(java.util.concurrent.TimeUnit.SECONDS.toNanos(instantNow.getEpochSecond()), instantNow.getNano());
    }
}
