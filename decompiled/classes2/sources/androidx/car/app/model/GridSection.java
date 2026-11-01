package androidx.car.app.model;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
@defpackage.ug
public final class GridSection extends androidx.car.app.model.Section {
    public static final int INCOMPLETE_LAST_ROW_AS_IS = 0;
    public static final int INCOMPLETE_LAST_ROW_TRUNCATE = 1;
    public static final int ITEM_IMAGE_SHAPE_CIRCLE = 2;
    public static final int ITEM_IMAGE_SHAPE_UNSET = 1;
    public static final int ITEM_SIZE_EXTRA_LARGE = 4;
    public static final int ITEM_SIZE_LARGE = 3;
    public static final int ITEM_SIZE_MEDIUM = 2;
    public static final int ITEM_SIZE_SMALL = 1;
    private final int mIncompleteLastRowStrategy;
    private final int mItemImageShape;
    private final int mItemSize;

    private GridSection(defpackage.wz wzVar) {
        super(wzVar);
        int i = wzVar.a;
        this.mItemSize = 0;
        int i2 = wzVar.b;
        this.mItemImageShape = 0;
        int i3 = wzVar.c;
        this.mIncompleteLastRowStrategy = 0;
    }

    @Override // androidx.car.app.model.Section
    public boolean equals(java.lang.Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj != this) {
            if (!(obj instanceof androidx.car.app.model.GridSection)) {
                return false;
            }
            androidx.car.app.model.GridSection gridSection = (androidx.car.app.model.GridSection) obj;
            if (!super.equals(gridSection) || this.mItemImageShape != gridSection.mItemImageShape || this.mItemSize != gridSection.mItemSize || this.mIncompleteLastRowStrategy != gridSection.mIncompleteLastRowStrategy) {
                return false;
            }
        }
        return true;
    }

    public int getIncompleteLastRowStrategy() {
        return this.mIncompleteLastRowStrategy;
    }

    public int getItemImageShape() {
        return this.mItemImageShape;
    }

    public int getItemSize() {
        return this.mItemSize;
    }

    @Override // androidx.car.app.model.Section
    public int hashCode() {
        return j$.util.Objects.hash(new java.lang.Object[]{java.lang.Integer.valueOf(super.hashCode()), java.lang.Integer.valueOf(this.mItemImageShape), java.lang.Integer.valueOf(this.mItemSize), java.lang.Integer.valueOf(this.mIncompleteLastRowStrategy)});
    }

    @Override // androidx.car.app.model.Section
    public java.lang.String toString() {
        return "GridSection { itemSize: " + this.mItemSize + ", itemImageShape: " + this.mItemImageShape + ", incompleteLastRowStrategy: " + this.mIncompleteLastRowStrategy + ", " + super.toString() + " }";
    }

    private GridSection() {
        this.mItemSize = 1;
        this.mItemImageShape = 1;
        this.mIncompleteLastRowStrategy = 1;
    }

    /* synthetic */ GridSection(defpackage.wz wzVar, defpackage.xa xaVar) {
        this(wzVar);
    }
}
