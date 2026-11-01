package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class enx {
    public static final java.util.List a = ajsz.bb(new java.lang.Class[]{android.app.Application.class, enr.class});
    public static final java.util.List b = ajsz.aY(enr.class);

    public static final eoa a(java.lang.Class cls, java.lang.reflect.Constructor constructor, java.lang.Object... objArr) {
        aooh.f(cls, "modelClass");
        try {
            return (eoa) constructor.newInstance(java.util.Arrays.copyOf(objArr, objArr.length));
        } catch (java.lang.IllegalAccessException e) {
            java.util.Objects.toString(cls);
            throw new java.lang.RuntimeException("Failed to access ".concat(java.lang.String.valueOf(cls)), e);
        } catch (java.lang.InstantiationException e2) {
            throw new java.lang.RuntimeException(a.bg(cls, "A ", " cannot be instantiated."), e2);
        } catch (java.lang.reflect.InvocationTargetException e3) {
            java.util.Objects.toString(cls);
            throw new java.lang.RuntimeException("An exception happened in constructor of ".concat(java.lang.String.valueOf(cls)), e3.getCause());
        }
    }

    public static final java.lang.reflect.Constructor b(java.lang.Class cls, java.util.List list) {
        aooh.f(cls, "modelClass");
        aooh.f(list, "signature");
        java.lang.reflect.Constructor<?>[] constructors = cls.getConstructors();
        aooh.e(constructors, "getConstructors(...)");
        for (java.lang.reflect.Constructor<?> constructor : constructors) {
            java.lang.Class<?>[] parameterTypes = constructor.getParameterTypes();
            aooh.e(parameterTypes, "getParameterTypes(...)");
            java.util.List listCU = ajsz.cU(parameterTypes);
            if (aooh.n(list, listCU)) {
                aooh.d(constructor, "null cannot be cast to non-null type java.lang.reflect.Constructor<T of androidx.lifecycle.SavedStateViewModelFactory_androidKt.findMatchingConstructor>");
                return constructor;
            }
            if (list.size() == listCU.size() && listCU.containsAll(list)) {
                throw new java.lang.UnsupportedOperationException("Class " + cls.getSimpleName() + " must have parameters in the proper order: " + list);
            }
        }
        return null;
    }
}
