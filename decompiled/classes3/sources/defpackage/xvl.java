package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class xvl implements defpackage.xvc {
    private final defpackage.xxt a;

    public xvl(defpackage.xxt xxtVar) {
        this.a = xxtVar;
    }

    @Override // defpackage.xvc
    public final /* bridge */ /* synthetic */ defpackage.xvd a(java.lang.Object obj) {
        return new defpackage.xvm((java.io.InputStream) obj, this.a);
    }

    @Override // defpackage.xvc
    public final java.lang.Class b() {
        return java.io.InputStream.class;
    }
}
