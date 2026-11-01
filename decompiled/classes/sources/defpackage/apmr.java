package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class apmr implements defpackage.aomy {
    public final /* synthetic */ defpackage.apms a;
    private final defpackage.apmv b;

    public apmr(defpackage.apms apmsVar, defpackage.apmv apmvVar) {
        this.a = apmsVar;
        this.b = apmvVar;
    }

    @Override // defpackage.aomy
    public final /* bridge */ /* synthetic */ java.lang.Object a() throws java.lang.Throwable {
        defpackage.apme apmeVar;
        defpackage.apme apmeVar2 = defpackage.apme.INTERNAL_ERROR;
        java.io.IOException e = null;
        try {
            defpackage.apmv apmvVar = this.b;
            if (!apmvVar.a(true, this)) {
                throw new java.io.IOException("Required SETTINGS preface not received");
            }
            while (apmvVar.a(false, this)) {
            }
            apmeVar = defpackage.apme.NO_ERROR;
            try {
                try {
                    this.a.c(apmeVar, defpackage.apme.CANCEL, null);
                    defpackage.apjv.j(apmvVar);
                } catch (java.io.IOException e2) {
                    e = e2;
                    defpackage.apme apmeVar3 = defpackage.apme.PROTOCOL_ERROR;
                    this.a.c(apmeVar3, apmeVar3, e);
                    defpackage.apjv.j(this.b);
                }
                return defpackage.aojh.a;
            } catch (java.lang.Throwable th) {
                th = th;
                this.a.c(apmeVar, apmeVar2, e);
                defpackage.apjv.j(this.b);
                throw th;
            }
        } catch (java.io.IOException e3) {
            e = e3;
            apmeVar = apmeVar2;
        } catch (java.lang.Throwable th2) {
            th = th2;
            apmeVar = apmeVar2;
            this.a.c(apmeVar, apmeVar2, e);
            defpackage.apjv.j(this.b);
            throw th;
        }
    }
}
