package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
final class jre extends defpackage.gfj {
    public jre(defpackage.jrh jrhVar) {
        j$.util.Objects.requireNonNull(jrhVar);
    }

    @Override // defpackage.gfj
    public final java.lang.String a() {
        return "INSERT OR ABORT INTO `StirShakenEntity` (`callCreationTimeMillis`,`stirShakenStatus`) VALUES (?,?)";
    }

    @Override // defpackage.gfj
    public final /* bridge */ /* synthetic */ void b(defpackage.gin ginVar, java.lang.Object obj) {
        defpackage.jrj jrjVar = (defpackage.jrj) obj;
        ginVar.h(1, jrjVar.a);
        ginVar.j(2, defpackage.jrh.k(jrjVar.b));
    }
}
