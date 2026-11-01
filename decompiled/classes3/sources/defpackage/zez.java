package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
final class zez extends gfj {
    public zez(defpackage.zfa zfaVar) {
        j$.util.Objects.requireNonNull(zfaVar);
    }

    public final java.lang.String a() {
        return "INSERT OR REPLACE INTO `dialer_has_rcs_data` (`e164_phone_number`,`timestamp_millis`) VALUES (?,?)";
    }

    public final /* bridge */ /* synthetic */ void b(gin ginVar, java.lang.Object obj) {
        defpackage.zfc zfcVar = (defpackage.zfc) obj;
        ginVar.j(1, zfcVar.a);
        ginVar.h(2, zfcVar.b);
    }
}
