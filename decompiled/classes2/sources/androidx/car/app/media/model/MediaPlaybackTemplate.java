package androidx.car.app.media.model;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
@defpackage.ug
public class MediaPlaybackTemplate implements defpackage.ze {
    private final androidx.car.app.model.Banner mBanner;
    private final androidx.car.app.model.Header mHeader;
    private final androidx.car.app.media.model.MediaPlaybackStyle mStyle;

    MediaPlaybackTemplate(defpackage.vo voVar) {
        androidx.car.app.model.Header header = voVar.a;
        this.mHeader = null;
        androidx.car.app.model.Banner banner = voVar.b;
        this.mBanner = null;
        androidx.car.app.media.model.MediaPlaybackStyle mediaPlaybackStyle = voVar.c;
        this.mStyle = null;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof androidx.car.app.media.model.MediaPlaybackTemplate) {
            androidx.car.app.media.model.MediaPlaybackTemplate mediaPlaybackTemplate = (androidx.car.app.media.model.MediaPlaybackTemplate) obj;
            if (j$.util.Objects.equals(this.mHeader, mediaPlaybackTemplate.mHeader) && j$.util.Objects.equals(this.mBanner, mediaPlaybackTemplate.mBanner) && j$.util.Objects.equals(this.mStyle, mediaPlaybackTemplate.mStyle)) {
                return true;
            }
        }
        return false;
    }

    public androidx.car.app.model.Banner getBanner() {
        return this.mBanner;
    }

    public androidx.car.app.model.Header getHeader() {
        return this.mHeader;
    }

    public androidx.car.app.media.model.MediaPlaybackStyle getStyle() {
        return this.mStyle;
    }

    public int hashCode() {
        return j$.util.Objects.hash(new java.lang.Object[]{this.mHeader, this.mBanner, this.mStyle});
    }

    public java.lang.String toString() {
        return "MediaPlaybackTemplate";
    }

    private MediaPlaybackTemplate() {
        this.mHeader = null;
        this.mBanner = null;
        this.mStyle = null;
    }
}
