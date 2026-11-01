package com.android.car.libraries.apphost.external.model;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
@defpackage.ug
@java.lang.Deprecated
public final class GridWrapperTemplate implements defpackage.ze {
    private final androidx.car.app.model.CarIcon backgroundImage;
    private final androidx.car.app.model.GridTemplate gridTemplate;
    private final boolean isLauncher;

    private GridWrapperTemplate(defpackage.hgy hgyVar) {
        androidx.car.app.model.GridTemplate gridTemplate = hgyVar.a;
        this.gridTemplate = null;
        androidx.car.app.model.CarIcon carIcon = hgyVar.b;
        this.backgroundImage = null;
        boolean z = hgyVar.c;
        this.isLauncher = false;
    }

    public androidx.car.app.model.CarIcon getBackgroundImage() {
        return this.backgroundImage;
    }

    public androidx.car.app.model.GridTemplate getTemplate() {
        return (androidx.car.app.model.GridTemplate) j$.util.Objects.requireNonNull(this.gridTemplate);
    }

    public boolean isLauncher() {
        return this.isLauncher;
    }

    /* synthetic */ GridWrapperTemplate(defpackage.hgy hgyVar, defpackage.hgz hgzVar) {
        this(hgyVar);
    }

    private GridWrapperTemplate() {
        this.gridTemplate = null;
        this.backgroundImage = null;
        this.isLauncher = false;
    }
}
