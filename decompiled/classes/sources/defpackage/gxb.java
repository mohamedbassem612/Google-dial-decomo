package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class gxb extends defpackage.gfj {
    @Override // defpackage.gfj
    public final java.lang.String a() {
        return "INSERT OR REPLACE INTO `SystemIdInfo` (`work_spec_id`,`generation`,`system_id`) VALUES (?,?,?)";
    }

    @Override // defpackage.gfj
    public final /* synthetic */ void b(defpackage.gin ginVar, java.lang.Object obj) {
        defpackage.gwy gwyVar = (defpackage.gwy) obj;
        ginVar.j(1, gwyVar.a);
        ginVar.h(2, gwyVar.b);
        ginVar.h(3, gwyVar.c);
    }
}
