package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class gxy extends defpackage.gfj {
    @Override // defpackage.gfj
    public final java.lang.String a() {
        return "INSERT OR IGNORE INTO `WorkTag` (`tag`,`work_spec_id`) VALUES (?,?)";
    }

    @Override // defpackage.gfj
    public final /* bridge */ /* synthetic */ void b(defpackage.gin ginVar, java.lang.Object obj) {
        defpackage.rsr rsrVar = (defpackage.rsr) obj;
        ginVar.j(1, (java.lang.String) rsrVar.b);
        ginVar.j(2, (java.lang.String) rsrVar.a);
    }
}
