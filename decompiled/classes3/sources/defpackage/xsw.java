package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
final class xsw implements defpackage.ydi {
    final /* synthetic */ defpackage.xsx a;
    private final defpackage.ydu b;

    public xsw(defpackage.xsx xsxVar, defpackage.ydu yduVar) {
        j$.util.Objects.requireNonNull(xsxVar);
        this.a = xsxVar;
        this.b = yduVar;
    }

    @Override // defpackage.ydi
    public final void a(boolean z) {
        if (z) {
            synchronized (this.a) {
                defpackage.ydu yduVar = this.b;
                for (defpackage.yek yekVar : defpackage.ygc.e(yduVar.a)) {
                    if (!yekVar.l() && !yekVar.k()) {
                        yekVar.c();
                        if (yduVar.c) {
                            yduVar.b.add(yekVar);
                        } else {
                            yekVar.b();
                        }
                    }
                }
            }
        }
    }
}
