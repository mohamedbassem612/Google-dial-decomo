package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class afkr extends li {
    final /* synthetic */ android.view.View a;
    final /* synthetic */ com.google.android.libraries.surveys.internal.view.PlatformSystemInfoDialogFragment b;

    public afkr(com.google.android.libraries.surveys.internal.view.PlatformSystemInfoDialogFragment platformSystemInfoDialogFragment, android.view.View view) {
        this.a = view;
        j$.util.Objects.requireNonNull(platformSystemInfoDialogFragment);
        this.b = platformSystemInfoDialogFragment;
    }

    public final void a(android.support.v7.widget.RecyclerView recyclerView, int i, int i2) {
        if (recyclerView.canScrollVertically(-1)) {
            this.a.findViewById(2131429202).setElevation(this.b.getResources().getDimensionPixelSize(2131167849));
        } else {
            this.a.findViewById(2131429202).setElevation(0.0f);
        }
        this.a.findViewById(2131429201).setVisibility(true != recyclerView.canScrollVertically(1) ? 8 : 0);
    }
}
