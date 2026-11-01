package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
final class tua extends defpackage.gfi {
    public tua(defpackage.tuc tucVar) {
        j$.util.Objects.requireNonNull(tucVar);
    }

    @Override // defpackage.gfi
    protected final java.lang.String a() {
        return "DELETE FROM `sharpie_data` WHERE `callCreatedTimestampMs` = ?";
    }

    @Override // defpackage.gfi
    protected final /* bridge */ /* synthetic */ void b(defpackage.gin ginVar, java.lang.Object obj) {
        ginVar.h(1, ((tuf) obj).a);
    }
}
