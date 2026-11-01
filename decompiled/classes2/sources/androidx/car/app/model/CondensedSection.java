package androidx.car.app.model;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
@defpackage.ug
public final class CondensedSection extends androidx.car.app.model.Section {
    public static final int INCOMPLETE_LAST_ROW_AS_IS = 0;
    public static final int INCOMPLETE_LAST_ROW_TRUNCATE = 1;
    private final int mIncompleteLastRowStrategy;

    private CondensedSection(defpackage.ww wwVar) {
        super(wwVar);
        int i = wwVar.a;
        this.mIncompleteLastRowStrategy = 0;
    }

    @Override // androidx.car.app.model.Section
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof androidx.car.app.model.CondensedSection) {
            androidx.car.app.model.CondensedSection condensedSection = (androidx.car.app.model.CondensedSection) obj;
            if (super.equals(obj) && this.mIncompleteLastRowStrategy == condensedSection.mIncompleteLastRowStrategy) {
                return true;
            }
        }
        return false;
    }

    public int getIncompleteLastRowStrategy() {
        return this.mIncompleteLastRowStrategy;
    }

    @Override // androidx.car.app.model.Section
    public int hashCode() {
        return j$.util.Objects.hash(new java.lang.Object[]{java.lang.Integer.valueOf(super.hashCode()), java.lang.Integer.valueOf(this.mIncompleteLastRowStrategy)});
    }

    @Override // androidx.car.app.model.Section
    public java.lang.String toString() {
        return "CondensedSection { incompleteLastRowStrategy: " + this.mIncompleteLastRowStrategy + ", " + super.toString() + " }";
    }

    private CondensedSection() {
        this.mIncompleteLastRowStrategy = 0;
    }

    /* synthetic */ CondensedSection(defpackage.ww wwVar, defpackage.wx wxVar) {
        this(wwVar);
    }
}
