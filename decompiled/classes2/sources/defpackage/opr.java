package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
public final class opr extends yev {
    final /* synthetic */ dsd a;
    final /* synthetic */ ops b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public opr(ops opsVar, dsd dsdVar) {
        super(1200, 1200);
        this.a = dsdVar;
        j$.util.Objects.requireNonNull(opsVar);
        this.b = opsVar;
    }

    public final void a(android.graphics.drawable.Drawable drawable) {
        ops.a.b().l("com/android/dialer/glidephotomanager/impl/GlidePhotoManagerImpl$2", "onLoadFailed", 366, "GlidePhotoManagerImpl.java").v("onLoadFailed");
        dsd dsdVar = this.a;
        dsdVar.b(j$.util.Optional.empty());
        this.b.f.remove(dsdVar);
    }

    public final /* bridge */ /* synthetic */ void c(java.lang.Object obj, yfi yfiVar) {
        try {
            this.a.b(j$.util.Optional.ofNullable(uxx.a((android.graphics.drawable.Drawable) obj, 1200, 1200)));
        } catch (java.lang.Throwable th) {
            try {
                ops.a.b().k(th).l("com/android/dialer/glidephotomanager/impl/GlidePhotoManagerImpl$2", "onResourceReady", 339, "GlidePhotoManagerImpl.java").v("Failed to convert drawable to bitmap");
                if (((java.lang.Boolean) this.b.d.a()).booleanValue()) {
                    this.a.d(th);
                }
            } finally {
                ops opsVar = this.b;
                opsVar.f.remove(this.a);
            }
        }
    }

    public final void ei(android.graphics.drawable.Drawable drawable) {
        try {
            this.a.b(j$.util.Optional.ofNullable(uxx.a(drawable, 1200, 1200)));
        } catch (java.lang.Throwable th) {
            try {
                ops.a.b().k(th).l("com/android/dialer/glidephotomanager/impl/GlidePhotoManagerImpl$2", "onLoadCleared", 355, "GlidePhotoManagerImpl.java").v("Failed to convert drawable to bitmap");
                if (((java.lang.Boolean) this.b.d.a()).booleanValue()) {
                    this.a.d(th);
                }
            } finally {
                ops opsVar = this.b;
                opsVar.f.remove(this.a);
            }
        }
    }
}
