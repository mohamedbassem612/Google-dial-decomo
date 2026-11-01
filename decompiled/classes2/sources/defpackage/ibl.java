package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class ibl implements defpackage.hxf {
    public final java.lang.String a;
    public final boolean b;
    public int c;
    private final defpackage.ibk d;
    private final ajcq e;

    public ibl(defpackage.ibk ibkVar, ajcq ajcqVar, java.lang.String str, boolean z) {
        this.d = ibkVar;
        this.e = ajcqVar;
        this.a = str;
        this.b = z;
    }

    @Override // defpackage.hxf
    public final ajcq a() {
        return aiql.z(java.lang.Integer.valueOf(this.c));
    }

    @Override // defpackage.hxf
    public final ajcq b() {
        return this.e;
    }

    @Override // defpackage.hxf
    public final ajcq c() {
        return ajcm.a;
    }

    @Override // defpackage.hxf
    public final void d() {
        defpackage.ibk ibkVar = this.d;
        agsm.i(104, ibkVar.l.e(ahqx.b(new defpackage.ibi(ibkVar, this, 0)), ibkVar.d), "cancel failed", new java.lang.Object[0]);
    }
}
