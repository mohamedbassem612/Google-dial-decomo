package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
final class jrg extends defpackage.gfi {
    public jrg(defpackage.jrh jrhVar) {
        j$.util.Objects.requireNonNull(jrhVar);
    }

    @Override // defpackage.gfi
    protected final java.lang.String a() {
        return "UPDATE OR ABORT `StirShakenEntity` SET `callCreationTimeMillis` = ?,`stirShakenStatus` = ? WHERE `callCreationTimeMillis` = ?";
    }

    @Override // defpackage.gfi
    protected final /* bridge */ /* synthetic */ void b(defpackage.gin ginVar, java.lang.Object obj) {
        defpackage.jrj jrjVar = (defpackage.jrj) obj;
        long j = jrjVar.a;
        ginVar.h(1, j);
        ginVar.j(2, defpackage.jrh.k(jrjVar.b));
        ginVar.h(3, j);
    }
}
