package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
final class khz extends defpackage.gfi {
    public khz(defpackage.kib kibVar) {
        j$.util.Objects.requireNonNull(kibVar);
    }

    @Override // defpackage.gfi
    protected final java.lang.String a() {
        return "DELETE FROM `PeopleDirectoryContactEntity` WHERE `uuid` = ?";
    }

    @Override // defpackage.gfi
    protected final /* bridge */ /* synthetic */ void b(defpackage.gin ginVar, java.lang.Object obj) {
        ginVar.j(1, ((defpackage.kid) obj).a);
    }
}
