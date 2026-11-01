package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
final class iug extends defpackage.gfi {
    public iug(defpackage.iui iuiVar) {
        j$.util.Objects.requireNonNull(iuiVar);
    }

    @Override // defpackage.gfi
    protected final java.lang.String a() {
        return "DELETE FROM `beesly_data` WHERE `createdTimestampMs` = ?";
    }

    @Override // defpackage.gfi
    protected final /* bridge */ /* synthetic */ void b(defpackage.gin ginVar, java.lang.Object obj) {
        ginVar.h(1, ((iuj) obj).a);
    }
}
