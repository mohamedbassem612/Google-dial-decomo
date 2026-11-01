package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class ucy implements defpackage.ucw {
    public final defpackage.gfy a;
    public final defpackage.gfj b = new defpackage.ucx(this);

    public ucy(defpackage.gfy gfyVar) {
        this.a = gfyVar;
    }

    @Override // defpackage.ucw
    public final int a(java.util.List list) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("DELETE FROM spamcall WHERE id IN (");
        defpackage.dzk.P(sb, list == null ? 1 : list.size());
        sb.append(')');
        return ((java.lang.Integer) defpackage.dez.m(this.a, false, true, new slv(sb.toString(), list, 13, (byte[]) null))).intValue();
    }

    @Override // defpackage.ucw
    public final java.util.List b(java.util.List list) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("SELECT * FROM spamcall WHERE id IN (");
        defpackage.dzk.P(sb, list == null ? 1 : list.size());
        sb.append(')');
        return (java.util.List) defpackage.dez.m(this.a, true, false, new slv(sb.toString(), list, 16, (byte[]) null));
    }

    @Override // defpackage.ucw
    public final void c(java.lang.String str, ucu ucuVar) {
        defpackage.dez.m(this.a, false, true, new mkm(this, str, ucuVar, 8, (byte[]) null));
    }

    @Override // defpackage.ucw
    public final taq d(java.lang.String str) {
        return (taq) defpackage.dez.m(this.a, true, false, new defpackage.tge(str, 5));
    }
}
