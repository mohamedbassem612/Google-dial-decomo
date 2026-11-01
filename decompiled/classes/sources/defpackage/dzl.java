package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public class dzl {
    public dzl(byte[] bArr) {
    }

    public static defpackage.eax a(android.view.View view) {
        android.view.WindowInsets rootWindowInsets = view.getRootWindowInsets();
        if (rootWindowInsets == null) {
            return null;
        }
        defpackage.eax eaxVar = new defpackage.eax(rootWindowInsets);
        eaxVar.t(eaxVar);
        eaxVar.r(view.getRootView());
        return eaxVar;
    }

    public static defpackage.aoql b(android.view.ViewGroup viewGroup) {
        if (viewGroup == null) {
            defpackage.aooh.i("<this>");
        }
        return new defpackage.dzv(viewGroup);
    }

    public static defpackage.eht c(java.lang.Object obj, java.lang.Object obj2) {
        defpackage.eht ehtVarA = (defpackage.eht) obj;
        defpackage.eht ehtVar = (defpackage.eht) obj2;
        if (!ehtVar.isEmpty()) {
            if (!ehtVarA.b) {
                ehtVarA = ehtVarA.a();
            }
            ehtVarA.b();
            if (!ehtVar.isEmpty()) {
                ehtVarA.putAll(ehtVar);
            }
        }
        return ehtVarA;
    }

    public static java.lang.Object d() {
        return defpackage.eht.a.a();
    }

    public static defpackage.ehk e(java.lang.Object obj, long j) {
        return (defpackage.ehk) defpackage.eit.f(obj, j);
    }

    public static java.util.List f(java.lang.Object obj, long j) {
        defpackage.ehk ehkVarE = e(obj, j);
        if (ehkVarE.c()) {
            return ehkVarE;
        }
        int size = ehkVarE.size();
        defpackage.ehk ehkVarD = ehkVarE.d(size == 0 ? 10 : size << 1);
        defpackage.eit.q(obj, j, ehkVarD);
        return ehkVarD;
    }

    public static defpackage.ehb g(java.lang.Object obj) {
        return ((defpackage.ehf) obj).extensions;
    }

    public static void h(java.lang.Object obj) {
        throw null;
    }

    public static void i(java.lang.Object obj) {
        g(obj).c();
    }

    public static void j(android.view.View view, defpackage.fxz fxzVar) {
        if (view == null) {
            defpackage.aooh.i("<this>");
        }
        view.setTag(2131429435, fxzVar);
    }

    public static defpackage.eoa k(defpackage.eoe eoeVar, defpackage.aopu aopuVar, defpackage.eoq eoqVar) {
        if (eoeVar == null) {
            defpackage.aooh.i("factory");
        }
        try {
            try {
                return eoeVar.c(aopuVar, eoqVar);
            } catch (java.lang.AbstractMethodError unused) {
                java.lang.Class cls = ((defpackage.aooa) aopuVar).b;
                if (cls == null) {
                    defpackage.aooh.h("null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-java>>");
                }
                return eoeVar.b(cls, eoqVar);
            }
        } catch (java.lang.AbstractMethodError unused2) {
            java.lang.Class cls2 = ((defpackage.aooa) aopuVar).b;
            if (cls2 == null) {
                defpackage.aooh.h("null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-java>>");
            }
            return eoeVar.a(cls2);
        }
    }

    public static defpackage.eoa l(java.lang.Class cls) throws java.lang.reflect.InvocationTargetException {
        if (cls == null) {
            defpackage.aooh.i("modelClass");
        }
        try {
            java.lang.reflect.Constructor declaredConstructor = cls.getDeclaredConstructor(null);
            if (!java.lang.reflect.Modifier.isPublic(declaredConstructor.getModifiers())) {
                java.util.Objects.toString(cls);
                throw new java.lang.RuntimeException("Cannot create an instance of ".concat(java.lang.String.valueOf(cls)));
            }
            try {
                java.lang.Object objNewInstance = declaredConstructor.newInstance(null);
                if (objNewInstance == null) {
                    defpackage.aooh.g();
                }
                return (defpackage.eoa) objNewInstance;
            } catch (java.lang.IllegalAccessException e) {
                java.util.Objects.toString(cls);
                throw new java.lang.RuntimeException("Cannot create an instance of ".concat(java.lang.String.valueOf(cls)), e);
            } catch (java.lang.InstantiationException e2) {
                java.util.Objects.toString(cls);
                throw new java.lang.RuntimeException("Cannot create an instance of ".concat(java.lang.String.valueOf(cls)), e2);
            }
        } catch (java.lang.NoSuchMethodException e3) {
            java.util.Objects.toString(cls);
            throw new java.lang.RuntimeException("Cannot create an instance of ".concat(java.lang.String.valueOf(cls)), e3);
        }
    }

    public static defpackage.eoa m(defpackage.aopu aopuVar, defpackage.eoi eoiVar, java.lang.String str, defpackage.eoe eoeVar, defpackage.eoq eoqVar) {
        if (eoeVar == null) {
            eoeVar = defpackage.dzo.m(eoiVar);
        }
        defpackage.eog eogVarG = defpackage.enn.g(eoiVar, eoeVar, eoqVar);
        return str != null ? eogVarG.b.I(aopuVar, str) : eogVarG.b(aopuVar);
    }

    public static defpackage.eoe n(java.util.Map map) {
        java.util.Collection collectionValues = map.values();
        if (collectionValues == null) {
            defpackage.aooh.i("initializers");
        }
        defpackage.enr[] enrVarArr = (defpackage.enr[]) collectionValues.toArray(new defpackage.enr[0]);
        return new defpackage.eor((defpackage.enr[]) java.util.Arrays.copyOf(enrVarArr, enrVarArr.length));
    }

    public static void o(defpackage.aopu aopuVar, defpackage.aonj aonjVar, java.util.Map map) {
        if (aonjVar == null) {
            defpackage.aooh.i("initializer");
        }
        if (!map.containsKey(aopuVar)) {
            map.put(aopuVar, new defpackage.enr(aopuVar, aonjVar));
            return;
        }
        throw new java.lang.IllegalArgumentException("A `initializer` with the same `clazz` has already been added: " + aopuVar.b() + '.');
    }

    public static defpackage.kgl p(java.lang.Object obj) {
        return (defpackage.kgl) ((defpackage.ipc) obj).a;
    }
}
