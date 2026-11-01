package com.google.android.libraries.mdi.search.g3appsearch.app;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class G3AttributionInfo {
    public static final aify a = aify.q("g3attrinfo.normal", "g3attrinfo.tokenid");
    public static final pq b;
    public final java.lang.String c;
    public final java.lang.String d;
    public akxp e;

    static {
        pf.b("g3attrinfo", "G3AttributionInfo", 2, true, new acc(0));
        try {
            pq pqVarA = ps.b().a(com.google.android.libraries.mdi.search.g3appsearch.app.G3AttributionInfo.class).a();
            b = pqVarA;
            pi piVar = new pi("G3AttributionInfo");
            java.util.List listB = pqVarA.b();
            for (int i = 0; i < listB.size(); i++) {
                pn pnVar = (pn) listB.get(i);
                if (!pnVar.a().equals("normal") && !pnVar.a().equals("tokenid")) {
                    piVar.c(pnVar);
                }
            }
            piVar.c(new po("normal").a());
            piVar.c(new po("tokenid").a());
            piVar.a();
        } catch (qv e) {
            throw new java.lang.IllegalStateException("Could not get schema for generated G3AttributionInfo", e);
        }
    }

    public G3AttributionInfo(java.lang.String str, java.lang.String str2) {
        this.c = str;
        this.d = str2;
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof com.google.android.libraries.mdi.search.g3appsearch.app.G3AttributionInfo)) {
            return false;
        }
        com.google.android.libraries.mdi.search.g3appsearch.app.G3AttributionInfo g3AttributionInfo = (com.google.android.libraries.mdi.search.g3appsearch.app.G3AttributionInfo) obj;
        return j$.util.Objects.equals(this.c, g3AttributionInfo.c) && j$.util.Objects.equals(this.d, g3AttributionInfo.d);
    }

    public final int hashCode() {
        return j$.util.Objects.hash(new java.lang.Object[]{this.c, this.d});
    }

    public final java.lang.String toString() {
        return "{normal: " + this.c + ", tokenid: " + this.d + '}';
    }
}
