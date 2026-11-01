package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class lku implements defpackage.lkr {
    public final defpackage.gfj a = new defpackage.lks(this);
    public final defpackage.gfi b = new defpackage.lkt(this);
    private final defpackage.gfy c;

    public lku(defpackage.gfy gfyVar) {
        this.c = gfyVar;
    }

    @Override // defpackage.lkr
    public final defpackage.ajcq a(java.util.List list) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("DELETE FROM transcript WHERE id IN (");
        defpackage.dzk.P(sb, list.size());
        sb.append(')');
        return defpackage.dez.p(this.c, false, true, new khx(sb.toString(), list, 8));
    }

    @Override // defpackage.lkr
    public final defpackage.ajcq b(java.util.List list) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("SELECT * FROM transcript WHERE id IN (");
        defpackage.dzk.P(sb, list == null ? 1 : list.size());
        sb.append(')');
        return defpackage.dez.p(this.c, true, false, new defpackage.gxp(sb.toString(), list, 12, null));
    }

    @Override // defpackage.lkr
    public final defpackage.ajcq c(long j) {
        return defpackage.dez.p(this.c, true, false, new bpd(j, 3));
    }

    @Override // defpackage.lkr
    public final defpackage.ajcq d(java.lang.String str) {
        return defpackage.dez.p(this.c, true, false, new lvd(str, 1));
    }

    @Override // defpackage.lkr
    public final defpackage.ajcq e() {
        return defpackage.dez.p(this.c, true, false, new defpackage.een(20));
    }

    @Override // defpackage.lkr
    public final defpackage.ajcq f(lkq lkqVar) {
        return defpackage.dez.p(this.c, false, true, new khx(this, lkqVar, 9, (byte[]) null));
    }

    @Override // defpackage.lkr
    public final defpackage.ajcq g(lkq lkqVar) {
        return defpackage.dez.p(this.c, false, true, new khx(this, lkqVar, 10, (byte[]) null));
    }
}
