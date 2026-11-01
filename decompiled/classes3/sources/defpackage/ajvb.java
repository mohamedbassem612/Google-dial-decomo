package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class ajvb {
    private final java.lang.String a;
    private final java.util.Map b;

    public ajvb(java.lang.String str, java.util.Map map) {
        this.a = str;
        this.b = map;
    }

    public final java.lang.annotation.Annotation a(java.lang.Class cls) {
        return (java.lang.annotation.Annotation) this.b.get(cls);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.ajvb) {
            defpackage.ajvb ajvbVar = (defpackage.ajvb) obj;
            if (this.a.equals(ajvbVar.a) && this.b.equals(ajvbVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final java.lang.String toString() {
        return "FieldDescriptor{name=" + this.a + ", properties=" + java.lang.String.valueOf(this.b.values()) + '}';
    }
}
