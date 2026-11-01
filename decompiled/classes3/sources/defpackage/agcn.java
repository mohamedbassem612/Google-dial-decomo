package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class agcn implements gmp {
    public int a;
    public int b;
    private final java.lang.ref.WeakReference c;

    public agcn(com.google.android.material.tabs.TabLayout tabLayout) {
        this.c = new java.lang.ref.WeakReference(tabLayout);
    }

    public final void a(int i) {
        this.a = this.b;
        this.b = i;
        com.google.android.material.tabs.TabLayout tabLayout = (com.google.android.material.tabs.TabLayout) this.c.get();
        if (tabLayout != null) {
            tabLayout.B = this.b;
        }
    }

    public final void b(int i) {
        com.google.android.material.tabs.TabLayout tabLayout = (com.google.android.material.tabs.TabLayout) this.c.get();
        if (tabLayout == null || tabLayout.a() == i || i >= tabLayout.b()) {
            return;
        }
        int i2 = this.b;
        boolean z = true;
        if (i2 != 0 && (i2 != 2 || this.a != 0)) {
            z = false;
        }
        tabLayout.j(tabLayout.c(i), z);
    }

    public final void c(int i, float f) {
        com.google.android.material.tabs.TabLayout tabLayout = (com.google.android.material.tabs.TabLayout) this.c.get();
        if (tabLayout != null) {
            int i2 = this.b;
            boolean z = true;
            boolean z2 = i2 != 2 || this.a == 1;
            if (i2 == 2 && this.a == 0) {
                z = false;
            }
            tabLayout.l(i, f, z2, z, false);
        }
    }
}
