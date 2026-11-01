package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class alid {
    public final aiga a;
    public final amas b;
    public final amaw c;

    public alid(aiga aigaVar, amas amasVar, amaw amawVar) {
        this.a = aigaVar;
        this.b = amasVar;
        this.c = amawVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.alid) {
            defpackage.alid alidVar = (defpackage.alid) obj;
            if (this.a.equals(alidVar.a) && this.b.equals(alidVar.b) && this.c.equals(alidVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
    }

    public final java.lang.String toString() {
        amaw amawVar = this.c;
        amas amasVar = this.b;
        return "Sample{predictedHeads=" + java.lang.String.valueOf(this.a) + ", modelInput=" + java.lang.String.valueOf(amasVar) + ", modelOutput=" + java.lang.String.valueOf(amawVar) + '}';
    }

    public alid() {
        throw null;
    }
}
