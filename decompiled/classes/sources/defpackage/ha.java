package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
final class ha implements defpackage.gd {
    final /* synthetic */ defpackage.hb a;

    public ha(defpackage.hb hbVar) {
        this.a = hbVar;
    }

    @Override // defpackage.gd
    public final void a(defpackage.ft ftVar, boolean z) {
        if (ftVar instanceof gm) {
            ftVar.a().i(false);
        }
        defpackage.gd gdVar = this.a.e;
        if (gdVar != null) {
            gdVar.a(ftVar, z);
        }
    }

    @Override // defpackage.gd
    public final boolean b(defpackage.ft ftVar) {
        defpackage.hb hbVar = this.a;
        if (ftVar != hbVar.c) {
            hbVar.m = ((gm) ftVar).l.a;
            defpackage.gd gdVar = hbVar.e;
            if (gdVar != null) {
                return gdVar.b(ftVar);
            }
        }
        return false;
    }
}
