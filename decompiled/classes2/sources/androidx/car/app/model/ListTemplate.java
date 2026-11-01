package androidx.car.app.model;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
@defpackage.ug
public final class ListTemplate implements defpackage.ze {
    static final int MAX_ALLOWED_ITEMS = 100;
    static final int MAX_MESSAGES_PER_CONVERSATION = 10;

    @java.lang.Deprecated
    private final androidx.car.app.model.ActionStrip mActionStrip;
    private final java.util.List mActions;
    private final androidx.car.app.model.Header mHeader;

    @java.lang.Deprecated
    private final androidx.car.app.model.Action mHeaderAction;
    private final boolean mIsLoading;
    private final java.util.List mSectionedLists;
    private final androidx.car.app.model.ItemList mSingleList;

    @java.lang.Deprecated
    private final androidx.car.app.model.CarText mTitle;

    public ListTemplate(defpackage.xl xlVar) {
        this.mIsLoading = xlVar.a;
        this.mTitle = xlVar.d;
        this.mHeaderAction = xlVar.e;
        this.mSingleList = xlVar.b;
        this.mSectionedLists = defpackage.rv.d(xlVar.c);
        this.mActionStrip = xlVar.f;
        this.mActions = defpackage.rv.d(xlVar.g);
        this.mHeader = xlVar.h;
    }

    public static java.util.List getTruncatedCopy(java.util.List list) {
        xm xmVar = new xm();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            androidx.car.app.model.SectionedItemList sectionedItemList = (androidx.car.app.model.SectionedItemList) it.next();
            arrayList.add(androidx.car.app.model.SectionedItemList.create(truncate(sectionedItemList.getItemList(), xmVar), sectionedItemList.getHeader().toCharSequence()));
            if (xmVar.a <= 0) {
                break;
            }
        }
        return arrayList;
    }

    public static androidx.car.app.model.ItemList truncate(androidx.car.app.model.ItemList itemList, xm xmVar) {
        defpackage.xi xiVar = new defpackage.xi(itemList);
        xiVar.a.clear();
        for (defpackage.xh xhVar : itemList.getItems()) {
            if (!(xhVar instanceof androidx.car.app.messaging.model.ConversationItem)) {
                if (!xmVar.b(1)) {
                    break;
                }
                xiVar.b(xhVar);
                xmVar.a();
            } else {
                androidx.car.app.messaging.model.ConversationItem conversationItem = (androidx.car.app.messaging.model.ConversationItem) xhVar;
                if (!xmVar.b(2)) {
                    break;
                }
                defpackage.vv vvVar = new defpackage.vv(conversationItem);
                int iMin = java.lang.Math.min(xmVar.a(), 10);
                int size = conversationItem.getMessages().size();
                int iMin2 = java.lang.Math.min(size, iMin);
                vvVar.f = conversationItem.getMessages().subList(size - iMin2, size);
                xiVar.b(new androidx.car.app.messaging.model.ConversationItem(vvVar));
                xmVar.a -= iMin2;
            }
        }
        return xiVar.a();
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof androidx.car.app.model.ListTemplate) {
            androidx.car.app.model.ListTemplate listTemplate = (androidx.car.app.model.ListTemplate) obj;
            if (this.mIsLoading == listTemplate.mIsLoading && j$.util.Objects.equals(this.mTitle, listTemplate.mTitle) && j$.util.Objects.equals(this.mHeaderAction, listTemplate.mHeaderAction) && j$.util.Objects.equals(this.mSingleList, listTemplate.mSingleList) && j$.util.Objects.equals(this.mSectionedLists, listTemplate.mSectionedLists) && j$.util.Objects.equals(this.mActionStrip, listTemplate.mActionStrip) && j$.util.Objects.equals(this.mActions, listTemplate.mActions) && j$.util.Objects.equals(this.mHeader, listTemplate.mHeader)) {
                return true;
            }
        }
        return false;
    }

    @java.lang.Deprecated
    public androidx.car.app.model.ActionStrip getActionStrip() {
        return this.mActionStrip;
    }

    public java.util.List getActions() {
        return this.mActions;
    }

    public androidx.car.app.model.Header getHeader() {
        androidx.car.app.model.Header header = this.mHeader;
        if (header != null) {
            return header;
        }
        if (this.mTitle == null && this.mHeaderAction == null && this.mActionStrip == null) {
            return null;
        }
        defpackage.xc xcVar = new defpackage.xc();
        androidx.car.app.model.CarText carText = this.mTitle;
        if (carText != null) {
            xcVar.d(carText);
        }
        androidx.car.app.model.Action action = this.mHeaderAction;
        if (action != null) {
            xcVar.c(action);
        }
        androidx.car.app.model.ActionStrip actionStrip = this.mActionStrip;
        if (actionStrip != null) {
            java.util.Iterator it = actionStrip.getActions().iterator();
            while (it.hasNext()) {
                xcVar.b((androidx.car.app.model.Action) it.next());
            }
        }
        return xcVar.a();
    }

    @java.lang.Deprecated
    public androidx.car.app.model.Action getHeaderAction() {
        return this.mHeaderAction;
    }

    public java.util.List getSectionedLists() {
        return defpackage.rv.c(this.mSectionedLists);
    }

    public androidx.car.app.model.ItemList getSingleList() {
        return this.mSingleList;
    }

    @java.lang.Deprecated
    public androidx.car.app.model.CarText getTitle() {
        return this.mTitle;
    }

    public int hashCode() {
        return j$.util.Objects.hash(new java.lang.Object[]{java.lang.Boolean.valueOf(this.mIsLoading), this.mTitle, this.mHeaderAction, this.mSingleList, this.mSectionedLists, this.mActionStrip, this.mHeader});
    }

    public boolean isLoading() {
        return this.mIsLoading;
    }

    public defpackage.xl toBuilder() {
        return new defpackage.xl(this);
    }

    public java.lang.String toString() {
        return "ListTemplate";
    }

    private ListTemplate() {
        this.mIsLoading = false;
        this.mTitle = null;
        this.mHeaderAction = null;
        this.mSingleList = null;
        this.mSectionedLists = java.util.Collections.EMPTY_LIST;
        this.mActionStrip = null;
        this.mActions = java.util.Collections.EMPTY_LIST;
        this.mHeader = null;
    }
}
