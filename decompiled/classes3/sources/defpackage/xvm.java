package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class xvm implements defpackage.xvd {
    public final defpackage.yby a;

    public xvm(java.io.InputStream inputStream, defpackage.xxt xxtVar) {
        defpackage.yby ybyVar = new defpackage.yby(inputStream, xxtVar);
        this.a = ybyVar;
        ybyVar.mark(5242880);
    }

    @Override // defpackage.xvd
    public final void b() {
        this.a.b();
    }

    @Override // defpackage.xvd
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final java.io.InputStream a() {
        defpackage.yby ybyVar = this.a;
        ybyVar.reset();
        return ybyVar;
    }
}
