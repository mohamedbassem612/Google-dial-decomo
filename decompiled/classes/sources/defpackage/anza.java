package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
final class anza extends defpackage.anmc {
    final /* synthetic */ defpackage.anzd a;

    public anza(defpackage.anzd anzdVar) {
        j$.util.Objects.requireNonNull(anzdVar);
        this.a = anzdVar;
    }

    @Override // defpackage.anmc
    public final java.lang.String a() {
        return this.a.b;
    }

    @Override // defpackage.anmc
    public final defpackage.ajsz b(anpk anpkVar, defpackage.anmb anmbVar) {
        defpackage.anzg anzgVar = this.a.c;
        anvo anvoVar = new anvo(anpkVar, anzgVar.e(anmbVar), anmbVar, anzgVar.T, anzgVar.E ? null : anzgVar.j.c(), anzgVar.G);
        anvoVar.l = anzgVar.o;
        return anvoVar;
    }
}
