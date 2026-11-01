package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes4.dex */
public final class allf {
    public final aigf a;
    public final aigf b;
    public final aigf c;
    public final defpackage.amaw d;

    public allf(aigf aigfVar, aigf aigfVar2, aigf aigfVar3, defpackage.amaw amawVar) {
        this.a = aigfVar;
        this.b = aigfVar2;
        this.c = aigfVar3;
        this.d = amawVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.allf) {
            defpackage.allf allfVar = (defpackage.allf) obj;
            if (ahvr.aJ(this.a, allfVar.a) && ahvr.aJ(this.b, allfVar.b) && ahvr.aJ(this.c, allfVar.c) && this.d.equals(allfVar.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode();
    }

    public final java.lang.String toString() {
        defpackage.amaw amawVar = this.d;
        aigf aigfVar = this.c;
        aigf aigfVar2 = this.b;
        return "Prediction{outputHeadsToClassScores=" + java.lang.String.valueOf(this.a) + ", outputHeadsToClassNames=" + java.lang.String.valueOf(aigfVar2) + ", outputHeadsToClassIndices=" + java.lang.String.valueOf(aigfVar) + ", modelOutput=" + java.lang.String.valueOf(amawVar) + '}';
    }

    public allf() {
        throw null;
    }
}
