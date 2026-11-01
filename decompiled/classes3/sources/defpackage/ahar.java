package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class ahar {
    public final akzc a;
    public final defpackage.ahap b;
    public final boolean c;

    public ahar(akzc akzcVar, defpackage.ahap ahapVar, boolean z) {
        this.a = akzcVar;
        this.b = ahapVar;
        this.c = z;
    }

    public static defpackage.ahaq a() {
        defpackage.ahaq ahaqVar = new defpackage.ahaq();
        ahaqVar.c(akzc.d);
        return ahaqVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.ahar) {
            defpackage.ahar aharVar = (defpackage.ahar) obj;
            if (this.a.equals(aharVar.a) && this.b.equals(aharVar.b) && this.c == aharVar.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ (true != this.c ? 1237 : 1231)) * 1000003;
    }

    public final java.lang.String toString() {
        defpackage.ahap ahapVar = this.b;
        return "DebugData{data=" + java.lang.String.valueOf(this.a) + ", type=" + java.lang.String.valueOf(ahapVar) + ", containsPii=" + this.c + ", proto=null}";
    }

    public ahar() {
        throw null;
    }
}
