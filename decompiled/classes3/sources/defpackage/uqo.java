package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class uqo {
    public final boolean a;
    public final boolean b;
    public final double c;

    public uqo(boolean z, boolean z2, double d) {
        this.a = z;
        this.b = z2;
        this.c = d;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.uqo) {
            defpackage.uqo uqoVar = (defpackage.uqo) obj;
            if (this.a == uqoVar.a && this.b == uqoVar.b) {
                if (java.lang.Double.doubleToLongBits(this.c) == java.lang.Double.doubleToLongBits(uqoVar.c)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        double d = this.c;
        long jDoubleToLongBits = (java.lang.Double.doubleToLongBits(d) >>> 32) ^ java.lang.Double.doubleToLongBits(d);
        return (((((true != this.a ? 1237 : 1231) ^ 1000003) * 1000003) ^ (true == this.b ? 1231 : 1237)) * 1000003) ^ ((int) jDoubleToLongBits);
    }

    public final java.lang.String toString() {
        return "Config{timeOfDayEffectEnabled=" + this.a + ", missedCallEffectEnabled=" + this.b + ", recencyDecay=" + this.c + '}';
    }

    public uqo() {
        throw null;
    }
}
