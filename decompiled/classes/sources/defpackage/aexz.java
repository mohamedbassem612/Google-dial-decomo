package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
abstract class aexz implements defpackage.aeyr {
    public final java.lang.String a;
    public final java.lang.String b;
    public final defpackage.aeyz c;

    public aexz(java.lang.String str, java.lang.String str2, defpackage.aeyz aeyzVar) {
        this.a = str;
        this.b = str2;
        this.c = aeyzVar;
    }

    protected abstract java.lang.Object b(java.lang.Object obj);

    protected abstract java.lang.Object c(java.lang.String str);

    protected java.lang.Object e() {
        return null;
    }

    @Override // defpackage.aeyr, defpackage.ahzi
    public final java.lang.Object eZ() {
        java.util.concurrent.atomic.AtomicReference atomicReference = defpackage.aewq.a;
        defpackage.aews.c = true;
        if (defpackage.aews.d == null) {
            defpackage.aews.d = new defpackage.aewr();
        }
        android.content.Context context = (android.content.Context) defpackage.aewq.a.get();
        if (context != null) {
            java.lang.Object objF = f(defpackage.aewq.a(context));
            objF.getClass();
            return objF;
        }
        synchronized (defpackage.aews.a) {
        }
        throw new java.lang.IllegalStateException("Must call PhenotypeContext.setContext() first");
    }

    protected abstract java.lang.Object f(defpackage.aewq aewqVar);

    @Override // defpackage.aeyr
    public final java.lang.Object fa(android.content.Context context) {
        android.content.Context applicationContext = context.getApplicationContext();
        applicationContext.getClass();
        java.lang.Object objF = f(defpackage.aewq.a(applicationContext));
        objF.getClass();
        return objF;
    }

    protected final java.lang.Object fb(java.lang.String str) {
        try {
            return c(str);
        } catch (java.io.IOException | java.lang.IllegalArgumentException e) {
            android.util.Log.e("FilePhenotypeFlags", "Invalid Phenotype flag value for flag ".concat(this.b), e);
            return null;
        }
    }
}
