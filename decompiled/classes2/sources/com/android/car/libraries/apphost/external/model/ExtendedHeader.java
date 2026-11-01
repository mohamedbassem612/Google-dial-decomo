package com.android.car.libraries.apphost.external.model;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
@defpackage.ug
public final class ExtendedHeader {
    private java.util.List endHeaderActions;
    private java.util.List startHeaderActions;
    private androidx.car.app.model.CarText title;

    private ExtendedHeader(defpackage.hgu hguVar) {
        this();
        throw null;
    }

    public boolean equals(java.lang.Object obj) {
        if (obj instanceof com.android.car.libraries.apphost.external.model.ExtendedHeader) {
            com.android.car.libraries.apphost.external.model.ExtendedHeader extendedHeader = (com.android.car.libraries.apphost.external.model.ExtendedHeader) obj;
            if (aooh.n(getEndHeaderActions(), extendedHeader.getEndHeaderActions()) && aooh.n(getStartHeaderActions(), extendedHeader.getStartHeaderActions()) && aooh.n(this.title, extendedHeader.title)) {
                return true;
            }
        }
        return false;
    }

    public final java.util.List getEndHeaderActions() {
        java.util.List list = this.endHeaderActions;
        if (list != null) {
            return list;
        }
        aooh.j("endHeaderActions");
        return null;
    }

    public final java.util.List getStartHeaderActions() {
        java.util.List list = this.startHeaderActions;
        if (list != null) {
            return list;
        }
        aooh.j("startHeaderActions");
        return null;
    }

    public final androidx.car.app.model.CarText getTitle() {
        return this.title;
    }

    public int hashCode() {
        return j$.util.Objects.hash(new java.lang.Object[]{this.title, getEndHeaderActions(), getStartHeaderActions()});
    }

    public java.lang.String toString() {
        return "ExtendedHeader(title: " + this.title + ", [" + getStartHeaderActions().size() + " startHeaderActions], [" + getEndHeaderActions().size() + " endHeaderActions])";
    }

    public /* synthetic */ ExtendedHeader(defpackage.hgu hguVar, aooc aoocVar) {
        this(hguVar);
    }

    private ExtendedHeader() {
    }
}
