package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class yom {
    public final aigf a;

    public yom(aigf aigfVar) {
        if (aigfVar == null) {
            throw new java.lang.NullPointerException("Null arguments");
        }
        this.a = aigfVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.yom) {
            return this.a.equals(((defpackage.yom) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final java.lang.String toString() {
        return "SummarizationArguments{arguments=" + this.a.toString() + '}';
    }

    public yom() {
        throw null;
    }
}
