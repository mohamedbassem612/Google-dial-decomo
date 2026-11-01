package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class xuk implements defpackage.xul {
    private final /* synthetic */ int $cid;
    final /* synthetic */ java.lang.Object a;
    final /* synthetic */ java.lang.Object b;

    public xuk(java.lang.Object obj, defpackage.xxt xxtVar, int i) {
        this.$cid = i;
        this.a = obj;
        this.b = xxtVar;
    }

    @Override // defpackage.xul
    public final boolean a(defpackage.xug xugVar) throws java.lang.Throwable {
        boolean zE;
        defpackage.yby ybyVar;
        int i = this.$cid;
        if (i == 0) {
            try {
                zE = xugVar.e((java.io.InputStream) this.a, (defpackage.xxt) this.b);
            } finally {
                ((java.io.InputStream) this.a).reset();
            }
        } else if (i != 1) {
            try {
                java.io.FileInputStream fileInputStream = new java.io.FileInputStream(((defpackage.xvp) this.b).a().getFileDescriptor());
                java.lang.Object obj = this.a;
                ybyVar = new defpackage.yby(fileInputStream, (defpackage.xxt) obj);
                try {
                    zE = xugVar.e(ybyVar, (defpackage.xxt) obj);
                    ybyVar.b();
                    ((defpackage.xvp) this.b).a();
                } catch (java.lang.Throwable th) {
                    th = th;
                    if (ybyVar != null) {
                        ybyVar.b();
                    }
                    ((defpackage.xvp) this.b).a();
                    throw th;
                }
            } catch (java.lang.Throwable th2) {
                th = th2;
                ybyVar = null;
            }
        } else {
            try {
                zE = xugVar.f((java.nio.ByteBuffer) this.a, (defpackage.xxt) this.b);
            } finally {
                defpackage.yfp.b((java.nio.ByteBuffer) this.a);
            }
        }
        return zE;
    }

    public xuk(defpackage.xvp xvpVar, defpackage.xxt xxtVar, int i) {
        this.$cid = i;
        this.b = xvpVar;
        this.a = xxtVar;
    }
}
