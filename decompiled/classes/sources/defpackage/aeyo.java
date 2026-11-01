package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
abstract class aeyo extends defpackage.aexz implements defpackage.aeyc {
    private volatile int d;
    private defpackage.zzx e;

    public aeyo(java.lang.String str, java.lang.String str2, defpackage.aeyz aeyzVar) {
        super(str, str2, aeyzVar);
        this.d = -1;
    }

    @Override // defpackage.aeyc
    public final int a() {
        return this.d;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0063  */
    @Override // defpackage.aexz
    protected final java.lang.Object f(defpackage.aewq aewqVar) {
        defpackage.aeyy aeyyVarA;
        java.lang.Object objE;
        int iA = a();
        if (iA == -1 || iA < i().I()) {
            synchronized (this) {
                int iA2 = a();
                java.lang.Object objB = null;
                if (iA2 == -1) {
                    defpackage.aewq.e();
                    if (aewqVar == null) {
                        throw null;
                    }
                    aeyyVarA = this.c.a(aewqVar);
                    j(aeyyVarA.g);
                } else {
                    aeyyVarA = null;
                }
                int I = i().I();
                if (iA2 < I) {
                    defpackage.aewq.e();
                    if (aewqVar == null) {
                        aewqVar = null;
                    }
                    if (aewqVar == null) {
                        throw null;
                    }
                    android.content.Context context = aewqVar.c;
                    defpackage.ahyn ahynVarA = defpackage.aewm.a(context);
                    if (ahynVarA.f()) {
                        java.lang.String strP = ((defpackage.xtq) ahynVarA.b()).P(defpackage.aewo.a(this.a), null, this.b);
                        if (strP != null) {
                            objE = fb(strP);
                        } else {
                            objE = null;
                        }
                    } else {
                        objE = null;
                    }
                    if (aeyyVarA == null) {
                        aeyyVarA = this.c.a(aewqVar);
                    }
                    java.lang.String str = aeyyVarA.d;
                    if (!context.getPackageName().equals("com.android.vending") && !context.getPackageName().equals("com.google.android.wearable.app.cn") && !str.startsWith("com.google.android.gms.measurement#")) {
                        defpackage.ajcq ajcqVarET = aewqVar.c().submit(new defpackage.abqu(aewqVar, str, 8));
                        ajcqVarET.c(new defpackage.abqg(ajcqVarET, 12), defpackage.ajbm.INSTANCE);
                    }
                    java.lang.Object obj = ((defpackage.aigf) aeyyVarA.a().d).get(this.b);
                    if (obj != null) {
                        try {
                            objB = b(obj);
                        } catch (java.io.IOException | java.lang.ClassCastException e) {
                            android.util.Log.e("FilePhenotypeFlags", "Invalid Phenotype flag value for flag ".concat(this.b), e);
                        }
                    }
                    if (true != ahynVarA.f()) {
                        objE = objB;
                    }
                    if (objE == null) {
                        objE = e();
                    }
                    if (objE != null) {
                        g(objE);
                        h(I);
                    }
                    return objE;
                }
            }
        }
        return d();
    }

    @Override // defpackage.aeyc
    public final void h(int i) {
        this.d = i;
    }

    @Override // defpackage.aeyc
    public final defpackage.zzx i() {
        return this.e;
    }

    @Override // defpackage.aeyc
    public final void j(defpackage.zzx zzxVar) {
        this.e = zzxVar;
    }
}
