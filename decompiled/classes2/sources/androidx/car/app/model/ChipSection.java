package androidx.car.app.model;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
@defpackage.ug
public final class ChipSection extends androidx.car.app.model.Section {
    private final androidx.car.app.model.ChipStyle mStyle;

    ChipSection(defpackage.wq wqVar) {
        super(wqVar);
        androidx.car.app.model.ChipStyle chipStyle = wqVar.a;
        this.mStyle = null;
    }

    @Override // androidx.car.app.model.Section
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof androidx.car.app.model.ChipSection) {
            androidx.car.app.model.ChipSection chipSection = (androidx.car.app.model.ChipSection) obj;
            if (super.equals(chipSection) && j$.util.Objects.equals(this.mStyle, chipSection.mStyle)) {
                return true;
            }
        }
        return false;
    }

    public androidx.car.app.model.ChipStyle getStyle() {
        return this.mStyle;
    }

    @Override // androidx.car.app.model.Section
    public int hashCode() {
        return j$.util.Objects.hash(new java.lang.Object[]{java.lang.Integer.valueOf(super.hashCode()), this.mStyle});
    }

    @Override // androidx.car.app.model.Section
    public java.lang.String toString() {
        return "ChipSection{items=" + getItemsDelegate() + ", title=" + getTitle() + ", style=" + this.mStyle + '}';
    }

    private ChipSection() {
        this.mStyle = null;
    }
}
