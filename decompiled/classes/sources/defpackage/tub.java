package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
final class tub extends defpackage.gfi {
    public tub(defpackage.tuc tucVar) {
        j$.util.Objects.requireNonNull(tucVar);
    }

    @Override // defpackage.gfi
    protected final java.lang.String a() {
        return "UPDATE OR ABORT `sharpie_data` SET `callCreatedTimestampMs` = ?,`callId` = ?,`mlVerdict` = ?,`userVerdict` = ?,`userScamAlertAction` = ? WHERE `callCreatedTimestampMs` = ?";
    }

    @Override // defpackage.gfi
    protected final /* bridge */ /* synthetic */ void b(defpackage.gin ginVar, java.lang.Object obj) {
        tuf tufVar = (tuf) obj;
        long j = tufVar.a;
        ginVar.h(1, j);
        ginVar.j(2, tufVar.b);
        ginVar.j(3, defpackage.ttj.d(tufVar.c));
        ginVar.j(4, defpackage.ttj.d(tufVar.d));
        ginVar.j(5, defpackage.ttj.e(tufVar.e));
        ginVar.h(6, j);
    }
}
