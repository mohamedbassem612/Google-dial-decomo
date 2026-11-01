package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class agzr {
    public final ahyn a;
    public final ahyn b;
    public final ahyn c;
    public final ahyn d;

    public agzr(ahyn ahynVar, ahyn ahynVar2, ahyn ahynVar3, ahyn ahynVar4) {
        if (ahynVar == null) {
            throw new java.lang.NullPointerException("Null maybeLocalDataSource");
        }
        this.a = ahynVar;
        if (ahynVar2 == null) {
            throw new java.lang.NullPointerException("Null executingLoad");
        }
        this.b = ahynVar2;
        if (ahynVar3 == null) {
            throw new java.lang.NullPointerException("Null pendingTopicResult");
        }
        this.c = ahynVar3;
        if (ahynVar4 == null) {
            throw new java.lang.NullPointerException("Null publishedTopicResult");
        }
        this.d = ahynVar4;
    }

    public final defpackage.agzr a(defpackage.agzu agzuVar) {
        return new defpackage.agzr(this.a, this.b, ahwt.a, ahyn.h(agzuVar));
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.agzr) {
            defpackage.agzr agzrVar = (defpackage.agzr) obj;
            if (this.a.equals(agzrVar.a) && this.b.equals(agzrVar.b) && this.c.equals(agzrVar.c) && this.d.equals(agzrVar.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode();
    }

    public final java.lang.String toString() {
        ahyn ahynVar = this.d;
        ahyn ahynVar2 = this.c;
        ahyn ahynVar3 = this.b;
        return "LocalSubscriptionState{maybeLocalDataSource=" + java.lang.String.valueOf(this.a) + ", executingLoad=" + java.lang.String.valueOf(ahynVar3) + ", pendingTopicResult=" + java.lang.String.valueOf(ahynVar2) + ", publishedTopicResult=" + java.lang.String.valueOf(ahynVar) + '}';
    }

    public agzr() {
        throw null;
    }
}
