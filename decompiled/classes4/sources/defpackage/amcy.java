package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class amcy {
    public static final akzm a = aldf.c(500);
    public j$.util.Optional b = j$.util.Optional.empty();
    public j$.util.OptionalInt c = j$.util.OptionalInt.empty();
    public int d;

    public static final j$.util.OptionalInt a(defpackage.amfu amfuVar) {
        return j$.util.stream.IntStream.-CC.range(0, amfuVar.b.size()).filter(new defpackage.altq(amfuVar, 4)).max();
    }
}
