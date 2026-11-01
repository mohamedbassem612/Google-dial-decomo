package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class gxi implements defpackage.gxh {
    private final defpackage.gfy a;

    public gxi(defpackage.gfy gfyVar) {
        this.a = gfyVar;
    }

    @Override // defpackage.gxh
    public final void a(java.lang.String str) {
        if (str == null) {
            defpackage.aooh.i("workSpecId");
        }
        defpackage.dez.m(this.a, false, true, new defpackage.bet(str, 17, (short[]) null));
    }

    @Override // defpackage.gxh
    public final void b() {
        defpackage.dez.m(this.a, false, true, new defpackage.ddz(20, (byte[]) null));
    }
}
