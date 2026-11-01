package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final /* synthetic */ class aeov implements java.util.Comparator {
    private final /* synthetic */ int $cid;

    public /* synthetic */ aeov(int i) {
        this.$cid = i;
    }

    /* JADX WARN: Type inference failed for: r2v20, types: [java.lang.Comparable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v16, types: [java.lang.Comparable, java.lang.Object] */
    @Override // java.util.Comparator
    public final int compare(java.lang.Object obj, java.lang.Object obj2) {
        int i = this.$cid;
        if (i == 0) {
            return java.lang.Long.compare(((aeos) ((defpackage.amwp) obj).b).a, ((aeos) ((defpackage.amwp) obj2).b).a);
        }
        if (i == 1) {
            return ((com.google.android.libraries.micore.superpacks.common.PackManifest) obj).p().c(((com.google.android.libraries.micore.superpacks.common.PackManifest) obj2).p());
        }
        if (i == 2) {
            return ajsz.au(java.lang.Integer.valueOf(((defpackage.agiz) ((java.util.Map.Entry) obj).getKey()).f), java.lang.Integer.valueOf(((defpackage.agiz) ((java.util.Map.Entry) obj2).getKey()).f));
        }
        if (i == 3) {
            return java.lang.Long.compare(((ajml) obj).a, ((ajml) obj2).a);
        }
        if (i != 4) {
            return i != 5 ? ajsz.au((java.lang.Comparable) ((defpackage.apqr) obj).b, (java.lang.Comparable) ((defpackage.apqr) obj2).b) : ((java.lang.String) ((java.util.Map.Entry) obj).getKey()).compareTo((java.lang.String) ((java.util.Map.Entry) obj2).getKey());
        }
        return java.lang.Integer.compare(((java.lang.Integer) obj).intValue(), ((java.lang.Integer) obj2).intValue());
    }
}
