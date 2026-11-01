package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class agcj extends android.database.DataSetObserver {
    final /* synthetic */ com.google.android.material.tabs.TabLayout a;

    public agcj(com.google.android.material.tabs.TabLayout tabLayout) {
        j$.util.Objects.requireNonNull(tabLayout);
        this.a = tabLayout;
    }

    @Override // android.database.DataSetObserver
    public final void onChanged() {
        this.a.h();
    }

    @Override // android.database.DataSetObserver
    public final void onInvalidated() {
        this.a.h();
    }
}
