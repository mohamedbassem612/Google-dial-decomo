package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class xuj implements defpackage.xum {
    private final /* synthetic */ int $cid;
    final /* synthetic */ java.lang.Object a;
    final /* synthetic */ java.lang.Object b;

    public xuj(java.lang.Object obj, defpackage.xxt xxtVar, int i) {
        this.$cid = i;
        this.a = obj;
        this.b = xxtVar;
    }

    @Override // defpackage.xum
    public final int a(defpackage.xug xugVar) throws java.lang.Throwable {
        int iC;
        defpackage.yby ybyVar;
        int i = this.$cid;
        if (i == 0) {
            try {
                iC = xugVar.c((java.io.InputStream) this.a, (defpackage.xxt) this.b);
            } finally {
                ((java.io.InputStream) this.a).reset();
            }
        } else if (i != 1) {
            try {
                java.io.FileInputStream fileInputStream = new java.io.FileInputStream(((defpackage.xvp) this.b).a().getFileDescriptor());
                java.lang.Object obj = this.a;
                ybyVar = new defpackage.yby(fileInputStream, (defpackage.xxt) obj);
                try {
                    iC = xugVar.c(ybyVar, (defpackage.xxt) obj);
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
                iC = xugVar.d((java.nio.ByteBuffer) this.a, (defpackage.xxt) this.b);
            } finally {
                defpackage.yfp.b((java.nio.ByteBuffer) this.a);
            }
        }
        return iC;
    }

    public xuj(defpackage.xvp xvpVar, defpackage.xxt xxtVar, int i) {
        this.$cid = i;
        this.b = xvpVar;
        this.a = xxtVar;
    }
}
