package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public final class azg {
    public float a;
    public boolean b;
    public axe c;
    private axn d;

    public azg(byte[] bArr) {
        this.a = 0.0f;
        this.b = true;
        this.c = null;
        this.d = null;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.azg) {
            defpackage.azg azgVar = (defpackage.azg) obj;
            if (java.lang.Float.compare(this.a, azgVar.a) == 0 && this.b == azgVar.b && defpackage.aooh.n(this.c, azgVar.c)) {
                axn axnVar = azgVar.d;
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iFloatToIntBits = java.lang.Float.floatToIntBits(this.a) * 31;
        int i = true != this.b ? 1237 : 1231;
        axe axeVar = this.c;
        return (((iFloatToIntBits + i) * 31) + (axeVar == null ? 0 : axeVar.hashCode())) * 31;
    }

    public final java.lang.String toString() {
        return "RowColumnParentData(weight=" + this.a + ", fill=" + this.b + ", crossAxisAlignment=" + this.c + ", flowLayoutData=null)";
    }

    public azg() {
        this(null);
    }
}
