package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class aopd implements aope {
    private java.lang.Object a;

    public final java.lang.Object a(java.lang.Object obj, aoqc aoqcVar) {
        aooh.f(aoqcVar, "property");
        java.lang.Object obj2 = this.a;
        if (obj2 != null) {
            return obj2;
        }
        throw new java.lang.IllegalStateException("Property " + aoqcVar.c() + " should be initialized before get.");
    }

    public final void b(aoqc aoqcVar, java.lang.Object obj) {
        aooh.f(aoqcVar, "property");
        this.a = obj;
    }

    public final java.lang.String toString() {
        java.lang.String strConcat;
        java.lang.Object obj = this.a;
        if (obj != null) {
            java.util.Objects.toString(obj);
            strConcat = "value=".concat(obj.toString());
        } else {
            strConcat = "value not initialized yet";
        }
        return a.bp((byte) 41, strConcat, "NotNullProperty(");
    }
}
