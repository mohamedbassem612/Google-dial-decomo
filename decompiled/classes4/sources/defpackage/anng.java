package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class anng extends defpackage.antw {
    public final defpackage.aocv a;
    public final defpackage.ansa b;
    private boolean c;

    public anng(anrk anrkVar, defpackage.anrp anrpVar) {
        this();
        defpackage.ansa ansaVar = new defpackage.ansa();
        this.b = ansaVar;
        ansaVar.a = anrkVar;
        defpackage.aocv aocvVar = new defpackage.aocv(new defpackage.anyd(this, anrpVar));
        this.a = aocvVar;
        aocvVar.m = false;
        aocvVar.p = false;
    }

    @Override // defpackage.antw
    public final void f(defpackage.anqn anqnVar) {
        defpackage.antw antwVarH = h();
        ahvr.cj(anqnVar, "interceptor");
        ((defpackage.aocv) antwVarH).e.add(anqnVar);
    }

    public final defpackage.anqk g() {
        defpackage.anqp anqpVar;
        ahvr.bZ(!this.c, "BinderServerBuilder can only be used to build one server instance.");
        this.c = true;
        f(new defpackage.ansh());
        defpackage.aocv aocvVar = this.a;
        this.b.c = aocvVar.i;
        new aoae(aocvVar.g, anpl.a());
        apnf.j().i();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        defpackage.anqp anqpVar2 = null;
        if (aocvVar.m) {
            try {
                java.lang.Class<?> cls = java.lang.Class.forName("antz");
                java.lang.Class<?> cls2 = java.lang.Boolean.TYPE;
                anqpVar = (defpackage.anqp) cls.getDeclaredMethod("getServerStreamTracerFactory", cls2, cls2, cls2).invoke(null, java.lang.Boolean.valueOf(aocvVar.n), java.lang.Boolean.valueOf(aocvVar.o), java.lang.Boolean.FALSE);
            } catch (java.lang.ClassNotFoundException e) {
                defpackage.aocv.a.logp(java.util.logging.Level.FINE, "io.grpc.internal.ServerImplBuilder", "getTracerFactories", "Unable to apply census stats", (java.lang.Throwable) e);
                anqpVar = null;
            } catch (java.lang.IllegalAccessException e2) {
                defpackage.aocv.a.logp(java.util.logging.Level.FINE, "io.grpc.internal.ServerImplBuilder", "getTracerFactories", "Unable to apply census stats", (java.lang.Throwable) e2);
                anqpVar = null;
            } catch (java.lang.NoSuchMethodException e3) {
                defpackage.aocv.a.logp(java.util.logging.Level.FINE, "io.grpc.internal.ServerImplBuilder", "getTracerFactories", "Unable to apply census stats", (java.lang.Throwable) e3);
                anqpVar = null;
            } catch (java.lang.reflect.InvocationTargetException e4) {
                defpackage.aocv.a.logp(java.util.logging.Level.FINE, "io.grpc.internal.ServerImplBuilder", "getTracerFactories", "Unable to apply census stats", (java.lang.Throwable) e4);
                anqpVar = null;
            }
            if (anqpVar != null) {
                arrayList.add(anqpVar);
            }
        }
        if (aocvVar.p) {
            try {
                anqpVar2 = (defpackage.anqp) java.lang.Class.forName("anua").getDeclaredMethod("getServerStreamTracerFactory", null).invoke(null, null);
            } catch (java.lang.ClassNotFoundException e5) {
                defpackage.aocv.a.logp(java.util.logging.Level.FINE, "io.grpc.internal.ServerImplBuilder", "getTracerFactories", "Unable to apply census stats", (java.lang.Throwable) e5);
            } catch (java.lang.IllegalAccessException e6) {
                defpackage.aocv.a.logp(java.util.logging.Level.FINE, "io.grpc.internal.ServerImplBuilder", "getTracerFactories", "Unable to apply census stats", (java.lang.Throwable) e6);
            } catch (java.lang.NoSuchMethodException e7) {
                defpackage.aocv.a.logp(java.util.logging.Level.FINE, "io.grpc.internal.ServerImplBuilder", "getTracerFactories", "Unable to apply census stats", (java.lang.Throwable) e7);
            } catch (java.lang.reflect.InvocationTargetException e8) {
                defpackage.aocv.a.logp(java.util.logging.Level.FINE, "io.grpc.internal.ServerImplBuilder", "getTracerFactories", "Unable to apply census stats", (java.lang.Throwable) e8);
            }
            if (anqpVar2 != null) {
                arrayList.add(anqpVar2);
            }
        }
        defpackage.anyd anydVar = aocvVar.r;
        arrayList.addAll(aocvVar.f);
        arrayList.trimToSize();
        java.util.List listUnmodifiableList = j$.util.DesugarCollections.unmodifiableList(arrayList);
        java.lang.Object obj = anydVar.a;
        java.lang.Object obj2 = anydVar.b;
        defpackage.ansa ansaVar = ((defpackage.anng) obj).b;
        ansaVar.b = listUnmodifiableList;
        defpackage.ansc anscVar = new defpackage.ansc(ansaVar);
        ((defpackage.anrp) obj2).a = anscVar.c;
        return new defpackage.aoct(aocvVar, anscVar, defpackage.anmv.d);
    }

    public final defpackage.antw h() {
        return this.a;
    }

    public final void i(defpackage.apjb apjbVar) {
        this.b.f = apjbVar;
    }

    public final java.lang.String toString() {
        ahym ahymVarL = ahvr.l(this);
        ahymVarL.b("delegate", h());
        return ahymVarL.toString();
    }

    protected anng() {
        super((char[]) null);
    }
}
