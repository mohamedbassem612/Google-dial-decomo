package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
final class anyt extends defpackage.anwe {
    final /* synthetic */ anqw a;
    final /* synthetic */ anty b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public anyt(defpackage.anyu anyuVar, anty antyVar, anqw anqwVar) {
        super(anyuVar.a);
        this.b = antyVar;
        this.a = anqwVar;
        j$.util.Objects.requireNonNull(anyuVar);
    }

    @Override // defpackage.anwe
    public final void a() {
        this.b.a(this.a, new anph());
    }
}
