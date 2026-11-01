package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
final class qta extends android.view.OrientationEventListener {
    public static final /* synthetic */ int b = 0;
    final /* synthetic */ defpackage.qtd a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qta(defpackage.qtd qtdVar, android.content.Context context) {
        super(context);
        j$.util.Objects.requireNonNull(qtdVar);
        this.a = qtdVar;
    }

    @Override // android.view.OrientationEventListener
    public final void onOrientationChanged(int i) {
        defpackage.qtd qtdVar = this.a;
        qtdVar.p();
        j$.util.Optional optional = qtdVar.m;
        j$.util.Objects.requireNonNull(qtdVar);
        defpackage.qst qstVar = new defpackage.qst(qtdVar, 9);
        if (true == optional.isPresent()) {
            java.lang.Object obj = optional.get();
            ((defpackage.qtd) qstVar.a).y((defpackage.qth) obj);
        }
    }
}
