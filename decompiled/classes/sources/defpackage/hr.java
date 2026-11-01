package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes.dex */
public class hr extends android.widget.ImageButton {
    private final defpackage.hi a;
    private boolean b;
    private final defpackage.aaaj c;

    public hr(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.b = false;
        defpackage.lo.d(this, getContext());
        defpackage.hi hiVar = new defpackage.hi(this);
        this.a = hiVar;
        hiVar.b(attributeSet, i);
        defpackage.aaaj aaajVar = new defpackage.aaaj(this);
        this.c = aaajVar;
        aaajVar.l(attributeSet, i);
    }

    @Override // android.widget.ImageView, android.view.View
    protected final void drawableStateChanged() {
        super.drawableStateChanged();
        defpackage.hi hiVar = this.a;
        if (hiVar != null) {
            hiVar.a();
        }
        defpackage.aaaj aaajVar = this.c;
        if (aaajVar != null) {
            aaajVar.k();
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public final boolean hasOverlappingRendering() {
        return this.c.o() && super.hasOverlappingRendering();
    }

    @Override // android.view.View
    public final void setBackgroundDrawable(android.graphics.drawable.Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        defpackage.hi hiVar = this.a;
        if (hiVar != null) {
            hiVar.e();
        }
    }

    @Override // android.view.View
    public final void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        defpackage.hi hiVar = this.a;
        if (hiVar != null) {
            hiVar.c(i);
        }
    }

    @Override // android.widget.ImageView
    public final void setImageBitmap(android.graphics.Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        defpackage.aaaj aaajVar = this.c;
        if (aaajVar != null) {
            aaajVar.k();
        }
    }

    @Override // android.widget.ImageView
    public final void setImageDrawable(android.graphics.drawable.Drawable drawable) {
        defpackage.aaaj aaajVar = this.c;
        if (aaajVar != null && drawable != null && !this.b) {
            aaajVar.m(drawable);
        }
        super.setImageDrawable(drawable);
        if (aaajVar != null) {
            aaajVar.k();
            if (this.b) {
                return;
            }
            aaajVar.j();
        }
    }

    @Override // android.widget.ImageView
    public final void setImageLevel(int i) {
        super.setImageLevel(i);
        this.b = true;
    }

    @Override // android.widget.ImageView
    public final void setImageResource(int i) {
        this.c.n(i);
    }

    @Override // android.widget.ImageView
    public final void setImageURI(android.net.Uri uri) {
        super.setImageURI(uri);
        defpackage.aaaj aaajVar = this.c;
        if (aaajVar != null) {
            aaajVar.k();
        }
    }

    public hr(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 2130969573);
    }

    public hr(android.content.Context context) {
        this(context, null);
    }
}
