package androidx.car.app.model;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
@defpackage.ug
public final class RowSection extends androidx.car.app.model.Section {
    private final int mInitialSelectedIndex;

    private RowSection(defpackage.yi yiVar) {
        super(yiVar);
        int i = yiVar.a;
        this.mInitialSelectedIndex = -1;
    }

    @Override // androidx.car.app.model.Section
    public boolean equals(java.lang.Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj != this) {
            if (!(obj instanceof androidx.car.app.model.RowSection)) {
                return false;
            }
            androidx.car.app.model.RowSection rowSection = (androidx.car.app.model.RowSection) obj;
            if (!super.equals(rowSection) || this.mInitialSelectedIndex != rowSection.mInitialSelectedIndex) {
                return false;
            }
        }
        return true;
    }

    public int getInitialSelectedIndex() {
        return this.mInitialSelectedIndex;
    }

    @Override // androidx.car.app.model.Section
    public int hashCode() {
        return j$.util.Objects.hash(new java.lang.Object[]{java.lang.Integer.valueOf(super.hashCode()), java.lang.Integer.valueOf(this.mInitialSelectedIndex)});
    }

    public boolean isSelectionGroup() {
        return this.mInitialSelectedIndex >= 0;
    }

    @Override // androidx.car.app.model.Section
    public java.lang.String toString() {
        return "RowSection { initialSelectedIndex: " + this.mInitialSelectedIndex + ", " + super.toString() + " }";
    }

    private RowSection() {
        this.mInitialSelectedIndex = -1;
    }

    public /* synthetic */ RowSection(defpackage.yi yiVar, defpackage.yj yjVar) {
        this(yiVar);
    }
}
