package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class bzy extends android.graphics.drawable.RippleDrawable {
    public cqg a;
    private final boolean b;
    private boolean c;

    public bzy(boolean z) {
        super(android.content.res.ColorStateList.valueOf(-16777216), null, z ? new android.graphics.drawable.ColorDrawable(-1) : null);
        this.b = z;
    }

    @Override // android.graphics.drawable.RippleDrawable, android.graphics.drawable.Drawable
    public final android.graphics.Rect getDirtyBounds() {
        if (!this.b) {
            this.c = true;
        }
        android.graphics.Rect dirtyBounds = super.getDirtyBounds();
        this.c = false;
        return dirtyBounds;
    }

    @Override // android.graphics.drawable.RippleDrawable, android.graphics.drawable.LayerDrawable, android.graphics.drawable.Drawable
    public final boolean isProjected() {
        return this.c;
    }
}
