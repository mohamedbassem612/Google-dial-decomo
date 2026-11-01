package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
final class anyb extends defpackage.anxc {
    final /* synthetic */ defpackage.anvp a;
    final /* synthetic */ defpackage.anyc b;

    public anyb(defpackage.anyc anycVar, defpackage.anvp anvpVar) {
        this.a = anvpVar;
        j$.util.Objects.requireNonNull(anycVar);
        this.b = anycVar;
    }

    @Override // defpackage.anxc, defpackage.anvp
    public final void m(defpackage.anvr anvrVar) {
        this.b.a.b();
        this.a.m(new defpackage.anya(this, anvrVar));
    }

    @Override // defpackage.anxc
    protected final defpackage.anvp p() {
        return this.a;
    }
}
