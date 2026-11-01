package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
final class anvh extends defpackage.anwe {
    final /* synthetic */ defpackage.anvo a;
    final /* synthetic */ anty b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public anvh(defpackage.anvo anvoVar, anty antyVar) {
        super(anvoVar.e);
        this.b = antyVar;
        j$.util.Objects.requireNonNull(anvoVar);
        this.a = anvoVar;
    }

    @Override // defpackage.anwe
    public final void a() {
        defpackage.anvo.d(this.b, anty.x(this.a.e), new anph());
    }
}
