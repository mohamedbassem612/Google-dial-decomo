package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class px extends defpackage.rm {
    public final java.lang.String a;
    final java.util.List b;
    final android.os.Bundle c;
    private java.util.Set d;

    public px(java.lang.String str, java.util.List list, android.os.Bundle bundle) {
        this.a = (java.lang.String) j$.util.Objects.requireNonNull(str);
        this.b = (java.util.List) j$.util.Objects.requireNonNull(list);
        this.c = (android.os.Bundle) j$.util.Objects.requireNonNull(bundle);
    }

    public final java.util.Map a() {
        android.os.Bundle bundle = this.c;
        java.util.Set<java.lang.String> setKeySet = bundle.keySet();
        aca acaVar = new aca(setKeySet.size());
        for (java.lang.String str : setKeySet) {
            java.util.ArrayList<java.lang.String> stringArrayList = bundle.getStringArrayList(str);
            if (stringArrayList != null) {
                acaVar.put(str, j$.util.DesugarCollections.unmodifiableList(stringArrayList));
            }
        }
        return acaVar;
    }

    public final java.util.Set b() {
        java.util.Set set = this.d;
        if (set != null) {
            return set;
        }
        java.util.Set setUnmodifiableSet = j$.util.DesugarCollections.unmodifiableSet(new acc(this.b));
        this.d = setUnmodifiableSet;
        return setUnmodifiableSet;
    }
}
