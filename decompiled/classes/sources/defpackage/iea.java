package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class iea implements defpackage.ido {
    private final /* synthetic */ int $cid;
    private final defpackage.ajct a;

    public iea(defpackage.ajct ajctVar, int i) {
        this.$cid = i;
        this.a = ajctVar;
    }

    public static int b(ids idsVar, int i) {
        return i - (i % (idsVar.d * idsVar.e));
    }

    @Override // defpackage.ido
    public final defpackage.ajcq a(idt idtVar, defpackage.akzc akzcVar) {
        return this.$cid != 0 ? defpackage.ahvr.F(new idw(idtVar, akzcVar), this.a) : defpackage.ahvr.F(new gzk(idtVar, akzcVar, 3), this.a);
    }
}
