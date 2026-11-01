package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
final class jrf extends defpackage.gfi {
    public jrf(defpackage.jrh jrhVar) {
        j$.util.Objects.requireNonNull(jrhVar);
    }

    @Override // defpackage.gfi
    protected final java.lang.String a() {
        return "DELETE FROM `StirShakenEntity` WHERE `callCreationTimeMillis` = ?";
    }

    @Override // defpackage.gfi
    protected final /* bridge */ /* synthetic */ void b(defpackage.gin ginVar, java.lang.Object obj) {
        ginVar.h(1, ((defpackage.jrj) obj).a);
    }
}
