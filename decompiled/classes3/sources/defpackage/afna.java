package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes3.dex */
public final class afna extends defpackage.yew {
    final /* synthetic */ com.google.android.libraries.user.profile.photopicker.common.view.SquareImageView a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public afna(com.google.android.libraries.user.profile.photopicker.common.view.SquareImageView squareImageView, com.google.android.libraries.user.profile.photopicker.common.view.SquareImageView squareImageView2) {
        super(squareImageView2);
        j$.util.Objects.requireNonNull(squareImageView);
        this.a = squareImageView;
    }

    @Override // defpackage.yfa
    public final void a(android.graphics.drawable.Drawable drawable) {
        this.a.a();
    }

    @Override // defpackage.yew
    protected final void b(android.graphics.drawable.Drawable drawable) {
        this.a.a();
    }

    @Override // defpackage.yfa
    public final /* bridge */ /* synthetic */ void c(java.lang.Object obj, defpackage.yfi yfiVar) {
        com.google.android.libraries.user.profile.photopicker.common.view.SquareImageView squareImageView = this.a;
        squareImageView.a = (android.graphics.Bitmap) obj;
        squareImageView.b();
    }
}
