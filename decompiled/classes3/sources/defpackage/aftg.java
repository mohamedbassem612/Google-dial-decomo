package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class aftg extends defpackage.afst {
    final /* synthetic */ com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aftg(com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton extendedFloatingActionButton, defpackage.amdx amdxVar) {
        super(extendedFloatingActionButton, amdxVar);
        j$.util.Objects.requireNonNull(extendedFloatingActionButton);
        this.b = extendedFloatingActionButton;
    }

    @Override // defpackage.afst, defpackage.afto
    public final void f() {
        super.f();
        this.b.t = 0;
    }

    @Override // defpackage.afst, defpackage.afto
    public final void g(android.animation.Animator animator) {
        super.g(animator);
        com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton extendedFloatingActionButton = this.b;
        extendedFloatingActionButton.setVisibility(0);
        extendedFloatingActionButton.t = 2;
    }

    @Override // defpackage.afto
    public final int h() {
        return 2130837551;
    }

    @Override // defpackage.afto
    public final void i() {
        com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton extendedFloatingActionButton = this.b;
        extendedFloatingActionButton.setVisibility(0);
        extendedFloatingActionButton.setAlpha(1.0f);
        extendedFloatingActionButton.setScaleY(1.0f);
        extendedFloatingActionButton.setScaleX(1.0f);
    }

    @Override // defpackage.afto
    public final boolean j() {
        return this.b.D();
    }

    @Override // defpackage.afto
    public final void k() {
    }
}
