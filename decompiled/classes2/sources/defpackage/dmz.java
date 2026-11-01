package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class dmz implements dmy {
    private final java.lang.String a;
    private final float b;

    public dmz(java.lang.String str, float f) {
        this.a = str;
        this.b = f;
    }

    public final java.lang.String a() {
        return this.a;
    }

    public final float c() {
        return this.b;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.dmz) {
            defpackage.dmz dmzVar = (defpackage.dmz) obj;
            if (aooh.n(this.a, dmzVar.a) && this.b == dmzVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + java.lang.Float.floatToIntBits(this.b);
    }

    public final java.lang.String toString() {
        return "FontVariation.Setting(axisName='" + this.a + "', value=" + this.b + ')';
    }

    public final void b() {
    }
}
