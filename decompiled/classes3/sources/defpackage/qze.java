package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class qze {
    public final java.lang.String a;
    public final java.util.List b;

    public qze(java.lang.String str, java.util.List list) {
        aooh.f(str, "callId");
        this.a = str;
        this.b = list;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.qze) {
            defpackage.qze qzeVar = (defpackage.qze) obj;
            if (aooh.n(this.a, qzeVar.a) && aooh.n(this.b, qzeVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final java.lang.String toString() {
        return "MoreMenuUiModel(callId=" + this.a + ", listItems=" + this.b + ')';
    }
}
