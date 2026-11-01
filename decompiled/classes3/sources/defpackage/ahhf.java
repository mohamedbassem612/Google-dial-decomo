package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class ahhf {
    public final java.util.Map a;
    public boolean b;

    public /* synthetic */ ahhf(byte[] bArr) {
        this.a = new java.util.LinkedHashMap();
        this.b = true;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.ahhf) {
            defpackage.ahhf ahhfVar = (defpackage.ahhf) obj;
            if (aooh.n(this.a, ahhfVar.a) && this.b == ahhfVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + anty.L(this.b);
    }

    public final java.lang.String toString() {
        return "StreamMixinState(flowIds=" + this.a + ", acceptingNewChannels=" + this.b + ')';
    }

    public ahhf() {
        this(null);
    }
}
