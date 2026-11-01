package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class wiy {
    public final java.util.Map a;
    public final aiyr b;

    public wiy(java.util.Map map, aiyr aiyrVar) {
        aooh.f(map, "idToLatestTreeItem");
        aooh.f(aiyrVar, "xatuSessionMetrics");
        this.a = map;
        this.b = aiyrVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof defpackage.wiy) {
            defpackage.wiy wiyVar = (defpackage.wiy) obj;
            if (aooh.n(this.a, wiyVar.a) && aooh.n(this.b, wiyVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final java.lang.String toString() {
        return "LatestTreeItemsInfo(idToLatestTreeItem=" + this.a + ", xatuSessionMetrics=" + this.b + ')';
    }
}
