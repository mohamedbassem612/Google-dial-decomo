package androidx.car.app.model;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
@defpackage.ug
public final class Chip implements defpackage.xh {
    private final androidx.car.app.model.CarIcon mEndIcon;
    private final boolean mIsSelected;
    private final defpackage.xs mOnClickDelegate;
    private final androidx.car.app.model.CarIcon mStartIcon;
    private final androidx.car.app.model.ChipStyle mStyle;
    private final androidx.car.app.model.CarText mTitle;

    Chip(wp wpVar) {
        java.lang.Object obj = wpVar.b;
        this.mTitle = null;
        java.lang.Object obj2 = wpVar.c;
        this.mStartIcon = null;
        java.lang.Object obj3 = wpVar.d;
        this.mEndIcon = null;
        boolean z = wpVar.a;
        this.mIsSelected = false;
        java.lang.Object obj4 = wpVar.e;
        this.mOnClickDelegate = null;
        java.lang.Object obj5 = wpVar.f;
        this.mStyle = null;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof androidx.car.app.model.Chip) {
            androidx.car.app.model.Chip chip = (androidx.car.app.model.Chip) obj;
            if (j$.util.Objects.equals(this.mTitle, chip.mTitle) && j$.util.Objects.equals(this.mStartIcon, chip.mStartIcon) && j$.util.Objects.equals(this.mEndIcon, chip.mEndIcon) && this.mIsSelected == chip.mIsSelected) {
                if (j$.util.Objects.equals(java.lang.Boolean.valueOf(this.mOnClickDelegate == null), java.lang.Boolean.valueOf(chip.mOnClickDelegate == null)) && j$.util.Objects.equals(this.mStyle, chip.mStyle)) {
                    return true;
                }
            }
        }
        return false;
    }

    public androidx.car.app.model.CarIcon getEndIcon() {
        return this.mEndIcon;
    }

    public defpackage.xs getOnClickDelegate() {
        return this.mOnClickDelegate;
    }

    public androidx.car.app.model.CarIcon getStartIcon() {
        return this.mStartIcon;
    }

    public androidx.car.app.model.ChipStyle getStyle() {
        return this.mStyle;
    }

    public androidx.car.app.model.CarText getTitle() {
        return this.mTitle;
    }

    public int hashCode() {
        return j$.util.Objects.hash(new java.lang.Object[]{this.mTitle, this.mStartIcon, this.mEndIcon, java.lang.Boolean.valueOf(this.mIsSelected), java.lang.Boolean.valueOf(this.mOnClickDelegate == null), this.mStyle});
    }

    public boolean isSelected() {
        return this.mIsSelected;
    }

    public java.lang.String toString() {
        return "Chip{title=" + this.mTitle + ", startIcon=" + this.mStartIcon + ", endIcon=" + this.mEndIcon + ", isSelected=" + this.mIsSelected + ", onClickDelegate=" + this.mOnClickDelegate + ", style=" + this.mStyle + '}';
    }

    private Chip() {
        this.mTitle = null;
        this.mStartIcon = null;
        this.mEndIcon = null;
        this.mIsSelected = false;
        this.mOnClickDelegate = null;
        this.mStyle = null;
    }
}
