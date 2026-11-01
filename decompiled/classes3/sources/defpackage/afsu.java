package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
final class afsu extends android.graphics.drawable.Drawable.ConstantState {
    final /* synthetic */ defpackage.afsv a;

    public afsu(defpackage.afsv afsvVar) {
        j$.util.Objects.requireNonNull(afsvVar);
        this.a = afsvVar;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final android.graphics.drawable.Drawable newDrawable() {
        return this.a;
    }
}
