package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
final class zel extends gfj {
    public zel(defpackage.zem zemVar) {
        j$.util.Objects.requireNonNull(zemVar);
    }

    public final java.lang.String a() {
        return "INSERT OR REPLACE INTO `dialer_capability_data` (`e164_phone_number`,`capability`,`timestamp_millis`) VALUES (?,?,?)";
    }

    public final /* bridge */ /* synthetic */ void b(gin ginVar, java.lang.Object obj) {
        defpackage.zeo zeoVar = (defpackage.zeo) obj;
        ginVar.j(1, zeoVar.a);
        defpackage.zdv zdvVar = zeoVar.b;
        aooh.f(zdvVar, "key");
        ginVar.j(2, zdvVar.name());
        ginVar.h(3, zeoVar.c);
    }
}
