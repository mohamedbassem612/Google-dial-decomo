package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class zcn extends wsc {
    public final akyp a;

    public zcn(akyp akypVar) {
        aooh.f(akypVar, "value");
        this.a = akypVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this != obj) {
            return (obj instanceof defpackage.zcn) && aooh.n(this.a, ((defpackage.zcn) obj).a);
        }
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final java.lang.String toString() {
        return "ProtoValue(value=" + this.a + ')';
    }
}
