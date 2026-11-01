package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class wix {
    public final defpackage.amtn a;
    public final aiyr b;

    public wix(defpackage.amtn amtnVar, aiyr aiyrVar) {
        aooh.f(amtnVar, "xatuTreeItemsLog");
        aooh.f(aiyrVar, "xatuSessionMetrics");
        this.a = amtnVar;
        this.b = aiyrVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.wix) {
            defpackage.wix wixVar = (defpackage.wix) obj;
            if (aooh.n(this.a, wixVar.a) && aooh.n(this.b, wixVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final java.lang.String toString() {
        return "XatuTreeItemsInfo(xatuTreeItemsLog=" + this.a + ", xatuSessionMetrics=" + this.b + ')';
    }
}
