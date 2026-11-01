package com.android.car.libraries.apphost.external.model;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
@defpackage.ug
public class MediaPlaybackTemplate implements defpackage.ze {
    private final androidx.car.app.model.ActionStrip actionStrip;
    private final boolean hasInternalAttributionIcon;
    private final androidx.car.app.model.Header header;
    private final android.content.ComponentName playbackComponentName;
    private final androidx.car.app.media.model.MediaPlaybackStyle style;

    private MediaPlaybackTemplate(defpackage.hhd hhdVar) {
        androidx.car.app.model.ActionStrip actionStrip = hhdVar.a;
        this.actionStrip = null;
        androidx.car.app.model.Header header = hhdVar.b;
        this.header = null;
        android.content.ComponentName componentName = hhdVar.c;
        this.playbackComponentName = null;
        boolean z = hhdVar.d;
        this.hasInternalAttributionIcon = false;
        androidx.car.app.media.model.MediaPlaybackStyle mediaPlaybackStyle = hhdVar.e;
        this.style = null;
    }

    public androidx.car.app.model.ActionStrip getActionStrip() {
        return this.actionStrip;
    }

    public androidx.car.app.model.Header getHeader() {
        return this.header;
    }

    public android.content.ComponentName getPlaybackComponentName() {
        return this.playbackComponentName;
    }

    public androidx.car.app.media.model.MediaPlaybackStyle getStyle() {
        return this.style;
    }

    public boolean hasInternalAttributionIcon() {
        return this.hasInternalAttributionIcon;
    }

    /* synthetic */ MediaPlaybackTemplate(defpackage.hhd hhdVar, defpackage.hhe hheVar) {
        this(hhdVar);
    }

    private MediaPlaybackTemplate() {
        this.actionStrip = null;
        this.header = null;
        this.playbackComponentName = null;
        this.hasInternalAttributionIcon = false;
        this.style = null;
    }
}
