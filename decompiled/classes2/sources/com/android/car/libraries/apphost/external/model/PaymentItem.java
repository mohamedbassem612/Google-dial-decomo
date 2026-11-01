package com.android.car.libraries.apphost.external.model;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
@defpackage.ug
public final class PaymentItem implements defpackage.xh {
    private androidx.car.app.model.CarIcon image;
    private defpackage.xs onClickDelegate;
    private androidx.car.app.model.CarText subtitle;
    private androidx.car.app.model.CarText title;

    private PaymentItem(defpackage.hhj hhjVar) {
        this();
        androidx.car.app.model.CarText carText = hhjVar.a;
        if (carText == null) {
            aooh.j("title");
            carText = null;
        }
        this.title = carText;
        androidx.car.app.model.CarText carText2 = hhjVar.b;
        if (carText2 == null) {
            aooh.j("subtitle");
            carText2 = null;
        }
        this.subtitle = carText2;
        this.image = hhjVar.c;
        this.onClickDelegate = null;
    }

    public boolean equals(java.lang.Object obj) {
        if (obj instanceof com.android.car.libraries.apphost.external.model.PaymentItem) {
            com.android.car.libraries.apphost.external.model.PaymentItem paymentItem = (com.android.car.libraries.apphost.external.model.PaymentItem) obj;
            if (aooh.n(getTitle(), paymentItem.getTitle()) && aooh.n(getSubtitle(), paymentItem.getSubtitle()) && aooh.n(this.image, paymentItem.image) && aooh.n(this.onClickDelegate, paymentItem.onClickDelegate)) {
                return true;
            }
        }
        return false;
    }

    public final androidx.car.app.model.CarIcon getImage() {
        return this.image;
    }

    public final defpackage.xs getOnClickDelegate() {
        return this.onClickDelegate;
    }

    public final androidx.car.app.model.CarText getSubtitle() {
        androidx.car.app.model.CarText carText = this.subtitle;
        if (carText != null) {
            return carText;
        }
        aooh.j("subtitle");
        return null;
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
        return j$.util.Objects.hash(new java.lang.Object[]{getTitle(), getSubtitle(), this.image, this.onClickDelegate});
    }

    public final defpackage.hhj toBuilder() {
        defpackage.hhj hhjVar = new defpackage.hhj();
        androidx.car.app.model.CarText title = getTitle();
        aooh.f(title, "title");
        hhjVar.a = title;
        androidx.car.app.model.CarText subtitle = getSubtitle();
        aooh.f(subtitle, "subtitle");
        hhjVar.b = subtitle;
        androidx.car.app.model.CarIcon carIcon = this.image;
        if (carIcon != null) {
            hhjVar.c = carIcon;
        }
        return hhjVar;
    }

    public java.lang.String toString() {
        return "PaymentItem() - [title: " + androidx.car.app.model.CarText.toShortString(getTitle()) + ", subtitle: " + androidx.car.app.model.CarText.toShortString(getSubtitle()) + ", image: " + this.image + ']';
    }

    public /* synthetic */ PaymentItem(defpackage.hhj hhjVar, aooc aoocVar) {
        this(hhjVar);
    }

    private PaymentItem() {
    }
}
