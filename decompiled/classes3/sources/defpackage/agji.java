package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class agji {
    public final float a;
    private final java.lang.Integer b;
    private final float c;
    private final java.lang.Integer d;
    private final float e;
    private final java.lang.Integer f;
    private final float g;

    public agji(float f) {
        this.b = null;
        this.c = 0.0f;
        this.d = null;
        this.e = 0.0f;
        this.f = null;
        this.g = 0.0f;
        this.a = f;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.agji) {
            defpackage.agji agjiVar = (defpackage.agji) obj;
            java.lang.Integer num = agjiVar.b;
            if (aooh.n((java.lang.Object) null, (java.lang.Object) null)) {
                float f = agjiVar.c;
                java.lang.Integer num2 = agjiVar.d;
                if (aooh.n((java.lang.Object) null, (java.lang.Object) null)) {
                    float f2 = agjiVar.e;
                    java.lang.Integer num3 = agjiVar.f;
                    if (aooh.n((java.lang.Object) null, (java.lang.Object) null)) {
                        float f3 = agjiVar.g;
                        if (java.lang.Float.compare(this.a, agjiVar.a) == 0) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return java.lang.Float.floatToIntBits(this.a);
    }

    public final java.lang.String toString() {
        return "InteractionStateConfig(hoverColor=null, hoverAlpha=0.0, pressedColor=null, pressedAlpha=0.0, focusedOutlineColor=null, focusedOutlineAlpha=0.0, focusedOutlineStrokeWidth=" + this.a + ')';
    }

    public agji() {
        this(3.0f);
    }
}
