package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
final class zes extends gfj {
    public zes(defpackage.zet zetVar) {
        j$.util.Objects.requireNonNull(zetVar);
    }

    public final java.lang.String a() {
        return "INSERT OR REPLACE INTO `dialer_contact_status_data` (`e164_phone_number`,`contact_status`,`timestamp_millis`) VALUES (?,?,?)";
    }

    public final /* bridge */ /* synthetic */ void b(gin ginVar, java.lang.Object obj) {
        defpackage.zeu zeuVar = (defpackage.zeu) obj;
        ginVar.j(1, zeuVar.a);
        defpackage.zeh zehVar = zeuVar.b;
        aooh.f(zehVar, "status");
        ginVar.j(2, zehVar.name());
        ginVar.h(3, zeuVar.c);
    }
}
