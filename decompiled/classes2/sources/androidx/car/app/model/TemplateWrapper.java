package androidx.car.app.model;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
@defpackage.ug
public final class TemplateWrapper {
    private int mCurrentTaskStep;
    private java.lang.String mId;
    private boolean mIsRefresh;
    private defpackage.ze mTemplate;
    private java.util.List mTemplateInfoForScreenStack;

    private TemplateWrapper() {
        this.mTemplateInfoForScreenStack = new java.util.ArrayList();
        this.mTemplate = null;
        this.mId = "";
    }

    public static androidx.car.app.model.TemplateWrapper copyOf(androidx.car.app.model.TemplateWrapper templateWrapper) {
        androidx.car.app.model.TemplateWrapper templateWrapperWrap = wrap(templateWrapper.getTemplate(), templateWrapper.getId());
        templateWrapperWrap.setRefresh(templateWrapper.isRefresh());
        templateWrapperWrap.setCurrentTaskStep(templateWrapper.getCurrentTaskStep());
        java.util.List templateInfosForScreenStack = templateWrapper.getTemplateInfosForScreenStack();
        if (templateInfosForScreenStack != null) {
            templateWrapperWrap.setTemplateInfosForScreenStack(templateInfosForScreenStack);
        }
        return templateWrapperWrap;
    }

    private static java.lang.String createRandomId() {
        return java.util.UUID.randomUUID().toString();
    }

    public static androidx.car.app.model.TemplateWrapper wrap(defpackage.ze zeVar, java.lang.String str) {
        return new androidx.car.app.model.TemplateWrapper((defpackage.ze) j$.util.Objects.requireNonNull(zeVar), (java.lang.String) j$.util.Objects.requireNonNull(str));
    }

    public int getCurrentTaskStep() {
        return this.mCurrentTaskStep;
    }

    public java.lang.String getId() {
        return (java.lang.String) j$.util.Objects.requireNonNull(this.mId);
    }

    public defpackage.ze getTemplate() {
        return (defpackage.ze) j$.util.Objects.requireNonNull(this.mTemplate);
    }

    public java.util.List getTemplateInfosForScreenStack() {
        return defpackage.rv.c(this.mTemplateInfoForScreenStack);
    }

    public boolean isRefresh() {
        return this.mIsRefresh;
    }

    public void setCurrentTaskStep(int i) {
        this.mCurrentTaskStep = i;
    }

    public void setId(java.lang.String str) {
        this.mId = str;
    }

    public void setRefresh(boolean z) {
        this.mIsRefresh = z;
    }

    public void setTemplate(defpackage.ze zeVar) {
        this.mTemplate = zeVar;
    }

    public void setTemplateInfosForScreenStack(java.util.List list) {
        this.mTemplateInfoForScreenStack = list;
    }

    public java.lang.String toString() {
        return "[template: " + this.mTemplate + ", ID: " + this.mId + ']';
    }

    private TemplateWrapper(defpackage.ze zeVar, java.lang.String str) {
        this.mTemplateInfoForScreenStack = new java.util.ArrayList();
        this.mTemplate = zeVar;
        this.mId = str;
    }

    public static androidx.car.app.model.TemplateWrapper wrap(defpackage.ze zeVar) {
        return wrap(zeVar, createRandomId());
    }
}
