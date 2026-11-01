package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class aisv extends defpackage.airh {
    final /* synthetic */ java.lang.String a = "}";
    final /* synthetic */ defpackage.airh b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aisv(defpackage.airh airhVar, defpackage.airh airhVar2) {
        super(null);
        this.b = airhVar2;
        j$.util.Objects.requireNonNull(airhVar);
    }

    public final java.lang.String toString() {
        return this.b.toString().concat(".immediatelyBetween('{', '}')");
    }
}
