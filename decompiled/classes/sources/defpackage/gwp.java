package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class gwp extends defpackage.gfj {
    @Override // defpackage.gfj
    public final java.lang.String a() {
        return "INSERT OR IGNORE INTO `Dependency` (`work_spec_id`,`prerequisite_id`) VALUES (?,?)";
    }

    @Override // defpackage.gfj
    public final /* synthetic */ void b(defpackage.gin ginVar, java.lang.Object obj) {
        defpackage.ils ilsVar = (defpackage.ils) obj;
        ginVar.j(1, (java.lang.String) ilsVar.a);
        ginVar.j(2, (java.lang.String) ilsVar.b);
    }
}
