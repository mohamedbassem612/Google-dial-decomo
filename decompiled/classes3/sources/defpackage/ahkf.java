package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
final class ahkf extends anne {
    final /* synthetic */ defpackage.ahix a;
    final /* synthetic */ anpk b;
    final /* synthetic */ ahkg c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ahkf(ahkg ahkgVar, ajsz ajszVar, defpackage.ahix ahixVar, anpk anpkVar) {
        super(ajszVar);
        this.a = ahixVar;
        this.b = anpkVar;
        j$.util.Objects.requireNonNull(ahkgVar);
        this.c = ahkgVar;
    }

    public final void a(anty antyVar, anph anphVar) {
        this.c.b = android.os.SystemClock.elapsedRealtime();
        super.a(new defpackage.ahke(this, antyVar, this.a, this.b), anphVar);
    }
}
