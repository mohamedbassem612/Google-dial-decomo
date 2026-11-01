package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
final class ttz extends defpackage.gfj {
    public ttz(defpackage.tuc tucVar) {
        j$.util.Objects.requireNonNull(tucVar);
    }

    @Override // defpackage.gfj
    public final java.lang.String a() {
        return "INSERT OR ABORT INTO `sharpie_data` (`callCreatedTimestampMs`,`callId`,`mlVerdict`,`userVerdict`,`userScamAlertAction`) VALUES (?,?,?,?,?)";
    }

    @Override // defpackage.gfj
    public final /* bridge */ /* synthetic */ void b(defpackage.gin ginVar, java.lang.Object obj) {
        tuf tufVar = (tuf) obj;
        ginVar.h(1, tufVar.a);
        ginVar.j(2, tufVar.b);
        ginVar.j(3, defpackage.ttj.d(tufVar.c));
        ginVar.j(4, defpackage.ttj.d(tufVar.d));
        ginVar.j(5, defpackage.ttj.e(tufVar.e));
    }
}
