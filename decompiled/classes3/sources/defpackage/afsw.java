package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class afsw implements defpackage.afth {
    private final /* synthetic */ int $cid;
    final /* synthetic */ com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton a;

    public afsw(com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton extendedFloatingActionButton, int i, byte[] bArr) {
        this.$cid = i;
        j$.util.Objects.requireNonNull(extendedFloatingActionButton);
        this.a = extendedFloatingActionButton;
    }

    @Override // defpackage.afth
    public final int a() {
        int i = this.$cid;
        com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton extendedFloatingActionButton = this.a;
        return i != 0 ? extendedFloatingActionButton.z() : extendedFloatingActionButton.getMeasuredHeight();
    }

    @Override // defpackage.afth
    public final int b() {
        int i = this.$cid;
        com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton extendedFloatingActionButton = this.a;
        return i != 0 ? extendedFloatingActionButton.y() : extendedFloatingActionButton.v;
    }

    @Override // defpackage.afth
    public final int c() {
        int i = this.$cid;
        com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton extendedFloatingActionButton = this.a;
        return i != 0 ? extendedFloatingActionButton.y() : extendedFloatingActionButton.u;
    }

    @Override // defpackage.afth
    public final int d() {
        int i = this.$cid;
        com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton extendedFloatingActionButton = this.a;
        if (i != 0) {
            return extendedFloatingActionButton.z();
        }
        return extendedFloatingActionButton.v + ((extendedFloatingActionButton.getMeasuredWidth() - extendedFloatingActionButton.getPaddingStart()) - extendedFloatingActionButton.getPaddingEnd()) + extendedFloatingActionButton.u;
    }

    @Override // defpackage.afth
    public final android.view.ViewGroup.LayoutParams e() {
        return this.$cid != 0 ? new android.view.ViewGroup.LayoutParams(d(), a()) : new android.view.ViewGroup.LayoutParams(-2, -2);
    }

    public afsw(com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton extendedFloatingActionButton, int i) {
        this.$cid = i;
        j$.util.Objects.requireNonNull(extendedFloatingActionButton);
        this.a = extendedFloatingActionButton;
    }
}
