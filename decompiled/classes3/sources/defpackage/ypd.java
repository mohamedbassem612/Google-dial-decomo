package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class ypd {
    public final java.lang.Class a;
    public final java.lang.Class b;
    public final java.lang.reflect.Method c;
    public final java.lang.reflect.Method d;
    public final java.lang.reflect.Method e;
    public final java.lang.reflect.Method f;
    public final java.lang.reflect.Method g;
    public final java.lang.reflect.Method h;
    public final java.lang.reflect.Method i;

    public ypd(java.lang.Class cls, java.lang.Class cls2, java.lang.reflect.Method method, java.lang.reflect.Method method2, java.lang.reflect.Method method3, java.lang.reflect.Method method4, java.lang.reflect.Method method5, java.lang.reflect.Method method6, java.lang.reflect.Method method7) {
        if (cls == null) {
            throw new java.lang.NullPointerException("Null logClass");
        }
        this.a = cls;
        if (cls2 == null) {
            throw new java.lang.NullPointerException("Null eventClass");
        }
        this.b = cls2;
        if (method == null) {
            throw new java.lang.NullPointerException("Null writeMethod");
        }
        this.c = method;
        if (method2 == null) {
            throw new java.lang.NullPointerException("Null newBuilderMethod");
        }
        this.d = method2;
        if (method3 == null) {
            throw new java.lang.NullPointerException("Null setAtomIdMethod");
        }
        this.e = method3;
        if (method4 == null) {
            throw new java.lang.NullPointerException("Null writeIntMethod");
        }
        this.f = method4;
        if (method5 == null) {
            throw new java.lang.NullPointerException("Null writeLongMethod");
        }
        this.g = method5;
        if (method6 == null) {
            throw new java.lang.NullPointerException("Null usePooledBufferMethod");
        }
        this.h = method6;
        if (method7 == null) {
            throw new java.lang.NullPointerException("Null buildMethod");
        }
        this.i = method7;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.ypd) {
            defpackage.ypd ypdVar = (defpackage.ypd) obj;
            if (this.a.equals(ypdVar.a) && this.b.equals(ypdVar.b) && this.c.equals(ypdVar.c) && this.d.equals(ypdVar.d) && this.e.equals(ypdVar.e) && this.f.equals(ypdVar.f) && this.g.equals(ypdVar.g) && this.h.equals(ypdVar.h) && this.i.equals(ypdVar.i)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f.hashCode()) * 1000003) ^ this.g.hashCode()) * 1000003) ^ this.h.hashCode()) * 1000003) ^ this.i.hashCode();
    }

    public final java.lang.String toString() {
        java.lang.reflect.Method method = this.i;
        java.lang.reflect.Method method2 = this.h;
        java.lang.reflect.Method method3 = this.g;
        java.lang.reflect.Method method4 = this.f;
        java.lang.reflect.Method method5 = this.e;
        java.lang.reflect.Method method6 = this.d;
        java.lang.reflect.Method method7 = this.c;
        java.lang.Class cls = this.b;
        return "ReflectionContext{logClass=" + this.a.toString() + ", eventClass=" + cls.toString() + ", writeMethod=" + method7.toString() + ", newBuilderMethod=" + method6.toString() + ", setAtomIdMethod=" + method5.toString() + ", writeIntMethod=" + method4.toString() + ", writeLongMethod=" + method3.toString() + ", usePooledBufferMethod=" + method2.toString() + ", buildMethod=" + method.toString() + '}';
    }

    public ypd() {
        throw null;
    }
}
