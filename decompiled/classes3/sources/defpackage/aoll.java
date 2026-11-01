package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
final class aoll implements java.io.Serializable {
    private static final long serialVersionUID = 0;
    private final aolr[] a;

    public aoll(aolr[] aolrVarArr) {
        this.a = aolrVarArr;
    }

    private final java.lang.Object readResolve() {
        aolr aolrVarPlus = aols.a;
        int i = 0;
        while (true) {
            aolr[] aolrVarArr = this.a;
            if (i >= aolrVarArr.length) {
                return aolrVarPlus;
            }
            aolrVarPlus = aolrVarPlus.plus(aolrVarArr[i]);
            i++;
        }
    }
}
