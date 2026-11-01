package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class ajve implements defpackage.ajvi {
    private final int a;
    private final defpackage.ajvh b;

    public ajve(int i, defpackage.ajvh ajvhVar) {
        this.a = i;
        this.b = ajvhVar;
    }

    @Override // defpackage.ajvi
    public final int a() {
        return this.a;
    }

    @Override // java.lang.annotation.Annotation
    public final java.lang.Class annotationType() {
        return defpackage.ajvi.class;
    }

    @Override // defpackage.ajvi
    public final defpackage.ajvh b() {
        return this.b;
    }

    @Override // java.lang.annotation.Annotation
    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.ajvi) {
            defpackage.ajvi ajviVar = (defpackage.ajvi) obj;
            if (this.a == ajviVar.a() && this.b.equals(ajviVar.b())) {
                return true;
            }
        }
        return false;
    }

    @Override // java.lang.annotation.Annotation
    public final int hashCode() {
        return (this.a ^ 14552422) + (this.b.hashCode() ^ 2041407134);
    }

    @Override // java.lang.annotation.Annotation
    public final java.lang.String toString() {
        return "@com.google.firebase.encoders.proto.Protobuf(tag=" + this.a + "intEncoding=" + this.b + ')';
    }
}
