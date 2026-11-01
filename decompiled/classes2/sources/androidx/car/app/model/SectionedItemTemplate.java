package androidx.car.app.model;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
@defpackage.ug
public final class SectionedItemTemplate implements defpackage.ze {
    public static final int ALPHABETICAL_INDEXING_DISABLED = 0;
    public static final int ALPHABETICAL_INDEXING_TITLE_AS_IS = 1;
    public static final int ALPHABETICAL_INDEXING_TITLE_IGNORE_ARTICLES_AND_SYMBOLS = 2;
    public static final int SCROLL_STATE_PRESERVE_INDEX = 1;
    public static final int SCROLL_STATE_RESET_TO_TOP = 0;
    private final java.util.List mActions;
    private final int mAlphabeticalIndexingStrategy;
    private final androidx.car.app.model.Header mHeader;

    @java.lang.Deprecated
    private final boolean mIsAlphabeticalIndexingAllowed;
    private final boolean mIsLoading;
    private final int mScrollStatePersistenceStrategy;
    private final androidx.car.app.model.SearchHeader mSearchHeader;
    private final java.util.List mSections;

    private SectionedItemTemplate(defpackage.ys ysVar) {
        this.mSections = j$.util.DesugarCollections.unmodifiableList(ysVar.a);
        this.mActions = j$.util.DesugarCollections.unmodifiableList(ysVar.b);
        this.mHeader = ysVar.c;
        androidx.car.app.model.SearchHeader searchHeader = ysVar.d;
        this.mSearchHeader = null;
        this.mIsLoading = ysVar.e;
        this.mIsAlphabeticalIndexingAllowed = ysVar.f;
        int i = ysVar.g;
        this.mAlphabeticalIndexingStrategy = 0;
        int i2 = ysVar.h;
        this.mScrollStatePersistenceStrategy = 1;
    }

    public boolean equals(java.lang.Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj != this) {
            if (!(obj instanceof androidx.car.app.model.SectionedItemTemplate)) {
                return false;
            }
            androidx.car.app.model.SectionedItemTemplate sectionedItemTemplate = (androidx.car.app.model.SectionedItemTemplate) obj;
            if (!j$.util.Objects.equals(this.mSections, sectionedItemTemplate.mSections) || !j$.util.Objects.equals(this.mActions, sectionedItemTemplate.mActions) || !j$.util.Objects.equals(this.mHeader, sectionedItemTemplate.mHeader) || !j$.util.Objects.equals(this.mSearchHeader, sectionedItemTemplate.mSearchHeader) || this.mIsLoading != sectionedItemTemplate.mIsLoading || this.mIsAlphabeticalIndexingAllowed != sectionedItemTemplate.mIsAlphabeticalIndexingAllowed || this.mScrollStatePersistenceStrategy != sectionedItemTemplate.mScrollStatePersistenceStrategy) {
                return false;
            }
        }
        return true;
    }

    public java.util.List getActions() {
        return this.mActions;
    }

    public int getAlphabeticalIndexingStrategy() {
        int i = this.mAlphabeticalIndexingStrategy;
        if (i == 0) {
            return !this.mIsAlphabeticalIndexingAllowed ? 0 : 2;
        }
        return i;
    }

    public androidx.car.app.model.Header getHeader() {
        return this.mHeader;
    }

    public int getScrollStatePersistenceStrategy() {
        return this.mScrollStatePersistenceStrategy;
    }

    public androidx.car.app.model.SearchHeader getSearchHeader() {
        return this.mSearchHeader;
    }

    public java.util.List getSections() {
        return this.mSections;
    }

    public int hashCode() {
        return j$.util.Objects.hash(new java.lang.Object[]{this.mSections, this.mActions, this.mHeader, this.mSearchHeader, java.lang.Boolean.valueOf(this.mIsLoading), java.lang.Boolean.valueOf(this.mIsAlphabeticalIndexingAllowed), java.lang.Integer.valueOf(this.mScrollStatePersistenceStrategy)});
    }

    @java.lang.Deprecated
    public boolean isAlphabeticalIndexingAllowed() {
        return this.mIsAlphabeticalIndexingAllowed;
    }

    public boolean isLoading() {
        return this.mIsLoading;
    }

    public java.lang.String toString() {
        return "SectionedItemTemplate";
    }

    private SectionedItemTemplate() {
        this.mSections = java.util.Collections.EMPTY_LIST;
        this.mActions = java.util.Collections.EMPTY_LIST;
        this.mHeader = null;
        this.mSearchHeader = null;
        this.mIsLoading = false;
        this.mIsAlphabeticalIndexingAllowed = false;
        this.mAlphabeticalIndexingStrategy = 0;
        this.mScrollStatePersistenceStrategy = 1;
    }

    public /* synthetic */ SectionedItemTemplate(defpackage.ys ysVar, defpackage.yt ytVar) {
        this(ysVar);
    }
}
