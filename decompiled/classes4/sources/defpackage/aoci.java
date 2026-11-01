package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
final class aoci extends defpackage.anwe {
    final /* synthetic */ anqw a;
    final /* synthetic */ defpackage.aocm b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aoci(defpackage.aocm aocmVar, anqw anqwVar) {
        super(aocmVar.a);
        this.a = anqwVar;
        j$.util.Objects.requireNonNull(aocmVar);
        this.b = aocmVar;
    }

    @Override // defpackage.anwe
    public final void a() {
        int i = defpackage.aoik.a;
        this.b.c().a(this.a);
    }
}
