package androidx.car.app.media.model;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
@defpackage.ug
public final class MediaPlaybackStyle {
    private final androidx.car.app.model.CarColor mMediaAccentColor;
    private final int mProgressBarStrokeCap;

    private MediaPlaybackStyle(vm vmVar) {
        java.lang.Object obj = vmVar.b;
        this.mMediaAccentColor = null;
        int i = vmVar.a;
        this.mProgressBarStrokeCap = 0;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof androidx.car.app.media.model.MediaPlaybackStyle) {
            androidx.car.app.media.model.MediaPlaybackStyle mediaPlaybackStyle = (androidx.car.app.media.model.MediaPlaybackStyle) obj;
            if (j$.util.Objects.equals(this.mMediaAccentColor, mediaPlaybackStyle.mMediaAccentColor) && this.mProgressBarStrokeCap == mediaPlaybackStyle.mProgressBarStrokeCap) {
                return true;
            }
        }
        return false;
    }

    public androidx.car.app.model.CarColor getMediaAccentColor() {
        return this.mMediaAccentColor;
    }

    public int getProgressBarStrokeCap() {
        return this.mProgressBarStrokeCap;
    }

    public int hashCode() {
        return j$.util.Objects.hash(new java.lang.Object[]{this.mMediaAccentColor, java.lang.Integer.valueOf(this.mProgressBarStrokeCap)});
    }

    public java.lang.String toString() {
        return "MediaPlaybackStyle{mediaAccentColor=" + this.mMediaAccentColor + ", progressBarStrokeCap=" + this.mProgressBarStrokeCap + '}';
    }

    /* synthetic */ MediaPlaybackStyle(vm vmVar, vn vnVar) {
        this(vmVar);
    }

    private MediaPlaybackStyle() {
        this.mMediaAccentColor = null;
        this.mProgressBarStrokeCap = 0;
    }
}
