package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
final class opq extends yev {
    final /* synthetic */ dsd a;
    final /* synthetic */ int b;
    final /* synthetic */ int c;
    final /* synthetic */ ops d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public opq(ops opsVar, int i, int i2, dsd dsdVar, int i3, int i4) {
        super(i, i2);
        this.a = dsdVar;
        this.b = i3;
        this.c = i4;
        j$.util.Objects.requireNonNull(opsVar);
        this.d = opsVar;
    }

    public final void a(android.graphics.drawable.Drawable drawable) {
        try {
            this.a.b(j$.util.Optional.ofNullable(uxx.a(drawable, this.b, this.c)));
        } catch (java.lang.Throwable th) {
            try {
                ops.a.b().k(th).l("com/android/dialer/glidephotomanager/impl/GlidePhotoManagerImpl$1", "onLoadFailed", 296, "GlidePhotoManagerImpl.java").v("Failed to convert drawable to bitmap");
                if (((java.lang.Boolean) this.d.d.a()).booleanValue()) {
                    this.a.d(th);
                }
            } finally {
                ops opsVar = this.d;
                opsVar.f.remove(this.a);
            }
        }
    }

    public final /* bridge */ /* synthetic */ void c(java.lang.Object obj, yfi yfiVar) {
        try {
            this.a.b(j$.util.Optional.ofNullable(uxx.a((android.graphics.drawable.Drawable) obj, this.b, this.c)));
        } catch (java.lang.Throwable th) {
            try {
                ops.a.b().k(th).l("com/android/dialer/glidephotomanager/impl/GlidePhotoManagerImpl$1", "onResourceReady", 264, "GlidePhotoManagerImpl.java").v("Failed to convert drawable to bitmap");
                if (((java.lang.Boolean) this.d.d.a()).booleanValue()) {
                    this.a.d(th);
                }
            } finally {
                ops opsVar = this.d;
                opsVar.f.remove(this.a);
            }
        }
    }

    public final void ei(android.graphics.drawable.Drawable drawable) {
        try {
            this.a.b(j$.util.Optional.ofNullable(uxx.a(drawable, this.b, this.c)));
        } catch (java.lang.Throwable th) {
            try {
                ops.a.b().k(th).l("com/android/dialer/glidephotomanager/impl/GlidePhotoManagerImpl$1", "onLoadCleared", 280, "GlidePhotoManagerImpl.java").v("Failed to convert drawable to bitmap");
                if (((java.lang.Boolean) this.d.d.a()).booleanValue()) {
                    this.a.d(th);
                }
            } finally {
                ops opsVar = this.d;
                opsVar.f.remove(this.a);
            }
        }
    }
}
