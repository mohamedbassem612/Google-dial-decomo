package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public abstract class annc extends defpackage.anot {
    protected annc() {
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [aodt, java.lang.Object] */
    @Override // defpackage.anot
    public defpackage.anor a() {
        defpackage.anme anmeVar;
        defpackage.anot anotVarB = b();
        defpackage.anzn anznVar = (defpackage.anzn) anotVarB;
        defpackage.anvv anvvVarA = anznVar.y.a();
        defpackage.apni apniVarI = defpackage.annb.a ? defpackage.anzn.i(anznVar.k, anznVar.i) : defpackage.anzn.h(anznVar.k, anznVar.i);
        java.util.Collection collectionB = anvvVarA.b();
        boolean z = true;
        if (collectionB != null && !collectionB.containsAll(((defpackage.anpw) apniVarI.a).e())) {
            throw new java.lang.IllegalArgumentException(java.lang.String.format("Address types of NameResolver '%s' for '%s' not supported by transport", ((defpackage.anpw) apniVarI.a).c(), apniVarI.b));
        }
        ?? r4 = apniVarI.b;
        java.lang.Object obj = apniVarI.a;
        defpackage.aodg aodgVar = new defpackage.aodg(defpackage.anxo.o, 0);
        defpackage.ahzi ahziVar = defpackage.anxo.q;
        r4.toString();
        java.util.List list = anznVar.h;
        java.util.ArrayList arrayList = new java.util.ArrayList(list.size());
        java.util.Iterator it = list.iterator();
        while (true) {
            defpackage.anme anmeVar2 = null;
            if (!it.hasNext()) {
                boolean z2 = z;
                defpackage.apnf.j().i();
                boolean z3 = anznVar.s;
                java.lang.reflect.Method method = defpackage.anzn.e;
                if (method != null) {
                    try {
                        boolean z4 = ((defpackage.anzn) anotVarB).t;
                        boolean z5 = ((defpackage.anzn) anotVarB).u;
                        boolean z6 = ((defpackage.anzn) anotVarB).v;
                        java.lang.Object[] objArr = new java.lang.Object[4];
                        java.lang.Boolean bool = java.lang.Boolean.TRUE;
                        objArr[0] = bool;
                        objArr[z2 ? 1 : 0] = bool;
                        objArr[2] = java.lang.Boolean.FALSE;
                        objArr[3] = bool;
                        anmeVar = (defpackage.anme) method.invoke(null, objArr);
                    } catch (java.lang.IllegalAccessException e) {
                        defpackage.anzn.a.logp(java.util.logging.Level.FINE, "io.grpc.internal.ManagedChannelImplBuilder", "getEffectiveInterceptors", "Unable to apply census stats", (java.lang.Throwable) e);
                        anmeVar = null;
                    } catch (java.lang.reflect.InvocationTargetException e2) {
                        defpackage.anzn.a.logp(java.util.logging.Level.FINE, "io.grpc.internal.ManagedChannelImplBuilder", "getEffectiveInterceptors", "Unable to apply census stats", (java.lang.Throwable) e2);
                        anmeVar = null;
                    }
                } else {
                    anmeVar = null;
                }
                if (anmeVar != null) {
                    arrayList.add(0, anmeVar);
                }
                boolean z7 = anznVar.w;
                try {
                    anmeVar2 = (defpackage.anme) java.lang.Class.forName("anua").getDeclaredMethod("getClientInterceptor", null).invoke(null, null);
                } catch (java.lang.ClassNotFoundException e3) {
                    defpackage.anzn.a.logp(java.util.logging.Level.FINE, "io.grpc.internal.ManagedChannelImplBuilder", "getEffectiveInterceptors", "Unable to apply census stats", (java.lang.Throwable) e3);
                } catch (java.lang.IllegalAccessException e4) {
                    defpackage.anzn.a.logp(java.util.logging.Level.FINE, "io.grpc.internal.ManagedChannelImplBuilder", "getEffectiveInterceptors", "Unable to apply census stats", (java.lang.Throwable) e4);
                } catch (java.lang.NoSuchMethodException e5) {
                    defpackage.anzn.a.logp(java.util.logging.Level.FINE, "io.grpc.internal.ManagedChannelImplBuilder", "getEffectiveInterceptors", "Unable to apply census stats", (java.lang.Throwable) e5);
                } catch (java.lang.reflect.InvocationTargetException e6) {
                    defpackage.anzn.a.logp(java.util.logging.Level.FINE, "io.grpc.internal.ManagedChannelImplBuilder", "getEffectiveInterceptors", "Unable to apply census stats", (java.lang.Throwable) e6);
                }
                if (anmeVar2 != null) {
                    arrayList.add(0, anmeVar2);
                }
                return new defpackage.anzp(new defpackage.anzg(anznVar, anvvVarA, r4, (defpackage.anpw) obj, aodgVar, ahziVar, arrayList, defpackage.aodo.a));
            }
            defpackage.anme anmeVar3 = (defpackage.anme) it.next();
            boolean z8 = z;
            if (anmeVar3 instanceof defpackage.anzl) {
                anos anosVar = ((defpackage.anzl) anmeVar3).a;
                throw null;
            }
            arrayList.add(anmeVar3);
            z = z8;
        }
    }

    public abstract defpackage.anot b();

    public final void c(java.util.concurrent.Executor executor) {
        ((defpackage.anzn) b()).c(executor);
    }

    public final void d(long j, java.util.concurrent.TimeUnit timeUnit) {
        ((defpackage.anzn) b()).d(j, timeUnit);
    }

    @Override // defpackage.anot
    public final void e(java.util.List list) {
        ((defpackage.anzn) b()).g(list);
    }

    @Override // defpackage.anot
    public final void f(java.util.concurrent.Executor executor) {
        b().f(executor);
    }

    public final void g(java.lang.String str) {
        ((defpackage.anzn) b()).m = str;
    }

    public final java.lang.String toString() {
        defpackage.ahym ahymVarL = defpackage.ahvr.l(this);
        ahymVarL.b("delegate", b());
        return ahymVarL.toString();
    }
}
