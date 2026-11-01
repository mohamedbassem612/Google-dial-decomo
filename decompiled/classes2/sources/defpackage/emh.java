package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
@java.lang.Deprecated
final class emh {
    final int a;
    final java.lang.reflect.Method b;

    public emh(int i, java.lang.reflect.Method method) {
        this.a = i;
        this.b = method;
        method.setAccessible(true);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.emh) {
            defpackage.emh emhVar = (defpackage.emh) obj;
            if (this.a == emhVar.a && this.b.getName().equals(emhVar.b.getName())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.a * 31) + this.b.getName().hashCode();
    }
}
