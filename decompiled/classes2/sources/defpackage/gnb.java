package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
abstract class gnb implements java.lang.reflect.InvocationHandler {
    private final aopu a;

    public gnb(aopu aopuVar) {
        this.a = aopuVar;
    }

    public abstract boolean a(java.lang.Object obj, java.lang.Object obj2);

    @Override // java.lang.reflect.InvocationHandler
    public final java.lang.Object invoke(java.lang.Object obj, java.lang.reflect.Method method, java.lang.Object[] objArr) {
        aooh.f(obj, "obj");
        aooh.f(method, "method");
        aooh.f(method, "<this>");
        if (aooh.n(method.getName(), "test") && method.getReturnType().equals(java.lang.Boolean.TYPE) && objArr != null && objArr.length == 1) {
            aopu aopuVar = this.a;
            java.lang.Object obj2 = objArr[0];
            aodc.o(aopuVar, obj2);
            return java.lang.Boolean.valueOf(a(obj, obj2));
        }
        aooh.f(method, "<this>");
        if (aooh.n(method.getName(), "equals") && method.getReturnType().equals(java.lang.Boolean.TYPE) && objArr != null && objArr.length == 1) {
            java.lang.Object obj3 = objArr[0];
            aooh.c(obj3);
            return java.lang.Boolean.valueOf(obj == obj3);
        }
        aooh.f(method, "<this>");
        if (aooh.n(method.getName(), "hashCode") && method.getReturnType().equals(java.lang.Integer.TYPE) && objArr == null) {
            return java.lang.Integer.valueOf(hashCode());
        }
        aooh.f(method, "<this>");
        if (aooh.n(method.getName(), "toString") && method.getReturnType().equals(java.lang.String.class) && objArr == null) {
            return toString();
        }
        throw new java.lang.UnsupportedOperationException("Unexpected method call object:" + obj + ", method: " + method + ", args: " + objArr);
    }
}
