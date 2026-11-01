package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class agcm {
    public java.lang.CharSequence a;
    public java.lang.CharSequence b;
    public android.view.View d;
    public com.google.android.material.tabs.TabLayout f;
    public defpackage.agco g;
    public int c = -1;
    public final int e = 1;
    public int h = -1;

    public final void a() {
        com.google.android.material.tabs.TabLayout tabLayout = this.f;
        if (tabLayout == null) {
            throw new java.lang.IllegalArgumentException("Tab not attached to a TabLayout");
        }
        tabLayout.j(this, true);
    }

    final void b() {
        defpackage.agco agcoVar = this.g;
        if (agcoVar != null) {
            agcoVar.b();
        }
    }

    public final void c(java.lang.CharSequence charSequence) {
        this.b = charSequence;
        b();
    }

    public final void d(java.lang.CharSequence charSequence) {
        if (android.text.TextUtils.isEmpty(this.b) && !android.text.TextUtils.isEmpty(charSequence)) {
            this.g.setContentDescription(charSequence);
        }
        this.a = charSequence;
        b();
    }
}
