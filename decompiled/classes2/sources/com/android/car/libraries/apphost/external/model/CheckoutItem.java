package com.android.car.libraries.apphost.external.model;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
@defpackage.ug
public final class CheckoutItem implements defpackage.xh {
    private androidx.car.app.model.CarIcon image;
    private int initialValue;
    private int minValue;
    private defpackage.xe onValueChangeListener;
    private androidx.car.app.model.CarText subtitle;
    private androidx.car.app.model.CarText title;

    private CheckoutItem(defpackage.hgr hgrVar) {
        this();
        androidx.car.app.model.CarText carText = hgrVar.a;
        if (carText == null) {
            aooh.j("title");
            carText = null;
        }
        this.title = carText;
        this.subtitle = hgrVar.b;
        this.image = hgrVar.c;
        this.initialValue = hgrVar.d;
        this.minValue = hgrVar.e;
        this.onValueChangeListener = hgrVar.f;
    }

    public boolean equals(java.lang.Object obj) {
        if (obj instanceof com.android.car.libraries.apphost.external.model.CheckoutItem) {
            com.android.car.libraries.apphost.external.model.CheckoutItem checkoutItem = (com.android.car.libraries.apphost.external.model.CheckoutItem) obj;
            if (aooh.n(getTitle(), checkoutItem.getTitle()) && this.subtitle == checkoutItem.subtitle && aooh.n(this.image, checkoutItem.image) && this.initialValue == checkoutItem.initialValue && this.minValue == checkoutItem.minValue && aooh.n(this.onValueChangeListener, checkoutItem.onValueChangeListener)) {
                return true;
            }
        }
        return false;
    }

    public final androidx.car.app.model.CarIcon getImage() {
        return this.image;
    }

    public final int getInitialValue() {
        return this.initialValue;
    }

    public final int getMinValue() {
        return this.minValue;
    }

    public final defpackage.xe getOnValueChangeListener() {
        return this.onValueChangeListener;
    }

    public final androidx.car.app.model.CarText getSubtitle() {
        return this.subtitle;
    }

    public final androidx.car.app.model.CarText getTitle() {
        androidx.car.app.model.CarText carText = this.title;
        if (carText != null) {
            return carText;
        }
        aooh.j("title");
        return null;
    }

    public int hashCode() {
        return j$.util.Objects.hash(new java.lang.Object[]{getTitle(), this.subtitle, this.image, java.lang.Integer.valueOf(this.initialValue), java.lang.Integer.valueOf(this.minValue), this.onValueChangeListener});
    }

    public final defpackage.hgr toBuilder() {
        defpackage.hgr hgrVar = new defpackage.hgr();
        androidx.car.app.model.CarText title = getTitle();
        aooh.f(title, "title");
        hgrVar.a = title;
        androidx.car.app.model.CarText carText = this.subtitle;
        if (carText != null) {
            hgrVar.b = carText;
        }
        androidx.car.app.model.CarIcon carIcon = this.image;
        if (carIcon != null) {
            hgrVar.c = carIcon;
        }
        hgrVar.d = this.initialValue;
        hgrVar.e = this.minValue;
        hgrVar.f = this.onValueChangeListener;
        return hgrVar;
    }

    public java.lang.String toString() {
        return "CheckoutItem() - [title:  " + androidx.car.app.model.CarText.toShortString(getTitle()) + ", subtitle: " + androidx.car.app.model.CarText.toShortString(this.subtitle) + ", image: " + this.image + ", initialValue: " + this.initialValue + ", minValue: " + this.minValue + ", onValueChangeListener: " + this.onValueChangeListener + ']';
    }

    public /* synthetic */ CheckoutItem(defpackage.hgr hgrVar, aooc aoocVar) {
        this(hgrVar);
    }

    private CheckoutItem() {
    }
}
