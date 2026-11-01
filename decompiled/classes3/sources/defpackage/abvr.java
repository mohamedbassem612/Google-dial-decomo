package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class abvr implements defpackage.abvt {
    private final /* synthetic */ int $cid;
    private final java.lang.Object a;

    public abvr(int i, byte[] bArr) {
        this.$cid = i;
        this.a = new java.util.ArrayList();
    }

    @Override // defpackage.abvt
    public final android.os.Bundle a() {
        if (this.$cid != 0) {
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putParcelableArrayList("android:query-arg-queries", (java.util.ArrayList) this.a);
            return bundle;
        }
        android.os.Bundle bundleBuild = ((android.provider.PeopleContract.Persons.Query.Builder) this.a).build();
        aooh.e(bundleBuild, "build(...)");
        return bundleBuild;
    }

    @Override // defpackage.abvs
    public final void b(java.lang.String str, java.util.List list) {
        if (this.$cid == 0) {
            aooh.f(str, "packageName");
            aooh.f(list, "lookupKeys");
            aooh.e(((android.provider.PeopleContract.Persons.Query.Builder) this.a).addLookupQuery(str, list), "addLookupQuery(...)");
            return;
        }
        aooh.f(str, "packageName");
        aooh.f(list, "lookupKeys");
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString("android:query-arg-package", str);
        bundle.putString("android:query-arg-selection-type", "selection-type-lookup-key");
        bundle.putStringArray("android:query-arg-selection-value", (java.lang.String[]) list.toArray(new java.lang.String[0]));
        ((java.util.ArrayList) this.a).add(bundle);
    }

    public abvr(int i) {
        this.$cid = i;
        this.a = new android.provider.PeopleContract.Persons.Query.Builder();
    }
}
