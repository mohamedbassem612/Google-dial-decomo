package com.android.car.libraries.apphost.external.model;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: /workspace/Google-dial-decomo/dex-input/classes2.dex */
@defpackage.ug
public class GoogleTabContents {
    public static final java.lang.String CONTENT_ID = "TAB_CONTENTS_CONTENT_ID";
    private final defpackage.ze mTemplate;

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, ze] */
    public GoogleTabContents(defpackage.hgw hgwVar) {
        this.mTemplate = hgwVar.a;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof com.android.car.libraries.apphost.external.model.GoogleTabContents) {
            return j$.util.Objects.equals(this.mTemplate, ((com.android.car.libraries.apphost.external.model.GoogleTabContents) obj).mTemplate);
        }
        return false;
    }

    public java.lang.String getContentId() {
        return "TAB_CONTENTS_CONTENT_ID";
    }

    public defpackage.ze getTemplate() {
        return (defpackage.ze) j$.util.Objects.requireNonNull(this.mTemplate);
    }

    public int hashCode() {
        return j$.util.Objects.hash(new java.lang.Object[]{this.mTemplate});
    }

    public java.lang.String toString() {
        return "[template: " + java.lang.String.valueOf(this.mTemplate) + ']';
    }

    private GoogleTabContents() {
        this.mTemplate = null;
    }
}
