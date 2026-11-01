package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class amfa {
    public final aizr c;
    public int d = 0;
    public j$.util.OptionalInt e = j$.util.OptionalInt.empty();
    public j$.time.Instant f = j$.time.Instant.MIN;
    public j$.time.Instant g = j$.time.Instant.MIN;
    private j$.util.Optional i;
    private static final aimz h = aimz.i("com/google/quality/views/extraction/kcube/bg/ondevice/modules/vc/VisualCallingDuplexLogger");
    public static final j$.time.Duration a = j$.time.Duration.ofMillis(500);
    public static final j$.time.Duration b = j$.time.Duration.ofMillis(500);

    public amfa(aizr aizrVar) {
        this.i = j$.util.Optional.empty();
        this.c = aizrVar;
        this.i = j$.util.Optional.empty();
    }

    public static final j$.util.OptionalInt a(defpackage.amfu amfuVar) {
        return j$.util.stream.IntStream.-CC.range(0, amfuVar.b.size()).filter(new defpackage.altq(amfuVar, 5)).max();
    }

    public final void b() {
        if (this.i.isEmpty()) {
            h.d().l("com/google/quality/views/extraction/kcube/bg/ondevice/modules/vc/VisualCallingDuplexLogger", "safeLogEvent", 61, "VisualCallingDuplexLogger.java").v("VisualCallingDuplexLogger is used before initialization.");
        } else {
            this.i.isPresent();
        }
    }
}
