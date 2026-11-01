package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class tbo {
    public static final defpackage.aimz a = defpackage.aimz.i("com/android/dialer/revelio/impl/tidepods/impl/transcriptdatabase/RevelioTranscriptDatabaseUpdater");
    private final defpackage.ajcu b;
    private final defpackage.lkk c;

    public tbo(defpackage.ajcu ajcuVar, defpackage.lkk lkkVar) {
        this.b = ajcuVar;
        this.c = lkkVar;
    }

    public final defpackage.ajcq a(long j, int i) {
        return defpackage.ahvr.B(this.c.e(java.lang.String.valueOf(j), new tbn(i, 0), j$.time.Instant.now().toEpochMilli()), java.lang.Throwable.class, new tbc(i, 2), this.b);
    }
}
