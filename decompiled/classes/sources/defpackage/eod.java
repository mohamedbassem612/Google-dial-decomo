package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class eod extends defpackage.eof {
    public static defpackage.eod a;
    public static final defpackage.eop b = new defpackage.enu(3);
    private final android.app.Application e;

    public eod(android.app.Application application) {
        this.e = application;
    }

    private final defpackage.eoa d(java.lang.Class cls, android.app.Application application) {
        if (!emf.class.isAssignableFrom(cls)) {
            return super.a(cls);
        }
        try {
            defpackage.eoa eoaVar = (defpackage.eoa) cls.getConstructor(android.app.Application.class).newInstance(application);
            defpackage.aooh.c(eoaVar);
            return eoaVar;
        } catch (java.lang.IllegalAccessException e) {
            java.util.Objects.toString(cls);
            throw new java.lang.RuntimeException("Cannot create an instance of ".concat(java.lang.String.valueOf(cls)), e);
        } catch (java.lang.InstantiationException e2) {
            java.util.Objects.toString(cls);
            throw new java.lang.RuntimeException("Cannot create an instance of ".concat(java.lang.String.valueOf(cls)), e2);
        } catch (java.lang.NoSuchMethodException e3) {
            java.util.Objects.toString(cls);
            throw new java.lang.RuntimeException("Cannot create an instance of ".concat(java.lang.String.valueOf(cls)), e3);
        } catch (java.lang.reflect.InvocationTargetException e4) {
            java.util.Objects.toString(cls);
            throw new java.lang.RuntimeException("Cannot create an instance of ".concat(java.lang.String.valueOf(cls)), e4);
        }
    }

    @Override // defpackage.eof, defpackage.eoe
    public final defpackage.eoa a(java.lang.Class cls) {
        defpackage.aooh.f(cls, "modelClass");
        android.app.Application application = this.e;
        if (application != null) {
            return d(cls, application);
        }
        throw new java.lang.UnsupportedOperationException("AndroidViewModelFactory constructed with empty constructor works only with create(modelClass: Class<T>, extras: CreationExtras).");
    }

    @Override // defpackage.eof, defpackage.eoe
    public final defpackage.eoa b(java.lang.Class cls, defpackage.eoq eoqVar) {
        defpackage.aooh.f(cls, "modelClass");
        if (this.e != null) {
            return a(cls);
        }
        android.app.Application application = (android.app.Application) eoqVar.a(b);
        if (application != null) {
            return d(cls, application);
        }
        if (emf.class.isAssignableFrom(cls)) {
            throw new java.lang.IllegalArgumentException("CreationExtras must have an application by `APPLICATION_KEY`");
        }
        return super.a(cls);
    }
}
