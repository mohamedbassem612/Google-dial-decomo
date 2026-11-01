package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class xaw implements defpackage.rvd {
    private final /* synthetic */ int $cid;
    private final android.content.Context a;

    public xaw(android.content.Context context, int i) {
        this.$cid = i;
        this.a = context;
    }

    @Override // defpackage.rvd
    public final android.content.Intent a() {
        return this.$cid != 0 ? defpackage.afsq.bP() : defpackage.afsq.bP();
    }

    @Override // defpackage.rvd
    public final defpackage.aw b() {
        return this.$cid != 0 ? new joz() : xad.aW();
    }

    @Override // defpackage.rvd
    public final /* synthetic */ defpackage.aw c(rvq rvqVar) {
        return this.$cid != 0 ? new joz() : xad.aW();
    }

    @Override // defpackage.rvd
    public final defpackage.ajcq d() {
        return this.$cid != 0 ? defpackage.afsq.bQ() : defpackage.afsq.bQ();
    }

    @Override // defpackage.rvd
    public final defpackage.ajcq e() {
        if (this.$cid != 0) {
            rus rusVar = new rus();
            rusVar.d(ruz.c);
            rusVar.c(rvc.y);
            rusVar.e(new rva(2132017629));
            rusVar.b(this.a.getDrawable(2131231347));
            return defpackage.aiql.z(j$.util.Optional.of(rusVar.a()));
        }
        rus rusVar2 = new rus();
        rusVar2.d(ruz.a);
        rusVar2.c(rvc.e);
        rusVar2.e(new rva(2132017421));
        rusVar2.b(this.a.getDrawable(2131231548));
        return defpackage.aiql.z(j$.util.Optional.of(rusVar2.a()));
    }
}
