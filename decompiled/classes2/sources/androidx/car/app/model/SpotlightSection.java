package androidx.car.app.model;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
@defpackage.ug
public final class SpotlightSection extends androidx.car.app.model.Section {
    public static final int INCOMPLETE_LAST_COLUMN_AS_IS = 0;
    public static final int INCOMPLETE_LAST_COLUMN_TRUNCATE = 1;
    private final androidx.car.app.model.CarIcon mImage;
    private final int mIncompleteLastColumnStrategy;

    private SpotlightSection(defpackage.yu yuVar) {
        super(yuVar);
        androidx.car.app.model.CarIcon carIcon = yuVar.a;
        this.mImage = null;
        int i = yuVar.b;
        this.mIncompleteLastColumnStrategy = 0;
    }

    @Override // androidx.car.app.model.Section
    public boolean equals(java.lang.Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj != this) {
            if (!(obj instanceof androidx.car.app.model.SpotlightSection)) {
                return false;
            }
            androidx.car.app.model.SpotlightSection spotlightSection = (androidx.car.app.model.SpotlightSection) obj;
            if (!super.equals(spotlightSection) || !j$.util.Objects.equals(this.mImage, spotlightSection.mImage) || this.mIncompleteLastColumnStrategy != spotlightSection.mIncompleteLastColumnStrategy) {
                return false;
            }
        }
        return true;
    }

    public androidx.car.app.model.CarIcon getImage() {
        return (androidx.car.app.model.CarIcon) j$.util.Objects.requireNonNull(this.mImage);
    }

    public int getIncompleteLastColumnStrategy() {
        return this.mIncompleteLastColumnStrategy;
    }

    @Override // androidx.car.app.model.Section
    public int hashCode() {
        return j$.util.Objects.hash(new java.lang.Object[]{java.lang.Integer.valueOf(super.hashCode()), this.mImage, java.lang.Integer.valueOf(this.mIncompleteLastColumnStrategy)});
    }

    @Override // androidx.car.app.model.Section
    public java.lang.String toString() {
        return "SpotlightSection { image: " + this.mImage + ", , incompleteLastColumn: " + this.mIncompleteLastColumnStrategy + super.toString() + " }";
    }

    private SpotlightSection() {
        this.mImage = null;
        this.mIncompleteLastColumnStrategy = 1;
    }

    /* synthetic */ SpotlightSection(defpackage.yu yuVar, defpackage.yv yvVar) {
        this(yuVar);
    }
}
