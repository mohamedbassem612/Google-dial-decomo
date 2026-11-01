package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class gmx implements java.lang.reflect.InvocationHandler {
    private final aopu a;
    private final aonj b;

    public gmx(aopu aopuVar, aonj aonjVar) {
        this.a = aopuVar;
        this.b = aonjVar;
    }

    @Override // java.lang.reflect.InvocationHandler
    public final java.lang.Object invoke(java.lang.Object obj, java.lang.reflect.Method method, java.lang.Object[] objArr) {
        aooh.f(obj, "obj");
        aooh.f(method, "method");
        if (aooh.n(method.getName(), "accept") && objArr != null && objArr.length == 1) {
            aopu aopuVar = this.a;
            java.lang.Object obj2 = objArr[0];
            aodc.o(aopuVar, obj2);
            aooh.f(obj2, "parameter");
            this.b.a(obj2);
            return aojh.a;
        }
        if (aooh.n(method.getName(), "equals") && method.getReturnType().equals(java.lang.Boolean.TYPE) && objArr != null && objArr.length == 1) {
            return java.lang.Boolean.valueOf(obj == objArr[0]);
        }
        if (aooh.n(method.getName(), "hashCode") && method.getReturnType().equals(java.lang.Integer.TYPE) && objArr == null) {
            return java.lang.Integer.valueOf(this.b.hashCode());
        }
        if (aooh.n(method.getName(), "toString") && method.getReturnType().equals(java.lang.String.class) && objArr == null) {
            return this.b.toString();
        }
        throw new java.lang.UnsupportedOperationException("Unexpected method call object:" + obj + ", method: " + method + ", args: " + objArr);
    }
}
