package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class ahsx {
    public final aphg a;
    public final boolean b;
    private final aenj c;

    public ahsx(aphg aphgVar, aenj aenjVar, boolean z) {
        this.a = aphgVar;
        this.c = aenjVar;
        this.b = z;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.ahsx) {
            defpackage.ahsx ahsxVar = (defpackage.ahsx) obj;
            if (this.a.equals(ahsxVar.a) && this.c.equals(ahsxVar.c) && this.b == ahsxVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.c.hashCode()) * 1000003) ^ (true != this.b ? 1237 : 1231);
    }

    public final java.lang.String toString() {
        aenj aenjVar = this.c;
        return "ConvertedTraceRecordWithMetadata{traceRecord=" + java.lang.String.valueOf(this.a) + ", eventName=" + java.lang.String.valueOf(aenjVar) + ", isEmpty=" + this.b + '}';
    }

    public ahsx() {
        throw null;
    }
}
