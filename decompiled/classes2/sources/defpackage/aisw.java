package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class aisw extends defpackage.airh {
    final /* synthetic */ defpackage.airh a;
    final /* synthetic */ defpackage.airh b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aisw(defpackage.airh airhVar, defpackage.airh airhVar2, defpackage.airh airhVar3) {
        super(null);
        this.a = airhVar2;
        this.b = airhVar3;
        j$.util.Objects.requireNonNull(airhVar);
    }

    public final java.lang.String toString() {
        return this.b.toString() + ".immediatelyBetween('{', INCLUSIVE, '}', INCLUSIVE)";
    }
}
