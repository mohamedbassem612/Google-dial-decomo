package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
final class anwj extends defpackage.anwe {
    final anqw a;
    final anty b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public anwj(defpackage.anwl anwlVar, anty antyVar, anqw anqwVar) {
        super(anwlVar.c);
        j$.util.Objects.requireNonNull(anwlVar);
        this.b = antyVar;
        this.a = anqwVar;
    }

    @Override // defpackage.anwe
    public final void a() {
        this.b.a(this.a, new anph());
    }
}
