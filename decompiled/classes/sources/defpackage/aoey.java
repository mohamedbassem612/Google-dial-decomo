package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
final class aoey implements defpackage.anzi {
    final /* synthetic */ defpackage.aofa a;

    public aoey(defpackage.aofa aofaVar) {
        j$.util.Objects.requireNonNull(aofaVar);
        this.a = aofaVar;
    }

    @Override // defpackage.anzi
    public final defpackage.anvv a() {
        defpackage.aofa aofaVar = this.a;
        return new defpackage.aoez(aofaVar.e, aofaVar.f, aofaVar.h(), aofaVar.g, aofaVar.k, aofaVar.h != Long.MAX_VALUE, aofaVar.h, aofaVar.i, aofaVar.j, aofaVar.l, aofaVar.n);
    }
}
