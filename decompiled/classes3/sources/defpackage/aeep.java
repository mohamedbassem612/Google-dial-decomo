package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
final class aeep extends gfj {
    public aeep(defpackage.aeeq aeeqVar) {
        j$.util.Objects.requireNonNull(aeeqVar);
    }

    public final java.lang.String a() {
        return "INSERT OR IGNORE INTO `gnp_experiments` (`id`,`account_name`,`experiment_id`,`experiment_type`,`insertion_time`,`experiment_source`) VALUES (nullif(?, 0),?,?,?,?,?)";
    }

    public final /* bridge */ /* synthetic */ void b(gin ginVar, java.lang.Object obj) {
        defpackage.aecq aecqVar = (defpackage.aecq) obj;
        ginVar.h(1, aecqVar.a);
        ginVar.j(2, aecqVar.b);
        ginVar.h(3, aecqVar.c);
        ginVar.h(4, agab.bD(aecqVar.d));
        ginVar.h(5, agab.bE(aecqVar.e));
        ginVar.h(6, agab.bC(aecqVar.f));
    }
}
