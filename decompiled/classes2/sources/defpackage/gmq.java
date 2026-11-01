package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class gmq extends android.database.DataSetObserver {
    final /* synthetic */ androidx.viewpager.widget.ViewPager a;

    public gmq(androidx.viewpager.widget.ViewPager viewPager) {
        this.a = viewPager;
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
