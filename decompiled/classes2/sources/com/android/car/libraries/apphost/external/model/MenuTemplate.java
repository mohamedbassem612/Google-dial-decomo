package com.android.car.libraries.apphost.external.model;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
@defpackage.ug
public final class MenuTemplate implements defpackage.ze {
    private java.util.List actions;
    private boolean allowAlphabeticalIndexing;
    private androidx.car.app.model.Header header;
    private boolean isLoading;
    private int scrollStatePersistenceStrategy;
    private java.util.List sections;

    private MenuTemplate(defpackage.hhi hhiVar) {
        this();
        this.sections = hhiVar.a;
        this.actions = hhiVar.b;
        this.header = hhiVar.c;
        this.isLoading = hhiVar.d;
        this.allowAlphabeticalIndexing = hhiVar.e;
        this.scrollStatePersistenceStrategy = hhiVar.f;
    }

    public boolean equals(java.lang.Object obj) {
        if (obj instanceof com.android.car.libraries.apphost.external.model.MenuTemplate) {
            com.android.car.libraries.apphost.external.model.MenuTemplate menuTemplate = (com.android.car.libraries.apphost.external.model.MenuTemplate) obj;
            if (aooh.n(this.sections, menuTemplate.sections) && aooh.n(this.actions, menuTemplate.actions) && aooh.n(this.header, menuTemplate.header) && this.isLoading == menuTemplate.isLoading && this.allowAlphabeticalIndexing == menuTemplate.allowAlphabeticalIndexing && this.scrollStatePersistenceStrategy == menuTemplate.scrollStatePersistenceStrategy) {
                return true;
            }
        }
        return false;
    }

    public final java.util.List getActions() {
        return this.actions;
    }

    public final boolean getAllowAlphabeticalIndexing() {
        return this.allowAlphabeticalIndexing;
    }

    public final androidx.car.app.model.Header getHeader() {
        return this.header;
    }

    public final int getScrollStatePersistenceStrategy() {
        return this.scrollStatePersistenceStrategy;
    }

    public final java.util.List getSections() {
        return this.sections;
    }

    public int hashCode() {
        return j$.util.Objects.hash(new java.lang.Object[]{this.sections, this.actions, this.header, java.lang.Boolean.valueOf(this.isLoading), java.lang.Integer.valueOf(this.scrollStatePersistenceStrategy)});
    }

    public final boolean isLoading() {
        return this.isLoading;
    }

    public final defpackage.hhi toBuilder() {
        defpackage.hhi hhiVar = new defpackage.hhi();
        java.util.List list = this.sections;
        aooh.f(list, "sections");
        hhiVar.a = list;
        java.util.List list2 = this.actions;
        aooh.f(list2, "actions");
        hhiVar.b = list2;
        hhiVar.c = this.header;
        hhiVar.d = this.isLoading;
        hhiVar.e = this.allowAlphabeticalIndexing;
        hhiVar.f = this.scrollStatePersistenceStrategy;
        return hhiVar;
    }

    public /* synthetic */ MenuTemplate(defpackage.hhi hhiVar, aooc aoocVar) {
        this(hhiVar);
    }

    private MenuTemplate() {
        aokc aokcVar = aokc.a;
        this.sections = aokcVar;
        this.actions = aokcVar;
    }
}
