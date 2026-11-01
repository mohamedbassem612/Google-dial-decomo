package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class gwu implements defpackage.gws {
    public final defpackage.gfj a = new defpackage.gwt();
    private final defpackage.gfy b;

    public gwu(defpackage.gfy gfyVar) {
        this.b = gfyVar;
    }

    @Override // defpackage.gws
    public final java.lang.Long a(java.lang.String str) {
        return (java.lang.Long) defpackage.dez.m(this.b, true, false, new defpackage.bet(str, 13, (byte[]) null));
    }

    @Override // defpackage.gws
    public final void b(defpackage.gwr gwrVar) {
        defpackage.dez.m(this.b, false, true, new defpackage.bet(this, gwrVar, 12, null));
    }
}
